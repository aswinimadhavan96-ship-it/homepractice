function showTime() {

    let currentTime = new Date();

    console.log(currentTime.toLocaleTimeString());
}

setInterval(showTime, 10;