package typings
package winrtDashUwpLib.WindowsNs.StorageNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndexedState extends js.Object

/** Indicates whether a StorageFolder is included in the system index. */
@JSGlobal("Windows.Storage.Search.IndexedState")
@js.native
object IndexedState extends js.Object {
  /** The folder contains indexed content. */
  @js.native
  sealed trait fullyIndexed
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.IndexedState
  
  /** The folder is not indexed. */
  @js.native
  sealed trait notIndexed
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.IndexedState
  
  /** Some folders in the library are indexed, but not all of them. This value is relevant only for libraries. */
  @js.native
  sealed trait partiallyIndexed
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.IndexedState
  
  /** The indexed state is not known. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.IndexedState
  
  /* 3 */ val fullyIndexed: fullyIndexed with scala.Double = js.native
  /* 1 */ val notIndexed: notIndexed with scala.Double = js.native
  /* 2 */ val partiallyIndexed: partiallyIndexed with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.SearchNs.IndexedState with scala.Double] = js.native
}

