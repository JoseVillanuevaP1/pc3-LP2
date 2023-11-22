
<%@page import="java.util.List"%>
<%@page import="tienda.modelo.bean.Articulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <style>
        body {
            background-image: url('/apptienda-1.0-SNAPSHOT/img/fondo.jpg');
            background-size: cover;
            background-position: center;
            height: 100vh; /* Esto asegura que la imagen ocupe toda la altura de la ventana */
            margin: 0; /* Esto elimina el margen predeterminado del cuerpo */
            padding: 0; /* Esto elimina el relleno predeterminado del cuerpo */
        }
        
        .custom-card {
                background-color: rgba(0, 0, 0, 0); /* Fondo completamente transparente */
                border-radius: 10px;
                color: #ffffff; /* Texto blanco */
                box-shadow: 0 4px 8px rgba(255, 255, 255, 0.08);
        }
        
    </style>


    <%
        List<Articulo> articulos = (List<Articulo>) request.getAttribute("articulos");
    %>

    <body>
        <div class="container mt-4">
            <div class="card mb-3 custom-card">
                <div class="card-body">
                    <h2 class="text-white text-center my-3">Listado de articulos por Categoria:</h2>
                    <% if (articulos != null && !articulos.isEmpty()) { %>
                    <table class="table table-dark">
                        <thead>
                            <tr>
                                <th scope="col">id</th>
                                <th scope="col">nombre</th>
                                <th scope="col">descripcion</th>
                                <th scope="col">precio</th>
                                <th scope="col">foto</th>
                                <th scope="col">categoria</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%for (Articulo a : articulos) {%>
                            <tr>
                                <td><%=a.getIdArticulo()%></td>
                                <td><%=a.getNombre()%></td>
                                <td><%=a.getDescripcion()%></td>
                                <td><%=a.getPrecio()%></td>
                                <td>
                                    <img src="/apptienda-1.0-SNAPSHOT/img/<%=a.getFoto()%>" height="35" width="35">
                                </td>
                                <td><%=a.getCategoria()%></td>
                            </tr>
                            <%}%>
                            </tr>
                        </tbody>                    
                    </table>
                    <%} else {%>
                    <h3 class="text-center">No hay registros para mostrar, verifique e intente nuevamente.</h1>
                    <%}%>
                </div>
            </div>
        </div>

    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</html>
