$(document).ready(function(){
    $("#main_navi ul li a").mouseover(function(){
    var over1 = $(this).attr("data-atitle");
    $(this).text(over1);
    }).mouseout(function(){
        var out1 = $(this).attr("data-btilte");
        $(this).text(out1);
    })

    // ex2
    // icon2_all 첫번째 이미지 src 변경
    $("#icon_all li:first a img").attr("src","images/btn_on.png");
    $("#icon_all li a img").bind("click",function(){
        $("#icon_all li a img").attr("src","images/btn_off.png")
        $(this).attr("src","images/btn_on.png");
    });
    $(".btn1").bind("click",function(){
        $(".banner img").attr("src","images/main1.jpg");
        return false;
    });
    $(".btn2").bind("click",function(){
        $(".banner img").attr("src","images/main2.jpg");
        return false;
    });
    $(".btn3").bind("click",function(){
        $(".banner img").attr("src","images/main3.jpg");
        return false;
    });
});