<template>
  <div> 
    <p>{{ msg }}</p> <!-- 데이터 바인딩 -->
  </div>
  <hr>
  <LessonOne/>
  <LessonTwo/>
  <LessonThree/>
  <LessonFour/>
 
<hr>
  <div>
    <p>App.vue파일입니다.</p>
    <div>
      <p>{{web[0]}}</p>
      <p>{{web[1]}}</p>
      <p>{{web[2]}}</p>
      <p>{{web[3]}}</p>
    </div>
  </div>
  <LessonFive v-bind:web="web" />
  <LessonFive :web="web" />

  <LessonSix/>
  <LessonSevens/>
  <hr>
  <hr>
  <div>
    <p>수감 개월수 : <input type="text" id="month" v-model="month" 
    placeholder="수강가능한 개월수 입력"></p>
  </div>
  <LessonEight/>
  <LessonNine/>

  <!-- 부모요소를가져올려면 작성해야됨 -->
  
</template>

<script>
 import LessonOne from './components/LessonOne.vue'
 import LessonTwo from './components/LessonTwo.vue'
 import LessonThree from './components/LessonThree.vue'
 import LessonFour from './components/LessonFour.vue'
 import LessonFive from './LessonFive.vue'
 import LessonSix from './components/LessonSix.vue'
 import LessonSevens from './LessonSevens.vue'
 import LessonEight from './components/LessonEight.vue'
 import LessonNine from './components/LessonNine.vue'
export default {
  name: 'App',
  data(){
    return {
      msg : "안녕안녕!!!",
      web : ['web1','web2','web3','web4'],
      month : "",
    }
  },
  components: {
    LessonOne,
    LessonTwo,
    LessonThree,
    LessonFour,
    LessonFive,
    LessonSix,
    LessonSevens,
    LessonEight,
    LessonNine,
  },
  beforeUpdate(){ //업데이트 되기 전에 실행
  if(this.month == 1 ){
    alert('너무 짧아요');
    this.month = 3
  }
  }
}
</script>

<style>
#app {
 margin: 20px;
}
</style>
