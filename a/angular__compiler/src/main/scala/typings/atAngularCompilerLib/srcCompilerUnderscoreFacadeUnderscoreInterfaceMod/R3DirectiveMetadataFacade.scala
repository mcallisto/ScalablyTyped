package typings
package atAngularCompilerLib.srcCompilerUnderscoreFacadeUnderscoreInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3DirectiveMetadataFacade extends js.Object {
  var deps: js.Array[R3DependencyMetadataFacade] | scala.Null
  var exportAs: js.Array[java.lang.String] | scala.Null
  var host: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var inputs: js.Array[java.lang.String]
  var lifecycle: atAngularCompilerLib.Anon_UsesOnChanges
  var name: java.lang.String
  var outputs: js.Array[java.lang.String]
  var propMetadata: org.scalablytyped.runtime.StringDictionary[js.Array[_]]
  var providers: js.Array[Provider] | scala.Null
  var queries: js.Array[R3QueryMetadataFacade]
  var selector: java.lang.String | scala.Null
  var `type`: js.Any
  var typeArgumentCount: scala.Double
  var typeSourceSpan: ParseSourceSpan
  var usesInheritance: scala.Boolean
  var viewQueries: js.Array[R3QueryMetadataFacade]
}

object R3DirectiveMetadataFacade {
  @scala.inline
  def apply(
    host: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    inputs: js.Array[java.lang.String],
    lifecycle: atAngularCompilerLib.Anon_UsesOnChanges,
    name: java.lang.String,
    outputs: js.Array[java.lang.String],
    propMetadata: org.scalablytyped.runtime.StringDictionary[js.Array[_]],
    queries: js.Array[R3QueryMetadataFacade],
    `type`: js.Any,
    typeArgumentCount: scala.Double,
    typeSourceSpan: ParseSourceSpan,
    usesInheritance: scala.Boolean,
    viewQueries: js.Array[R3QueryMetadataFacade],
    deps: js.Array[R3DependencyMetadataFacade] = null,
    exportAs: js.Array[java.lang.String] = null,
    providers: js.Array[Provider] = null,
    selector: java.lang.String = null
  ): R3DirectiveMetadataFacade = {
    val __obj = js.Dynamic.literal(host = host, inputs = inputs, lifecycle = lifecycle, name = name, outputs = outputs, propMetadata = propMetadata, queries = queries, typeArgumentCount = typeArgumentCount, typeSourceSpan = typeSourceSpan, usesInheritance = usesInheritance, viewQueries = viewQueries)
    __obj.updateDynamic("type")(`type`)
    if (deps != null) __obj.updateDynamic("deps")(deps)
    if (exportAs != null) __obj.updateDynamic("exportAs")(exportAs)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (selector != null) __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[R3DirectiveMetadataFacade]
  }
}

