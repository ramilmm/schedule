<#-- @ftlvariable name="adverts" type="java.util.List<mvc.common.Ad>" -->
<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"]>
<#include "../template/template.ftl">
<@mainTemplate title="Timetable" styles=["/resources/css/style.css"]/>
<#macro m_body>
<div class="container">
    <div class="row">

        <div class="content">
            <div class="timetable col-md-6 col-xs-12">
                <a href="/signin" class="signin">Войти</a>
                <div class="css_loadPrevDay">
                    <span class="up-icon glyphicon glyphicon-chevron-up"></span>
                </div>

                    <div class="day">
                            <span class="date">
                                Tuesday, September 13
                            </span>
                        <br>
                        <div class="adline">
                        <#list adverts as advert>
                            <div class="ad">
                                <p class="time">${advert.time}-18:47</p>
                                <p class="name">${advert.comment}</p>
                            </div>
                         </#list>
                        </div>
                    </div>


                <div class="css_loadNextDay">
                    <span class="down-icon glyphicon glyphicon-chevron-down"></span>
                </div>
            </div>
    <@sec.authorize access="isAuthenticated()">
            <div class="add_ad col-md-6 col-xs-12">
                <div class="addpostForm form-group">
                    <form class="form-horizontal" role="form" action="/addPost">
                        <div class="form-group date">
                            <label class="col-sm-2 control-label">Дата</label>
                            <div class="col-sm-10">
                                <input type="text" class="datepicker form-control" id="datepicker" placeholder="04.09.1996">
                            </div>
                        </div>
                        <div class="form-group date">
                            <label class="col-sm-1 control-label">Время</label>
                            <div class="col-sm-5">
                                <input type="text" class="time form-control" id="startTime">
                            </div>
                            <div class="col-sm-5">
                                <input type="text" class="time form-control" id="endTime">
                            </div>
                        </div>
                        <div class="comment-input">
                            <label class="control-label">Комментарий:</label>
                            <input type="text" class="form-control comment" id="input">
                        </div>
                        <br>
                        <div class="type">
                            <p class="types">
                                <label class="js_type control-label">Выберите тип рекламы:</label> <br>
                                <input type="radio" value="birzha" name="type" id="birzha"> <label class="js_type" for="birzha">Биржа ВК</label><br>
                                <input type="radio" value="pryamaya" name="type" id="pryamaya">
                                <label class="js_type" for="pryamaya">Прямая</label><br>
                                <input type="radio" value="custom" name="type" id="custom"> <label class="js_type" for="custom">Кастомная</label> <br>
                                <input type="radio" value="ne-reklama" name="type" id="ne-reklama">
                                <label class="js_type" for="ne-reklama">Не реклама</label><br>
                            </p>
                            <div class="form-group">
                                <label class=" col-xs-4 control-label">Цена:</label>
                                <input type="text" class=" col-xs-8 cost form-control" name="cost">
                            </div>

                        </div>
                        <br>
                        <div class="submit_btn">
                            <input type="submit" class="submit btn btn-s btn-success" value="Добавить">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <div class="result col-sm-12 col-xs-12">

            <div class="day col-md-6 col-xs-6">
                Дата
            </div>
            <div class="money col-md-6 col-xs-6">
                Прибыль
            </div>
            <div class="day col-md-6 col-xs-6">
                16.09.2016
            </div>
            <div class="money col-md-6 col-xs-6">
                610
            </div>
        </div>
    </@sec.authorize>
    </div>
</div>
</div>
</#macro>