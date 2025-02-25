package typings
package nightwatchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Callback[Sections /* <: nightwatchLib.nightwatchMod.EnhancedPageObjectSections */] extends js.Object {
  /**
    * A map of Element objects (see [Enhanced Element Instances](https://github.com/nightwatchjs/nightwatch/wiki/Page-Object-API#enhanced-element-instances)) used by element selectors.
    */
  var elements: org.scalablytyped.runtime.StringDictionary[
    nightwatchLib.nightwatchMod.EnhancedElementInstance[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias nightwatch.nightwatch.EnhancedPageObject<Commands, Elements, Sections> */ js.Object
    ]
  ] = js.native
  /**
    * The name of the page object as defined by its module name (not including the extension).
    * This is the same name used to access the `page` object factory from the page reference in the command API.
    */
  var name: java.lang.String = js.native
  var section: Sections = js.native
  /**
    * This command is an alias to url and also a convenience method because when called without any arguments
    *  it performs a call to .url() with passing the value of `url` property on the page object.
    * Uses `url` protocol command.
    */
  def navigate(): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias nightwatch.nightwatch.EnhancedPageObject<Commands, Elements, Sections> */ js.Object = js.native
  def navigate(url: java.lang.String): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias nightwatch.nightwatch.EnhancedPageObject<Commands, Elements, Sections> */ js.Object = js.native
  def navigate(url: java.lang.String, callback: js.Function0[scala.Unit]): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias nightwatch.nightwatch.EnhancedPageObject<Commands, Elements, Sections> */ js.Object = js.native
}

