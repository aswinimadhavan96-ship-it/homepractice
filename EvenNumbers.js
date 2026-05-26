let even = 2;

function showEven() {

    console.log(even);

    even += 2;
}

setInterval(showEven, 5);