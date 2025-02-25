package typings
package papaparseLib.papaparseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseConfig extends js.Object {
   // default: undefined
  var beforeFirstChunk: js.UndefOr[js.Function1[/* chunk */ java.lang.String, java.lang.String | scala.Unit]] = js.undefined
   // default: undefined
  var chunk: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, scala.Unit]] = js.undefined
   // default: false
  var comments: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
   // default: undefined
  var complete: js.UndefOr[
    js.Function2[/* results */ ParseResult, /* file */ js.UndefOr[stdLib.File], scala.Unit]
  ] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
   // default: false
  var download: js.UndefOr[scala.Boolean] = js.undefined
   // default: false
  var dynamicTyping: js.UndefOr[
    scala.Boolean | (org.scalablytyped.runtime.StringDictionary[scala.Boolean] with org.scalablytyped.runtime.NumberDictionary[scala.Boolean]) | (js.Function1[/* field */ java.lang.String | scala.Double, scala.Boolean])
  ] = js.undefined
   // default: 0
  var encoding: js.UndefOr[java.lang.String] = js.undefined
   // default: undefined
  var error: js.UndefOr[
    js.Function2[/* error */ ParseError, /* file */ js.UndefOr[stdLib.File], scala.Unit]
  ] = js.undefined
   // default: false
  var fastMode: js.UndefOr[scala.Boolean] = js.undefined
   // default: '"'
  var header: js.UndefOr[scala.Boolean] = js.undefined
   // default: ","
  var newline: js.UndefOr[java.lang.String] = js.undefined
   // default: false
  var preview: js.UndefOr[scala.Double] = js.undefined
   // default: "\r\n"
  var quoteChar: js.UndefOr[java.lang.String] = js.undefined
   // default: false
  var skipEmptyLines: js.UndefOr[scala.Boolean | papaparseLib.papaparseLibStrings.greedy] = js.undefined
   // default: undefined
  // Callbacks
  var step: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, scala.Unit]] = js.undefined
   // default: undefined
  var transform: js.UndefOr[
    js.Function2[/* value */ java.lang.String, /* field */ java.lang.String | scala.Double, _]
  ] = js.undefined
   // default: undefined
  var transformHeader: js.UndefOr[js.Function1[/* header */ java.lang.String, java.lang.String]] = js.undefined
   // default: false
  var trimHeaders: js.UndefOr[scala.Boolean] = js.undefined
   // default: undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
   // default: ""
  var worker: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseConfig {
  @scala.inline
  def apply(
    beforeFirstChunk: /* chunk */ java.lang.String => java.lang.String | scala.Unit = null,
    chunk: (/* results */ ParseResult, /* parser */ Parser) => scala.Unit = null,
    comments: scala.Boolean | java.lang.String = null,
    complete: (/* results */ ParseResult, /* file */ js.UndefOr[stdLib.File]) => scala.Unit = null,
    delimiter: java.lang.String = null,
    download: js.UndefOr[scala.Boolean] = js.undefined,
    dynamicTyping: scala.Boolean | (org.scalablytyped.runtime.StringDictionary[scala.Boolean] with org.scalablytyped.runtime.NumberDictionary[scala.Boolean]) | (js.Function1[/* field */ java.lang.String | scala.Double, scala.Boolean]) = null,
    encoding: java.lang.String = null,
    error: (/* error */ ParseError, /* file */ js.UndefOr[stdLib.File]) => scala.Unit = null,
    fastMode: js.UndefOr[scala.Boolean] = js.undefined,
    header: js.UndefOr[scala.Boolean] = js.undefined,
    newline: java.lang.String = null,
    preview: scala.Int | scala.Double = null,
    quoteChar: java.lang.String = null,
    skipEmptyLines: scala.Boolean | papaparseLib.papaparseLibStrings.greedy = null,
    step: (/* results */ ParseResult, /* parser */ Parser) => scala.Unit = null,
    transform: (/* value */ java.lang.String, /* field */ java.lang.String | scala.Double) => _ = null,
    transformHeader: /* header */ java.lang.String => java.lang.String = null,
    trimHeaders: js.UndefOr[scala.Boolean] = js.undefined,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined,
    worker: js.UndefOr[scala.Boolean] = js.undefined
  ): ParseConfig = {
    val __obj = js.Dynamic.literal()
    if (beforeFirstChunk != null) __obj.updateDynamic("beforeFirstChunk")(js.Any.fromFunction1(beforeFirstChunk))
    if (chunk != null) __obj.updateDynamic("chunk")(js.Any.fromFunction2(chunk))
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction2(complete))
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(download)) __obj.updateDynamic("download")(download)
    if (dynamicTyping != null) __obj.updateDynamic("dynamicTyping")(dynamicTyping.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction2(error))
    if (!js.isUndefined(fastMode)) __obj.updateDynamic("fastMode")(fastMode)
    if (!js.isUndefined(header)) __obj.updateDynamic("header")(header)
    if (newline != null) __obj.updateDynamic("newline")(newline)
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (quoteChar != null) __obj.updateDynamic("quoteChar")(quoteChar)
    if (skipEmptyLines != null) __obj.updateDynamic("skipEmptyLines")(skipEmptyLines.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(js.Any.fromFunction2(step))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    if (transformHeader != null) __obj.updateDynamic("transformHeader")(js.Any.fromFunction1(transformHeader))
    if (!js.isUndefined(trimHeaders)) __obj.updateDynamic("trimHeaders")(trimHeaders)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    if (!js.isUndefined(worker)) __obj.updateDynamic("worker")(worker)
    __obj.asInstanceOf[ParseConfig]
  }
}

