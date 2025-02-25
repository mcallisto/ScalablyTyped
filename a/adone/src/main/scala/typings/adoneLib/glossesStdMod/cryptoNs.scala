package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "crypto")
@js.native
object cryptoNs extends js.Object {
  @js.native
  class CertificateCls ()
    extends nodeLib.cryptoMod.CertificateCls
  
  @js.native
  class Cipher protected ()
    extends nodeLib.cryptoMod.Cipher
  
  @js.native
  class Decipher protected ()
    extends nodeLib.cryptoMod.Decipher
  
  @js.native
  class DiffieHellman protected ()
    extends nodeLib.cryptoMod.DiffieHellman
  
  @js.native
  class ECDH protected ()
    extends nodeLib.cryptoMod.ECDH
  
  @js.native
  class Hash protected ()
    extends nodeLib.cryptoMod.Hash
  
  @js.native
  class Hmac protected ()
    extends nodeLib.cryptoMod.Hmac
  
  @js.native
  class KeyObject protected ()
    extends nodeLib.cryptoMod.KeyObject
  
  @js.native
  class Signer protected ()
    extends nodeLib.cryptoMod.Signer
  
  @js.native
  class Verify protected ()
    extends nodeLib.cryptoMod.Verify
  
  /** @deprecated since v10.0.0 */
  val DEFAULT_ENCODING: java.lang.String = js.native
  /** @deprecated since v10.0.0 */
  val fips: scala.Boolean = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: java.lang.String, password: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Cipher = js.native
  def createCipher(
    algorithm: java.lang.String,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: nodeLib.cryptoMod.CipherGCMTypes, password: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipher(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.cryptoMod.CipherKey): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.cryptoMod.CipherKey, iv: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.cryptoMod.CipherKey,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.cryptoMod.CipherKey,
    iv: scala.Null,
    options: nodeLib.streamMod.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.cryptoMod.CipherKey,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.cryptoMod.CipherKey,
    iv: scala.Null,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.cryptoMod.CipherKey): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.cryptoMod.CipherKey,
    iv: nodeLib.cryptoMod.BinaryLike
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.cryptoMod.CipherKey,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.cryptoMod.CipherKey,
    iv: scala.Null,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: java.lang.String, password: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Decipher = js.native
  def createDecipher(
    algorithm: java.lang.String,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: nodeLib.cryptoMod.CipherGCMTypes, password: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipher(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.cryptoMod.BinaryLike, iv: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: scala.Null,
    options: nodeLib.streamMod.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: scala.Null,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: nodeLib.cryptoMod.BinaryLike
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: scala.Null,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDiffieHellman(prime_length: scala.Double): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: nodeLib.cryptoMod.Binary): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: scala.Double): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    generator: java.lang.String,
    generator_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
  ): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    generator: nodeLib.cryptoMod.Binary
  ): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    generator: scala.Double
  ): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: nodeLib.cryptoMod.Binary): nodeLib.cryptoMod.DiffieHellman = js.native
  def createECDH(curve_name: java.lang.String): nodeLib.cryptoMod.ECDH = js.native
  def createHash(algorithm: java.lang.String): nodeLib.cryptoMod.Hash = js.native
  def createHash(algorithm: java.lang.String, options: nodeLib.streamMod.TransformOptions): nodeLib.cryptoMod.Hash = js.native
  def createHmac(algorithm: java.lang.String, key: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Hmac = js.native
  def createHmac(
    algorithm: java.lang.String,
    key: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.TransformOptions
  ): nodeLib.cryptoMod.Hmac = js.native
  def createPrivateKey(key: java.lang.String): nodeLib.cryptoMod.KeyObject = js.native
  def createPrivateKey(key: nodeLib.Buffer): nodeLib.cryptoMod.KeyObject = js.native
  def createPrivateKey(key: nodeLib.cryptoMod.PrivateKeyInput): nodeLib.cryptoMod.KeyObject = js.native
  def createPublicKey(key: java.lang.String): nodeLib.cryptoMod.KeyObject = js.native
  def createPublicKey(key: nodeLib.Buffer): nodeLib.cryptoMod.KeyObject = js.native
  def createPublicKey(key: nodeLib.cryptoMod.KeyObject): nodeLib.cryptoMod.KeyObject = js.native
  def createPublicKey(key: nodeLib.cryptoMod.PublicKeyInput): nodeLib.cryptoMod.KeyObject = js.native
  def createSecretKey(key: nodeLib.Buffer): nodeLib.cryptoMod.KeyObject = js.native
  def createSign(algorithm: java.lang.String): nodeLib.cryptoMod.Signer = js.native
  def createSign(algorithm: java.lang.String, options: nodeLib.streamMod.WritableOptions): nodeLib.cryptoMod.Signer = js.native
  def createVerify(algorith: java.lang.String): nodeLib.cryptoMod.Verify = js.native
  def createVerify(algorith: java.lang.String, options: nodeLib.streamMod.WritableOptions): nodeLib.cryptoMod.Verify = js.native
  def generateKeyPair(
    `type`: adoneLib.adoneLibStrings.dsa,
    options: nodeLib.cryptoMod.DSAKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ],
    callback: js.Function3[
      nodeLib.Error | scala.Null, 
      (/* publicKey */ nodeLib.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ nodeLib.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def generateKeyPair(
    `type`: adoneLib.adoneLibStrings.ec,
    options: nodeLib.cryptoMod.ECKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ],
    callback: js.Function3[
      nodeLib.Error | scala.Null, 
      (/* publicKey */ nodeLib.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ nodeLib.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def generateKeyPair(
    `type`: adoneLib.adoneLibStrings.rsa,
    options: nodeLib.cryptoMod.RSAKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ],
    callback: js.Function3[
      nodeLib.Error | scala.Null, 
      (/* publicKey */ nodeLib.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ nodeLib.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def generateKeyPairSync(
    `type`: adoneLib.adoneLibStrings.dsa,
    options: nodeLib.cryptoMod.DSAKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ]
  ): nodeLib.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  def generateKeyPairSync(
    `type`: adoneLib.adoneLibStrings.ec,
    options: nodeLib.cryptoMod.ECKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ]
  ): nodeLib.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  def generateKeyPairSync(
    `type`: adoneLib.adoneLibStrings.rsa,
    options: nodeLib.cryptoMod.RSAKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ]
  ): nodeLib.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_dsa(`type`: adoneLib.adoneLibStrings.dsa, options: nodeLib.cryptoMod.DSAKeyPairKeyObjectOptions): nodeLib.cryptoMod.KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_ec(`type`: adoneLib.adoneLibStrings.ec, options: nodeLib.cryptoMod.ECKeyPairKeyObjectOptions): nodeLib.cryptoMod.KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_rsa(`type`: adoneLib.adoneLibStrings.rsa, options: nodeLib.cryptoMod.RSAKeyPairKeyObjectOptions): nodeLib.cryptoMod.KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_dsa(
    `type`: adoneLib.adoneLibStrings.dsa,
    options: nodeLib.cryptoMod.DSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* publicKey */ nodeLib.cryptoMod.KeyObject, 
      /* privateKey */ nodeLib.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_ec(
    `type`: adoneLib.adoneLibStrings.ec,
    options: nodeLib.cryptoMod.ECKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* publicKey */ nodeLib.cryptoMod.KeyObject, 
      /* privateKey */ nodeLib.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_rsa(
    `type`: adoneLib.adoneLibStrings.rsa,
    options: nodeLib.cryptoMod.RSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* publicKey */ nodeLib.cryptoMod.KeyObject, 
      /* privateKey */ nodeLib.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getCiphers(): js.Array[java.lang.String] = js.native
  def getCurves(): js.Array[java.lang.String] = js.native
  def getDiffieHellman(group_name: java.lang.String): nodeLib.cryptoMod.DiffieHellman = js.native
  def getHashes(): js.Array[java.lang.String] = js.native
  def pbkdf2(
    password: nodeLib.cryptoMod.BinaryLike,
    salt: nodeLib.cryptoMod.BinaryLike,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2Sync(
    password: nodeLib.cryptoMod.BinaryLike,
    salt: nodeLib.cryptoMod.BinaryLike,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: nodeLib.cryptoMod.KeyLike, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: nodeLib.cryptoMod.RsaPrivateKey, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: nodeLib.cryptoMod.KeyLike, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: nodeLib.cryptoMod.RsaPrivateKey, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def pseudoRandomBytes(size: scala.Double): nodeLib.Buffer = js.native
  def pseudoRandomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def publicDecrypt(public_key: nodeLib.cryptoMod.KeyLike, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def publicDecrypt(public_key: nodeLib.cryptoMod.RsaPublicKey, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: nodeLib.cryptoMod.KeyLike, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: nodeLib.cryptoMod.RsaPublicKey, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def randomBytes(size: scala.Double): nodeLib.Buffer = js.native
  def randomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: nodeLib.Buffer,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: nodeLib.Buffer,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.DataView,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.DataView, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.DataView,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.DataView, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.DataView,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.DataView, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float32Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float64Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float64Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float64Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float64Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float64Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float64Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int16Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int16Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int16Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int32Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int8Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int8Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int8Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint16Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint16Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint16Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint32Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8ClampedArray,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8ClampedArray, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8ClampedArray,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8ClampedArray, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8ClampedArray,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8ClampedArray, scala.Unit]
  ): scala.Unit = js.native
  def randomFillSync(buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def randomFillSync(buffer: nodeLib.Buffer, offset: scala.Double): nodeLib.Buffer = js.native
  def randomFillSync(buffer: nodeLib.Buffer, offset: scala.Double, size: scala.Double): nodeLib.Buffer = js.native
  def randomFillSync(buffer: stdLib.DataView): stdLib.DataView = js.native
  def randomFillSync(buffer: stdLib.DataView, offset: scala.Double): stdLib.DataView = js.native
  def randomFillSync(buffer: stdLib.DataView, offset: scala.Double, size: scala.Double): stdLib.DataView = js.native
  def randomFillSync(buffer: stdLib.Float32Array): stdLib.Float32Array = js.native
  def randomFillSync(buffer: stdLib.Float32Array, offset: scala.Double): stdLib.Float32Array = js.native
  def randomFillSync(buffer: stdLib.Float32Array, offset: scala.Double, size: scala.Double): stdLib.Float32Array = js.native
  def randomFillSync(buffer: stdLib.Float64Array): stdLib.Float64Array = js.native
  def randomFillSync(buffer: stdLib.Float64Array, offset: scala.Double): stdLib.Float64Array = js.native
  def randomFillSync(buffer: stdLib.Float64Array, offset: scala.Double, size: scala.Double): stdLib.Float64Array = js.native
  def randomFillSync(buffer: stdLib.Int16Array): stdLib.Int16Array = js.native
  def randomFillSync(buffer: stdLib.Int16Array, offset: scala.Double): stdLib.Int16Array = js.native
  def randomFillSync(buffer: stdLib.Int16Array, offset: scala.Double, size: scala.Double): stdLib.Int16Array = js.native
  def randomFillSync(buffer: stdLib.Int32Array): stdLib.Int32Array = js.native
  def randomFillSync(buffer: stdLib.Int32Array, offset: scala.Double): stdLib.Int32Array = js.native
  def randomFillSync(buffer: stdLib.Int32Array, offset: scala.Double, size: scala.Double): stdLib.Int32Array = js.native
  def randomFillSync(buffer: stdLib.Int8Array): stdLib.Int8Array = js.native
  def randomFillSync(buffer: stdLib.Int8Array, offset: scala.Double): stdLib.Int8Array = js.native
  def randomFillSync(buffer: stdLib.Int8Array, offset: scala.Double, size: scala.Double): stdLib.Int8Array = js.native
  def randomFillSync(buffer: stdLib.Uint16Array): stdLib.Uint16Array = js.native
  def randomFillSync(buffer: stdLib.Uint16Array, offset: scala.Double): stdLib.Uint16Array = js.native
  def randomFillSync(buffer: stdLib.Uint16Array, offset: scala.Double, size: scala.Double): stdLib.Uint16Array = js.native
  def randomFillSync(buffer: stdLib.Uint32Array): stdLib.Uint32Array = js.native
  def randomFillSync(buffer: stdLib.Uint32Array, offset: scala.Double): stdLib.Uint32Array = js.native
  def randomFillSync(buffer: stdLib.Uint32Array, offset: scala.Double, size: scala.Double): stdLib.Uint32Array = js.native
  def randomFillSync(buffer: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def randomFillSync(buffer: stdLib.Uint8Array, offset: scala.Double): stdLib.Uint8Array = js.native
  def randomFillSync(buffer: stdLib.Uint8Array, offset: scala.Double, size: scala.Double): stdLib.Uint8Array = js.native
  def randomFillSync(buffer: stdLib.Uint8ClampedArray): stdLib.Uint8ClampedArray = js.native
  def randomFillSync(buffer: stdLib.Uint8ClampedArray, offset: scala.Double): stdLib.Uint8ClampedArray = js.native
  def randomFillSync(buffer: stdLib.Uint8ClampedArray, offset: scala.Double, size: scala.Double): stdLib.Uint8ClampedArray = js.native
  def scrypt(
    password: nodeLib.cryptoMod.BinaryLike,
    salt: nodeLib.cryptoMod.BinaryLike,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.cryptoMod.BinaryLike,
    salt: nodeLib.cryptoMod.BinaryLike,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scryptSync(password: nodeLib.cryptoMod.BinaryLike, salt: nodeLib.cryptoMod.BinaryLike, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.cryptoMod.BinaryLike,
    salt: nodeLib.cryptoMod.BinaryLike,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def sign(
    algorithm: js.UndefOr[scala.Nothing],
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.KeyLike
  ): nodeLib.Buffer = js.native
  def sign(
    algorithm: js.UndefOr[scala.Nothing],
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.SignPrivateKeyInput
  ): nodeLib.Buffer = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPrivateKey()`][].
    */
  def sign(algorithm: java.lang.String, data: nodeLib.cryptoMod.Binary, key: nodeLib.cryptoMod.KeyLike): nodeLib.Buffer = js.native
  def sign(
    algorithm: java.lang.String,
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.SignPrivateKeyInput
  ): nodeLib.Buffer = js.native
  def sign(algorithm: scala.Null, data: nodeLib.cryptoMod.Binary, key: nodeLib.cryptoMod.KeyLike): nodeLib.Buffer = js.native
  def sign(algorithm: scala.Null, data: nodeLib.cryptoMod.Binary, key: nodeLib.cryptoMod.SignPrivateKeyInput): nodeLib.Buffer = js.native
  def timingSafeEqual(a: nodeLib.cryptoMod.Binary, b: nodeLib.cryptoMod.Binary): scala.Boolean = js.native
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.KeyLike,
    signature: nodeLib.cryptoMod.Binary
  ): nodeLib.Buffer = js.native
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.VerifyKeyWithOptions,
    signature: nodeLib.cryptoMod.Binary
  ): nodeLib.Buffer = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPublicKey()`][].
    */
  def verify(
    algorithm: java.lang.String,
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.KeyLike,
    signature: nodeLib.cryptoMod.Binary
  ): nodeLib.Buffer = js.native
  def verify(
    algorithm: java.lang.String,
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.VerifyKeyWithOptions,
    signature: nodeLib.cryptoMod.Binary
  ): nodeLib.Buffer = js.native
  def verify(
    algorithm: scala.Null,
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.KeyLike,
    signature: nodeLib.cryptoMod.Binary
  ): nodeLib.Buffer = js.native
  def verify(
    algorithm: scala.Null,
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.VerifyKeyWithOptions,
    signature: nodeLib.cryptoMod.Binary
  ): nodeLib.Buffer = js.native
  @js.native
  object Certificate
    extends org.scalablytyped.runtime.Instantiable0[nodeLib.cryptoMod.Certificate] {
    def apply(): nodeLib.cryptoMod.Certificate = js.native
  }
  
  /* static members */
  @js.native
  object ECDH extends js.Object {
    def convertKey(key: nodeLib.cryptoMod.BinaryLike, curve: java.lang.String): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: nodeLib.cryptoMod.BinaryLike,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
    ): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: nodeLib.cryptoMod.BinaryLike,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.base64,
      format: adoneLib.adoneLibStrings.compressed
    ): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: nodeLib.cryptoMod.BinaryLike,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.base64,
      format: adoneLib.adoneLibStrings.hybrid
    ): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: nodeLib.cryptoMod.BinaryLike,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.base64,
      format: adoneLib.adoneLibStrings.uncompressed
    ): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: nodeLib.cryptoMod.BinaryLike,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.hex,
      format: adoneLib.adoneLibStrings.compressed
    ): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: nodeLib.cryptoMod.BinaryLike,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.hex,
      format: adoneLib.adoneLibStrings.hybrid
    ): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: nodeLib.cryptoMod.BinaryLike,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.hex,
      format: adoneLib.adoneLibStrings.uncompressed
    ): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: nodeLib.cryptoMod.BinaryLike,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.latin1,
      format: adoneLib.adoneLibStrings.compressed
    ): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: nodeLib.cryptoMod.BinaryLike,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.latin1,
      format: adoneLib.adoneLibStrings.hybrid
    ): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: nodeLib.cryptoMod.BinaryLike,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.latin1,
      format: adoneLib.adoneLibStrings.uncompressed
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_base64(
      key: nodeLib.cryptoMod.BinaryLike,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.base64
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_hex(
      key: nodeLib.cryptoMod.BinaryLike,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.hex
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_latin1(
      key: nodeLib.cryptoMod.BinaryLike,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.latin1
    ): nodeLib.Buffer | java.lang.String = js.native
  }
  
  @JSName("constants")
  @js.native
  object constantsNs extends js.Object {
    val ALPN_ENABLED: scala.Double = js.native
    val DH_CHECK_P_NOT_PRIME: scala.Double = js.native
    val DH_CHECK_P_NOT_SAFE_PRIME: scala.Double = js.native
    val DH_NOT_SUITABLE_GENERATOR: scala.Double = js.native
    val DH_UNABLE_TO_CHECK_GENERATOR: scala.Double = js.native
    val ENGINE_METHOD_ALL: scala.Double = js.native
    val ENGINE_METHOD_CIPHERS: scala.Double = js.native
    val ENGINE_METHOD_DH: scala.Double = js.native
    val ENGINE_METHOD_DIGESTS: scala.Double = js.native
    val ENGINE_METHOD_DSA: scala.Double = js.native
    val ENGINE_METHOD_EC: scala.Double = js.native
    val ENGINE_METHOD_NONE: scala.Double = js.native
    val ENGINE_METHOD_PKEY_ASN1_METHS: scala.Double = js.native
    val ENGINE_METHOD_PKEY_METHS: scala.Double = js.native
    val ENGINE_METHOD_RAND: scala.Double = js.native
    val ENGINE_METHOD_RSA: scala.Double = js.native
    // https://nodejs.org/dist/latest-v10.x/docs/api/crypto.html#crypto_crypto_constants
    val OPENSSL_VERSION_NUMBER: scala.Double = js.native
    val POINT_CONVERSION_COMPRESSED: scala.Double = js.native
    val POINT_CONVERSION_HYBRID: scala.Double = js.native
    val POINT_CONVERSION_UNCOMPRESSED: scala.Double = js.native
    val RSA_NO_PADDING: scala.Double = js.native
    val RSA_PKCS1_OAEP_PADDING: scala.Double = js.native
    val RSA_PKCS1_PADDING: scala.Double = js.native
    val RSA_PKCS1_PSS_PADDING: scala.Double = js.native
    /** Causes the salt length for RSA_PKCS1_PSS_PADDING to be determined automatically when verifying a signature. */
    val RSA_PSS_SALTLEN_AUTO: scala.Double = js.native
    /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the digest size when signing or verifying. */
    val RSA_PSS_SALTLEN_DIGEST: scala.Double = js.native
    /** Sets the salt length for RSA_PKCS1_PSS_PADDING to the maximum permissible value when signing data. */
    val RSA_PSS_SALTLEN_MAX_SIGN: scala.Double = js.native
    val RSA_SSLV23_PADDING: scala.Double = js.native
    val RSA_X931_PADDING: scala.Double = js.native
    /** Applies multiple bug workarounds within OpenSSL. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html for detail. */
    val SSL_OP_ALL: scala.Double = js.native
    /** Allows legacy insecure renegotiation between OpenSSL and unpatched clients or servers. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
    val SSL_OP_ALLOW_UNSAFE_LEGACY_RENEGOTIATION: scala.Double = js.native
    /** Attempts to use the server's preferences instead of the client's when selecting a cipher. See https://www.openssl.org/docs/man1.0.2/ssl/SSL_CTX_set_options.html. */
    val SSL_OP_CIPHER_SERVER_PREFERENCE: scala.Double = js.native
    /** Instructs OpenSSL to use Cisco's "speshul" version of DTLS_BAD_VER. */
    val SSL_OP_CISCO_ANYCONNECT: scala.Double = js.native
    /** Instructs OpenSSL to turn on cookie exchange. */
    val SSL_OP_COOKIE_EXCHANGE: scala.Double = js.native
    /** Instructs OpenSSL to add server-hello extension from an early version of the cryptopro draft. */
    val SSL_OP_CRYPTOPRO_TLSEXT_BUG: scala.Double = js.native
    /** Instructs OpenSSL to disable a SSL 3.0/TLS 1.0 vulnerability workaround added in OpenSSL 0.9.6d. */
    val SSL_OP_DONT_INSERT_EMPTY_FRAGMENTS: scala.Double = js.native
    /** Instructs OpenSSL to always use the tmp_rsa key when performing RSA operations. */
    val SSL_OP_EPHEMERAL_RSA: scala.Double = js.native
    /** Allows initial connection to servers that do not support RI. */
    val SSL_OP_LEGACY_SERVER_CONNECT: scala.Double = js.native
    val SSL_OP_MICROSOFT_BIG_SSLV3_BUFFER: scala.Double = js.native
    val SSL_OP_MICROSOFT_SESS_ID_BUG: scala.Double = js.native
    /** Instructs OpenSSL to disable the workaround for a man-in-the-middle protocol-version vulnerability in the SSL 2.0 server implementation. */
    val SSL_OP_MSIE_SSLV2_RSA_PADDING: scala.Double = js.native
    val SSL_OP_NETSCAPE_CA_DN_BUG: scala.Double = js.native
    val SSL_OP_NETSCAPE_CHALLENGE_BUG: scala.Double = js.native
    val SSL_OP_NETSCAPE_DEMO_CIPHER_CHANGE_BUG: scala.Double = js.native
    val SSL_OP_NETSCAPE_REUSE_CIPHER_CHANGE_BUG: scala.Double = js.native
    /** Instructs OpenSSL to disable support for SSL/TLS compression. */
    val SSL_OP_NO_COMPRESSION: scala.Double = js.native
    val SSL_OP_NO_QUERY_MTU: scala.Double = js.native
    /** Instructs OpenSSL to always start a new session when performing renegotiation. */
    val SSL_OP_NO_SESSION_RESUMPTION_ON_RENEGOTIATION: scala.Double = js.native
    val SSL_OP_NO_SSLv2: scala.Double = js.native
    val SSL_OP_NO_SSLv3: scala.Double = js.native
    val SSL_OP_NO_TICKET: scala.Double = js.native
    val SSL_OP_NO_TLSv1: scala.Double = js.native
    val SSL_OP_NO_TLSv1_1: scala.Double = js.native
    val SSL_OP_NO_TLSv1_2: scala.Double = js.native
    val SSL_OP_PKCS1_CHECK_1: scala.Double = js.native
    val SSL_OP_PKCS1_CHECK_2: scala.Double = js.native
    /** Instructs OpenSSL to always create a new key when using temporary/ephemeral DH parameters. */
    val SSL_OP_SINGLE_DH_USE: scala.Double = js.native
    /** Instructs OpenSSL to always create a new key when using temporary/ephemeral ECDH parameters. */
    val SSL_OP_SINGLE_ECDH_USE: scala.Double = js.native
    val SSL_OP_SSLEAY_080_CLIENT_DH_BUG: scala.Double = js.native
    val SSL_OP_SSLREF2_REUSE_CERT_TYPE_BUG: scala.Double = js.native
    val SSL_OP_TLS_BLOCK_PADDING_BUG: scala.Double = js.native
    val SSL_OP_TLS_D5_BUG: scala.Double = js.native
    /** Instructs OpenSSL to disable version rollback attack detection. */
    val SSL_OP_TLS_ROLLBACK_BUG: scala.Double = js.native
    /** Specifies the active default cipher list used by the current Node.js process  (colon-separated values). */
    val defaultCipherList: java.lang.String = js.native
    /** Specifies the built-in default cipher list used by Node.js (colon-separated values). */
    val defaultCoreCipherList: java.lang.String = js.native
  }
  
  @JSName("generateKeyPair")
  @js.native
  object generateKeyPairNs extends js.Object {
    def __promisify__(
      `type`: adoneLib.adoneLibStrings.dsa,
      options: nodeLib.cryptoMod.DSAKeyPairOptions[
          adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
          adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
        ]
    ): js.Promise[nodeLib.Anon_PrivateKey] = js.native
    def __promisify__(
      `type`: adoneLib.adoneLibStrings.ec,
      options: nodeLib.cryptoMod.ECKeyPairOptions[
          adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
          adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
        ]
    ): js.Promise[nodeLib.Anon_PrivateKey] = js.native
    def __promisify__(
      `type`: adoneLib.adoneLibStrings.rsa,
      options: nodeLib.cryptoMod.RSAKeyPairOptions[
          adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
          adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
        ]
    ): js.Promise[nodeLib.Anon_PrivateKey] = js.native
    @JSName("__promisify__")
    def __promisify___dsa(`type`: adoneLib.adoneLibStrings.dsa, options: nodeLib.cryptoMod.DSAKeyPairKeyObjectOptions): js.Promise[nodeLib.cryptoMod.KeyPairKeyObjectResult] = js.native
    @JSName("__promisify__")
    def __promisify___ec(`type`: adoneLib.adoneLibStrings.ec, options: nodeLib.cryptoMod.ECKeyPairKeyObjectOptions): js.Promise[nodeLib.cryptoMod.KeyPairKeyObjectResult] = js.native
    @JSName("__promisify__")
    def __promisify___rsa(`type`: adoneLib.adoneLibStrings.rsa, options: nodeLib.cryptoMod.RSAKeyPairKeyObjectOptions): js.Promise[nodeLib.cryptoMod.KeyPairKeyObjectResult] = js.native
  }
  
}

