package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonCard extends js.Object {
  /**
    * If `true`, a button tag will be rendered and the card will be tappable.
    */
  var button: scala.Boolean
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * If `true`, the user cannot interact with the card.
    */
  var disabled: scala.Boolean
  /**
    * This attribute instructs browsers to download a URL instead of navigating to it, so the user will be prompted to save it as a local file. If the attribute has a value, it is used as the pre-filled file name in the Save prompt (the user can still change the file name if they want).
    */
  var download: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Contains a URL or a URL fragment that the hyperlink points to. If this property is set, an anchor tag will be rendered.
    */
  var href: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: js.UndefOr[
    atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md
  ] = js.undefined
  /**
    * Specifies the relationship of the target object to the link object. The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
    */
  var rel: js.UndefOr[java.lang.String] = js.undefined
  /**
    * When using a router, it specifies the transition direction when navigating to another page using `href`.
    */
  var routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  /**
    * Specifies where to display the linked URL. Only applies when an `href` is provided. Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
    */
  var target: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the button. Only used when an `onclick` or `button` property is present.
    */
  var `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button
}

object IonCard {
  @scala.inline
  def apply(
    button: scala.Boolean,
    disabled: scala.Boolean,
    routerDirection: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any,
    `type`: atIonicCoreLib.atIonicCoreLibStrings.submit | atIonicCoreLib.atIonicCoreLibStrings.reset | atIonicCoreLib.atIonicCoreLibStrings.button,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null,
    download: java.lang.String = null,
    href: java.lang.String = null,
    mode: atIonicCoreLib.atIonicCoreLibStrings.ios | atIonicCoreLib.atIonicCoreLibStrings.md = null,
    rel: java.lang.String = null,
    target: java.lang.String = null
  ): IonCard = {
    val __obj = js.Dynamic.literal(button = button, disabled = disabled, routerDirection = routerDirection)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (download != null) __obj.updateDynamic("download")(download)
    if (href != null) __obj.updateDynamic("href")(href)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (rel != null) __obj.updateDynamic("rel")(rel)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[IonCard]
  }
}

