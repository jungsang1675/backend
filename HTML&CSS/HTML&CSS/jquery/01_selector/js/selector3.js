$(Comment).ready(function(){
    //:eq
    //$("#ex1 p:eq(1)").css("border","1px solid #ff6666");
    //$("#ex2 ul li:eq(0)").css("background-color","#ff9966");//li1
    //$("#ex2 ul li:eq(5)").css("background-color","#ff9966");//li6
    //$("#ex2 .list2 li:eq(0)").css("background-color","#ff9966");//li6
    //:gt()
    //$("#ex2 ul li:gt(4)").css("background-color","orange");

    //$("#ex2 ul li:lt(3)").css("background-color","pink");

    //:first :last
    // $("#ex2 ul li:first").css("background-color","pink");
    // $("#ex2 ul li:last").css("background-color","orange");

    // :even :odd
    // $("#ex2 ul li:even").css("background-color","pink");
    // $("#ex2 ul li:odd").text("홀수번호 li").css("color","red");

    // :not()
    // 첫번째 li제외하고 배경색,글자색
//    $("#ex2 ul li:not(:first)").css({backgroundColor : "red", color : "#ea1eea"});

    //:header
    $("#ex1 :header").css("text-decoration","underline");//제목h1,제목h2
    $("section *:header").text("header 테스트").css("color","#6666ff");
    
    //:root
    $(":root").css("border","1px solid #ff66cc");

    //:lang
    $(".ex3 p:lang(en)").css("background-color","yellow");

    // gallery
    //1> 마지막번째 li화면에서 숨기기
    //2> (3)번 제외한 li 숨기기
    //3> (2,4,6,8,10)번 제외한 li 숨기기
    //4> (1,2,3,4)번 li 숨기기
    //4> (7,8,9,10)번 li 숨기기
    // $("#gallery ol li:last").css("display","none"); //1번
    // $("#gallery ol li:not(:eq(2))").css("display","none") //2번
    // $("#gallery ol li:not(:odd)").css("display","none"); //3번
    // $("#gallery ol li:lt(4)").css("display","none")//4번
    // $("#gallery ol li:gt(5)").css("display","none");//5번


});