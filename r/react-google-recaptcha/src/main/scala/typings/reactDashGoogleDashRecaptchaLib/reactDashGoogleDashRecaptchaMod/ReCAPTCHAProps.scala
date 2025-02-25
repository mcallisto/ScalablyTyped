package typings
package reactDashGoogleDashRecaptchaLib.reactDashGoogleDashRecaptchaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReCAPTCHAProps extends js.Object {
  /**
  	 * Optional. The badge location for g-recaptcha with size of "invisible".
  	 *
  	 * @default "bottomright"
  	 */
  var badge: js.UndefOr[Badge] = js.undefined
  /**
  	 *  The function to be called when the user successfully completes the normal or compat captcha.
  	 * 	It will also be called with null, when captcha expires
  	 *  @param token string or null
  	 */
  var onChange: js.UndefOr[js.Function1[/* token */ java.lang.String | scala.Null, scala.Unit]] = js.undefined
  /**
  	 *  Optional callback, called when reCAPTCHA encounters an error (usually network connectivity)
  	 *  and cannot continue until connectivity is restored. If you specify a function here, you are
  	 *  responsible for informing the user that they should retry.
  	 */
  var onErrored: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  	 *  Optional callback, called when a challenge expires and has to be redone by the user.
  	 */
  var onExpired: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  	 *  The API client key
  	 */
  var sitekey: java.lang.String
  /**
  	 *  Optional compact, normal or invisible. This allows you to change the size or do an invisible captcha
  	 */
  var size: js.UndefOr[Size] = js.undefined
  /**
  	 *  Optional set the stoken parameter, which allows the captcha to be used from different domains,
  	 *  @see reCAPTCHA secure-token
  	 */
  var stoken: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 *  Optional the tabindex of the element
  	 *  @default 0
  	 */
  var tabindex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 *  Optional light or dark theme of the widget
  	 *  @default "light"
  	 */
  var theme: js.UndefOr[Theme] = js.undefined
  /**
  	 * Optional image or audio The type of initial captcha
  	 * @default "image"
  	 */
  var `type`: js.UndefOr[Type] = js.undefined
}

object ReCAPTCHAProps {
  @scala.inline
  def apply(
    sitekey: java.lang.String,
    badge: Badge = null,
    onChange: /* token */ java.lang.String | scala.Null => scala.Unit = null,
    onErrored: () => scala.Unit = null,
    onExpired: () => scala.Unit = null,
    size: Size = null,
    stoken: java.lang.String = null,
    tabindex: scala.Int | scala.Double = null,
    theme: Theme = null,
    `type`: Type = null
  ): ReCAPTCHAProps = {
    val __obj = js.Dynamic.literal(sitekey = sitekey)
    if (badge != null) __obj.updateDynamic("badge")(badge)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onErrored != null) __obj.updateDynamic("onErrored")(js.Any.fromFunction0(onErrored))
    if (onExpired != null) __obj.updateDynamic("onExpired")(js.Any.fromFunction0(onExpired))
    if (size != null) __obj.updateDynamic("size")(size)
    if (stoken != null) __obj.updateDynamic("stoken")(stoken)
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReCAPTCHAProps]
  }
}

