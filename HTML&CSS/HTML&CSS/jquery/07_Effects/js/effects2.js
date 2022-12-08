$(document).ready(function(){
// ex1
$(".photo").hide();
$(".btn1").click(function(){ //fadeIn
    $(".photo").fadeIn(1000)
});
$(".btn2").click(function(){ //fadeout
    $(".photo").fadeOut(1000)
});
$(".btn3").click(function(){ //fadeTo
    $(".photo").fadeTo("slow",0.4)
});
$(".btn4").click(function(){ //fadeToggle
    $(".photo:not(:animated)").fadeToggle(1000)
});
$(".btn5").click(function(){ //callback
    $(".photo").fadeIn(1000, function(){
        $(".photo").fadeOut(1500);

    });
});
    // ex2
    $(".ex2_i").mouseover(function(){
        $(".out1",this).fadeOut();
    });
    $(".over1").mouseout(function(){
        $(".out1").fadeIn();
    });
// ex3

    $(".ex3_i")
        .animate({left : "60%"},1000)
        .animate({top : "40%"},500)
        .animate({left : "0%"},1000)
        .animate({top : "0%"},500);

    // ex4
    $(".ex4_i")
        .delay(2000)
        .animate({ left : "400px" ,opacity : "0.5"},2000)
        .animate({ left : /*"500px"*/ "+=100px",opacity : "1"},2000)
        .animate({ top :  "+=150px"},500)
        .animate({ top :  "-=50px"},"fast")
        .animate({ left :  "0"},"1000")
        .animate({ top :  "0"},"slow")
});