$(document).ready(function(){
    // notice li 개수
    var w = 320 * $("#notice li").size()+"px"; //.size selecor 개수
    // var w = 320 * $("#notice li").length+"px";
    $("#notice li").css("width", w);
    // console.log(w); // 320 * 6 = 1920px
    $("#notice li:last").prependTo("#notice")// 마지막 li를 맨앞으로 이동
    $("#notice").css("margin-left","-320px");

    $(".prev.btn").click(function(){
        $("#notice:not(:animated)")
        .animate({marginLeft : parseInt($("#notice").css("margin-left"))-320+"px"},"slow","swing", function(){
            $("#notice li:last").appendTo("#notice");// 맨앞 li를 맨뒤으로 이동
            $("#notice").css("margin-left","-320px");
        });
    });
    $(".next.btn").click(function(){
        $("#notice:not(:animated)")
        .animate({marginLeft : parseInt($("#notice").css("margin-left"))+320+"px"},"slow","swing", function(){
            $("#notice li:last").appendTo("#notice");// 맨앞 li를 맨앞으로 이동
            $("#notice").css("margin-left","-320px");
        });
    });
});