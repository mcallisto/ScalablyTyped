package typings
package jsonfileLib.jsonfileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FS extends js.Object {
  @JSName("readFileSync")
  var readFileSync_Original: jsonfileLib.Fn_Options = js.native
  @JSName("readFile")
  var readFile_Original: jsonfileLib.Anon_Callback = js.native
  @JSName("writeFileSync")
  var writeFileSync_Original: jsonfileLib.Fn_Data = js.native
  @JSName("writeFile")
  var writeFile_Original: jsonfileLib.Anon_CallbackData = js.native
  def readFile(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* data */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    path: nodeLib.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      (/* data */ nodeLib.Buffer) | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    path: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      nodeLib.Buffer | (/* data */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingFlagNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* data */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingFlagString,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* data */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingFlag,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* data */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    path: nodeLib.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      (/* data */ nodeLib.Buffer) | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    path: scala.Double,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* data */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    path: scala.Double,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      (/* data */ nodeLib.Buffer) | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    path: scala.Double,
    options: java.lang.String,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      nodeLib.Buffer | (/* data */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    path: scala.Double,
    options: nodeLib.Anon_EncodingFlagNull,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* data */ java.lang.String | nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    path: scala.Double,
    options: nodeLib.Anon_EncodingFlagString,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* data */ java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    path: scala.Double,
    options: nodeLib.Anon_EncodingFlag,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* data */ nodeLib.Buffer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFile(
    path: scala.Double,
    options: scala.Null,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      (/* data */ nodeLib.Buffer) | java.lang.String, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readFileSync(path: nodeLib.fsMod.PathLike): java.lang.String | nodeLib.Buffer = js.native
  def readFileSync(path: nodeLib.fsMod.PathLike, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  def readFileSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFlag): nodeLib.Buffer = js.native
  def readFileSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFlagNull): java.lang.String | nodeLib.Buffer = js.native
  def readFileSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFlagString): java.lang.String = js.native
  def readFileSync(path: scala.Double): java.lang.String | nodeLib.Buffer = js.native
  def readFileSync(path: scala.Double, options: java.lang.String): java.lang.String | nodeLib.Buffer = js.native
  def readFileSync(path: scala.Double, options: nodeLib.Anon_EncodingFlag): nodeLib.Buffer = js.native
  def readFileSync(path: scala.Double, options: nodeLib.Anon_EncodingFlagNull): java.lang.String | nodeLib.Buffer = js.native
  def readFileSync(path: scala.Double, options: nodeLib.Anon_EncodingFlagString): java.lang.String = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(path: nodeLib.fsMod.PathLike): nodeLib.Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_Buffer(path: scala.Double): nodeLib.Buffer = js.native
  @JSName("readFileSync")
  def readFileSync_String(path: nodeLib.fsMod.PathLike, options: java.lang.String): java.lang.String = js.native
  @JSName("readFileSync")
  def readFileSync_String(path: scala.Double, options: java.lang.String): java.lang.String = js.native
  def writeFile(
    path: nodeLib.fsMod.PathLike,
    data: js.Any,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    path: nodeLib.fsMod.PathLike,
    data: js.Any,
    options: nodeLib.fsMod.WriteFileOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    path: scala.Double,
    data: js.Any,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    path: scala.Double,
    data: js.Any,
    options: nodeLib.fsMod.WriteFileOptions,
    callback: js.Function1[/* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def writeFileSync(path: nodeLib.fsMod.PathLike, data: js.Any): scala.Unit = js.native
  def writeFileSync(path: nodeLib.fsMod.PathLike, data: js.Any, options: nodeLib.fsMod.WriteFileOptions): scala.Unit = js.native
  def writeFileSync(path: scala.Double, data: js.Any): scala.Unit = js.native
  def writeFileSync(path: scala.Double, data: js.Any, options: nodeLib.fsMod.WriteFileOptions): scala.Unit = js.native
}

