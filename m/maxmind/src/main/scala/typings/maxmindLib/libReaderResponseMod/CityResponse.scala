package typings
package maxmindLib.libReaderResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- maxmindLib.libReaderResponseMod.Response because Already inherited */ trait CityResponse extends CountryResponse {
  val city: js.UndefOr[CityRecord] = js.undefined
  val location: js.UndefOr[LocationRecord] = js.undefined
  val postal: js.UndefOr[PostalRecord] = js.undefined
  val subdivisions: js.UndefOr[js.Array[SubdivisionsRecord]] = js.undefined
}

object CityResponse {
  @scala.inline
  def apply(
    city: CityRecord = null,
    continent: ContinentRecord = null,
    country: CountryRecord = null,
    location: LocationRecord = null,
    postal: PostalRecord = null,
    registered_country: RegisteredCountryRecord = null,
    represented_country: RepresentedCountryRecord = null,
    subdivisions: js.Array[SubdivisionsRecord] = null,
    traits: TraitsRecord = null
  ): CityResponse = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (continent != null) __obj.updateDynamic("continent")(continent)
    if (country != null) __obj.updateDynamic("country")(country)
    if (location != null) __obj.updateDynamic("location")(location)
    if (postal != null) __obj.updateDynamic("postal")(postal)
    if (registered_country != null) __obj.updateDynamic("registered_country")(registered_country)
    if (represented_country != null) __obj.updateDynamic("represented_country")(represented_country)
    if (subdivisions != null) __obj.updateDynamic("subdivisions")(subdivisions)
    if (traits != null) __obj.updateDynamic("traits")(traits)
    __obj.asInstanceOf[CityResponse]
  }
}

