$(document).ready(function(){




    // .evt1 - click 이벤트등록
    $(".evt1").click(function(){
        alert("evt1 이벤트"); //확인1
    });


    // .evt2 .evt3
    function event1(){
        alert("hello!!")
    }
    $(".evt2").click(event1); //확인2
    $(".evt3").contextmenu(event1); //확인1

    // .evt4 -이벤트 등록
    $(".evt4").bind("dblclick mouseout", function(){ //확인4
        $(this).text("HI!!!!");
    });


    // .evt5 - 이벤트 등록
    $(".evt5").on("click mouseout", function(){
        alert("on테스트");

    });


    // .evt4 -dblclick 이벤트제거
    $(".evt4").unbind("dblclick");

    // .evt5 -click 이벤트제거
    $(".evt5").off("click");
});