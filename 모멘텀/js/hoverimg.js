const LinkUnderLine = document.querySelector(".link_underline");
const SearchBox = document.querySelector("#search_form");
const InputBox = document.querySelector(".search_bar_input");

let isFocused = false;

// 인풋박스가 포커스 상태면 현상유지
// 아니면 언더라인을 보여줌
function drawLinkUnderLine() {
  if (isFocused === true) {
  } else {
    LinkUnderLine.style.opacity = 0.6;
  }
}

// 인풋박스가 포커스 상태면 현상유지
// 아니면 언더라인을 제거
function hideLinkUnderLine() {
  if (isFocused === true) {
  } else {
    LinkUnderLine.style.opacity = 0;
  }
}

InputBox.onfocus = function () {
  LinkUnderLine.style.opacity = 1;
  isFocused = true;
};

InputBox.onblur = function () {
  isFocused = false;
  LinkUnderLine.style.opacity = 0;
};

SearchBox.addEventListener("mouseenter", drawLinkUnderLine);
SearchBox.addEventListener("mouseleave", hideLinkUnderLine);
