package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Triangle Shape is a Game Object that can be added to a Scene, Group or Container. You can
  * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
  * it for input or physics. It provides a quick and easy way for you to render this shape in your
  * game without using a texture, while still taking advantage of being fully batched in WebGL.
  * 
  * This shape supports both fill and stroke colors.
  * 
  * The Triangle consists of 3 lines, joining up to form a triangular shape. You can control the
  * position of each point of these lines. The triangle is always closed and cannot have an open
  * face. If you require that, consider using a Polygon instead.
  */
@JSGlobal("Phaser.GameObjects.Triangle")
@js.native
class Triangle protected () extends Shape {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs. A Game Object can only belong to one Scene at a time.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param x1 The horizontal position of the first point in the triangle. Default 0.
    * @param y1 The vertical position of the first point in the triangle. Default 128.
    * @param x2 The horizontal position of the second point in the triangle. Default 64.
    * @param y2 The vertical position of the second point in the triangle. Default 0.
    * @param x3 The horizontal position of the third point in the triangle. Default 128.
    * @param y3 The vertical position of the third point in the triangle. Default 128.
    * @param fillColor The color the triangle will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the triangle will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def this(scene: phaserLib.PhaserNs.Scene, x: js.UndefOr[scala.Double], y: js.UndefOr[scala.Double], x1: js.UndefOr[scala.Double], y1: js.UndefOr[scala.Double], x2: js.UndefOr[scala.Double], y2: js.UndefOr[scala.Double], x3: js.UndefOr[scala.Double], y3: js.UndefOr[scala.Double], fillColor: js.UndefOr[scala.Double], fillAlpha: js.UndefOr[scala.Double]) = this()
  /**
    * Sets the data for the lines that make up this Triangle shape.
    * @param x1 The horizontal position of the first point in the triangle. Default 0.
    * @param y1 The vertical position of the first point in the triangle. Default 0.
    * @param x2 The horizontal position of the second point in the triangle. Default 0.
    * @param y2 The vertical position of the second point in the triangle. Default 0.
    * @param x3 The horizontal position of the third point in the triangle. Default 0.
    * @param y3 The vertical position of the third point in the triangle. Default 0.
    */
  def setTo(
    x1: js.UndefOr[scala.Double],
    y1: js.UndefOr[scala.Double],
    x2: js.UndefOr[scala.Double],
    y2: js.UndefOr[scala.Double],
    x3: js.UndefOr[scala.Double],
    y3: js.UndefOr[scala.Double]
  ): this.type = js.native
}

