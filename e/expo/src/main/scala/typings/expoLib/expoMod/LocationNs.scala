package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Location")
@js.native
object LocationNs extends js.Object {
  @js.native
  sealed trait Accuracy extends js.Object
  
  trait Coords extends LocationProps {
    var accuracy: scala.Double
    var altitude: scala.Double
  }
  
  trait GeocodeData extends js.Object {
    var city: java.lang.String
    var country: java.lang.String
    var name: java.lang.String
    var postalCode: java.lang.String
    var region: java.lang.String
    var street: java.lang.String
  }
  
  trait HeadingStatus extends js.Object {
    var accuracy: scala.Double
    var magHeading: scala.Double
    var trueHeading: scala.Double
  }
  
  trait LocationData extends js.Object {
    var coords: expoLib.Anon_Heading with Coords
    var timestamp: scala.Double
  }
  
  trait LocationOptions extends js.Object {
    var accuracy: scala.Double
    var distanceInterval: js.UndefOr[scala.Double] = js.undefined
    var timeInterval: js.UndefOr[scala.Double] = js.undefined
    var timeout: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait LocationProps extends js.Object {
    var latitude: scala.Double
    var longitude: scala.Double
  }
  
  trait LocationTaskOptions extends js.Object {
    var accuracy: js.UndefOr[scala.Double] = js.undefined
    var distanceInterval: scala.Double
    var showsBackgroundLocationIndicator: js.UndefOr[scala.Boolean] = js.undefined
    var timeInterval: scala.Double
  }
  
  trait ProviderStatus extends js.Object {
    var gpsAvailable: js.UndefOr[scala.Boolean] = js.undefined
    var locationServicesEnabled: scala.Boolean
    var networkAvailable: js.UndefOr[scala.Boolean] = js.undefined
    var passiveAvailable: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait Region extends js.Object {
    var identifier: js.UndefOr[java.lang.String] = js.undefined
    var latitude: scala.Double
    var longitude: scala.Double
    var notifyOnEnter: js.UndefOr[scala.Boolean] = js.undefined
    var notifyOnExit: js.UndefOr[scala.Boolean] = js.undefined
    var radius: scala.Double
  }
  
  def geocodeAsync(address: java.lang.String): js.Promise[Coords] = js.native
  def getCurrentPositionAsync(options: LocationOptions): js.Promise[LocationData] = js.native
  def getHeadingAsync(): js.Promise[HeadingStatus] = js.native
  def getProviderStatusAsync(): js.Promise[ProviderStatus] = js.native
  def hasServicesEnabledAsync(): js.Promise[scala.Boolean] = js.native
  def hasStartedGeofencingAsync(taskName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def hasStartedLocationUpdatesAsync(taskName: java.lang.String): js.Promise[scala.Boolean] = js.native
  def requestPermissionsAsync(): js.Promise[scala.Unit] = js.native
  def reverseGeocodeAsync(location: LocationProps): js.Promise[js.Array[GeocodeData]] = js.native
  def setApiKey(key: java.lang.String): scala.Unit = js.native
  def startGeofencingAsync(taskName: java.lang.String, regions: js.Array[Region]): js.Promise[scala.Unit] = js.native
  def startLocationUpdatesAsync(taskName: java.lang.String, options: LocationTaskOptions): js.Promise[scala.Unit] = js.native
  def stopGeofencingAsync(taskName: java.lang.String): js.Promise[scala.Unit] = js.native
  def stopLocationUpdatesAsync(taskName: java.lang.String): js.Promise[scala.Unit] = js.native
  def watchHeadingAsync(callback: js.Function1[/* status */ HeadingStatus, scala.Unit]): fbemitterLib.fbemitterMod.EventSubscription = js.native
  def watchPositionAsync(options: LocationOptions, callback: LocationCallback): fbemitterLib.fbemitterMod.EventSubscription = js.native
  @js.native
  object Accuracy extends js.Object {
    @js.native
    sealed trait Balanced
      extends expoLib.expoMod.LocationNs.Accuracy
    
    @js.native
    sealed trait BestForNavigation
      extends expoLib.expoMod.LocationNs.Accuracy
    
    @js.native
    sealed trait High
      extends expoLib.expoMod.LocationNs.Accuracy
    
    @js.native
    sealed trait Highest
      extends expoLib.expoMod.LocationNs.Accuracy
    
    @js.native
    sealed trait Low
      extends expoLib.expoMod.LocationNs.Accuracy
    
    @js.native
    sealed trait Lowest
      extends expoLib.expoMod.LocationNs.Accuracy
    
    /* 3 */ val Balanced: Balanced with scala.Double = js.native
    /* 6 */ val BestForNavigation: BestForNavigation with scala.Double = js.native
    /* 4 */ val High: High with scala.Double = js.native
    /* 5 */ val Highest: Highest with scala.Double = js.native
    /* 2 */ val Low: Low with scala.Double = js.native
    /* 1 */ val Lowest: Lowest with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[expoLib.expoMod.LocationNs.Accuracy with scala.Double] = js.native
  }
  
  type LocationCallback = js.Function1[/* data */ LocationData, scala.Unit]
}

