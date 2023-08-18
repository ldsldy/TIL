const canvas = document.querySelector("canvas");
const ctx = canvas.getContext("2d");
canvas.width = 800;
canvas.height = 800;
ctx.lineWidth = 2;

const colors = [
  "#ff3838",
  "#ffb8b8",
  "#ff9f1a",
  "#fff200",
  "#32ff7e",
  "#c56cf0",
  "#7efff5",
];

function onClick(event) {
  ctx.beginPath();
  ctx.moveTo(400, 400);
  const color = colors[Math.floor(Math.random() * colors.length)];
  ctx.strokeStyle = color;
  ctx.lineTo(event.offsetX, event.offsetY);
  ctx.stroke();
}

canvas.addEventListener("mousemove", onClick);

// getContext("2d")는 HTML5 Canvas 요소에 2D 컨텍스트를 가져오는 데 사용되는 메서드입니다.
// 2D 컨텍스트는 캔버스 요소에 2D 그래픽을 그리는 데 사용되는 API입니다.
// getContext("2d") 메서드는 2D 컨텍스트를 가져온 후에는 다양한 메서드를 사용하여 캔버스 요소에 2D 그래픽을 그릴 수 있습니다.

// beginPath();  스타일을 적용할path를 재지정

// rect(); 함수의 코드
// ctx.moveTo(50, 50);    브러쉬의 시작위치
// ctx.lineTo(150, 50);   다음 브러쉬의 위치
// ctx.lineTo(150, 150);
// ctx.lineTo(50, 150);
// ctx.lineTo(50, 50);
// ctx.stroke();
// ctx.arc(250, 100, 50, 0, 2 * Math.PI); //(start x, start y, diameter, startangle, endangle)
