package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocatorAddressesToLocationsParams
  extends stdLib.Object {
  /**
    * The input addresses in the format supported by the geocode service. If the service supports 'Single Line Input' the input addresses will be in the following format:
    * ```js
    * {
    *   "OBJECTID": 0,
    *   "Single Line Input":"77 Main St, Plymouth, NH 03264"
    * }
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressesToLocations)
    */
  var addresses: js.Array[_]
  /**
    * Limit result to one or more categories. For example, "Populated Place" or "Scandinavian Food". Only applies to the World Geocode Service. See [Category filtering (World Geocoding Service)](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm#ESRI_SECTION1_502B3FE2028145D7B189C25B1A00E17B) for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressesToLocations)
    */
  var categories: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Limits the results to only search in the country provided. For example `US` for United States or `SE` for Sweden. Only applies to the World Geocode Service. See the [World Geocoding Service documentation](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm) for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressesToLocations)
    */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Define the type of location, either `"street"` or `"rooftop"`, of the point returned from the [World Geocoding Service](https://developers.arcgis.com/rest/geocode/api-reference/geocoding-category-filtering.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-Locator.html#addressesToLocations)
    */
  var locationType: js.UndefOr[java.lang.String] = js.undefined
}

object LocatorAddressesToLocationsParams {
  @scala.inline
  def apply(
    addresses: js.Array[_],
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    categories: js.Array[java.lang.String] = null,
    countryCode: java.lang.String = null,
    locationType: java.lang.String = null
  ): LocatorAddressesToLocationsParams = {
    val __obj = js.Dynamic.literal(addresses = addresses, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (locationType != null) __obj.updateDynamic("locationType")(locationType)
    __obj.asInstanceOf[LocatorAddressesToLocationsParams]
  }
}

