package typings
package electronDashBuilderLib.outBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder/out/builder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def build(): js.Promise[js.Array[java.lang.String]] = js.native
  def build(rawOptions: CliOptions): js.Promise[js.Array[java.lang.String]] = js.native
  def coerceTypes(host: js.Any): js.Any = js.native
  def createTargets(
    platforms: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _
    ]
  ): stdLib.Map[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
    stdLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _
    ],
    `type`: java.lang.String
  ): stdLib.Map[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
    stdLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _
    ],
    `type`: java.lang.String,
    arch: java.lang.String
  ): stdLib.Map[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
    stdLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
  def createTargets(
    platforms: js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _
    ],
    `type`: scala.Null,
    arch: java.lang.String
  ): stdLib.Map[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Platform */ _, 
    stdLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
}

