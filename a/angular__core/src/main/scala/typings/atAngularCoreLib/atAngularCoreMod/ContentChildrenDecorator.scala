package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentChildrenDecorator
  extends org.scalablytyped.runtime.Instantiable2[
      (/* selector */ js.Function) | (/* selector */ java.lang.String) | (/* selector */ Type[js.Any]), 
      /* opts */ atAngularCoreLib.Anon_Descendants, 
      Query
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* selector */ js.Function) | (/* selector */ java.lang.String) | (/* selector */ Type[js.Any]), 
      Query
    ] {
  /**
    * Configures a content query.
    *
    * You can use ContentChildren to get the `QueryList` of elements or directives from the
    * content DOM. Any time a child element is added, removed, or moved, the query list will be
    * updated, and the changes observable of the query list will emit a new value.
    *
    * Content queries are set before the `ngAfterContentInit` callback is called.
    *
    * **Metadata Properties**:
    *
    * * **selector** - the directive type or the name used for querying.
    * * **descendants** - include only direct children or all descendants.
    * * **read** - read a different token from the queried elements.
    *
    * @usageNotes
    * ### Basic Example
    *
    * Here is a simple demonstration of how the `ContentChildren` decorator can be used.
    *
    * {@example core/di/ts/contentChildren/content_children_howto.ts region='HowTo'}
    *
    * ### Tab-pane Example
    *
    * Here is a slightly more realistic example that shows how `ContentChildren` decorators
    * can be used to implement a tab pane component.
    *
    * {@example core/di/ts/contentChildren/content_children_example.ts region='Component'}
    *
    * @Annotation
    */
  def apply(selector: Type[_]): js.Any = js.native
  def apply(selector: Type[_], opts: atAngularCoreLib.Anon_Descendants): js.Any = js.native
  def apply(selector: java.lang.String): js.Any = js.native
  def apply(selector: java.lang.String, opts: atAngularCoreLib.Anon_Descendants): js.Any = js.native
  def apply(selector: js.Function): js.Any = js.native
  def apply(selector: js.Function, opts: atAngularCoreLib.Anon_Descendants): js.Any = js.native
}

