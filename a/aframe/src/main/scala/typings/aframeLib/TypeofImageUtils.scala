package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofImageUtils extends js.Object {
  var crossOrigin: java.lang.String = js.native
  def loadTexture(url: java.lang.String): threeLib.srcTexturesTextureMod.Texture = js.native
  def loadTexture(url: java.lang.String, mapping: threeLib.srcConstantsMod.Mapping): threeLib.srcTexturesTextureMod.Texture = js.native
  def loadTexture(
    url: java.lang.String,
    mapping: threeLib.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ threeLib.srcTexturesTextureMod.Texture, scala.Unit]
  ): threeLib.srcTexturesTextureMod.Texture = js.native
  def loadTexture(
    url: java.lang.String,
    mapping: threeLib.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ threeLib.srcTexturesTextureMod.Texture, scala.Unit],
    onError: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): threeLib.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(array: js.Array[java.lang.String]): threeLib.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(array: js.Array[java.lang.String], mapping: threeLib.srcConstantsMod.Mapping): threeLib.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[java.lang.String],
    mapping: threeLib.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ threeLib.srcTexturesTextureMod.Texture, scala.Unit]
  ): threeLib.srcTexturesTextureMod.Texture = js.native
  def loadTextureCube(
    array: js.Array[java.lang.String],
    mapping: threeLib.srcConstantsMod.Mapping,
    onLoad: js.Function1[/* texture */ threeLib.srcTexturesTextureMod.Texture, scala.Unit],
    onError: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): threeLib.srcTexturesTextureMod.Texture = js.native
}

