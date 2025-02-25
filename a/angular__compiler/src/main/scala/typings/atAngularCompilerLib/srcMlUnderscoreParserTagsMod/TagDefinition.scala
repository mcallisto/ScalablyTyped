package typings
package atAngularCompilerLib.srcMlUnderscoreParserTagsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagDefinition extends js.Object {
  var canSelfClose: scala.Boolean
  var closedByParent: scala.Boolean
  var contentType: TagContentType
  var ignoreFirstLf: scala.Boolean
  var implicitNamespacePrefix: java.lang.String | scala.Null
  var isVoid: scala.Boolean
  def isClosedByChild(name: java.lang.String): scala.Boolean
}

object TagDefinition {
  @scala.inline
  def apply(
    canSelfClose: scala.Boolean,
    closedByParent: scala.Boolean,
    contentType: TagContentType,
    ignoreFirstLf: scala.Boolean,
    isClosedByChild: java.lang.String => scala.Boolean,
    isVoid: scala.Boolean,
    implicitNamespacePrefix: java.lang.String = null
  ): TagDefinition = {
    val __obj = js.Dynamic.literal(canSelfClose = canSelfClose, closedByParent = closedByParent, contentType = contentType, ignoreFirstLf = ignoreFirstLf, isClosedByChild = js.Any.fromFunction1(isClosedByChild), isVoid = isVoid)
    if (implicitNamespacePrefix != null) __obj.updateDynamic("implicitNamespacePrefix")(implicitNamespacePrefix)
    __obj.asInstanceOf[TagDefinition]
  }
}

