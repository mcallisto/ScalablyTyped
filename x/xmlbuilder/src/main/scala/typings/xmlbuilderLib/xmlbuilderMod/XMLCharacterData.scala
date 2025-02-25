package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the base class of character data nodes.
  */
@JSImport("xmlbuilder", "XMLCharacterData")
@js.native
abstract class XMLCharacterData () extends XMLNode {
  /**
    * Node value
    */
  var value: java.lang.String = js.native
}

