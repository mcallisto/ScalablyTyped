package typings
package inboxsdkLib.inboxsdkMod.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutocompleteSearchResultText
  extends AutocompleteSearchResultBase
     with AutocompleteSearchResult {
  var description: java.lang.String
  var name: java.lang.String
}

object AutocompleteSearchResultText {
  @scala.inline
  def apply(
    description: java.lang.String,
    name: java.lang.String,
    externalURL: java.lang.String = null,
    iconHTML: java.lang.String = null,
    iconUrl: java.lang.String = null,
    onClick: () => scala.Unit = null,
    routeName: java.lang.String = null,
    routeParams: js.Array[java.lang.String] = null
  ): AutocompleteSearchResultText = {
    val __obj = js.Dynamic.literal(description = description, name = name)
    if (externalURL != null) __obj.updateDynamic("externalURL")(externalURL)
    if (iconHTML != null) __obj.updateDynamic("iconHTML")(iconHTML)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (routeName != null) __obj.updateDynamic("routeName")(routeName)
    if (routeParams != null) __obj.updateDynamic("routeParams")(routeParams)
    __obj.asInstanceOf[AutocompleteSearchResultText]
  }
}

