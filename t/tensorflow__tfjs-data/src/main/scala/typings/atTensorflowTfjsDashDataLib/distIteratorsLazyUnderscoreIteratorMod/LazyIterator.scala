package typings
package atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "LazyIterator")
@js.native
abstract class LazyIterator[T] () extends js.Object {
  /**
    * Groups elements into batches, represented in column-major form.
    *
    * We can think of the elements of this iterator as 'rows' (even if they are
    * nested structures).  By the same token, consecutive values for a given
    * key within the elements form a 'column'.  This matches the usual sense of
    * 'row' and 'column' when processing tabular data (e.g., parsing a CSV).
    *
    * Thus, "column-major" means that the resulting batch is a (potentially
    * nested) structure representing the columns.  Each column entry, then,
    * contains a collection of the values found in that column for a range of
    * input elements.  This representation allows for vectorized computation, in
    * contrast to the row-major form.
    *
    * The inputs should all have the same nested structure (i.e., of arrays and
    * dicts).  The result is a single object with the same nested structure,
    * where the leaves are arrays collecting the values of the inputs at that
    * location (or, optionally, the result of a custom function applied to those
    * arrays).
    *
    * @param batchSize The number of elements desired per batch.
    * @param smallLastBatch Whether to emit the final batch when it has fewer
    *   than batchSize elements. Default true.
    * @param zipFn: (optional) A function that expects an array of elements at a
    *   single node of the object tree, and returns a `DeepMapResult`.  The
    *   `DeepMapResult` either provides a result value for that node (i.e.,
    *   representing the subtree), or indicates that the node should be processed
    *   recursively.  The default zipFn recurses as far as possible and places
    *   arrays at the leaves.
    * @returns A `LazyIterator` of batches of elements, represented as an object
    *   with collections at the leaves.
    */
  def columnMajorBatch(batchSize: scala.Double): LazyIterator[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer] = js.native
  def columnMajorBatch(batchSize: scala.Double, smallLastBatch: scala.Boolean): LazyIterator[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer] = js.native
  def columnMajorBatch(
    batchSize: scala.Double,
    smallLastBatch: scala.Boolean,
    zipFn: js.Function1[
      /* xs */ js.Array[_], 
      atTensorflowTfjsDashDataLib.distUtilDeepUnderscoreMapMod.DeepMapResult
    ]
  ): LazyIterator[atTensorflowTfjsDashCoreLib.distTensorUnderscoreTypesMod.TensorContainer] = js.native
  /**
    * Concatenate this `LazyIterator` with another.
    *
    * @param iterator A `LazyIterator` to be concatenated onto this one.
    * @param baseErrorHandler An optional function that can intercept `Error`s
    *   raised during a `next()` call on the base stream.  This function can
    *   decide whether the error should be propagated, whether the error should
    *   be ignored, or whether the base stream should be terminated.
    * @returns A `LazyIterator`.
    */
  def concatenate(iterator: LazyIterator[T]): LazyIterator[T] = js.native
  def concatenate(iterator: LazyIterator[T], baseErrorHandler: js.Function1[/* e */ stdLib.Error, scala.Boolean]): LazyIterator[T] = js.native
  /**
    * Filters this stream according to `predicate`.
    *
    * @param predicate A function mapping a stream element to a boolean or a
    * `Promise` for one.
    *
    * @returns A `LazyIterator` of elements for which the predicate was true.
    */
  def filter(predicate: js.Function1[/* value */ T, scala.Boolean]): LazyIterator[T] = js.native
  /**
    * Maps this stream through a 1-to-many transform.
    *
    * @param transform A function mapping a stream element to an array of
    *   transformed elements.
    *
    * @returns A `DataStream` of transformed elements.
    */
  def flatmap[O](transform: js.Function1[/* value */ T, js.Array[O]]): LazyIterator[O] = js.native
  /**
    * Apply a function to every element of the stream.
    *
    * @param f A function to apply to each stream element.
    */
  def forEachAsync(f: js.Function1[/* value */ T, scala.Unit]): js.Promise[scala.Unit] = js.native
  /**
    * Handles errors thrown on this stream using a provided handler function.
    *
    * @param handler A function that handles any `Error` thrown during a `next()`
    *   call and returns true if the stream should continue (dropping the failed
    *   call) or false if the stream should quietly terminate.  If the handler
    *   itself throws (or rethrows) an `Error`, that will be propagated.
    *
    * @returns A `LazyIterator` of elements passed through from upstream,
    *   possibly filtering or terminating on upstream `next()` calls that
    *   throw an `Error`.
    */
  def handleErrors(handler: js.Function1[/* error */ stdLib.Error, scala.Boolean]): LazyIterator[T] = js.native
  /**
    * Maps this stream through a 1-to-1 transform.
    *
    * @param transform A function mapping a stream element to a transformed
    *   element.
    *
    * @returns A `LazyIterator` of transformed elements.
    */
  def map[O](transform: js.Function1[/* value */ T, O]): LazyIterator[O] = js.native
  /**
    * Maps this stream through an async 1-to-1 transform.
    *
    * @param transform A function mapping a stream element to a `Promise` for a
    *   transformed stream element.
    *
    * @returns A `LazyIterator` of transformed elements.
    */
  def mapAsync[O](transform: js.Function1[/* value */ T, js.Promise[O]]): LazyIterator[O] = js.native
  /**
    * Returns a `Promise` for the next element in the stream.
    *
    * When an item can be provided successfully, the return value is
    * `{value:T, done:false}`.
    *
    * Calling next() on a closed stream returns `{value:null, done:true}`.
    */
  def next(): js.Promise[stdLib.IteratorResult[T]] = js.native
  /**
    * Prefetch the first `bufferSize` items in this stream.
    *
    * Note this prefetches Promises, but makes no guarantees about when those
    * Promises resolve.
    *
    * @param bufferSize: An integer specifying the number of elements to be
    *   prefetched.
    */
  def prefetch(bufferSize: scala.Double): LazyIterator[T] = js.native
  /**
    * Draw items from the stream until it is exhausted.
    *
    * This can be useful when the stream has side effects but no output.  In
    * that case, calling this function guarantees that the stream will be
    * fully processed.
    */
  def resolveFully(): js.Promise[scala.Unit] = js.native
  /**
    * Draw items from the stream until it is exhausted, or a predicate fails.
    *
    * This can be useful when the stream has side effects but no output.  In
    * that case, calling this function guarantees that the stream will be
    * fully processed.
    */
  def resolveWhile(predicate: js.Function1[/* r */ T, scala.Boolean]): js.Promise[scala.Unit] = js.native
  /**
    * Groups elements into batches, represented as arrays of elements.
    *
    * We can think of the elements of this iterator as 'rows' (even if they are
    * nested structures).  By the same token, consecutive values for a given
    * key within the elements form a 'column'.  This matches the usual sense of
    * 'row' and 'column' when processing tabular data (e.g., parsing a CSV).
    *
    * Thus, "Row-major" means that the resulting batch is simply a collection of
    * rows: `[row1, row2, row3, ...]`.  This is contrast to the column-major
    * form, which is needed for vectorized computation.
    *
    * @param batchSize The number of elements desired per batch.
    * @param smallLastBatch Whether to emit the final batch when it has fewer
    *   than batchSize elements. Default true.
    * @returns A `LazyIterator` of batches of elements, represented as arrays
    *   of the original element type.
    */
  def rowMajorBatch(batchSize: scala.Double): LazyIterator[js.Array[T]] = js.native
  def rowMajorBatch(batchSize: scala.Double, smallLastBatch: scala.Boolean): LazyIterator[js.Array[T]] = js.native
  /**
    * Force an iterator to execute serially: each next() call will await the
    * prior one, so that they cannot execute concurrently.
    */
  def serial(): LazyIterator[T] = js.native
  /**
    * Apply a function to every element of the stream, forcing serial execution.
    *
    * @param f A function to apply to each stream element.  Should return 'true'
    *   to indicate that the stream should continue, or 'false' to cause it to
    *   terminate.
    */
  def serialForEach(f: js.Function1[/* value */ T, js.Promise[scala.Boolean]]): js.Promise[scala.Unit] = js.native
  /**
    * Maps this stream through a 1-to-1 transform, forcing serial execution.
    *
    * @param transform A function mapping a stream element to a transformed
    *   element.
    *
    * @returns A `LazyIterator` of transformed elements.
    */
  def serialMapAsync[O](transform: js.Function1[/* value */ T, js.Promise[O]]): LazyIterator[O] = js.native
  /**
    * Randomly shuffles the elements of this stream.
    *
    * @param bufferSize: An integer specifying the number of elements from
    * this stream from which the new stream will sample.
    * @param seed: (Optional.) An integer specifying the random seed that
    * will be used to create the distribution.
    */
  def shuffle(windowSize: scala.Double): LazyIterator[T] = js.native
  def shuffle(windowSize: scala.Double, seed: java.lang.String): LazyIterator[T] = js.native
  /**
    * Skips the first `count` items in this stream.
    *
    * @param count The number of items to skip.  If a negative or undefined
    * value is given, the entire stream is returned unaltered.
    */
  def skip(count: scala.Double): LazyIterator[T] = js.native
  def summary(): java.lang.String = js.native
  /**
    * Limits this stream to return at most `count` items.
    *
    * @param count The maximum number of items to provide from the stream. If
    * a negative or undefined value is given, the entire stream is returned
    *   unaltered.
    */
  def take(count: scala.Double): LazyIterator[T] = js.native
  /**
    * Collect all remaining elements of a bounded stream into an array.
    * Obviously this will succeed only for small streams that fit in memory.
    * Useful for testing.
    *
    * @returns A Promise for an array of stream elements, which will resolve
    *   when the stream is exhausted.
    */
  def toArray(): js.Promise[js.Array[T]] = js.native
  /**
    * Collect all elements of this dataset into an array with prefetching 100
    * elements. This is useful for testing, because the prefetch changes the
    * order in which the Promises are resolved along the processing pipeline.
    * This may help expose bugs where results are dependent on the order of
    * Promise resolution rather than on the logical order of the stream (i.e.,
    * due to hidden mutable state).
    *
    * @returns A Promise for an array of stream elements, which will resolve
    *   when the stream is exhausted.
    */
  def toArrayForTest(): js.Promise[js.Array[T]] = js.native
}

