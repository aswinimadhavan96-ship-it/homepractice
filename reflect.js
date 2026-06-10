const product = {
    name: "Laptop",
    price: 50000
};

console.log("Reading price...");
let price = Reflect.get(product, "price");
console.log("Price:", price);

console.log("Updating price...");
Reflect.set(product, "price", 55000);

console.log("Reading updated price...");
console.log("Price:", Reflect.get(product, "price"));