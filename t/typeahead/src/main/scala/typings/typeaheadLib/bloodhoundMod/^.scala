package typings
package typeaheadLib.bloodhoundMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bloodhound is the typeahead.js suggestion engine. Bloodhound is robust,
  * flexible, and offers advanced functionalities such as prefetching,
  * intelligent caching, fast lookups, and backfilling with remote data.
  */
@JSImport("bloodhound", JSImport.Namespace)
@js.native
class ^[T] protected ()
  extends typeaheadLib.Bloodhound[T] {
  /**
    * The constructor function.
    *
    * @constructor
    * @param options Options hash.
    */
  def this(options: typeaheadLib.BloodhoundNs.BloodhoundOptions[T]) = this()
}

@JSImport("bloodhound", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * The Bloodhound suggestion engine is token-based, so how datums and queries are tokenized plays a vital role in the quality of search results.
    * Specify how you want datums and queries tokenized.
    */
  var tokenizers: typeaheadLib.BloodhoundNs.Tokenizers = js.native
  /**
    * Returns a reference to Bloodhound and reverts window.Bloodhound to its
    * previous value. Can be used to avoid naming collisions.
    */
  def noConflict(): typeaheadLib.Bloodhound[_] = js.native
}

