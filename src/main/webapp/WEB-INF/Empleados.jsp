<%-- 
    Document   : Empleados
    Created on : 7 nov 2023, 10:05:56
    Author     : Dell
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="tienda.modelo.bean.Empleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleados</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>

    <%

        ArrayList<Empleado> empleados = (ArrayList<Empleado>) request.getSession().getAttribute("empleados");

    %>

    <body>
        <h1 style="margin: 1%">Empleados:</h1>
        <br><!-- comment -->
        <table class="table table-hover" style="margin: 1%">
            <thead>
                <tr>
                    <th scope="col">id</th>
                    <th scope="col">Nombre</th>
                    <th scope="col">A. Paterno</th>
                    <th scope="col">A. Materno</th>
                    <th scope="col">Cargo</th>
                </tr>
            </thead>
            <tbody>
                <%for (Empleado e : empleados) {%>
                <tr>
                    <th scope="row"><%=e.getIdimp()%></th>
                    <td><%=e.getNombre()%></td>
                    <td><%=e.getApp()%></td>
                    <td><%=e.getApm()%></td>
                    <td><%=e.getCargo()%></td>
                </tr>
                <%}%>
            </tbody>
        </table>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</html>
