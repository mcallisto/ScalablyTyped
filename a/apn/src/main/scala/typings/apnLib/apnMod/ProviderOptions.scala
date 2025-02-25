package typings
package apnLib.apnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderOptions extends js.Object {
  /**
    * An array of trusted certificates. Each element should contain either a filename to load, or a Buffer/String (in PEM format) to be used directly. If this is omitted several well known "root" CAs will be used. - You may need to use this as some environments don't include the CA used by Apple (entrust_2048).
    */
  var ca: js.UndefOr[js.Array[java.lang.String | nodeLib.Buffer]] = js.undefined
  /**
    * The filename of the connection certificate to load from disk, or a Buffer/String containing the certificate data. (Defaults to: `cert.pem`)
    */
  var cert: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /**
    * The maximum number of connection failures that will be tolerated before `apn` will "terminate". (Defaults to: 3)
    */
  var connectionRetryLimit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The filename of the connection key to load from disk, or a Buffer/String containing the key data. (Defaults to: `key.pem`)
    */
  var key: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /**
    * The passphrase for the connection key, if required
    */
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  /**
    * File path for private key, certificate and CA certs in PFX or PKCS12 format, or a Buffer containing the PFX data. If supplied will always be used instead of certificate and key above.
    */
  var pfx: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  /**
    * Specifies which environment to connect to: Production (if true) or Sandbox - The hostname will be set automatically. (Defaults to NODE_ENV == "production", i.e. false unless the NODE_ENV environment variable is set accordingly)
    */
  var production: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Reject Unauthorized property to be passed through to tls.connect() (Defaults to `true`)
    */
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Configuration for Provider Authentication Tokens. (Defaults to: null i.e. fallback to Certificates)
    */
  var token: js.UndefOr[ProviderToken] = js.undefined
}

object ProviderOptions {
  @scala.inline
  def apply(
    ca: js.Array[java.lang.String | nodeLib.Buffer] = null,
    cert: java.lang.String | nodeLib.Buffer = null,
    connectionRetryLimit: scala.Int | scala.Double = null,
    key: java.lang.String | nodeLib.Buffer = null,
    passphrase: java.lang.String = null,
    pfx: java.lang.String | nodeLib.Buffer = null,
    production: js.UndefOr[scala.Boolean] = js.undefined,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    token: ProviderToken = null
  ): ProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (connectionRetryLimit != null) __obj.updateDynamic("connectionRetryLimit")(connectionRetryLimit.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(production)) __obj.updateDynamic("production")(production)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[ProviderOptions]
  }
}

