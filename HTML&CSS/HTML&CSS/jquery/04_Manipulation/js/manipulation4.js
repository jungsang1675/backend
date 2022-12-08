$(document).ready(function(){
    // ex1
    $(".btn1_1").click(function(){ //<
        //맨처음 이미지를 .photo1안에서 맨뒤로 이동
        $(".photo1 img:first").appendTo($(".photo1"));
    });
    $(".btn1_2").click(function(){ //<
         //맨처음 이미지를 .photo1안에서 맨앞으로 이동
         $(".photo1 img:last").prependTo($(".photo1"));
    });
    // ex2
    $(".btn2_1, .btn2_2").hide();
    $("#ex2").mouseover(function(){
        $(".btn2_1, .btn2_2").show();
    }).mouseout(function(){
        $(".btn2_1, .btn2_2").hide();
    });
    $(".btn2_1").click(function(){ //<
        //맨처음 이미지를 .photo1안에서 맨뒤로 이동
        $(".photo2 img:first").appendTo($(".photo2"));
    });
    $(".btn2_2").click(function(){ //<
         //맨처음 이미지를 .photo1안에서 맨앞으로 이동
         $(".photo2 img:last").prependTo($(".photo2"));
    });
});