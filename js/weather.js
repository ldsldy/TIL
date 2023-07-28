const API_KEY = "13e05212754a36dd917b40c481311fea";
const LANG = "kr";

function onGeoSuccess(position) {
  console.log(position);
  const lat = position.coords.latitude;
  const lng = position.coords.longitude;
  const url = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lng}8&appid=${API_KEY}&lang=${LANG}&units=metric`;
  fetch(url)
    .then((response) => response.json())
    .then((data) => {
      const weatherIcon = document.querySelector("#weather_icon img");
      const city = document.querySelector("#city");
      const temperature = document.querySelector("#temperature");

      weatherIcon.src = `https://openweathermap.org/img/wn/${data.weather[0].icon}@2x.png`;
      weatherIcon.alt = data.weather[0].main;
      city.innerText = data.name;
      temperature.innerText = data.main.temp;
    });
}

function onGeoError() {
  alert("Can't find you. No weather for you.");
}

navigator.geolocation.getCurrentPosition(onGeoSuccess, onGeoError);
