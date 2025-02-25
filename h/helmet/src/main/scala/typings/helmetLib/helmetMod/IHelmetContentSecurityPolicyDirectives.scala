package typings
package helmetLib.helmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHelmetContentSecurityPolicyDirectives extends js.Object {
  var `base-uri`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var baseUri: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `block-all-mixed-content`: js.UndefOr[scala.Boolean] = js.undefined
  var blockAllMixedContent: js.UndefOr[scala.Boolean] = js.undefined
  var `child-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var childSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `connect-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var connectSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `default-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var defaultSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `font-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var fontSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `form-action`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var formAction: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `frame-ancestors`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `frame-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var frameAncestors: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var frameSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `img-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var imgSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `manifest-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var manifestSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `media-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var mediaSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `object-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var objectSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `plugin-types`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var pluginTypes: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `prefetch-src`: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var prefetchSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `report-to`: js.UndefOr[HelmetCspDirectiveValue] = js.undefined
  var `report-uri`: js.UndefOr[HelmetCspDirectiveValue] = js.undefined
  var reportTo: js.UndefOr[HelmetCspDirectiveValue] = js.undefined
  var reportUri: js.UndefOr[HelmetCspDirectiveValue] = js.undefined
  var `require-sri-for`: js.UndefOr[js.Array[HelmetCspRequireSriForValue]] = js.undefined
  var requireSriFor: js.UndefOr[js.Array[HelmetCspRequireSriForValue]] = js.undefined
  var sandbox: js.UndefOr[js.Array[HelmetCspSandboxDirective]] = js.undefined
  var `script-src`: js.UndefOr[HelmetCspDirectiveValue] = js.undefined
  var scriptSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `style-src`: js.UndefOr[HelmetCspDirectiveValue] = js.undefined
  var styleSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
  var `upgrade-insecure-requests`: js.UndefOr[scala.Boolean] = js.undefined
  var upgradeInsecureRequests: js.UndefOr[scala.Boolean] = js.undefined
  var `worker-src`: js.UndefOr[HelmetCspDirectiveValue] = js.undefined
  var workerSrc: js.UndefOr[js.Array[HelmetCspDirectiveValue]] = js.undefined
}

object IHelmetContentSecurityPolicyDirectives {
  @scala.inline
  def apply(
    `base-uri`: js.Array[HelmetCspDirectiveValue] = null,
    baseUri: js.Array[HelmetCspDirectiveValue] = null,
    `block-all-mixed-content`: js.UndefOr[scala.Boolean] = js.undefined,
    blockAllMixedContent: js.UndefOr[scala.Boolean] = js.undefined,
    `child-src`: js.Array[HelmetCspDirectiveValue] = null,
    childSrc: js.Array[HelmetCspDirectiveValue] = null,
    `connect-src`: js.Array[HelmetCspDirectiveValue] = null,
    connectSrc: js.Array[HelmetCspDirectiveValue] = null,
    `default-src`: js.Array[HelmetCspDirectiveValue] = null,
    defaultSrc: js.Array[HelmetCspDirectiveValue] = null,
    `font-src`: js.Array[HelmetCspDirectiveValue] = null,
    fontSrc: js.Array[HelmetCspDirectiveValue] = null,
    `form-action`: js.Array[HelmetCspDirectiveValue] = null,
    formAction: js.Array[HelmetCspDirectiveValue] = null,
    `frame-ancestors`: js.Array[HelmetCspDirectiveValue] = null,
    `frame-src`: js.Array[HelmetCspDirectiveValue] = null,
    frameAncestors: js.Array[HelmetCspDirectiveValue] = null,
    frameSrc: js.Array[HelmetCspDirectiveValue] = null,
    `img-src`: js.Array[HelmetCspDirectiveValue] = null,
    imgSrc: js.Array[HelmetCspDirectiveValue] = null,
    `manifest-src`: js.Array[HelmetCspDirectiveValue] = null,
    manifestSrc: js.Array[HelmetCspDirectiveValue] = null,
    `media-src`: js.Array[HelmetCspDirectiveValue] = null,
    mediaSrc: js.Array[HelmetCspDirectiveValue] = null,
    `object-src`: js.Array[HelmetCspDirectiveValue] = null,
    objectSrc: js.Array[HelmetCspDirectiveValue] = null,
    `plugin-types`: js.Array[HelmetCspDirectiveValue] = null,
    pluginTypes: js.Array[HelmetCspDirectiveValue] = null,
    `prefetch-src`: js.Array[HelmetCspDirectiveValue] = null,
    prefetchSrc: js.Array[HelmetCspDirectiveValue] = null,
    `report-to`: HelmetCspDirectiveValue = null,
    `report-uri`: HelmetCspDirectiveValue = null,
    reportTo: HelmetCspDirectiveValue = null,
    reportUri: HelmetCspDirectiveValue = null,
    `require-sri-for`: js.Array[HelmetCspRequireSriForValue] = null,
    requireSriFor: js.Array[HelmetCspRequireSriForValue] = null,
    sandbox: js.Array[HelmetCspSandboxDirective] = null,
    `script-src`: HelmetCspDirectiveValue = null,
    scriptSrc: js.Array[HelmetCspDirectiveValue] = null,
    `style-src`: HelmetCspDirectiveValue = null,
    styleSrc: js.Array[HelmetCspDirectiveValue] = null,
    `upgrade-insecure-requests`: js.UndefOr[scala.Boolean] = js.undefined,
    upgradeInsecureRequests: js.UndefOr[scala.Boolean] = js.undefined,
    `worker-src`: HelmetCspDirectiveValue = null,
    workerSrc: js.Array[HelmetCspDirectiveValue] = null
  ): IHelmetContentSecurityPolicyDirectives = {
    val __obj = js.Dynamic.literal()
    if (`base-uri` != null) __obj.updateDynamic("base-uri")(`base-uri`)
    if (baseUri != null) __obj.updateDynamic("baseUri")(baseUri)
    if (!js.isUndefined(`block-all-mixed-content`)) __obj.updateDynamic("block-all-mixed-content")(`block-all-mixed-content`)
    if (!js.isUndefined(blockAllMixedContent)) __obj.updateDynamic("blockAllMixedContent")(blockAllMixedContent)
    if (`child-src` != null) __obj.updateDynamic("child-src")(`child-src`)
    if (childSrc != null) __obj.updateDynamic("childSrc")(childSrc)
    if (`connect-src` != null) __obj.updateDynamic("connect-src")(`connect-src`)
    if (connectSrc != null) __obj.updateDynamic("connectSrc")(connectSrc)
    if (`default-src` != null) __obj.updateDynamic("default-src")(`default-src`)
    if (defaultSrc != null) __obj.updateDynamic("defaultSrc")(defaultSrc)
    if (`font-src` != null) __obj.updateDynamic("font-src")(`font-src`)
    if (fontSrc != null) __obj.updateDynamic("fontSrc")(fontSrc)
    if (`form-action` != null) __obj.updateDynamic("form-action")(`form-action`)
    if (formAction != null) __obj.updateDynamic("formAction")(formAction)
    if (`frame-ancestors` != null) __obj.updateDynamic("frame-ancestors")(`frame-ancestors`)
    if (`frame-src` != null) __obj.updateDynamic("frame-src")(`frame-src`)
    if (frameAncestors != null) __obj.updateDynamic("frameAncestors")(frameAncestors)
    if (frameSrc != null) __obj.updateDynamic("frameSrc")(frameSrc)
    if (`img-src` != null) __obj.updateDynamic("img-src")(`img-src`)
    if (imgSrc != null) __obj.updateDynamic("imgSrc")(imgSrc)
    if (`manifest-src` != null) __obj.updateDynamic("manifest-src")(`manifest-src`)
    if (manifestSrc != null) __obj.updateDynamic("manifestSrc")(manifestSrc)
    if (`media-src` != null) __obj.updateDynamic("media-src")(`media-src`)
    if (mediaSrc != null) __obj.updateDynamic("mediaSrc")(mediaSrc)
    if (`object-src` != null) __obj.updateDynamic("object-src")(`object-src`)
    if (objectSrc != null) __obj.updateDynamic("objectSrc")(objectSrc)
    if (`plugin-types` != null) __obj.updateDynamic("plugin-types")(`plugin-types`)
    if (pluginTypes != null) __obj.updateDynamic("pluginTypes")(pluginTypes)
    if (`prefetch-src` != null) __obj.updateDynamic("prefetch-src")(`prefetch-src`)
    if (prefetchSrc != null) __obj.updateDynamic("prefetchSrc")(prefetchSrc)
    if (`report-to` != null) __obj.updateDynamic("report-to")(`report-to`.asInstanceOf[js.Any])
    if (`report-uri` != null) __obj.updateDynamic("report-uri")(`report-uri`.asInstanceOf[js.Any])
    if (reportTo != null) __obj.updateDynamic("reportTo")(reportTo.asInstanceOf[js.Any])
    if (reportUri != null) __obj.updateDynamic("reportUri")(reportUri.asInstanceOf[js.Any])
    if (`require-sri-for` != null) __obj.updateDynamic("require-sri-for")(`require-sri-for`)
    if (requireSriFor != null) __obj.updateDynamic("requireSriFor")(requireSriFor)
    if (sandbox != null) __obj.updateDynamic("sandbox")(sandbox)
    if (`script-src` != null) __obj.updateDynamic("script-src")(`script-src`.asInstanceOf[js.Any])
    if (scriptSrc != null) __obj.updateDynamic("scriptSrc")(scriptSrc)
    if (`style-src` != null) __obj.updateDynamic("style-src")(`style-src`.asInstanceOf[js.Any])
    if (styleSrc != null) __obj.updateDynamic("styleSrc")(styleSrc)
    if (!js.isUndefined(`upgrade-insecure-requests`)) __obj.updateDynamic("upgrade-insecure-requests")(`upgrade-insecure-requests`)
    if (!js.isUndefined(upgradeInsecureRequests)) __obj.updateDynamic("upgradeInsecureRequests")(upgradeInsecureRequests)
    if (`worker-src` != null) __obj.updateDynamic("worker-src")(`worker-src`.asInstanceOf[js.Any])
    if (workerSrc != null) __obj.updateDynamic("workerSrc")(workerSrc)
    __obj.asInstanceOf[IHelmetContentSecurityPolicyDirectives]
  }
}

