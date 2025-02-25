package typings
package atPulumiAwsLib.dmsEndpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  val certificateArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the endpoint database.
    */
  val databaseName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the endpoint.
    */
  val endpointArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The database endpoint identifier.
    */
  val endpointId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of endpoint. Can be one of `source | target`.
    */
  val endpointType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of engine for the endpoint. Can be one of `aurora | azuredb | db2 | docdb | dynamodb | mariadb | mongodb | mysql | oracle | postgres | redshift | s3 | sqlserver | sybase`.
    */
  val engineName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Additional attributes associated with the connection. For available attributes see [Using Extra Connection Attributes with AWS Database Migration Service](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Introduction.ConnectionAttributes.html).
    */
  val extraConnectionAttributes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kms_key_arn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
    */
  val kmsKeyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Settings for the source MongoDB endpoint. Available settings are `auth_type` (default: `password`), `auth_mechanism` (default: `default`), `nesting_level` (default: `none`), `extract_doc_id` (default: `false`), `docs_to_investigate` (default: `1000`) and `auth_source` (default: `admin`). For more details, see [Using MongoDB as a Source for AWS DMS](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.MongoDB.html).
    */
  val mongodbSettings: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AuthMechanismAuthSource]] = js.undefined
  /**
    * The password to be used to login to the endpoint database.
    */
  val password: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The port used by the endpoint database.
    */
  val port: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Settings for the target S3 endpoint. Available settings are `service_access_role_arn`, `external_table_definition`, `csv_row_delimiter` (default: `\\n`), `csv_delimiter` (default: `,`), `bucket_folder`, `bucket_name` and `compression_type` (default: `NONE`). For more details, see [Using Amazon S3 as a Target for AWS Database Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.S3.html).
    */
  val s3Settings: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketFolderBucketName]] = js.undefined
  /**
    * The host name of the server.
    */
  val serverName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) used by the service access IAM role for dynamodb endpoints.
    */
  val serviceAccessRole: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The SSL mode to use for the connection. Can be one of `none | require | verify-ca | verify-full`
    */
  val sslMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The user name to be used to login to the endpoint database.
    */
  val username: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object EndpointState {
  @scala.inline
  def apply(
    certificateArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    databaseName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    endpointArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    endpointId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    endpointType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    engineName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    extraConnectionAttributes: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    kmsKeyArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    mongodbSettings: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AuthMechanismAuthSource] = null,
    password: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    port: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    s3Settings: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BucketFolderBucketName] = null,
    serverName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    serviceAccessRole: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sslMode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    username: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): EndpointState = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (databaseName != null) __obj.updateDynamic("databaseName")(databaseName.asInstanceOf[js.Any])
    if (endpointArn != null) __obj.updateDynamic("endpointArn")(endpointArn.asInstanceOf[js.Any])
    if (endpointId != null) __obj.updateDynamic("endpointId")(endpointId.asInstanceOf[js.Any])
    if (endpointType != null) __obj.updateDynamic("endpointType")(endpointType.asInstanceOf[js.Any])
    if (engineName != null) __obj.updateDynamic("engineName")(engineName.asInstanceOf[js.Any])
    if (extraConnectionAttributes != null) __obj.updateDynamic("extraConnectionAttributes")(extraConnectionAttributes.asInstanceOf[js.Any])
    if (kmsKeyArn != null) __obj.updateDynamic("kmsKeyArn")(kmsKeyArn.asInstanceOf[js.Any])
    if (mongodbSettings != null) __obj.updateDynamic("mongodbSettings")(mongodbSettings.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (s3Settings != null) __obj.updateDynamic("s3Settings")(s3Settings.asInstanceOf[js.Any])
    if (serverName != null) __obj.updateDynamic("serverName")(serverName.asInstanceOf[js.Any])
    if (serviceAccessRole != null) __obj.updateDynamic("serviceAccessRole")(serviceAccessRole.asInstanceOf[js.Any])
    if (sslMode != null) __obj.updateDynamic("sslMode")(sslMode.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointState]
  }
}

