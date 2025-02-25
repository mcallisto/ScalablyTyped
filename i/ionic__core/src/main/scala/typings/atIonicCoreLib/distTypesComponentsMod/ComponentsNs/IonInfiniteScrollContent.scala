package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonInfiniteScrollContent extends js.Object {
  /**
    * An animated SVG spinner that shows while loading.
    */
  var loadingSpinner: js.UndefOr[
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any) | scala.Null
  ] = js.undefined
  /**
    * Optional text to display while loading. `loadingText` can accept either plaintext or HTML as a string. To display characters normally reserved for HTML, they must be escaped. For example `<Ionic>` would become `&lt;Ionic&gt;`  For more information: [Security Documentation](https://ionicframework.com/docs/faq/security)
    */
  var loadingText: js.UndefOr[java.lang.String] = js.undefined
}

object IonInfiniteScrollContent {
  @scala.inline
  def apply(
    loadingSpinner: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SpinnerTypes */ js.Any = null,
    loadingText: java.lang.String = null
  ): IonInfiniteScrollContent = {
    val __obj = js.Dynamic.literal()
    if (loadingSpinner != null) __obj.updateDynamic("loadingSpinner")(loadingSpinner)
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText)
    __obj.asInstanceOf[IonInfiniteScrollContent]
  }
}

