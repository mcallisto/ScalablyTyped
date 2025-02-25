package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ajax extends js.Object {
  var master: js.Any = js.native
  def bind(master: js.Any): Ajax = js.native
  def del(url: java.lang.String): js.Promise[_] = js.native
  def del(url: java.lang.String, params: js.Any): js.Promise[_] = js.native
  def del(url: java.lang.String, params: js.Any, callback: WebixCallback): js.Promise[_] = js.native
  def get(url: java.lang.String): js.Promise[_] = js.native
  def get(url: java.lang.String, params: js.Any): js.Promise[_] = js.native
  def get(url: java.lang.String, params: js.Any, callback: WebixCallback): js.Promise[_] = js.native
  def getXHR(): js.Any = js.native
  def headers(values: js.Any): Ajax = js.native
  def post(url: java.lang.String): js.Promise[_] = js.native
  def post(url: java.lang.String, params: js.Any): js.Promise[_] = js.native
  def post(url: java.lang.String, params: js.Any, callback: WebixCallback): js.Promise[_] = js.native
  def put(url: java.lang.String): js.Promise[_] = js.native
  def put(url: java.lang.String, params: js.Any): js.Promise[_] = js.native
  def put(url: java.lang.String, params: js.Any, callback: WebixCallback): js.Promise[_] = js.native
  def response(`type`: java.lang.String): Ajax = js.native
  def stringify(data: js.Any): java.lang.String = js.native
  def sync(): Ajax = js.native
}

