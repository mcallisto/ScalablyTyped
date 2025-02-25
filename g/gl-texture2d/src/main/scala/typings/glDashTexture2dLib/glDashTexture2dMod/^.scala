package typings
package glDashTexture2dLib.glDashTexture2dMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-texture2d", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(gl: stdLib.WebGLRenderingContext, array: ndarrayLib.ndarrayMod.ndarray[scala.Double]): Texture = js.native
  def apply(
    gl: stdLib.WebGLRenderingContext,
    input: InputType | RawObject | (js.Tuple2[scala.Double, scala.Double])
  ): Texture = js.native
  def apply(
    gl: stdLib.WebGLRenderingContext,
    input: InputType | RawObject | (js.Tuple2[scala.Double, scala.Double]),
    format: glDashTexture2dLib.GLenum
  ): Texture = js.native
  def apply(
    gl: stdLib.WebGLRenderingContext,
    input: InputType | RawObject | (js.Tuple2[scala.Double, scala.Double]),
    format: glDashTexture2dLib.GLenum,
    `type`: glDashTexture2dLib.GLenum
  ): Texture = js.native
}

