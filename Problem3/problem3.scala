package Problem3

object problem3 extends App {
  def sum(n:Int):Int=
    if(n==0)  0
    else n+sum(n-1)
  println(sum(5))
}
