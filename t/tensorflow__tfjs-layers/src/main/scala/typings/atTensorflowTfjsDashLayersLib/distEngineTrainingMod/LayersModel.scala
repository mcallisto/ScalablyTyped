package typings
package atTensorflowTfjsDashLayersLib.distEngineTrainingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- atTensorflowTfjsDashCoreLib.distModelUnderscoreTypesMod.InferenceModel because var conflicts: inputs, outputs. Inlined execute, execute, execute, execute, execute, execute, predict, predict, predict */ @JSImport("@tensorflow/tfjs-layers/dist/engine/training", "LayersModel")
@js.native
class LayersModel protected ()
  extends atTensorflowTfjsDashLayersLib.distEngineContainerMod.Container {
  def this(args: atTensorflowTfjsDashLayersLib.distEngineContainerMod.ContainerArgs) = this()
  /**
    * Get number of samples provided for training, evaluation or prediction.
    *
    * @param ins Input `tf.Tensor`.
    * @param batchSize Integer batch size, optional.
    * @param steps Total number of steps (batches of samples) before
    * declaring loop finished. Optional.
    * @param stepsName The public API's parameter name for `steps`.
    * @returns Number of samples provided.
    */
  var checkNumSamples: js.Any = js.native
  var collectedTrainableWeights: js.Any = js.native
  var feedLossFns: js.Any = js.native
  var feedOutputShapes: js.Any = js.native
  var history: atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History = js.native
  var isOptimizerOwned: scala.Boolean = js.native
  var isTraining: scala.Boolean = js.native
  var loss: java.lang.String | (js.Array[atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn | java.lang.String]) | (org.scalablytyped.runtime.StringDictionary[atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn | java.lang.String]) | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn = js.native
  var lossFunctions: js.Array[atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn] = js.native
  /**
    * Create a function which, when invoked with an array of `tf.Tensor`s as a
    * batch of inputs, returns the prespecified loss and metrics of the model
    * under the batch of input data.
    */
  var makeTestFunction: js.Any = js.native
  var metrics: java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn | (js.Array[java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn]) | (org.scalablytyped.runtime.StringDictionary[java.lang.String | atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn]) = js.native
  var metricsNames: js.Array[java.lang.String] = js.native
  var metricsTensors: js.Array[
    js.Tuple2[atTensorflowTfjsDashLayersLib.distTypesMod.LossOrMetricFn, scala.Double]
  ] = js.native
  var optimizer: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Optimizer = js.native
  var optimizer_ : atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Optimizer = js.native
  /**
    * Helper method to loop over some data in batches.
    *
    * Porting Note: Not using the functional approach in the Python equivalent
    *   due to the imperative backend.
    * Porting Note: Does not support step mode currently.
    *
    * @param ins: input data
    * @param batchSize: integer batch size.
    * @param verbose: verbosity model
    * @returns: Predictions as `tf.Tensor` (if a single output) or an `Array` of
    *   `tf.Tensor` (if multipe outputs).
    */
  var predictLoop: js.Any = js.native
  /**
    * Retrieve the model's internal symbolic tensors from symbolic-tensor names.
    */
  var retrieveSymbolicTensors: js.Any = js.native
  /**
    * Setter used for force stopping of LayersModel.fit() (i.e., training).
    *
    * Example:
    *
    * ```js
    * const input = tf.input({shape: [10]});
    * const output = tf.layers.dense({units: 1}).apply(input);
    * const model = tf.model({inputs: [input], outputs: [output]});
    * model.compile({loss: 'meanSquaredError', optimizer: 'sgd'});
    * const xs = tf.ones([8, 10]);
    * const ys = tf.zeros([8, 1]);
    *
    * const history = await model.fit(xs, ys, {
    *   epochs: 10,
    *   callbacks: {
    *     onEpochEnd: async (epoch, logs) => {
    *       if (epoch === 2) {
    *         model.stopTraining = true;
    *       }
    *     }
    *   }
    * });
    *
    * // There should be only 3 values in the loss array, instead of 10
    * values,
    * // due to the stopping after 3 epochs.
    * console.log(history.history.loss);
    * ```
    */
  var stopTraining: scala.Boolean = js.native
  var stopTraining_ : scala.Boolean = js.native
  var testFunction: js.Any = js.native
  /**
    * Loop over some test data in batches.
    * @param f A Function returning a list of tensors.
    * @param ins Array of tensors to be fed to `f`.
    * @param batchSize Integer batch size or `null` / `undefined`.
    * @param verbose verbosity mode.
    * @param steps Total number of steps (batches of samples) before
    * declaring test finished. Ignored with the default value of `null` /
    * `undefined`.
    * @returns Array of Scalars.
    */
  var testLoop: js.Any = js.native
  /**
    * Check trainable weights count consistency.
    *
    * This will raise a warning if `this.trainableWeights` and
    * `this.collectedTrainableWeights` are inconsistent (i.e., have different
    * numbers of parameters).
    * Inconsistency will typically arise when one modifies `model.trainable`
    * without calling `model.compile()` again.
    */
  /* protected */ def checkTrainableWeightsConsistency(): scala.Unit = js.native
  /**
    * Configures and prepares the model for training and evaluation.  Compiling
    * outfits the model with an optimizer, loss, and/or metrics.  Calling `fit`
    * or `evaluate` on an un-compiled model will throw an error.
    *
    * @param args a `ModelCompileArgs` specifying the loss, optimizer, and
    * metrics to be used for fitting and evaluating this model.
    */
  /**
    * @doc {heading: 'Models', subheading: 'Classes'}
    */
  def compile(args: ModelCompileArgs): scala.Unit = js.native
  /**
    * Returns the loss value & metrics values for the model in test mode.
    *
    * Loss and metrics are specified during `compile()`, which needs to happen
    * before calls to `evaluate()`.
    *
    * Computation is done in batches.
    *
    * ```js
    * const model = tf.sequential({
    *   layers: [tf.layers.dense({units: 1, inputShape: [10]})]
    * });
    * model.compile({optimizer: 'sgd', loss: 'meanSquaredError'});
    * const result = model.evaluate(
    *     tf.ones([8, 10]), tf.ones([8, 1]), {batchSize: 4});
    * result.print();
    * ```
    *
    * @param x `tf.Tensor` of test data, or an `Array` of `tf.Tensor`s if the
    * model has multiple inputs.
    * @param y `tf.Tensor` of target data, or an `Array` of `tf.Tensor`s if the
    * model has multiple outputs.
    * @param args A `ModelEvaluateArgs`, containing optional fields.
    *
    * @return `Scalar` test loss (if the model has a single output and no
    *   metrics) or `Array` of `Scalar`s (if the model has multiple outputs
    *   and/or metrics). The attribute `model.metricsNames`
    *   will give you the display labels for the scalar outputs.
    */
  /**
    * @doc {heading: 'Models', subheading: 'Classes'}
    */
  def evaluate(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar] = js.native
  def evaluate(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    args: ModelEvaluateArgs
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar] = js.native
  def evaluate(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar] = js.native
  def evaluate(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    args: ModelEvaluateArgs
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar] = js.native
  def evaluate(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar] = js.native
  def evaluate(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    args: ModelEvaluateArgs
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar] = js.native
  def evaluate(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar] = js.native
  def evaluate(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    args: ModelEvaluateArgs
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar] = js.native
  /**
    * Evaluate model using a dataset object.
    *
    * Note: Unlike `evaluate()`, this method is asynchronous (`async`);
    *
    * @param dataset A dataset object. Its `iterator()` method is expected
    *   to generate a dataset iterator object, the `next()` method of which
    *   is expected to produce data batches for evaluation. The return value
    *   of the `next()` call ought to contain a boolean `done` field and a
    *   `value` field. The `value` field is expected to be an array of two
    *   `tf.Tensor`s or an array of two nested `tf.Tensor` structures. The former
    *   case is for models with exactly one input and one output (e.g..
    *   a sequential model). The latter case is for models with multiple
    *   inputs and/or multiple outputs. Of the two items in the array, the
    *   first is the input feature(s) and the second is the output target(s).
    * @param args A configuration object for the dataset-based evaluation.
    * @returns Loss and metric values as an Array of `Scalar` objects.
    */
  /**
    * @doc {heading: 'Models', subheading: 'Classes'}
    */
  def evaluateDataset(dataset: atTensorflowTfjsDashLayersLib.distEngineDatasetUnderscoreStubMod.Dataset[js.Object]): js.Promise[
    atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar]
  ] = js.native
  def evaluateDataset(
    dataset: atTensorflowTfjsDashLayersLib.distEngineDatasetUnderscoreStubMod.Dataset[js.Object],
    args: atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreDatasetMod.ModelEvaluateDatasetArgs
  ): js.Promise[
    atTensorflowTfjsDashCoreLib.distTensorMod.Scalar | js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar]
  ] = js.native
  /**
    * Execute internal tensors of the model with input data feed.
    * @param inputs Input data feed. Must match the inputs of the model.
    * @param outputs Names of the output tensors to be fetched. Must match
    *   names of the SymbolicTensors that belong to the graph.
    * @returns Fetched values for `outputs`.
    */
  def execute(
    inputs: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    outputs: java.lang.String
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def execute(
    inputs: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    outputs: js.Array[java.lang.String]
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  /**
    * Single Execute the inference for the input tensors and return activation
    * values for specified output node names without batching.
    *
    * @param input The input tensors, when there is single input for the model,
    * inputs param should be a Tensor. For models with multiple inputs, inputs
    * params should be in either Tensor[] if the input order is fixed, or
    * otherwise NamedTensorMap format.
    *
    * @param outputs string|string[]. List of output node names to retrieve
    * activation from.
    *
    * @returns Activation values for the output nodes result tensors. The return
    * type matches specified parameter outputs type. The output would be single
    * Tensor if single output is specified, otherwise Tensor[] for multiple
    * outputs.
    */
  def execute(
    inputs: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    outputs: java.lang.String
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def execute(
    inputs: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    outputs: js.Array[java.lang.String]
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def execute(
    inputs: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap,
    outputs: java.lang.String
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def execute(
    inputs: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap,
    outputs: js.Array[java.lang.String]
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def execute(
    inputs: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    outputs: java.lang.String
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def execute(
    inputs: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    outputs: js.Array[java.lang.String]
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  /**
    * Trains the model for a fixed number of epochs (iterations on a
    * dataset).
    *
    * ```js
    * const model = tf.sequential({
    *     layers: [tf.layers.dense({units: 1, inputShape: [10]})]
    * });
    * model.compile({optimizer: 'sgd', loss: 'meanSquaredError'});
    * for (let i = 1; i < 5 ; ++i) {
    *   const h = await model.fit(tf.ones([8, 10]), tf.ones([8, 1]), {
    *       batchSize: 4,
    *       epochs: 3
    *   });
    *   console.log("Loss after Epoch " + i + " : " + h.history.loss[0]);
    * }
    * ```
    *
    * @param x `tf.Tensor` of training data, or an array of `tf.Tensor`s if the
    * model has multiple inputs. If all inputs in the model are named, you
    * can also pass a dictionary mapping input names to `tf.Tensor`s.
    * @param y `tf.Tensor` of target (label) data, or an array of `tf.Tensor`s if
    * the model has multiple outputs. If all outputs in the model are named,
    * you can also pass a dictionary mapping output names to `tf.Tensor`s.
    * @param args A `ModelFitArgs`, containing optional fields.
    *
    * @return A `History` instance. Its `history` attribute contains all
    *   information collected during training.
    *
    * @exception ValueError In case of mismatch between the provided input
    * data and what the model expects.
    */
  /**
    * @doc {heading: 'Models', subheading: 'Classes'}
    */
  def fit(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    args: atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreTensorsMod.ModelFitArgs
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    args: atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreTensorsMod.ModelFitArgs
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    args: atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreTensorsMod.ModelFitArgs
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    args: atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreTensorsMod.ModelFitArgs
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    args: atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreTensorsMod.ModelFitArgs
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    args: atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreTensorsMod.ModelFitArgs
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    args: atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreTensorsMod.ModelFitArgs
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    args: atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreTensorsMod.ModelFitArgs
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  def fit(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    args: atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreTensorsMod.ModelFitArgs
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  /**
    * Trains the model using a dataset object.
    *
    * @param dataset A dataset object. Its `iterator()` method is expected
    *   to generate a dataset iterator object, the `next()` method of which
    *   is expected to produce data batches for training. The return value
    *   of the `next()` call ought to contain a boolean `done` field and a
    *   `value` field. The `value` field is expected to be an array of two
    *   `tf.Tensor`s or an array of two nested `tf.Tensor` structures. The former
    *   case is for models with exactly one input and one output (e.g..
    *   a sequential model). The latter case is for models with multiple
    *   inputs and/or multiple outputs.
    *   Of the two items in the array, the first is the input feature(s) and
    *   the second is the output target(s).
    * @param args A `ModelFitDatasetArgs`, containing optional fields.
    *
    * @return A `History` instance. Its `history` attribute contains all
    *   information collected during training.
    */
  /**
    * @doc {heading: 'Models', subheading: 'Classes'}
    */
  def fitDataset[T](
    dataset: atTensorflowTfjsDashLayersLib.distEngineDatasetUnderscoreStubMod.Dataset[T],
    args: atTensorflowTfjsDashLayersLib.distEngineTrainingUnderscoreDatasetMod.ModelFitDatasetArgs[T]
  ): js.Promise[atTensorflowTfjsDashLayersLib.distBaseUnderscoreCallbacksMod.History] = js.native
  /* protected */ def getDedupedMetricsNames(): js.Array[java.lang.String] = js.native
  /**
    * Extract weight values of the model.
    *
    * @param config: An instance of `io.SaveConfig`, which specifies
    * model-saving options such as whether only trainable weights are to be
    * saved.
    * @returns A `NamedTensorMap` mapping original weight names (i.e.,
    *   non-uniqueified weight names) to their values.
    */
  /* protected */ def getNamedWeights(): atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap = js.native
  /* protected */ def getNamedWeights(config: atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveConfig): atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap = js.native
  /**
    * Creates a function that performs the following actions:
    *
    * 1. computes the losses
    * 2. sums them to get the total loss
    * 3. call the optimizer computes the gradients of the LayersModel's
    *    trainable weights w.r.t. the total loss and update the variables
    * 4. calculates the metrics
    * 5. returns the values of the losses and metrics.
    */
  /* protected */ def makeTrainFunction(): js.Function1[
    /* data */ js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[atTensorflowTfjsDashCoreLib.distTensorMod.Scalar]
  ] = js.native
  /**
    * Execute the inference for the input tensors.
    *
    * @param input The input tensors, when there is single input for the model,
    * inputs param should be a Tensor. For models with multiple inputs, inputs
    * params should be in either Tensor[] if the input order is fixed, or
    * otherwise NamedTensorMap format.
    * For batch inference execution, the tensors for each input need to be
    * concatenated together. For example with mobilenet, the required input shape
    * is [1, 244, 244, 3], which represents the [batch, height, width, channel].
    * If we are provide a batched data of 100 images, the input tensor should be
    * in the shape of [100, 244, 244, 3].
    *
    * @param config Prediction configuration for specifying the batch size.
    *
    * @returns Inference result tensors. The output would be single Tensor if
    * model has single output node, otherwise Tensor[] or NamedTensorMap[] will
    * be returned for model with multiple outputs.
    */
  def predict(
    inputs: atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    config: atTensorflowTfjsDashCoreLib.distModelUnderscoreTypesMod.ModelPredictConfig
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) | atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap = js.native
  def predict(
    inputs: atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap,
    config: atTensorflowTfjsDashCoreLib.distModelUnderscoreTypesMod.ModelPredictConfig
  ): atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) | atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.NamedTensorMap = js.native
  /**
    * Generates output predictions for the input samples.
    *
    * Computation is done in batches.
    *
    * Note: the "step" mode of predict() is currently not supported.
    *   This is because the TensorFlow.js core backend is imperative only.
    *
    * ```js
    * const model = tf.sequential({
    *   layers: [tf.layers.dense({units: 1, inputShape: [10]})]
    * });
    * model.predict(tf.ones([8, 10]), {batchSize: 4}).print();
    * ```
    *
    * @param x The input data, as an Tensor, or an `Array` of `tf.Tensor`s if
    *   the model has multiple inputs.
    * @param args A `ModelPredictArgs` object containing optional fields.
    *
    * @return Prediction results as a `tf.Tensor`(s).
    *
    * @exception ValueError In case of mismatch between the provided input data
    *   and the model's expectations, or in case a stateful model receives a
    *   number of samples that is not a multiple of the batch size.
    */
  /**
    * @doc {heading: 'Models', subheading: 'Classes'}
    */
  def predict(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def predict(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    args: atTensorflowTfjsDashCoreLib.distModelUnderscoreTypesMod.ModelPredictConfig
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def predict(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  def predict(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    args: atTensorflowTfjsDashCoreLib.distModelUnderscoreTypesMod.ModelPredictConfig
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  /**
    * Returns predictions for a single batch of samples.
    *
    * ```js
    * const model = tf.sequential({
    *   layers: [tf.layers.dense({units: 1, inputShape: [10]})]
    * });
    * model.predictOnBatch(tf.ones([8, 10])).print();
    * ```
    * @param x: Input samples, as an Tensor
    * @return Tensor(s) of predictions
    */
  /** @doc {heading: 'Models', subheading: 'Classes'} */
  def predictOnBatch(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank] | (js.Array[
    atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ]) = js.native
  /**
    * Save the configuration and/or weights of the LayersModel.
    *
    * An `IOHandler` is an object that has a `save` method of the proper
    * signature defined. The `save` method manages the storing or
    * transmission of serialized data ("artifacts") that represent the
    * model's topology and weights onto or via a specific medium, such as
    * file downloads, local storage, IndexedDB in the web browser and HTTP
    * requests to a server. TensorFlow.js provides `IOHandler`
    * implementations for a number of frequently used saving mediums, such as
    * `tf.io.browserDownloads` and `tf.io.browserLocalStorage`. See `tf.io`
    * for more details.
    *
    * This method also allows you to refer to certain types of `IOHandler`s
    * as URL-like string shortcuts, such as 'localstorage://' and
    * 'indexeddb://'.
    *
    * Example 1: Save `model`'s topology and weights to browser [local
    * storage](https://developer.mozilla.org/en-US/docs/Web/API/Window/localStorage);
    * then load it back.
    *
    * ```js
    * const model = tf.sequential(
    *     {layers: [tf.layers.dense({units: 1, inputShape: [3]})]});
    * console.log('Prediction from original model:');
    * model.predict(tf.ones([1, 3])).print();
    *
    * const saveResults = await model.save('localstorage://my-model-1');
    *
    * const loadedModel = await tf.loadLayersModel('localstorage://my-model-1');
    * console.log('Prediction from loaded model:');
    * loadedModel.predict(tf.ones([1, 3])).print();
    * ```
    *
    * Example 2. Saving `model`'s topology and weights to browser
    * [IndexedDB](https://developer.mozilla.org/en-US/docs/Web/API/IndexedDB_API);
    * then load it back.
    *
    * ```js
    * const model = tf.sequential(
    *     {layers: [tf.layers.dense({units: 1, inputShape: [3]})]});
    * console.log('Prediction from original model:');
    * model.predict(tf.ones([1, 3])).print();
    *
    * const saveResults = await model.save('indexeddb://my-model-1');
    *
    * const loadedModel = await tf.loadLayersModel('indexeddb://my-model-1');
    * console.log('Prediction from loaded model:');
    * loadedModel.predict(tf.ones([1, 3])).print();
    * ```
    *
    * Example 3. Saving `model`'s topology and weights as two files
    * (`my-model-1.json` and `my-model-1.weights.bin`) downloaded from
    * browser.
    *
    * ```js
    * const model = tf.sequential(
    *     {layers: [tf.layers.dense({units: 1, inputShape: [3]})]});
    * const saveResults = await model.save('downloads://my-model-1');
    * ```
    *
    * Example 4. Send  `model`'s topology and weights to an HTTP server.
    * See the documentation of `tf.io.browserHTTPRequest` for more details
    * including specifying request parameters and implementation of the
    * server.
    *
    * ```js
    * const model = tf.sequential(
    *     {layers: [tf.layers.dense({units: 1, inputShape: [3]})]});
    * const saveResults = await model.save('http://my-server/model/upload');
    * ```
    *
    * @param handlerOrURL An instance of `IOHandler` or a URL-like,
    * scheme-based string shortcut for `IOHandler`.
    * @param config Options for saving the model.
    * @returns A `Promise` of `SaveResult`, which summarizes the result of
    * the saving, such as byte sizes of the saved artifacts for the model's
    *   topology and weight values.
    */
  /**
    * @doc {heading: 'Models', subheading: 'Classes', ignoreCI: true}
    */
  def save(handlerOrURL: atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveResult] = js.native
  def save(
    handlerOrURL: atTensorflowTfjsDashCoreLib.distIoTypesMod.IOHandler,
    config: atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveConfig
  ): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveResult] = js.native
  def save(handlerOrURL: java.lang.String): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveResult] = js.native
  def save(handlerOrURL: java.lang.String, config: atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveConfig): js.Promise[atTensorflowTfjsDashCoreLib.distIoTypesMod.SaveResult] = js.native
  /* protected */ def standardizeUserData(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    checkBatchAxis: scala.Boolean
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    checkBatchAxis: scala.Boolean,
    batchSize: scala.Double
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    checkBatchAxis: scala.Boolean
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    checkBatchAxis: scala.Boolean,
    batchSize: scala.Double
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    checkBatchAxis: scala.Boolean
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    checkBatchAxis: scala.Boolean,
    batchSize: scala.Double
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    checkBatchAxis: scala.Boolean
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    checkBatchAxis: scala.Boolean,
    batchSize: scala.Double
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    checkBatchAxis: scala.Boolean
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    checkBatchAxis: scala.Boolean,
    batchSize: scala.Double
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    checkBatchAxis: scala.Boolean
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    checkBatchAxis: scala.Boolean,
    batchSize: scala.Double
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    checkBatchAxis: scala.Boolean
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    checkBatchAxis: scala.Boolean,
    batchSize: scala.Double
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    checkBatchAxis: scala.Boolean
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    checkBatchAxis: scala.Boolean,
    batchSize: scala.Double
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    checkBatchAxis: scala.Boolean
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /* protected */ def standardizeUserData(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    checkBatchAxis: scala.Boolean,
    batchSize: scala.Double
  ): js.Tuple3[
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ], 
    js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ] = js.native
  /**
    * Print a text summary of the model's layers.
    *
    * The summary includes
    * - Name and type of all layers that comprise the model.
    * - Output shape(s) of the layers
    * - Number of weight parameters of each layer
    * - If the model has non-sequential-like topology, the inputs each layer
    *   receives
    * - The total number of trainable and non-trainable parameters of the model.
    *
    * ```js
    * const input1 = tf.input({shape: [10]});
    * const input2 = tf.input({shape: [20]});
    * const dense1 = tf.layers.dense({units: 4}).apply(input1);
    * const dense2 = tf.layers.dense({units: 8}).apply(input2);
    * const concat = tf.layers.concatenate().apply([dense1, dense2]);
    * const output =
    *     tf.layers.dense({units: 3, activation: 'softmax'}).apply(concat);
    *
    * const model = tf.model({inputs: [input1, input2], outputs: output});
    * model.summary();
    * ```
    *
    * @param lineLength Custom line length, in number of characters.
    * @param positions Custom widths of each of the columns, as either
    *   fractions of `lineLength` (e.g., `[0.5, 0.75, 1]`) or absolute number
    *   of characters (e.g., `[30, 50, 65]`). Each number corresponds to
    *   right-most (i.e., ending) position of a column.
    * @param printFn Custom print function. Can be used to replace the default
    *   `console.log`. For example, you can use `x => {}` to mute the printed
    *   messages in the console.
    */
  /** @doc {heading: 'Models', subheading: 'Classes'} */
  def summary(): scala.Unit = js.native
  def summary(lineLength: scala.Double): scala.Unit = js.native
  def summary(lineLength: scala.Double, positions: js.Array[scala.Double]): scala.Unit = js.native
  def summary(
    lineLength: scala.Double,
    positions: js.Array[scala.Double],
    printFn: js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
    * Runs a single gradient update on a single batch of data.
    *
    * This method differs from `fit()` and `fitDataset()` in the following
    * regards:
    *   - It operates on exactly one batch of data.
    *   - It returns only the loss and matric values, instead of
    *     returning the batch-by-batch loss and metric values.
    *   - It doesn't support fine-grained options such as verbosity and
    *     callbacks.
    *
    * @param x Input data. It could be one of the following:
    *   - A `tf.Tensor`, or an Array of `tf.Tensor`s (in case the model has
    *     multiple inputs).
    *   - An Object mapping input names to corresponding `tf.Tensor` (if the
    *     model has named inputs).
    * @param y Target darta. It could be either a `tf.Tensor` a multiple
    *   `tf.Tensor`s. It should be consistent with `x`.
    * @returns Training loss or losses (in case the model has
    *   multiple outputs), along with metrics (if any), as numbers.
    */
  /**
    * @doc {heading: 'Models', subheading: 'Classes'}
    */
  def trainOnBatch(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Promise[scala.Double | js.Array[scala.Double]] = js.native
  def trainOnBatch(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Promise[scala.Double | js.Array[scala.Double]] = js.native
  def trainOnBatch(
    x: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Promise[scala.Double | js.Array[scala.Double]] = js.native
  def trainOnBatch(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Promise[scala.Double | js.Array[scala.Double]] = js.native
  def trainOnBatch(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Promise[scala.Double | js.Array[scala.Double]] = js.native
  def trainOnBatch(
    x: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Promise[scala.Double | js.Array[scala.Double]] = js.native
  def trainOnBatch(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ): js.Promise[scala.Double | js.Array[scala.Double]] = js.native
  def trainOnBatch(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: js.Array[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Promise[scala.Double | js.Array[scala.Double]] = js.native
  def trainOnBatch(
    x: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ],
    y: org.scalablytyped.runtime.StringDictionary[
      atTensorflowTfjsDashCoreLib.atTensorflowTfjsDashCoreMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
    ]
  ): js.Promise[scala.Double | js.Array[scala.Double]] = js.native
}

/* static members */
@JSImport("@tensorflow/tfjs-layers/dist/engine/training", "LayersModel")
@js.native
object LayersModel extends js.Object {
  /** @nocollapse */
  var className: java.lang.String = js.native
}

