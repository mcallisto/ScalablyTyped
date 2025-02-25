package typings
package awesompleteLib.awesompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoFirst: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[
    js.Function2[/* item */ Suggestion, /* input */ java.lang.String, java.lang.String]
  ] = js.undefined
  var filter: js.UndefOr[
    js.Function2[/* text */ java.lang.String, /* input */ java.lang.String, scala.Boolean]
  ] = js.undefined
  var item: js.UndefOr[
    js.Function2[/* text */ java.lang.String, /* input */ java.lang.String, stdLib.HTMLElement]
  ] = js.undefined
  var list: js.UndefOr[
    java.lang.String | (js.Array[
      awesompleteLib.Anon_LabelValue | java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
    ]) | stdLib.Element
  ] = js.undefined
  var maxItems: js.UndefOr[scala.Double] = js.undefined
  var minChars: js.UndefOr[scala.Double] = js.undefined
  var replace: js.UndefOr[js.Function1[/* text */ java.lang.String, scala.Unit]] = js.undefined
  var sort: js.UndefOr[scala.Boolean | SortFunction] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoFirst: js.UndefOr[scala.Boolean] = js.undefined,
    data: (/* item */ Suggestion, /* input */ java.lang.String) => java.lang.String = null,
    filter: (/* text */ java.lang.String, /* input */ java.lang.String) => scala.Boolean = null,
    item: (/* text */ java.lang.String, /* input */ java.lang.String) => stdLib.HTMLElement = null,
    list: java.lang.String | (js.Array[
      awesompleteLib.Anon_LabelValue | java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
    ]) | stdLib.Element = null,
    maxItems: scala.Int | scala.Double = null,
    minChars: scala.Int | scala.Double = null,
    replace: /* text */ java.lang.String => scala.Unit = null,
    sort: scala.Boolean | SortFunction = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFirst)) __obj.updateDynamic("autoFirst")(autoFirst)
    if (data != null) __obj.updateDynamic("data")(js.Any.fromFunction2(data))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2(filter))
    if (item != null) __obj.updateDynamic("item")(js.Any.fromFunction2(item))
    if (list != null) __obj.updateDynamic("list")(list.asInstanceOf[js.Any])
    if (maxItems != null) __obj.updateDynamic("maxItems")(maxItems.asInstanceOf[js.Any])
    if (minChars != null) __obj.updateDynamic("minChars")(minChars.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction1(replace))
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

