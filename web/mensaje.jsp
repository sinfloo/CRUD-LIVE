
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container mt-4">
            <div class="${config}" role="alert">
                ${mensaje}!
            </div>
            <a href="Controlador?accion=listar">Volver</a>
        </div>
    </body>
</html>
