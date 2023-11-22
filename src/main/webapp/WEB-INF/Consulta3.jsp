
<%@page import="tienda.modelo.bean.PedidoDetalle"%>
<%@page import="java.util.List"%>
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
    <body>

        <%
            List<PedidoDetalle> pedidos = (List<PedidoDetalle>) request.getAttribute("pedidos");
        %>

        <div class="container mt-4">
            <div class="card mb-3 custom-card">
                <div class="card-body">
                    <h2 class="text-white text-center my-3">Listado de Pedidos por Fechas:</h2>
                    <% if (pedidos != null && !pedidos.isEmpty()) { %>
                    <table class="table table-dark">
                        <thead>
                            <tr>
                                <th scope="col">idPedidoDetalle</th>
                                <th scope="col">idPedido</th>
                                <th scope="col">idArticulo</th>
                                <th scope="col">precio</th>
                                <th scope="col">cantidad</th>
                                <th scope="col">subtotal</th>
                                <th scope="col">fecha</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%for (PedidoDetalle a : pedidos) {%>
                            <tr>
                                <td><%=a.getIdPedidoDetalle()%></td>
                                <td><%=a.getIdPedido()%></td>
                                <td><%=a.getIdArticulo()%></td>
                                <td><%=a.getPrecio()%></td>
                                <td><%=a.getCantidad()%></td>
                                <td><%=a.getSubTotal()%></td>
                                <td><%=a.getFecha()%></td>
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
