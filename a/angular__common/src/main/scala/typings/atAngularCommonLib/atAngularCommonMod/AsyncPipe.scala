package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "AsyncPipe")
@js.native
class AsyncPipe protected ()
  extends atAngularCoreLib.atAngularCoreMod.OnDestroy
     with atAngularCoreLib.atAngularCoreMod.PipeTransform {
  def this(_ref: atAngularCoreLib.atAngularCoreMod.ChangeDetectorRef) = this()
  var _dispose: js.Any = js.native
  var _latestReturnedValue: js.Any = js.native
  var _latestValue: js.Any = js.native
  var _obj: js.Any = js.native
  var _ref: js.Any = js.native
  var _selectStrategy: js.Any = js.native
  var _strategy: js.Any = js.native
  var _subscribe: js.Any = js.native
  var _subscription: js.Any = js.native
  var _updateLatestValue: js.Any = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): scala.Unit = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  def transform[T](): js.UndefOr[scala.Nothing] = js.native
  def transform[T](obj: js.Promise[T]): T | scala.Null = js.native
  def transform[T](obj: rxjsLib.rxjsMod.Observable[T]): T | scala.Null = js.native
  @JSName("transform")
  def transform_TNull[T](): scala.Null = js.native
}

