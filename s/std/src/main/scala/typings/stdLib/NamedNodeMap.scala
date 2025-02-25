package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of Attr objects. Objects inside a NamedNodeMap are not in any particular order, unlike NodeList, although they may be accessed by an index as in an array. */
@js.native
trait NamedNodeMap
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Attr] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Attr]] = js.native
  val length: scala.Double = js.native
  def getNamedItem(qualifiedName: java.lang.String): Attr | scala.Null = js.native
  def getNamedItemNS(namespace: java.lang.String, localName: java.lang.String): Attr | scala.Null = js.native
  def getNamedItemNS(namespace: scala.Null, localName: java.lang.String): Attr | scala.Null = js.native
  def item(index: scala.Double): Attr | scala.Null = js.native
  def removeNamedItem(qualifiedName: java.lang.String): Attr = js.native
  def removeNamedItemNS(namespace: java.lang.String, localName: java.lang.String): Attr = js.native
  def removeNamedItemNS(namespace: scala.Null, localName: java.lang.String): Attr = js.native
  def setNamedItem(attr: Attr): Attr | scala.Null = js.native
  def setNamedItemNS(attr: Attr): Attr | scala.Null = js.native
}

@JSGlobal("NamedNodeMap")
@js.native
class NamedNodeMapCls () extends NamedNodeMap

@JSGlobal("NamedNodeMap")
@js.native
object NamedNodeMap
  extends org.scalablytyped.runtime.Instantiable0[NamedNodeMap]

