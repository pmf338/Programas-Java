/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Logica.Libreta;
import Persistencia.exceptions.NonexistentEntityException;
import Persistencia.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author pmf44
 */
public class LibretaJpaController implements Serializable {

    public LibretaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    LibretaJpaController() {
        emf = Persistence.createEntityManagerFactory("RelacionesJPAPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Libreta libreta) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(libreta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findLibreta(libreta.getId_libreta()) != null) {
                throw new PreexistingEntityException("Libreta " + libreta + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Libreta libreta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            libreta = em.merge(libreta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = libreta.getId_libreta();
                if (findLibreta(id) == null) {
                    throw new NonexistentEntityException("The libreta with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Libreta libreta;
            try {
                libreta = em.getReference(Libreta.class, id);
                libreta.getId_libreta();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The libreta with id " + id + " no longer exists.", enfe);
            }
            em.remove(libreta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Libreta> findLibretaEntities() {
        return findLibretaEntities(true, -1, -1);
    }

    public List<Libreta> findLibretaEntities(int maxResults, int firstResult) {
        return findLibretaEntities(false, maxResults, firstResult);
    }

    private List<Libreta> findLibretaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Libreta.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Libreta findLibreta(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Libreta.class, id);
        } finally {
            em.close();
        }
    }

    public int getLibretaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Libreta> rt = cq.from(Libreta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
