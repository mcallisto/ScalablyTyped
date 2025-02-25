package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "ConstantScoreQuery")
@js.native
/*
  Constructs a query where each documents returned by the internal
  query or filter have a constant score equal to the boost factor.
  */
class ConstantScoreQuery () extends Query {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): ConstantScoreQuery = js.native
  /*
    Enables caching of the filter.
    */
  def cache(trueFalse: scala.Boolean): ConstantScoreQuery = js.native
  /*
    Set the cache key.
    */
  def cacheKey(k: java.lang.String): ConstantScoreQuery = js.native
  /*
    Adds the filter to apply a constant score to.
    */
  def filter(oFilter: js.Object): ConstantScoreQuery = js.native
  /*
    Adds the query to apply a constant score to.
    */
  def query(oQuery: js.Object): ConstantScoreQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

