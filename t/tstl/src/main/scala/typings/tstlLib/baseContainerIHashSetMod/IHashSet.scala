package typings
package tstlLib.baseContainerIHashSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.baseContainerUnderscoreIHashContainerMod._IHashContainer because var conflicts: iterator. Inlined hash_function, key_eq, bucket, bucket_count, bucket_size, load_factor, max_load_factor, max_load_factor, reserve, rehash */ @js.native
trait IHashSet[Key, Unique /* <: scala.Boolean */, Source /* <: IHashSet[Key, Unique, Source] */]
  extends tstlLib.baseContainerSetContainerMod.SetContainer[
      Key, 
      Unique, 
      Source, 
      tstlLib.baseContainerSetElementListMod.SetElementListNs.Iterator[Key, Unique, Source], 
      tstlLib.baseContainerSetElementListMod.SetElementListNs.ReverseIterator[Key, Unique, Source]
    ] {
  /**
    * Iterator to the first element in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  def begin(index: scala.Double): tstlLib.baseContainerSetElementListMod.SetElementListNs.Iterator[Key, Unique, Source] = js.native
  /**
    * Compute bucket index for the *key*.
    *
    * @param key Target key.
    * @return Index number.
    */
  def bucket(key: Key): scala.Double = js.native
  /**
    * Get number of buckets.
    */
  def bucket_count(): scala.Double = js.native
  /**
    * Get size of a specific bucket.
    *
    * @param index Specific position.
    * @return Size of the specific bucket.
    */
  def bucket_size(index: scala.Double): scala.Double = js.native
  /**
    * Iterator to the end in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  def end(index: scala.Double): tstlLib.baseContainerSetElementListMod.SetElementListNs.Iterator[Key, Unique, Source] = js.native
  /**
    * Get hash function.
    *
    * @return The hash function.
    */
  def hash_function(): js.Function1[Key, scala.Double] = js.native
  /**
    * Get key equality predicator.
    *
    * @return The key equality predicator.
    */
  def key_eq(): js.Function2[Key, Key, scala.Boolean] = js.native
  /**
    * Compute load factor.
    *
    * @return `this.size() / this.bucket_count()`
    */
  def load_factor(): scala.Double = js.native
  /**
    * Get maximum load factor that allowable.
    *
    * @return The maximum load factor.
    */
  def max_load_factor(): scala.Double = js.native
  /**
    * Set maximum load factor.
    *
    * @param z The new value to change.
    */
  def max_load_factor(z: scala.Double): scala.Unit = js.native
  /**
    * Change of bucktes.
    *
    * @param n The number to change.
    */
  def rehash(n: scala.Double): scala.Unit = js.native
  /**
    * Reserve buckets enable to store *n* elements.
    *
    * @param n The capacity to reserve.
    */
  def reserve(n: scala.Double): scala.Unit = js.native
}

