package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IonMenuController extends js.Object {
  def _getInstance(): js.Promise[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify MenuControllerI */ _
  ] = js.native
  /**
    * Close the menu. If a menu is specified, it will close that menu. If no menu is specified, then it will close any menu that is open. If it does not find any open menus, it will return `false`.
    */
  def close(): js.Promise[scala.Boolean] = js.native
  def close(menu: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Enable or disable a menu. Disabling a menu will not allow gestures for that menu or any calls to open it. This is useful when there are multiple menus on the same side and only one of them should be allowed to open. Enabling a menu will automatically disable all other menus on that side.
    */
  def enable(enable: scala.Boolean): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  def enable(enable: scala.Boolean, menu: java.lang.String): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  /**
    * Get a menu instance. If a menu is not provided then it will return the first menu found. If the specified menu is `start` or `end`, then it will return the enabled menu on that side. Otherwise, it will try to find the menu using the menu's `id` property. If a menu is not found then it will return `null`.
    */
  def get(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  def get(menu: java.lang.String): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  /**
    * Get all menu instances.
    */
  def getMenus(): js.Promise[js.Array[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  /**
    * Get the instance of the opened menu. Returns `null` if a menu is not found.
    */
  def getOpen(): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  /**
    * Get whether or not a menu is animating. Returns `true` if any menu is currently animating.
    */
  def isAnimating(): js.Promise[scala.Boolean] = js.native
  /**
    * Get whether or not the menu is enabled. Returns `true` if the specified menu is enabled. Returns `false` if a menu is disabled or not found.
    */
  def isEnabled(): js.Promise[scala.Boolean] = js.native
  def isEnabled(menu: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Get whether or not the menu is open. Returns `true` if the specified menu is open. If a menu is not specified, it will return `true` if any menu is currently open.
    */
  def isOpen(): js.Promise[scala.Boolean] = js.native
  def isOpen(menu: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Open the menu. If a menu is not provided then it will open the first menu found. If the specified menu is `start` or `end`, then it will open the enabled menu on that side. Otherwise, it will try to find the menu using the menu's `id` property. If a menu is not found then it will return `false`.
    */
  def open(): js.Promise[scala.Boolean] = js.native
  def open(menu: java.lang.String): js.Promise[scala.Boolean] = js.native
  /**
    * Registers a new animation that can be used with any `ion-menu` by passing the name of the animation in its `type` property.
    */
  def registerAnimation(
    name: java.lang.String,
    animation: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AnimationBuilder */ js.Any
  ): js.Promise[scala.Unit] = js.native
  /**
    * Enable or disable the ability to swipe open the menu.
    */
  def swipeGesture(enable: scala.Boolean): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  def swipeGesture(enable: scala.Boolean, menu: java.lang.String): js.Promise[js.UndefOr[atIonicCoreLib.distTypesComponentsMod.Global.HTMLIonMenuElement]] = js.native
  /**
    * Toggle the menu open or closed. If the menu is already open, it will try to close the menu, otherwise it will try to open it. Returns `false` if a menu is not found.
    */
  def toggle(): js.Promise[scala.Boolean] = js.native
  def toggle(menu: java.lang.String): js.Promise[scala.Boolean] = js.native
}

