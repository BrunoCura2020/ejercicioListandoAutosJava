<%-- 
    Document   : FormularioJSP
    Created on : 18/07/2022, 15:52:19
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario del auto</title>
    </head>
    <body>
        <h1>Datos del auto</h1>
        <form action="SvAuto" method="POST">
            <p>
                <label>N° patente: </label>
                <input type="text" name="patente">
            </p>
            
            <p>
                <label>Marca: </label>
                <input type="text" name="marca">
            </p>
            
            <p>
                <label>Modelo: </label>
                <input type="text" name="modelo">
            </p>
            
            <p>
                <label>Color: </label>
                <input type="text" name="color">
            </p>
            
             <p>
                <label>Tipo de motor: </label>
                <input type="text" name="tipo_motor">
            </p>
            
            <button type="submit">Enviar</button>
        </form>
        
        <h1>Ver lista de autos</h1>
        <p>Si desea ver todos los autos haga click en el boton mostrar autos</p>
        <form action="SvAuto" method="GET">
            <button type="submit">Mostrar autos</button>
        </form>
    </body>
</html>
