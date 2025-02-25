package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options which may be used when getting SODA collection names.
  */
trait SodaCollectionNamesOptions extends js.Object {
  /** Limits the number of names returned. If limit is 0 or undefined, then all collection names are returned. */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Returns names that start with the given string, and all subsequent names, in alphabetic order.
    * For example, if collections with names “cat”, “dog”, and “zebra” exist, then using startsWith of “d” will return
    * “dog” and “zebra”. If startsWith is an empty string or undefined, all collection names are returned, subject to the value of limit.
    */
  var startsWith: js.UndefOr[java.lang.String] = js.undefined
}

object SodaCollectionNamesOptions {
  @scala.inline
  def apply(limit: scala.Int | scala.Double = null, startsWith: java.lang.String = null): SodaCollectionNamesOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (startsWith != null) __obj.updateDynamic("startsWith")(startsWith)
    __obj.asInstanceOf[SodaCollectionNamesOptions]
  }
}

