fun main() {
  // Write your code below 🏞
  val responsibilities = listOf("feed the chimps", "play a random game", "conduct a health check on Foxie")
  var responsibilitiesComplete = 0
  var timeSpent = 0
  val totalShiftTime = 4

  var foxiesHealthCheck = mutableMapOf<String,Any?>()
  var chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

  println("First, ${responsibilities[0]}.\n")
  println("Feeding Bonnie....")
  chimpsHaveEaten["Bonnie"] = true
  println("Feeding Jubilee....")
  chimpsHaveEaten["Jubilee"] = true
  println("Feeding Frodo....")
  chimpsHaveEaten["Frodo"] = true
  println("Feeding Foxie....\n")
  chimpsHaveEaten["Foxie"] = true

  timeSpent += 1
  responsibilitiesComplete++
  println("All chimps have now been fed! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.\n\n")

  println("Next, ${responsibilities[1]}.\n")
  val games = setOf("tug-of-war with a blanket", "catch and throw", "number game")
  var randomGame = games.random()
  println("We'll be playing the $randomGame.\n")

  timeSpent += 1
  responsibilitiesComplete++
  println("Each chimp has now played a game of $randomGame! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.\n\n")

  println("Next, ${responsibilities[2]}.\n")
  foxiesHealthCheck.put("temperature", 33.7)
  foxiesHealthCheck.put("mood", "happy")
  println("Foxie has a temperature of ${foxiesHealthCheck["temperature"]} and is feeling ${foxiesHealthCheck["mood"]}.")

  timeSpent += 1
  responsibilitiesComplete++
  println("You've now completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.\n\n")

  if ((timeSpent <= totalShiftTime) && (responsibilitiesComplete == responsibilities.size)) {
    println("Great job of completing the responsibilities on time!")
  } else if ((timeSpent >= totalShiftTime) && (responsibilitiesComplete == responsibilities.size)) {
    println("All responsibilities were complete but with overtime...")
  } else {
    println("All of the responsibilities were not complete and took extra time.")
  }


}