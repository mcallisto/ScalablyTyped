package typings
package stellarDashBaseLib.stellarDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr")
@js.native
object xdrNs extends js.Object {
  @js.native
  class Asset () extends XDRStruct
  
  @js.native
  class DecoratedSignature protected () extends XDRStruct {
    def this(keys: stellarDashBaseLib.Anon_Hint) = this()
    def hint(): SignatureHint = js.native
    def signature(): nodeLib.Buffer = js.native
  }
  
  @js.native
  class Memo () extends XDRStruct
  
  // tslint:disable-line:strict-export-declare-modifiers
  @js.native
  class Operation[T /* <: stellarDashBaseLib.stellarDashBaseMod.Operation */] () extends XDRStruct
  
  @js.native
  class TransactionEnvelope () extends XDRStruct
  
  @js.native
  class TransactionResult () extends XDRStruct
  
  @js.native
  class XDRStruct () extends js.Object {
    def toXDR(): nodeLib.Buffer = js.native
    def toXDR(encoding: java.lang.String): java.lang.String = js.native
    @JSName("toXDR")
    def toXDR_Buffer(base: java.lang.String): nodeLib.Buffer = js.native
  }
  
  /* static members */
  @js.native
  object Asset extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Asset = js.native
  }
  
  /* static members */
  @js.native
  object DecoratedSignature extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.DecoratedSignature = js.native
  }
  
  /* static members */
  @js.native
  object Memo extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Memo = js.native
  }
  
  /* static members */
  @js.native
  object Operation extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.Operation[stellarDashBaseLib.stellarDashBaseMod.Operation] = js.native
  }
  
  /* static members */
  @js.native
  object TransactionEnvelope extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.TransactionEnvelope = js.native
  }
  
  /* static members */
  @js.native
  object TransactionResult extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.TransactionResult = js.native
  }
  
  /* static members */
  @js.native
  object XDRStruct extends js.Object {
    def fromXDR(xdr: nodeLib.Buffer): stellarDashBaseLib.stellarDashBaseMod.xdrNs.XDRStruct = js.native
  }
  
  type Signature = nodeLib.Buffer
  type SignatureHint = nodeLib.Buffer
}

