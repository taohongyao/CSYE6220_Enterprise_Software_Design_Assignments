<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
    <title>Tag Example</title>
</head>
<body>

<h1>Part 3 jstl tag</h1>
<h2><c:out value="${'Core Tag Lib'}"/></h2>

<h4>Core Tag Lib c:import> Tag</h4>
<c:import var="data" url="http://www.baidu.com"/>
<c:out value="${data}"/>

<h4>Core Tag Lib c:set> Tag</h4>
<c:set var="income" scope="session" value="${4000*4}"/>
<p>Before Remove Value is: <c:out value="${income}"/></p>
<h4>Core Tag Lib c:remove> Tag</h4>
<c:remove var="income"/>
<p>After Remove Value is: <c:out value="${income}"/></p>

<c:set var="gpa" value="${90/100*5.0}"/>
<h4>Core Tag Lib c :if> Tag</h4>
<c:if test="${gpa>4.0}">
    <p>Your GPA <c:out value="${gpa}"/> is great than 4.0</p>
</c:if>

<h2><c:out value="${'Function Tags Lib'}"/></h2>

<h4>Function Tags Lib fn :toLowerCase> Tag</h4>
<c:set var="string" value="Welcome to JSP Programming"/>
${fn:toLowerCase("HELLO,")}
${fn:toLowerCase(string)}

<h4>Function Tags Lib fn :startsWith> Tag</h4>
<c:choose>
    <c:when test="${fn:startsWith(string, 'Welcome')}">
        <p><c:out value="${string}"/> start with Welcome </p>
    </c:when>

</c:choose>

<c:if test="${!fn:startsWith(string, 'Programming')}">
    <p><c:out value="${string}"/> don't start with Programming </p>
</c:if>

</br>
<c:set var="site" value="first javatpoint.com"/>
<c:set var="author" value="Declan Tea"/>
<h4>Function Tags Lib fn :indexOf> Tag</h4>
Hi, This is ${fn:toUpperCase(site)} developed by ${fn:toUpperCase(author)}.
<p>Index of first : ${fn:indexOf(site, "first")}</p>
<p>Index of Declan : ${fn:indexOf(author, "Declan")}</p>
<p>Index of declan : ${fn:indexOf(author, "declan")}</p>

<h4>JSTL fn :split()> Function</h4>

<c:set var="str1" value="abc-ccc-ddd"/>
<p>str1 is ${str1}</p>
<c:set var="str2" value="${fn:split(str1,'-')}"/>
<p>str2[0] is ${str2[0]} </p>
<p>Result of split str1 is <c:out value="${str2}"/></p>
<%--<p>Result of split str1 is <c:out value="${fn:split(str1, '-')}"/> </p>--%>

<h2><c:out value="${'JSTL Formatting Tags'}"/></h2>

<h4>JSTL Formatting fmt :parseNumber>Tag</h4>
<c:set var="amount" value="50"/>

<fmt:parseNumber var="j" type="number" value="${amount}"/>
<p><i>Amount is:</i> <c:out value="${j}"/></p>

<h4>JSTL Formatting fmt :formatDate> Tag</h4>

<c:set var="mydata" value="<%=new java.util.Date()%>"/>
<p>
    Time:
    <fmt:formatDate type="time" value="${mydata}"/>
</p>
<p>
    Formatted Date :
    <fmt:formatDate type="date" value="${mydata}"/>
</p>
<p>
    Formatted Date and Time :
    <fmt:formatDate type="both" value="${mydata}"/>
</p>
<p>
    Formatted Date and Time in short style :
    <fmt:formatDate type="both" dateStyle="short" timeStyle="short"
                    value="${mydata}"/>
</p>
<p>
    Formatted Date and Time in medium style :
    <fmt:formatDate type="both" dateStyle="medium" timeStyle="medium"
                    value="${mydata}"/>
</p>
<p>
    Formatted Date and Time in long style :
    <fmt:formatDate type="both" dateStyle="long" timeStyle="long"
                    value="${mydata}"/>
</p>

