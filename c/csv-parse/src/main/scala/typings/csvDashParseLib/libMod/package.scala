package typings
package csvDashParseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
  type Callback = js.Function3[
    /* err */ js.UndefOr[stdLib.Error], 
    /* records */ js.UndefOr[js.Any], 
    /* info */ Info, 
    scala.Unit
  ]
  type CastingDateFunction = js.Function2[/* value */ java.lang.String, /* context */ CastingContext, stdLib.Date]
  type CastingFunction = js.Function2[/* value */ java.lang.String, /* context */ CastingContext, js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - `js.undefined`
    - scala.Nothing
    - scala.Null
    - csvDashParseLib.csvDashParseLibNumbers.`false`
    - csvDashParseLib.Anon_Name
  */
  type ColumnOption = js.UndefOr[_ColumnOption | java.lang.String | scala.Null]
}
