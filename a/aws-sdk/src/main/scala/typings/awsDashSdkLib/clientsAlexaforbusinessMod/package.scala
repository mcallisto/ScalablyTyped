package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAlexaforbusinessMod {
  type Address = java.lang.String
  type AddressBookDataList = js.Array[AddressBookData]
  type AddressBookDescription = java.lang.String
  type AddressBookName = java.lang.String
  type AmazonId = java.lang.String
  type ApplianceDescription = java.lang.String
  type ApplianceFriendlyName = java.lang.String
  type ApplianceManufacturerName = java.lang.String
  type Arn = java.lang.String
  type AudioList = js.Array[Audio]
  type AudioLocation = java.lang.String
  type AuthorizationResult = org.scalablytyped.runtime.StringDictionary[Value]
  type Boolean = scala.Boolean
  type BulletPoint = java.lang.String
  type BulletPoints = js.Array[BulletPoint]
  type BusinessReportDeliveryTime = stdLib.Date
  type BusinessReportDownloadUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ACCESS_DENIED
    - awsDashSdkLib.awsDashSdkLibStrings.NO_SUCH_BUCKET
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_FAILURE
    - java.lang.String
  */
  type BusinessReportFailureCode = _BusinessReportFailureCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CSV
    - awsDashSdkLib.awsDashSdkLibStrings.CSV_ZIP
    - java.lang.String
  */
  type BusinessReportFormat = _BusinessReportFormat | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ONE_DAY
    - awsDashSdkLib.awsDashSdkLibStrings.ONE_WEEK
    - java.lang.String
  */
  type BusinessReportInterval = _BusinessReportInterval | java.lang.String
  type BusinessReportS3Path = java.lang.String
  type BusinessReportScheduleList = js.Array[BusinessReportSchedule]
  type BusinessReportScheduleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type BusinessReportStatus = _BusinessReportStatus | java.lang.String
  type CategoryId = scala.Double
  type CategoryList = js.Array[Category]
  type CategoryName = java.lang.String
  type CertificateTime = stdLib.Date
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientId = java.lang.String
  type ClientRequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SIP
    - awsDashSdkLib.awsDashSdkLibStrings.SIPS
    - awsDashSdkLib.awsDashSdkLibStrings.H323
    - java.lang.String
  */
  type CommsProtocol = _CommsProtocol | java.lang.String
  type ConferenceProviderName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CHIME
    - awsDashSdkLib.awsDashSdkLibStrings.BLUEJEANS
    - awsDashSdkLib.awsDashSdkLibStrings.FUZE
    - awsDashSdkLib.awsDashSdkLibStrings.GOOGLE_HANGOUTS
    - awsDashSdkLib.awsDashSdkLibStrings.POLYCOM
    - awsDashSdkLib.awsDashSdkLibStrings.RINGCENTRAL
    - awsDashSdkLib.awsDashSdkLibStrings.SKYPE_FOR_BUSINESS
    - awsDashSdkLib.awsDashSdkLibStrings.WEBEX
    - awsDashSdkLib.awsDashSdkLibStrings.ZOOM
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOM
    - java.lang.String
  */
  type ConferenceProviderType = _ConferenceProviderType | java.lang.String
  type ConferenceProvidersList = js.Array[ConferenceProvider]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ONLINE
    - awsDashSdkLib.awsDashSdkLibStrings.OFFLINE
    - java.lang.String
  */
  type ConnectionStatus = _ConnectionStatus | java.lang.String
  type ContactDataList = js.Array[ContactData]
  type ContactName = java.lang.String
  type CountryCode = java.lang.String
  type CurrentWiFiPassword = java.lang.String
  type CustomerS3BucketName = java.lang.String
  type DeveloperName = java.lang.String
  type DeviceDataList = js.Array[DeviceData]
  type DeviceEventList = js.Array[DeviceEvent]
  type DeviceEventTime = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CONNECTION_STATUS
    - awsDashSdkLib.awsDashSdkLibStrings.DEVICE_STATUS
    - java.lang.String
  */
  type DeviceEventType = _DeviceEventType | java.lang.String
  type DeviceEventValue = java.lang.String
  type DeviceName = java.lang.String
  type DeviceSerialNumber = java.lang.String
  type DeviceSerialNumberForAVS = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.READY
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.WAS_OFFLINE
    - awsDashSdkLib.awsDashSdkLibStrings.DEREGISTERED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type DeviceStatus = _DeviceStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEVICE_SOFTWARE_UPDATE_NEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.DEVICE_WAS_OFFLINE
    - awsDashSdkLib.awsDashSdkLibStrings.CREDENTIALS_ACCESS_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.TLS_VERSION_MISMATCH
    - awsDashSdkLib.awsDashSdkLibStrings.ASSOCIATION_REJECTION
    - awsDashSdkLib.awsDashSdkLibStrings.AUTHENTICATION_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.DHCP_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.INTERNET_UNAVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.DNS_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN_FAILURE
    - awsDashSdkLib.awsDashSdkLibStrings.CERTIFICATE_ISSUING_LIMIT_EXCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_CERTIFICATE_AUTHORITY
    - awsDashSdkLib.awsDashSdkLibStrings.NETWORK_PROFILE_NOT_FOUND
    - awsDashSdkLib.awsDashSdkLibStrings.INVALID_PASSWORD_STATE
    - awsDashSdkLib.awsDashSdkLibStrings.PASSWORD_NOT_FOUND
    - java.lang.String
  */
  type DeviceStatusDetailCode = _DeviceStatusDetailCode | java.lang.String
  type DeviceStatusDetails = js.Array[DeviceStatusDetail]
  type DeviceType = java.lang.String
  type DeviceUsageType = awsDashSdkLib.awsDashSdkLibStrings.VOICE | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.METRIC
    - awsDashSdkLib.awsDashSdkLibStrings.IMPERIAL
    - java.lang.String
  */
  type DistanceUnit = _DistanceUnit | java.lang.String
  type Email = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - java.lang.String
  */
  type EnablementType = _EnablementType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - java.lang.String
  */
  type EnablementTypeFilter = _EnablementTypeFilter | java.lang.String
  type EndUserLicenseAgreement = java.lang.String
  type Endpoint = java.lang.String
  type EnrollmentId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INITIALIZED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.REGISTERED
    - awsDashSdkLib.awsDashSdkLibStrings.DISASSOCIATING
    - awsDashSdkLib.awsDashSdkLibStrings.DEREGISTERING
    - java.lang.String
  */
  type EnrollmentStatus = _EnrollmentStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BLUETOOTH
    - awsDashSdkLib.awsDashSdkLibStrings.VOLUME
    - awsDashSdkLib.awsDashSdkLibStrings.NOTIFICATIONS
    - awsDashSdkLib.awsDashSdkLibStrings.LISTS
    - awsDashSdkLib.awsDashSdkLibStrings.SKILLS
    - awsDashSdkLib.awsDashSdkLibStrings.NETWORK_PROFILE
    - awsDashSdkLib.awsDashSdkLibStrings.SETTINGS
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - java.lang.String
  */
  type Feature = _Feature | java.lang.String
  type Features = js.Array[Feature]
  type FilterKey = java.lang.String
  type FilterList = js.Array[Filter]
  type FilterValue = java.lang.String
  type FilterValueList = js.Array[FilterValue]
  type GatewayDescription = java.lang.String
  type GatewayGroupDescription = java.lang.String
  type GatewayGroupName = java.lang.String
  type GatewayGroupSummaries = js.Array[GatewayGroupSummary]
  type GatewayName = java.lang.String
  type GatewaySummaries = js.Array[GatewaySummary]
  type GatewayVersion = java.lang.String
  type GenericKeyword = java.lang.String
  type GenericKeywords = js.Array[GenericKeyword]
  type IconUrl = java.lang.String
  type InvocationPhrase = java.lang.String
  type Key = java.lang.String
  type Locale = awsDashSdkLib.awsDashSdkLibStrings.`en-US` | java.lang.String
  type MacAddress = java.lang.String
  type MaxResults = scala.Double
  type MaxVolumeLimit = scala.Double
  type NetworkEapMethod = awsDashSdkLib.awsDashSdkLibStrings.EAP_TLS | java.lang.String
  type NetworkProfileDataList = js.Array[NetworkProfileData]
  type NetworkProfileDescription = java.lang.String
  type NetworkProfileName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OPEN
    - awsDashSdkLib.awsDashSdkLibStrings.WEP
    - awsDashSdkLib.awsDashSdkLibStrings.WPA_PSK
    - awsDashSdkLib.awsDashSdkLibStrings.WPA2_PSK
    - awsDashSdkLib.awsDashSdkLibStrings.WPA2_ENTERPRISE
    - java.lang.String
  */
  type NetworkSecurityType = _NetworkSecurityType | java.lang.String
  type NetworkSsid = java.lang.String
  type NewInThisVersionBulletPoints = js.Array[BulletPoint]
  type NextToken = java.lang.String
  type NextWiFiPassword = java.lang.String
  type OneClickIdDelay = java.lang.String
  type OneClickPinDelay = java.lang.String
  type OrganizationName = java.lang.String
  type OutboundPhoneNumber = java.lang.String
  type PhoneNumberList = js.Array[PhoneNumber]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MOBILE
    - awsDashSdkLib.awsDashSdkLibStrings.WORK
    - awsDashSdkLib.awsDashSdkLibStrings.HOME
    - java.lang.String
  */
  type PhoneNumberType = _PhoneNumberType | java.lang.String
  type PrivacyPolicy = java.lang.String
  type ProductDescription = java.lang.String
  type ProductId = java.lang.String
  type ProfileDataList = js.Array[ProfileData]
  type ProfileName = java.lang.String
  type ProviderCalendarId = java.lang.String
  type RawPhoneNumber = java.lang.String
  type ReleaseDate = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.YES
    - awsDashSdkLib.awsDashSdkLibStrings.NO
    - awsDashSdkLib.awsDashSdkLibStrings.OPTIONAL
    - java.lang.String
  */
  type RequirePin = _RequirePin | java.lang.String
  type ReviewKey = java.lang.String
  type ReviewValue = java.lang.String
  type Reviews = org.scalablytyped.runtime.StringDictionary[ReviewValue]
  type RoomDataList = js.Array[RoomData]
  type RoomDescription = java.lang.String
  type RoomName = java.lang.String
  type RoomSkillParameterKey = java.lang.String
  type RoomSkillParameterValue = java.lang.String
  type RoomSkillParameters = js.Array[RoomSkillParameter]
  type S3KeyPrefix = java.lang.String
  type SampleUtterances = js.Array[Utterance]
  type ShortDescription = java.lang.String
  type ShortSkillIdList = js.Array[SkillId]
  type SipAddressList = js.Array[SipAddress]
  type SipType = awsDashSdkLib.awsDashSdkLibStrings.WORK | java.lang.String
  type SipUri = java.lang.String
  type SkillGroupDataList = js.Array[SkillGroupData]
  type SkillGroupDescription = java.lang.String
  type SkillGroupName = java.lang.String
  type SkillId = java.lang.String
  type SkillListMaxResults = scala.Double
  type SkillName = java.lang.String
  type SkillStoreType = java.lang.String
  type SkillSummaryList = js.Array[SkillSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PUBLIC
    - awsDashSdkLib.awsDashSdkLibStrings.PRIVATE
    - java.lang.String
  */
  type SkillType = _SkillType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PUBLIC
    - awsDashSdkLib.awsDashSdkLibStrings.PRIVATE
    - awsDashSdkLib.awsDashSdkLibStrings.ALL
    - java.lang.String
  */
  type SkillTypeFilter = _SkillTypeFilter | java.lang.String
  type SkillTypes = js.Array[SkillStoreType]
  type SkillsStoreSkillList = js.Array[SkillsStoreSkill]
  type SmartHomeApplianceList = js.Array[SmartHomeAppliance]
  type SoftwareVersion = java.lang.String
  type SortKey = java.lang.String
  type SortList = js.Array[Sort]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASC
    - awsDashSdkLib.awsDashSdkLibStrings.DESC
    - java.lang.String
  */
  type SortValue = _SortValue | java.lang.String
  type SsmlList = js.Array[Ssml]
  type SsmlValue = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FAHRENHEIT
    - awsDashSdkLib.awsDashSdkLibStrings.CELSIUS
    - java.lang.String
  */
  type TemperatureUnit = _TemperatureUnit | java.lang.String
  type TextList = js.Array[Text]
  type TextValue = java.lang.String
  type TimeToLiveInSeconds = scala.Double
  type Timezone = java.lang.String
  type TotalCount = scala.Double
  type TrustAnchor = java.lang.String
  type TrustAnchorList = js.Array[TrustAnchor]
  type Url = java.lang.String
  type UserCode = java.lang.String
  type UserDataList = js.Array[UserData]
  type UserId = java.lang.String
  type Utterance = java.lang.String
  type Value = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ALEXA
    - awsDashSdkLib.awsDashSdkLibStrings.AMAZON
    - awsDashSdkLib.awsDashSdkLibStrings.ECHO
    - awsDashSdkLib.awsDashSdkLibStrings.COMPUTER
    - java.lang.String
  */
  type WakeWord = _WakeWord | java.lang.String
  type _Date = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-11-09`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type user_FirstName = java.lang.String
  type user_LastName = java.lang.String
  type user_UserId = java.lang.String
}
