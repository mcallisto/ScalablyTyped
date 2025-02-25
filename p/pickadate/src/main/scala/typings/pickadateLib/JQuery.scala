package typings
package pickadateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("pickadate")
  var pickadate_Original: pickadateLib.PickadateNs.Pickadate = js.native
  @JSName("pickatime")
  var pickatime_Original: pickadateLib.PickadateNs.Pickatime = js.native
  /**
    * Initialize a date picker.
    */
  def pickadate(): JQuery = js.native
  /**
    * Invoke API methods after date picker initialization.
    */
  def pickadate(methodName: java.lang.String, arguments: js.Any*): js.Any = js.native
  def pickadate(options: pickadateLib.PickadateNs.DateOptions): JQuery = js.native
  @JSName("pickadate")
  def pickadate_hidden(objectName: pickadateLib.pickadateLibStrings._hidden): stdLib.HTMLInputElement = js.native
  @JSName("pickadate")
  def pickadate_node(objectName: pickadateLib.pickadateLibStrings.DOLLARnode): JQuery = js.native
  /**
    * Access the API object on an initialized date picker element.
    */
  @JSName("pickadate")
  def pickadate_picker(keyword: pickadateLib.pickadateLibStrings.picker): pickadateLib.PickadateNs.DatePicker = js.native
  @JSName("pickadate")
  def pickadate_root(objectName: pickadateLib.pickadateLibStrings.DOLLARroot): JQuery = js.native
  /**
    * Initialize a time picker.
    */
  def pickatime(): JQuery = js.native
  /**
    * Invoke API methods after time picker initialization.
    */
  def pickatime(methodName: java.lang.String, arguments: js.Any*): js.Any = js.native
  def pickatime(options: pickadateLib.PickadateNs.TimeOptions): JQuery = js.native
  @JSName("pickatime")
  def pickatime_hidden(objectName: pickadateLib.pickadateLibStrings._hidden): stdLib.HTMLInputElement = js.native
  @JSName("pickatime")
  def pickatime_node(objectName: pickadateLib.pickadateLibStrings.DOLLARnode): JQuery = js.native
  /**
    * Access the API object on an initialized time picker element.
    */
  @JSName("pickatime")
  def pickatime_picker(keyword: pickadateLib.pickadateLibStrings.picker): pickadateLib.PickadateNs.TimePicker = js.native
  @JSName("pickatime")
  def pickatime_root(objectName: pickadateLib.pickadateLibStrings.DOLLARroot): JQuery = js.native
}

