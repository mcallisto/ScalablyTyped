package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * RootContext contains information which is shared for all components which
  * were bootstrapped with {@link renderComponent}.
  */
trait RootContext extends js.Object {
  /**
    * A promise which is resolved when all components are considered clean (not dirty).
    *
    * This promise is overwritten every time a first call to {@link markDirty} is invoked.
    */
  var clean: js.Promise[scala.Null]
  /**
    * RootComponents - The components that were instantiated by the call to
    * {@link renderComponent}.
    */
  var components: js.Array[js.Object]
  /**
    * What render-related operations to run once a scheduler has been set
    */
  var flags: RootContextFlags
  /**
    * The player flushing handler to kick off all animations
    */
  var playerHandler: ɵPlayerHandler | scala.Null
  /**
    * A function used for scheduling change detection in the future. Usually
    * this is `requestAnimationFrame`.
    */
  def scheduler(workFn: js.Function0[scala.Unit]): scala.Unit
}

object RootContext {
  @scala.inline
  def apply(
    clean: js.Promise[scala.Null],
    components: js.Array[js.Object],
    flags: RootContextFlags,
    scheduler: js.Function0[scala.Unit] => scala.Unit,
    playerHandler: ɵPlayerHandler = null
  ): RootContext = {
    val __obj = js.Dynamic.literal(clean = clean, components = components, flags = flags, scheduler = js.Any.fromFunction1(scheduler))
    if (playerHandler != null) __obj.updateDynamic("playerHandler")(playerHandler)
    __obj.asInstanceOf[RootContext]
  }
}

