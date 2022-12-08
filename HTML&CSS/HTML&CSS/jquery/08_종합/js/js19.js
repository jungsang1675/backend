  
  $(document).ready(function(){

  
  // notice li 개수
  var li_w = $(".food li").width()
   var w = 320 * $(".food li").size()+"px"; //.size selecor 개수
   // var w = 320 * $("#notice li").length+"px";
   $(".food").css("width", w);
   // console.log(w); // 320 * 6 = 1920px
   $(".food li:last").prependTo(".food")// 마지막 li를 맨앞으로 이동
   $(".food").css("margin-left",-li_w+"px");


   $(".prev").click(function(){
    $(".food:not(:animated)")
    .animate({marginLeft : parseInt($(".food").css("margin-left"))-li_w+"px"},"slow","swing", function(){
        $(".food li:first").appendTo(".food");// 맨앞 li를 맨뒤으로 이동
        $(".food").css("margin-left",-li_w+"px");
    });
});   
    $(".next").click(function(){
    $(".food:not(:animated)")
    .animate({marginLeft : parseInt($(".food").css("margin-left"))+li_w+"px"},"slow","swing", function(){
        $(".food li:last").prependTo(".food");// 맨앞 li를 맨뒤으로 이동
        $(".food").css("margin-left",-li_w+"px");
    });
    });

});