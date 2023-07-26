const LinkUnderLine = document.querySelector(".underline");
const SearchBox = document.querySelector("#search_form");
const InputBox = document.querySelector(".search_bar_input");

function drawLinkUnderLine() {
  LinkUnderLine.style.opacity = 0.6;
}

function hideLinkUnderLine() {
  LinkUnderLine.style.opacity = 0;
}

// SearchBox.addEventListener("mouseover", drawLinkUnderLine);
// SearchBox.addEventListener("mouseleave", hideLinkUnderLine);

InputBox.onfocus = function () {
  console.log("focused on input");
  console.log(InputBox.className);
  console.log(document.activeElement.className);
  LinkUnderLine.style.opacity = 1;
};

InputBox.onblur = function () {
  console.log("focused out input");
  LinkUnderLine.style.opacity = 0;
};

if (document.activeElement.className != InputBox.className) {
  console.log(InputBox.className);
  console.log(document.activeElement.className);
  SearchBox.addEventListener("mouseover", drawLinkUnderLine);
  SearchBox.addEventListener("mouseleave", hideLinkUnderLine);
}
