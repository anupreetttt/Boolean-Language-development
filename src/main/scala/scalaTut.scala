import java.security.Principal

object scalaTut {

//  val number = 3
//  val digit: 3 = 3
//
//  def passNum(n: Int) = println(n)
//
//  passNum(1234)
//  passNum(digit)
//
//  def passStrict(n: 3) = println(n)
//
//  passStrict(digit)
//  passStrict(3)

  def orMethod(num: String | Int) = num match
    case _: String => println(s"This is a string $num")
    case _: Int => println(s"We received an Int thats why this was called $num")

    orMethod("Chocolate")

  @main def runScala =

    println("working")

}