package typings
package atPhosphorAlgorithmLib.libArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/algorithm/lib/array", "ArrayExt")
@js.native
object ArrayExtNs extends js.Object {
  /**
    * An array-like object which supports item assignment.
    */
  trait MutableArrayLike[T]
    extends /* index */ org.scalablytyped.runtime.NumberDictionary[T] {
    val length: scala.Double
  }
  
  /**
    * Fill an array with a static value.
    *
    * @param array - The mutable array-like object to fill.
    *
    * @param value - The static value to use to fill the array.
    *
    * @param start - The index of the first element in the range to be
    *   filled, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   filled, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * #### Notes
    * If `stop < start` the fill will wrap at the end of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * A `start` or `stop` which is non-integral.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * let data = ['one', 'two', 'three', 'four'];
    * ArrayExt.fill(data, 'r');        // ['r', 'r', 'r', 'r']
    * ArrayExt.fill(data, 'g', 1);     // ['r', 'g', 'g', 'g']
    * ArrayExt.fill(data, 'b', 2, 3);  // ['r', 'g', 'b', 'b']
    * ArrayExt.fill(data, 'z', 3, 1);  // ['z', 'z', 'b', 'z']
    * ```
    */
  def fill[T](array: MutableArrayLike[T], value: T): scala.Unit = js.native
  def fill[T](array: MutableArrayLike[T], value: T, start: scala.Double): scala.Unit = js.native
  def fill[T](array: MutableArrayLike[T], value: T, start: scala.Double, stop: scala.Double): scala.Unit = js.native
  /**
    * Find the index of the first value which matches a predicate.
    *
    * @param array - The array-like object to search.
    *
    * @param fn - The predicate function to apply to the values.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The index of the first matching value, or `-1` if no
    *   matching value is found.
    *
    * #### Notes
    * If `stop < start` the search will wrap at the end of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * A `start` or `stop` which is non-integral.
    *
    * Modifying the length of the array while searching.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * function isEven(value: number): boolean {
    *   return value % 2 === 0;
    * }
    *
    * let data = [1, 2, 3, 4, 3, 2, 1];
    * ArrayExt.findFirstIndex(data, isEven);       // 1
    * ArrayExt.findFirstIndex(data, isEven, 4);    // 5
    * ArrayExt.findFirstIndex(data, isEven, 6);    // -1
    * ArrayExt.findFirstIndex(data, isEven, 6, 5); // 1
    * ```
    */
  def findFirstIndex[T](
    array: stdLib.ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): scala.Double = js.native
  def findFirstIndex[T](
    array: stdLib.ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double
  ): scala.Double = js.native
  def findFirstIndex[T](
    array: stdLib.ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double,
    stop: scala.Double
  ): scala.Double = js.native
  /**
    * Find the first value which matches a predicate.
    *
    * @param array - The array-like object to search.
    *
    * @param fn - The predicate function to apply to the values.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The first matching value, or `undefined` if no matching
    *   value is found.
    *
    * #### Notes
    * If `stop < start` the search will wrap at the end of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * A `start` or `stop` which is non-integral.
    *
    * Modifying the length of the array while searching.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * function isEven(value: number): boolean {
    *   return value % 2 === 0;
    * }
    *
    * let data = [1, 2, 3, 4, 3, 2, 1];
    * ArrayExt.findFirstValue(data, isEven);       // 2
    * ArrayExt.findFirstValue(data, isEven, 2);    // 4
    * ArrayExt.findFirstValue(data, isEven, 6);    // undefined
    * ArrayExt.findFirstValue(data, isEven, 6, 5); // 2
    * ```
    */
  def findFirstValue[T](
    array: stdLib.ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): js.UndefOr[T] = js.native
  def findFirstValue[T](
    array: stdLib.ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double
  ): js.UndefOr[T] = js.native
  def findFirstValue[T](
    array: stdLib.ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double,
    stop: scala.Double
  ): js.UndefOr[T] = js.native
  /**
    * Find the index of the last value which matches a predicate.
    *
    * @param object - The array-like object to search.
    *
    * @param fn - The predicate function to apply to the values.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The index of the last matching value, or `-1` if no
    *   matching value is found.
    *
    * #### Notes
    * If `start < stop` the search will wrap at the front of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * A `start` or `stop` which is non-integral.
    *
    * Modifying the length of the array while searching.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * function isEven(value: number): boolean {
    *   return value % 2 === 0;
    * }
    *
    * let data = [1, 2, 3, 4, 3, 2, 1];
    * ArrayExt.findLastIndex(data, isEven);        // 5
    * ArrayExt.findLastIndex(data, isEven, 4);     // 3
    * ArrayExt.findLastIndex(data, isEven, 0);     // -1
    * ArrayExt.findLastIndex(data, isEven, 0, 1);  // 5
    * ```
    */
  def findLastIndex[T](
    array: stdLib.ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): scala.Double = js.native
  def findLastIndex[T](
    array: stdLib.ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double
  ): scala.Double = js.native
  def findLastIndex[T](
    array: stdLib.ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double,
    stop: scala.Double
  ): scala.Double = js.native
  /**
    * Find the last value which matches a predicate.
    *
    * @param object - The array-like object to search.
    *
    * @param fn - The predicate function to apply to the values.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The last matching value, or `undefined` if no matching
    *   value is found.
    *
    * #### Notes
    * If `start < stop` the search will wrap at the front of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * A `start` or `stop` which is non-integral.
    *
    * Modifying the length of the array while searching.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * function isEven(value: number): boolean {
    *   return value % 2 === 0;
    * }
    *
    * let data = [1, 2, 3, 4, 3, 2, 1];
    * ArrayExt.findLastValue(data, isEven);        // 2
    * ArrayExt.findLastValue(data, isEven, 4);     // 4
    * ArrayExt.findLastValue(data, isEven, 0);     // undefined
    * ArrayExt.findLastValue(data, isEven, 0, 1);  // 2
    * ```
    */
  def findLastValue[T](
    array: stdLib.ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]
  ): js.UndefOr[T] = js.native
  def findLastValue[T](
    array: stdLib.ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double
  ): js.UndefOr[T] = js.native
  def findLastValue[T](
    array: stdLib.ArrayLike[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double,
    stop: scala.Double
  ): js.UndefOr[T] = js.native
  /**
    * Find the index of the first occurrence of a value in an array.
    *
    * @param array - The array-like object to search.
    *
    * @param value - The value to locate in the array. Values are
    *   compared using strict `===` equality.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The index of the first occurrence of the value, or `-1`
    *   if the value is not found.
    *
    * #### Notes
    * If `stop < start` the search will wrap at the end of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * A `start` or `stop` which is non-integral.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * let data = ['one', 'two', 'three', 'four', 'one'];
    * ArrayExt.firstIndexOf(data, 'red');        // -1
    * ArrayExt.firstIndexOf(data, 'one');        // 0
    * ArrayExt.firstIndexOf(data, 'one', 1);     // 4
    * ArrayExt.firstIndexOf(data, 'two', 2);     // -1
    * ArrayExt.firstIndexOf(data, 'two', 2, 1);  // 1
    * ```
    */
  def firstIndexOf[T](array: stdLib.ArrayLike[T], value: T): scala.Double = js.native
  def firstIndexOf[T](array: stdLib.ArrayLike[T], value: T, start: scala.Double): scala.Double = js.native
  def firstIndexOf[T](array: stdLib.ArrayLike[T], value: T, start: scala.Double, stop: scala.Double): scala.Double = js.native
  /**
    * Insert a value into an array at a specific index.
    *
    * @param array - The array of interest.
    *
    * @param index - The index at which to insert the value. Negative
    *   values are taken as an offset from the end of the array.
    *
    * @param value - The value to set at the specified index.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * An `index` which is non-integral.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * let data = [0, 1, 2];
    * ArrayExt.insert(data, 0, -1);  // [-1, 0, 1, 2]
    * ArrayExt.insert(data, 2, 12);  // [-1, 0, 12, 1, 2]
    * ArrayExt.insert(data, -1, 7);  // [-1, 0, 12, 1, 7, 2]
    * ArrayExt.insert(data, 6, 19);  // [-1, 0, 12, 1, 7, 2, 19]
    * ```
    */
  def insert[T](array: js.Array[T], index: scala.Double, value: T): scala.Unit = js.native
  /**
    * Find the index of the last occurrence of a value in an array.
    *
    * @param array - The array-like object to search.
    *
    * @param value - The value to locate in the array. Values are
    *   compared using strict `===` equality.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The index of the last occurrence of the value, or `-1`
    *   if the value is not found.
    *
    * #### Notes
    * If `start < stop` the search will wrap at the front of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * A `start` or `stop` which is non-integral.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * let data = ['one', 'two', 'three', 'four', 'one'];
    * ArrayExt.lastIndexOf(data, 'red');        // -1
    * ArrayExt.lastIndexOf(data, 'one');        // 4
    * ArrayExt.lastIndexOf(data, 'one', 1);     // 0
    * ArrayExt.lastIndexOf(data, 'two', 0);     // -1
    * ArrayExt.lastIndexOf(data, 'two', 0, 1);  // 1
    * ```
    */
  def lastIndexOf[T](array: stdLib.ArrayLike[T], value: T): scala.Double = js.native
  def lastIndexOf[T](array: stdLib.ArrayLike[T], value: T, start: scala.Double): scala.Double = js.native
  def lastIndexOf[T](array: stdLib.ArrayLike[T], value: T, start: scala.Double, stop: scala.Double): scala.Double = js.native
  /**
    * Find the index of the first element which compares `>=` to a value.
    *
    * @param array - The sorted array-like object to search.
    *
    * @param value - The value to locate in the array.
    *
    * @param fn - The 3-way comparison function to apply to the values.
    *   It should return `< 0` if an element is less than a value, `0` if
    *   an element is equal to a value, or `> 0` if an element is greater
    *   than a value.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The index of the first element which compares `>=` to the
    *   value, or `length` if there is no such element. If the computed
    *   index for `stop` is less than `start`, then the computed index
    *   for `start` is returned.
    *
    * #### Notes
    * The array must already be sorted in ascending order according to
    * the comparison function.
    *
    * #### Complexity
    * Logarithmic.
    *
    * #### Undefined Behavior
    * Searching a range which is not sorted in ascending order.
    *
    * A `start` or `stop` which is non-integral.
    *
    * Modifying the length of the array while searching.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * function numberCmp(a: number, b: number): number {
    *   return a - b;
    * }
    *
    * let data = [0, 3, 4, 7, 7, 9];
    * ArrayExt.lowerBound(data, 0, numberCmp);   // 0
    * ArrayExt.lowerBound(data, 6, numberCmp);   // 3
    * ArrayExt.lowerBound(data, 7, numberCmp);   // 3
    * ArrayExt.lowerBound(data, -1, numberCmp);  // 0
    * ArrayExt.lowerBound(data, 10, numberCmp);  // 6
    * ```
    */
  def lowerBound[T, U](
    array: stdLib.ArrayLike[T],
    value: U,
    fn: js.Function2[/* element */ T, /* value */ U, scala.Double]
  ): scala.Double = js.native
  def lowerBound[T, U](
    array: stdLib.ArrayLike[T],
    value: U,
    fn: js.Function2[/* element */ T, /* value */ U, scala.Double],
    start: scala.Double
  ): scala.Double = js.native
  def lowerBound[T, U](
    array: stdLib.ArrayLike[T],
    value: U,
    fn: js.Function2[/* element */ T, /* value */ U, scala.Double],
    start: scala.Double,
    stop: scala.Double
  ): scala.Double = js.native
  /**
    * Move an element in an array from one index to another.
    *
    * @param array - The mutable array-like object of interest.
    *
    * @param fromIndex - The index of the element to move. Negative
    *   values are taken as an offset from the end of the array.
    *
    * @param toIndex - The target index of the element. Negative
    *   values are taken as an offset from the end of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * A `fromIndex` or `toIndex` which is non-integral.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from from '@phosphor/algorithm';
    *
    * let data = [0, 1, 2, 3, 4];
    * ArrayExt.move(data, 1, 2);  // [0, 2, 1, 3, 4]
    * ArrayExt.move(data, 4, 2);  // [0, 2, 4, 1, 3]
    * ```
    */
  def move[T](array: MutableArrayLike[T], fromIndex: scala.Double, toIndex: scala.Double): scala.Unit = js.native
  /**
    * Remove all occurrences of a value from an array.
    *
    * @param array - The array of interest.
    *
    * @param value - The value to remove from the array. Values are
    *   compared using strict `===` equality.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The number of elements removed from the array.
    *
    * #### Notes
    * If `stop < start` the search will conceptually wrap at the end of
    * the array, however the array will be traversed front-to-back.
    *
    * #### Complexity
    * Linear.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * let data = [14, 12, 23, 39, 14, 12, 19, 14];
    * ArrayExt.removeAllOf(data, 12);        // 2
    * ArrayExt.removeAllOf(data, 17);        // 0
    * ArrayExt.removeAllOf(data, 14, 1, 4);  // 1
    * ```
    */
  def removeAllOf[T](array: js.Array[T], value: T): scala.Double = js.native
  def removeAllOf[T](array: js.Array[T], value: T, start: scala.Double): scala.Double = js.native
  def removeAllOf[T](array: js.Array[T], value: T, start: scala.Double, stop: scala.Double): scala.Double = js.native
  /**
    * Remove all occurrences of values which match a predicate.
    *
    * @param array - The array of interest.
    *
    * @param fn - The predicate function to apply to the values.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The number of elements removed from the array.
    *
    * #### Notes
    * If `stop < start` the search will conceptually wrap at the end of
    * the array, however the array will be traversed front-to-back.
    *
    * #### Complexity
    * Linear.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * function isEven(value: number): boolean {
    *   return value % 2 === 0;
    * }
    *
    * function isNegative(value: number): boolean {
    *   return value < 0;
    * }
    *
    * let data = [0, 12, -13, -9, 23, 39, 14, -15, 12, 75];
    * ArrayExt.removeAllWhere(data, isEven);            // 4
    * ArrayExt.removeAllWhere(data, isNegative, 0, 3);  // 2
    * ```
    */
  def removeAllWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]): scala.Double = js.native
  def removeAllWhere[T](
    array: js.Array[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double
  ): scala.Double = js.native
  def removeAllWhere[T](
    array: js.Array[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double,
    stop: scala.Double
  ): scala.Double = js.native
  /**
    * Remove and return a value at a specific index in an array.
    *
    * @param array - The array of interest.
    *
    * @param index - The index of the value to remove. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The value at the specified index, or `undefined` if the
    *   index is out of range.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * An `index` which is non-integral.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * let data = [0, 12, 23, 39, 14, 12, 75];
    * ArrayExt.removeAt(data, 2);   // 23
    * ArrayExt.removeAt(data, -2);  // 12
    * ArrayExt.removeAt(data, 10);  // undefined;
    * ```
    */
  def removeAt[T](array: js.Array[T], index: scala.Double): js.UndefOr[T] = js.native
  /**
    * Remove the first occurrence of a value from an array.
    *
    * @param array - The array of interest.
    *
    * @param value - The value to remove from the array. Values are
    *   compared using strict `===` equality.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The index of the removed value, or `-1` if the value
    *   is not contained in the array.
    *
    * #### Notes
    * If `stop < start` the search will wrap at the end of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * let data = [0, 12, 23, 39, 14, 12, 75];
    * ArrayExt.removeFirstOf(data, 12);        // 1
    * ArrayExt.removeFirstOf(data, 17);        // -1
    * ArrayExt.removeFirstOf(data, 39, 3);     // -1
    * ArrayExt.removeFirstOf(data, 39, 3, 2);  // 2
    * ```
    */
  def removeFirstOf[T](array: js.Array[T], value: T): scala.Double = js.native
  def removeFirstOf[T](array: js.Array[T], value: T, start: scala.Double): scala.Double = js.native
  def removeFirstOf[T](array: js.Array[T], value: T, start: scala.Double, stop: scala.Double): scala.Double = js.native
  /**
    * Remove the first occurrence of a value which matches a predicate.
    *
    * @param array - The array of interest.
    *
    * @param fn - The predicate function to apply to the values.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The removed `{ index, value }`, which will be `-1` and
    *   `undefined` if the value is not contained in the array.
    *
    * #### Notes
    * If `stop < start` the search will wrap at the end of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * function isEven(value: number): boolean {
    *   return value % 2 === 0;
    * }
    *
    * let data = [0, 12, 23, 39, 14, 12, 75];
    * ArrayExt.removeFirstWhere(data, isEven);     // { index: 0, value: 0 }
    * ArrayExt.removeFirstWhere(data, isEven, 2);  // { index: 3, value: 14 }
    * ArrayExt.removeFirstWhere(data, isEven, 4);  // { index: -1, value: undefined }
    * ```
    */
  def removeFirstWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]): atPhosphorAlgorithmLib.Anon_Index[T] = js.native
  def removeFirstWhere[T](
    array: js.Array[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double
  ): atPhosphorAlgorithmLib.Anon_Index[T] = js.native
  def removeFirstWhere[T](
    array: js.Array[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double,
    stop: scala.Double
  ): atPhosphorAlgorithmLib.Anon_Index[T] = js.native
  /**
    * Remove the last occurrence of a value from an array.
    *
    * @param array - The array of interest.
    *
    * @param value - The value to remove from the array. Values are
    *   compared using strict `===` equality.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The index of the removed value, or `-1` if the value
    *   is not contained in the array.
    *
    * #### Notes
    * If `start < stop` the search will wrap at the end of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * let data = [0, 12, 23, 39, 14, 12, 75];
    * ArrayExt.removeLastOf(data, 12);        // 5
    * ArrayExt.removeLastOf(data, 17);        // -1
    * ArrayExt.removeLastOf(data, 39, 2);     // -1
    * ArrayExt.removeLastOf(data, 39, 2, 3);  // 3
    * ```
    */
  def removeLastOf[T](array: js.Array[T], value: T): scala.Double = js.native
  def removeLastOf[T](array: js.Array[T], value: T, start: scala.Double): scala.Double = js.native
  def removeLastOf[T](array: js.Array[T], value: T, start: scala.Double, stop: scala.Double): scala.Double = js.native
  /**
    * Remove the last occurrence of a value which matches a predicate.
    *
    * @param array - The array of interest.
    *
    * @param fn - The predicate function to apply to the values.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The removed `{ index, value }`, which will be `-1` and
    *   `undefined` if the value is not contained in the array.
    *
    * #### Notes
    * If `start < stop` the search will wrap at the end of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * function isEven(value: number): boolean {
    *   return value % 2 === 0;
    * }
    *
    * let data = [0, 12, 23, 39, 14, 12, 75];
    * ArrayExt.removeLastWhere(data, isEven);        // { index: 5, value: 12 }
    * ArrayExt.removeLastWhere(data, isEven, 2);     // { index: 1, value: 12 }
    * ArrayExt.removeLastWhere(data, isEven, 2, 1);  // { index: -1, value: undefined }
    * ```
    */
  def removeLastWhere[T](array: js.Array[T], fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean]): atPhosphorAlgorithmLib.Anon_Index[T] = js.native
  def removeLastWhere[T](
    array: js.Array[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double
  ): atPhosphorAlgorithmLib.Anon_Index[T] = js.native
  def removeLastWhere[T](
    array: js.Array[T],
    fn: js.Function2[/* value */ T, /* index */ scala.Double, scala.Boolean],
    start: scala.Double,
    stop: scala.Double
  ): atPhosphorAlgorithmLib.Anon_Index[T] = js.native
  /**
    * Reverse an array in-place.
    *
    * @param array - The mutable array-like object of interest.
    *
    * @param start - The index of the first element in the range to be
    *   reversed, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   reversed, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * A `start` or  `stop` index which is non-integral.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * let data = [0, 1, 2, 3, 4];
    * ArrayExt.reverse(data, 1, 3);  // [0, 3, 2, 1, 4]
    * ArrayExt.reverse(data, 3);     // [0, 3, 2, 4, 1]
    * ArrayExt.reverse(data);        // [1, 4, 2, 3, 0]
    * ```
    */
  def reverse[T](array: MutableArrayLike[T]): scala.Unit = js.native
  def reverse[T](array: MutableArrayLike[T], start: scala.Double): scala.Unit = js.native
  def reverse[T](array: MutableArrayLike[T], start: scala.Double, stop: scala.Double): scala.Unit = js.native
  /**
    * Rotate the elements of an array in-place.
    *
    * @param array - The mutable array-like object of interest.
    *
    * @param delta - The amount of rotation to apply to the elements. A
    *   positive value will rotate the elements to the left. A negative
    *   value will rotate the elements to the right.
    *
    * @param start - The index of the first element in the range to be
    *   rotated, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   rotated, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * #### Complexity
    * Linear.
    *
    * #### Undefined Behavior
    * A `delta`, `start`, or `stop` which is non-integral.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * let data = [0, 1, 2, 3, 4];
    * ArrayExt.rotate(data, 2);        // [2, 3, 4, 0, 1]
    * ArrayExt.rotate(data, -2);       // [0, 1, 2, 3, 4]
    * ArrayExt.rotate(data, 10);       // [0, 1, 2, 3, 4]
    * ArrayExt.rotate(data, 9);        // [4, 0, 1, 2, 3]
    * ArrayExt.rotate(data, 2, 1, 3);  // [4, 2, 0, 1, 3]
    * ```
    */
  def rotate[T](array: MutableArrayLike[T], delta: scala.Double): scala.Unit = js.native
  def rotate[T](array: MutableArrayLike[T], delta: scala.Double, start: scala.Double): scala.Unit = js.native
  def rotate[T](array: MutableArrayLike[T], delta: scala.Double, start: scala.Double, stop: scala.Double): scala.Unit = js.native
  /**
    * Find the index of the first element which compares `>` than a value.
    *
    * @param array - The sorted array-like object to search.
    *
    * @param value - The value to locate in the array.
    *
    * @param fn - The 3-way comparison function to apply to the values.
    *   It should return `< 0` if an element is less than a value, `0` if
    *   an element is equal to a value, or `> 0` if an element is greater
    *   than a value.
    *
    * @param start - The index of the first element in the range to be
    *   searched, inclusive. The default value is `0`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @param stop - The index of the last element in the range to be
    *   searched, inclusive. The default value is `-1`. Negative values
    *   are taken as an offset from the end of the array.
    *
    * @returns The index of the first element which compares `>` than the
    *   value, or `length` if there is no such element. If the computed
    *   index for `stop` is less than `start`, then the computed index
    *   for `start` is returned.
    *
    * #### Notes
    * The array must already be sorted in ascending order according to
    * the comparison function.
    *
    * #### Complexity
    * Logarithmic.
    *
    * #### Undefined Behavior
    * Searching a range which is not sorted in ascending order.
    *
    * A `start` or `stop` which is non-integral.
    *
    * Modifying the length of the array while searching.
    *
    * #### Example
    * ```typescript
    * import { ArrayExt } from '@phosphor/algorithm';
    *
    * function numberCmp(a: number, b: number): number {
    *   return a - b;
    * }
    *
    * let data = [0, 3, 4, 7, 7, 9];
    * ArrayExt.upperBound(data, 0, numberCmp);   // 1
    * ArrayExt.upperBound(data, 6, numberCmp);   // 3
    * ArrayExt.upperBound(data, 7, numberCmp);   // 5
    * ArrayExt.upperBound(data, -1, numberCmp);  // 0
    * ArrayExt.upperBound(data, 10, numberCmp);  // 6
    * ```
    */
  def upperBound[T, U](
    array: stdLib.ArrayLike[T],
    value: U,
    fn: js.Function2[/* element */ T, /* value */ U, scala.Double]
  ): scala.Double = js.native
  def upperBound[T, U](
    array: stdLib.ArrayLike[T],
    value: U,
    fn: js.Function2[/* element */ T, /* value */ U, scala.Double],
    start: scala.Double
  ): scala.Double = js.native
  def upperBound[T, U](
    array: stdLib.ArrayLike[T],
    value: U,
    fn: js.Function2[/* element */ T, /* value */ U, scala.Double],
    start: scala.Double,
    stop: scala.Double
  ): scala.Double = js.native
}

