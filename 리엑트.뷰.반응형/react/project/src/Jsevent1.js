import React from "react";
import $ from 'jquery'


class Event extends React.Component{
   componentDidMount(){ //렌더링 후 즉시 호출
    $('.ex1').on('click',() => {
        $('.ex1 span')
        .text('변경됨ㅋㅋ')
        .css({backgroundColor : 'pink', color : 'blue'})
    });

        $('.ex2 button').on('mousedown', () =>{
            $('.ex2 span').text('변경됨1 냐양')
        });
        $('.ex2 button').on('mouseup', () =>{
            $('.ex2 span').text('변경됨2 냐양')
        });


   }  





render(){
    return (
        <div>
            <h3>* 제이쿼리 *</h3>
            <p className="ex1"><button>버튼<span>내용</span></button></p>
            <br />
            <h3>* 제이쿼리 *</h3>
            <p className="ex2"><button>버튼<span>내용</span></button></p>
            <br />
        </div>
    );  
  }
}

export default Event;