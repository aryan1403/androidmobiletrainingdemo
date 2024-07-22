/* console.log("Hello world"); // println
let a = 5;
let b = 7;
let arr = [5, 6, 7, 4, 0];

var v = "Aaryan"; // TODO: diff between let and var

if(a > b){
    console.log();
} else if(a < b) {
    console.log();
} else {
    console.log();
}

function work(a, b, c) {
    return a + b + c;
}

console.log(a + b); */
// console.log(work(2, 3, 4));
// ES6
// 1. String Interpolation

let a  = "Aaryan"
let b = "Amit"
let c = "Akshay"

console.log(a + ", " + b + ", " + c)
console.log(`Name1: ${a}, Name2: ${b}, Name3: ${c}`)

// 2. Arrow func
var x = function(x, y) {
    return x + y;
}

var y = (x, y) => x * y;

// console.log(y(5, 5))

// 3. Object Destructing

// Note: const --> final (Java)
const person = {
    name: "Aaryan",
    age: 45,
    eyeColor: "green"
}

// console.log(person.age)
const {name, age} = person;
// console.log(name, age)

// 4. Array Destructing
const cars = ["BMW M3", "RR Cullinan", "Tourbillion", "Lexus LC500"];

let [bmw, rr, ...sportcar] = cars;
console.log(bmw, rr, sportcar)

let cars2 = [...cars, "Fortuner"];
console.log(cars2)


// Promise

/* const myPromise = new Promise((resolve, reject) => {
    //code
    resolve();
})

myPromise.then(
    () => console.log("Successfull"),
    () => console.log("Error")); */

async function getData() {
    const url = "https://jsonplaceholder.typicode.com/todos";
    fetch(url).then(res => res.json())
        .then(data => {
            data.forEach(todo => {
                console.log(`Title: ${todo.title}, Completed: ${todo.completed}`)
            });
        })
        .catch(err => console.log(err));
}

getData()

