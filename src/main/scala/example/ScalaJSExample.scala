package example
import scala.scalajs.js.annotation.{JSGlobalScope, JSName}
import scala.scalajs.js
import scala.scalajs.js.JSApp
/*
@js.native
@JSName("myFun")
object MyFun extends js.Object {
  val name:String=js.native
  def square(x:Int):Int = js.native
}
*/

@js.native
@JSGlobalScope
object DOMGlobalScope extends js.Object {
  def square(x:Int):Int=js.native
}

@js.native
@JSName("Apple")
class apple(t:String) extends js.Object {
  val types:String=js.native
  val color:String=js.native
  def getInfo():String = js.native
}

object ScalaJSExample extends JSApp{
  def main(): Unit ={
    //Simple function
   /* println( MyFun.name )
     println( MyFun.square(4) )
*/
    println( DOMGlobalScope.square(4) )
    //apple class
    val apple_obj=new apple("fruit")
    println(apple_obj.color)
    println(apple_obj.getInfo())
  }
}


