package typings
package atTensorflowTfjsDashCoreLib.distOptimizersOptimizerUnderscoreConstructorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/optimizers/optimizer_constructors", "OptimizerConstructors")
@js.native
class OptimizerConstructors () extends js.Object

/* static members */
@JSImport("@tensorflow/tfjs-core/dist/optimizers/optimizer_constructors", "OptimizerConstructors")
@js.native
object OptimizerConstructors extends js.Object {
  /**
    * Constructs a `tf.AdadeltaOptimizer` that uses the Adadelta algorithm.
    * See [https://arxiv.org/abs/1212.5701](https://arxiv.org/abs/1212.5701)
    *
    * @param learningRate The learning rate to use for the Adadelta gradient
    * descent algorithm.
    * @param rho The learning rate decay over each update.
    * @param epsilon A constant epsilon used to better condition the grad
    * update.
    */
  /**
    * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
    */
  def adadelta(): atTensorflowTfjsDashCoreLib.distOptimizersAdadeltaUnderscoreOptimizerMod.AdadeltaOptimizer = js.native
  def adadelta(learningRate: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersAdadeltaUnderscoreOptimizerMod.AdadeltaOptimizer = js.native
  def adadelta(learningRate: scala.Double, rho: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersAdadeltaUnderscoreOptimizerMod.AdadeltaOptimizer = js.native
  def adadelta(learningRate: scala.Double, rho: scala.Double, epsilon: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersAdadeltaUnderscoreOptimizerMod.AdadeltaOptimizer = js.native
  /**
    * Constructs a `tf.AdagradOptimizer` that uses the Adagrad algorithm.
    * See
    * [http://www.jmlr.org/papers/volume12/duchi11a/duchi11a.pdf](
    * http://www.jmlr.org/papers/volume12/duchi11a/duchi11a.pdf)
    * or
    * [http://ruder.io/optimizing-gradient-descent/index.html#adagrad](
    * http://ruder.io/optimizing-gradient-descent/index.html#adagrad)
    *
    * @param learningRate The learning rate to use for the Adagrad gradient
    * descent algorithm.
    * @param initialAccumulatorValue Starting value for the accumulators, must be
    * positive.
    */
  /**
    * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
    */
  def adagrad(learningRate: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersAdagradUnderscoreOptimizerMod.AdagradOptimizer = js.native
  def adagrad(learningRate: scala.Double, initialAccumulatorValue: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersAdagradUnderscoreOptimizerMod.AdagradOptimizer = js.native
  /**
    * Constructs a `tf.AdamOptimizer` that uses the Adam algorithm.
    * See [https://arxiv.org/abs/1412.6980](https://arxiv.org/abs/1412.6980)
    *
    * @param learningRate The learning rate to use for the Adam gradient
    * descent algorithm.
    * @param beta1 The exponential decay rate for the 1st moment estimates.
    * @param beta2 The exponential decay rate for the 2nd moment estimates.
    * @param epsilon A small constant for numerical stability.
    */
  /**
    * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
    */
  def adam(): atTensorflowTfjsDashCoreLib.distOptimizersAdamUnderscoreOptimizerMod.AdamOptimizer = js.native
  def adam(learningRate: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersAdamUnderscoreOptimizerMod.AdamOptimizer = js.native
  def adam(learningRate: scala.Double, beta1: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersAdamUnderscoreOptimizerMod.AdamOptimizer = js.native
  def adam(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersAdamUnderscoreOptimizerMod.AdamOptimizer = js.native
  def adam(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double, epsilon: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersAdamUnderscoreOptimizerMod.AdamOptimizer = js.native
  /**
    * Constructs a `tf.AdamaxOptimizer` that uses the Adamax algorithm.
    * See [https://arxiv.org/abs/1412.6980](https://arxiv.org/abs/1412.6980)
    *
    * @param learningRate The learning rate to use for the Adamax gradient
    * descent algorithm.
    * @param beta1 The exponential decay rate for the 1st moment estimates.
    * @param beta2 The exponential decay rate for the 2nd moment estimates.
    * @param epsilon A small constant for numerical stability.
    * @param decay The learning rate decay over each update.
    */
  /**
    * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
    */
  def adamax(): atTensorflowTfjsDashCoreLib.distOptimizersAdamaxUnderscoreOptimizerMod.AdamaxOptimizer = js.native
  def adamax(learningRate: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersAdamaxUnderscoreOptimizerMod.AdamaxOptimizer = js.native
  def adamax(learningRate: scala.Double, beta1: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersAdamaxUnderscoreOptimizerMod.AdamaxOptimizer = js.native
  def adamax(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersAdamaxUnderscoreOptimizerMod.AdamaxOptimizer = js.native
  def adamax(learningRate: scala.Double, beta1: scala.Double, beta2: scala.Double, epsilon: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersAdamaxUnderscoreOptimizerMod.AdamaxOptimizer = js.native
  def adamax(
    learningRate: scala.Double,
    beta1: scala.Double,
    beta2: scala.Double,
    epsilon: scala.Double,
    decay: scala.Double
  ): atTensorflowTfjsDashCoreLib.distOptimizersAdamaxUnderscoreOptimizerMod.AdamaxOptimizer = js.native
  /**
    * Constructs a `tf.MomentumOptimizer` that uses momentum gradient
    * descent.
    *
    * See
    * [http://proceedings.mlr.press/v28/sutskever13.pdf](
    * http://proceedings.mlr.press/v28/sutskever13.pdf)
    *
    * @param learningRate The learning rate to use for the Momentum gradient
    * descent algorithm.
    * @param momentum The momentum to use for the momentum gradient descent
    * algorithm.
    */
  /**
    * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
    */
  def momentum(learningRate: scala.Double, momentum: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersMomentumUnderscoreOptimizerMod.MomentumOptimizer = js.native
  def momentum(learningRate: scala.Double, momentum: scala.Double, useNesterov: scala.Boolean): atTensorflowTfjsDashCoreLib.distOptimizersMomentumUnderscoreOptimizerMod.MomentumOptimizer = js.native
  /**
    * Constructs a `tf.RMSPropOptimizer` that uses RMSProp gradient
    * descent. This implementation uses plain momentum and is not centered
    * version of RMSProp.
    *
    * See
    * [http://www.cs.toronto.edu/~tijmen/csc321/slides/lecture_slides_lec6.pdf](
    * http://www.cs.toronto.edu/~tijmen/csc321/slides/lecture_slides_lec6.pdf)
    *
    * @param learningRate The learning rate to use for the RMSProp gradient
    * descent algorithm.
    * @param decay The discounting factor for the history/coming gradient.
    * @param momentum The momentum to use for the RMSProp gradient descent
    * algorithm.
    * @param epsilon Small value to avoid zero denominator.
    * @param centered If true, gradients are normalized by the estimated
    * variance of the gradient.
    */
  /**
    * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
    */
  def rmsprop(learningRate: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersRmspropUnderscoreOptimizerMod.RMSPropOptimizer = js.native
  def rmsprop(learningRate: scala.Double, decay: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersRmspropUnderscoreOptimizerMod.RMSPropOptimizer = js.native
  def rmsprop(learningRate: scala.Double, decay: scala.Double, momentum: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersRmspropUnderscoreOptimizerMod.RMSPropOptimizer = js.native
  def rmsprop(learningRate: scala.Double, decay: scala.Double, momentum: scala.Double, epsilon: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersRmspropUnderscoreOptimizerMod.RMSPropOptimizer = js.native
  def rmsprop(
    learningRate: scala.Double,
    decay: scala.Double,
    momentum: scala.Double,
    epsilon: scala.Double,
    centered: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distOptimizersRmspropUnderscoreOptimizerMod.RMSPropOptimizer = js.native
  /**
    * Constructs a `tf.SGDOptimizer` that uses stochastic gradient descent.
    *
    * ```js
    * // Fit a quadratic function by learning the coefficients a, b, c.
    * const xs = tf.tensor1d([0, 1, 2, 3]);
    * const ys = tf.tensor1d([1.1, 5.9, 16.8, 33.9]);
    *
    * const a = tf.scalar(Math.random()).variable();
    * const b = tf.scalar(Math.random()).variable();
    * const c = tf.scalar(Math.random()).variable();
    *
    * // y = a * x^2 + b * x + c.
    * const f = x => a.mul(x.square()).add(b.mul(x)).add(c);
    * const loss = (pred, label) => pred.sub(label).square().mean();
    *
    * const learningRate = 0.01;
    * const optimizer = tf.train.sgd(learningRate);
    *
    * // Train the model.
    * for (let i = 0; i < 10; i++) {
    *   optimizer.minimize(() => loss(f(xs), ys));
    * }
    *
    * // Make predictions.
    * console.log(
    *     `a: ${a.dataSync()}, b: ${b.dataSync()}, c: ${c.dataSync()}`);
    * const preds = f(xs).dataSync();
    * preds.forEach((pred, i) => {
    *   console.log(`x: ${i}, pred: ${pred}`);
    * });
    * ```
    *
    * @param learningRate The learning rate to use for the SGD algorithm.
    */
  /**
    * @doc {heading: 'Training', subheading: 'Optimizers', namespace: 'train'}
    */
  def sgd(learningRate: scala.Double): atTensorflowTfjsDashCoreLib.distOptimizersSgdUnderscoreOptimizerMod.SGDOptimizer = js.native
}

