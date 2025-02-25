package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountInfo extends js.Object {
  // These fields are returned, presumably, to save further calls when the use case requires
  // a usable address:
  var address: java.lang.String
  var addressIndex: scala.Double
  var addressPath: js.Array[scala.Double]
  var addressSerializedPath: java.lang.String
   // serialized HD public key. Despite the name, this may be `ypub` for segWit.
  var balance: scala.Double
  var confirmed: scala.Double
  var id: scala.Double
  var path: js.Array[scala.Double]
  var serializedPath: java.lang.String
  var transactions: scala.Double
  var unusedAddresses: js.Array[java.lang.String]
  var usedAddresses: js.Array[trezorDashConnectLib.Anon_Address]
  var utxo: js.Array[Utxo]
  var xpub: java.lang.String
}

object AccountInfo {
  @scala.inline
  def apply(
    address: java.lang.String,
    addressIndex: scala.Double,
    addressPath: js.Array[scala.Double],
    addressSerializedPath: java.lang.String,
    balance: scala.Double,
    confirmed: scala.Double,
    id: scala.Double,
    path: js.Array[scala.Double],
    serializedPath: java.lang.String,
    transactions: scala.Double,
    unusedAddresses: js.Array[java.lang.String],
    usedAddresses: js.Array[trezorDashConnectLib.Anon_Address],
    utxo: js.Array[Utxo],
    xpub: java.lang.String
  ): AccountInfo = {
    val __obj = js.Dynamic.literal(address = address, addressIndex = addressIndex, addressPath = addressPath, addressSerializedPath = addressSerializedPath, balance = balance, confirmed = confirmed, id = id, path = path, serializedPath = serializedPath, transactions = transactions, unusedAddresses = unusedAddresses, usedAddresses = usedAddresses, utxo = utxo, xpub = xpub)
  
    __obj.asInstanceOf[AccountInfo]
  }
}

