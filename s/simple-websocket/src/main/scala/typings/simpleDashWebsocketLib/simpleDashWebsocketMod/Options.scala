package typings
package simpleDashWebsocketLib.simpleDashWebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends nodeLib.streamMod.DuplexOptions {
  /** raw websocket instance to wrap */
  var socket: js.UndefOr[wsLib.wsMod.^] = js.undefined
  /** websocket server url */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    autoDestroy: js.UndefOr[scala.Boolean] = js.undefined,
    decodeStrings: js.UndefOr[scala.Boolean] = js.undefined,
    defaultEncoding: java.lang.String = null,
    destroy: js.ThisFunction2[
      /* this */ nodeLib.streamMod.Readable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    destroy_DuplexOptions: js.ThisFunction2[
      /* this */ nodeLib.streamMod.Duplex, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    emitClose: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    `final`: js.ThisFunction1[
      (/* this */ nodeLib.streamMod.Duplex) | (/* this */ nodeLib.streamMod.Writable), 
      /* callback */ js.Function1[js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    highWaterMark: scala.Int | scala.Double = null,
    objectMode: js.UndefOr[scala.Boolean] = js.undefined,
    read: js.ThisFunction1[/* this */ nodeLib.streamMod.Readable, /* size */ scala.Double, scala.Unit] = null,
    read_DuplexOptions: js.ThisFunction1[/* this */ nodeLib.streamMod.Duplex, /* size */ scala.Double, scala.Unit] = null,
    readableObjectMode: js.UndefOr[scala.Boolean] = js.undefined,
    socket: wsLib.wsMod.^ = null,
    url: java.lang.String = null,
    writableObjectMode: js.UndefOr[scala.Boolean] = js.undefined,
    write: js.ThisFunction3[
      (/* this */ nodeLib.streamMod.Duplex) | (/* this */ nodeLib.streamMod.Writable), 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    writev: js.ThisFunction2[
      (/* this */ nodeLib.streamMod.Duplex) | (/* this */ nodeLib.streamMod.Writable), 
      /* chunks */ js.Array[nodeLib.Anon_Chunk], 
      /* callback */ js.Function1[js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (!js.isUndefined(autoDestroy)) __obj.updateDynamic("autoDestroy")(autoDestroy)
    if (!js.isUndefined(decodeStrings)) __obj.updateDynamic("decodeStrings")(decodeStrings)
    if (defaultEncoding != null) __obj.updateDynamic("defaultEncoding")(defaultEncoding)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (destroy_DuplexOptions != null) __obj.updateDynamic("destroy")(destroy_DuplexOptions)
    if (!js.isUndefined(emitClose)) __obj.updateDynamic("emitClose")(emitClose)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    if (highWaterMark != null) __obj.updateDynamic("highWaterMark")(highWaterMark.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode)
    if (read != null) __obj.updateDynamic("read")(read)
    if (read_DuplexOptions != null) __obj.updateDynamic("read")(read_DuplexOptions)
    if (!js.isUndefined(readableObjectMode)) __obj.updateDynamic("readableObjectMode")(readableObjectMode)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(writableObjectMode)) __obj.updateDynamic("writableObjectMode")(writableObjectMode)
    if (write != null) __obj.updateDynamic("write")(write)
    if (writev != null) __obj.updateDynamic("writev")(writev)
    __obj.asInstanceOf[Options]
  }
}

