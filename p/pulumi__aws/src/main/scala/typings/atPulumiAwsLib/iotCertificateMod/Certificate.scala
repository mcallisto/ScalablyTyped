package typings
package atPulumiAwsLib.iotCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/iot/certificate", "Certificate")
@js.native
class Certificate protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Certificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: CertificateArgs) = this()
  def this(name: java.lang.String, args: CertificateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Boolean flag to indicate if the certificate should be active
    */
  val active: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * The ARN of the created AWS IoT certificate
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The certificate signing request. Review the
    * [IoT API Reference Guide] (http://docs.aws.amazon.com/iot/latest/apireference/API_CreateCertificateFromCsr.html)
    * for more information on creating a certificate from a certificate signing request (CSR).
    */
  val csr: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/iot/certificate", "Certificate")
@js.native
object Certificate extends js.Object {
  /**
    * Get an existing Certificate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.iotCertificateMod.Certificate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotCertificateMod.CertificateState
  ): atPulumiAwsLib.iotCertificateMod.Certificate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.iotCertificateMod.CertificateState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.iotCertificateMod.Certificate = js.native
  /**
    * Returns true if the given object is an instance of Certificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/iot/certificate.Certificate */ scala.Boolean = js.native
}

