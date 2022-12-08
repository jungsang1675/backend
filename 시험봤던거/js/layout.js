// 1 번
    var a =10;
    while(a>1){
        document.write(a,"<br>");
        if(a == 4){
            break;}
        a--;}
        document.write("<hr>");
// //2번
        do{         
        }while(i<1);
        for(var i=7; i>=1; i--){
            document.write(i+" ");
            if(i==1) break;
        };
    document.write("<hr>");
// 3번
     var num = 0;
     var i = 0;
        while(i<=20){
          if(i % 2 == 1)  
            num = num +i;
            i++;}  
        document.write("1~20까지의 홀수의 누적합 :" +num + "<br>");
       document.write("<hr>");
 // 4번
var num  = 0;
var i = 1;
  do {
    if (i % 2 == 1) {
      num += i;
    }
    i++
  } while (i <= 20)
    document.write("1~20까지의 홀수의 누적합 :" +num + "<br>");
     document.write("<hr>");



// // 5번 
var name = prompt("성별을적으세요")
var num = prompt("값을입력하세요","0");
if(num % 2 ===1 && name == "남자"){
    document.write("<img src='image/num1.gif'>");
}else if(num % 2 ===0  && name == "여자"){
    document.write("<img src='image/num2.gif'>");
}else{document.write("다시 입력하세요");}
