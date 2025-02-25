package typings
package signaleLib.signaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignaleBase[TTypes /* <: java.lang.String */] extends js.Object {
  /**
    * Sets the configuration of an instance overriding any existing global or local configuration.
    *
    * @param configObj Can hold any of the documented options.
    */
  def config(configObj: SignaleConfig): Signale[TTypes] = js.native
  /**
    * Defines the scope name of the logger.
    *
    * @param name Can be one or more comma delimited strings.
    */
  def scope(name: java.lang.String*): Signale[TTypes] = js.native
  /**
    * Sets a timers and accepts an optional label. If none provided the timer will receive a unique label automatically.
    *
    * @param label Label corresponding to the timer. Each timer must have its own unique label.
    * @returns a string corresponding to the timer label.
    */
  def time(): java.lang.String = js.native
  def time(label: java.lang.String): java.lang.String = js.native
  /**
    * Deactivates the timer to which the given label corresponds. If no label
    * is provided the most recent timer, that was created without providing a
    * label, will be deactivated.
    *
    * @param label Label corresponding to the timer, each timer has its own unique label.
    * @param span Total running time.
    */
  def timeEnd(): signaleLib.Anon_Label = js.native
  def timeEnd(label: java.lang.String): signaleLib.Anon_Label = js.native
  def timeEnd(label: java.lang.String, span: scala.Double): signaleLib.Anon_Label = js.native
  /** Clears the scope name of the logger. */
  def unscope(): scala.Unit = js.native
}

