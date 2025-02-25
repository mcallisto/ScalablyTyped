package typings
package atTensorflowTfjsDashDataLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MicrophoneConfig extends js.Object {
  var audioTrackConstraints: js.UndefOr[stdLib.MediaTrackConstraints] = js.undefined
  var columnTruncateLength: js.UndefOr[scala.Double] = js.undefined
  var fftSize: js.UndefOr[scala.Double] = js.undefined
  var includeSpectrogram: js.UndefOr[scala.Boolean] = js.undefined
  var includeWaveform: js.UndefOr[scala.Boolean] = js.undefined
  var numFramesPerSpectrogram: js.UndefOr[scala.Double] = js.undefined
  var sampleRateHz: js.UndefOr[
    atTensorflowTfjsDashDataLib.atTensorflowTfjsDashDataLibNumbers.`44100` | atTensorflowTfjsDashDataLib.atTensorflowTfjsDashDataLibNumbers.`48000`
  ] = js.undefined
  var smoothingTimeConstant: js.UndefOr[scala.Double] = js.undefined
}

object MicrophoneConfig {
  @scala.inline
  def apply(
    audioTrackConstraints: stdLib.MediaTrackConstraints = null,
    columnTruncateLength: scala.Int | scala.Double = null,
    fftSize: scala.Int | scala.Double = null,
    includeSpectrogram: js.UndefOr[scala.Boolean] = js.undefined,
    includeWaveform: js.UndefOr[scala.Boolean] = js.undefined,
    numFramesPerSpectrogram: scala.Int | scala.Double = null,
    sampleRateHz: atTensorflowTfjsDashDataLib.atTensorflowTfjsDashDataLibNumbers.`44100` | atTensorflowTfjsDashDataLib.atTensorflowTfjsDashDataLibNumbers.`48000` = null,
    smoothingTimeConstant: scala.Int | scala.Double = null
  ): MicrophoneConfig = {
    val __obj = js.Dynamic.literal()
    if (audioTrackConstraints != null) __obj.updateDynamic("audioTrackConstraints")(audioTrackConstraints)
    if (columnTruncateLength != null) __obj.updateDynamic("columnTruncateLength")(columnTruncateLength.asInstanceOf[js.Any])
    if (fftSize != null) __obj.updateDynamic("fftSize")(fftSize.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSpectrogram)) __obj.updateDynamic("includeSpectrogram")(includeSpectrogram)
    if (!js.isUndefined(includeWaveform)) __obj.updateDynamic("includeWaveform")(includeWaveform)
    if (numFramesPerSpectrogram != null) __obj.updateDynamic("numFramesPerSpectrogram")(numFramesPerSpectrogram.asInstanceOf[js.Any])
    if (sampleRateHz != null) __obj.updateDynamic("sampleRateHz")(sampleRateHz.asInstanceOf[js.Any])
    if (smoothingTimeConstant != null) __obj.updateDynamic("smoothingTimeConstant")(smoothingTimeConstant.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicrophoneConfig]
  }
}

