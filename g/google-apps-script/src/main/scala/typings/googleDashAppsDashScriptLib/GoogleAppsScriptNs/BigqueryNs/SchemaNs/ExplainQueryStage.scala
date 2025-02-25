package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.BigqueryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplainQueryStage extends js.Object {
  var completedParallelInputs: js.UndefOr[java.lang.String] = js.undefined
  var computeMsAvg: js.UndefOr[java.lang.String] = js.undefined
  var computeMsMax: js.UndefOr[java.lang.String] = js.undefined
  var computeRatioAvg: js.UndefOr[scala.Double] = js.undefined
  var computeRatioMax: js.UndefOr[scala.Double] = js.undefined
  var endMs: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var inputStages: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parallelInputs: js.UndefOr[java.lang.String] = js.undefined
  var readMsAvg: js.UndefOr[java.lang.String] = js.undefined
  var readMsMax: js.UndefOr[java.lang.String] = js.undefined
  var readRatioAvg: js.UndefOr[scala.Double] = js.undefined
  var readRatioMax: js.UndefOr[scala.Double] = js.undefined
  var recordsRead: js.UndefOr[java.lang.String] = js.undefined
  var recordsWritten: js.UndefOr[java.lang.String] = js.undefined
  var shuffleOutputBytes: js.UndefOr[java.lang.String] = js.undefined
  var shuffleOutputBytesSpilled: js.UndefOr[java.lang.String] = js.undefined
  var startMs: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var steps: js.UndefOr[js.Array[ExplainQueryStep]] = js.undefined
  var waitMsAvg: js.UndefOr[java.lang.String] = js.undefined
  var waitMsMax: js.UndefOr[java.lang.String] = js.undefined
  var waitRatioAvg: js.UndefOr[scala.Double] = js.undefined
  var waitRatioMax: js.UndefOr[scala.Double] = js.undefined
  var writeMsAvg: js.UndefOr[java.lang.String] = js.undefined
  var writeMsMax: js.UndefOr[java.lang.String] = js.undefined
  var writeRatioAvg: js.UndefOr[scala.Double] = js.undefined
  var writeRatioMax: js.UndefOr[scala.Double] = js.undefined
}

object ExplainQueryStage {
  @scala.inline
  def apply(
    completedParallelInputs: java.lang.String = null,
    computeMsAvg: java.lang.String = null,
    computeMsMax: java.lang.String = null,
    computeRatioAvg: scala.Int | scala.Double = null,
    computeRatioMax: scala.Int | scala.Double = null,
    endMs: java.lang.String = null,
    id: java.lang.String = null,
    inputStages: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    parallelInputs: java.lang.String = null,
    readMsAvg: java.lang.String = null,
    readMsMax: java.lang.String = null,
    readRatioAvg: scala.Int | scala.Double = null,
    readRatioMax: scala.Int | scala.Double = null,
    recordsRead: java.lang.String = null,
    recordsWritten: java.lang.String = null,
    shuffleOutputBytes: java.lang.String = null,
    shuffleOutputBytesSpilled: java.lang.String = null,
    startMs: java.lang.String = null,
    status: java.lang.String = null,
    steps: js.Array[ExplainQueryStep] = null,
    waitMsAvg: java.lang.String = null,
    waitMsMax: java.lang.String = null,
    waitRatioAvg: scala.Int | scala.Double = null,
    waitRatioMax: scala.Int | scala.Double = null,
    writeMsAvg: java.lang.String = null,
    writeMsMax: java.lang.String = null,
    writeRatioAvg: scala.Int | scala.Double = null,
    writeRatioMax: scala.Int | scala.Double = null
  ): ExplainQueryStage = {
    val __obj = js.Dynamic.literal()
    if (completedParallelInputs != null) __obj.updateDynamic("completedParallelInputs")(completedParallelInputs)
    if (computeMsAvg != null) __obj.updateDynamic("computeMsAvg")(computeMsAvg)
    if (computeMsMax != null) __obj.updateDynamic("computeMsMax")(computeMsMax)
    if (computeRatioAvg != null) __obj.updateDynamic("computeRatioAvg")(computeRatioAvg.asInstanceOf[js.Any])
    if (computeRatioMax != null) __obj.updateDynamic("computeRatioMax")(computeRatioMax.asInstanceOf[js.Any])
    if (endMs != null) __obj.updateDynamic("endMs")(endMs)
    if (id != null) __obj.updateDynamic("id")(id)
    if (inputStages != null) __obj.updateDynamic("inputStages")(inputStages)
    if (name != null) __obj.updateDynamic("name")(name)
    if (parallelInputs != null) __obj.updateDynamic("parallelInputs")(parallelInputs)
    if (readMsAvg != null) __obj.updateDynamic("readMsAvg")(readMsAvg)
    if (readMsMax != null) __obj.updateDynamic("readMsMax")(readMsMax)
    if (readRatioAvg != null) __obj.updateDynamic("readRatioAvg")(readRatioAvg.asInstanceOf[js.Any])
    if (readRatioMax != null) __obj.updateDynamic("readRatioMax")(readRatioMax.asInstanceOf[js.Any])
    if (recordsRead != null) __obj.updateDynamic("recordsRead")(recordsRead)
    if (recordsWritten != null) __obj.updateDynamic("recordsWritten")(recordsWritten)
    if (shuffleOutputBytes != null) __obj.updateDynamic("shuffleOutputBytes")(shuffleOutputBytes)
    if (shuffleOutputBytesSpilled != null) __obj.updateDynamic("shuffleOutputBytesSpilled")(shuffleOutputBytesSpilled)
    if (startMs != null) __obj.updateDynamic("startMs")(startMs)
    if (status != null) __obj.updateDynamic("status")(status)
    if (steps != null) __obj.updateDynamic("steps")(steps)
    if (waitMsAvg != null) __obj.updateDynamic("waitMsAvg")(waitMsAvg)
    if (waitMsMax != null) __obj.updateDynamic("waitMsMax")(waitMsMax)
    if (waitRatioAvg != null) __obj.updateDynamic("waitRatioAvg")(waitRatioAvg.asInstanceOf[js.Any])
    if (waitRatioMax != null) __obj.updateDynamic("waitRatioMax")(waitRatioMax.asInstanceOf[js.Any])
    if (writeMsAvg != null) __obj.updateDynamic("writeMsAvg")(writeMsAvg)
    if (writeMsMax != null) __obj.updateDynamic("writeMsMax")(writeMsMax)
    if (writeRatioAvg != null) __obj.updateDynamic("writeRatioAvg")(writeRatioAvg.asInstanceOf[js.Any])
    if (writeRatioMax != null) __obj.updateDynamic("writeRatioMax")(writeRatioMax.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplainQueryStage]
  }
}

