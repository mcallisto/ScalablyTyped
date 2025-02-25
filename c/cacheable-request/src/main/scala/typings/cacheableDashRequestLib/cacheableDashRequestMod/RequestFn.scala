package typings
package cacheableDashRequestLib.cacheableDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestFn extends js.Object {
  def apply(options: java.lang.String): nodeLib.httpMod.ClientRequest = js.native
  def apply(
    options: java.lang.String,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def apply(options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def apply(
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def apply(options: nodeLib.urlMod.URL): nodeLib.httpMod.ClientRequest = js.native
  def apply(
    options: nodeLib.urlMod.URL,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def apply(url: java.lang.String, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def apply(
    url: java.lang.String,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
  def apply(url: nodeLib.urlMod.URL, options: nodeLib.httpMod.RequestOptions): nodeLib.httpMod.ClientRequest = js.native
  def apply(
    url: nodeLib.urlMod.URL,
    options: nodeLib.httpMod.RequestOptions,
    callback: js.Function1[/* res */ nodeLib.httpMod.IncomingMessage, scala.Unit]
  ): nodeLib.httpMod.ClientRequest = js.native
}

