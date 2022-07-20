<%-- 
    Document   : MostrarJSP
    Created on : 19/07/2022, 23:20:37
    Author     : Usuario
--%>

<%@page import="logica.Auto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Autos</title>
    </head>
    <body>
        <h1>Lista de autos</h1>
        <%
            List<Auto> listaAutos = (List) request.getSession().getAttribute("listaAutos");
            int cont = 1;
            for(Auto aut : listaAutos) {%>
            <p><b>Auto n°    :  <%=cont%></b></p>
            <p><b>Patente    :  <%=aut.getPatente()%></b></p>
            <p><b>Marca      :  <%=aut.getMarca()%></b></p>
            <p><b>Modelo     :  <%=aut.getModelo()%></b></p>
            <p><b>Color      :  <%=aut.getColor()%></b></p>
            <p><b>tipo_motor :  <%=aut.getTipo_motor()%></b></p>
            <p>--------------------------------------------------</p>
         <% cont= cont+1;%> 
       <%}%> 
    </body>
</html>
