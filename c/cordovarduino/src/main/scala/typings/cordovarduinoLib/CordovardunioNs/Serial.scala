package typings
package cordovarduinoLib.CordovardunioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serial extends js.Object {
  /**
    * Close connection.
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def close(successCallback: js.Function, errorCallback: js.Function): scala.Unit
  /**
    * Open a connection.
    *
    * @param opts            SerialOptions object
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def open(opts: SerialOptions, successCallback: js.Function, errorCallback: js.Function): scala.Unit
  /**
    * Read from the serial port.
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def read(successCallback: js.Function, errorCallback: js.Function): scala.Unit
  /**
    * Register a callback for the driver reading incoming data from the serial device
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def registerReadCallback(successCallback: js.Function, errorCallback: js.Function): scala.Unit
  /**
    * Request permission to interact with the serial port.
    *
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def requestPermission(successCallback: js.Function, errorCallback: js.Function): scala.Unit
  /**
    * Write to the serial port.
    *
    * @param data            String data to write to serial port
    * @param successCallback Function to call on success
    * @param errorCallback   Function to call on error
    */
  def write(data: java.lang.String, successCallback: js.Function, errorCallback: js.Function): scala.Unit
}

object Serial {
  @scala.inline
  def apply(
    close: (js.Function, js.Function) => scala.Unit,
    open: (SerialOptions, js.Function, js.Function) => scala.Unit,
    read: (js.Function, js.Function) => scala.Unit,
    registerReadCallback: (js.Function, js.Function) => scala.Unit,
    requestPermission: (js.Function, js.Function) => scala.Unit,
    write: (java.lang.String, js.Function, js.Function) => scala.Unit
  ): Serial = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction2(close), open = js.Any.fromFunction3(open), read = js.Any.fromFunction2(read), registerReadCallback = js.Any.fromFunction2(registerReadCallback), requestPermission = js.Any.fromFunction2(requestPermission), write = js.Any.fromFunction3(write))
  
    __obj.asInstanceOf[Serial]
  }
}

