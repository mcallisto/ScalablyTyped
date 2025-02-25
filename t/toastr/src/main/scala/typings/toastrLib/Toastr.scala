package typings
package toastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toastr extends js.Object {
  /**
  	 * Clear toasts
  	 */
  @JSName("clear")
  var clear_Original: Fn_ClearOptions = js.native
  /**
  	 * Create an error toast
  	 */
  @JSName("error")
  var error_Original: ToastrDisplayMethod = js.native
  /**
  	 * Get or create a container.
  	 */
  @JSName("getContainer")
  var getContainer_Original: Fn_Create = js.native
  /**
  	 * Create an info toast
  	 */
  @JSName("info")
  var info_Original: ToastrDisplayMethod = js.native
  /**
  	 * The toatsr options object
  	 */
  var options: ToastrOptions = js.native
  /**
  	 * Removes toasts (without animation)
  	 */
  @JSName("remove")
  var remove_Original: Fn_Toast = js.native
  /**
  	 * Create a success toast
  	 */
  @JSName("success")
  var success_Original: ToastrDisplayMethod = js.native
  /**
  	 * Get toastr version
  	 */
  var version: java.lang.String = js.native
  /**
  	 * Create a warning toast
  	 */
  @JSName("warning")
  var warning_Original: ToastrDisplayMethod = js.native
  /**
  		 * Clear specific toast
  		 *
  		 * @param toast Toast to clear
  		 * @param clearOptions force clearing a toast, ignoring focus
  		 */
  /**
  	 * Clear toasts
  	 */
  def clear(): scala.Unit = js.native
  def clear(toast: jqueryLib.JQuery[stdLib.HTMLElement]): scala.Unit = js.native
  def clear(toast: jqueryLib.JQuery[stdLib.HTMLElement], clearOptions: Anon_Force): scala.Unit = js.native
  /**
  	 * Create an error toast
  	 */
  def error(message: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def error(message: java.lang.String, title: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def error(message: java.lang.String, title: java.lang.String, overrides: ToastrOptions): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
  		 * Get the container by options.containerId.
  		 *
  		 * @param options Option values for the container
  		 */
  /**
  	 * Get or create a container.
  	 */
  def getContainer(): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def getContainer(options: ToastrOptions): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
  		 * Get the container by options.containerId.
  		 * If it doesn't exist, it will be created according to options.
  		 *
  		 * @param options Option values for the container
  		 * @param create Use true to create a container, if it doesn't exist
  		 */
  /**
  	 * Get or create a container.
  	 */
  def getContainer(options: ToastrOptions, create: scala.Boolean): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
  	 * Create an info toast
  	 */
  def info(message: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def info(message: java.lang.String, title: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def info(message: java.lang.String, title: java.lang.String, overrides: ToastrOptions): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
  		 * Removes all toasts (without animation)
  	 	 */
  /**
  	 * Removes toasts (without animation)
  	 */
  def remove(): scala.Unit = js.native
  /**
  		 * Removes specific toast (without animation)
  		 *
  		 * @param toast Toast to remove
  	 	 */
  /**
  	 * Removes toasts (without animation)
  	 */
  def remove(toast: jqueryLib.JQuery[stdLib.HTMLElement]): scala.Unit = js.native
  /**
  	 * Register a callback to be called when a toast gets created or hidden.
  	 *
  	 * @param callback The function which will be passed the event details.
  	 */
  def subscribe(callback: js.Function1[/* response */ ToastrResponse, scala.Unit]): scala.Unit = js.native
  /**
  	 * Create a success toast
  	 */
  def success(message: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def success(message: java.lang.String, title: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def success(message: java.lang.String, title: java.lang.String, overrides: ToastrOptions): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  /**
  	 * Create a warning toast
  	 */
  def warning(message: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def warning(message: java.lang.String, title: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
  def warning(message: java.lang.String, title: java.lang.String, overrides: ToastrOptions): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
}

