const canvas = document.querySelector("canvas");
const modeBtn = document.getElementById("mode-btn");
const destroyBtn = document.getElementById("destroy-btn");
const eraserBtn = document.getElementById("eraser-btn");
const lineWidth = document.getElementById("line-width");
const colorOptions = Array.from(
  //color-option 클래스는 여러개가 배열로 들어오므로 배열로 바꾸어 받아준다.
  document.getElementsByClassName("color-option")
);
const color = document.getElementById("color");
const ctx = canvas.getContext("2d");

const CANVAS_WIDTH = 800;
const CANVAS_HEIGHT = 800;

canvas.width = 800;
canvas.height = 800;
ctx.lineWidth = lineWidth.value;
let isPainting = false;
let isFilling = false;

function onMove(event) {
  if (isPainting) {
    ctx.lineTo(event.offsetX, event.offsetY);
    ctx.stroke();
    return;
  }
  ctx.moveTo(event.offsetX, event.offsetY);
}
function onMouseDown() {
  isPainting = true;
}
function cancelPainting() {
  isPainting = false;
  ctx.beginPath();
}
function onLineWidthChange(event) {
  ctx.lineWidth = event.target.value;
}
function onColorChange(event) {
  ctx.strokeStyle = event.target.value;
  ctx.fillStyle = event.target.value;
}
function onColorClick(event) {
  const colorValue = event.target.dataset.color; //html의 data-를 통해서 값을 읽는 방법 dataset안에 data-"name"의 name에 정보가 저장된다.
  ctx.strokeStyle = colorValue;
  ctx.fillStyle = colorValue;
  color.value = colorValue;
}
function onModeClick() {
  if (isFilling) {
    isFilling = false;
    modeBtn.innerText = "Fill";
  } else {
    isFilling = true;
    modeBtn.innerText = "Draw";
  }
}
function onCanvasPainting() {
  if (isFilling) {
    ctx.fillRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
  }
}
function onDestroyClick() {
  ctx.fillStyle = "white";
  ctx.fillRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);
}
function onEraserClick() {
  ctx.strokeStyle = "white";
  isFilling = "false";
  modeBtn.innerText = "Fill";
}

canvas.addEventListener("mousemove", onMove);
canvas.addEventListener("mousedown", onMouseDown);
canvas.addEventListener("mouseup", cancelPainting);
canvas.addEventListener("mouseleave", cancelPainting);
canvas.addEventListener("click", onCanvasPainting);

lineWidth.addEventListener("change", onLineWidthChange);
color.addEventListener("change", onColorChange);

colorOptions.forEach((color) => color.addEventListener("click", onColorClick));

modeBtn.addEventListener("click", onModeClick);
destroyBtn.addEventListener("click", onDestroyClick);
eraserBtn.addEventListener("click", onEraserClick);

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
//   ctx.strokeStyle = color;
