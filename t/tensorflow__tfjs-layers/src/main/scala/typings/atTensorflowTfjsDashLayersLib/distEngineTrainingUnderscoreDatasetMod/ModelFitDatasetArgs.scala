package typings
package atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreDatasetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelFitDatasetArgs[T] extends js.Object {
  /**
    * (Optional) Total number of steps (batches of samples) before
    * declaring one epoch finished and starting the next epoch. It should
    * typically be equal to the number of samples of your dataset divided by
    * the batch size, so that `fitDataset`() call can utilize the entire dataset.
    * If it is not provided, use `done` return value in `iterator.next()` as
    * signal to finish an epoch.
    */
  var batchesPerEpoch: js.UndefOr[scala.Double] = js.undefined
  /**
    * List of callbacks to be called during training.
    * Can have one or more of the following callbacks:
    *   - `onTrainBegin(logs)`: called when training starts.
    *   - `onTrainEnd(logs)`: called when training ends.
    *   - `onEpochBegin(epoch, logs)`: called at the start of every epoch.
    *   - `onEpochEnd(epoch, logs)`: called at the end of every epoch.
    *   - `onBatchBegin(batch, logs)`: called at the start of every batch.
    *   - `onBatchEnd(batch, logs)`: called at the end of every batch.
    *   - `onYield(epoch, batch, logs)`: called every `yieldEvery` milliseconds
    *      with the current epoch, batch and logs. The logs are the same
    *      as in `onBatchEnd()`. Note that `onYield` can skip batches or
    *      epochs. See also docs for `yieldEvery` below.
    */
  var callbacks: js.UndefOr[
    (js.Array[
      atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.BaseCallback | atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.CustomCallbackArgs
    ]) | atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.CustomCallbackArgs
  ] = js.undefined
  /**
    * The number of times to iterate over the training dataset.
    *
    * An integer.
    */
  var epochs: scala.Double
  /**
    * Epoch at which to start training (useful for resuming a previous training
    * run).
    */
  var initialEpoch: js.UndefOr[scala.Double] = js.undefined
  /**
    * Optional batch size for validation.
    *
    * Used only if `validationData` is an array of `tf.Tensor` objects, i.e., not
    * a dataset object.
    *
    * If not specified, its value defaults to 32.
    */
  var validationBatchSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * (Optional) Only relevant if `validationData` is specified and is a dataset
    * object.
    *
    * Total number of batches of samples to draw from `validationData` for
    * validation purpose before stopping at the end of every epoch. If not
    * specified, `evaluateDataset` will use `iterator.next().done` as signal to
    * stop validation.
    */
  var validationBatches: js.UndefOr[scala.Double] = js.undefined
  /**
    * Data on which to evaluate the loss and any model
    * metrics at the end of each epoch. The model will not be trained on this
    * data. This could be any of the following:
    *
    *   - An array `[xVal, yVal]`, where the two values may be `tf.Tensor`,
    *     an array of Tensors, or a map of string to Tensor.
    *   - Similarly, an array ` [xVal, yVal, valSampleWeights]`
    *     (not implemented yet).
    *   - a `Dataset` object with elements of the form `{xs: xVal, ys: yVal}`,
    *     where `xs` and `ys` are the feature and label tensors, respectively.
    *
    * If `validationData` is an Array of Tensor objects, each `tf.Tensor` will be
    * sliced into batches during validation, using the parameter
    * `validationBatchSize` (which defaults to 32). The entirety of the
    * `tf.Tensor` objects will be used in the validation.
    *
    * If `validationData` is a dataset object, and the `validationBatches`
    * parameter is specified, the validation will use `validationBatches` batches
    * drawn from the dataset object. If `validationBatches` parameter is not
    * specified, the validation will stop when the dataset is exhausted.
    *
    * The model will not be trained on this data.
    */
  var validationData: js.UndefOr[
    (js.Tuple2[
      atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap, 
      atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap
    ]) | (js.Tuple3[
      atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap, 
      atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap, 
      atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap
    ]) | atTensorflowTfjsDashLayersLib.distEngineDatasetUnderscoreStubMod.Dataset[T]
  ] = js.undefined
  /**
    * Verbosity level.
    *
    * Expected to be 0, 1, or 2. Default: 1.
    *
    * 0 - No printed message during fit() call.
    * 1 - In Node.js (tfjs-node), prints the progress bar, together with
    *     real-time updates of loss and metric values and training speed.
    *     In the browser: no action. This is the default.
    * 2 - Not implemented yet.
    */
  var verbose: js.UndefOr[
    atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity
  ] = js.undefined
  /**
    * Configures the frequency of yielding the main thread to other tasks.
    *
    * In the browser environment, yielding the main thread can improve the
    * responsiveness of the page during training. In the Node.js environment,
    * it can ensure tasks queued in the event loop can be handled in a timely
    * manner.
    *
    * The value can be one of the following:
    *   - `'auto'`: The yielding happens at a certain frame rate (currently set
    *               at 125ms). This is the default.
    *   - `'batch'`: yield every batch.
    *   - `'epoch'`: yield every epoch.
    *   - a `number`: Will yield every `number` milliseconds.
    *   - `'never'`: never yield. (But yielding can still happen through `await
    *      nextFrame()` calls in custom callbacks.)
    */
  var yieldEvery: js.UndefOr[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.YieldEveryOptions] = js.undefined
}

object ModelFitDatasetArgs {
  @scala.inline
  def apply[T](
    epochs: scala.Double,
    batchesPerEpoch: scala.Int | scala.Double = null,
    callbacks: (js.Array[
      atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.BaseCallback | atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.CustomCallbackArgs
    ]) | atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.CustomCallbackArgs = null,
    initialEpoch: scala.Int | scala.Double = null,
    validationBatchSize: scala.Int | scala.Double = null,
    validationBatches: scala.Int | scala.Double = null,
    validationData: (js.Tuple2[
      atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap, 
      atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap
    ]) | (js.Tuple3[
      atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap, 
      atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap, 
      atTensorflowTfjsDashLayersLib.distTypesMod.TensorOrArrayOrMap
    ]) | atTensorflowTfjsDashLayersLib.distEngineDatasetUnderscoreStubMod.Dataset[T] = null,
    verbose: atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.ModelLoggingVerbosity = null,
    yieldEvery: atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.YieldEveryOptions = null
  ): ModelFitDatasetArgs[T] = {
    val __obj = js.Dynamic.literal(epochs = epochs)
    if (batchesPerEpoch != null) __obj.updateDynamic("batchesPerEpoch")(batchesPerEpoch.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (initialEpoch != null) __obj.updateDynamic("initialEpoch")(initialEpoch.asInstanceOf[js.Any])
    if (validationBatchSize != null) __obj.updateDynamic("validationBatchSize")(validationBatchSize.asInstanceOf[js.Any])
    if (validationBatches != null) __obj.updateDynamic("validationBatches")(validationBatches.asInstanceOf[js.Any])
    if (validationData != null) __obj.updateDynamic("validationData")(validationData.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(verbose)
    if (yieldEvery != null) __obj.updateDynamic("yieldEvery")(yieldEvery.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelFitDatasetArgs[T]]
  }
}

