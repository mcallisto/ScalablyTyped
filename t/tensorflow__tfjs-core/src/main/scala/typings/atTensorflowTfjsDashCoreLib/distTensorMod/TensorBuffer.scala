package typings
package atTensorflowTfjsDashCoreLib.distTensorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/tensor", "TensorBuffer")
@js.native
class TensorBuffer[R /* <: atTensorflowTfjsDashCoreLib.distTypesMod.Rank */, D /* <: atTensorflowTfjsDashCoreLib.distTypesMod.DataType */] protected () extends js.Object {
  def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: D) = this()
  def this(shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any, dtype: D, values: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any) = this()
  var dtype: D = js.native
  val rank: scala.Double = js.native
  var shape: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.ShapeMap[R] */ js.Any = js.native
  var size: scala.Double = js.native
  var strides: js.Array[scala.Double] = js.native
  var values: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any = js.native
  /**
    * Returns the value in the buffer at the provided location.
    *
    * @param locs The location indices.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def get(locs: scala.Double*): /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.SingleValueMap[D] */ js.Any = js.native
  def indexToLoc(index: scala.Double): js.Array[scala.Double] = js.native
  def locToIndex(locs: js.Array[scala.Double]): scala.Double = js.native
  /**
    * Sets a value in the buffer at a given location.
    *
    * @param value The value to set.
    * @param locs  The location indices.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def set(
    value: /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.SingleValueMap[D] */ js.Any,
    locs: scala.Double*
  ): scala.Unit = js.native
  /**
    * Creates an immutable `tf.Tensor` object from the buffer.
    */
  /** @doc {heading: 'Tensors', subheading: 'Creation'} */
  def toTensor(): Tensor[R] = js.native
}

