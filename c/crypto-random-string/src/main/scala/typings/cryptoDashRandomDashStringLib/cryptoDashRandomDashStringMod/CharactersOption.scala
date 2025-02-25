package typings
package cryptoDashRandomDashStringLib.cryptoDashRandomDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharactersOption extends js.Object {
  /**
  	Use only characters from a custom set of allowed characters.
  	Cannot be set at the same time as the `type` option.
  	Minimum length: `1`
  	Maximum length: `65536`
  	@example
  	```
  	cryptoRandomString({length: 10, characters:'0123456789'});
  	//=> '8796225811'
  	```
  	*/
  var characters: js.UndefOr[java.lang.String] = js.undefined
}

object CharactersOption {
  @scala.inline
  def apply(characters: java.lang.String = null): CharactersOption = {
    val __obj = js.Dynamic.literal()
    if (characters != null) __obj.updateDynamic("characters")(characters)
    __obj.asInstanceOf[CharactersOption]
  }
}

