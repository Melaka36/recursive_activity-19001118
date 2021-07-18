package Problem5

object problem5 extends App {

  def isEven(n:Int):Boolean=n match{
    case 0 => true
    case _ => isOdd(n-1)
  }

  def isOdd(n:Int):Boolean= !(isEven(n))

  def evenSum(n:Int, sum:Int=0):Int={
    if(n==0)sum
    else  if (isEven(n)) evenSum(n-1,sum+n)
    else evenSum(n-1,sum)

  }

  println(evenSum(5))

}
