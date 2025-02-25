package typings
package elasticDotJsLib.elasticDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elastic.js", "RandomScoreFunction")
@js.native
/*
  Randomly score documents.
  */
class RandomScoreFunction () extends ScoreFunction {
  /*
    The type of ejs object.  For internal use only.
    */
  def _type(): java.lang.String = js.native
  /*
    Adds a filter whose matching documents will have the score function applied.
    */
  def filter(oFilter: Filter): RandomScoreFunction = js.native
  /*
    Sets random seed value.
    */
  def seed(s: scala.Double): RandomScoreFunction = js.native
  /*
    Retrieves the internal agg object. This is typically used by
    internal API functions so use with caution.
    */
  def toJSON(): js.Any = js.native
}

