package typings
package xmlbuilderLib.xmlbuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an XML attribute.
  */
@JSImport("xmlbuilder", "XMLAttribute")
@js.native
class XMLAttribute () extends js.Object {
  /** 
    * Attribute name 
    */
  var name: java.lang.String = js.native
  /** 
    * Parent element node 
    */
  var parent: XMLElement = js.native
  /** 
    * Type of the node 
    */
  var `type`: NodeType = js.native
  /** 
    * Attribute value 
    */
  var value: java.lang.String = js.native
  def toString(options: XMLToStringOptions): java.lang.String = js.native
}

