package typings
package electronDashBuilderLib.electronDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-builder", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def archFromString(name: java.lang.String): builderDashUtilLib.outArchMod.Arch = js.native
  def build(): js.Promise[js.Array[java.lang.String]] = js.native
  def build(rawOptions: electronDashBuilderLib.outBuilderMod.CliOptions): js.Promise[js.Array[java.lang.String]] = js.native
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
  def getArchSuffix(arch: builderDashUtilLib.outArchMod.Arch): java.lang.String = js.native
}

