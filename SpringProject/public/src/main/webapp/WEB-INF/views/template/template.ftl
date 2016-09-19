<#macro mainTemplate title="Timetable" styles=[] scripts=[] headerBannerClass="banner" >
<!DOCTYPE html>
<html>
<head>
    <title>${title}</title>
    <#list styles as css>
        <link rel="stylesheet" href="/resources/${css}" type="text/css" />
    </#list>
    <link rel="stylesheet" href="/resources/css/bootstrap-theme.css">
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/css/style.css">
    <link rel="stylesheet" href="/resources/css/datepicker.css">
    <script src="/resources/js/bootstrap.min.js"></script>
    <#list scripts as js>
        <script src="/resources/${js}" type="text/javascript" defer></script>
    </#list>

</head>

<body>
    <@m_body />
</body>
<script src="/resources/js/jquery-3.1.0.min.js"></script>
<script src="/resources/js/bootstrap-datepicker.js"></script>
<script src="/resources/js/jquery.mask.min.js"></script>
<script src="/resources/js/common.js"></script>
<script type="text/javascript">
    $(function () {
        $('#datepicker').datepicker({
            format: 'dd.mm.yyyy',
            autoclose: true
        }).on('changeDate', function (ev) {
            $(this).datepicker('hide');
        });
    });
</script>
<script type="text/javascript">
    $(document).ready(function(){
        $('.time').mask('00:00');
    });
</script>
</html>
</#macro>