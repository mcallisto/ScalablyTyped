package typings
package reactDashMentionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashMentionsMod {
  type DataFunc = js.Function2[
    /* query */ java.lang.String, 
    /* callback */ js.Function1[/* data */ js.Array[SuggestionDataItem], scala.Unit], 
    scala.Unit | js.Array[SuggestionDataItem]
  ]
  type DisplayTransformFunc = js.Function2[/* id */ java.lang.String, /* display */ java.lang.String, java.lang.String]
  type MentionsInputClass = reactLib.reactMod.ComponentClass[MentionsInputProps, reactLib.reactMod.ComponentState]
  type OnChangeHandlerFunc = js.Function4[
    /* event */ reactDashMentionsLib.Anon_Target, 
    /* newValue */ java.lang.String, 
    /* newPlainTextValue */ java.lang.String, 
    /* mentions */ js.Array[MentionItem], 
    scala.Unit
  ]
}
