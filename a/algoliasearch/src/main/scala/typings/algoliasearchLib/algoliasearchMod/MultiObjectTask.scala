package typings
package algoliasearchLib.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * https://www.algolia.com/doc/api-reference/api-methods/add-objects/?language=javascript#response
  */
trait MultiObjectTask extends js.Object {
  var objectIDs: js.Array[java.lang.String]
  var taskID: scala.Double
}

object MultiObjectTask {
  @scala.inline
  def apply(objectIDs: js.Array[java.lang.String], taskID: scala.Double): MultiObjectTask = {
    val __obj = js.Dynamic.literal(objectIDs = objectIDs, taskID = taskID)
  
    __obj.asInstanceOf[MultiObjectTask]
  }
}

