package typings
package atTensorflowTfjsLib.atTensorflowTfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "util")
@js.native
object utilNs extends js.Object {
  def arraysEqual(
    n1: atTensorflowTfjsDashCoreLib.distTypesMod.FlatVector,
    n2: atTensorflowTfjsDashCoreLib.distTypesMod.FlatVector
  ): scala.Boolean = js.native
  def assert(expr: scala.Boolean, msg: js.Function0[java.lang.String]): scala.Unit = js.native
  def assertNonNegativeIntegerDimensions(shape: js.Array[scala.Double]): scala.Unit = js.native
  def assertNonNull(a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): scala.Unit = js.native
  def assertShapesMatch(shapeA: js.Array[scala.Double], shapeB: js.Array[scala.Double]): scala.Unit = js.native
  def assertShapesMatch(
    shapeA: js.Array[scala.Double],
    shapeB: js.Array[scala.Double],
    errorMessagePrefix: java.lang.String
  ): scala.Unit = js.native
  def bytesFromStringArray(arr: js.Array[java.lang.String]): scala.Double = js.native
  def bytesPerElement(dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): scala.Double = js.native
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_bool(
    vals: stdLib.Uint8Array,
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.bool,
    name: java.lang.String
  ): scala.Unit = js.native
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_complex64(
    vals: stdLib.Float32Array,
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.complex64,
    name: java.lang.String
  ): scala.Unit = js.native
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_float32(
    vals: stdLib.Float32Array,
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.float32,
    name: java.lang.String
  ): scala.Unit = js.native
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_int32(
    vals: stdLib.Int32Array,
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.int32,
    name: java.lang.String
  ): scala.Unit = js.native
  @JSName("checkComputationForErrors")
  def checkComputationForErrors_string(
    vals: js.Array[java.lang.String],
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.string,
    name: java.lang.String
  ): scala.Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_bool(vals: js.Array[scala.Double], dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.bool): scala.Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_bool(vals: stdLib.Uint8Array, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.bool): scala.Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_complex64(vals: js.Array[scala.Double], dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.complex64): scala.Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_complex64(vals: stdLib.Float32Array, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.complex64): scala.Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_float32(vals: js.Array[scala.Double], dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.float32): scala.Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_float32(vals: stdLib.Float32Array, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.float32): scala.Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_int32(vals: js.Array[scala.Double], dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.int32): scala.Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_int32(vals: stdLib.Int32Array, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.int32): scala.Unit = js.native
  @JSName("checkConversionForErrors")
  def checkConversionForErrors_string(
    vals: js.Array[scala.Double | java.lang.String],
    dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.string
  ): scala.Unit = js.native
  def clamp(min: scala.Double, x: scala.Double, max: scala.Double): scala.Double = js.native
  def computeStrides(shape: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def createShuffledIndices(n: scala.Double): stdLib.Uint32Array = js.native
  def distSquared(
    a: atTensorflowTfjsDashCoreLib.distTypesMod.FlatVector,
    b: atTensorflowTfjsDashCoreLib.distTypesMod.FlatVector
  ): scala.Double = js.native
  def fetch(path: java.lang.String): js.Promise[stdLib.Response] = js.native
  def fetch(path: java.lang.String, requestInits: stdLib.RequestInit): js.Promise[stdLib.Response] = js.native
  def flatten(arr: java.lang.String): js.Array[java.lang.String] = js.native
  def flatten(arr: java.lang.String, result: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def flatten(arr: js.Promise[scala.Double]): js.Array[js.Promise[scala.Double]] = js.native
  def flatten(arr: js.Promise[scala.Double], result: js.Array[js.Promise[scala.Double]]): js.Array[js.Promise[scala.Double]] = js.native
  def flatten(arr: scala.Boolean): js.Array[scala.Boolean] = js.native
  def flatten(arr: scala.Boolean, result: js.Array[scala.Boolean]): js.Array[scala.Boolean] = js.native
  def flatten(arr: scala.Double): js.Array[scala.Double] = js.native
  def flatten(arr: scala.Double, result: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def flatten(arr: stdLib.Float32Array): js.Array[stdLib.Float32Array] = js.native
  def flatten(arr: stdLib.Float32Array, result: js.Array[stdLib.Float32Array]): js.Array[stdLib.Float32Array] = js.native
  def flatten(arr: stdLib.Int32Array): js.Array[stdLib.Int32Array] = js.native
  def flatten(arr: stdLib.Int32Array, result: js.Array[stdLib.Int32Array]): js.Array[stdLib.Int32Array] = js.native
  def flatten(arr: stdLib.Uint8Array): js.Array[stdLib.Uint8Array] = js.native
  def flatten(arr: stdLib.Uint8Array, result: js.Array[stdLib.Uint8Array]): js.Array[stdLib.Uint8Array] = js.native
  def flatten[T /* <: scala.Double | scala.Boolean | java.lang.String | js.Promise[scala.Double] | atTensorflowTfjsDashCoreLib.distTypesMod.TypedArray */](arr: atTensorflowTfjsDashCoreLib.distTypesMod.RecursiveArray[T]): js.Array[T] = js.native
  def flatten[T /* <: scala.Double | scala.Boolean | java.lang.String | js.Promise[scala.Double] | atTensorflowTfjsDashCoreLib.distTypesMod.TypedArray */](arr: atTensorflowTfjsDashCoreLib.distTypesMod.RecursiveArray[T], result: js.Array[T]): js.Array[T] = js.native
  @JSName("getArrayFromDType")
  def getArrayFromDType_bool(dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.bool, size: scala.Double): stdLib.Uint8Array = js.native
  @JSName("getArrayFromDType")
  def getArrayFromDType_complex64(dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.complex64, size: scala.Double): stdLib.Float32Array = js.native
  @JSName("getArrayFromDType")
  def getArrayFromDType_float32(dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.float32, size: scala.Double): stdLib.Float32Array = js.native
  @JSName("getArrayFromDType")
  def getArrayFromDType_int32(dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.int32, size: scala.Double): stdLib.Int32Array = js.native
  @JSName("getArrayFromDType")
  def getArrayFromDType_string(dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.string, size: scala.Double): js.Array[java.lang.String] = js.native
  def getTypedArrayFromDType[D /* <: atTensorflowTfjsDashCoreLib.distTypesMod.NumericDataType */](dtype: D, size: scala.Double): /* import warning: ImportType.apply Failed type conversion: @tensorflow/tfjs-core.@tensorflow/tfjs-core/dist/types.DataTypeMap[D] */ js.Any = js.native
  def hasEncodingLoss(
    oldType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    newType: atTensorflowTfjsDashCoreLib.distTypesMod.DataType
  ): scala.Boolean = js.native
  def inferDtype(values: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike): atTensorflowTfjsDashCoreLib.distTypesMod.DataType = js.native
  def inferFromImplicitShape(shape: js.Array[scala.Double], size: scala.Double): js.Array[scala.Double] = js.native
  def isBoolean(value: js.Object): scala.Boolean = js.native
  def isFunction(f: js.Function): scala.Boolean = js.native
  def isInt(a: scala.Double): scala.Boolean = js.native
  def isNumber(value: js.Object): scala.Boolean = js.native
  def isScalarShape(shape: js.Array[scala.Double]): scala.Boolean = js.native
  def isString(value: js.Object): /* is string */ scala.Boolean = js.native
  def isTypedArray(a: js.Object): scala.Boolean = js.native
  def isValidDtype(dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType): scala.Boolean = js.native
  @JSName("makeOnesTypedArray")
  def makeOnesTypedArray_bool(size: scala.Double, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.bool): stdLib.Uint8Array = js.native
  @JSName("makeOnesTypedArray")
  def makeOnesTypedArray_complex64(size: scala.Double, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.complex64): stdLib.Float32Array = js.native
  @JSName("makeOnesTypedArray")
  def makeOnesTypedArray_float32(size: scala.Double, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.float32): stdLib.Float32Array = js.native
  @JSName("makeOnesTypedArray")
  def makeOnesTypedArray_int32(size: scala.Double, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.int32): stdLib.Int32Array = js.native
  @JSName("makeOnesTypedArray")
  def makeOnesTypedArray_string(size: scala.Double, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.string): js.Array[java.lang.String] = js.native
  @JSName("makeZerosTypedArray")
  def makeZerosTypedArray_bool(size: scala.Double, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.bool): stdLib.Uint8Array = js.native
  @JSName("makeZerosTypedArray")
  def makeZerosTypedArray_complex64(size: scala.Double, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.complex64): stdLib.Float32Array = js.native
  @JSName("makeZerosTypedArray")
  def makeZerosTypedArray_float32(size: scala.Double, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.float32): stdLib.Float32Array = js.native
  @JSName("makeZerosTypedArray")
  def makeZerosTypedArray_int32(size: scala.Double, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.int32): stdLib.Int32Array = js.native
  @JSName("makeZerosTypedArray")
  def makeZerosTypedArray_string(size: scala.Double, dtype: atTensorflowTfjsLib.atTensorflowTfjsLibStrings.string): js.Array[java.lang.String] = js.native
  def nearestDivisor(size: scala.Double, start: scala.Double): scala.Double = js.native
  def nearestLargerEven(`val`: scala.Double): scala.Double = js.native
  def now(): scala.Double = js.native
  def parseAxisParam(axis: js.Array[scala.Double], shape: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def parseAxisParam(axis: scala.Double, shape: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def randUniform(a: scala.Double, b: scala.Double): scala.Double = js.native
  def repeatedTry(checkFn: js.Function0[scala.Boolean]): js.Promise[scala.Unit] = js.native
  def repeatedTry(
    checkFn: js.Function0[scala.Boolean],
    delayFn: js.Function1[/* counter */ scala.Double, scala.Double]
  ): js.Promise[scala.Unit] = js.native
  def repeatedTry(
    checkFn: js.Function0[scala.Boolean],
    delayFn: js.Function1[/* counter */ scala.Double, scala.Double],
    maxCounter: scala.Double
  ): js.Promise[scala.Unit] = js.native
  def rightPad(a: java.lang.String, size: scala.Double): java.lang.String = js.native
  def shuffle(array: js.Array[_]): scala.Unit = js.native
  def shuffle(array: stdLib.Float32Array): scala.Unit = js.native
  def shuffle(array: stdLib.Int32Array): scala.Unit = js.native
  def shuffle(array: stdLib.Uint32Array): scala.Unit = js.native
  def sizeFromShape(shape: js.Array[scala.Double]): scala.Double = js.native
  def sizeToSquarishShape(size: scala.Double): js.Tuple2[scala.Double, scala.Double] = js.native
  def squeezeShape(shape: js.Array[scala.Double]): atTensorflowTfjsDashCoreLib.Anon_KeptDims = js.native
  def squeezeShape(shape: js.Array[scala.Double], axis: js.Array[scala.Double]): atTensorflowTfjsDashCoreLib.Anon_KeptDims = js.native
  def sum(arr: js.Array[scala.Double]): scala.Double = js.native
  def tanh(x: scala.Double): scala.Double = js.native
  def toNestedArray(shape: js.Array[scala.Double], a: atTensorflowTfjsDashCoreLib.distTypesMod.TypedArray): scala.Double | js.Array[_] = js.native
  def toTypedArray(
    a: atTensorflowTfjsDashCoreLib.distTypesMod.TensorLike,
    dtype: atTensorflowTfjsDashCoreLib.distTypesMod.DataType,
    debugMode: scala.Boolean
  ): atTensorflowTfjsDashCoreLib.distTypesMod.TypedArray = js.native
}

