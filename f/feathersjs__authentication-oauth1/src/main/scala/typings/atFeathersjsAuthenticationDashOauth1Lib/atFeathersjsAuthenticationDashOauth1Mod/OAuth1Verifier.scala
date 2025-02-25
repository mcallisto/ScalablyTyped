package typings
package atFeathersjsAuthenticationDashOauth1Lib.atFeathersjsAuthenticationDashOauth1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@feathersjs/authentication-oauth1", "OAuth1Verifier")
@js.native
class OAuth1Verifier protected () extends js.Object {
  def this(app: atFeathersjsFeathersLib.atFeathersjsFeathersMod.Application[js.Object], options: js.Any) = this()
   // updates an existing entity
  def _createEntity(data: atFeathersjsAuthenticationDashOauth1Lib.Anon_AccessToken): js.Promise[_] = js.native
  def _normalizeResult[T](results: atFeathersjsFeathersLib.atFeathersjsFeathersMod.Paginated[T]): js.Promise[T] = js.native
   // creates an entity if they didn't exist already
  def _normalizeResult[T](results: js.Array[T]): js.Promise[T] = js.native
  def _updateEntity(entity: js.Any, data: atFeathersjsAuthenticationDashOauth1Lib.Anon_AccessToken): js.Promise[_] = js.native
   // normalizes result from service to account for pagination
  def verify(
    req: expressLib.expressMod.Request,
    accessToken: java.lang.String,
    refreshToken: java.lang.String,
    profile: js.Any,
    done: js.Function3[
      /* err */ stdLib.Error | scala.Null, 
      /* user */ js.Object, 
      /* info */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

