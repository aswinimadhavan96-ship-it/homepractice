const user = {
    firstName: "Aswini",
    lastName: "Maadhavan",
    email: "aswini@gmail.com"
};

let fullName = user.firstName + " " + user.lastName;
let upperName = "";

for (let i = 0; i < fullName.length; i++) {

    let ch = fullName[i];

    if (ch >= 'a' && ch <= 'z') {
        upperName = upperName + String.fromCharCode(ch.charCodeAt(0) - 32);
    } else {
        upperName = upperName + ch;
    }
}

let domain = "";
let found = false;

for (let i = 0; i < user.email.length; i++) {

    if (user.email[i] == '@') {
        found = true;
    }
    else if (found) {
        domain = domain + user.email[i];
    }
}

console.log("Full Name: " + upperName);
console.log("Email: " + user.email);
console.log("Domain: " + domain);