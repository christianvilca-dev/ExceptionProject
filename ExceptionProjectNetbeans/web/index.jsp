<%-- 
    Document   : index
    Created on : 27/09/2018, 08:25:41 PM
    Author     : Christian
--%>

<%@page import="org.exception.clases.Division"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String resultado = "";
    if (request.getParameter("btnGenerar")!=null) {
        String divisor = request.getParameter("txtDivisor");
        String dividendo = request.getParameter("txtDividendo");
        Division division = new Division(dividendo,divisor);
        resultado = division.dividir();
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Excepciones</h1>
        <form action="index.jsp" method="POST">
            <fieldset>
                <legend>Excepciones</legend>
                <table>
                    <tr>
                        <td>Dividendo</td>
                        <td><input type="text" name="txtDividendo"></td>
                    </tr>
                    <tr>
                        <td>Divisor</td>
                        <td><input type="text" name="txtDivisor"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="btnGenerar" value="Dividir"></td>
                        <td><input type="text" name="txtResultado" value="<%=resultado%>" size="100"></td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>
