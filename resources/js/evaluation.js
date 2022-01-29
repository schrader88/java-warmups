function secondLargest(array) {
    let newArray = [];
    let largest = 0;

    for (let i = 0; i < array.length; i++) {
        if (array[i] > array[i + 1]) {
            largest = array[i];
            newArray.push(largest);
        }
    }

    if (newArray.length < 2) {
        return "Only one element in array."
    }

    return newArray[1];
}

// console.log(secondLargest([5, 5, 3, 4, 2]));
// console.log(secondLargest([1, 2, 3, 4, 5, 6, 7]));
// console.log(secondLargest([1, 2, 3, 4, 5]));

// Create a function that takes a number as an argument. Add up all the numbers from 1 to the number you passed to the function. For example, if the input is 4 then your function should return 10 because 1 + 2 + 3 + 4 = 10.

// addUp(4) ➞ 10
// addUp(13) ➞ 91
// addUp(600) ➞ 180300

function addUp(num) {
    let accumulator = 0;

    for (let i = 1; i <= num; i++) {
        accumulator += i;
        // console.log(i);
    }
    return accumulator;
}

// console.log(addUp(600));

// Create a function that takes a number (step) as an argument and returns the number of matchsticks in that step. See step 1, 2 and 3 in the image above.

function matchHouses(num) {
    let accumulator = 0;

    for (let i = 0; i < num; i++) {
        if (i === 0) {
            accumulator += 6;
        } else {
            accumulator += 5;
        }
    }
    return accumulator;
}

// console.log(matchHouses(87));

// Write a function that mimics (without the use of <<) the left shift operator and returns the result from the two given integers.

function shiftToLeft(num1, num2) {
    let secondNum = 2;

    for (let i = 1; i < num2; i++) {
        secondNum *= 2;
    }
    return num1 * secondNum;
}

// console.log(shiftToLeft(12, 4));

// Create a function that takes an array of numbers and return both the minimum and maximum numbers, in that order.

// FIND SOLUTION WITHOUT Math.max/Math.min

function minMax(numArray) {
    let largest = Math.max(...numArray);
    let smallest = Math.min(...numArray);
    // let largest = 0;
    // let smallest = 0;
    //
    // for (let i = 0; i < numArray.length; i++) {
    //    if (numArray[i] > numArray[i + 1]) {
    //        largest = numArray[i];
    //    } else if (numArray[i] < numArray[i + 1]) {
    //        smallest = numArray[i];
    //    }
    // }
    return [smallest, largest];
}

// console.log(minMax([5, 4, 3, 2, 1]));