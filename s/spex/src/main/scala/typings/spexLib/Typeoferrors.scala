package typings
package spexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoferrors extends js.Object {
  // API: http://vitaly-t.github.io/spex/errors.BatchError.html
  var BatchError: org.scalablytyped.runtime.Instantiable0[spexLib.spexMod.errorsNs.BatchError]
  // API: http://vitaly-t.github.io/spex/errors.PageError.html
  var PageError: org.scalablytyped.runtime.Instantiable0[spexLib.spexMod.errorsNs.PageError]
  // API: http://vitaly-t.github.io/spex/errors.SequenceError.html
  var SequenceError: org.scalablytyped.runtime.Instantiable0[spexLib.spexMod.errorsNs.SequenceError]
}

object Typeoferrors {
  @scala.inline
  def apply(
    BatchError: org.scalablytyped.runtime.Instantiable0[spexLib.spexMod.errorsNs.BatchError],
    PageError: org.scalablytyped.runtime.Instantiable0[spexLib.spexMod.errorsNs.PageError],
    SequenceError: org.scalablytyped.runtime.Instantiable0[spexLib.spexMod.errorsNs.SequenceError]
  ): Typeoferrors = {
    val __obj = js.Dynamic.literal(BatchError = BatchError, PageError = PageError, SequenceError = SequenceError)
  
    __obj.asInstanceOf[Typeoferrors]
  }
}

