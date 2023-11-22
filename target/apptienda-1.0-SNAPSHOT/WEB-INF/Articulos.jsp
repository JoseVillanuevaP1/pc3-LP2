<%-- 
    Document   : Empleados
    Created on : 7 nov 2023, 10:05:56
    Author     : Dell
--%>

<%@page import="tienda.modelo.bean.Articulo"%>
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

        ArrayList<Articulo> articulos = (ArrayList<Articulo>) request.getSession().getAttribute("articulos");

    %>

    <body>
        <h1 style="text-align: center; margin-top: 2%">Articulos</h1>
        <br><!-- comment -->
        <div class="container text-center mt-3">
            <div class="row">
                <%for (Articulo e : articulos) {%>
                <div class="col-sm-12 col-md-6 col-lg-3 mb-4">
                    <div class="card" style="width: 20rem;">
                        <img src="img/<%=e.getFoto()%>" class="card-img-top" height="350">
                        <div class="card-body">
                            <h5 class="card-title"><%=e.getNombre()%></h5>  
                            <p class="card-text"><%=e.getDescripcion()%></p>
                            <p class="card-text"><b>S/<%=e.getPrecio()%></b></p>
                            <p class="card-text"><i><%=e.getCategoria()%></i></p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>
                <%}%>
            </div>
        </div>

    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</html>
