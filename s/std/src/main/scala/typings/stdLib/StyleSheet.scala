package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface. */
trait StyleSheet extends js.Object {
  var disabled: scala.Boolean
  val href: java.lang.String | scala.Null
  val media: MediaList
  val ownerNode: Node
  val parentStyleSheet: StyleSheet | scala.Null
  val title: java.lang.String | scala.Null
  val `type`: java.lang.String
}

@JSGlobal("StyleSheet")
@js.native
class StyleSheetCls () extends StyleSheet {
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  /* CompleteClass */
  override val href: java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override val media: MediaList = js.native
  /* CompleteClass */
  override val ownerNode: Node = js.native
  /* CompleteClass */
  override val parentStyleSheet: StyleSheet | scala.Null = js.native
  /* CompleteClass */
  override val title: java.lang.String | scala.Null = js.native
  /* CompleteClass */
  override val `type`: java.lang.String = js.native
}

@JSGlobal("StyleSheet")
@js.native
object StyleSheet
  extends org.scalablytyped.runtime.Instantiable0[StyleSheet]

