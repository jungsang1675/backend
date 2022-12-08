$(document).ready(function(){
    $("#main_navi").before("<div class='bg'></div>");



    // 
    $(".bg, .sub").hide();
    $("#menu").mouseenter(function(){
        $(".bg, .sub").stop().slideDown("fast");
    }).mouseleave(function(){
        $(".bg, .sub").stop().slideUp();
    });

    $(".bg").mouseover(function(){
        $(this).stop().show();
        $(".sub").stop().show();
    }).mouesout(function(){
        $(this).stop().slideUp();
        $(".sub").stop().slideUp();
    });

    // 이미지변경
    $("#menu > li").hover(function(){
        var bgImg = $(this).attr("data-n");
        $(".bg").css("background-image","url(images/hybg"+bgImg+".jpg)");
    });
    //languages 내용 보이기 /숨기기
    $(".lang_li > ul").hide();
    var show = false;
    $(".lang_li").click(function(){
        show = !show;
        if(show == true){
            $(".lang_li").children("ul").show();
            $(".lang_li").css("color","red")
            $(".lang_li > span").text("▲").css("color","red");
            //방법
            // if(show)) 
            // $(".lang_li").children("ul").show();
        }else{
        $(".lang_li").children("ul").hide();
        $(".lang_li > a").css("color","")
        $(".lang_li > span").text("▼").css("color","");
    }
    });
});