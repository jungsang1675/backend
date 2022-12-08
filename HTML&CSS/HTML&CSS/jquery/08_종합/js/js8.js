$(document).ready(function(){
    // ex1
    // $(slector).prop() slector의속성
    // $(slector).attr() slector의속성
    $(".btn1_1").click(function(){ //prop
        var a = $(".ex1 a").prop("href");
        alert(a);
    });
    $(".btn1_2").click(function(){ //attr
        var b = $(".ex1 a").attr("href");
        alert(b);
    });
    $(".btn2_1").click(function(){ //prop
        var c =$(".ex2 input:nth-child(1)").prop("checked");
        alert(c);
        //체크 true; 헤제 false
    });
    $(".btn2_2").click(function(){ //attr
        var d = $(".ex2 input:nth-child(1)").attr("checked");
        alert(d);
        //체크 checked , 헤제 checked
    });

    // WRAP2
    // 전체선택
    // $("#chk1").change(function(){ //변경
    //     var chk1 = $("#chk1").prop("checked");
    //     if(chk1 == true){
    //         $("#chk2, #chk3").prop("checked",true);
    //         $(".type01").addClass("checked");
    //     }else{
    //         $("#chk2, #chk3").prop("checked",false);
    //         $(".type01").removeClass("checked");
    //     }
    // });
    // // - 개인정보처리방침(선택)//개인정보 제3자제공 동의(선택)
    // $("#chk2, #chk3").change(function(){
    //     var chk2 =$("#chk2").prop("checked");
    //     var chk3 =$("#chk3").prop("checked");
    //     if(chk2 == true){ //개인정보처리방침(선택)
    //     $(".type03").addClass("checked");
    // }else{
    //     $(".type03").removeClass("checked");
    // }
    //     if(chk3 == true){ //개인정보 제3자 제공 동의(선택)
    //         $(".type04").addClass("checked");
    //     }else{
    //         $(".type04").removeClass("checked");
    //     }

    // if(chk2 == true && chk3 == true){ //전체선택
    // $(".type02").addClass("checked");
    // }else{
    //     $(".type02").removeClass("checked");
    //     }
    // });
});