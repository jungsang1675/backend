$(document).ready(function(){
// ex1
//     $(".btn1").click(function(){ //html1
//         $(".box1").html("<p>변경</p>");
//         $(".box1").css("border","1px solid blue");
//         $(".box p").css("border","1px solid red;");
//     });
    $(".btn2").click(function(){
        //box1의 html -> box2의 html로 변경
        $(".box1").html( $(".box2").html());
    });
    $(".btn3").click(function(){
        //box1의 html -> box2의 html로 변경
        var k = $(".box2").html();
        $(".box1").html(k);
   });

// ex2



$(".btn4").click(function(){
    $(".text_wrap").remove(); //삭제
    });
$(".btn5").click(function(){ //detach
    $(".text_wrap").detach(); //삭제
    });
$(".btn6").click(function(){ //empty
    $(".text_wrap").empty();
    });

//     //ex3
    $(".ex3_t").mouseover(function(){

        // $(this).text("그런가 <br요??");
        $(this).html("그런가<br>요??")
    });

});