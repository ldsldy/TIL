// ch-ua-form-factor=();
const form = document.querySelector("#search_bar");
const SearchContent = document.querySelector("#search_bar input");

function onSearchSubmit(event) {
  event.preventDefault();
  let Google = `https://www.google.com/search?q=${SearchContent.value}`;
  window.open(Google, "_self");
}

form.addEventListener("submit", onSearchSubmit);
