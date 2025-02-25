package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugNode extends js.Object {
  val componentInstance: js.Any
  val context: js.Any
  val injector: Injector
  val listeners: js.Array[DebugEventListener]
  val nativeNode: js.Any
  val parent: DebugElement | scala.Null
  val providerTokens: js.Array[_]
  val references: org.scalablytyped.runtime.StringDictionary[js.Any]
}

@JSImport("@angular/core", "DebugNode")
@js.native
class DebugNodeCls protected () extends DebugNode {
  def this(args: js.Any*) = this()
  /* CompleteClass */
  override val componentInstance: js.Any = js.native
  /* CompleteClass */
  override val context: js.Any = js.native
  /* CompleteClass */
  override val injector: Injector = js.native
  /* CompleteClass */
  override val listeners: js.Array[DebugEventListener] = js.native
  /* CompleteClass */
  override val nativeNode: js.Any = js.native
  /* CompleteClass */
  override val parent: DebugElement | scala.Null = js.native
  /* CompleteClass */
  override val providerTokens: js.Array[_] = js.native
  /* CompleteClass */
  override val references: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

@JSImport("@angular/core", "DebugNode")
@js.native
object DebugNode
  extends org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, DebugNode]

