package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferenceData extends js.Object {
  var conferenceId: js.UndefOr[java.lang.String] = js.undefined
  var conferenceSolution: js.UndefOr[ConferenceSolution] = js.undefined
  var createRequest: js.UndefOr[CreateConferenceRequest] = js.undefined
  var entryPoints: js.UndefOr[js.Array[EntryPoint]] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var parameters: js.UndefOr[ConferenceParameters] = js.undefined
  var signature: js.UndefOr[java.lang.String] = js.undefined
}

object ConferenceData {
  @scala.inline
  def apply(
    conferenceId: java.lang.String = null,
    conferenceSolution: ConferenceSolution = null,
    createRequest: CreateConferenceRequest = null,
    entryPoints: js.Array[EntryPoint] = null,
    notes: java.lang.String = null,
    parameters: ConferenceParameters = null,
    signature: java.lang.String = null
  ): ConferenceData = {
    val __obj = js.Dynamic.literal()
    if (conferenceId != null) __obj.updateDynamic("conferenceId")(conferenceId)
    if (conferenceSolution != null) __obj.updateDynamic("conferenceSolution")(conferenceSolution)
    if (createRequest != null) __obj.updateDynamic("createRequest")(createRequest)
    if (entryPoints != null) __obj.updateDynamic("entryPoints")(entryPoints)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[ConferenceData]
  }
}

