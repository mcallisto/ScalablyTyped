package typings
package atIonicAngularLib.distDirectivesProxiesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/proxies", "IonRefresher")
@js.native
class IonRefresher protected ()
  extends atIonicCoreLib.distTypesComponentsMod.ComponentsNs.IonRefresher {
  def this(c: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef, r: atAngularCoreLib.atAngularCoreMod.ElementRef[_], z: atAngularCoreLib.atAngularCoreMod.NgZone) = this()
  /**
    * Time it takes to close the refresher.
    */
  /* CompleteClass */
  override var closeDuration: java.lang.String = js.native
  /**
    * If `true`, the refresher will be hidden.
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  var el: stdLib.HTMLElement = js.native
  var ionPull: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionRefresh: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  var ionStart: atAngularCoreLib.atAngularCoreMod.EventEmitter[stdLib.CustomEvent[_]] = js.native
  /**
    * How much to multiply the pull speed by. To slow the pull animation down, pass a number less than `1`. To speed up the pull, pass a number greater than `1`. The default value is `1` which is equal to the speed of the cursor. If a negative value is passed in, the factor will be `1` instead.  For example: If the value passed is `1.2` and the content is dragged by `10` pixels, instead of `10` pixels the content will be pulled by `12` pixels (an increase of 20 percent). If the value passed is `0.8`, the dragged amount will be `8` pixels, less than the amount the cursor has moved.
    */
  /* CompleteClass */
  override var pullFactor: scala.Double = js.native
  /**
    * The maximum distance of the pull until the refresher will automatically go into the `refreshing` state. Defaults to the result of `pullMin + 60`.
    */
  /* CompleteClass */
  override var pullMax: scala.Double = js.native
  /**
    * The minimum distance the user must pull down until the refresher will go into the `refreshing` state.
    */
  /* CompleteClass */
  override var pullMin: scala.Double = js.native
  /**
    * Time it takes the refresher to to snap back to the `refreshing` state.
    */
  /* CompleteClass */
  override var snapbackDuration: java.lang.String = js.native
  var z: atAngularCoreLib.atAngularCoreMod.NgZone = js.native
  /**
    * Changes the refresher's state from `refreshing` to `cancelling`.
    */
  /* CompleteClass */
  override def cancel(): js.Promise[scala.Unit] = js.native
  /**
    * Call `complete()` when your async operation has completed. For example, the `refreshing` state is while the app is performing an asynchronous operation, such as receiving more data from an AJAX request. Once the data has been received, you then call this method to signify that the refreshing has completed and to close the refresher. This method also changes the refresher's state from `refreshing` to `completing`.
    */
  /* CompleteClass */
  override def complete(): js.Promise[scala.Unit] = js.native
  /**
    * A number representing how far down the user has pulled. The number `0` represents the user hasn't pulled down at all. The number `1`, and anything greater than `1`, represents that the user has pulled far enough down that when they let go then the refresh will happen. If they let go and the number is less than `1`, then the refresh will not happen, and the content will return to it's original position.
    */
  /* CompleteClass */
  override def getProgress(): js.Promise[scala.Double] = js.native
}

