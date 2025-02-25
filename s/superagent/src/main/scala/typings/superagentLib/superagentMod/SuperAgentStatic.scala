package typings
package superagentLib.superagentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuperAgentStatic extends SuperAgent[SuperAgentRequest] {
  var parse: org.scalablytyped.runtime.StringDictionary[Parser] = js.native
  var serialize: org.scalablytyped.runtime.StringDictionary[Serializer] = js.native
  // tslint:disable-next-line:unified-signatures
  def apply(method: java.lang.String, url: java.lang.String): SuperAgentRequest = js.native
  def apply(url: java.lang.String): SuperAgentRequest = js.native
  def agent(): this.type with Request = js.native
}

