package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonRoute extends js.Object {
  /**
    * Name of the component to load/select in the navigation outlet (`ion-tabs`, `ion-nav`) when the route matches.  The value of this property is not always the tagname of the component to load, in `ion-tabs` it actually refers to the name of the `ion-tab` to select.
    */
  var component: java.lang.String
  /**
    * A key value `{ 'red': true, 'blue': 'white'}` containing props that should be passed to the defined component when rendered.
    */
  var componentProps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
    * Relative path that needs to match in order for this route to apply.  Accepts paths similar to expressjs so that you can define parameters in the url /foo/:bar where bar would be available in incoming props.
    */
  var url: java.lang.String
}

object IonRoute {
  @scala.inline
  def apply(
    component: java.lang.String,
    url: java.lang.String,
    componentProps: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): IonRoute = {
    val __obj = js.Dynamic.literal(component = component, url = url)
    if (componentProps != null) __obj.updateDynamic("componentProps")(componentProps)
    __obj.asInstanceOf[IonRoute]
  }
}

