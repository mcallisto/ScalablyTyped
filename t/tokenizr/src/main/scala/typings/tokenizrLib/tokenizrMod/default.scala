package typings
package tokenizrLib.tokenizrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tokenizr", JSImport.Default)
@js.native
class default () extends Tokenizr

/* static members */
@JSImport("tokenizr", JSImport.Default)
@js.native
object default extends js.Object {
  val ActionContext: org.scalablytyped.runtime.Instantiable1[/* e */ js.Any, tokenizrLib.tokenizrMod.ActionContext] = js.native
  val ParsingError: org.scalablytyped.runtime.Instantiable5[
    /* message */ java.lang.String, 
    /* pos */ scala.Double, 
    /* line */ scala.Double, 
    /* column */ scala.Double, 
    /* input */ java.lang.String, 
    tokenizrLib.tokenizrMod.ParsingError
  ] = js.native
  val Token: org.scalablytyped.runtime.Instantiable6[
    /* type */ java.lang.String, 
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ /* value */ js.Any, 
    /* text */ java.lang.String, 
    js.UndefOr[/* pos */ scala.Double], 
    js.UndefOr[/* line */ scala.Double], 
    js.UndefOr[/* column */ scala.Double], 
    tokenizrLib.tokenizrMod.Token[js.Object]
  ] = js.native
}

