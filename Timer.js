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