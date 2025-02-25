package typings
package googleDashProtobufLib.googleDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "BinaryWriter")
@js.native
class BinaryWriter () extends js.Object {
  @JSName("writeMessage")
  var writeMessage_Original: BinaryWrite = js.native
  def beginSubMessage(field: scala.Double): scala.Unit = js.native
  def endSubMessage(field: scala.Double): scala.Unit = js.native
  def getResultBase64String(): java.lang.String = js.native
  def getResultBuffer(): stdLib.Uint8Array = js.native
  def maybeWriteSerializedMessage(): scala.Unit = js.native
  def maybeWriteSerializedMessage(bytes: stdLib.Uint8Array): scala.Unit = js.native
  def maybeWriteSerializedMessage(bytes: stdLib.Uint8Array, start: scala.Double): scala.Unit = js.native
  def maybeWriteSerializedMessage(bytes: stdLib.Uint8Array, start: scala.Double, end: scala.Double): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def writeAny(
    fieldType: googleDashProtobufLib.googleDashProtobufMod.BinaryConstantsNs.FieldType,
    field: scala.Double,
    value: AnyFieldType
  ): scala.Unit = js.native
  def writeBool(field: scala.Double): scala.Unit = js.native
  def writeBool(field: scala.Double, value: scala.Boolean): scala.Unit = js.native
  def writeBytes(field: scala.Double): scala.Unit = js.native
  def writeBytes(field: scala.Double, value: ByteSource): scala.Unit = js.native
  def writeDouble(field: scala.Double): scala.Unit = js.native
  def writeDouble(field: scala.Double, value: scala.Double): scala.Unit = js.native
  def writeEnum(field: scala.Double): scala.Unit = js.native
  def writeEnum(field: scala.Double, value: scala.Double): scala.Unit = js.native
  def writeFixed32(field: scala.Double): scala.Unit = js.native
  def writeFixed32(field: scala.Double, value: scala.Double): scala.Unit = js.native
  def writeFixed64(field: scala.Double): scala.Unit = js.native
  def writeFixed64(field: scala.Double, value: scala.Double): scala.Unit = js.native
  def writeFixed64String(field: scala.Double): scala.Unit = js.native
  def writeFixed64String(field: scala.Double, value: java.lang.String): scala.Unit = js.native
  def writeFixedHash64(field: scala.Double): scala.Unit = js.native
  def writeFixedHash64(field: scala.Double, value: java.lang.String): scala.Unit = js.native
  def writeFloat(field: scala.Double): scala.Unit = js.native
  def writeFloat(field: scala.Double, value: scala.Double): scala.Unit = js.native
  def writeGroup(field: scala.Double, value: js.Any, writeCallback: BinaryWriteCallback): scala.Unit = js.native
  def writeInt32(field: scala.Double): scala.Unit = js.native
  def writeInt32(field: scala.Double, value: scala.Double): scala.Unit = js.native
  def writeInt32String(field: scala.Double): scala.Unit = js.native
  def writeInt32String(field: scala.Double, value: java.lang.String): scala.Unit = js.native
  def writeInt64(field: scala.Double): scala.Unit = js.native
  def writeInt64(field: scala.Double, value: scala.Double): scala.Unit = js.native
  def writeInt64String(field: scala.Double): scala.Unit = js.native
  def writeInt64String(field: scala.Double, value: java.lang.String): scala.Unit = js.native
  def writeMessage(fieldNumber: scala.Double, value: js.Any, writerCallback: BinaryWriteCallback): scala.Unit = js.native
  def writePackedBool(field: scala.Double): scala.Unit = js.native
  def writePackedBool(field: scala.Double, value: js.Array[scala.Boolean]): scala.Unit = js.native
  def writePackedDouble(field: scala.Double): scala.Unit = js.native
  def writePackedDouble(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedEnum(field: scala.Double): scala.Unit = js.native
  def writePackedEnum(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedFixed32(field: scala.Double): scala.Unit = js.native
  def writePackedFixed32(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedFixed64(field: scala.Double): scala.Unit = js.native
  def writePackedFixed64(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedFixed64String(field: scala.Double): scala.Unit = js.native
  def writePackedFixed64String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writePackedFixedHash64(field: scala.Double): scala.Unit = js.native
  def writePackedFixedHash64(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writePackedFloat(field: scala.Double): scala.Unit = js.native
  def writePackedFloat(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedInt32(field: scala.Double): scala.Unit = js.native
  def writePackedInt32(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedInt32String(field: scala.Double): scala.Unit = js.native
  def writePackedInt32String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writePackedInt64(field: scala.Double): scala.Unit = js.native
  def writePackedInt64(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedInt64String(field: scala.Double): scala.Unit = js.native
  def writePackedInt64String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writePackedSfixed32(field: scala.Double): scala.Unit = js.native
  def writePackedSfixed32(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedSfixed64(field: scala.Double): scala.Unit = js.native
  def writePackedSfixed64(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedSfixed64String(field: scala.Double): scala.Unit = js.native
  def writePackedSfixed64String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writePackedSint32(field: scala.Double): scala.Unit = js.native
  def writePackedSint32(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedSint64(field: scala.Double): scala.Unit = js.native
  def writePackedSint64(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedSint64String(field: scala.Double): scala.Unit = js.native
  def writePackedSint64String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writePackedUint32(field: scala.Double): scala.Unit = js.native
  def writePackedUint32(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedUint32String(field: scala.Double): scala.Unit = js.native
  def writePackedUint32String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writePackedUint64(field: scala.Double): scala.Unit = js.native
  def writePackedUint64(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writePackedUint64String(field: scala.Double): scala.Unit = js.native
  def writePackedUint64String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writePackedVarintHash64(field: scala.Double): scala.Unit = js.native
  def writePackedVarintHash64(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writeRepeatedBool(field: scala.Double): scala.Unit = js.native
  def writeRepeatedBool(field: scala.Double, value: js.Array[scala.Boolean]): scala.Unit = js.native
  def writeRepeatedBytes(field: scala.Double): scala.Unit = js.native
  def writeRepeatedBytes(field: scala.Double, value: js.Array[ByteSource]): scala.Unit = js.native
  def writeRepeatedDouble(field: scala.Double): scala.Unit = js.native
  def writeRepeatedDouble(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeRepeatedEnum(field: scala.Double): scala.Unit = js.native
  def writeRepeatedEnum(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeRepeatedFixed32(field: scala.Double): scala.Unit = js.native
  def writeRepeatedFixed32(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeRepeatedFixed64(field: scala.Double): scala.Unit = js.native
  def writeRepeatedFixed64(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeRepeatedFixed64String(field: scala.Double): scala.Unit = js.native
  def writeRepeatedFixed64String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writeRepeatedFixedHash64(field: scala.Double): scala.Unit = js.native
  def writeRepeatedFixedHash64(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writeRepeatedFloat(field: scala.Double): scala.Unit = js.native
  def writeRepeatedFloat(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeRepeatedGroup(field: scala.Double, value: js.Array[Message], writerCallback: BinaryWriteCallback): scala.Unit = js.native
  def writeRepeatedInt32(field: scala.Double): scala.Unit = js.native
  def writeRepeatedInt32(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeRepeatedInt32String(field: scala.Double): scala.Unit = js.native
  def writeRepeatedInt32String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writeRepeatedInt64(field: scala.Double): scala.Unit = js.native
  def writeRepeatedInt64(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeRepeatedInt64String(field: scala.Double): scala.Unit = js.native
  def writeRepeatedInt64String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writeRepeatedMessage(field: scala.Double, value: js.Array[Message], writerCallback: BinaryWriteCallback): scala.Unit = js.native
  def writeRepeatedSfixed32(field: scala.Double): scala.Unit = js.native
  def writeRepeatedSfixed32(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeRepeatedSfixed64(field: scala.Double): scala.Unit = js.native
  def writeRepeatedSfixed64(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeRepeatedSfixed64String(field: scala.Double): scala.Unit = js.native
  def writeRepeatedSfixed64String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writeRepeatedSint32(field: scala.Double): scala.Unit = js.native
  def writeRepeatedSint32(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeRepeatedSint64(field: scala.Double): scala.Unit = js.native
  def writeRepeatedSint64(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeRepeatedSint64String(field: scala.Double): scala.Unit = js.native
  def writeRepeatedSint64String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writeRepeatedString(field: scala.Double): scala.Unit = js.native
  def writeRepeatedString(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writeRepeatedUint32(field: scala.Double): scala.Unit = js.native
  def writeRepeatedUint32(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeRepeatedUint32String(field: scala.Double): scala.Unit = js.native
  def writeRepeatedUint32String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writeRepeatedUint64(field: scala.Double): scala.Unit = js.native
  def writeRepeatedUint64(field: scala.Double, value: js.Array[scala.Double]): scala.Unit = js.native
  def writeRepeatedUint64String(field: scala.Double): scala.Unit = js.native
  def writeRepeatedUint64String(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writeRepeatedVarintHash64(field: scala.Double): scala.Unit = js.native
  def writeRepeatedVarintHash64(field: scala.Double, value: js.Array[java.lang.String]): scala.Unit = js.native
  def writeSerializedMessage(bytes: stdLib.Uint8Array, start: scala.Double, end: scala.Double): scala.Unit = js.native
  def writeSfixed32(field: scala.Double): scala.Unit = js.native
  def writeSfixed32(field: scala.Double, value: scala.Double): scala.Unit = js.native
  def writeSfixed64(field: scala.Double): scala.Unit = js.native
  def writeSfixed64(field: scala.Double, value: scala.Double): scala.Unit = js.native
  def writeSfixed64String(field: scala.Double): scala.Unit = js.native
  def writeSfixed64String(field: scala.Double, value: java.lang.String): scala.Unit = js.native
  def writeSint32(field: scala.Double): scala.Unit = js.native
  def writeSint32(field: scala.Double, value: scala.Double): scala.Unit = js.native
  def writeSint64(field: scala.Double): scala.Unit = js.native
  def writeSint64(field: scala.Double, value: scala.Double): scala.Unit = js.native
  def writeSint64String(field: scala.Double): scala.Unit = js.native
  def writeSint64String(field: scala.Double, value: java.lang.String): scala.Unit = js.native
  def writeString(field: scala.Double): scala.Unit = js.native
  def writeString(field: scala.Double, value: java.lang.String): scala.Unit = js.native
  def writeUint32(field: scala.Double): scala.Unit = js.native
  def writeUint32(field: scala.Double, value: scala.Double): scala.Unit = js.native
  def writeUint32String(field: scala.Double): scala.Unit = js.native
  def writeUint32String(field: scala.Double, value: java.lang.String): scala.Unit = js.native
  def writeUint64(field: scala.Double): scala.Unit = js.native
  def writeUint64(field: scala.Double, value: scala.Double): scala.Unit = js.native
  def writeUint64String(field: scala.Double): scala.Unit = js.native
  def writeUint64String(field: scala.Double, value: java.lang.String): scala.Unit = js.native
  def writeVarintHash64(field: scala.Double): scala.Unit = js.native
  def writeVarintHash64(field: scala.Double, value: java.lang.String): scala.Unit = js.native
}

