package typings
package vegaDashTypingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesRuntimeMod {
  type DataListenerHandler = js.Function2[/* name */ java.lang.String, /* value */ js.Any, scala.Unit]
  type EventListenerHandler = js.Function2[/* event */ ScenegraphEvent, /* item */ js.UndefOr[Item[js.Any]], scala.Unit]
  type ResizeHandler = js.Function2[/* width */ scala.Double, /* height */ scala.Double, scala.Unit]
  type Runtime = js.Any
  type RuntimeMark = DefineMark[
    vegaDashTypingsLib.vegaDashTypingsLibStrings.group | vegaDashTypingsLib.vegaDashTypingsLibStrings.rect | vegaDashTypingsLib.vegaDashTypingsLibStrings.symbol | vegaDashTypingsLib.vegaDashTypingsLibStrings.path | vegaDashTypingsLib.vegaDashTypingsLibStrings.arc | vegaDashTypingsLib.vegaDashTypingsLibStrings.area | vegaDashTypingsLib.vegaDashTypingsLibStrings.line | vegaDashTypingsLib.vegaDashTypingsLibStrings.image | vegaDashTypingsLib.vegaDashTypingsLibStrings.text, 
    vegaDashTypingsLib.Anon_Fill | js.Object, 
    vegaDashTypingsLib.vegaDashTypingsLibStrings.`legend-symbol` | vegaDashTypingsLib.vegaDashTypingsLibStrings.`axis-label` | vegaDashTypingsLib.vegaDashTypingsLibStrings.`legend-label` | scala.Nothing
  ]
  type ScenegraphEvent = stdLib.MouseEvent | stdLib.TouchEvent | stdLib.KeyboardEvent
  type SignalListenerHandler = js.Function2[
    /* name */ java.lang.String, 
    /* value */ vegaDashTypingsLib.typesSpecSignalMod.SignalValue, 
    scala.Unit
  ]
  type TooltipHandler = js.Function4[
    /* handler */ js.Any, 
    /* event */ stdLib.MouseEvent, 
    /* item */ Item[js.Any], 
    /* value */ js.Any, 
    scala.Unit
  ]
}
