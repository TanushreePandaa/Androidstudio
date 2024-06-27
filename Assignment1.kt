// 1. Print the pattern
fun main() {
    val rows = 11
    val n = rows / 2

    for (i in 0..n) {
        for (j in 0 until n - i) {
            print(" ")
        }
        for (k in 0 until 2 * i + 1) {
            print("*")
        }
        println()
    }

   
   for (i in n - 1 downTo 0) {
        for (j in 0 until n - i) {
            print(" ")
        }
        for (k in 0 until 2 * i + 1) {
            print("*")
        }
        println()
    }
}
//2.Check if a number is Armstrong number or not
fun main() {
    val n=153
    var num=n
    var q=0
    var t=0
    var s=0
    
    while(num!=0){
        t=num%10
        s=t*t*t
        q = q + s
        num=num/10
    }
    if(q == n){
    	println("$q is Armstrong number")    
    }
    else{
        println("$q is Not Armstrong number")
    }    
}
//3.	Find the GCD of two numbers using Euclidean method

fun main() {
    val num1 = 30
    val num2 = 20

    var a = num1
    var b = num2
    var temp: Int

    while (b != 0) {
        temp = b
        b = a % b
        a = temp
    }

    println("GCD of $num1 & $num2 is $a")
}

//4.	Find the frequency of letters in a string
fun main() {
    var str = "It is a rainy day"
    var letter = 'a'
    var freq = 0

    for (ch in str) {
        if (ch.toLowerCase() == letter) {
            freq++
        }
    }

    println("Frequency of $letter in $str is $freq")
}
//5.	Check if a number is duck number or not

fun main() {
    
    val num = 10980998
    var n=num
    var k=0
    
    while(n!=0){
        if(n % 10 == 0){
            println("$num is a duck number")
            k++
            break
        }
        n=n/10
    }
    if(k==0){
        println("$num is not a duck number")
    }
}
