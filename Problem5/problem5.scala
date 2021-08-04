package Problem5

object problem5 extends App {

  def isEven(n:Int):Boolean=n match{
    case 0 => true
    case _ => isOdd(n-1)
  }

  def isOdd(n:Int):Boolean= !(isEven(n))

  def evenSum(n:Int,i:Int=0,sum:Int=0):Int=i match{
    case x if (x==n) => sum
    case x if ((x<n) && (isOdd(i))) => evenSum(n,i+1,sum)
    case x if ((x<n) && (isEven(i))) => evenSum(n,i+1,sum+i)
  }

  println(evenSum(5))

}
