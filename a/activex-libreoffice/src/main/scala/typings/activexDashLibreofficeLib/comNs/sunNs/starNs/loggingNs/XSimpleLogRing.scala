package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a simple log ring allowing to collect a limited number of last events
  *
  * The intention of this interface is to provide a simple possibility for developer to collect the most important events without affecting the
  * performance. For this reasons the messages related API is quite simple, the strings should be produced by the preprocessor mainly.
  * @since OOo 3.2
  */
trait XSimpleLogRing extends js.Object {
  /**
    * allows to get the collected messages from the logger
    *
    * It is up to logger implementation to provide only the limited number of last messages.
    */
  val CollectedLog: stdLib.SafeArray[java.lang.String]
  /**
    * allows to get the collected messages from the logger
    *
    * It is up to logger implementation to provide only the limited number of last messages.
    */
  def getCollectedLog(): stdLib.SafeArray[java.lang.String]
  /** allows to add a message to the logger */
  def logString(aMessage: java.lang.String): scala.Unit
}

object XSimpleLogRing {
  @scala.inline
  def apply(
    CollectedLog: stdLib.SafeArray[java.lang.String],
    getCollectedLog: () => stdLib.SafeArray[java.lang.String],
    logString: java.lang.String => scala.Unit
  ): XSimpleLogRing = {
    val __obj = js.Dynamic.literal(CollectedLog = CollectedLog, getCollectedLog = js.Any.fromFunction0(getCollectedLog), logString = js.Any.fromFunction1(logString))
  
    __obj.asInstanceOf[XSimpleLogRing]
  }
}

