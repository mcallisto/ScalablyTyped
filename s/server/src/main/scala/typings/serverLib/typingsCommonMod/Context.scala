package typings
package serverLib.typingsCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var cookie: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var data: js.Any
  var error: stdLib.Error
  var files: formidableLib.formidableMod.Files
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var ip: java.lang.String
  var ips: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var log: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in server.server/typings/common.LogLevel ]: server.server/typings/common.LogFn}
    */ serverLib.serverLibStrings.Context with js.Any
  var method: java.lang.String
  var options: serverLib.typingsOptionsMod.Options
  var params: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var path: java.lang.String
  var query: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  var req: expressLib.expressMod.Request
  var res: expressLib.expressMod.Response
  var secure: scala.Boolean
  var session: js.Object
  var url: java.lang.String
  var xhr: scala.Boolean
}

object Context {
  @scala.inline
  def apply(
    cookie: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    data: js.Any,
    error: stdLib.Error,
    files: formidableLib.formidableMod.Files,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    ip: java.lang.String,
    log: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in server.server/typings/common.LogLevel ]: server.server/typings/common.LogFn}
    */ serverLib.serverLibStrings.Context with js.Any,
    method: java.lang.String,
    options: serverLib.typingsOptionsMod.Options,
    params: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    path: java.lang.String,
    query: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]],
    req: expressLib.expressMod.Request,
    res: expressLib.expressMod.Response,
    secure: scala.Boolean,
    session: js.Object,
    url: java.lang.String,
    xhr: scala.Boolean,
    ips: js.Array[java.lang.String] = null
  ): Context = {
    val __obj = js.Dynamic.literal(cookie = cookie, data = data, error = error, files = files, headers = headers, ip = ip, log = log, method = method, options = options, params = params, path = path, query = query, req = req, res = res, secure = secure, session = session, url = url, xhr = xhr)
    if (ips != null) __obj.updateDynamic("ips")(ips)
    __obj.asInstanceOf[Context]
  }
}

