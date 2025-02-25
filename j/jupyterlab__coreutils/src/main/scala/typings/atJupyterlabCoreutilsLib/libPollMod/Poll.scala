package typings
package atJupyterlabCoreutilsLib.libPollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/poll", "Poll")
@js.native
class Poll[T, U, V /* <: java.lang.String */] protected ()
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IObservableDisposable
     with atJupyterlabCoreutilsLib.libInterfacesMod.IPoll[T, U, V] {
  /**
    * Instantiate a new poll with exponential backoff in case of failure.
    *
    * @param options - The poll instantiation options.
    */
  def this(options: atJupyterlabCoreutilsLib.libPollMod.PollNs.IOptions[T, U, V]) = this()
  var _disposed: js.Any = js.native
  /**
    * Execute a new poll factory promise or stand by if necessary.
    */
  var _execute: js.Any = js.native
  var _factory: js.Any = js.native
  var _frequency: js.Any = js.native
  var _standby: js.Any = js.native
  var _state: js.Any = js.native
  var _tick: js.Any = js.native
  var _ticked: js.Any = js.native
  var _timeout: js.Any = js.native
  /**
    * A signal emitted when the poll is disposed.
    */
  /* InferMemberOverrides */
  override val disposed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * The polling frequency data.
    */
  /* CompleteClass */
  override val frequency: atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.Frequency = js.native
  /**
    * Whether the poll is disposed.
    */
  /* InferMemberOverrides */
  override val isDisposed: scala.Boolean = js.native
  /**
    * The name of the poll.
    */
  /* CompleteClass */
  override val name: java.lang.String = js.native
  /**
    * Indicates when the poll switches to standby.
    */
  var standby: atJupyterlabCoreutilsLib.libPollMod.PollNs.Standby | (js.Function0[scala.Boolean | atJupyterlabCoreutilsLib.libPollMod.PollNs.Standby]) = js.native
  /**
    * The poll state, which is the content of the currently-scheduled poll tick.
    */
  /* CompleteClass */
  override val state: atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.State[T, U, V] = js.native
  /**
    * A promise that resolves when the currently-scheduled tick completes.
    *
    * #### Notes
    * Usually this will resolve after `state.interval` milliseconds from
    * `state.timestamp`. It can resolve earlier if the user starts or refreshes the
    * poll, etc.
    */
  /* CompleteClass */
  override val tick: js.Promise[atJupyterlabCoreutilsLib.libInterfacesMod.IPoll[T, U, V]] = js.native
  /**
    * A promise that resolves when the poll next ticks.
    */
  @JSName("tick")
  val tick_Poll: js.Promise[this.type] = js.native
  /**
    * A signal emitted when the poll state changes, i.e., a new tick is scheduled.
    */
  /* CompleteClass */
  override val ticked: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    atJupyterlabCoreutilsLib.libInterfacesMod.IPoll[T, U, V], 
    atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.State[T, U, V]
  ] = js.native
  /**
    * A signal emitted when the poll ticks and fires off a new request.
    */
  @JSName("ticked")
  val ticked_Poll: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.State[T, U, V]] = js.native
  /**
    * Dispose of the resources held by the object.
    *
    * #### Notes
    * If the object's `dispose` method is called more than once, all
    * calls made after the first will be a no-op.
    *
    * #### Undefined Behavior
    * It is undefined behavior to use any functionality of the object
    * after it has been disposed unless otherwise explicitly noted.
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Refreshes the poll. Schedules `refreshed` tick if necessary.
    *
    * @returns A promise that resolves after tick is scheduled and never rejects.
    *
    * #### Notes
    * The returned promise resolves after the tick is scheduled, but before
    * the polling action is run. To wait until after the poll action executes,
    * await the `poll.tick` promise: `await poll.refresh(); await poll.tick;`
    */
  def refresh(): js.Promise[scala.Unit] = js.native
  /**
    * Schedule the next poll tick.
    *
    * @param next - The next poll state data to schedule. Defaults to standby.
    *
    * @param next.cancel - Cancels state transition if function returns `true`.
    *
    * @returns A promise that resolves when the next poll state is active.
    *
    * #### Notes
    * This method is not meant to be invoked by user code typically. It is public
    * to allow poll instances to be composed into classes that schedule ticks.
    */
  def schedule(): js.Promise[scala.Unit] = js.native
  def schedule(
    next: stdLib.Partial[
      (atJupyterlabCoreutilsLib.libInterfacesMod.IPollNs.State[T, U, V]) with (atJupyterlabCoreutilsLib.Anon_Cancel[T, U, V])
    ]
  ): js.Promise[scala.Unit] = js.native
  /**
    * Starts the poll. Schedules `started` tick if necessary.
    *
    * @returns A promise that resolves after tick is scheduled and never rejects.
    */
  def start(): js.Promise[scala.Unit] = js.native
  /**
    * Stops the poll. Schedules `stopped` tick if necessary.
    *
    * @returns A promise that resolves after tick is scheduled and never rejects.
    */
  def stop(): js.Promise[scala.Unit] = js.native
}

