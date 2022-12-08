$(document).ready(function(){
    //[name]
    //$("#txt p[class]").css("border","2px dotted #cc0033"); //js2,js3,js5
    // $("#link1 a[id][title]").css("border","2px dotted #cc0033");//확인1 확인 2확인3 확인4
    

//[name="value"]
//    $("#link1 a[target='_blank']").css("border","2px dotted #cc0033");//확인 1, 확인4

//[name^="value"]
 //$("#link1 a[href^='http']").css("border","2px dotted #cc0033"); //확인 1, 확인4

//  [name$="value"]
// $("#txt p[class$='css1']").css("border" ,"2px dotted #cc0033");js2,js3,js5

// [name*="value"]
// $("#link1 a[target*='n']").css("border", "2px dotted #cc0033"); //확인 , 확인2, 화긴4

// [name!="value"] img3에 일치하지않아서 img4에 줌 ㅇㅋ?
// $("#gallery img[src!='images/img3.gif']").css("border","2px dotted #cc0033");

// [name|="value"]
    // $("#txt p[id|='html1']").css("border","2px dotted #cc0033"); //js1,js4


 // [name~="value"] 
 $("#txt p[class~='css1']").css("border","2px dotted #cc0033");//js2 , js3,js5
});

