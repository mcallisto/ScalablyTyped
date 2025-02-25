package typings
package stylusLib.stylusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StylusNs {
  type Dictionary[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Middleware = js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* next */ js.Function1[/* repeated */ js.Any, js.Any], 
    scala.Unit
  ]
  type RenderCallback = js.Function3[
    /* err */ stdLib.Error, 
    /* css */ java.lang.String, 
    /* js */ java.lang.String, 
    scala.Unit
  ]
}
