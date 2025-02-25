package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for additional options for embedded Tweets.
  */
trait TwitterTweetWidgetOptions extends TwitterWidgetOptions {
  /**
    * Float the embedded Tweet to the left or right so that text wraps around it, or align center so it floats in the middle of a paragraph.
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Toggle whether to render expanded media through Twitter Cards in Tweets. Also applies to images uploaded to Twitter.
    */
  var cards: js.UndefOr[
    twitterDashForDashWebLib.twitterDashForDashWebLibStrings.hidden | twitterDashForDashWebLib.twitterDashForDashWebLibStrings.visible
  ] = js.undefined
  /**
    * For Tweets that are replies, the previous Tweet in the thread will be displayed by default. Use none to hide the thread and show a Tweet alone.
    */
  var conversation: js.UndefOr[
    twitterDashForDashWebLib.twitterDashForDashWebLibStrings.none | twitterDashForDashWebLib.twitterDashForDashWebLibStrings.all
  ] = js.undefined
  /**
    * Adjust the color of links inside the widget.
    */
  var linkColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Toggle the default colorscheme of the widget.
    */
  var theme: js.UndefOr[
    twitterDashForDashWebLib.twitterDashForDashWebLibStrings.dark | twitterDashForDashWebLib.twitterDashForDashWebLibStrings.light
  ] = js.undefined
  /**
    * Fix the width of the embedded widget.
    */
  var width: js.UndefOr[scala.Double | twitterDashForDashWebLib.twitterDashForDashWebLibStrings.auto] = js.undefined
}

object TwitterTweetWidgetOptions {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    cards: twitterDashForDashWebLib.twitterDashForDashWebLibStrings.hidden | twitterDashForDashWebLib.twitterDashForDashWebLibStrings.visible = null,
    conversation: twitterDashForDashWebLib.twitterDashForDashWebLibStrings.none | twitterDashForDashWebLib.twitterDashForDashWebLibStrings.all = null,
    dnt: js.UndefOr[scala.Boolean] = js.undefined,
    hashtags: java.lang.String = null,
    lang: java.lang.String = null,
    linkColor: java.lang.String = null,
    related: java.lang.String = null,
    theme: twitterDashForDashWebLib.twitterDashForDashWebLibStrings.dark | twitterDashForDashWebLib.twitterDashForDashWebLibStrings.light = null,
    via: java.lang.String = null,
    width: scala.Double | twitterDashForDashWebLib.twitterDashForDashWebLibStrings.auto = null
  ): TwitterTweetWidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (cards != null) __obj.updateDynamic("cards")(cards.asInstanceOf[js.Any])
    if (conversation != null) __obj.updateDynamic("conversation")(conversation.asInstanceOf[js.Any])
    if (!js.isUndefined(dnt)) __obj.updateDynamic("dnt")(dnt)
    if (hashtags != null) __obj.updateDynamic("hashtags")(hashtags)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (linkColor != null) __obj.updateDynamic("linkColor")(linkColor)
    if (related != null) __obj.updateDynamic("related")(related)
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (via != null) __obj.updateDynamic("via")(via)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitterTweetWidgetOptions]
  }
}

