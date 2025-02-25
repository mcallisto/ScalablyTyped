package typings
package chocolatechipjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Data extends js.Object {
  /**
    * An object that holds the reference to the controller for a repeater.
    * This is used to cache the data that a repeater uses. After the repeater is rendered, the reference is deleted from this object.
    * Example: $.template.data["myRepeater"] = [{name: "Joe"}, {name: "Sue"}];
    */
  var data: js.Any = js.native
  /**
    * Use this value to output an index value in a template repeater.
    */
  var index: scala.Double = js.native
  /**
    * The repeater method used to rendering iterable template data.
    */
  @JSName("repeater")
  var repeater_Original: Fn_Data = js.native
  /**
    * This method parses a string and an optoinal variable name and returns a parsed template in the form of a function. You can then pass this function data to get rendered nodes.
    *
    * @param template A string of markup to use as a template.
    * @param variable An option name to use in the template. If it were "myData": [[= myData.name]]. Otherwise it defaults to "data": [[= data.name]].
    */
  def apply(template: java.lang.String): js.Function = js.native
  def apply(template: java.lang.String, variable: java.lang.String): js.Function = js.native
  /**
    * Use this method to render declarative temlate repeaters. This expects a "data-repeater" attribute whose value points to data stored on $.template.data.
    */
  /**
    * The repeater method used to rendering iterable template data.
    */
  def repeater(): scala.Unit = js.native
  /**
    * A method to repeated output a template.
    *
    * @param element The target container into which the content will be inserted.
    * @param template A string of markup.
    * @param data The iterable data the template will consume.
    */
  /**
    * The repeater method used to rendering iterable template data.
    */
  def repeater(element: ChocolateChipElementArray, template: java.lang.String, data: js.Any): scala.Unit = js.native
}

