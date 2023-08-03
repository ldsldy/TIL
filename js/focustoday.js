const focusTodayForm = document.querySelector(".focus_today");
const focusTodayInput = document.querySelector(".focus_today_input");
const focusTodayText = document.querySelector(".today_list");
const todayContainer = document.querySelector(".today_container");

const FOCUSTODAY_KEY = "focustoday";

let focusToday = [];

function saveFocusToday() {
  localStorage.setItem(FOCUSTODAY_KEY, JSON.stringify(focusToday));
}

function paintFocusToday(newFocusTodayObj) {
  focusTodayText.innerText = newFocusTodayObj.text;
  focusTodayForm.style.visibility = "hidden";
  todayContainer.style.visibility = "visible";
}

function handleFocusTodaySubmit(event) {
  event.preventDefault();
  const newFocusToday = focusTodayInput.value;
  focusTodayInput.value = "";
  const newFocusTodayObj = {
    text: newFocusToday,
    id: Date.now(),
  };
  focusToday.push(newFocusTodayObj);
  paintFocusToday(newFocusTodayObj);
  saveFocusToday();
}

focusTodayForm.addEventListener("submit", handleFocusTodaySubmit);

const savedFocusToday = localStorage.getItem(FOCUSTODAY_KEY);
if (savedFocusToday !== null) {
  const parsedFocusToday = JSON.parse(savedFocusToday);
  focusToday = parsedFocusToday;
  parsedFocusToday.forEach(paintFocusToday);
}
