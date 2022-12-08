// 1번
new Vue({
        el : ".num1",
        data : {
          value   : 100
        },
        methods :{
            plus(){
                this.value +=2
            },
            minus(){
                this.value -=2
            }
        }
 })
// 2번  
 new Vue({
    el : "#num2",
    data : {
      win   : '겨울',
    },
    methods :{
        ter(){
            this.win = '겨울(winter)'
        }
    }
    
    
})
// 3번
new Vue({
    el : '#num3',
    data : {
        title : '손꽁꽁!발꽁꽁!'
    }
})

// 4번
new Vue({
    el : '#num4',
    data : {
        link : 'http://www.nate.com',
        target :'_blank',
        title : '네이트 이동'
    }
})
// 5번
new Vue({
    el : '#num5',
    data : {
        msg : 'vue.js'
    },
    computed : {
        r_msg(){
            return this.msg.toUpperCase() //소문자
        }
    }
})

// 6번
new Vue({
    el : '.num6',
    data : {
        fisrt : 'Front end'
    },
    computed : {
        r_first(){
            return this.fisrt.charAt(4) //인덱스번호
        }
    }
})

// 7번
new Vue({
    el : '.num7',
    data : {
        len : '프론트엔드 첫걸음'
    },
    computed : {
        r_len(){
            return this.len.length //개수
        }
    }
})