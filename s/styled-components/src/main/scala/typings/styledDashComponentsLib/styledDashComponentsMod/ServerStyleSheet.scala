package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("styled-components", "ServerStyleSheet")
@js.native
class ServerStyleSheet () extends js.Object {
  val instance: this.type = js.native
  def collectStyles(tree: reactLib.reactMod.ReactNode): reactLib.reactMod.ReactElement = js.native
  def getStyleElement(): js.Array[reactLib.reactMod.ReactElement] = js.native
  def getStyleTags(): java.lang.String = js.native
  def interleaveWithNodeStream(readableStream: styledDashComponentsLib.styledDashComponentsMod.Global.NodeJSNs.ReadableStream): styledDashComponentsLib.styledDashComponentsMod.Global.NodeJSNs.ReadableStream = js.native
  def seal(): scala.Unit = js.native
}

