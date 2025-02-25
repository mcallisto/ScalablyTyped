package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatSegmentsParams extends GenericParams {
  var format: java.lang.String
  var h: js.UndefOr[NameList] = js.undefined
  var help: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[NameList] = js.undefined
  var v: js.UndefOr[scala.Boolean] = js.undefined
}

object CatSegmentsParams {
  @scala.inline
  def apply(
    format: java.lang.String,
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    h: NameList = null,
    help: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    index: NameList = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    v: js.UndefOr[scala.Boolean] = js.undefined
  ): CatSegmentsParams = {
    val __obj = js.Dynamic.literal(format = format)
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[CatSegmentsParams]
  }
}

