// Write your code below
fun getPrice(price: Double, couponCode: String = "None") {
  var finalPrice: Double
  if (couponCode == "save15") {
    finalPrice = price * .85
  } else {
    finalPrice = price
  }
  println("The total price is $finalPrice.")
}

// Write your code below
fun pyramidVolume(l: Int, w: Int, h: Int) = (l * w * h) / 3


fun main() {
  // Write more code below
  getPrice(price = 48.0, couponCode = "save15")

  var length = 5
  var width = 8
  var height = 14
  
  // Write more code below
  var volume = pyramidVolume(length, width, height)
  println("The volume of this pyramid is $volume.")
  

  // Write your code below
  var area = fun(base: Int, height: Int): Int {
    return (base * height) / 2
  }
  println(area(15, 19))

  var perimeter = {side1: Int, side2: Int -> (side1 + side2) * 2}
  println(perimeter(15, 24))
  
}