package typings
package rxDashDomLib.rxDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "SchedulerCls")
@js.native
class SchedulerCls protected ()
  extends rxLib.rxMod.SchedulerCls {
  def this(now: js.Function0[scala.Double], schedule: js.Function2[
      /* state */ js.Any, 
      /* action */ js.Function2[
        /* scheduler */ rxDashLiteLib.RxNs.IScheduler, 
        /* state */ js.Any, 
        rxDashCoreLib.RxNs.IDisposable
      ], 
      rxDashCoreLib.RxNs.IDisposable
    ], scheduleRelative: js.Function3[
      /* state */ js.Any, 
      /* dueTime */ scala.Double, 
      /* action */ js.Function2[
        /* scheduler */ rxDashLiteLib.RxNs.IScheduler, 
        /* state */ js.Any, 
        rxDashCoreLib.RxNs.IDisposable
      ], 
      rxDashCoreLib.RxNs.IDisposable
    ], scheduleAbsolute: js.Function3[
      /* state */ js.Any, 
      /* dueTime */ scala.Double, 
      /* action */ js.Function2[
        /* scheduler */ rxDashLiteLib.RxNs.IScheduler, 
        /* state */ js.Any, 
        rxDashCoreLib.RxNs.IDisposable
      ], 
      rxDashCoreLib.RxNs.IDisposable
    ]) = this()
}

