package typings
package algoliasearchLib.algoliasearchMod.PlacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of search.
  * https://community.algolia.com/places/api-clients.html#json-answer
  */
trait ResultSearchInterface[T /* <: HitInterface | LocalizedHitInterface */] extends js.Object {
  /**
    * Query fallback if query retrieve any result
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var degradedQuery: scala.Boolean
  /**
    * Contains all the hits matching the query.
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var hits: js.Array[T]
  /**
    * Number of total hits matching the query.
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var nbHits: scala.Double
  /**
    * GET parameters used to perform the search.
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var params: java.lang.String
  /**
    * Engine processing time (excluding network transfer).
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var processingTimeMS: scala.Double
  /**
    * Query used to perform the search.
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var query: java.lang.String
}

object ResultSearchInterface {
  @scala.inline
  def apply[T /* <: HitInterface | LocalizedHitInterface */](
    degradedQuery: scala.Boolean,
    hits: js.Array[T],
    nbHits: scala.Double,
    params: java.lang.String,
    processingTimeMS: scala.Double,
    query: java.lang.String
  ): ResultSearchInterface[T] = {
    val __obj = js.Dynamic.literal(degradedQuery = degradedQuery, hits = hits, nbHits = nbHits, params = params, processingTimeMS = processingTimeMS, query = query)
  
    __obj.asInstanceOf[ResultSearchInterface[T]]
  }
}

