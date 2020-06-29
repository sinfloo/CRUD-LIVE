<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    </head>
    <body>        
        <div class="container mt-4">
            <h3>PROYECTO CRUD - 2020</h3>
            <div class="d-flex">
                <a class="btn btn-outline-primary" href="Controlador?accion=listar">Listar</a>
                <a class="btn btn-outline-primary ml-2" href="Controlador?accion=nuevo">Agregar Nuevo</a>
            </div>
            <hr>
            <table class="table">
                <tr>
                    <th>ID</th>
                    <th>NOMBRES</th>
                    <th>APELLIDOS</th>
                    <th>CORREO</th>
                    <th>ACCIONES</th>
                </tr>
                 <c:forEach var="persona" items="${Personas}"> 
                <tr>
                                        
                        <td>${persona.id}</td>
                        <td>${persona.nombres}</td>
                        <td>${persona.apellidos}</td>
                        <td>${persona.correo}</td>
                        <td>
                            <a href="Controlador?accion=Editar&id=${persona.id}" class="btn btn-outline-warning">Editar</a>
                            <a href="Controlador?accion=Delete&id=${persona.id}" class="btn btn-outline-danger">Delete</a>
                        </td>
                   
                </tr>
                 </c:forEach>
            </table>
        </div>
    </body>
</html>
