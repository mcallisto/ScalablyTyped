package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "type")
@js.native
object typeNs extends js.Object {
  /**
    * Encoded symmetric key for ECDH
    */
  @JSName("ecdh_symkey")
  @js.native
  object ecdhUnderscoreSymkeyNs extends js.Object {
    @js.native
    class ECDHSymmetricKey () extends js.Object {
      /**
        * Read an ECDHSymmetricKey from an Uint8Array
        * @param input Where to read the encoded symmetric key from
        * @returns Number of read bytes
        */
      def read(input: stdLib.Uint8Array): scala.Double = js.native
      /**
        * Write an ECDHSymmetricKey as an Uint8Array
        * @returns An array containing the value
        */
      def write(): stdLib.Uint8Array = js.native
    }
    
  }
  
  /**
    * Implementation of type KDF parameters
    * {@link https://tools.ietf.org/html/rfc6637#section-7|RFC 6637 7}:
    * A key derivation function (KDF) is necessary to implement the EC
    * encryption.  The Concatenation Key Derivation Function (Approved
    * Alternative 1) [NIST-SP800-56A] with the KDF hash function that is
    * SHA2-256 [FIPS-180-3] or stronger is REQUIRED.
    */
  @JSName("kdf_params")
  @js.native
  object kdfUnderscoreParamsNs extends js.Object {
    @js.native
    class KDFParams protected () extends js.Object {
      /**
        * @param hash Hash algorithm
        * @param cipher Symmetric algorithm
        */
      def this(hash: openpgpLib.openpgpMod.enumsNs.hash, cipher: openpgpLib.openpgpMod.enumsNs.symmetric) = this()
      /**
        * Read KDFParams from an Uint8Array
        * @param input Where to read the KDFParams from
        * @returns Number of read bytes
        */
      def read(input: stdLib.Uint8Array): scala.Double = js.native
      /**
        * Write KDFParams to an Uint8Array
        * @returns Array with the KDFParams value
        */
      def write(): stdLib.Uint8Array = js.native
    }
    
  }
  
  /**
    * Implementation of type key id
    * {@link https://tools.ietf.org/html/rfc4880#section-3.3|RFC4880 3.3}:
    * A Key ID is an eight-octet scalar that identifies a key.
    * Implementations SHOULD NOT assume that Key IDs are unique.  The
    * section "Enhanced Key Formats" below describes how Key IDs are
    * formed.
    */
  @JSName("keyid")
  @js.native
  object keyidNs extends js.Object {
    @js.native
    class Keyid () extends js.Object {
      /**
        * Checks equality of Key ID's
        * @param keyid
        * @param matchWildcard Indicates whether to check if either keyid is a wildcard
        */
      def equals(keyid: Keyid, matchWildcard: scala.Boolean): scala.Unit = js.native
      /**
        * Parsing method for a key id
        * @param input Input to read the key id from
        */
      def read(input: stdLib.Uint8Array): scala.Unit = js.native
    }
    
  }
  
  /**
    * Implementation of type MPI ( {@link https://tools.ietf.org/html/rfc4880#section-3.2|RFC4880 3.2})
    * Multiprecision integers (also called MPIs) are unsigned integers used
    * to hold large integers such as the ones used in cryptographic
    * calculations.
    * An MPI consists of two pieces: a two-octet scalar that is the length
    * of the MPI in bits followed by a string of octets that contain the
    * actual integer.
    */
  @JSName("mpi")
  @js.native
  object mpiNs extends js.Object {
    @js.native
    class MPI () extends js.Object {
      /**
        * Parsing function for a MPI ( {@link https://tools.ietf.org/html/rfc4880#section-3.2|RFC 4880 3.2}).
        * @param input Payload of MPI data
        * @param endian Endianness of the data; 'be' for big-endian or 'le' for little-endian
        * @returns Length of data read
        */
      def read(input: stdLib.Uint8Array, endian: java.lang.String): openpgpLib.Integer = js.native
      /**
        * Converts the mpi object to a bytes as specified in
        * {@link https://tools.ietf.org/html/rfc4880#section-3.2|RFC4880 3.2}
        * @param endian Endianness of the payload; 'be' for big-endian or 'le' for little-endian
        * @param length Length of the data part of the MPI
        * @returns mpi Byte representation
        */
      def write(endian: java.lang.String, length: openpgpLib.Integer): stdLib.Uint8Array = js.native
    }
    
  }
  
  /**
    * Wrapper to an OID value
    * {@link https://tools.ietf.org/html/rfc6637#section-11|RFC6637, section 11}:
    * The sequence of octets in the third column is the result of applying
    * the Distinguished Encoding Rules (DER) to the ASN.1 Object Identifier
    * with subsequent truncation.  The truncation removes the two fields of
    * encoded Object Identifier.  The first omitted field is one octet
    * representing the Object Identifier tag, and the second omitted field
    * is the length of the Object Identifier body.  For example, the
    * complete ASN.1 DER encoding for the NIST P-256 curve OID is "06 08 2A
    * 86 48 CE 3D 03 01 07", from which the first entry in the table above
    * is constructed by omitting the first two octets.  Only the truncated
    * sequence of octets is the valid representation of a curve OID.
    */
  @JSName("oid")
  @js.native
  object oidNs extends js.Object {
    @js.native
    class OID () extends js.Object {
      /**
        * If a known curve object identifier, return the canonical name of the curve
        * @returns String with the canonical name of the curve
        */
      def getName(): java.lang.String = js.native
      /**
        * Method to read an OID object
        * @param input Where to read the OID from
        * @returns Number of read bytes
        */
      def read(input: stdLib.Uint8Array): scala.Double = js.native
      /**
        * Serialize an OID object as a hex string
        * @returns String with the hex value of the OID
        */
      def toHex(): java.lang.String = js.native
      /**
        * Serialize an OID object
        * @returns Array with the serialized value the OID
        */
      def write(): stdLib.Uint8Array = js.native
    }
    
  }
  
  /**
    * Implementation of the String-to-key specifier
    * {@link https://tools.ietf.org/html/rfc4880#section-3.7|RFC4880 3.7}:
    * String-to-key (S2K) specifiers are used to convert passphrase strings
    * into symmetric-key encryption/decryption keys.  They are used in two
    * places, currently: to encrypt the secret part of private keys in the
    * private keyring, and to convert passphrases to encryption keys for
    * symmetrically encrypted messages.
    */
  @JSName("s2k")
  @js.native
  object s2kNs extends js.Object {
    @js.native
    class S2K () extends js.Object {
      var algorithm: openpgpLib.openpgpMod.enumsNs.hash = js.native
      var c: openpgpLib.Integer = js.native
      /**
        * Eight bytes of salt in a binary string.
        */
      var salt: java.lang.String = js.native
      var `type`: openpgpLib.openpgpMod.enumsNs.s2k = js.native
      /**
        * Produces a key using the specified passphrase and the defined
        * hashAlgorithm
        * @param passphrase Passphrase containing user input
        * @returns Produced key with a length corresponding to
        *          hashAlgorithm hash length
        */
      def produce_key(passphrase: java.lang.String): stdLib.Uint8Array = js.native
      /**
        * Parsing function for a string-to-key specifier ( {@link https://tools.ietf.org/html/rfc4880#section-3.7|RFC 4880 3.7}).
        * @param input Payload of string-to-key specifier
        * @returns Actual length of the object
        */
      def read(input: java.lang.String): openpgpLib.Integer = js.native
      /**
        * Serializes s2k information
        * @returns binary representation of s2k
        */
      def write(): stdLib.Uint8Array = js.native
    }
    
  }
  
}