<h4>JSTL Formatting fmt :bundle> Tag</h4>

<fmt:bundle basename="com.example.webapp.bundle.ColorList" prefix="color.">
    <fmt:message key="Violet"/><br/>
    <fmt:message key="Indigo"/><br/>
    <fmt:message key="Blue"/><br/>
</fmt:bundle>

<h4>JSTL Formatting fmt :setBundle> Tag</h4>
<fmt:setBundle basename="com.example.webapp.bundle.ColorList" var="lang"/>

<fmt:message key="color.Violet" bundle="${lang}"/><br/>
<fmt:message key="color.Indigo" bundle="${lang}"/><br/>
<fmt:message key="color.Blue" bundle="${lang}"/><br/>

<h2><c:out value="${'JSTL XML Tag Lib'}"/></h2>
<h4> JSTL XML x:out Tag</h4>
<c:set var="vegetable">
    <vegetables>
        <vegetable>
            <name>onion</name>
            <price>40</price>
        </vegetable>
        <vegetable>
            <name>Potato</name>
            <price>30</price>
        </vegetable>
        <vegetable>
            <name>Tomato</name>
            <price>90</price>
        </vegetable>
    </vegetables>
</c:set>
<h4> JSTL XML x:parse Tag</h4>
<x:parse xml="${vegetable}" var="output"/>
<b>Name of the vegetable is</b>:
<x:out select="$output/vegetables/vegetable[1]/name" /><br>
<b>Price of the Potato is</b>:
<x:out select="$output/vegetables/vegetable[2]/price" />

<h4> JSTL XML x:if Tag</h4>

<x:if select="$output/vegetables/vegetable/price < 100">
    Vegetables prices are very low.
</x:if>

<h4> JSTL XML x:set Tag</h4>

<x:set var="price" select="$output/vegetables/vegetable[2]/price"/>
<b>The price of <x:out select="$output/vegetables/vegetable[2]/name" /></b>:
<x:out select="$price" />







<h2><c:out value="${'JSTL SQL Tag Lib'}"/></h2>

<%--<h4>JSTL SQL  sql:setDataSource Tag</h4>--%>

<%--<sql:setDataSource var="db" driver="org.postgresql.Driver"--%>
<%--                   url="jdbc:postgresql://192.168.1.201:5432/csye6225_db"--%>
<%--                   user="declan"  password="123456cs"/>--%>

<%--<h4>JSTL SQL  sql:query Tag</h4>--%>

<%--<sql:query dataSource="${db}" var="rs">--%>
<%--    SELECT * from user_info;--%>
<%--</sql:query>--%>

<%--<table border="2" width="100%">--%>
<%--    <tr>--%>
<%--        <th>uuid</th>--%>
<%--        <th>first_name</th>--%>
<%--        <th>last_name</th>--%>
<%--        <th>password_bcrypt</th>--%>
<%--        <th>username</th>--%>
<%--        <th>account_created</th>--%>
<%--        <th>account_updated</th>--%>
<%--    </tr>--%>
<%--    <c:forEach var="table" items="${rs.rows}">--%>
<%--        <tr>--%>
<%--            <td><c:out value="${table.uuid}"/></td>--%>
<%--            <td><c:out value="${table.first_name}"/></td>--%>
<%--            <td><c:out value="${table.last_name}"/></td>--%>
<%--            <td><c:out value="${table.password_bcrypt}"/></td>--%>
<%--            <td><c:out value="${table.username}"/></td>--%>
<%--            <td><c:out value="${table.account_created}"/></td>--%>
<%--            <td><c:out value="${table.account_updated}"/></td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>

<%--<h4>JSTL SQL  sql:param Tag</h4>--%>
<%--<c:set var="uuid" value="4028811877a892d00177a89331690000"/>--%>
<%--<sql:update dataSource="${db}" var="count">--%>
<%--    DELETE FROM user_info WHERE uuid = ?--%>
<%--    <sql:param value="${uuid}" />--%>
<%--</sql:update>--%>


</body>
</html>