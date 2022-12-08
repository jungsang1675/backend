$(document).ready(function(){
    $(".btn_1").click(function(){//befor
        $("p.txt1").before("<img src='images/bg7.jpg'>");
    });
    $(".btn_2").click(function(){//after
        $("p.txt1").after("<h4>Hello!!</h4>");
    });
    $(".btn_3").click(function(){
        $(".photo1_2").insertBefore(".photo1_1");
    });
    $(".btn_4").click(function(){
        $(".photo1_3").insertAfter(".photo4");
        });


    
    $(".btn2_1").click(function(){//wrap
        $(".photo2_1 , .photo2_2").wrap("<p class='gallerrt1'></p>");
        $(".gallerrt1").css("border","3px dotted blue");
     });
    
    $(".btn2_2").click(function(){//wrapAll
        $(".photo2_3 , .photo2_4").wrapAll("<p class='gallerrt2'></p>");
        $(".gallerrt2").css("border","3px dotted red");
    });
    
    $(".btn2_3").click(function(){//wrapInner
        $(".ex2_box").wrapInner("<p></p>");
        $(".ex2_box").css("background-color","#ff99cc");
        $(".ex2_box p").css({"border" : "3px dotted", "margin" : "10px"});
    });
    
    $(".btn2_4").click(function(){//replaceWith
        $(".photo2_5").replaceWith("<img src='images/bg7.jpg'>");
    });
    $(".photo3").click(function(){//unwrap
        $(this).unwrap();
    });


    // photo_i(mouseover, bind,mouseout)
    //이미지 위에 마우스 포인터가 있을때 '이미지설명'표시
    //이미지 위에 마우스 포인터가 벗어날떄 '이미지설명'비표시
        // $(".photo_i").bind("mouseover",function(){
        //     $(this)
        //     .after("<span class='txt'>이미지설명</span>")
        //     .css("cursor","pointer");
        //     $(".txt").css({"display": "block","color": "#990000", "text-align": "center", "font-weight" : "bold"});
        // }).mouseout(function(){
        //     $(".txt").remove();
        // })

});