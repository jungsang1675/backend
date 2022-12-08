$(document).ready(function(){
    //우측상단 아이콘 변경
        $("#top > ul >li").hover(function(){
            var i_src = $(this).children(".s_img").attr("data-src");
            $(this).children(".s_img").attr("src", i_src);
        },function(){
            var out = $(this).children(".s_img").attr("data-out");
            $(this).children(".s_img").attr("src", "images/btn_"+out+"_off.png");
        });  $(this).children("ul").stop().fadeIn();
        


    // 통합검색
    $("#top > ul > li.search div").slideUp(0);
    $("#top > ul > li.search").bind("mouseover",function(){
        $("#top > ul > li.search div").stop().slideDown("fast","easeOutBounce")
    });
    $("#top > ul > li.search").bind("mouseleave",function(){
        if($("#search").is(":focus") == true ){ //있으면 true , 없으면 false
            $("#top > ul > li.search div").show();
        }else{
            $("#top > ul > li.search div").stop().slideUp(400,"easeOutBounce");
        }

    }).focusout(function(){//포커스가없으면
        $("#top > ul > li.search div").stop().slideUp(400,"easeOutBounce");
        $("#search").val(""); //value
    });
    // LANGUAGE
    $("#top > ul > li.language > ul").hide();
    $("#top > ul > li.language").mouseover(function(){
        $(this).children("ul").stop().fadeIn();
    }).mouseout(function(){
        $(this).children("ul").stop().fadeOut();
    });



    // warp11
    //$(셀렉터).is() 셀렉터의 대상을 비교하여 맞으면 트루 아니면 펄스를 반환
    $("#wrap11 span").click(function(){
        if($(this).is("[class='txt11']")){
            $(this).css("background-color","pink");
        }else{
            $(this).css("border-color","blue");
        }
    }); 
});