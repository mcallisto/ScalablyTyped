package typings
package swaggerDashParserLib.swaggerDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The `dereference` options control how JSON Schema `$Ref` Parser will dereference `$ref` pointers within the JSON schema.
    */
  var dereference: js.UndefOr[swaggerDashParserLib.Anon_Circular] = js.undefined
  /**
    * The `parse` options determine how different types of files will be parsed.
    *
    * JSON Schema `$Ref` Parser comes with built-in JSON, YAML, plain-text, and binary parsers, any of which you can configure or disable. You can also add your own custom parsers if you want.
    */
  var parse: js.UndefOr[swaggerDashParserLib.Anon_Json] = js.undefined
  /**
    * The `resolve` options control how Swagger Parser will resolve file paths and URLs, and how those files will be read/downloaded.
    *
    * JSON Schema `$Ref` Parser comes with built-in support for HTTP and HTTPS, as well as support for local files (when running in Node.js). You can configure or disable either of these built-in resolvers. You can also add your own custom resolvers if you want.
    */
  var resolve: js.UndefOr[swaggerDashParserLib.Anon_External] = js.undefined
  /**
    * The `validate` options control how Swagger Parser will validate the API.
    */
  var validate: js.UndefOr[swaggerDashParserLib.Anon_Schema] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dereference: swaggerDashParserLib.Anon_Circular = null,
    parse: swaggerDashParserLib.Anon_Json = null,
    resolve: swaggerDashParserLib.Anon_External = null,
    validate: swaggerDashParserLib.Anon_Schema = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (dereference != null) __obj.updateDynamic("dereference")(dereference)
    if (parse != null) __obj.updateDynamic("parse")(parse)
    if (resolve != null) __obj.updateDynamic("resolve")(resolve)
    if (validate != null) __obj.updateDynamic("validate")(validate)
    __obj.asInstanceOf[Options]
  }
}

