package typings
package atUirouterCoreLib.atUirouterCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "Rejection")
@js.native
class Rejection protected ()
  extends atUirouterCoreLib.libTransitionMod.Rejection {
  def this(`type`: scala.Double) = this()
  def this(`type`: scala.Double, message: java.lang.String) = this()
  def this(`type`: scala.Double, message: java.lang.String, detail: js.Any) = this()
}

/* static members */
@JSImport("@uirouter/core", "Rejection")
@js.native
object Rejection extends js.Object {
  /** Returns a Rejection due to aborted transition */
  def aborted(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  def aborted(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to aborted transition */
  def errored(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  def errored(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to ignored transition */
  def ignored(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  def ignored(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to invalid transition */
  def invalid(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  def invalid(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
  def isRejectionPromise(obj: js.Any): scala.Boolean = js.native
  /**
    * Returns a Rejection
    *
    * Normalizes a value as a Rejection.
    * If the value is already a Rejection, returns it.
    * Otherwise, wraps and returns the value as a Rejection (Rejection type: ERROR).
    *
    * @returns `detail` if it is already a `Rejection`, else returns an ERROR Rejection.
    */
  def normalize(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  def normalize(detail: atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  def normalize(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  def normalize(detail: stdLib.Error): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to redirected transition */
  def redirected(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  def redirected(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  /** Returns a Rejection due to transition superseded */
  def superseded(): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  def superseded(detail: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
  def superseded(detail: js.Any, options: js.Any): atUirouterCoreLib.libTransitionRejectFactoryMod.Rejection = js.native
}

