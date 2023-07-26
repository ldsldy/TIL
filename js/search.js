// ch-ua-form-factor=();
const form = document.querySelector("#search_form");

function onSearchSubmit(event) {
  event.preventDefault();
  let SearchContent = document.querySelector(".search_bar_input").value;
  let Google = `https://www.google.com/search?q=${SearchContent}`;
  window.open(Google, "_self");
}

function onLog() {
  console.log(SearchContent);
}
form.addEventListener("submit", onLog);

form.addEventListener("submit", onSearchSubmit);
