let count = 1;

function showNumbers() {

    console.log(count);

    count++;

    if(count > 10) {
        clearInterval(interval);
    }
}

let interval = setInterval(showNumbers, 1000);