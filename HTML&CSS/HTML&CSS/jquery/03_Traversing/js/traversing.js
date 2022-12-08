$(document).ready(function(){
    // .first()
    // $("#main1 p").first().css("background-color","#cccccc"); //middle2의 p 이건 메서드
    // 이건 셀렉터$("#main1 p:first").css("background-color","#cccccc");//middle2의 p
        // $("#main1 >p ").first().css("background-color","#ffcc33"); //p1
    


    // .list()
    // $("#main1 p").last().css("background-color","#ffcc33"); //middle2의 p 이건 메서드

    // .eq()
    //  $("#main1 p").eq(2).css("background-color","#ffcc33");  //eq인덱스번호 0부터 시작 p2 

    //  .filter()
    // $("#main1 div").filter(".middle2").text("middle2적용"); //.middle2에 텍스트바꿔라 middle2적용

    //  .not()
    // $("#main1 div").not("#sub1").hide(); //sub1만 제외하고 모든 div숨기기

    // .slice
    // $("#slice1 p").slice(1,5).css("background-color","#ff99ff");// 2~5 왜냐 slisce 시작할때 1을 더하고 시작함
    // $("#slice1 p").slice(2).css({"border-width":"4px","border-color" : "#cc0033"}); //3~10
    // $("#slice1 p").slice(-5).css("color","green"); //끝에서 5개 6~10

    // .find()
    // $("#main2").find("p").css("background-color","#ff99ff") //box2의 p,p1,p2

    //.children()
    // $("#main2").children("p").css("background-color","#ff9900"); //p1 ,p2

    //.closest()
    // $("p.txt2").closest("div").css("background-color","#ff9900");
    // $("p.txt2").closest("#main2").css("background-color","#ff9900");

    // .prev
        // $("p.txt3").prev().css("background-color","#ff9900"); //p2
        //.prevAll
        // $("p.txt3").prevAll().css("background-color","#ff9900"); //div,p1,p2

    // .next()
    // $("p.part3").next().css("background-color","#ff9900"); //p2

    // .nextAll()
    // $("p.part3").nextAll().css("background-color","#ff9900"); //p2,p3

    // .siblings()

    // $("p.part3").siblings().css("background-color","#ff9900"); //div,p2,p3

    // .nextUntil
    // $("#main4 h2").nextUntil("#main4 h5").css({"color" : "#cc0033","border" : "2px solid #cc0033"}) //h3,h4

    // .parent()
        // $("#main4 span").parent().css({"color" : "#cc0033","border" : "2px solid #cc0033"}) //#main4
        // $("#main5 span").parent().css({"color" : "green","border" : "2px solid green"}) //#main4
    // .parents()
    // $("#main5 span").parents().css({"color" : "green","border" : "2px solid red"}) //상위전체
    // $("#main5 span").parents("ul").css({"color" : "green","border" : "2px solid red"}) //상위ul
    // $("#main5 span").parents("div").css({"color" : "green","border" : "2px solid red"}) //상위,div

    // .parentsUntil()
    $("#main5 span").parentsUntil("div").css({"color":"green","border" : "2px solid green"}) //ul,li

    
    // .add()
    $(".btn1").click(function(){ //확인1
        $("#main6 div").css("background-color","#ff9933"); //div
    });
    $(".btn2").click(function(){ //확인2
        $("#main6 div").add("#main6 span").css("background-color","#ccffcc"); //div+span
    });
    $(".btn3").click(function(){ //확인3
        $("#main6 div").add("#main6 span").add("#main6 p").css("background-color","#66ff99"); //div+span+p
    });
  



    
    
});