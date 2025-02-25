package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMPoint extends DOMPointReadOnly

@JSGlobal("DOMPoint")
@js.native
class DOMPointCls () extends DOMPoint {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
}

@JSGlobal("DOMPoint")
@js.native
object DOMPoint
  extends org.scalablytyped.runtime.Instantiable0[DOMPoint]
     with org.scalablytyped.runtime.Instantiable1[/* x */ scala.Double, DOMPoint]
     with org.scalablytyped.runtime.Instantiable2[/* x */ scala.Double, /* y */ scala.Double, DOMPoint]
     with org.scalablytyped.runtime.Instantiable3[/* x */ scala.Double, /* y */ scala.Double, /* z */ scala.Double, DOMPoint]
     with org.scalablytyped.runtime.Instantiable4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* z */ scala.Double, 
      /* w */ scala.Double, 
      DOMPoint
    ] {
  def fromPoint(): stdLib.DOMPoint = js.native
  def fromPoint(other: stdLib.DOMPointInit): stdLib.DOMPoint = js.native
}

