package typings
package ioDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/es6", "RefinementType")
@js.native
class RefinementType[C /* <: Any */, A, O, I] protected () extends Type[A, O, I] {
  def this(name: java.lang.String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], `type`: C, predicate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Predicate<A> */ js.Any) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.RefinementType = js.native
  val predicate: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Predicate<A> */ js.Any = js.native
  val `type`: C = js.native
}

