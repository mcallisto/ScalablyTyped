package typings
package phaserLib.PhaserNs.TypesNs.SoundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Audio sprite sound type.
  */
trait AudioSpriteSound extends js.Object {
  /**
    * Local reference to 'spritemap' object form json file generated by audiosprite tool.
    */
  var spritemap: js.Object
}

object AudioSpriteSound {
  @scala.inline
  def apply(spritemap: js.Object): AudioSpriteSound = {
    val __obj = js.Dynamic.literal(spritemap = spritemap)
  
    __obj.asInstanceOf[AudioSpriteSound]
  }
}

