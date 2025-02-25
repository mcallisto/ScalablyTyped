package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * manages one or more complete sets of hierarchy data and serves as a factory for objects that provide access to a subset of the data.
  *
  * **Note:** This is an abstract service. This means, that there should never be implementations that can be instantiated using the service name
  * `com.sun.star.ucb.HierarchyDataSource` . Each implementation must provide its own service name that can be used to create instances of that service
  * implementation. Important for those service specifications is also to specify which of the optional parts are supported by the implementation.
  */
@js.native
trait HierarchyDataSource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

