package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "ClientNameStats")
@js.native
/**
  * Constructs a new ClientNameStats.
  * @param [properties] Properties to set
  */
class ClientNameStats () extends IClientNameStats {
  def this(properties: IClientNameStats) = this()
  /** ClientNameStats cacheHitsPerVersion. */
  @JSName("cacheHitsPerVersion")
  var cacheHitsPerVersion_ClientNameStats: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  /** ClientNameStats cacheLatencyCount. */
  @JSName("cacheLatencyCount")
  var cacheLatencyCount_ClientNameStats: js.Array[scala.Double] = js.native
  /** ClientNameStats forbiddenOperationCountPerVersion. */
  @JSName("forbiddenOperationCountPerVersion")
  var forbiddenOperationCountPerVersion_ClientNameStats: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  /** ClientNameStats latencyCount. */
  @JSName("latencyCount")
  var latencyCount_ClientNameStats: js.Array[scala.Double] = js.native
  /** ClientNameStats persistedQueryHitsPerVersion. */
  @JSName("persistedQueryHitsPerVersion")
  var persistedQueryHitsPerVersion_ClientNameStats: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  /** ClientNameStats persistedQueryMissesPerVersion. */
  @JSName("persistedQueryMissesPerVersion")
  var persistedQueryMissesPerVersion_ClientNameStats: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  /** ClientNameStats privateCacheTtlCount. */
  @JSName("privateCacheTtlCount")
  var privateCacheTtlCount_ClientNameStats: js.Array[scala.Double] = js.native
  /** ClientNameStats publicCacheTtlCount. */
  @JSName("publicCacheTtlCount")
  var publicCacheTtlCount_ClientNameStats: js.Array[scala.Double] = js.native
  /** ClientNameStats registeredOperationCountPerVersion. */
  @JSName("registeredOperationCountPerVersion")
  var registeredOperationCountPerVersion_ClientNameStats: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  /** ClientNameStats requestsCountPerVersion. */
  @JSName("requestsCountPerVersion")
  var requestsCountPerVersion_ClientNameStats: org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  /** ClientNameStats requestsWithErrorsCount. */
  @JSName("requestsWithErrorsCount")
  var requestsWithErrorsCount_ClientNameStats: scala.Double = js.native
  /**
    * Converts this ClientNameStats to JSON.
    * @returns JSON object
    */
  def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "ClientNameStats")
@js.native
object ClientNameStats extends js.Object {
  /**
    * Creates a new ClientNameStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientNameStats instance
    */
  def create(): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ClientNameStats = js.native
  def create(properties: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IClientNameStats): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ClientNameStats = js.native
  /**
    * Decodes a ClientNameStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientNameStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ClientNameStats = js.native
  def decode(reader: protobufjsLib.protobufjsMod.Reader, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ClientNameStats = js.native
  def decode(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ClientNameStats = js.native
  def decode(reader: stdLib.Uint8Array, length: scala.Double): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ClientNameStats = js.native
  /**
    * Decodes a ClientNameStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientNameStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: protobufjsLib.protobufjsMod.Reader): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ClientNameStats = js.native
  def decodeDelimited(reader: stdLib.Uint8Array): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ClientNameStats = js.native
  /**
    * Encodes the specified ClientNameStats message. Does not implicitly {@link ClientNameStats.verify|verify} messages.
    * @param message ClientNameStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IClientNameStats): protobufjsLib.protobufjsMod.Writer = js.native
  def encode(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IClientNameStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Encodes the specified ClientNameStats message, length delimited. Does not implicitly {@link ClientNameStats.verify|verify} messages.
    * @param message ClientNameStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IClientNameStats): protobufjsLib.protobufjsMod.Writer = js.native
  def encodeDelimited(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.IClientNameStats,
    writer: protobufjsLib.protobufjsMod.Writer
  ): protobufjsLib.protobufjsMod.Writer = js.native
  /**
    * Creates a ClientNameStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientNameStats
    */
  def fromObject(`object`: org.scalablytyped.runtime.StringDictionary[js.Any]): apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ClientNameStats = js.native
  /**
    * Creates a plain object from a ClientNameStats message. Also converts values to other types if specified.
    * @param message ClientNameStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ClientNameStats): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def toObject(
    message: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.ClientNameStats,
    options: protobufjsLib.protobufjsMod.IConversionOptions
  ): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientNameStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String | scala.Null = js.native
}

