package typings
package rcDashProgressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathString extends js.Object {
  var pathString: java.lang.String
  var strokePathStyle: js.Array[reactLib.reactMod.CSSProperties] | reactLib.reactMod.CSSProperties
  var trailPathStyle: js.Array[reactLib.reactMod.CSSProperties] | reactLib.reactMod.CSSProperties
}

object Anon_PathString {
  @scala.inline
  def apply(
    pathString: java.lang.String,
    strokePathStyle: js.Array[reactLib.reactMod.CSSProperties] | reactLib.reactMod.CSSProperties,
    trailPathStyle: js.Array[reactLib.reactMod.CSSProperties] | reactLib.reactMod.CSSProperties
  ): Anon_PathString = {
    val __obj = js.Dynamic.literal(pathString = pathString, strokePathStyle = strokePathStyle.asInstanceOf[js.Any], trailPathStyle = trailPathStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PathString]
  }
}

