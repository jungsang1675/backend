function banner(){
    $("#top_singerlist:not(:animated)")
    .animate({ marginLeft : parseInt($("#top_singerlist").css("margin-left"))-460+"px"},"slow","swing", function(){
        $("#top_singerlist .singerwrap:first").appendTo("#top_singerlist");
        $("#top_singerlist").css("margin-left","-460px");
    });
};   

$(document).ready(function(){
 $("#renewal").hide();
 $("#renewal").delay(1000).slideDown(1000);
 $("#renewal span").click(function(){
$("#renewal").slideUp(1000);
 });

 $(window).mousewheel(function(){
    return false;
});

$(".box").on("mousewheel" , function(event, delta){
    page = $(this).attr("data-n") - delta;
    var target = $(".box"+page).offset().top;
    $("body,html").stop().animate({"scrollTop" : target},500);
    return false;
});//mousewheel 페이지


 var page = 1;

  // 로고배너
  $("#plac_13 p img").bind("click",function(){
    $("#plac_13 p img").attr("src","logo/btn_off.png")
    $(this).attr("src","logo/btn3.png");
});
$(".plac1").bind("click",function(){
    $(".plac_2").attr("src","logo/80.png");
    return false;
});
$(".plac2").bind("click",function(){
    $(".plac_2").attr("src","logo/cdnImg20221027015301.jpg");
    return false;
});
$(".plac3").bind("click",function(){
    $(".plac_2").attr("src","logo/cdnImg20221027015346.jpg");
    return false;
});
$(".plac4").bind("click",function(){
    $(".plac_2").attr("src","logo/cdnImg20221027022356.jpg");
    return false;
});
$(".plac5").bind("click",function(){
    $(".plac_2").attr("src","logo/cdnImg20221102045453.jpg");
    return false;
});



 
//멜론 주간인기 가수
    var r = 480 * $("#top_singerlist .singerwrap").length+"px";
    $("#top_singerlist").css("width", r);
    $("#top_singerlist .singerwrap:last").prependTo("#top_singerlist")
    $("#top_singerlist").css("margin-left","-460px");
 
    var banner = setInterval("banner()", 1500);
 
    $("#top_singerlist .singerwrap").mouseover(function(){
     clearInterval(banner);
 }).mouseout(function(){
    clearInterval(banner);
     banner = setInterval("banner()",500);
 });
// 실시간차트 시간
 var i = setInterval(function(){ var now1 = new Date();
    var getFullYear1 = now1.getFullYear();
    var getMonth1 = now1.getMonth() +1; 
    var getDate1 = now1.getDate(); 
    var getHours1 = now1.getHours(); 
    $("#main_chart span").css("font-size","32px").css("color","black");
    $("#main_chart span:eq(0)").text(getFullYear1+"."); 
    $("#main_chart span:eq(1)").text(getMonth1+".");
     $("#main_chart span:eq(2)").text(getDate1+".");
     $("#main_chart span:eq(3)").text(getHours1+":00").css("color","gray") },1000);
     

     // 태그추가
     $("#main_list1").before("<p class='l_bg'></p>")

     // 추가태그 숨기기
     $(".l_bg").hide();
 
     // 하위메뉴 보이기/숨기
     $(".submenu").hide();
     $("#main_list1 > li").hover(function(){
         $(this).children("ul").show();
         $(".l_bg").show();
     },function(){
         $(this).children("ul").hide();
         $(".l_bg").hide();
     });
 
   

    // 멜론차트100 
  var li_    = $("#main_chart1 ul").width()
  var w = 350 * $("#main_chart1 ul").length+"px";
  
  $("#main_chart1").css("width", w);
  $("#main_chart1 ul:last").prependTo("#main_chart1")
  $("#main_chart1").css("margin-left",-300+"px");


  $(".chart_pos1").click(function(){
   $("#main_chart1:not(:animated)")
   .animate({marginLeft : parseInt($("#main_chart1").css("margin-left"))-300+"px"},"fast","swing", function(){
       $("#main_chart1 ul:first").appendTo("#main_chart1");
       $("#main_chart1").css("margin-left",-300+"px");
   });
});   
$(".chart_pos2").click(function(){
   $("#main_chart1:not(:animated)")
   .animate({marginLeft : parseInt($("#main_chart1").css("margin-left"))+300+"px"},"fast","swing", function(){
       $("#main_chart1 ul:last").prependTo("#main_chart1");
       $("#main_chart1").css("margin-left",-300+"px");
   });
});   
});