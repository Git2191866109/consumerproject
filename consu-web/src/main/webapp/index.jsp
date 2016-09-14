<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
</head>
<body>
<form action="${base}/login" method="post">
    <div class="loginbody">
        <span class="systemlogo"></span>
        <div class="loginbox">
            <ul>
                <li>
                    <label>
                        name:&nbsp;
                    </label>
                    <label>
                        <select id="sel">
                            <option value="1" selected="selected">请选择</option>
                            <c:forEach items="${userList}" var="user">
                                <option value="2">2</option>
                            </c:forEach>
                        </select>
                    </label>
                </li>
                <li>
                    <label>
                        cost_morning:&nbsp;
                    </label>
                    <label>
                        <input type="text" name="cost_morning" id="cost_morning"/>
                    </label>
                </li>
                <li>
                    <label>
                        cost_noon:&nbsp;
                    </label>
                    <label>
                        <input type="text" name="cost_noon" id="cost_noon"/>
                    </label>
                </li>
                <li>
                    <label>
                        cost_afternoon:&nbsp;
                    </label>
                    <label>
                        <input type="text" name="cost_afternoon" id="cost_afternoon"/>
                    </label>
                </li>
                <li>
                    <label>
                        do somesing :&nbsp;
                    </label>
                    <select id="dictionary">
                        <option value="1" selected="selected">请选择</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                    </select>
                </li>
                <li>
                    <label>
                        <input type="submit" class="" value="save"/>
                    </label>
                </li>
            </ul>
        </div>
    </div>
</form>
</body>
</html>