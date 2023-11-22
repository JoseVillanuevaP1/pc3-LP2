<%-- 
    Document   : principal
    Created on : 8 may. 2023, 21:23:13
    Author     : BLANCO
--%>

<%@page import="tienda.modelo.bean.Empleado"%>
<%@page import="tienda.modelo.bean.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
                overflow: hidden;
                background-color: #333;
            }

            li {
                float: left;
            }

            li a {
                display: block;
                color: white;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }

            li a:hover:not(.active) {
                background-color: #111;
            }

            .active {
                background-color: #04AA6D;

            }

            .us{
                font-style: oblique;

                color: red;
            }

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    </head>
    <body>
        <%
            Usuario us = (Usuario) request.getAttribute("usuario");
            Empleado emp = (Empleado) request.getAttribute("emp");
        %>

        <ul>
            <li><a href="#home">PeruDeportes</a></li>
            <li><a href="#news">News</a></li>
            <li><a href="#contact">Contact</a></li>
            <li><a href="#">Cerrar Sesión</a></li>
        </ul>

<!-- <h2> usuario:<%=us.getUsuario()%> Idempleado:<%=us.getIdemp()%> </h2> -->
        <h3 style="margin-left: 2.7%"> Bienvenido <%=emp.getApm()%> <%=emp.getApp()%> <%=emp.getNombre()%> </h3>
        <br>
        <ul class="menu">
            <li><a href="listarEmpleados">Empleados</a></li>
            <li><a href="listarArticulos">Articulos</a></li>
            <li><a href="consultar">Consultar</a></li>
        </ul>



    </body>
</html>



