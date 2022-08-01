fun main() {
  // Square Variables
  // sqSide defines the length of the square’s side
  // sqChar1 and sqChar2 each represent one column and are each 3 characters long to account for the space between rows
  val sqSide = 7
  val sqChar1 = "X  "
  val sqChar2 = "O  "
  // Write your code below
  for (i in 1..sqSide) {
    for (j in 1..sqSide) {
      if (i % 2 == 0 && j % 2 == 0) {
        print(sqChar1)
      } else if (i % 2 == 1 && j % 2 == 1) {
        print(sqChar1)
      } else {
        print(sqChar2)
      }
    }
    println()
  }

  // Triangle Variables
  val triRows = 10 // defines the triangle rows
  var triCount = 0 // counter for the inner while loop
  var triRowLen = triRows // keeps track of each row length
  val triChar1 = "/  "
  val triChar2 = "   "
  // Write your code below
  for (i in triRows downTo 1) {
    var triCount = 0
    while (triCount < triRowLen) {
      triCount++
      print(triChar1)
    }
    triRowLen--
    println()
  }

  // Second Triangle 
  triRowLen = triRows
  // Write your code below
  for (i in triRows downTo 1) {
    triCount = 0
    while (triCount < triRowLen) {
      triCount++
      if (triCount != 0 && triCount != triRowLen && i != triRows) {
        print(triChar2)
      } else {
        print(triChar1)
      }
    }
    triRowLen--
    println()
  }

}

/*
X  O  X  O  X  O  X  
O  X  O  X  O  X  O  
X  O  X  O  X  O  X  
O  X  O  X  O  X  O  
X  O  X  O  X  O  X  
O  X  O  X  O  X  O  
X  O  X  O  X  O  X  
/  /  /  /  /  /  /  /  /  /  
/  /  /  /  /  /  /  /  /  
/  /  /  /  /  /  /  /  
/  /  /  /  /  /  /  
/  /  /  /  /  /  
/  /  /  /  /  
/  /  /  /  
/  /  /  
/  /  
/  
/  /  /  /  /  /  /  /  /  /  
                        /  
                     /  
                  /  
               /  
            /  
         /  
      /  
   /  
/  
*/