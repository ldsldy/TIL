//변수
// const a=5;
// let a=6;

// 배열
// const player = ["lee", 1111, true, "little bit"];
// player.push("let");

//객체 생성
// const player = {
//   name: "lee",
//   points: 10,
//   fat: true,
// };
// console.log(player);
// player.name = "deuk";
// player.lastName = "lee";
// console.log(player);

// 함수
// function sayHello(nameOfGuest, age) {
//   console.log("Hello " + nameOfGuest + "! " + age);
// }
// sayHello("Lee", 24);
// sayHello("Deuk", 19);

// function plus(firstNumber, secondNumber) {
//   console.log(firstNumber + secondNumber);
// }
// plus(8, 60);

// const player = {
//   name: "Lee",
//   sayHello: function (otherPersonsName) {
//     console.log("hello " + otherPersonsName);
//   },
// };
// player.sayHello("lee");

// const calculator = {
//   expon: function (firstNumber, secondNumber) {
//     console.log(firstNumber ** secondNumber);
//   },
// };
// calculator.expon(2, 2);

//***return
// const age = 96;
// function calculateKrAge(ageOfForeigner) {
//   return ageOfForeigner + 2;
// }

// const krAge = calculateKrAge(age);
// console.log(krAge);

//****if, prompt, typeof, parseInt(스트링=>인트)
//isNaN() : boolean 형22
// const age = parseInt(prompt("How old are you?"));
// console.log(isNaN(age));

// if (isNaN(age) || age < 0) {
//   console.log("please write a real positive number");
// } else if (age < 18) {
//   console.log("you are too young.");
// } else if (age >= 18 && age <= 50) {
//   console.log("thanks you for your visit.");
// } else if (age > 50 && age <= 80) {
//   console.log("you should exercise.");
// } else if (age > 80) {
//   console.log("you ar too old.");
// }

// // ******document.getElementById();
// const title = document.getElementById("title");
// // title의 오브젝트 보기
// console.dir(title);
// // 텍스트 변경
// title.innerText = "Got you!";
// console.log(title.id);
// console.log(title.className);

// *********document.getElementByClassName();
// const hellos = document.getElementsByClassName("hello");
// console.log(hellos);
// // ***document.getElementsByTagName("h1");  태그명으로 가져오기
// const title = document.getElementsByTagName("h1");
// console.log(title);
// // **const title2=document.querySelector("h1");
// // **const title2=document.querySelector("#idName");
// // **best!! css방식으로 엘레멘트 검색
// const title2 = document.querySelector(".hello h1");
// console.log(title2);
// const title3 = document.querySelectorAll(".hello h1");
// console.log(title3);

// const h1 = document.querySelector("div.hello:first-child h1");
// // console.log(h1);

// // ****event
// function handleTitleClick() {
//   const currentColor = h1.style.color;
//   let newColor;
//   if (currentColor === "blue") {
//     newColor = "tomato";
//   } else {
//     newColor = "blue";
//   }
//   h1.style.color = newColor;
// }

// function handleMouseEnter() {
//   h1.innerText = "Mouse is here!";
// }

// function handleMouseLeave() {
//   h1.innerText = "Mouse is gone!";
// }

// function handleWindowResize() {
//   document.body.style.backgroundColor = "tomato";
// }

// function handleWindowCopy() {
//   alert("copy");
// }

// function handleWindowOffline() {
//   alert("SOS no WIFI");
// }

// function handleWindowOnline() {
//   alert("ALL GONE");
// }
// ***addEventListener =>이벤트 발생시에 함수 실행
// ****onevent로 대체가능
// h1.addEventListener("click", handleTitleClick);
// h1.onclick = handleTitleClick;
// h1.addEventListener("mouseenter", handleMouseEnter);
// // h1.onmouseenter = handleMouseEnter;
// h1.addEventListener("mouseleave", handleMouseLeave);

// window.addEventListener("resize", handleWindowResize);
// window.addEventListener("copy", handleWindowCopy);
// window.addEventListener("offline", handleWindowOffline);
// window.addEventListener("online", handleWindowOnline);

// *****JS,CSS,HTML=>html을 통하여 js, css 컨트롤하기
// classList=> classList.contains():클래스 포함 여부
// classlist.add(): 클래스를 포함 시킴
// classlist.toggle: 클래스 리스트를 확인 후 있으면 제거 없으면 추가
const h1 = document.querySelector("div.hello:first-child h1");

function handleMouseClick() {
  //   const clickedClass = "clicked";
  //   if (h1.classList.contains(clickedClass)) {
  //     h1.classList.remove(clickedClass);
  //   } else {
  //     h1.classList.add(clickedClass);
  //   } ==>
  h1.classList.toggle("clicked");
  console.log(h1.className);
}

h1.addEventListener("click", handleMouseClick);
