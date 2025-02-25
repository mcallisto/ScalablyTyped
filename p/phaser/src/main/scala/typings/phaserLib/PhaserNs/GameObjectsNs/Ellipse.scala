package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Ellipse Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports both fill and stroke colors.
  * 
  * When it renders it displays an ellipse shape. You can control the width and height of the ellipse.
  * If the width and height match it will render as a circle. If the width is less than the height,
  * it will look more like an egg shape.
  * 
  * The Ellipse shape also has a `smoothness` property and corresponding `setSmoothness` method.
  * This allows you to control how smooth the shape renders in WebGL, by controlling the number of iterations
  * that take place during construction. Increase and decrease the default value for smoother, or more
  * jagged, shapes.
  */
@JSGlobal("Phaser.GameObjects.Ellipse")
@js.native
class Ellipse protected () extends Shape {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param width The width of the ellipse. An ellipse with equal width and height renders as a circle. Default 128.
    * @param height The height of the ellipse. An ellipse with equal width and height renders as a circle. Default 128.
    * @param fillColor The color the ellipse will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the ellipse will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def this(scene: phaserLib.PhaserNs.Scene, x: js.UndefOr[scala.Double], y: js.UndefOr[scala.Double], width: js.UndefOr[scala.Double], height: js.UndefOr[scala.Double], fillColor: js.UndefOr[scala.Double], fillAlpha: js.UndefOr[scala.Double]) = this()
  /**
    * The smoothness of the ellipse. The number of points used when rendering it.
    * Increase this value for a smoother ellipse, at the cost of more polygons being rendered.
    */
  var smoothness: phaserLib.integer = js.native
  /**
    * Sets the smoothness of the ellipse. The number of points used when rendering it.
    * Increase this value for a smoother ellipse, at the cost of more polygons being rendered.
    * This call can be chained.
    * @param value The value to set the smoothness to.
    */
  def setSmoothness(value: phaserLib.integer): this.type = js.native
}

