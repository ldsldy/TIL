const images = ["0.jpg", "1.jpg", "2.jpg", "3.jpg"];
const body = document.querySelector("body");
const chosenImage = images[Math.floor(Math.random() * images.length)];

// // // img element 생성
// // const bgImage = document.createElement("img");

// // bgImage.src = `img/${chosenImage}`;

// // console.log(`img/${chosenImage}`);
// // // appendChild 부모의 자식으로 추가
// // document.body.appendChild(bgImage);

function callBackground() {
  url = `../img/${chosenImage}`;
  body.style.backgroundImage = `url(${url})`;
}

function init() {
  callBackground();
}

init();
