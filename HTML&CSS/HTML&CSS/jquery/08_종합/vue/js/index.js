
//ex1
new Vue({
    el : "#ex1",
    data : {
        t_message : '안녕하세요!!'
    }
});

//ex2
new Vue({
    el : ".ex2",
    data : {
        t_message : '반가워요!!'
    }
});

// EX3
new Vue({
    el : '#ex3',
    data : {
        message : '반가워요',
        name : 'vue',
        age : 20
    }
})

// EX4
new Vue({
    el : '#ex4',
    data : {
        message : '반가워요',
        person : {
            name : 'vue',
            age : 20
        }
    }
})

// EX5
new Vue({
    el : '#ex5',
    data : {
        message : '<strong>Hello!!!</strong>'
    }
})

// EX6
new Vue({
    el : '#ex6',
    data : {
        price : 1000,
        name : 'ABC'
    }
})

// EX7
new Vue({
    el : '#ex7',
    data : {
        web : ['HTML','CSS','JAVASCRIPT','VUE'],
        object :{name:'true', price1:500,price2:1000}
    }
})

// EX8
new Vue({
    el : '#ex8',
    data : {
        // txt : 'Vue입니다. 오늘 날짜 : ' + new Date()
        txt : 'Vue입니다. 오늘 날짜 : ' + new Date().toLocaleString()
    }
})

// EX9
new Vue({
    el : '#ex9',
    data : {
        link : 'http://www.naver.com',
        target :'_blank',
        title : '네이버로 연결합니다.'
    }
})

new Vue({
    el : '#ex10',
    data : {
        v_data : 'Hello!!!!',
    }
})

new Vue({
    el : '#ex11',
    data : {
        data : '어려워요',
        type1 : 'password',
        type2 : 'button',
    }
})

new Vue({
    el : '#ex12',
    data : {
        msg : '안녕하세요!!',
    }
})

new Vue({
    el : '#ex13',
        data : {
            year : 2022
    },
    methods :{
        plus(){
            this.year++
        },
        minus(){
            this.year--
        }
    }
})

// ex14
new Vue({
    el : '#ex14',
    data : {
        text : ""
    },
    methods : {
        oneclick(){
            this.text = 'click'
        },
    }
})

new Vue({
    el : '#ex15',
    data : {
        count : 0
    },
    methods : {
        plus(num){
            this.count += 2
        }
    }
})


new Vue({
    el : '#ex16',
    data : {

    },
    methods : {
       alert(){
        alert('이벤트를 실행합니다.')
       }
    }
})

new Vue({
    el : '#ex17',
    data : {
        txt : true
    },
    methods : {
        toggle(){
            this.txt =!this.txt
        }
      }
})
// EX18
new Vue({
    el : '#ex18',
    data : {
        code1 : [
            { txt : 'html'},
            { txt : 'css'},
            { txt : 'javascript'},
            { txt : 'jquery'},
        ]
    }
})
// EX19
new Vue({
    el : '#ex19',
    data : {
        msg : 'JAVASCRIPT'
    },
    computed : {
        r_msg(){
            return this.msg.toLowerCase() //소문자
        }
    }
})
// EX20
new Vue({
    el : '#ex20',
    data : {
        msg : 'JAVASCRIPT'
    },
    computed : {
        r_msg(){
            return this.msg.indexOf("S") //인덱스번호
        }
    }
})

// EX21
new Vue({
    el : '#ex21',
    data : {
        msg : 'JAVASCRIPT'
    },
    computed : {
        r_msg(){
            return this.msg.indexOf("a") //인덱스번호
        }
    }
})

// EX22
new Vue({
    el : '#ex22',
    data : {
        msg : 'JAVASCRIPT'
    },
    computed : {
        r_msg(){
            return this.msg.charAt(4) //인덱스번호 데이터
        }
    }
})

// EX23
new Vue({
    el : '#ex23',
    data : {
        msg : 'JAVASCRIPT'
    },
    computed : {
        r_msg(){
            return this.msg.substring(2,4) //n1번부터 n2번-1 인덱스까지의 데이터
        }
    }
})

// EX24
new Vue({
    el : '#ex24',
    data : {
        msg : 'JAVASCRIPT'
    },
    computed : {
        r_msg(){
            return this.msg.length //개수
        }
    }
})



// EX25
new Vue({
    el : '#ex25',
    data : {
        msg : 'JAVASCRIPT'
    },
    computed : {
        r_msg(){
            return this.msg.replace("PT","aaaa")  //n1를 n2로 치환
        }
    }
})
