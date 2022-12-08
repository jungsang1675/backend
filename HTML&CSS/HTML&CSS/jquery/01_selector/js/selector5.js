$(document).ready(function(){
    //:hidden
    // 숨겨져있는 p요소를 3초동안 화면에 보이게 해라
    $("#ex1 p:hidden").show(3000);  //웹접근성 visibilty 는적용안됨 1은 사이즈가없기때문에 안나옴

    // :visible
    // 화면에 보이는 p 요소를 2초동안 숨겨라

    $("#ex1 p:visible").hide(2000);

});



// EX2
// 3초후 show()를 한번만 실행해라 
function show(){
    $(".none_img:hidden").show(5000); // 숨긴이미지
    $("#photo img:first").hide(3000); //첫번째 이미지
    $("#photo img:first").show(fast);
}
setTimeout("show()",3000);