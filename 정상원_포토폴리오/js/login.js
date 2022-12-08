$(document).ready(function(){
    $(".login_ma_lo").click(function(){ 
        $("#melon_qr_main").toggle();
    });


    $("#chk_lo1").change(function(){ //변경
        var chk1 = $("#chk_lo1").prop("checked");
        if(chk1 == true){
            $("#chk_lo2,#chk_lo3,#chk_lo4,#chk_lo5").prop("checked",true);
            $(".type1").addClass("checked");
        }else{
            $("#chk_lo2,#chk_lo3,#chk_lo4,#chk_lo5").prop("checked",false);
            $(".type1").removeClass("checked");
        }
    });
    $("#chk_lo2, #chk_lo3, #chk_lo4, #chk_lo5").change(function(){
        var chk2 =$("#chk_lo2").prop("checked");
        var chk3 =$("#chk_lo3").prop("checked");
        var chk4 =$("#chk_lo4").prop("checked");
        var chk5 =$("#chk_lo5").prop("checked");
        if(chk2 == true){ //개인정보처리방침(선택)
        $(".type2").addClass("checked");
    }else{
        $(".type2").removeClass("checked");
    }
        if(chk3 == true){ //개인정보 제3자 제공 동의(선택)
            $(".type3").addClass("checked");
        }else{
            $(".type3").removeClass("checked");
        }
        if(chk4 == true){ //개인정보 제3자 제공 동의(선택)
            $(".type4").addClass("checked");
        }else{
            $(".type4").removeClass("checked");
        }
        if(chk5 == true){ //개인정보 제3자 제공 동의(선택)
            $(".type5").addClass("checked");
        }else{
            $(".type5").removeClass("checked");
        }

    })

        $("#email_list").change(function(){
            $("#wrap3_type2").val($(this).val()).css("color","#999999");
   

})

})