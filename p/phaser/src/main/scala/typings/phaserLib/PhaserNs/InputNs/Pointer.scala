package typings
package phaserLib.PhaserNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Pointer object encapsulates both mouse and touch input within Phaser.
  * 
  * By default, Phaser will create 2 pointers for your game to use. If you require more, i.e. for a multi-touch
  * game, then use the `InputPlugin.addPointer` method to do so, rather than instantiating this class directly,
  * otherwise it won't be managed by the input system.
  * 
  * You can reference the current active pointer via `InputPlugin.activePointer`. You can also use the properties
  * `InputPlugin.pointer1` through to `pointer10`, for each pointer you have enabled in your game.
  * 
  * The properties of this object are set by the Input Plugin during processing. This object is then sent in all
  * input related events that the Input Plugin emits, so you can reference properties from it directly in your
  * callbacks.
  */
@JSGlobal("Phaser.Input.Pointer")
@js.native
class Pointer protected () extends js.Object {
  /**
    * 
    * @param manager A reference to the Input Manager.
    * @param id The internal ID of this Pointer.
    */
  def this(manager: InputManager, id: phaserLib.integer) = this()
  /**
    * An active Pointer is one that is currently pressed down on the display.
    * A Mouse is always considered as active.
    */
  var active: scala.Boolean = js.native
  /**
    * The current angle the Pointer is moving, in radians, based on its previous and current position.
    * 
    * The angle is based on the old position facing to the current position.
    * 
    * This property is updated whenever the Pointer moves, regardless of any button states. In other words,
    * it changes based on movement alone - a button doesn't have to be pressed first.
    */
  val angle: scala.Double = js.native
  /**
    * A read-only property that indicates which button was pressed, or released, on the pointer
    * during the most recent event. It is only set during `up` and `down` events.
    * 
    * On Touch devices the value is always 0.
    * 
    * Users may change the configuration of buttons on their pointing device so that if an event's button property
    * is zero, it may not have been caused by the button that is physically left–most on the pointing device;
    * however, it should behave as if the left button was clicked in the standard button layout.
    */
  val button: phaserLib.integer = js.native
  /**
    * 0: No button or un-initialized
    * 1: Left button
    * 2: Right button
    * 4: Wheel button or middle button
    * 8: 4th button (typically the "Browser Back" button)
    * 16: 5th button (typically the "Browser Forward" button)
    * 
    * For a mouse configured for left-handed use, the button actions are reversed.
    * In this case, the values are read from right to left.
    */
  var buttons: phaserLib.integer = js.native
  /**
    * The camera the Pointer interacted with during its last update.
    * 
    * A Pointer can only ever interact with one camera at once, which will be the top-most camera
    * in the list should multiple cameras be positioned on-top of each other.
    */
  var camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera = js.native
  /**
    * The horizontal scroll amount that occurred due to the user moving a mouse wheel or similar input device.
    */
  var deltaX: scala.Double = js.native
  /**
    * The vertical scroll amount that occurred due to the user moving a mouse wheel or similar input device.
    * This value will typically be less than 0 if the user scrolls up and greater than zero if scrolling down.
    */
  var deltaY: scala.Double = js.native
  /**
    * The z-axis scroll amount that occurred due to the user moving a mouse wheel or similar input device.
    */
  var deltaZ: scala.Double = js.native
  /**
    * The distance the Pointer has moved, based on its previous and current position.
    * 
    * This value is smoothed out each frame, according to the `motionFactor` property.
    * 
    * This property is updated whenever the Pointer moves, regardless of any button states. In other words,
    * it changes based on movement alone - a button doesn't have to be pressed first.
    * 
    * If you need the total distance travelled since the primary buttons was pressed down,
    * then use the `Pointer.getDistance` method.
    */
  val distance: scala.Double = js.native
  /**
    * The DOM element the Pointer was pressed down on, taken from the DOM event.
    * In a default set-up this will be the Canvas that Phaser is rendering to, or the Window element.
    */
  val downElement: js.Any = js.native
  /**
    * Time when Button 1 (left button), or Touch, was pressed, used for dragging objects.
    */
  var downTime: scala.Double = js.native
  /**
    * X coordinate of the Pointer when Button 1 (left button), or Touch, was pressed, used for dragging objects.
    */
  var downX: scala.Double = js.native
  /**
    * Y coordinate of the Pointer when Button 1 (left button), or Touch, was pressed, used for dragging objects.
    */
  var downY: scala.Double = js.native
  /**
    * The most recent native DOM Event this Pointer has processed.
    */
  var event: stdLib.TouchEvent | stdLib.MouseEvent = js.native
  /**
    * The internal ID of this Pointer.
    */
  val id: phaserLib.integer = js.native
  /**
    * The identifier property of the Pointer as set by the DOM event when this Pointer is started.
    */
  var identifier: scala.Double = js.native
  /**
    * Is _any_ button on this pointer considered as being down?
    */
  var isDown: scala.Boolean = js.native
  /**
    * A reference to the Input Manager.
    */
  var manager: InputManager = js.native
  /**
    * The factor applied to the motion smoothing each frame.
    * 
    * This value is passed to the Smooth Step Interpolation that is used to calculate the velocity,
    * angle and distance of the Pointer. It's applied every frame, until the midPoint reaches the current
    * position of the Pointer. 0.2 provides a good average but can be increased if you need a
    * quicker update and are working in a high performance environment. Never set this value to
    * zero.
    */
  var motionFactor: scala.Double = js.native
  /**
    * Time when this Pointer was most recently moved (regardless of the state of its buttons, if any)
    */
  var moveTime: scala.Double = js.native
  /**
    * If the mouse is locked, the horizontal relative movement of the Pointer in pixels since last frame.
    */
  var movementX: scala.Double = js.native
  /**
    * If the mouse is locked, the vertical relative movement of the Pointer in pixels since last frame.
    */
  var movementY: scala.Double = js.native
  /**
    * The pointerId property of the Pointer as set by the DOM event when this Pointer is started.
    * The browser can and will recycle this value.
    */
  var pointerId: scala.Double = js.native
  /**
    * The position of the Pointer in screen space.
    */
  val position: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * The previous position of the Pointer in screen space.
    * 
    * The old x and y values are stored in here during the InputManager.transformPointer call.
    * 
    * Use the properties `velocity`, `angle` and `distance` to create your own gesture recognition.
    */
  val prevPosition: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Is the primary button down? (usually button 0, the left mouse button)
    */
  var primaryDown: scala.Boolean = js.native
  /**
    * The smoothing factor to apply to the Pointer position.
    * 
    * Due to their nature, pointer positions are inherently noisy. While this is fine for lots of games, if you need cleaner positions
    * then you can set this value to apply an automatic smoothing to the positions as they are recorded.
    * 
    * The default value of zero means 'no smoothing'.
    * Set to a small value, such as 0.2, to apply an average level of smoothing between positions. You can do this by changing this
    * value directly, or by setting the `input.smoothFactor` property in the Game Config.
    * 
    * Positions are only smoothed when the pointer moves. If the primary button on this Pointer enters an Up or Down state, then the position
    * is always precise, and not smoothed.
    */
  var smoothFactor: scala.Double = js.native
  /**
    * Time when this Pointer was most recently updated by a DOM Event.
    */
  var time: scala.Double = js.native
  /**
    * The DOM element the Pointer was released on, taken from the DOM event.
    * In a default set-up this will be the Canvas that Phaser is rendering to, or the Window element.
    */
  val upElement: js.Any = js.native
  /**
    * Time when Button 1 (left button), or Touch, was released, used for dragging objects.
    */
  var upTime: scala.Double = js.native
  /**
    * X coordinate of the Pointer when Button 1 (left button), or Touch, was released, used for dragging objects.
    */
  var upX: scala.Double = js.native
  /**
    * Y coordinate of the Pointer when Button 1 (left button), or Touch, was released, used for dragging objects.
    */
  var upY: scala.Double = js.native
  /**
    * The current velocity of the Pointer, based on its current and previous positions.
    * 
    * This value is smoothed out each frame, according to the `motionFactor` property.
    * 
    * This property is updated whenever the Pointer moves, regardless of any button states. In other words,
    * it changes based on movement alone - a button doesn't have to be pressed first.
    */
  val velocity: phaserLib.PhaserNs.MathNs.Vector2 = js.native
  /**
    * Did this Pointer get canceled by a touchcancel event?
    * 
    * Note: "canceled" is the American-English spelling of "cancelled". Please don't submit PRs correcting it!
    */
  var wasCanceled: scala.Boolean = js.native
  /**
    * Did the previous input event come from a Touch input (true) or Mouse? (false)
    */
  var wasTouch: scala.Boolean = js.native
  /**
    * The x position of this Pointer, translated into the coordinate space of the most recent Camera it interacted with.
    */
  var worldX: scala.Double = js.native
  /**
    * The y position of this Pointer, translated into the coordinate space of the most recent Camera it interacted with.
    */
  var worldY: scala.Double = js.native
  /**
    * The x position of this Pointer.
    * The value is in screen space.
    * See `worldX` to get a camera converted position.
    */
  var x: scala.Double = js.native
  /**
    * The y position of this Pointer.
    * The value is in screen space.
    * See `worldY` to get a camera converted position.
    */
  var y: scala.Double = js.native
  /**
    * Checks to see if the back button is being held down on this Pointer.
    */
  def backButtonDown(): scala.Boolean = js.native
  /**
    * Checks to see if the back button was just released on this Pointer.
    */
  def backButtonReleased(): scala.Boolean = js.native
  /**
    * Destroys this Pointer instance and resets its external references.
    */
  def destroy(): scala.Unit = js.native
  /**
    * Checks to see if the forward button is being held down on this Pointer.
    */
  def forwardButtonDown(): scala.Boolean = js.native
  /**
    * Checks to see if the forward button was just released on this Pointer.
    */
  def forwardButtonReleased(): scala.Boolean = js.native
  /**
    * If the Pointer has a button pressed down at the time this method is called, it will return the
    * angle between the Pointer's `downX` and `downY` values and the current position.
    * 
    * If no button is held down, it will return the last recorded angle, based on where
    * the Pointer was when the button was released.
    * 
    * The angle is based on the old position facing to the current position.
    * 
    * If you wish to get the current angle, based on the velocity of the Pointer, then
    * see the `Pointer.angle` property.
    */
  def getAngle(): scala.Double = js.native
  /**
    * If the Pointer has a button pressed down at the time this method is called, it will return the
    * distance between the Pointer's `downX` and `downY` values and the current position.
    * 
    * If no button is held down, it will return the last recorded distance, based on where
    * the Pointer was when the button was released.
    * 
    * If you wish to get the distance being travelled currently, based on the velocity of the Pointer,
    * then see the `Pointer.distance` property.
    */
  def getDistance(): scala.Double = js.native
  /**
    * If the Pointer has a button pressed down at the time this method is called, it will return the
    * horizontal distance between the Pointer's `downX` and `downY` values and the current position.
    * 
    * If no button is held down, it will return the last recorded horizontal distance, based on where
    * the Pointer was when the button was released.
    */
  def getDistanceX(): scala.Double = js.native
  /**
    * If the Pointer has a button pressed down at the time this method is called, it will return the
    * vertical distance between the Pointer's `downX` and `downY` values and the current position.
    * 
    * If no button is held down, it will return the last recorded vertical distance, based on where
    * the Pointer was when the button was released.
    */
  def getDistanceY(): scala.Double = js.native
  /**
    * If the Pointer has a button pressed down at the time this method is called, it will return the
    * duration since the button was pressed down.
    * 
    * If no button is held down, it will return the last recorded duration, based on the time
    * the Pointer button was released.
    */
  def getDuration(): scala.Double = js.native
  /**
    * Takes the previous and current Pointer positions and then generates an array of interpolated values between
    * the two. The array will be populated up to the size of the `steps` argument.
    * 
    * ```javaScript
    * var points = pointer.getInterpolatedPosition(4);
    * 
    * // points[0] = { x: 0, y: 0 }
    * // points[1] = { x: 2, y: 1 }
    * // points[2] = { x: 3, y: 2 }
    * // points[3] = { x: 6, y: 3 }
    * ```
    * 
    * Use this if you need to get smoothed values between the previous and current pointer positions. DOM pointer
    * events can often fire faster than the main browser loop, and this will help you avoid janky movement
    * especially if you have an object following a Pointer.
    * 
    * Note that if you provide an output array it will only be populated up to the number of steps provided.
    * It will not clear any previous data that may have existed beyond the range of the steps count.
    * 
    * Internally it uses the Smooth Step interpolation calculation.
    * @param steps The number of interpolation steps to use. Default 10.
    * @param out An array to store the results in. If not provided a new one will be created.
    */
  def getInterpolatedPosition(): js.Array[_] = js.native
  def getInterpolatedPosition(steps: phaserLib.integer): js.Array[_] = js.native
  def getInterpolatedPosition(steps: phaserLib.integer, out: js.Array[_]): js.Array[_] = js.native
  /**
    * Checks to see if the left button is being held down on this Pointer.
    */
  def leftButtonDown(): scala.Boolean = js.native
  /**
    * Checks to see if the left button was just released on this Pointer.
    */
  def leftButtonReleased(): scala.Boolean = js.native
  /**
    * Checks to see if the middle button is being held down on this Pointer.
    */
  def middleButtonDown(): scala.Boolean = js.native
  /**
    * Checks to see if the middle button was just released on this Pointer.
    */
  def middleButtonReleased(): scala.Boolean = js.native
  /**
    * Checks to see if any buttons are being held down on this Pointer.
    */
  def noButtonDown(): scala.Boolean = js.native
  /**
    * Takes a Camera and returns a Vector2 containing the translated position of this Pointer
    * within that Camera. This can be used to convert this Pointers position into camera space.
    * @param camera The Camera to use for the translation.
    * @param output A Vector2-like object in which to store the translated position.
    */
  def positionToCamera(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): phaserLib.PhaserNs.MathNs.Vector2 | js.Object = js.native
  def positionToCamera(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera, output: js.Object): phaserLib.PhaserNs.MathNs.Vector2 | js.Object = js.native
  def positionToCamera(camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera, output: phaserLib.PhaserNs.MathNs.Vector2): phaserLib.PhaserNs.MathNs.Vector2 | js.Object = js.native
  /**
    * Checks to see if the right button is being held down on this Pointer.
    */
  def rightButtonDown(): scala.Boolean = js.native
  /**
    * Checks to see if the right button was just released on this Pointer.
    */
  def rightButtonReleased(): scala.Boolean = js.native
}

