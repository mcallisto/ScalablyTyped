package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A typed array of 8-bit integer values. The contents are initialized to 0. If the requested
  * number of bytes could not be allocated an exception is raised.
  */
@js.native
trait Int8Array
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[scala.Double] {
  /**
    * The size in bytes of each element in the array.
    */
  val BYTES_PER_ELEMENT: scala.Double = js.native
  /**
    * The ArrayBuffer instance referenced by the array.
    */
  val buffer: ArrayBufferLike = js.native
  /**
    * The length in bytes of the array.
    */
  val byteLength: scala.Double = js.native
  /**
    * The offset in bytes of the array.
    */
  val byteOffset: scala.Double = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[scala.Double]] = js.native
  /**
    * The length of the array.
    */
  val length: scala.Double = js.native
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  val toStringTag: stdLib.stdLibStrings.Int8Array = js.native
  /**
    * Returns the this object after copying a section of the array identified by start and end
    * to the same array starting at position target
    * @param target If target is negative, it is treated as length+target where length is the
    * length of the array.
    * @param start If start is negative, it is treated as length+start. If end is negative, it
    * is treated as length+end.
    * @param end If not specified, length of the this object is used as its default value.
    */
  def copyWithin(target: scala.Double, start: scala.Double): this.type = js.native
  def copyWithin(target: scala.Double, start: scala.Double, end: scala.Double): this.type = js.native
  /**
    * Returns an array of key, value pairs for every entry in the array
    */
  def entries(): IterableIterator[js.Tuple2[scala.Double, scala.Double]] = js.native
  /**
    * Determines whether all the members of an array satisfy the specified test.
    * @param callbackfn A function that accepts up to three arguments. The every method calls
    * the callbackfn function for each element in array1 until the callbackfn returns false,
    * or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def every(
    callbackfn: js.Function3[
      /* value */ scala.Double, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def every(
    callbackfn: js.Function3[
      /* value */ scala.Double, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Boolean
    ],
    thisArg: js.Any
  ): scala.Boolean = js.native
  /**
    * Returns the this object after filling the section identified by start and end with value
    * @param value value to fill array section with
    * @param start index to start filling the array at. If start is negative, it is treated as
    * length+start where length is the length of the array.
    * @param end index to stop filling the array at. If end is negative, it is treated as
    * length+end.
    */
  def fill(value: scala.Double): this.type = js.native
  def fill(value: scala.Double, start: scala.Double): this.type = js.native
  def fill(value: scala.Double, start: scala.Double, end: scala.Double): this.type = js.native
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    * @param callbackfn A function that accepts up to three arguments. The filter method calls
    * the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def filter(
    callbackfn: js.Function3[/* value */ scala.Double, /* index */ scala.Double, /* array */ this.type, _]
  ): Int8Array = js.native
  def filter(
    callbackfn: js.Function3[/* value */ scala.Double, /* index */ scala.Double, /* array */ this.type, _],
    thisArg: js.Any
  ): Int8Array = js.native
  /**
    * Returns the value of the first element in the array where predicate is true, and undefined
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found, find
    * immediately returns that element value. Otherwise, find returns undefined.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def find(
    predicate: js.Function3[/* value */ scala.Double, /* index */ scala.Double, /* obj */ this.type, scala.Boolean]
  ): js.UndefOr[scala.Double] = js.native
  def find(
    predicate: js.Function3[/* value */ scala.Double, /* index */ scala.Double, /* obj */ this.type, scala.Boolean],
    thisArg: js.Any
  ): js.UndefOr[scala.Double] = js.native
  /**
    * Returns the index of the first element in the array where predicate is true, and -1
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found,
    * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def findIndex(
    predicate: js.Function3[/* value */ scala.Double, /* index */ scala.Double, /* obj */ this.type, scala.Boolean]
  ): scala.Double = js.native
  def findIndex(
    predicate: js.Function3[/* value */ scala.Double, /* index */ scala.Double, /* obj */ this.type, scala.Boolean],
    thisArg: js.Any
  ): scala.Double = js.native
  /**
    * Performs the specified action for each element in an array.
    * @param callbackfn  A function that accepts up to three arguments. forEach calls the
    * callbackfn function one time for each element in the array.
    * @param thisArg  An object to which the this keyword can refer in the callbackfn function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def forEach(
    callbackfn: js.Function3[/* value */ scala.Double, /* index */ scala.Double, /* array */ this.type, scala.Unit]
  ): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ scala.Double, /* index */ scala.Double, /* array */ this.type, scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  /**
    * Determines whether an array includes a certain element, returning true or false as appropriate.
    * @param searchElement The element to search for.
    * @param fromIndex The position in this array at which to begin searching for searchElement.
    */
  def includes(searchElement: scala.Double): scala.Boolean = js.native
  def includes(searchElement: scala.Double, fromIndex: scala.Double): scala.Boolean = js.native
  /**
    * Returns the index of the first occurrence of a value in an array.
    * @param searchElement The value to locate in the array.
    * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the
    *  search starts at index 0.
    */
  def indexOf(searchElement: scala.Double): scala.Double = js.native
  def indexOf(searchElement: scala.Double, fromIndex: scala.Double): scala.Double = js.native
  /**
    * Adds all the elements of an array separated by the specified separator string.
    * @param separator A string used to separate one element of an array from the next in the
    * resulting String. If omitted, the array elements are separated with a comma.
    */
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  /**
    * Returns an list of keys in the array
    */
  def keys(): IterableIterator[scala.Double] = js.native
  /**
    * Returns the index of the last occurrence of a value in an array.
    * @param searchElement The value to locate in the array.
    * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the
    * search starts at index 0.
    */
  def lastIndexOf(searchElement: scala.Double): scala.Double = js.native
  def lastIndexOf(searchElement: scala.Double, fromIndex: scala.Double): scala.Double = js.native
  /**
    * Calls a defined callback function on each element of an array, and returns an array that
    * contains the results.
    * @param callbackfn A function that accepts up to three arguments. The map method calls the
    * callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def map(
    callbackfn: js.Function3[
      /* value */ scala.Double, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Double
    ]
  ): Int8Array = js.native
  def map(
    callbackfn: js.Function3[
      /* value */ scala.Double, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Double
    ],
    thisArg: js.Any
  ): Int8Array = js.native
  /**
    * Calls the specified callback function for all the elements in an array. The return value of
    * the callback function is the accumulated result, and is provided as an argument in the next
    * call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the
    * callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start
    * the accumulation. The first call to the callbackfn function provides this value as an argument
    * instead of an array value.
    */
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ scala.Double, 
      /* currentValue */ scala.Double, 
      /* currentIndex */ scala.Double, 
      /* array */ this.type, 
      scala.Double
    ]
  ): scala.Double = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ scala.Double, 
      /* currentValue */ scala.Double, 
      /* currentIndex */ scala.Double, 
      /* array */ this.type, 
      scala.Double
    ],
    initialValue: scala.Double
  ): scala.Double = js.native
  /**
    * Calls the specified callback function for all the elements in an array. The return value of
    * the callback function is the accumulated result, and is provided as an argument in the next
    * call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the
    * callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start
    * the accumulation. The first call to the callbackfn function provides this value as an argument
    * instead of an array value.
    */
  def reduce[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ scala.Double, 
      /* currentIndex */ scala.Double, 
      /* array */ this.type, 
      U
    ],
    initialValue: U
  ): U = js.native
  /**
    * Calls the specified callback function for all the elements in an array, in descending order.
    * The return value of the callback function is the accumulated result, and is provided as an
    * argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls
    * the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start
    * the accumulation. The first call to the callbackfn function provides this value as an
    * argument instead of an array value.
    */
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ scala.Double, 
      /* currentValue */ scala.Double, 
      /* currentIndex */ scala.Double, 
      /* array */ this.type, 
      scala.Double
    ]
  ): scala.Double = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ scala.Double, 
      /* currentValue */ scala.Double, 
      /* currentIndex */ scala.Double, 
      /* array */ this.type, 
      scala.Double
    ],
    initialValue: scala.Double
  ): scala.Double = js.native
  /**
    * Calls the specified callback function for all the elements in an array, in descending order.
    * The return value of the callback function is the accumulated result, and is provided as an
    * argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls
    * the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start
    * the accumulation. The first call to the callbackfn function provides this value as an argument
    * instead of an array value.
    */
  def reduceRight[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ scala.Double, 
      /* currentIndex */ scala.Double, 
      /* array */ this.type, 
      U
    ],
    initialValue: U
  ): U = js.native
  /**
    * Reverses the elements in an Array.
    */
  def reverse(): Int8Array = js.native
  /**
    * Sets a value or an array of values.
    * @param array A typed or untyped array of values to set.
    * @param offset The index in the current array at which the values are to be written.
    */
  def set(array: ArrayLike[scala.Double]): scala.Unit = js.native
  def set(array: ArrayLike[scala.Double], offset: scala.Double): scala.Unit = js.native
  /**
    * Returns a section of an array.
    * @param start The beginning of the specified portion of the array.
    * @param end The end of the specified portion of the array.
    */
  def slice(): Int8Array = js.native
  def slice(start: scala.Double): Int8Array = js.native
  def slice(start: scala.Double, end: scala.Double): Int8Array = js.native
  /**
    * Determines whether the specified callback function returns true for any element of an array.
    * @param callbackfn A function that accepts up to three arguments. The some method calls the
    * callbackfn function for each element in array1 until the callbackfn returns true, or until
    * the end of the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function.
    * If thisArg is omitted, undefined is used as the this value.
    */
  def some(
    callbackfn: js.Function3[
      /* value */ scala.Double, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def some(
    callbackfn: js.Function3[
      /* value */ scala.Double, 
      /* index */ scala.Double, 
      /* array */ this.type, 
      scala.Boolean
    ],
    thisArg: js.Any
  ): scala.Boolean = js.native
  /**
    * Sorts an array.
    * @param compareFn The name of the function used to determine the order of the elements. If
    * omitted, the elements are sorted in ascending, ASCII character order.
    */
  def sort(): this.type = js.native
  def sort(compareFn: js.Function2[/* a */ scala.Double, /* b */ scala.Double, scala.Double]): this.type = js.native
  /**
    * Gets a new Int8Array view of the ArrayBuffer store for this array, referencing the elements
    * at begin, inclusive, up to end, exclusive.
    * @param begin The index of the beginning of the array.
    * @param end The index of the end of the array.
    */
  def subarray(begin: scala.Double): Int8Array = js.native
  def subarray(begin: scala.Double, end: scala.Double): Int8Array = js.native
  /**
    * Returns an list of values in the array
    */
  def values(): IterableIterator[scala.Double] = js.native
}

@JSGlobal("Int8Array")
@js.native
class Int8ArrayCls () extends Int8Array {
  def this(arrayOrArrayBuffer: ArrayBufferLike) = this()
  def this(arrayOrArrayBuffer: ArrayLike[scala.Double]) = this()
  def this(elements: Iterable[scala.Double]) = this()
  def this(length: scala.Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: scala.Double) = this()
  def this(buffer: ArrayBufferLike, byteOffset: scala.Double, length: scala.Double) = this()
}

