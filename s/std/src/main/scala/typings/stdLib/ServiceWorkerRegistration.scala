package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface of the ServiceWorker API represents the service worker registration. You register a service worker to control one or more pages that share the same origin. */
@js.native
trait ServiceWorkerRegistration extends EventTarget {
  val active: ServiceWorker | scala.Null = js.native
  val installing: ServiceWorker | scala.Null = js.native
  val navigationPreload: NavigationPreloadManager = js.native
  var onupdatefound: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val pushManager: PushManager = js.native
  val scope: java.lang.String = js.native
  val sync: SyncManager = js.native
  val updateViaCache: ServiceWorkerUpdateViaCache = js.native
  val waiting: ServiceWorker | scala.Null = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: stdLib.stdLibStrings.updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: stdLib.stdLibStrings.updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_updatefound(
    `type`: stdLib.stdLibStrings.updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def getNotifications(): js.Promise[js.Array[Notification]] = js.native
  def getNotifications(filter: GetNotificationOptions): js.Promise[js.Array[Notification]] = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: stdLib.stdLibStrings.updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: stdLib.stdLibStrings.updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_updatefound(
    `type`: stdLib.stdLibStrings.updatefound,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def showNotification(title: java.lang.String): js.Promise[scala.Unit] = js.native
  def showNotification(title: java.lang.String, options: NotificationOptions): js.Promise[scala.Unit] = js.native
  def unregister(): js.Promise[scala.Boolean] = js.native
  def update(): js.Promise[scala.Unit] = js.native
}

@JSGlobal("ServiceWorkerRegistration")
@js.native
class ServiceWorkerRegistrationCls () extends ServiceWorkerRegistration

@JSGlobal("ServiceWorkerRegistration")
@js.native
object ServiceWorkerRegistration
  extends org.scalablytyped.runtime.Instantiable0[ServiceWorkerRegistration]

