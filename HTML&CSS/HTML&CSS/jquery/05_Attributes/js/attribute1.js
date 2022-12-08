// .attr속성명, 속성값 속성 추가
// removeaAttr('속성명') 속성을 삭제 제거


//ex1 모든 a의 href 벼녕
$(document).ready(function(){


$("#ex1 a").attr("href","http://m.daum.net");

// ex1첫번째 a의 target 추가
    $("#ex1 a").eq(0).attr("target","_blank");

    //ex1 두번째 a의 target 삭제
    $("#ex1 a:last").removeAttr("target");

    // EX2
    // 이미지에 마우스 오버할때 이미지 변경(roll2_1.gif)과 title(이미지 설명)
    //mouseover, mouseout
    
    $("#ex2 img").mouseover(function(){
        $(this)
        .css("cursor","pointer")
        .attr({"src" : "images/roll1_1.gif","title" : "이미지 변경"});
    }).mouseout(function(){
        $(this)
        .css("cursor","default")
        .attr("src" ,"images/bg7.jpg")
        .removeAttr("title");
    });

    // box3
    function scroll_n(i){
        $("#box3_i").scrollLeft($("#box3_i").scrollLeft()+i);
    }
    $(".btn1").click(function(){ //왼쪽으로 스크롤
        scroll_n(-100)
    });
    $(".btn2").click(function(){ //오른쪽으로 스크롤
        scroll_n(100)
    });
    $(".btn3").click(function(){ //아래에서 스크롤
        $("#box4_i").scrollTop($("#box4_i").scrollTop()+50);
    });
    $(".btn4").click(function(){ //위에서 스크롤
        $("#box4_i").scrollTop($("#box4_i").scrollTop()-(50));
    });
});
























