package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Array[T]
  extends /* n */ org.scalablytyped.runtime.NumberDictionary[T] {
  /** Iterator */
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[T]] = js.native
  /**
    * Gets or sets the length of the array. This is a number one higher than the highest element defined in an array.
    */
  var length: scala.Double = js.native
  /**
    * Returns an object whose properties have the value 'true'
    * when they will be absent when used in a 'with' statement.
    */
  @JSName(scala.scalajs.js.Symbol.unscopables)
  var unscopables: js.Function0[Anon_CopyWithin] = js.native
  /**
    * Combines two or more arrays.
    * @param items Additional items to add to the end of array1.
    */
  def concat(items: (js.Array[T] | T)*): js.Array[T] = js.native
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
    * Returns an iterable of key, value pairs for every entry in the array
    */
  def entries(): IterableIterator[js.Tuple2[scala.Double, T]] = js.native
  /**
    * Determines whether all the members of an array satisfy the specified test.
    * @param callbackfn A function that accepts up to three arguments. The every method calls the callbackfn function for each element in array1 until the callbackfn returns false, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def every(callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], _]): scala.Boolean = js.native
  def every(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], _],
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
  def fill(value: T): this.type = js.native
  def fill(value: T, start: scala.Double): this.type = js.native
  def fill(value: T, start: scala.Double, end: scala.Double): this.type = js.native
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    * @param callbackfn A function that accepts up to three arguments. The filter method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def filter(callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], _]): js.Array[T] = js.native
  def filter(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], _],
    thisArg: js.Any
  ): js.Array[T] = js.native
  /**
    * Returns the elements of an array that meet the condition specified in a callback function.
    * @param callbackfn A function that accepts up to three arguments. The filter method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  @JSName("filter")
  def filter_ST[S /* <: T */](
    callbackfn: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ js.Array[T], 
      /* is S */ scala.Boolean
    ]
  ): js.Array[S] = js.native
  @JSName("filter")
  def filter_ST[S /* <: T */](
    callbackfn: js.Function3[
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ js.Array[T], 
      /* is S */ scala.Boolean
    ],
    thisArg: js.Any
  ): js.Array[S] = js.native
  def find(predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ js.Array[T], _]): js.UndefOr[T] = js.native
  def find(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ js.Array[T], _],
    thisArg: js.Any
  ): js.UndefOr[T] = js.native
  /**
    * Returns the value of the first element in the array where predicate is true, and undefined
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found, find
    * immediately returns that element value. Otherwise, find returns undefined.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def find[S /* <: T */](
    predicate: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* value */ T, 
      /* index */ scala.Double, 
      /* obj */ js.Array[T], 
      /* is S */ scala.Boolean
    ]
  ): js.UndefOr[S] = js.native
  def find[S /* <: T */](
    predicate: js.ThisFunction3[
      /* this */ scala.Unit, 
      /* value */ T, 
      /* index */ scala.Double, 
      /* obj */ js.Array[T], 
      /* is S */ scala.Boolean
    ],
    thisArg: js.Any
  ): js.UndefOr[S] = js.native
  /**
    * Returns the index of the first element in the array where predicate is true, and -1
    * otherwise.
    * @param predicate find calls predicate once for each element of the array, in ascending
    * order, until it finds one where predicate returns true. If such an element is found,
    * findIndex immediately returns that element index. Otherwise, findIndex returns -1.
    * @param thisArg If provided, it will be used as the this value for each invocation of
    * predicate. If it is not provided, undefined is used instead.
    */
  def findIndex(predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ js.Array[T], _]): scala.Double = js.native
  def findIndex(
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ js.Array[T], _],
    thisArg: js.Any
  ): scala.Double = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth. If no depth is provided, flat method defaults to the depth of 1.
    *
    * @param depth The maximum recursion depth
    */
  def flat[U](): js.Array[_] = js.native
  def flat[U](depth: scala.Double): js.Array[_] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  def flat[U](`this`: js.Array[js.Array[U]]): js.Array[U] = js.native
  /**
    * Calls a defined callback function on each element of an array. Then, flattens the result into
    * a new array.
    * This is identical to a map followed by flat with depth 1.
    *
    * @param callback A function that accepts up to three arguments. The flatMap method calls the
    * callback function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callback function. If
    * thisArg is omitted, undefined is used as the this value.
    */
  def flatMap[U, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ js.Array[T], 
      U | js.Array[U]
    ]
  ): js.Array[U] = js.native
  def flatMap[U, This](
    callback: js.ThisFunction3[
      /* this */ This, 
      /* value */ T, 
      /* index */ scala.Double, 
      /* array */ js.Array[T], 
      U | js.Array[U]
    ],
    thisArg: This
  ): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_0[U](`this`: js.Array[U], depth: stdLib.stdLibNumbers.`0`): js.Array[U] = js.native
  @JSName("flat")
  def flat_1[U](`this`: js.Array[js.Array[U]], depth: stdLib.stdLibNumbers.`1`): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_2[U](`this`: js.Array[js.Array[js.Array[U]]], depth: stdLib.stdLibNumbers.`2`): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_3[U](`this`: js.Array[js.Array[js.Array[js.Array[U]]]], depth: stdLib.stdLibNumbers.`3`): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_4[U](`this`: js.Array[js.Array[js.Array[js.Array[js.Array[U]]]]], depth: stdLib.stdLibNumbers.`4`): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_5[U](
    `this`: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[U]]]]]],
    depth: stdLib.stdLibNumbers.`5`
  ): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_6[U](
    `this`: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[U]]]]]]],
    depth: stdLib.stdLibNumbers.`6`
  ): js.Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_7[U](
    `this`: js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[js.Array[U]]]]]]]],
    depth: stdLib.stdLibNumbers.`7`
  ): js.Array[U] = js.native
  /**
    * Performs the specified action for each element in an array.
    * @param callbackfn  A function that accepts up to three arguments. forEach calls the callbackfn function one time for each element in the array.
    * @param thisArg  An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit]
  ): scala.Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
  /**
    * Determines whether an array includes a certain element, returning true or false as appropriate.
    * @param searchElement The element to search for.
    * @param fromIndex The position in this array at which to begin searching for searchElement.
    */
  def includes(searchElement: T): scala.Boolean = js.native
  def includes(searchElement: T, fromIndex: scala.Double): scala.Boolean = js.native
  /**
    * Returns the index of the first occurrence of a value in an array.
    * @param searchElement The value to locate in the array.
    * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at index 0.
    */
  def indexOf(searchElement: T): scala.Double = js.native
  def indexOf(searchElement: T, fromIndex: scala.Double): scala.Double = js.native
  /**
    * Adds all the elements of an array separated by the specified separator string.
    * @param separator A string used to separate one element of an array from the next in the resulting String. If omitted, the array elements are separated with a comma.
    */
  def join(): java.lang.String = js.native
  def join(separator: java.lang.String): java.lang.String = js.native
  /**
    * Returns an iterable of keys in the array
    */
  def keys(): IterableIterator[scala.Double] = js.native
  /**
    * Returns the index of the last occurrence of a specified value in an array.
    * @param searchElement The value to locate in the array.
    * @param fromIndex The array index at which to begin the search. If fromIndex is omitted, the search starts at the last index in the array.
    */
  def lastIndexOf(searchElement: T): scala.Double = js.native
  def lastIndexOf(searchElement: T, fromIndex: scala.Double): scala.Double = js.native
  /**
    * Calls a defined callback function on each element of an array, and returns an array that contains the results.
    * @param callbackfn A function that accepts up to three arguments. The map method calls the callbackfn function one time for each element in the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def map[U](callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], U]): js.Array[U] = js.native
  def map[U](
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], U],
    thisArg: js.Any
  ): js.Array[U] = js.native
  /**
    * Removes the last element from an array and returns it.
    */
  def pop(): js.UndefOr[T] = js.native
  /**
    * Appends new elements to an array, and returns the new length of the array.
    * @param items New elements of the Array.
    */
  def push(items: T*): scala.Double = js.native
  /**
    * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ]
  ): T = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  /**
    * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ]
  ): T = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ T, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      T
    ],
    initialValue: T
  ): T = js.native
  /**
    * Calls the specified callback function for all the elements in an array, in descending order. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduceRight method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  @JSName("reduceRight")
  def reduceRight_UU[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  /**
    * Calls the specified callback function for all the elements in an array. The return value of the callback function is the accumulated result, and is provided as an argument in the next call to the callback function.
    * @param callbackfn A function that accepts up to four arguments. The reduce method calls the callbackfn function one time for each element in the array.
    * @param initialValue If initialValue is specified, it is used as the initial value to start the accumulation. The first call to the callbackfn function provides this value as an argument instead of an array value.
    */
  @JSName("reduce")
  def reduce_UU[U](
    callbackfn: js.Function4[
      /* previousValue */ U, 
      /* currentValue */ T, 
      /* currentIndex */ scala.Double, 
      /* array */ js.Array[T], 
      U
    ],
    initialValue: U
  ): U = js.native
  /**
    * Reverses the elements in an Array.
    */
  def reverse(): js.Array[T] = js.native
  /**
    * Removes the first element from an array and returns it.
    */
  def shift(): js.UndefOr[T] = js.native
  /**
    * Returns a section of an array.
    * @param start The beginning of the specified portion of the array.
    * @param end The end of the specified portion of the array.
    */
  def slice(): js.Array[T] = js.native
  def slice(start: scala.Double): js.Array[T] = js.native
  def slice(start: scala.Double, end: scala.Double): js.Array[T] = js.native
  /**
    * Determines whether the specified callback function returns true for any element of an array.
    * @param callbackfn A function that accepts up to three arguments. The some method calls the callbackfn function for each element in array1 until the callbackfn returns true, or until the end of the array.
    * @param thisArg An object to which the this keyword can refer in the callbackfn function. If thisArg is omitted, undefined is used as the this value.
    */
  def some(callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], _]): scala.Boolean = js.native
  def some(
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], _],
    thisArg: js.Any
  ): scala.Boolean = js.native
  /**
    * Sorts an array.
    * @param compareFn The name of the function used to determine the order of the elements. If omitted, the elements are sorted in ascending, ASCII character order.
    */
  def sort(): this.type = js.native
  def sort(compareFn: js.Function2[/* a */ T, /* b */ T, scala.Double]): this.type = js.native
  /**
    * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
    * @param start The zero-based location in the array from which to start removing elements.
    * @param deleteCount The number of elements to remove.
    */
  def splice(start: scala.Double): js.Array[T] = js.native
  def splice(start: scala.Double, deleteCount: scala.Double): js.Array[T] = js.native
  /**
    * Removes elements from an array and, if necessary, inserts new elements in their place, returning the deleted elements.
    * @param start The zero-based location in the array from which to start removing elements.
    * @param deleteCount The number of elements to remove.
    * @param items Elements to insert into the array in place of the deleted elements.
    */
  def splice(start: scala.Double, deleteCount: scala.Double, items: T*): js.Array[T] = js.native
  /**
    * Inserts new elements at the start of an array.
    * @param items  Elements to insert at the start of the Array.
    */
  def unshift(items: T*): scala.Double = js.native
  /**
    * Returns an iterable of values in the array
    */
  def values(): IterableIterator[T] = js.native
}

@JSGlobal("Array")
@js.native
class ArrayCls[T] protected () extends Array[T] {
  def this(arrayLength: scala.Double) = this()
  def this(items: T*) = this()
}

