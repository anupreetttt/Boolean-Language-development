package scala

import scala.boolLang.assignMap

object boolLang :

  // write a function for assigning logic gat eto the map
  val assignMap : collection.mutable.Map[String, Boolean] = collection.mutable.Map()


  enum boolAlgebra:
    case Assign(value: String, boolAlgebra: boolAlgebra)
    case Scope(value: String, value2: Boolean)
    case TestGate(value: String, value2: Boolean)
    case LogicGate(value: String)


    case Value(v: Boolean)
    case NOT(num1: boolAlgebra)
    case AND(num1: boolAlgebra, num2: boolAlgebra)
    case OR(num1: boolAlgebra, num2: boolAlgebra)
    case XOR(num1: boolAlgebra, num2: boolAlgebra)
    case NAND(num11: boolAlgebra, num2: boolAlgebra)
    case NOR(num1: boolAlgebra, num2: boolAlgebra)
    case XNOR(num1: boolAlgebra, num2: boolAlgebra)



    def eval: Boolean = this match
      case LogicGate(value) => assignMap(value)
      case Value(x) => x
      case NOT(num1) => !(num1.eval)
      case AND(num1, num2)=> num1.eval && num2.eval
      case OR(o1, o2) => o1.eval || o2.eval
      case XOR(o1, o2) => (o1.eval || o2.eval) && (!(o1.eval) || !(o2.eval))
      case NAND(o1, o2) => !(o1.eval || o2.eval)
      case NOR(o1, o2) => !(o1.eval || o2.eval)
      case OR(o1, o2) => (o1.eval || o2.eval) || (!(o1.eval) && !(o2.eval))
      case XOR(o1, o2) => (o1.eval && o2.eval) || (!(o1.eval) && !(o2.eval))

  @main def runBool =
    import boolAlgebra.*
    println(NOT(Value(false)).eval)
    println(AND(Value(true), Value(false)).eval)
