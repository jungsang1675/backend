$(document).ready(function(){
    $("#photo1 img").mouseover(function(){
        $(this).addClass("photo1_i");
    }).mouseout(function(){
        $(this).removeClass("photo1_i")
    });


$("#photo2 img").hover(function(){
    $(this).toggleClass("photo2_i"); //mouseover x
});


// ex2
    $("#ex2 p:eq(0)").addClass("has1");
    $("#ex2 p:eq(0)").click(function(){
        if($("#ex2 p:eq(0)").hasClass("has1")){
            alert("예!!")
        }else{
            alert("아니요!!");
        }
    });


    // EX3
    $(".menu3 li a:first").addClass("selected3");
    $(".menu3 li a").hover(function(){
        $(".menu3 li a").removeClass("selected3")
        $(this).addClass("selected3");
        $(".banner3 img").attr("src",$(this).attr("href"));
    }).click(function(){
        return false;
    });

    // EX4
    $(".menu4 li a:first").addClass("selected4");
    $(".menu4 li a").bind("mouseover",function(){
        $(".menu4 li a").removeClass("selected4");
        $(this).addClass("selected4");
        var num =$(this).attr("date-num");
        $("#ex4").css("background-image","url(images/main_"+num+".jpg)")
    }).click(function(){
        return false;
    });



    // EX5 //this가 부모영역이여야되고 태그는잘안먹음
    $(".over5").hover(function(){
        var img_roll5 = $(this).attr("href");
        $(".normal5",this).attr("src", img_roll5);
        var txt_roll5 = $(".tit",this).attr("date-tit1");
        $(".tit",this).next(text_roll5);
    },function(){
        var img_out5 = $(".normal5",this).attr("data-num");
        $(".normal5",this).attr("src","images/best"+img_out5+".png");
        var img_out5 = $(".tit",this).attr("data-tit2");
        $(".tit",this).text(txt_out5);
    }).click(function(){
        return false;
    });
});                                               