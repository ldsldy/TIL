const LinkUnderLine = document.querySelector("underline");
const SearchBox = document.querySelector("#search_bar");

function drawLinkUnderLine() {
  LinkUnderLine.opacity = 0.6;
}
function hideLinkUnderLine() {
  LinkUnderLine.opacity = 0;
}
SearchBox.addEventListener("mouseover", drawLinkUnderLine);
SearchBox.addEventListener("mouseleave", hideLinkUnderLine);
