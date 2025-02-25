package typings
package backstopjsLib.backstopjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scenario extends js.Object {
  var clickSelector: js.UndefOr[java.lang.String] = js.undefined
   // Click the specified DOM element prior to screenshot
  var clickSelectors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // Simulates multiple sequential click interactions
  var cookiePath: js.UndefOr[java.lang.String] = js.undefined
   // Import cookies in JSON format
  var delay: js.UndefOr[scala.Double] = js.undefined
   // Wait for x milliseconds
  var expect: js.UndefOr[scala.Double] = js.undefined
   // Use with selectorExpansion true to expect number of results found
  var hideSelectors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // Selectors set to visibility: hidden
  var hoverSelector: js.UndefOr[java.lang.String] = js.undefined
   // Move pointer over the given DOM element prior to screenshot
  var hoverSelectors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // Simulates multiple sequential hover interactions
  var keyPressSelector: js.UndefOr[KeypressSelector] = js.undefined
   // Press key in the DOM element prior to screenshot
  var keyPressSelectors: js.UndefOr[js.Array[KeypressSelector]] = js.undefined
   // Simulates multiple sequential keypress interactions
  var label: java.lang.String
   // Tag saved with your reference images
  var misMatchThreshold: js.UndefOr[java.lang.String] = js.undefined
   // Percentage of different pixels allowed to pass test
  var onBeforeScript: js.UndefOr[java.lang.String] = js.undefined
   // Used to set up browser state e.g. cookies
  var onReadyScript: js.UndefOr[java.lang.String] = js.undefined
   // Used to modify UI state prior to screenshots e.g. hovers, clicks etc
  var postInteractionWait: js.UndefOr[scala.Double] = js.undefined
   // Wait for selector (ms) after interacting with hover or click
  var readyEvent: js.UndefOr[java.lang.String] = js.undefined
   // Wait until this string has been logged to the console
  var readySelector: js.UndefOr[java.lang.String] = js.undefined
   // Wait until this selector exists before continuing
  var referenceUrl: js.UndefOr[java.lang.String] = js.undefined
   // Specify a different state or environment when creating reference
  var removeSelectors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // Selectors set to display: none
  var requireSameDimensions: js.UndefOr[scala.Boolean] = js.undefined
   // If true, take screenshots of all matching selector instances
  var scrollToSelector: js.UndefOr[java.lang.String] = js.undefined
   // Selectors to capture
  var selectorExpansion: js.UndefOr[scala.Boolean] = js.undefined
   // If true, any change in selector size will trigger a failure
  var selectors: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // Scroll the specified DOM element into view prior to screenshots
  var url: java.lang.String
   // The url of your app state
  var viewports: js.UndefOr[js.Array[Viewport]] = js.undefined
}

object Scenario {
  @scala.inline
  def apply(
    label: java.lang.String,
    url: java.lang.String,
    clickSelector: java.lang.String = null,
    clickSelectors: js.Array[java.lang.String] = null,
    cookiePath: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    expect: scala.Int | scala.Double = null,
    hideSelectors: js.Array[java.lang.String] = null,
    hoverSelector: java.lang.String = null,
    hoverSelectors: js.Array[java.lang.String] = null,
    keyPressSelector: KeypressSelector = null,
    keyPressSelectors: js.Array[KeypressSelector] = null,
    misMatchThreshold: java.lang.String = null,
    onBeforeScript: java.lang.String = null,
    onReadyScript: java.lang.String = null,
    postInteractionWait: scala.Int | scala.Double = null,
    readyEvent: java.lang.String = null,
    readySelector: java.lang.String = null,
    referenceUrl: java.lang.String = null,
    removeSelectors: js.Array[java.lang.String] = null,
    requireSameDimensions: js.UndefOr[scala.Boolean] = js.undefined,
    scrollToSelector: java.lang.String = null,
    selectorExpansion: js.UndefOr[scala.Boolean] = js.undefined,
    selectors: js.Array[java.lang.String] = null,
    viewports: js.Array[Viewport] = null
  ): Scenario = {
    val __obj = js.Dynamic.literal(label = label, url = url)
    if (clickSelector != null) __obj.updateDynamic("clickSelector")(clickSelector)
    if (clickSelectors != null) __obj.updateDynamic("clickSelectors")(clickSelectors)
    if (cookiePath != null) __obj.updateDynamic("cookiePath")(cookiePath)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (expect != null) __obj.updateDynamic("expect")(expect.asInstanceOf[js.Any])
    if (hideSelectors != null) __obj.updateDynamic("hideSelectors")(hideSelectors)
    if (hoverSelector != null) __obj.updateDynamic("hoverSelector")(hoverSelector)
    if (hoverSelectors != null) __obj.updateDynamic("hoverSelectors")(hoverSelectors)
    if (keyPressSelector != null) __obj.updateDynamic("keyPressSelector")(keyPressSelector)
    if (keyPressSelectors != null) __obj.updateDynamic("keyPressSelectors")(keyPressSelectors)
    if (misMatchThreshold != null) __obj.updateDynamic("misMatchThreshold")(misMatchThreshold)
    if (onBeforeScript != null) __obj.updateDynamic("onBeforeScript")(onBeforeScript)
    if (onReadyScript != null) __obj.updateDynamic("onReadyScript")(onReadyScript)
    if (postInteractionWait != null) __obj.updateDynamic("postInteractionWait")(postInteractionWait.asInstanceOf[js.Any])
    if (readyEvent != null) __obj.updateDynamic("readyEvent")(readyEvent)
    if (readySelector != null) __obj.updateDynamic("readySelector")(readySelector)
    if (referenceUrl != null) __obj.updateDynamic("referenceUrl")(referenceUrl)
    if (removeSelectors != null) __obj.updateDynamic("removeSelectors")(removeSelectors)
    if (!js.isUndefined(requireSameDimensions)) __obj.updateDynamic("requireSameDimensions")(requireSameDimensions)
    if (scrollToSelector != null) __obj.updateDynamic("scrollToSelector")(scrollToSelector)
    if (!js.isUndefined(selectorExpansion)) __obj.updateDynamic("selectorExpansion")(selectorExpansion)
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    if (viewports != null) __obj.updateDynamic("viewports")(viewports)
    __obj.asInstanceOf[Scenario]
  }
}

