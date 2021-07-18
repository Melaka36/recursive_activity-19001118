package Problem6

object problems6 extends App{

  def fibonacci(n:Int):Int={
    if (n<=2)1
    else fibonacci(n-1) +fibonacci(n-2)
  }

  def printFib(n:Int):Any={
    if(n>0)printFib(n-1)
    println(fibonacci(n))

  }
  printFib(10)
}
