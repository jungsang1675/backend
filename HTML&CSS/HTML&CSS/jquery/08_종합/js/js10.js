$(document).ready(function(){
    $(".j_txt1").not(":last").after("<span class='j_txt2'><span>") //마지막 span제외
    $(".join li:first a .j_txt2").addClass("j_txts");

    $(".btn_prev").css("opacity","0.5");//이전버튼

    var i =0;
    $(".btn_next").click(function(){
        $(".btn_prev").css("opacity","1.0");

        if(i <3){
        i++;
        // console.log(i); 1 2 3 
        var move = -600 * i;
        $("#join_con").stop().animate({left : move},500)
            var n =1;
            var k = n+i;
            // console.log(k); //2 3 4
            $(".join li a").removeClass("j_sel");
            $(".join .join"+k+" a").addClass("j_sel"); //.join /join2 a ~ .join .join4 a
            
            $(".span.j_txt2").removeClass("j_txts");
            $(".join .join"+k+" a span:eq(1)").addClass("j_txts");
    }else{
        alert("마지막 페이지입니다")

$(".btn_next").css("opacity","0.5");
}
    });
    $(".btn_prev").click(function(){ //이전
        $(".btn_next").css("opacity","1.0");

        if(i >0){
        i--;
        // console.log(i); 1 2 3 
        var move = -600 * i;
        $("#join_con").stop().animate({left : move},500)
            var n =1;
            var k = n+i;
            // console.log(k); //2 3 4
            $(".join li a").removeClass("j_sel");
            $(".join .join"+k+" a").addClass("j_sel"); //.join /join2 a ~ .join .join4 a
            
            $(".span.j_txt2").removeClass("j_txts");
            $(".join .join"+k+" a span:eq(1)").addClass("j_txts");
    }else{
        alert("첫 페이지입니다")
    $(".btn_prev").css("opacity","0.5");
}
    });
});