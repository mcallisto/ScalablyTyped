package typings
package remarkableLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateBlock extends js.Object {
  var bMarks: js.Array[scala.Double]
  /** required block content indent */
  var blkIndent: scala.Double
  /** Indent of the current dd block, -1 if there isn't any */
  var ddIndent: scala.Double
  var eMarks: js.Array[scala.Double]
  var env: Env
  var level: scala.Double
  /** line index in src */
  var line: scala.Double
  /** lines count */
  var lineMax: scala.Double
  var options: Options
  /** If `list`, block parser stops on two newlines */
  var parentType: remarkableLib.remarkableLibStrings.root | remarkableLib.remarkableLibStrings.list
  /** Shortcuts to simplify nested calls */
  var parser: ParserBlock
  var result: java.lang.String
  var src: java.lang.String
  var tShift: js.Array[scala.Double]
  /** loose/tight mode for lists */
  var tight: scala.Boolean
  var tokens: js.Array[BlockContentToken]
  def getLines(begin: scala.Double, end: scala.Double, indent: scala.Double, keepLastLF: scala.Boolean): java.lang.String
  def isEmpty(line: scala.Double): scala.Boolean
  def skipChars(pos: scala.Double, code: scala.Double): scala.Double
  def skipEmptyLines(from: scala.Double): scala.Double
  def skipSpaces(pos: scala.Double): scala.Double
}

object StateBlock {
  @scala.inline
  def apply(
    bMarks: js.Array[scala.Double],
    blkIndent: scala.Double,
    ddIndent: scala.Double,
    eMarks: js.Array[scala.Double],
    env: Env,
    getLines: (scala.Double, scala.Double, scala.Double, scala.Boolean) => java.lang.String,
    isEmpty: scala.Double => scala.Boolean,
    level: scala.Double,
    line: scala.Double,
    lineMax: scala.Double,
    options: Options,
    parentType: remarkableLib.remarkableLibStrings.root | remarkableLib.remarkableLibStrings.list,
    parser: ParserBlock,
    result: java.lang.String,
    skipChars: (scala.Double, scala.Double) => scala.Double,
    skipEmptyLines: scala.Double => scala.Double,
    skipSpaces: scala.Double => scala.Double,
    src: java.lang.String,
    tShift: js.Array[scala.Double],
    tight: scala.Boolean,
    tokens: js.Array[BlockContentToken]
  ): StateBlock = {
    val __obj = js.Dynamic.literal(bMarks = bMarks, blkIndent = blkIndent, ddIndent = ddIndent, eMarks = eMarks, env = env, getLines = js.Any.fromFunction4(getLines), isEmpty = js.Any.fromFunction1(isEmpty), level = level, line = line, lineMax = lineMax, options = options, parentType = parentType.asInstanceOf[js.Any], parser = parser, result = result, skipChars = js.Any.fromFunction2(skipChars), skipEmptyLines = js.Any.fromFunction1(skipEmptyLines), skipSpaces = js.Any.fromFunction1(skipSpaces), src = src, tShift = tShift, tight = tight, tokens = tokens)
  
    __obj.asInstanceOf[StateBlock]
  }
}

