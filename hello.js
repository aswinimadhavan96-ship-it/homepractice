function sayHello() {
    console.log("Hello World");
}

setInterval(sayHello, 5);

let count = 1;

function showNumbers() {

    console.log(count);

    count++;

    if(count > 10) {
        clearInterval(interval);
    }
}

let interval = setInterval(showNumbers, 10);

function showTime() {

    let currentTime = new Date();

    console.log(currentTime.toLocaleTimeString());
}

setInterval(showTime, 1000);


let even = 2;

function showEven() {

    console.log(even);

    even += 2;
}

setInterval(showEven, 2000);
let countdown = 10;

function timer() {

    console.log(countdown);

    countdown--;

    if(countdown < 0) {

        console.log("Countdown Finished");

        clearInterval(interval);
    }
}

let interval = setInterval(timer, 1000);