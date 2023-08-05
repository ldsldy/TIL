const CheckBoxContainer = document.querySelector(".today_container_check");
const dotContainer = document.querySelector(".today_container_dot");

CheckBoxContainer.style.visibility = "hidden";
dotContainer.style.visibility = "hidden";

function visibleCheckBox() {
  CheckBoxContainer.style.visibility = "visible";
  dotContainer.style.visibility = "visible";
}
function hiddenCheckBox() {
  CheckBoxContainer.style.visibility = "hidden";
  dotContainer.style.visibility = "hidden";
}
todayContainer.addEventListener("mouseenter", visibleCheckBox);
todayContainer.addEventListener("mouseleave", hiddenCheckBox);
