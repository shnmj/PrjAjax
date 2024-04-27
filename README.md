<h2>AJAX</h2>
<li>Jquery 참조 사이트    : https://jquery.com/</li>
<li>Spring Server 역할 (Mock Server) : https://jsonplaceholder.typicode.com/
<li>Fake Data 활용 사이트 : https://reqres.in/</li>
<li>$.ajax 참조 사이트    : https://www.tcpschool.com/ajax/ajax_jquery_ajax</li>
<br>
<details>
  <summary>
    04.22
  </summary>
  <ul dir="auto">
    <br>

    AJAX 기술로 호출         Rest API
    js              <->   서버(spring)는 페이지 이동 방식x, 처리된 결과 (data) return

    -------------------------

    Rest API 호출 기술
     - 하나의 주소("/board")를 Method를 다르게 해서 호출
     - Get(select), Post(insert), Put(patch)(update), Delete(del)
    
    
    1. Html
       Get       : <a href="">
       Get, Post : <form action="" method="" >
    
                   <form action="" method="Delete" >  -> js로 호출 (Post)
                   -> PostMapping 으로 받음
    2. XMLHttpRequest
    3. $.ajax()    -> jquery
    4. axios.get() -> axios lib (npm = node package manager = 브라우저 없이 js 사용가능 )
       axios = 함수
    5. fetch()     -> banillar

    --------------------------------

    XHR 객체 (XMLHttpRequest) -> old 함수(현재 사용 x) - w3school 참고
</details>
<br>
<details>
  <summary>
    04.23
  </summary>
  <ul dir="auto">
    <br>
  
    <br>
    
    const 상수 (원주율 같은 값이 바뀌지 않는)
    변수를 한 번만 초기화 가능 (h1Els) 값 변경 x
  
    tag
    
    El
     <p>를 포함한 전체 문장
     
    h1Els[0]  
    collection = array type  ->  collection 으로 return
    배열처럼 쓰지만 array가 아닌 arrayList
    
  
    Jquery
    
    $(function() {}) == window.onload = function() {}  →  여러번 사용 가능
    
    
    $(document).ready(function () { 
      $('h1').css('color', 'blue');
    });

    
    -------------------------------------------
    
    callback 함수안의 인자가 함수
    on이 작동할 때 그 변수가 다른 변수로 던짐
    
    클릭 될 때 .on('click',
                   → function(e) { ~~ 부터

    ==================
    
    juqery02
    $('div') 대상이 배열.
    하나라도 배열로 찾음
    
    querySelect = for문 x
    
    --------------
    
    juqery05 (student)
    
    DOM = html을 js객체로 취급 
    document
    object
    model 
    
    --------------
    
    jquery06 (성적표)
    
    Practice
    
    Client Program
     - Talend API Tester 크롬 확장 설치
     - Postman (무겁)
    
    
    jsonPlaceholder 자료 참조해서 Talend 실습
    
    
    POST(저장) : insert
     {
         "title" : "가나다"
        ,"body"  : "abc"
      }
     
    
    BODY : payload & 결과 데이터
    
    {
         "title" : "가나다"
        ,"body"  : "abc"
        , "id"   :  101
      }

    
    -----------------------
    
    jquery07
    
    instead of ~
    $.get(url, data, function() {} ) 
    $.getJSON(url, data, function() {} )  
    $.post(url, data, function() {} )
    $(대상).load(url, data) 대상을 찾고, 그 url을 가져와서 그 데이터를 (대상)에 넣
    
    
    $(대상).html(html tag)
    $(대상).append(html tag) // html 대신 씀
    $(html tag).appendTo(대상)
        
        
