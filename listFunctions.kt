// Write your code below
fun getListOfNumbers(): List<Int> {
  var myList: List<Int> = mutableListOf()
  for (i in 1..7) {
    println("Enter a number")
    myList += (Integer.valueOf(readLine()))
  }
  return myList
}

fun findMax(myList: List<Int>): Int {
  var largestNumber = myList[0]
  for (i in myList) {
    if (i > largestNumber) {
      largestNumber = i
    }
  }
  return largestNumber
}

fun findMin(myList: List<Int>): Int {
  var smallestNumber = myList[0]
  for (i in myList) {
    if (i < smallestNumber) {
      smallestNumber = i
    }
  }
  return smallestNumber
}

fun findAverage(myList: List<Int>): Int {
  var sum = 0
  for (i in myList) {
    sum += i
  }
  return sum / myList.size
}

fun checkIfListContains(myList: List<Int>, value: Int): Boolean {
  for (i in myList) {
    if (i == value) {
      return true
    }
  }
  return false
}

fun diffLargSmal(l: Int, s:Int): Int = l - s

fun sqrList(myList: List<Int>): List<Int> {
  var sqrNum: List<Int> = mutableListOf()
  for (i in myList) {
    sqrNum += i * i
  }
  return sqrNum
}

fun main() {
  // Write more code below
  var values = getListOfNumbers()
  println(values)

  var largestValue = findMax(values)
  println("The largest number is $largestValue.")

  var smallestValue = findMin(values)
  println("The smallest number is $smallestValue.")

  var diff = diffLargSmal(largestValue, smallestValue)
  println("The difference between the largest and smallest numbers in the list is $diff.")

  var average = findAverage(values)
  println("The average is $average.")

  var sqrListedNums = sqrList(values)
  println("Here's the list with all the values squared: \n$sqrListedNums")

  println("Enter a number to check if it's on the list:")
  var numToFind = Integer.valueOf(readLine())
  var containsValue = checkIfListContains(values, numToFind)
  if (containsValue == true) {
    println("The entered number is on the list.")
  } else {
    println("The value does not exist within the list.")
  }
}

/*
Enter a number
51
Enter a number
54
Enter a number
77
Enter a number
79
Enter a number
82
Enter a number
85
Enter a number
93
[51, 54, 77, 79, 82, 85, 93]
The largest number is 93.
The smallest number is 51.
The difference between the largest and smallest numbers in the list is 42.
The average is 74.
Here's the list with all the values squared:
[2601, 2916, 5929, 6241, 6724, 7225, 8649]
Enter a number to check if it's on the list:
77
The entered number is on the list.
*/