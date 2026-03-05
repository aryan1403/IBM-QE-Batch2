console.log('Hello, world!');
let a = 5;
var b = 10;
console.log('Sum of a and b is ' + (a + b));
// Template literals
console.log(`Sub of a and b is ${a - b}`);
console.log(`Product of a and b is ${a * b}`);
console.log(`Division of a and b is ${a / b}`);

/*if(a > b) {
    console.log('a is greater than b');
} else if(a < b) {
    console.log('a is less than b');
} else {
    console.log('a is equal to b');
}

for(let i = 0; i < 5; i++) {
    console.log('Value of i is ' + i);
}

let j = 0;
while(j < 5) {
    console.log('Value of j is ' + j);
    j++;
}

let k = 6;
do {
    console.log('Value of k is ' + k);
    k++;
} while(k < 5);

function add(x, y=10) {
    return x + y;
}*/

// console.log(`Sum of 3 and 4 is ${add(3)}`);
let arrw = () => console.log('This is an arrow function');
// arrw();

const timeoutId = setTimeout(() => console.log('This is a delayed message'), 2000);
console.log('This message is shown immediately');
const intervalId = setInterval(() => console.log('This is a repeated message'), 5000);
clearTimeout(timeoutId);
clearInterval(intervalId);


// for (let i = 0; i < arr.length; i++) {
    //     const element = arr[i];
    //     console.log(element);
    // }
    
    // for(const element of arr) {
        //     console.log(element);
        // }
        
        // arr.forEach(e => console.log(e));
        // arr.filter(e => e % 2 === 0).forEach(e => console.log('Even number: ' + e));
        // arr.map(e => e * 2).forEach(e => console.log('Doubled value: ' + e));
        // arr.sort().forEach(e => console.log('Sorted value: ' + e));
        
        // [x, y, z, ...abc] = arr;
        // console.log(x, y, z, ...abc);
        
        // let arr2 = [23, 45, 67];
        // arr2 = [...arr2, ...arr];
        // console.log(arr2);
        
        // let vs var
        // let -> block scoped
        // var -> function scoped
        
        // for (var i = 0; i < arr.length; i++) {
            //     console.log(arr[i])
            // }
            // console.log(i);
            
            
// let arr = [1, 2, 3, 4, 5, -1];

// [firstElement, secondElement, ...restElements] = arr;
// console.log(firstElement, secondElement, restElements);

// function sum(...num) {
//     let sum = 0;
//     num.forEach(e => sum += e);
//     return sum;
// }
// console.log(sum(1, 2, 5, -1, 9, 0, 9))

let c = {
    name: "Aaryan",
    role: "Trainer",
    exp: 9,
}
let c1 = {
    name: "Arush",
    role: "Dev",
    exp: 2,
    dept: "TechX"
}
// c1.name = "Aryan"

// console.log(c1)
console.log({...c, ...c1})

