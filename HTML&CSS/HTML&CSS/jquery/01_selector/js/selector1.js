$(document).ready(function(){

    //ex1
    //$("*").css("border","1px dotted #ff3366");
    $("li *").css({"font-size" : "30px", "border" : "2px solid #cc0000"});
    


    //img_wrap
    $(".img1").css("border","3px solid #cc0066");
    $(".photo1").css("border-color","#66cccc");
    $(".photo2").css("padding","10px");

    //element selector
    //글자색 , 글자크기 , 배경색 , 글자굵기 보통
    $("h1")
    .css("color","#cc33cc")
    .css("font-size","30px")
    .css("background-color","#ffcc66")
    .css("font-weight","normal");


    $("h2").css({"color": "#cc33cc", "font-size":"25px","background-color" :"#ffcc66",                    "font-weight" : "normal"
    })


$("h3").css({color:"#cc33cc", fontSize : "30px", backgroundColor : "#ffcc66",fontWeight : "normal"});
  //ex2
  $("#ex2_2").css({backgroundColor : "#eac1ea", color : "#ff2626"});

  //selectro1, selectornN
  $(".box1, .box2 , #box3")
    .css({
        "border" : "1px solid #666666",
        "width" : "120px",
        "height" : "100px",
        "float" : "left" ,
        "margin" : "10px,",
        "text-align" : "center",
        "line-height" : "100px",
         "background-image" : "url(../images/img4.gif)"
        //"background-image" : "url(images/img4.gif)"
    });
});
