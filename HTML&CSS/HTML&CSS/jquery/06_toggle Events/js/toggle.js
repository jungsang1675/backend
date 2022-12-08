$(document).ready(function(){
    // ex1
    $(".num_btn").toggle(function(){
        $(".num_i").attr("src","images/number5.png");
    },function(){
        $(".num_i").attr("src","images/number4.png");
},function(){
    $(".num_i").attr("src","images/number3.png");
},function(){
    $(".num_i").attr("src","images/number2.png");
},function(){
    $(".num_i").attr("src","images/number2.png");
});
    // ex2 원래 밖 안 누르면 다 효과가 들어갔는데 stop넣고 a만들어가짐
    $(".box").click(function(){
        $(this).css("border-color","#cc0066");
    });
    $(".evt").click(function(event){
        $(this).css("border-style","dashed");
        event.stopPropagation(); 
        // return false; //이것도됨
    });
        // ex3 , ex4
        $("#ex3").mouseover(function(){
            $("#ex3 p").css("background-color","green");
        }).mouseout(function(){
            $("#ex3 p").css("border","3px solid #ff0000");
        });
        $("#ex4").mouseenter(function(){
            $("#ex4 p").css("background-color","green");
        }).mouseleave(function(){
            $("#ex4 p").css("border","3px solid #ff0000");
        });
   


});
