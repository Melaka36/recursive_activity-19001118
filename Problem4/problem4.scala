package Problem4

object problem4 extends App{
    def isEven(n:Int):Boolean=n match{
      case 0 => true
      case _ => isOdd(n-1)
    }

    def isOdd(n:Int):Boolean= !(isEven(n))
    println(isEven(2), isEven(3))
    println(isOdd(2), isOdd(3))

}
