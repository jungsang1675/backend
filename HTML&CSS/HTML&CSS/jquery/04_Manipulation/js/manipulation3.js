$(document).ready(function(){
    $(".btn1").click(function(){ //append
        //p.resul1안에서 맨뒤에 이미지 추가
        $("p.result1").append("<img src = 'images/btn_next.jpg'>");
    });
    $(".btn2").click(function(){ //propend
 //p.resul1안에서 맨앞에 이미지 추가
        $("p.result1").prepend("<img src = 'images/btn_prev.jpg'>");
    });
    $(".btn3").click(function(){ //appendTo
        //p.result2안에서 .photo를 맨뒤로이동
        $("p.result2 .photo").appendTo("p.result2");
    });
    $(".btn4").click(function(){ //prependTo
         //p.result2안에서 .photo를 맨앞로이동
        $("p.result2 .photo").prependTo("p.result2");
    });
    $(".btn5").click(function(){ //append
        $("#ex2 ol").append("<li>확인</li>");
    });
    $(".btn6").click(function(){ //prepend
        $("#ex2 ol").prepend("<li>확인**</li>");
    });
    $(".btn7").click(function(){ //실행1
        $(".box3 img:first").clone().appendTo($(".box3") );
    });
    $(".btn8").click(function(){ //실행2
        $(".box3 img:first").clone().appendTo($(".box3") );
    });
    $(".box3 img").bind("click",function(){
        alert("clone 테스트");
    });

});

// $셀렉터.clone() 셀렉터 복제
// $셀렉터.clone(true) 트루 옵션을 사용하면 생성된 이벤트까지 복제

// //.append()
// $(selector1).append(셀럭터2){ // 셀럭터1안에서 맨뒤에 셀럭터 2를 추가}
// $(selector1).PREPEND(셀럭터2){ // 셀럭터1안에서 맨앞에 셀럭터 2를 추가}
    //appendTo 셀럭터 2안에서 셀렉터 1를 맨뒤로 이동
    //prependTO 셀럭터2안에서 셀렉터 1를 맨앞으로 이동