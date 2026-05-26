const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const add = (a, b) => a + b;

const multiply = (a, b) => a * b;

function showMenu() {

    console.log("\n===== MENU =====");
    console.log("1. Add Two Numbers");
    console.log("2. Check Even or Odd");
    console.log("3. Multiply Two Numbers and Check Result");
    console.log("4. Exit");

    rl.question("Enter your choice: ", function(choice) {

        choice = Number(choice);

        switch(choice) {

            case 1:

                rl.question("Enter first number: ", function(a) {

                    rl.question("Enter second number: ", function(b) {

                        let sum = add(Number(a), Number(b));

                        console.log("Sum is:", sum);

                        showMenu();
                    });
                });

                break;

            case 2:

                rl.question("Enter a number: ", function(num) {

                    let checkEvenOdd = function(n) {

                        if(n % 2 === 0) {
                            console.log(n + " is Even");
                        } else {
                            console.log(n + " is Odd");
                        }
                    };

                    checkEvenOdd(Number(num));

                    showMenu();
                });

                break;

            case 3:

                rl.question("Enter first number: ", function(a) {

                    rl.question("Enter second number: ", function(b) {

                        let result = multiply(Number(a), Number(b));

                        console.log("Multiplication Result:", result);

                        (function(res) {

                            if(res > 100) {
                                console.log("Result is greater than 100");
                            } else {
                                console.log("Result is NOT greater than 100");
                            }

                        })(result);

                        showMenu();
                    });
                });

                break;

            case 4:

                console.log("Program Exited");
                rl.close();
                break;

            default:

                console.log("Invalid Choice");
                showMenu();
        }
    });
}

showMenu();