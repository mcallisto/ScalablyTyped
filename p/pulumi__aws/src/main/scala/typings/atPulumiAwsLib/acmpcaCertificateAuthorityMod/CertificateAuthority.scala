package typings
package atPulumiAwsLib.acmpcaCertificateAuthorityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/acmpca/certificateAuthority", "CertificateAuthority")
@js.native
class CertificateAuthority protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a CertificateAuthority resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: CertificateAuthorityArgs) = this()
  def this(name: java.lang.String, args: CertificateAuthorityArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the certificate authority.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Base64-encoded certificate authority (CA) certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Nested argument containing algorithms and certificate subject information. Defined below.
    */
  val certificateAuthorityConfiguration: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_KeyAlgorithm] = js.native
  /**
    * Base64-encoded certificate chain that includes any intermediate certificates and chains up to root on-premises certificate that you used to sign your private CA certificate. The chain does not include your private CA certificate. Only available after the certificate authority certificate has been imported.
    */
  val certificateChain: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The base64 PEM-encoded certificate signing request (CSR) for your private CA certificate.
    */
  val certificateSigningRequest: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
    */
  val enabled: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Date and time after which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notAfter: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Date and time before which the certificate authority is not valid. Only available after the certificate authority certificate has been imported.
    */
  val notBefore: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
    */
  val permanentDeletionTimeInDays: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * Nested argument containing revocation configuration. Defined below.
    */
  val revocationConfiguration: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_CrlConfiguration]] = js.native
  /**
    * Serial number of the certificate authority. Only available after the certificate authority certificate has been imported.
    */
  val serial: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Status of the certificate authority.
    */
  val status: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Specifies a key-value map of user-defined tags that are attached to the certificate authority.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The type of the certificate authority. Currently, this must be `SUBORDINATE`.
    */
  val `type`: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/acmpca/certificateAuthority", "CertificateAuthority")
@js.native
object CertificateAuthority extends js.Object {
  /**
    * Get an existing CertificateAuthority resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.acmpcaCertificateAuthorityMod.CertificateAuthority = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.acmpcaCertificateAuthorityMod.CertificateAuthorityState
  ): atPulumiAwsLib.acmpcaCertificateAuthorityMod.CertificateAuthority = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.acmpcaCertificateAuthorityMod.CertificateAuthorityState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.acmpcaCertificateAuthorityMod.CertificateAuthority = js.native
  /**
    * Returns true if the given object is an instance of CertificateAuthority.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acmpca/certificateAuthority.CertificateAuthority */ scala.Boolean = js.native
}

