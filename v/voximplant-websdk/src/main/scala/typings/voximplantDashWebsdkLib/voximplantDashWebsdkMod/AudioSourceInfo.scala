package typings
package voximplantDashWebsdkLib.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	*	Audio recording device info
	*/
trait AudioSourceInfo extends js.Object {
  /**
  		*	Device id that can be used to choose audio recording device
  		*/
  var id: scala.Double | java.lang.String
  /**
  		*	Device name , in WebRTC mode populated with real data only when app has been opened using HTTPS protocol
  		*/
  var name: java.lang.String
}

object AudioSourceInfo {
  @scala.inline
  def apply(id: scala.Double | java.lang.String, name: java.lang.String): AudioSourceInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[AudioSourceInfo]
  }
}

