package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A Node containing a doctype. */
@js.native
trait DocumentType extends ChildNode {
  val name: java.lang.String = js.native
  val publicId: java.lang.String = js.native
  val systemId: java.lang.String = js.native
}

@JSGlobal("DocumentType")
@js.native
class DocumentTypeCls () extends DocumentType

@JSGlobal("DocumentType")
@js.native
object DocumentType
  extends org.scalablytyped.runtime.Instantiable0[DocumentType]

