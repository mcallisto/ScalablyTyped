package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "CommonTermsQuery")
@js.native
class CommonTermsQuery protected () extends Query {
  /*
    A query that executes high-frequency terms in a optional sub-query.
    */
  def this(field: java.lang.String, qstr: java.lang.String) = this()
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Sets the analyzer name used to analyze the Query object.
    */
  def analyzer(analyzer: java.lang.String): CommonTermsQuery = js.native
  /*
    Sets the boost value for documents commoning the Query.
    */
  def boost(boost: stdLib.Number): CommonTermsQuery = js.native
  /*
    Sets the maximum threshold/frequency to be considered a low
    frequency term.  Set to a value between 0 and 1.
    */
  def cutoffFrequency(freq: stdLib.Number): CommonTermsQuery = js.native
  /*
    Enables or disables similarity coordinate scoring of documents
    commoning the Query. Default: false.
    */
  def disableCoord(trueFalse: java.lang.String): CommonTermsQuery = js.native
  /*
    Sets the field to query against.
    */
  def field(f: java.lang.String): CommonTermsQuery = js.native
  /*
    Sets the boolean operator to be used for high frequency terms.
    Default: AND
    */
  def highFreqOperator(op: java.lang.String): CommonTermsQuery = js.native
  /*
    Sets the boolean operator to be used for low frequency terms.
    Default: AND
    */
  def lowFreqOperator(op: java.lang.String): CommonTermsQuery = js.native
  /*
    Sets the minimum number of low freq matches that need to match in
    a document before that document is returned in the results.
    */
  def minimumShouldMatch(min: scala.Double): CommonTermsQuery = js.native
  /*
    Sets the minimum number of high freq matches that need to match in
    a document before that document is returned in the results.
    */
  def minimumShouldMatchHighFreq(min: scala.Double): CommonTermsQuery = js.native
  /*
    Sets the minimum number of low freq matches that need to match in
    a document before that document is returned in the results.
    */
  def minimumShouldMatchLowFreq(min: scala.Double): CommonTermsQuery = js.native
  /*
    Sets the query string.
    */
  def query(qstr: java.lang.String): CommonTermsQuery = js.native
  /*
    Retrieves the internal query object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

