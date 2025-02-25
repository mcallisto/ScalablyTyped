package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 控制台访问对象
	* @detail 全局对象。可用于提示信息，警告和错误记录。通过启动配置文件，可将日志定位到不同的设备，以便于跟踪。日志支持格式化输出，例如：,```JavaScript,console.log("%d + %d = %d", 100, 200, 100 + 200);,```,可以使用的格式化参数如下：,- %s - 字符串,- %d - 数字，包括整数和数字,- %j - 以 JSON 格式输出对象,- %% - 输出字符 '%' 本身
	*/
@JSImport("console", JSImport.Namespace)
@js.native
object consoleMod extends js.Object {
  val ALERT: fibjsLib.fibjsLibNumbers.`1` = js.native
  val CRIT: fibjsLib.fibjsLibNumbers.`2` = js.native
  val DEBUG: fibjsLib.fibjsLibNumbers.`7` = js.native
  val ERROR: fibjsLib.fibjsLibNumbers.`3` = js.native
  val FATAL: fibjsLib.fibjsLibNumbers.`0` = js.native
  val INFO: fibjsLib.fibjsLibNumbers.`6` = js.native
  val NOTICE: fibjsLib.fibjsLibNumbers.`5` = js.native
  val NOTSET: fibjsLib.fibjsLibNumbers.`10` = js.native
  val PRINT: fibjsLib.fibjsLibNumbers.`9` = js.native
  val WARN: fibjsLib.fibjsLibNumbers.`4` = js.native
  val height: scala.Double = js.native
  val loglevel: scala.Double = js.native
  val width: scala.Double = js.native
  def add(cfg: js.Array[_]): scala.Unit = js.native
  def add(cfg: js.Object): scala.Unit = js.native
  def add(`type`: java.lang.String): scala.Unit = js.native
  def alert(args: js.Any*): scala.Unit = js.native
  def alert(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def assert(value: js.Any): scala.Unit = js.native
  def assert(value: js.Any, msg: java.lang.String): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def clickMouse(button: java.lang.String): scala.Unit = js.native
  def clickMouse(button: java.lang.String, dbclick: scala.Boolean): scala.Unit = js.native
  def crit(args: js.Any*): scala.Unit = js.native
  def crit(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def debug(args: js.Any*): scala.Unit = js.native
  def debug(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def dir(obj: js.Any): scala.Unit = js.native
  def error(args: js.Any*): scala.Unit = js.native
  def error(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def hideCursor(): scala.Unit = js.native
  def info(args: js.Any*): scala.Unit = js.native
  def info(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def keyDown(key: java.lang.String): scala.Unit = js.native
  def keyDown(key: java.lang.String, modifier: java.lang.String): scala.Unit = js.native
  def keyDown(key: java.lang.String, modifier: js.Array[_]): scala.Unit = js.native
  def keyTap(key: java.lang.String): scala.Unit = js.native
  def keyTap(key: java.lang.String, modifier: java.lang.String): scala.Unit = js.native
  def keyTap(key: java.lang.String, modifier: js.Array[_]): scala.Unit = js.native
  def keyUp(key: java.lang.String): scala.Unit = js.native
  def keyUp(key: java.lang.String, modifier: java.lang.String): scala.Unit = js.native
  def keyUp(key: java.lang.String, modifier: js.Array[_]): scala.Unit = js.native
  def log(args: js.Any*): scala.Unit = js.native
  def log(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def mouseDown(button: java.lang.String): scala.Unit = js.native
  def mouseUp(button: java.lang.String): scala.Unit = js.native
  def moveMouse(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def moveTo(row: scala.Double, column: scala.Double): scala.Unit = js.native
  def notice(args: js.Any*): scala.Unit = js.native
  def notice(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def print(args: js.Any*): scala.Unit = js.native
  def print(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
  def readLine(): java.lang.String = js.native
  def readLine(msg: java.lang.String): java.lang.String = js.native
  def reset(): scala.Unit = js.native
  def showCursor(): scala.Unit = js.native
  def time(): scala.Unit = js.native
  def time(label: java.lang.String): scala.Unit = js.native
  def timeElapse(): scala.Unit = js.native
  def timeElapse(label: java.lang.String): scala.Unit = js.native
  def timeEnd(): scala.Unit = js.native
  def timeEnd(label: java.lang.String): scala.Unit = js.native
  def trace(): scala.Unit = js.native
  def trace(label: java.lang.String): scala.Unit = js.native
  def typeString(text: java.lang.String): scala.Unit = js.native
  def warn(args: js.Any*): scala.Unit = js.native
  def warn(fmt: java.lang.String, args: js.Any*): scala.Unit = js.native
}

