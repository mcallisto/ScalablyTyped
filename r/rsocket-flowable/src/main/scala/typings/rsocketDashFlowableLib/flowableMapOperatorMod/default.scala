package typings
package rsocketDashFlowableLib.flowableMapOperatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-flowable/FlowableMapOperator", JSImport.Default)
@js.native
class default[T, R] protected () extends FlowableMapOperator[T, R] {
  def this(subscriber: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscriber<R> */ js.Any, fn: js.Function1[/* t */ T, R]) = this()
  /* CompleteClass */
  override def onComplete(): scala.Unit = js.native
  /* CompleteClass */
  override def onError(error: stdLib.Error): scala.Unit = js.native
  /* CompleteClass */
  override def onNext(t: T): scala.Unit = js.native
  /* CompleteClass */
  override def onSubscribe(
    subscription: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ISubscription */ js.Any
  ): scala.Unit = js.native
}

