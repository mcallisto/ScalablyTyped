package typings
package inversifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/utils/binding_utils", JSImport.Namespace)
@js.native
object dtsUtilsBindingUnderscoreUtilsMod extends js.Object {
  def multiBindToService(
    container: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify interfaces.Container */ js.Any
  ): js.Function1[
    /* service */ java.lang.String | js.Symbol | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify interfaces.Newable<any> */ js.Any), 
    js.Function1[
      /* repeated */ java.lang.String | js.Symbol | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify interfaces.Newable<any> */ _), 
      scala.Unit
    ]
  ] = js.native
}

