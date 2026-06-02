const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter a number: ", (num) => {

    num = Number(num);

    let checkNumber = new Promise((resolve, reject) => {

        setTimeout(() => {

            if (num % 2 === 0) {
                resolve("Success - Number is Even");
            } else {
                reject("Fail - Number is Odd");
            }

        }, 2000);

    });

    checkNumber
        .then((result) => {
            console.log(result);
        })
        .catch((error) => {
            console.log(error);
        })
        .finally(() => {
            rl.close();
        });

});