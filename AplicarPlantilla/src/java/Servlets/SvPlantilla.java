package Servlets;

import Logica.Controladora;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SvPlantilla", urlPatterns = {"/SvTest"})
public class SvPlantilla extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //borro el process request y traigo los datos del JSP
        //creo una variable por cada elemento que yo quiera enviar desde el formulario
        String nombre = request.getParameter("nombre"); //nombre del parametro que quiero traer
        String apellido = request.getParameter("apellido");
        String colorCabello = request.getParameter("pelo"); //en el caso de los select me traera la opcion que este seleccionada, por eso siempre tengo quee agregar una opcion vacia por las dudas
        boolean titulo = Boolean.parseBoolean(request.getParameter("titulo")); //en el caso de los input si es un checkbox me trae un String y lo paso a boolean casteandolo, en el caso de 
        String nivelJava = request.getParameter("java");                       //los tipo radio me traera como String la opcion seleccionada
        
        //traigo la sesion y asigno los atributos para abrir cualquier JSP
        request.getSession().setAttribute("nombre",nombre ); //para la sesion actual de la persona que me manda la solicitud asigname el atributo nombre para que la variable nombre que ingresa yo la pueda utilizar en cualquier JSP
        request.getSession().setAttribute("apellido",apellido);
        request.getSession().setAttribute("pelo",colorCabello);
        request.getSession().setAttribute("titulo", titulo);
        request.getSession().setAttribute("java", nivelJava);
        
        //conecto con la logica llamando a la controladora
        Controladora control = new Controladora();
        control.crearAlumno(nombre, apellido, colorCabello, titulo, nivelJava); //le paso los parametros del jsp a la controladora de la logica
        
        
        //armar la respuesta
        response.sendRedirect("pagina2.jsp"); //redirecciono al usuario a mi otro JSP como respuesta
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
