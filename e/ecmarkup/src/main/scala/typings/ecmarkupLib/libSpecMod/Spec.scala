package typings
package ecmarkupLib.libSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  var namespace: java.lang.String
  var opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Options */ js.Any
  var rootDir: java.lang.String
  var rootPath: java.lang.String
  var spec: this.type
  def exportBiblio(): js.Any
  def toHTML(): java.lang.String
}

object Spec {
  @scala.inline
  def apply(
    exportBiblio: () => js.Any,
    namespace: java.lang.String,
    opts: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Options */ js.Any,
    rootDir: java.lang.String,
    rootPath: java.lang.String,
    spec: Spec,
    toHTML: () => java.lang.String
  ): Spec = {
    val __obj = js.Dynamic.literal(exportBiblio = js.Any.fromFunction0(exportBiblio), namespace = namespace, opts = opts, rootDir = rootDir, rootPath = rootPath, spec = spec, toHTML = js.Any.fromFunction0(toHTML))
  
    __obj.asInstanceOf[Spec]
  }
}

