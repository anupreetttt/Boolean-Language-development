object mutableMaps

 val maps = collection.mutable.Map("Samruddhi" -> 12, "Anupreet" -> 26)

val colors = collection.mutable.Map("red" -> "#FF0000", "azure" -> "#F0FFFF","peru" -> "#CD853F")

  @main def runMutableMap =
  println("working")

  println(maps("Samruddhi"))

  colors("red") = "123"
  colors.values.foreach {i =>
    println("Values = " + i)
  }