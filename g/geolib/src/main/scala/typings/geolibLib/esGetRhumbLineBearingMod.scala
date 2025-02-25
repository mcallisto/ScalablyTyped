package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geolib/es/getRhumbLineBearing", JSImport.Namespace)
@js.native
object esGetRhumbLineBearingMod extends js.Object {
  /**
    * Gets rhumb line bearing of two points. Find out about the difference between rhumb line and
    * great circle bearing on Wikipedia. It's quite complicated. Rhumb line should be fine in most cases:
    *
    * http://en.wikipedia.org/wiki/Rhumb_line#General_and_mathematical_description
    *
    * Function heavily based on Doug Vanderweide's great PHP version (licensed under GPL 3.0)
    * http://www.dougv.com/2009/07/13/calculating-the-bearing-and-compass-rose-direction-between-two-latitude-longitude-coordinates-in-php/
    */
  def default(
    origin: geolibLib.esTypesMod.GeolibInputCoordinates,
    dest: geolibLib.esTypesMod.GeolibInputCoordinates
  ): scala.Double = js.native
}

