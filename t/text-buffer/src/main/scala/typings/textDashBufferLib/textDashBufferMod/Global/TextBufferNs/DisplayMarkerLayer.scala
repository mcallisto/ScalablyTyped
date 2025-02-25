package typings
package textDashBufferLib.textDashBufferMod.Global.TextBufferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Experimental: A container for a related set of markers at the DisplayLayer level.
  *  Wraps an underlying MarkerLayer on the TextBuffer.
  *
  *  This API is experimental and subject to change on any release.
  */
@js.native
trait DisplayMarkerLayer extends js.Object {
  /** Destroy all markers in this layer. */
  def clear(): scala.Unit = js.native
  // Lifecycle
  /** Destroy this layer. */
  def destroy(): scala.Unit = js.native
  /**
    *  Find markers in the layer conforming to the given parameters.
    *
    *  This method finds markers based on the given properties. Markers can be associated
    *  with custom properties that will be compared with basic equality. In addition,
    *  there are several special properties that will be compared with the range of the
    *  markers rather than their properties.
    */
  def findMarkers(properties: textDashBufferLib.textDashBufferMod.Global.TextBufferNs.OptionsNs.FindDisplayMarker): js.Array[DisplayMarker] = js.native
  // Querying
  /** Get an existing marker by its id. */
  def getMarker(id: scala.Double): DisplayMarker = js.native
  /** Get the number of markers in the marker layer. */
  def getMarkerCount(): scala.Double = js.native
  /** Get all markers in the layer. */
  def getMarkers(): js.Array[DisplayMarker] = js.native
  /** Determine whether this layer has been destroyed. */
  def isDestroyed(): scala.Boolean = js.native
  /**
    *  Create a marker on this layer with its head at the given buffer position
    *  and no tail.
    */
  def markBufferPosition(bufferPosition: PointCompatible): DisplayMarker = js.native
  def markBufferPosition(bufferPosition: PointCompatible, options: textDashBufferLib.Anon_ExclusiveInsideInvalidate): DisplayMarker = js.native
  /** Create a marker with the given buffer range. */
  def markBufferRange(range: RangeCompatible): DisplayMarker = js.native
  def markBufferRange(range: RangeCompatible, options: textDashBufferLib.Anon_ExclusiveInside): DisplayMarker = js.native
  /**
    *  Create a marker on this layer with its head at the given screen position
    *  and no tail.
    */
  def markScreenPosition(screenPosition: PointCompatible): DisplayMarker = js.native
  def markScreenPosition(
    screenPosition: PointCompatible,
    options: textDashBufferLib.Anon_BackwardClipDirectionClosestExclusive
  ): DisplayMarker = js.native
  // Marker creation
  /** Create a marker with the given screen range. */
  def markScreenRange(range: RangeCompatible): DisplayMarker = js.native
  def markScreenRange(range: RangeCompatible, options: textDashBufferLib.Anon_BackwardClipDirectionClosest): DisplayMarker = js.native
  /**
    *  Subscribe to be notified synchronously whenever markers are created on this
    *  layer. Avoid this method for optimal performance when interacting with layers
    *  that could contain large numbers of markers.
    */
  def onDidCreateMarker(callback: js.Function1[/* marker */ DisplayMarker | Marker, scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  // Event Subscription
  /** Subscribe to be notified synchronously when this layer is destroyed. */
  def onDidDestroy(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
  /**
    *  Subscribe to be notified asynchronously whenever markers are created, updated,
    *  or destroyed on this layer. Prefer this method for optimal performance when
    *  interacting with layers that could contain large numbers of markers.
    */
  def onDidUpdate(callback: js.Function0[scala.Unit]): eventDashKitLib.eventDashKitMod.Disposable = js.native
}

