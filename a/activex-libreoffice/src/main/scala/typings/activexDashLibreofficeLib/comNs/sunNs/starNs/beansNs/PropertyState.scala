package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This enumeration lists the states that a property value can have.
  *
  * The state consists of two aspects:
  *
  *  1. whether a value is available or void, 2. whether the value is stored in the property set itself or is a default, or ambiguous.
  * @see XPropertyState
  * @see Property
  */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
*/
trait PropertyState extends js.Object

object PropertyState {
  /**
    * The value of the property is only a recommendation because there are multiple values for this property (e.g., from a multi selection).
    *
    * The {@link PropertyAttribute} field in the struct {@link Property} must contain the {@link PropertyAttribute.MAYBEAMBIGUOUS} flag. The property value
    * must be available and of the specified type. If the Attribute field in the struct {@link Property} contains {@link PropertyAttribute.MAYBEVOID} , then
    * the value may be void.
    */
  @scala.inline
  def AMBIGUOUS_VALUE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /**
    * The value of the property is available from a master (e.g., template). <p>The PropertyAttribute field in the struct
    *
    * Property must contain the
    *
    * PropertyAttribute::MAYBEDEFAULT flag. The property
    *
    * value must be available and of the specified type. If the
    *
    * PropertyAttribute field in the struct Property
    *
    * contains PropertyAttribute::MAYBEVOID, then the
    *
    * value may be void. </p>
    */
  @scala.inline
  def DEFAULT_VALUE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * The value of the property is stored in the {@link PropertySet} itself. <p>The property value must be available and of the specified type.
    *
    * If the PropertyAttribute field in the struct
    *
    * Property contains PropertyAttribute::MAYBEVOID,
    *
    * then the value may be void. </p>
    */
  @scala.inline
  def DIRECT_VALUE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

