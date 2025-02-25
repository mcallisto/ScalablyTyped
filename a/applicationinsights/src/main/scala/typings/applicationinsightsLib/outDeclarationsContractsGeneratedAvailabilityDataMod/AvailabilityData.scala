package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedAvailabilityDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Instances of AvailabilityData represent the result of executing an availability test.
  */
@js.native
trait AvailabilityData
  extends applicationinsightsLib.outDeclarationsContractsGeneratedDomainMod.^ {
  /**
    * Duration in format: DD.HH:MM:SS.MMMMMM. Must be less than 1000 days.
    */
  var duration: java.lang.String = js.native
  /**
    * Identifier of a test run. Use it to correlate steps of test run and telemetry generated by the service.
    */
  var id: java.lang.String = js.native
  /**
    * Collection of custom measurements.
    */
  var measurements: js.Any = js.native
  /**
    * Diagnostic message for the result.
    */
  var message: java.lang.String = js.native
  /**
    * Name of the test that these availability results represent.
    */
  var name: java.lang.String = js.native
  /**
    * Collection of custom properties.
    */
  var properties: js.Any = js.native
  /**
    * Name of the location where the test was run from.
    */
  var runLocation: java.lang.String = js.native
  /**
    * Success flag.
    */
  var success: scala.Boolean = js.native
  /**
    * Schema version
    */
  var ver: scala.Double = js.native
}

