<%-- 
    Document   : Consultas
    Created on : 20 nov. 2023, 22:43:50
    Author     : jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
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

            .custom-input {
                background-color: transparent; /* Fondo transparente */
                border: 1px solid #343a40; /* Borde oscuro similar a Bootstrap */
                border-radius: 5px;
                color: #ffffff; /* Texto blanco */
                padding: 0.375rem 0.75rem; /* Alineación interna similar a Bootstrap */
                transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
            }

            .custom-input::placeholder {
                color: #ffffff; /* Texto del placeholder blanco */
            }

            .custom-input:focus {
                border-color: #007bff; /* Color del borde al enfocar similar a Bootstrap */
                box-shadow: 0 0 0 0.25rem rgba(0, 123, 255, 0.25); /* Sombra al enfocar similar a Bootstrap */
            }

        </style>
    </head>
    <body>

        <div class="container text-center my-2">
            <h1 class="py-2 text-white">Consultas:</h1>
            <div class="row row-cols-sm-2 row-cols-md-4 g-4">
                <div class="col">
                    <div class="card mb-3 h-100 custom-card">
                        <div class="card-body d-flex flex-column">
                            <p class="card-text">Cree una consulta para listar los artículos por categoría, se debe ingresa como dato el
                                nombre de la categoría.</p>
                            <div class="mt-auto">
                                <form action="consulta1">
                                    <div class="mb-3">
                                        <input type="text" class="custom-input w-100" name="categoria" placeholder="Categoria">
                                    </div>
                                    <div class="d-grid gap-2">
                                        <button type="submit" class="btn btn-primary">Consultar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card mb-3 h-100 custom-card">
                        <div class="card-body d-flex flex-column">
                            <p class="card-text">Cree una consulta para listar los pedidos por empleado, se debe ingresa como dato el
                                nombre del empleado para listar los pedidos atendidos por dicho empleado.</p>

                            <div class="mt-auto">                            
                                <form action="consulta2">
                                    <div class="mb-3">
                                        <input type="text" class="custom-input w-100" name="empleado" placeholder="Empleado">
                                    </div>
                                    <div class="d-grid gap-2">
                                        <button type="submit" class="btn btn-primary">Consultar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card mb-3 h-100 custom-card">
                        <div class="card-body d-flex flex-column">
                            <p class="card-text">Cree una consulta para listar los pedidos por un intervalo de fechas, es decir se ingresa
                                una fecha inicial y una fecha final, los pedidos a listar solamente estarán entre estas dos
                                fechas.</p>
                            <div class="mt-auto">
                                <form action="consulta3">
                                    <div class="mb-3">
                                        <input type="date" class="custom-input w-100" name="fecha_inicial" placeholder="Fecha Inicial">
                                    </div>
                                    <div class="mb-3">
                                        <input type="date" class="custom-input w-100" name="fecha_final" placeholder="Fecha Final">
                                    </div>
                                    <div class="d-grid gap-2">
                                        <button type="submit" class="btn btn-primary">Consultar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card  mb-3 h-100 custom-card">
                        <div class="card-body d-flex flex-column">
                            <p class="card-text">Listar los artículos (campos a visualizar idarticulo, nombre, descripción y precio) que han
                                sido pedidos y atendidos por un determinado empleado, el nombre del empleado se
                                debe ingresar como dato.</p>
                            <div class="mt-auto">
                                <form action="consulta4">
                                    <div class="mb-3">
                                        <input type="text" class="custom-input w-100" name="empleado" placeholder="Empleado">
                                    </div>
                                    <div class="d-grid gap-2">
                                        <button type="submit" class="btn btn-primary">Consultar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card  mb-3 h-100 custom-card">
                        <div class="card-body d-flex flex-column">
                            <p class="card-text">Listar articulo con el mayor precio</p>
                            <div class="mt-auto">
                                <form action="consulta5">
                                    <div class="d-grid gap-2">
                                        <button type="submit" class="btn btn-primary">Consultar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card  mb-3 h-100 custom-card">
                        <div class="card-body d-flex flex-column">
                            <p class="card-text">Buscar un artículo por su nombre</p>
                            <div class="mt-auto">
                                <form>
                                    <div class="mb-3">
                                        <input type="text" class="custom-input w-100" name="nombre" placeholder="Nombre">
                                    </div>
                                    <div class="d-grid gap-2">
                                        <button type="submit" class="btn btn-primary">Consultar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card  mb-3 h-100 custom-card">
                        <div class="card-body d-flex flex-column">
                            <p class="card-text">Listar los países donde no resida ningún cliente</p>
                            <div class="mt-auto">
                                <form>
                                    <div class="d-grid gap-2">
                                        <button type="submit" class="btn btn-primary">Consultar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card  mb-3 h-100 custom-card">
                        <div class="card-body d-flex flex-column">
                            <p class="card-text">Listar el país, fecha de pedido, monto total de pedido y nombre del cliente. </p>
                            <div class="mt-auto">
                                <form>
                                    <div class="d-grid gap-2">
                                        <button type="submit" class="btn btn-primary">Consultar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card  mb-3 h-100 custom-card">
                        <div class="card-body d-flex flex-column">
                            <p class="card-text">Listar los artículos que no han sido pedidos</p>
                            <div class="mt-auto">
                                <form>
                                    <div class="d-grid gap-2">
                                        <button type="submit" class="btn btn-primary">Consultar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card  mb-3 h-100 custom-card">
                        <div class="card-body d-flex flex-column">
                            <p class="card-text">Listar los clientes de la base de datos que no han realizado ningún pedido</p>
                            <div class="mt-auto">
                                <form>
                                    <div class="d-grid gap-2">
                                        <button type="submit" class="btn btn-primary">Consultar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card  mb-3 h-100 custom-card">
                        <div class="card-body d-flex flex-column">
                            <p class="card-text">Listar idarticulo, nombre y precio de los artículos que han sido pedidos</p>
                            <div class="mt-auto">
                                <form>
                                    <div class="d-grid gap-2">
                                        <button type="submit" class="btn btn-primary">Consultar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card  mb-3 h-100 custom-card">
                        <div class="card-body d-flex flex-column">
                            <p class="card-text">Listar cuantos artículos no has sido pedidos</p>
                            <div class="mt-auto">
                                <form>
                                    <div class="d-grid gap-2">
                                        <button type="submit" class="btn btn-primary">Consultar</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</html>
