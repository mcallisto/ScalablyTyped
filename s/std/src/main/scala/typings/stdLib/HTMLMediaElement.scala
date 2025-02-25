package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Adds to HTMLElement the properties and methods needed to support basic media-related capabilities that are common to audio and video. */
@js.native
trait HTMLMediaElement extends HTMLElement {
  val HAVE_CURRENT_DATA: scala.Double = js.native
  val HAVE_ENOUGH_DATA: scala.Double = js.native
  val HAVE_FUTURE_DATA: scala.Double = js.native
  val HAVE_METADATA: scala.Double = js.native
  val HAVE_NOTHING: scala.Double = js.native
  val NETWORK_EMPTY: scala.Double = js.native
  val NETWORK_IDLE: scala.Double = js.native
  val NETWORK_LOADING: scala.Double = js.native
  val NETWORK_NO_SOURCE: scala.Double = js.native
  /**
    * Returns an AudioTrackList object with the audio tracks for a given video element.
    */
  val audioTracks: AudioTrackList = js.native
  /**
    * Gets or sets a value that indicates whether to start playing the media automatically.
    */
  var autoplay: scala.Boolean = js.native
  /**
    * Gets a collection of buffered time ranges.
    */
  val buffered: TimeRanges = js.native
  /**
    * Gets or sets a flag that indicates whether the client provides a set of controls for the media (in case the developer does not include controls for the player).
    */
  var controls: scala.Boolean = js.native
  var crossOrigin: java.lang.String | scala.Null = js.native
  /**
    * Gets the address or URL of the current media resource that is selected by IHTMLMediaElement.
    */
  val currentSrc: java.lang.String = js.native
  /**
    * Gets or sets the current playback position, in seconds.
    */
  var currentTime: scala.Double = js.native
  var defaultMuted: scala.Boolean = js.native
  /**
    * Gets or sets the default playback rate when the user is not using fast forward or reverse for a video or audio resource.
    */
  var defaultPlaybackRate: scala.Double = js.native
  /**
    * Returns the duration in seconds of the current media resource. A NaN value is returned if duration is not available, or Infinity if the media resource is streaming.
    */
  val duration: scala.Double = js.native
  /**
    * Gets information about whether the playback has ended or not.
    */
  val ended: scala.Boolean = js.native
  /**
    * Returns an object representing the current error state of the audio or video element.
    */
  val error: MediaError | scala.Null = js.native
  /**
    * Gets or sets a flag to specify whether playback should restart after it completes.
    */
  var loop: scala.Boolean = js.native
  val mediaKeys: MediaKeys | scala.Null = js.native
  /**
    * Specifies the purpose of the audio or video media, such as background audio or alerts.
    */
  var msAudioCategory: java.lang.String = js.native
  /**
    * Specifies the output device id that the audio will be sent to.
    */
  var msAudioDeviceType: java.lang.String = js.native
  val msGraphicsTrustStatus: MSGraphicsTrust = js.native
  /**
    * Gets the MSMediaKeys object, which is used for decrypting media data, that is associated with this media element.
    */
  /** @deprecated */
  val msKeys: MSMediaKeys = js.native
  /**
    * Gets or sets whether the DLNA PlayTo device is available.
    */
  var msPlayToDisabled: scala.Boolean = js.native
  /**
    * Gets or sets the path to the preferred media source. This enables the Play To target device to stream the media content, which can be DRM protected, from a different location, such as a cloud media server.
    */
  var msPlayToPreferredSourceUri: java.lang.String = js.native
  /**
    * Gets or sets the primary DLNA PlayTo device.
    */
  var msPlayToPrimary: scala.Boolean = js.native
  /**
    * Gets the source associated with the media element for use by the PlayToManager.
    */
  val msPlayToSource: js.Any = js.native
  /**
    * Specifies whether or not to enable low-latency playback on the media element.
    */
  var msRealTime: scala.Boolean = js.native
  /**
    * Gets or sets a flag that indicates whether the audio (either audio or the audio track on video media) is muted.
    */
  var muted: scala.Boolean = js.native
  /**
    * Gets the current network activity for the element.
    */
  val networkState: scala.Double = js.native
  var onencrypted: (js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _]) | scala.Null = js.native
  /** @deprecated */
  var onmsneedkey: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onwaitingforkey: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  /**
    * Gets a flag that specifies whether playback is paused.
    */
  val paused: scala.Boolean = js.native
  /**
    * Gets or sets the current rate of speed for the media resource to play. This speed is expressed as a multiple of the normal speed of the media resource.
    */
  var playbackRate: scala.Double = js.native
  /**
    * Gets TimeRanges for the current media resource that has been played.
    */
  val played: TimeRanges = js.native
  /**
    * Gets or sets the current playback position, in seconds.
    */
  var preload: java.lang.String = js.native
  val readyState: scala.Double = js.native
  /**
    * Returns a TimeRanges object that represents the ranges of the current media resource that can be seeked.
    */
  val seekable: TimeRanges = js.native
  /**
    * Gets a flag that indicates whether the client is currently moving to a new playback position in the media resource.
    */
  val seeking: scala.Boolean = js.native
  /**
    * The address or URL of the a media resource that is to be considered.
    */
  var src: java.lang.String = js.native
  var srcObject: MediaStream | MediaSource | Blob | scala.Null = js.native
  val textTracks: TextTrackList = js.native
  val videoTracks: VideoTrackList = js.native
  /**
    * Gets or sets the volume level for audio portions of the media element.
    */
  var volume: scala.Double = js.native
  @JSName("addEventListener")
  def addEventListener_encrypted(
    `type`: stdLib.stdLibStrings.encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_encrypted(
    `type`: stdLib.stdLibStrings.encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_encrypted(
    `type`: stdLib.stdLibStrings.encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_msneedkey(
    `type`: stdLib.stdLibStrings.msneedkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_msneedkey(
    `type`: stdLib.stdLibStrings.msneedkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_msneedkey(
    `type`: stdLib.stdLibStrings.msneedkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waitingforkey(
    `type`: stdLib.stdLibStrings.waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waitingforkey(
    `type`: stdLib.stdLibStrings.waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waitingforkey(
    `type`: stdLib.stdLibStrings.waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def addTextTrack(kind: TextTrackKind): TextTrack = js.native
  def addTextTrack(kind: TextTrackKind, label: java.lang.String): TextTrack = js.native
  def addTextTrack(kind: TextTrackKind, label: java.lang.String, language: java.lang.String): TextTrack = js.native
  /**
    * Returns a string that specifies whether the client can play a given media resource type.
    */
  def canPlayType(`type`: java.lang.String): CanPlayTypeResult = js.native
  /**
    * Resets the audio or video object and loads a new media resource.
    */
  def load(): scala.Unit = js.native
  /**
    * Clears all effects from the media pipeline.
    */
  def msClearEffects(): scala.Unit = js.native
  def msGetAsCastingSource(): js.Any = js.native
  /**
    * Inserts the specified audio effect into media pipeline.
    */
  def msInsertAudioEffect(activatableClassId: java.lang.String, effectRequired: scala.Boolean): scala.Unit = js.native
  def msInsertAudioEffect(activatableClassId: java.lang.String, effectRequired: scala.Boolean, config: js.Any): scala.Unit = js.native
  /** @deprecated */
  def msSetMediaKeys(mediaKeys: MSMediaKeys): scala.Unit = js.native
  /**
    * Specifies the media protection manager for a given media pipeline.
    */
  def msSetMediaProtectionManager(): scala.Unit = js.native
  def msSetMediaProtectionManager(mediaProtectionManager: js.Any): scala.Unit = js.native
  /**
    * Pauses the current playback and sets paused to TRUE. This can be used to test whether the media is playing or paused. You can also use the pause or play events to tell whether the media is playing or not.
    */
  def pause(): scala.Unit = js.native
  /**
    * Loads and starts playback of a media resource.
    */
  def play(): js.Promise[scala.Unit] = js.native
  @JSName("removeEventListener")
  def removeEventListener_encrypted(
    `type`: stdLib.stdLibStrings.encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_encrypted(
    `type`: stdLib.stdLibStrings.encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_encrypted(
    `type`: stdLib.stdLibStrings.encrypted,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MediaEncryptedEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_msneedkey(
    `type`: stdLib.stdLibStrings.msneedkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_msneedkey(
    `type`: stdLib.stdLibStrings.msneedkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_msneedkey(
    `type`: stdLib.stdLibStrings.msneedkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waitingforkey(
    `type`: stdLib.stdLibStrings.waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waitingforkey(
    `type`: stdLib.stdLibStrings.waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waitingforkey(
    `type`: stdLib.stdLibStrings.waitingforkey,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  def setMediaKeys(): js.Promise[scala.Unit] = js.native
  def setMediaKeys(mediaKeys: MediaKeys): js.Promise[scala.Unit] = js.native
}

@JSGlobal("HTMLMediaElement")
@js.native
class HTMLMediaElementCls () extends HTMLMediaElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLMediaElement")
@js.native
object HTMLMediaElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLMediaElement] {
  val HAVE_CURRENT_DATA: scala.Double = js.native
  val HAVE_ENOUGH_DATA: scala.Double = js.native
  val HAVE_FUTURE_DATA: scala.Double = js.native
  val HAVE_METADATA: scala.Double = js.native
  val HAVE_NOTHING: scala.Double = js.native
  val NETWORK_EMPTY: scala.Double = js.native
  val NETWORK_IDLE: scala.Double = js.native
  val NETWORK_LOADING: scala.Double = js.native
  val NETWORK_NO_SOURCE: scala.Double = js.native
}

