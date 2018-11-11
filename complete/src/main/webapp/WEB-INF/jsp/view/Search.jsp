<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

    <head>
        <title>Pick your poison</title>
    </head>
    <body>
        <div class="info">
            <h1>PICK YOUR POISON!</h1>
            <p>write in the drink or location you want to find down below and we will get you to your poison &#128521</p>
        </div>
        <div>
            <div>
                <sf:form method="POST" modelAttribute="" action="/search" class="search__form">
                    <div>
                        <label for="search__input">search: </label>
                        <%--the `path` attribute matches the `name` attribute of the Entity that was passed in the model--%>
                        <div><sf:input id="search__input" path="search" type="text" placeholder="Enter drink or location"/></div>
                    </div>

                    <div> <input type="submit" VALUE="I HAVE PICKED MY POISON!"/> </div>
                </sf:form>
            </div>
        </div>
    <div>
        <c:choose>
            <%--If the model has an attribute with the name `postitNotes`--%>
            <c:when test="${not empty whiskey}">
                <%--Create a table for the Postit Notes--%>
                <table class="drinks">

                        <%--For each postit note, that is in the list that was passed in the model--%>
                        <%--generate a row in the table--%>
                        <%--Here we set `postit` as a singular item out of the list `postitNotes`--%>
                    <c:forEach var="whiskey" items="${whiskey}">
                        <tr>
                                <%--We can reference attributes of the Entity by just entering the name we gave--%>
                                <%--it in the singular item var, and then just a dot followed by the attribute name--%>

                                <%--Create a link based on the name attribute value--%>
                            <td><a href="/drink/${whiskey.name}">${whiskey.name}</a></td>
                                <%--The String in the note attribute--%>
                        </tr>
                    </c:forEach>
                </table>
            </c:when>

            <%--If all tests are false, then do this--%>
            <c:otherwise>
                <h3>No drink chosen</h3>
            </c:otherwise>
        </c:choose>
    </div>


    </body>

</html>