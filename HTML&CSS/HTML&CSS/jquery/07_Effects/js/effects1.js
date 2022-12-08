$(document).ready(function(){
    //ex1
    $(".btn1").click(function(){ //show
        // $(".box1").show(1000);
        $(".box1").show(3000);
    });
    $(".btn2").click(function(){ //hide
        $(".box1").hide();
    });
    $(".btn3").click(function(){ //toggle
        $(".box1").toggle();
    });
    $(".btn4").click(function(){ //callback
        $(".box1").show(1000,function(){
        alert("Hello")
        });
    });
    // EX2
    $(".btn5").click(function(){ //slideUp
        $(".box2").slideUp(1000);
    });
    $(".btn6").click(function(){ //slideDown
        $(".box2").slideDown(1000);
    });
    $(".btn7").click(function(){ //toggle
        // $(".box2").slideToggle(1000);
        $(".box2:not(:animated)").slideToggle(1000);
    });
    $(".btn8").click(function(){ //callback
        $(".box2").slideUp(1000,function(){
            $(this).slideDown(1000);
        });
    });


    // ex3
    $(".list_li2 div").hide();
    $(".list_li2").toggle(function(){ //상품신청
        $(".list_li2 div:not(:animated)").slideDown();
        $("#list_li2a").addClass("sel");
        $(".list_li2 span").text("-");
    },function(){
        $(".list_li2 div:not(:animated)").slideUp();
        $("#list_li2a").removeClass("sel");
        $(".list_li2 span").text("+");
    });
});