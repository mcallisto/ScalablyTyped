package typings
package koaDashSessionLib.koaDashSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Session model.
  */
trait Session
  extends /**
  * allow to put any value on session object
  */
/* _ */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Return how many values there are in the session object.
    * Used to see if it"s "populated".
    */
  val length: scala.Double
  /**
    * get/set session maxAge
    */
  var maxAge: js.UndefOr[scala.Double | koaDashSessionLib.koaDashSessionLibStrings.session] = js.undefined
  /**
    * populated flag, which is just a boolean alias of .length.
    */
  val populated: scala.Boolean
  /**
    * alias to `toJSON`
    */
  def inspect(): js.Object
  /**
    * save this session no matter whether it is populated
    */
  def save(): scala.Unit
  /**
    * JSON representation of the session.
    */
  def toJSON(): js.Object
}

object Session {
  @scala.inline
  def apply(
    inspect: () => js.Object,
    length: scala.Double,
    populated: scala.Boolean,
    save: () => scala.Unit,
    toJSON: () => js.Object,
    StringDictionary: /**
    * allow to put any value on session object
    */
  /* _ */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    maxAge: scala.Double | koaDashSessionLib.koaDashSessionLibStrings.session = null
  ): Session = {
    val __obj = js.Dynamic.literal(inspect = js.Any.fromFunction0(inspect), length = length, populated = populated, save = js.Any.fromFunction0(save), toJSON = js.Any.fromFunction0(toJSON))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

