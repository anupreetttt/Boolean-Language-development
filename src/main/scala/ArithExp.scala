package scala


object ArithExp:
  class C
  enum ArithmeticExpression extends C:
    case Value(v:Int)
    case Variables(name:String)
    case Add(o1: ArithmeticExpression | Int, o2: ArithmeticExpression)
    case Mult(o1: ArithmeticExpression, o2: ArithmeticExpression)
    case Scope(name: String, expressions: List[ArithmeticExpression])

    val EnvironmentTable: Map[String, ArithmeticExpression | Int] = Map("Karan" -> 1, "Xiao"->2)

    def eval: Int = this match
      case Variables(name) => EnvironmentTable.getOrElse(name, throw new Exception(name)) match
        case v: ArithmeticExpression => v.eval
        case v: Int => v
      case Value(x) => x
      case Add(o1, o2) => o1 match
        case v: ArithmeticExpression => v.eval
        case v: Int => v
          + o2.eval
      case Mult(o1, o2) => o1.eval * o2.eval
  @main def runArithExp =
    import ArithmeticExpression.*
    //    Scope("o1", List(Scope("o2", Scope("o3"), Add(Value(1), Value(2)))))
    //    Add(Add(Add(...)))
    println(Add(Add(1, Variables("Karan")), Add(Value(1), Value(2))).eval)