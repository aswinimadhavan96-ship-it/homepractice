const name = "Aswini";
const phone = "9876543210";
let firstPart = name.slice(0, 3);

let lastPart = phone.slice(-2);

let username = (firstPart + lastPart).toLowerCase();

console.log("Username: " + username);