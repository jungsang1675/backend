$(document).ready(function(){
    // ex1
    $(".ex1_i").hover(function(){
        $(".img1" ,this).eq(1).stop().animate({"opacity" : "0"},500);
    },function(){
        $(".img1" ,this).eq(1).stop().animate({"opacity" : "1"},500);
    });


    // ex2
    var ex2  = setInterval(function(){
        $(".ex2_i img").animate({ "top" : "-20px"},1000);
        $(".ex2_i img").animate({ "top" : "0px"},1000);
    },2000);

    // ex3
    var ex3  = setInterval(function(){
        $(".ex3_i img").delay(300).animate({ "top" : "50px"},1000, "easeOutBounce");
        $(".ex3_i img").delay(2000).animate({ "top" : "0px"},1500,"easeOutBounce");
    },3000);

    // ex4 배너6을 실행시켜라
    banner6();
    function banner6(){
        $("#ba0").delay(2500).animate({left : "-500px"},1000); //1번이미지
        $("#ba1").delay(2500).css({"display" : "block","left" : "500px"})
                 .animate({left : 0},1000, function(){
                    $(this).delay(2500).animate({left : "-500px"},1000); //2번이미지
        $("#ba2").delay(2500).css({"display" : "block","left" : "500px"})
                    .animate({left : 0},1000,function(){
                        $(this).delay(2500).animate({left : "-500px"},1000);
        $("#ba0").delay(2500).css({left : "500px"},1000)
                .animate({left : 0},1000,banner6);                
                    }) //3번이미지
                })

    }
});