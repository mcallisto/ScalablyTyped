package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCollection extends HTMLCollectionBase {
  /**
    * Retrieves a select object or an object from an options collection.
    */
  def namedItem(name: java.lang.String): Element | scala.Null = js.native
}

@JSGlobal("HTMLCollection")
@js.native
class HTMLCollectionCls () extends HTMLCollection

@JSGlobal("HTMLCollection")
@js.native
object HTMLCollection
  extends org.scalablytyped.runtime.Instantiable0[HTMLCollection]

