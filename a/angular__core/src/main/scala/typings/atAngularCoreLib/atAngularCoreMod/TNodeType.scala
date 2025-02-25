package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * TNodeType corresponds to the {@link TNode} `type` property.
  */
/* Rewritten from type alias, can be one of: 
  - atAngularCoreLib.atAngularCoreLibNumbers.`0`
  - atAngularCoreLib.atAngularCoreLibNumbers.`1`
  - atAngularCoreLib.atAngularCoreLibNumbers.`2`
  - atAngularCoreLib.atAngularCoreLibNumbers.`3`
  - atAngularCoreLib.atAngularCoreLibNumbers.`4`
  - atAngularCoreLib.atAngularCoreLibNumbers.`5`
*/
trait TNodeType extends js.Object

object TNodeType {
  /**
    * The TNode contains information about an {@link LContainer} for embedded views.
    */
  @scala.inline
  def Container: atAngularCoreLib.atAngularCoreLibNumbers.`0` = this.cast(0)
  /**
    * The TNode contains information about a DOM element aka {@link RNode}.
    */
  @scala.inline
  def Element: atAngularCoreLib.atAngularCoreLibNumbers.`3` = this.cast(3)
  /**
    * The TNode contains information about an `<ng-container>` element {@link RNode}.
    */
  @scala.inline
  def ElementContainer: atAngularCoreLib.atAngularCoreLibNumbers.`4` = this.cast(4)
  /**
    * The TNode contains information about an ICU comment used in `i18n`.
    */
  @scala.inline
  def IcuContainer: atAngularCoreLib.atAngularCoreLibNumbers.`5` = this.cast(5)
  /**
    * The TNode contains information about an `<ng-content>` projection
    */
  @scala.inline
  def Projection: atAngularCoreLib.atAngularCoreLibNumbers.`1` = this.cast(1)
  /**
    * The TNode contains information about an {@link LView}
    */
  @scala.inline
  def View: atAngularCoreLib.atAngularCoreLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

