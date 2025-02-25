package typings
package atPhosphorCommandsLib.atPhosphorCommandsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/commands", "CommandRegistry")
@js.native
/**
  * Construct a new command registry.
  */
class CommandRegistry () extends js.Object {
  /**
    * Clear the internal pending state.
    */
  var _clearPendingState: js.Any = js.native
  /**
    * Clear the pending timeout.
    */
  var _clearTimer: js.Any = js.native
  var _commandChanged: js.Any = js.native
  var _commandExecuted: js.Any = js.native
  var _commands: js.Any = js.native
  var _exactKeyMatch: js.Any = js.native
  /**
    * Execute the command for the given key binding.
    *
    * If the command is missing or disabled, a warning will be logged.
    */
  var _executeKeyBinding: js.Any = js.native
  var _keyBindingChanged: js.Any = js.native
  var _keyBindings: js.Any = js.native
  var _keydownEvents: js.Any = js.native
  var _keystrokes: js.Any = js.native
  /**
    * Handle the partial match timeout.
    */
  var _onPendingTimeout: js.Any = js.native
  /**
    * Replay the keydown events which were suppressed.
    */
  var _replayKeydownEvents: js.Any = js.native
  var _replaying: js.Any = js.native
  /**
    * Start or restart the pending timeout.
    */
  var _startTimer: js.Any = js.native
  var _timerID: js.Any = js.native
  /**
    * A signal emitted when a command has changed.
    *
    * #### Notes
    * This signal is useful for visual representations of commands which
    * need to refresh when the state of a relevant command has changed.
    */
  val commandChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistryNs.ICommandChangedArgs
  ] = js.native
  /**
    * A signal emitted when a command has executed.
    *
    * #### Notes
    * Care should be taken when consuming this signal. It is intended to
    * be used largely for debugging and logging purposes. It should not
    * be (ab)used for general purpose spying on command execution.
    */
  val commandExecuted: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistryNs.ICommandExecutedArgs
  ] = js.native
  /**
    * A signal emitted when a key binding is changed.
    */
  val keyBindingChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistryNs.IKeyBindingChangedArgs
  ] = js.native
  /**
    * A read-only array of the key bindings in the registry.
    */
  val keyBindings: js.Array[atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistryNs.IKeyBinding] = js.native
  /**
    * Add a command to the registry.
    *
    * @param id - The unique id of the command.
    *
    * @param options - The options for the command.
    *
    * @returns A disposable which will remove the command.
    *
    * @throws An error if the given `id` is already registered.
    */
  def addCommand(
    id: java.lang.String,
    options: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistryNs.ICommandOptions
  ): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  /**
    * Add a key binding to the registry.
    *
    * @param options - The options for creating the key binding.
    *
    * @returns A disposable which removes the added key binding.
    *
    * #### Notes
    * If multiple key bindings are registered for the same sequence, the
    * binding with the highest selector specificity is executed first. A
    * tie is broken by using the most recently added key binding.
    *
    * Ambiguous key bindings are resolved with a timeout. As an example,
    * suppose two key bindings are registered: one with the key sequence
    * `['Ctrl D']`, and another with `['Ctrl D', 'Ctrl W']`. If the user
    * presses `Ctrl D`, the first binding cannot be immediately executed
    * since the user may intend to complete the chord with `Ctrl W`. For
    * such cases, a timer is used to allow the chord to be completed. If
    * the chord is not completed before the timeout, the first binding
    * is executed.
    */
  def addKeyBinding(options: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistryNs.IKeyBindingOptions): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  /**
    * Get the short form caption for a specific command.
    *
    * @param id - The id of the command of interest.
    *
    * @param args - The arguments for the command.
    *
    * @returns The caption for the command, or an empty string if the
    *   command is not registered.
    */
  def caption(id: java.lang.String): java.lang.String = js.native
  def caption(id: java.lang.String, args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): java.lang.String = js.native
  /**
    * Get the extra class name for a specific command.
    *
    * @param id - The id of the command of interest.
    *
    * @param args - The arguments for the command.
    *
    * @returns The class name for the command, or an empty string if
    *   the command is not registered.
    */
  def className(id: java.lang.String): java.lang.String = js.native
  def className(id: java.lang.String, args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): java.lang.String = js.native
  /**
    * Get the dataset for a specific command.
    *
    * @param id - The id of the command of interest.
    *
    * @param args - The arguments for the command.
    *
    * @returns The dataset for the command, or an empty dataset if
    *   the command is not registered.
    */
  def dataset(id: java.lang.String): atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistryNs.Dataset = js.native
  def dataset(id: java.lang.String, args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistryNs.Dataset = js.native
  /**
    * Execute a specific command.
    *
    * @param id - The id of the command of interest.
    *
    * @param args - The arguments for the command.
    *
    * @returns A promise which resolves with the result of the command.
    *
    * #### Notes
    * The promise will reject if the command throws an exception,
    * or if the command is not registered.
    */
  def execute(id: java.lang.String): js.Promise[_] = js.native
  def execute(id: java.lang.String, args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): js.Promise[_] = js.native
  /**
    * Test whether a specific command is registered.
    *
    * @param id - The id of the command of interest.
    *
    * @returns `true` if the command is registered, `false` otherwise.
    */
  def hasCommand(id: java.lang.String): scala.Boolean = js.native
  /**
    * @deprecated Use `iconClass()` instead.
    */
  def icon(id: java.lang.String): java.lang.String = js.native
  def icon(id: java.lang.String, args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): java.lang.String = js.native
  /**
    * Get the icon class for a specific command.
    *
    * @param id - The id of the command of interest.
    *
    * @param args - The arguments for the command.
    *
    * @returns The icon class for the command, or an empty string if
    *   the command is not registered.
    */
  def iconClass(id: java.lang.String): java.lang.String = js.native
  def iconClass(id: java.lang.String, args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): java.lang.String = js.native
  /**
    * Get the icon label for a specific command.
    *
    * @param id - The id of the command of interest.
    *
    * @param args - The arguments for the command.
    *
    * @returns The icon label for the command, or an empty string if
    *   the command is not registered.
    */
  def iconLabel(id: java.lang.String): java.lang.String = js.native
  def iconLabel(id: java.lang.String, args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): java.lang.String = js.native
  /**
    * Test whether a specific command is enabled.
    *
    * @param id - The id of the command of interest.
    *
    * @param args - The arguments for the command.
    *
    * @returns A boolean indicating whether the command is enabled,
    *   or `false` if the command is not registered.
    */
  def isEnabled(id: java.lang.String): scala.Boolean = js.native
  def isEnabled(id: java.lang.String, args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): scala.Boolean = js.native
  /**
    * Test whether a specific command is toggled.
    *
    * @param id - The id of the command of interest.
    *
    * @param args - The arguments for the command.
    *
    * @returns A boolean indicating whether the command is toggled,
    *   or `false` if the command is not registered.
    */
  def isToggled(id: java.lang.String): scala.Boolean = js.native
  def isToggled(id: java.lang.String, args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): scala.Boolean = js.native
  /**
    * Test whether a specific command is visible.
    *
    * @param id - The id of the command of interest.
    *
    * @param args - The arguments for the command.
    *
    * @returns A boolean indicating whether the command is visible,
    *   or `false` if the command is not registered.
    */
  def isVisible(id: java.lang.String): scala.Boolean = js.native
  def isVisible(id: java.lang.String, args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): scala.Boolean = js.native
  /**
    * Get the display label for a specific command.
    *
    * @param id - The id of the command of interest.
    *
    * @param args - The arguments for the command.
    *
    * @returns The display label for the command, or an empty string
    *   if the command is not registered.
    */
  def label(id: java.lang.String): java.lang.String = js.native
  def label(id: java.lang.String, args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): java.lang.String = js.native
  /**
    * List the ids of the registered commands.
    *
    * @returns A new array of the registered command ids.
    */
  def listCommands(): js.Array[java.lang.String] = js.native
  /**
    * Get the mnemonic index for a specific command.
    *
    * @param id - The id of the command of interest.
    *
    * @param args - The arguments for the command.
    *
    * @returns The mnemonic index for the command, or `-1` if the
    *   command is not registered.
    */
  def mnemonic(id: java.lang.String): scala.Double = js.native
  def mnemonic(id: java.lang.String, args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): scala.Double = js.native
  /**
    * Notify listeners that the state of a command has changed.
    *
    * @param id - The id of the command which has changed. If more than
    *   one command has changed, this argument should be omitted.
    *
    * @throws An error if the given `id` is not registered.
    *
    * #### Notes
    * This method should be called by the command author whenever the
    * application state changes such that the results of the command
    * metadata functions may have changed.
    *
    * This will cause the `commandChanged` signal to be emitted.
    */
  def notifyCommandChanged(): scala.Unit = js.native
  def notifyCommandChanged(id: java.lang.String): scala.Unit = js.native
  /**
    * Process a `'keydown'` event and invoke a matching key binding.
    *
    * @param event - The event object for a `'keydown'` event.
    *
    * #### Notes
    * This should be called in response to a `'keydown'` event in order
    * to invoke the command for the best matching key binding.
    *
    * The registry **does not** install its own listener for `'keydown'`
    * events. This allows the application full control over the nodes
    * and phase for which the registry processes `'keydown'` events.
    */
  def processKeydownEvent(event: stdLib.KeyboardEvent): scala.Unit = js.native
  /**
    * Get the usage help text for a specific command.
    *
    * @param id - The id of the command of interest.
    *
    * @param args - The arguments for the command.
    *
    * @returns The usage text for the command, or an empty string if
    *   the command is not registered.
    */
  def usage(id: java.lang.String): java.lang.String = js.native
  def usage(id: java.lang.String, args: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject): java.lang.String = js.native
}

