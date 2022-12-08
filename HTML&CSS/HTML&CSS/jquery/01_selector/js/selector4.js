$(document).ready(function(){
    //:contains()
    $("#ex1 ul li:contains('웹')").css("color","red");

    //:empty
    $("#ex2 ul li:empty")
    .css("background-color","#ff66cc")
    .text("jQuery")
    .css("color","#fffffF");


    //:praent
    $("#ex3 ul li:parent").text("parent");

    // :has()
    $("#ex4 div:has(h3)").css("border","1px solid red"); //h3이 있는 dic에 적용
    $("#ex4 div:not(:has(h2))").css("background-color","yellow");
});