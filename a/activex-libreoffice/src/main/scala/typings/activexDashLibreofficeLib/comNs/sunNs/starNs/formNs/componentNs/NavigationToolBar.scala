package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service specifies the model for control which provides controller functionality for a {@link DataForm} , such as navigating or filtering the
  * form.
  */
@js.native
trait NavigationToolBar
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.FormControlModel {
  /**
    * denotes the border style of the control.
    *
    * Allowed values are **0** : no border at all**1** : 3D border**2** : simple flat
    */
  var Border: scala.Double = js.native
  /** determines whether the control is enabled or disabled. */
  var Enabled: scala.Boolean = js.native
  /** contains the font attributes for the text in the control */
  var FontDescriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.FontDescriptor = js.native
  /**
    * specifies the emphasis mark for the font described in {@link FontDescriptor}
    *
    * The value must be one of the {@link com.sun.star.text.FontEmphasis} constants.
    */
  var FontEmphasisMark: scala.Double = js.native
  /**
    * specifies the relief for the font described in {@link FontDescriptor}
    *
    * The value must be one of the {@link com.sun.star.text.FontRelief} constants.
    */
  var FontRelief: scala.Double = js.native
  /**
    * specifies the size of the icons in the control
    *
    * At least the following values are to be supported: 0: small icons (16x16)1: medium size icons (26x26)
    */
  var IconSize: scala.Double = js.native
  /**
    * specifies a repeat delay for the control
    *
    * Some buttons of a {@link NavigationToolBar} may show repeating behavior, e.g. may be repeatedly triggered when the user keeps the mouse pressed over
    * such a button. ;  The delay between two such triggers (in milliseconds) is specified with this property.
    */
  var RepeatDelay: scala.Double = js.native
  /** determines whether the control should provide functionality for filtering and sorting the parent form */
  var ShowFilterSort: scala.Boolean = js.native
  /** determines whether the control should provide functionality for navigating the parent form */
  var ShowNavigation: scala.Boolean = js.native
  /** determines whether the control should provide functionality for positioning the parent form */
  var ShowPosition: scala.Boolean = js.native
  /** determines whether the control should provide functionality for acting on the current record of the parent form */
  var ShowRecordActions: scala.Boolean = js.native
  /** specifies the text color (as RGB value) of the control. */
  var TextColor: scala.Double = js.native
  /**
    * specifies the text line color (as RGB value) of the control.
    *
    * This color is used if the {@link FontDescriptor} defines that the text in the control should be underlined or stroke out.
    */
  var TextLineColor: scala.Double = js.native
}

