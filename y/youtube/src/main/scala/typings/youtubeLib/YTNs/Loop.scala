package typings
package youtubeLib.YTNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - youtubeLib.youtubeLibNumbers.`0`
  - youtubeLib.youtubeLibNumbers.`1`
*/
trait Loop extends js.Object

object Loop {
  /**
  		 * Video or playlist will be played over and over again.
  		 */
  @scala.inline
  def Loop: youtubeLib.youtubeLibNumbers.`1` = this.cast(1)
  /**
  		 * Video or playlist will be played only once.
  		 */
  @scala.inline
  def SinglePlay: youtubeLib.youtubeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

