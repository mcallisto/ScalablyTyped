package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Model")
@js.native
class Model () extends Transformable {
  def add(args: (Shape | Model | Light)*): this.type = js.native
  def append(): this.type = js.native
  def eachRenderable(
    lightFn: js.Function2[/* light */ Light, /* matrix */ js.UndefOr[Matrix], this.type],
    shapeFn: js.Function3[
      /* item */ Shape | this.type, 
      /* lightModels */ js.UndefOr[js.Array[this.type]], 
      /* matrix */ js.UndefOr[Matrix], 
      _
    ]
  ): scala.Unit = js.native
  def eachShape(f: js.Function1[/* shape */ Shape, _]): scala.Unit = js.native
  def remove(args: (Shape | Model | Light)*): scala.Unit = js.native
}

