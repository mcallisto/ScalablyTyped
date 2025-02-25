package typings
package relayDashRuntimeLib.relayDashRuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderRefetchableFragment extends ReaderFragment {
  @JSName("metadata")
  val metadata_ReaderRefetchableFragment: relayDashRuntimeLib.Anon_ConnectionRefetch
}

object ReaderRefetchableFragment {
  @scala.inline
  def apply(
    argumentDefinitions: js.Array[ReaderArgumentDefinition],
    kind: java.lang.String,
    metadata: relayDashRuntimeLib.Anon_ConnectionRefetch,
    name: java.lang.String,
    selections: js.Array[ReaderSelection],
    `type`: java.lang.String
  ): ReaderRefetchableFragment = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions, kind = kind, metadata = metadata, name = name, selections = selections)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ReaderRefetchableFragment]
  }
}

