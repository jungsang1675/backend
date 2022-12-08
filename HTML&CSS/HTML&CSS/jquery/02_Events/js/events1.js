$(document).ready(function()
{
    //     // 이메일
        $("#name").keydown(function(){
            //$("#name").css("background-color","#cccc33");
            $(this).css("background-color","#cccc33");
        });
        $("#name").keyup(function(){
            $(this).css("background-color","");
    });
    //     $("#name").css("background-color","")   


    // 이메일
    var i = 0;
    $("#email1").keydown(function(){
        $(".txt1").text(i+=1);
    });
    var j = 0;
    $("#email2").keypress(function(){
        $(".txt2").text(j+=1);
    });

     });
