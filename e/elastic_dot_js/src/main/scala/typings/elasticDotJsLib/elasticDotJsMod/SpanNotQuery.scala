package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "SpanNotQuery")
@js.native
class SpanNotQuery protected () extends Query {
  /*
    Removes matches which overlap with another span query.
    */
  def this(includeQry: Query, excludeQry: Query) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the boost value for documents matching the Query.
    */
  def boost(boost: scala.Double): SpanNotQuery = js.native
  /*
    Sets the span query whose matches must not overlap those returned.
    */
  def exclude(spanQuery: js.Object): SpanNotQuery = js.native
  /*
    Set the span query whose matches are filtered.
    */
  def include(spanQuery: js.Object): SpanNotQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

