const API_KEY = "13e05212754a36dd917b40c481311fea";
function onGeoSuccess(position) {
  console.log(position);
  const lat = position.coords.latitude;
  const lng = position.coords.longitude;
  console.log("you live in", lat, lng);
}

function onGeoError() {
  alert("Can't find you. No weather for you.");
}

navigator.geolocation.getCurrentPosition(onGeoSuccess, onGeoError);
