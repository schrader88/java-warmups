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
console.log(secondLargest([1, 2, 3, 4, 5]));