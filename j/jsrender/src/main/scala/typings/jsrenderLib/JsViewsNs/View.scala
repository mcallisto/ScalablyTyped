package typings
package jsrenderLib.JsViewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View extends js.Object {
  /* Block content template (for block tags) */
  var content: js.UndefOr[Template] = js.native
  /* View context (helpers and parameters from parent views) */
  var ctx: Context = js.native
  /* contextual data */
  var data: js.Any = js.native
  /* Index of this view in parent views collection */
  var index: scala.Double = js.native
  /* Parent view */
  var parent: View = js.native
  /* root View (top-level) */
  var root: View = js.native
  var scope: View = js.native
  /* tag (for tag views) */
  var tag: Tag = js.native
  /* Template rendered by view */
  @JSName("tmpl")
  var tmpl_Original: Template = js.native
  /* View type */
  var `type`: java.lang.String = js.native
  /* Child views */
  var views: js.Array[View] with Hash[View] = js.native
  /* view.ctxPrm() method: get/set contextual parameter or helper */
  def ctxPrm(name: java.lang.String): js.Any = js.native
  def ctxPrm(name: java.lang.String, value: js.Any): js.Any = js.native
  /* view.get() method: find parent or child views */
  def get(): View = js.native
  def get(inner: scala.Boolean): View = js.native
  def get(inner: scala.Boolean, `type`: java.lang.String): View = js.native
  def get(`type`: java.lang.String): View = js.native
  /* view.getIndex() method: get index of parent "item" view */
  def getIndex(): scala.Double = js.native
   // get/set in JsViews but get only in JsRender
  /* Find contextual template resource */
  def getRsc(namedCollection: java.lang.String, itemName: java.lang.String): js.Any = js.native
  /**
    * Template render method: render the template as a string, using the specified data and helpers/context
    * var htmlString = template(data, myHelpersObject);
    * var htmlString = template.render(data, myHelpersObject);
    *
    * $("#tmpl").render(), tmpl.render(), tagCtx.render(), $.render.namedTmpl()
    *
    * @param {any}        data
    * @param {hash}       [helpersOrContext]
    * @param {boolean}    [noIteration]
    * @returns {string}   rendered template
    */
  /* Template rendered by view */
  def tmpl(): java.lang.String = js.native
  def tmpl(data: js.Any): java.lang.String = js.native
  def tmpl(data: js.Any, helpersOrContext: Hash[_]): java.lang.String = js.native
  def tmpl(data: js.Any, helpersOrContext: Hash[_], noIteration: scala.Boolean): java.lang.String = js.native
  def tmpl(data: js.Any, noIteration: scala.Boolean): java.lang.String = js.native
}

