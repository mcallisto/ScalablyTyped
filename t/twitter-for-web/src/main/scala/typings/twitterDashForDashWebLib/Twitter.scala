package typings
package twitterDashForDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for Twitter for Websites.
  */
trait Twitter extends TwitterLike {
  /**
    * Twitter events.
    */
  var events: TwitterEvents
  /**
    * Twitter widgets.
    */
  var widgets: TwitterWidgets
}

object Twitter {
  @scala.inline
  def apply(
    events: TwitterEvents,
    ready: js.Function1[/* twttr */ Twitter, scala.Unit] => scala.Unit,
    widgets: TwitterWidgets
  ): Twitter = {
    val __obj = js.Dynamic.literal(events = events, ready = js.Any.fromFunction1(ready), widgets = widgets)
  
    __obj.asInstanceOf[Twitter]
  }
}

