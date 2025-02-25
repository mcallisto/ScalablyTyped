package typings
package atJupyterlabMathjax2Lib.atJupyterlabMathjax2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/mathjax2", "MathJaxTypesetter")
@js.native
class MathJaxTypesetter protected ()
  extends atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.ILatexTypesetter {
  /**
    * Create a new MathJax typesetter.
    */
  def this(options: atJupyterlabMathjax2Lib.atJupyterlabMathjax2Mod.MathJaxTypesetterNs.IOptions) = this()
  var _config: js.Any = js.native
  /**
    * Initialize MathJax.
    */
  var _init: js.Any = js.native
  var _initPromise: js.Any = js.native
  var _initialized: js.Any = js.native
  /**
    * Handle MathJax loading.
    */
  var _onLoad: js.Any = js.native
  var _url: js.Any = js.native
  /**
    * Typeset a DOM element.
    *
    * @param element - the DOM element to typeset. The typesetting may
    *   happen synchronously or asynchronously.
    *
    * #### Notes
    * The application-wide rendermime object has a settable
    * `latexTypesetter` property which is used wherever LaTeX
    * typesetting is required. Extensions wishing to provide their
    * own typesetter may replace that on the global `lab.rendermime`.
    */
  /* CompleteClass */
  override def typeset(element: stdLib.HTMLElement): scala.Unit = js.native
}

