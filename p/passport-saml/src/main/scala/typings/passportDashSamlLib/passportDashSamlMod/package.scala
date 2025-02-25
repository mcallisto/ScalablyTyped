package typings
package passportDashSamlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object passportDashSamlMod {
  type CertCallback = js.Function1[
    /* callback */ js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* cert */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
      scala.Unit
    ], 
    scala.Unit
  ]
  type VerifiedCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* user */ js.UndefOr[js.Object], 
    /* info */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type VerifyWithRequest = js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* profile */ Profile, 
    /* done */ VerifiedCallback, 
    scala.Unit
  ]
  type VerifyWithoutRequest = js.Function2[/* profile */ Profile, /* done */ VerifiedCallback, scala.Unit]
}
