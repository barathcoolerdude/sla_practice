function sum_of_digit(n){
    if(n < 10){
        return n;
    }
    sum = 0
    while(n != 0){
        console.log(`sum: ${sum} n: ${n}`)
        sum += n % 10;
        n = Math.floor(n / 10);
    }
    return sum_of_digit(sum)
}
let n = 546
let result = sum_of_digit(n);
console.log(`sum of digits of is ${result}`)
