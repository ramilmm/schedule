<#-- @ftlvariable name="topGoods" type="java.util.List<com.springapp.mvc.common.GoodInfo>" -->
<#include "../template/template.ftl">
<@mainTemplate title="Авторизация" styles=["css/own/login.css"]/>
<#macro m_body>
<section id="login-banner">
    <h2>Yosemite.</h2>
    <div class="login-form">
        <form name="authForm" id="authForm" action="/j_spring_security_check" method="post">
            <div class="form-group inputs">
                <span>Email</span>
                <input class="form-control" type="text" name="j_username" />
            </div>
            <div class="form-group">
                <span class="pass">Password</span>
                <input class="form-control" type="password" name="j_password" />
            </div>
            <div class="form-group">
                <input class="form-control" id="remember_me" name="_spring_security_remember_me" type="checkbox"/>
                <label for="remember_me" class="inline">Remember me</label>
            </div>
            <input type="submit" class="submit-btn btn btn-default" value="Login" />
        </form>
    </div>
    <span id="shortLink">
        <#if link??>
            <input id="ready-link" type="text" value="${link}">
        </#if>
    </span>

</section>
</#macro>