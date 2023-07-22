const clock = document.querySelector("p#clock");

function getClock() {
  const date = new Date();
  //   String( ); 문자열 형식으로 타입 변환
  const hour = String(date.getHours()).padStart(2, "0");
  const minutes = String(date.getMinutes()).padStart(2, "0");
  // const seconds = String(date.getSeconds()).padStart(2, "0");
  clock.innerText = `${hour}:${minutes}`;
}

// interval 이벤트가 일어나는 간격(이벤트, ms밀리세컨) 반복
getClock();
setInterval(getClock, 1000);

// Timeout 이벤트가 일어나는 간격(이벤트, ms밀리세컨) 한번만
// setTimeout(getClock,1000);

// 스트링.padStart(스트링길이,"추가할 문자");
// 스트링.padEnd(스트링길이,"추가할 문자"); 스트링 뒷쪽에 문자 추가
