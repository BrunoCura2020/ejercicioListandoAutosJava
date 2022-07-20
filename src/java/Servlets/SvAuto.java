
package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Auto;

@WebServlet(name = "SvAuto", urlPatterns = {"/SvAuto"})
public class SvAuto extends HttpServlet {
    List<Auto> listaAutos = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession misession  = request.getSession();
        misession.setAttribute("listaAutos", listaAutos);
        response.sendRedirect("MostrarAutosJSP.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //traigo los datos y le asigno una variable auxiliar
        String patente=request.getParameter("patente");
        String marca=request.getParameter("marca");
        String modelo=request.getParameter("modelo");
        String color=request.getParameter("color");
        String tipo_motor=request.getParameter("tipo_motor");
        
        //Todos los datos que traigo del formulario, serán agregados a la lista
        listaAutos.add(new Auto(patente, marca, modelo, color, tipo_motor));
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
