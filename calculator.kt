// Write your code here 
class Calculator(name: String) {
  init {
    println("The owner of the calculator is $name.")
  }
  
  fun add(num1: Int, num2: Int): Int {
    print("$num1 + $num2 = ")
    return num1 + num2
  }
  
  fun subtract(num1: Int, num2: Int): Int {
    print("$num1 - $num2 = ")
    return num1 - num2
  }
  
  fun multiply(num1: Int, num2: Int): Int {
    print("$num1 * $num2 = ")
    return num1 * num2
  }
  
  fun divide(num1: Int, num2: Int): Int {
    print("$num1 / $num2 = ")
    if (num2 == 0) {
      println("Error! You can't divide a number by 0.")
    }
    return num1 / num2
  }
  
  fun power(num1: Int, num2:Int): Int {
    print("$num1 ^ $num2 = ")
    var pow = 1
    if (num2 == 0) {
      pow = 1
    } else if (num2 > 1){
      for (i in 1..num2) {
      pow = pow * num1
      }
    } else {
      pow = num1
    }
    return pow
  }
}


fun main() {
  val first = Calculator("Codey")
  println(first.add(2, 3))
  println(first.subtract(2, 3))
  println(first.multiply(2, 3))
  println(first.divide(2, 3))
  println(first.power(2, 3))
}