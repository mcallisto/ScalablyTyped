package typings
package utilityDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distUtilityDashTypesMod {
  type $Call[Fn /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type $Diff[T /* <: U */, U /* <: js.Object */] = stdLib.Pick[
    T, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify SetComplement<keyof T, keyof U> */ js.Any
  ]
  type $ElementType[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in K & any ]: any}
    */ utilityDashTypesLib.utilityDashTypesLibStrings.DOLLARElementType with js.Any */, K /* <: java.lang.String | scala.Double */] = /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  type $Keys[T /* <: js.Object */] = java.lang.String
  type $PropertyType[T /* <: js.Object */, K /* <: java.lang.String */] = /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
  type $ReadOnly[T /* <: js.Object */] = /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DeepReadonly<T> */ js.Any
  type $Values[T /* <: js.Object */] = /* import warning: ImportType.apply Failed type conversion: T[keyof T] */ js.Any
}
