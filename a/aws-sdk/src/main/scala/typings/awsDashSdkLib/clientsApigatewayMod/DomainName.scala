package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainName extends js.Object {
  /**
    * The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var certificateArn: js.UndefOr[String] = js.undefined
  /**
    * The name of the certificate that will be used by edge-optimized endpoint for this domain name.
    */
  var certificateName: js.UndefOr[String] = js.undefined
  /**
    * The timestamp when the certificate that was used by edge-optimized endpoint for this domain name was uploaded.
    */
  var certificateUploadDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The domain name of the Amazon CloudFront distribution associated with this custom domain name for an edge-optimized endpoint. You set up this association when adding a DNS record pointing the custom domain name to this distribution name. For more information about CloudFront distributions, see the Amazon CloudFront documentation.
    */
  var distributionDomainName: js.UndefOr[String] = js.undefined
  /**
    * The region-agnostic Amazon Route 53 Hosted Zone ID of the edge-optimized endpoint. The valid value is Z2FDTNDATAQYW2 for all the regions. For more information, see Set up a Regional Custom Domain Name and AWS Regions and Endpoints for API Gateway. 
    */
  var distributionHostedZoneId: js.UndefOr[String] = js.undefined
  /**
    * The custom domain name as an API host name, for example, my-api.example.com.
    */
  var domainName: js.UndefOr[String] = js.undefined
  /**
    * The status of the DomainName migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
    */
  var domainNameStatus: js.UndefOr[DomainNameStatus] = js.undefined
  /**
    * An optional text message containing detailed information about status of the DomainName migration.
    */
  var domainNameStatusMessage: js.UndefOr[String] = js.undefined
  /**
    * The endpoint configuration of this DomainName showing the endpoint types of the domain name. 
    */
  var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined
  /**
    * The reference to an AWS-managed certificate that will be used for validating the regional domain name. AWS Certificate Manager is the only supported source.
    */
  var regionalCertificateArn: js.UndefOr[String] = js.undefined
  /**
    * The name of the certificate that will be used for validating the regional domain name.
    */
  var regionalCertificateName: js.UndefOr[String] = js.undefined
  /**
    * The domain name associated with the regional endpoint for this custom domain name. You set up this association by adding a DNS record that points the custom domain name to this regional domain name. The regional domain name is returned by API Gateway when you create a regional endpoint.
    */
  var regionalDomainName: js.UndefOr[String] = js.undefined
  /**
    * The region-specific Amazon Route 53 Hosted Zone ID of the regional endpoint. For more information, see Set up a Regional Custom Domain Name and AWS Regions and Endpoints for API Gateway. 
    */
  var regionalHostedZoneId: js.UndefOr[String] = js.undefined
  /**
    * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are TLS_1_0 and TLS_1_2.
    */
  var securityPolicy: js.UndefOr[SecurityPolicy] = js.undefined
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
}

object DomainName {
  @scala.inline
  def apply(
    certificateArn: String = null,
    certificateName: String = null,
    certificateUploadDate: Timestamp = null,
    distributionDomainName: String = null,
    distributionHostedZoneId: String = null,
    domainName: String = null,
    domainNameStatus: DomainNameStatus = null,
    domainNameStatusMessage: String = null,
    endpointConfiguration: EndpointConfiguration = null,
    regionalCertificateArn: String = null,
    regionalCertificateName: String = null,
    regionalDomainName: String = null,
    regionalHostedZoneId: String = null,
    securityPolicy: SecurityPolicy = null,
    tags: MapOfStringToString = null
  ): DomainName = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn)
    if (certificateName != null) __obj.updateDynamic("certificateName")(certificateName)
    if (certificateUploadDate != null) __obj.updateDynamic("certificateUploadDate")(certificateUploadDate)
    if (distributionDomainName != null) __obj.updateDynamic("distributionDomainName")(distributionDomainName)
    if (distributionHostedZoneId != null) __obj.updateDynamic("distributionHostedZoneId")(distributionHostedZoneId)
    if (domainName != null) __obj.updateDynamic("domainName")(domainName)
    if (domainNameStatus != null) __obj.updateDynamic("domainNameStatus")(domainNameStatus.asInstanceOf[js.Any])
    if (domainNameStatusMessage != null) __obj.updateDynamic("domainNameStatusMessage")(domainNameStatusMessage)
    if (endpointConfiguration != null) __obj.updateDynamic("endpointConfiguration")(endpointConfiguration)
    if (regionalCertificateArn != null) __obj.updateDynamic("regionalCertificateArn")(regionalCertificateArn)
    if (regionalCertificateName != null) __obj.updateDynamic("regionalCertificateName")(regionalCertificateName)
    if (regionalDomainName != null) __obj.updateDynamic("regionalDomainName")(regionalDomainName)
    if (regionalHostedZoneId != null) __obj.updateDynamic("regionalHostedZoneId")(regionalHostedZoneId)
    if (securityPolicy != null) __obj.updateDynamic("securityPolicy")(securityPolicy.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[DomainName]
  }
}

