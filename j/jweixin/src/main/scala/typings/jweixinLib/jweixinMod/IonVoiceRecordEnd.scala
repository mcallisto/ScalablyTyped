package typings
package jweixinLib.jweixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonVoiceRecordEnd extends BaseParams {
  // 录音时间超过一分钟没有停止的时候会执行 complete 回调
  @JSName("complete")
  def complete_MIonVoiceRecordEnd(res: Resouce): scala.Unit
}

object IonVoiceRecordEnd {
  @scala.inline
  def apply(
    complete: Resouce => scala.Unit,
    fail: /* repeated */ js.Any => scala.Unit = null,
    success: /* repeated */ js.Any => scala.Unit = null
  ): IonVoiceRecordEnd = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[IonVoiceRecordEnd]
  }
}

