fun main() {
  val quizAnswer1 = 15
  var quizAnswer2 = 3
  val quizAnswer3 = "isosceles"
  val quizAnswer4 = 47

  // Write your code below

  // Question 1
  println("What is 75 / 5?")
  var studentAnswer1 = Integer.valueOf(readLine())

  //Question 2
  println("What is the value of y in the equation: 6 * 2y = 36?")
  var studentAnswer2 = Integer.valueOf(readLine())

  // Question 3
  println("Name the type of triangle that has two equal sides.")
  var studentAnswer3 = readLine()

  // Question 4
  println("What is the value of 8 * 6 - (3 - 2)?")
  var studentAnswer4 = Integer.valueOf(readLine())
 
  var points = 0

  // Grading Question 1
  if (studentAnswer1 == quizAnswer1) {
    points += 25
  }
  // Grading Question 2
  if (studentAnswer2 == quizAnswer2) {
    points += 25
  } else if (studentAnswer2 == (quizAnswer2 + 1) || studentAnswer2 == (quizAnswer2 - 1)) {
    points += 20
    println("The answer $studentAnswer2 is within 1 point of $quizAnswer2.")
  } else {
    points++
  }
  // Grading Question 3
  if (studentAnswer3 == quizAnswer3) {
    points += 25
  } else if (studentAnswer3 == "equilateral"){
    points += 10
  } else {
    points++
  }
  // Grading Question 4
  if (studentAnswer4 == quizAnswer4) {
    points += 25
  } else if (studentAnswer4 in 44..54) {
    points += 20
  } else {
    points++
  }

  // Student's Grade
  when (points) {
    in 0..59 -> println("F")
    in 60..69 -> println("D")
    in 70..79 -> println("C")
    in 80..89 -> println("B")
    in 90..99 -> println("A")
    in 100..110 -> println("A+")
	else -> println("Undefined")
  }
  /*
  if (points in 0..59) {
    println("F")
  } else if (points in 60..69) {
    println("D")
  } else if (points in 70..79) {
    println("C")
  } else if (points in 80..89) {
    println("B")
  } else if (points in 90..99) {
    println("A")
  } else if (points in 100..110) {
    println("A+")
  } else {
	println("Undefined")
  }
  */

}