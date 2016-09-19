$(document).ready(function () {
    
         
     $(document).on('click', '.types', function () {
        var radio = $('input[name="type"]:checked').val();
         
         var $this = $('.cost');
         if(radio == "birzha"){
            $('.comment').val('Биржа ВК');
            $this.val(147);
            $this.attr("disabled",true);
         }else if(radio == "pryamaya"){
             $('.comment').val('Прямая');
            $this.val(170);
            $this.attr("disabled",true);
         }else if(radio == "custom"){
             $('.comment').val('Прямая');
             $this.val(170);
             $this.attr("disabled",false);
         }else {
             $this.val(100);
             $this.attr("disabled",false);
         }
         
    });
    
    
});