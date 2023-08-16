const canvas = document.querySelector("canvas");
const ctx = canvas.getContext("2d");
canvas.width = 800;
canvas.height = 800;

ctx.fillStyle = "red";
ctx.fillRect(50, 50, 100, 200); //(시작 위치, 크기)

// getContext("2d")는 HTML5 Canvas 요소에 2D 컨텍스트를 가져오는 데 사용되는 메서드입니다.
// 2D 컨텍스트는 캔버스 요소에 2D 그래픽을 그리는 데 사용되는 API입니다.
// getContext("2d") 메서드는 2D 컨텍스트를 가져온 후에는 다양한 메서드를 사용하여 캔버스 요소에 2D 그래픽을 그릴 수 있습니다.
