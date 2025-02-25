package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRedshiftMod {
  type AccountsWithRestoreAccessList = js.Array[AccountWithRestoreAccess]
  type AssociatedClusterList = js.Array[ClusterAssociatedToSchedule]
  type AttributeList = js.Array[AccountAttribute]
  type AttributeNameList = js.Array[String]
  type AttributeValueList = js.Array[AttributeValueTarget]
  type AvailabilityZoneList = js.Array[AvailabilityZone]
  type BatchSnapshotOperationErrorList = js.Array[SnapshotErrorMessage]
  type BatchSnapshotOperationErrors = js.Array[SnapshotErrorMessage]
  type Boolean = scala.Boolean
  type BooleanOptional = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClusterDbRevisionsList = js.Array[ClusterDbRevision]
  type ClusterIamRoleList = js.Array[ClusterIamRole]
  type ClusterList = js.Array[Cluster]
  type ClusterNodesList = js.Array[ClusterNode]
  type ClusterParameterGroupStatusList = js.Array[ClusterParameterGroupStatus]
  type ClusterParameterStatusList = js.Array[ClusterParameterStatus]
  type ClusterSecurityGroupMembershipList = js.Array[ClusterSecurityGroupMembership]
  type ClusterSecurityGroupNameList = js.Array[String]
  type ClusterSecurityGroups = js.Array[ClusterSecurityGroup]
  type ClusterSubnetGroups = js.Array[ClusterSubnetGroup]
  type ClusterVersionList = js.Array[ClusterVersion]
  type DbGroupList = js.Array[String]
  type DeferredMaintenanceWindowsList = js.Array[DeferredMaintenanceWindow]
  type DeleteClusterSnapshotMessageList = js.Array[DeleteClusterSnapshotMessage]
  type Double = scala.Double
  type DoubleOptional = scala.Double
  type EC2SecurityGroupList = js.Array[EC2SecurityGroup]
  type EligibleTracksToUpdateList = js.Array[UpdateTarget]
  type EventCategoriesList = js.Array[String]
  type EventCategoriesMapList = js.Array[EventCategoriesMap]
  type EventInfoMapList = js.Array[EventInfoMap]
  type EventList = js.Array[Event]
  type EventSubscriptionsList = js.Array[EventSubscription]
  type HsmClientCertificateList = js.Array[HsmClientCertificate]
  type HsmConfigurationList = js.Array[HsmConfiguration]
  type IPRangeList = js.Array[IPRange]
  type IamRoleArnList = js.Array[String]
  type ImportTablesCompleted = js.Array[String]
  type ImportTablesInProgress = js.Array[String]
  type ImportTablesNotStarted = js.Array[String]
  type Integer = scala.Double
  type IntegerOptional = scala.Double
  type Long = scala.Double
  type LongOptional = scala.Double
  type OrderableClusterOptionsList = js.Array[OrderableClusterOption]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.static
    - awsDashSdkLib.awsDashSdkLibStrings.dynamic
    - java.lang.String
  */
  type ParameterApplyType = _ParameterApplyType | java.lang.String
  type ParameterGroupList = js.Array[ClusterParameterGroup]
  type ParametersList = js.Array[Parameter]
  type PendingActionsList = js.Array[String]
  type RecurringChargeList = js.Array[RecurringCharge]
  type ReservedNodeList = js.Array[ReservedNode]
  type ReservedNodeOfferingList = js.Array[ReservedNodeOffering]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Regular
    - awsDashSdkLib.awsDashSdkLibStrings.Upgradable
    - java.lang.String
  */
  type ReservedNodeOfferingType = _ReservedNodeOfferingType | java.lang.String
  type RestorableNodeTypeList = js.Array[String]
  type RevisionTargetsList = js.Array[RevisionTarget]
  type ScheduleDefinitionList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MODIFYING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type ScheduleState = _ScheduleState | java.lang.String
  type ScheduledSnapshotTimeList = js.Array[TStamp]
  type SensitiveString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SOURCE_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.TOTAL_SIZE
    - awsDashSdkLib.awsDashSdkLibStrings.CREATE_TIME
    - java.lang.String
  */
  type SnapshotAttributeToSortBy = _SnapshotAttributeToSortBy | java.lang.String
  type SnapshotCopyGrantList = js.Array[SnapshotCopyGrant]
  type SnapshotIdentifierList = js.Array[String]
  type SnapshotList = js.Array[Snapshot]
  type SnapshotScheduleList = js.Array[SnapshotSchedule]
  type SnapshotSortingEntityList = js.Array[SnapshotSortingEntity]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASC
    - awsDashSdkLib.awsDashSdkLibStrings.DESC
    - java.lang.String
  */
  type SortByOrder = _SortByOrder | java.lang.String
  type SourceIdsList = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.cluster
    - awsDashSdkLib.awsDashSdkLibStrings.`cluster-parameter-group`
    - awsDashSdkLib.awsDashSdkLibStrings.`cluster-security-group`
    - awsDashSdkLib.awsDashSdkLibStrings.`cluster-snapshot`
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  type String = java.lang.String
  type SubnetIdentifierList = js.Array[String]
  type SubnetList = js.Array[Subnet]
  type SupportedOperationList = js.Array[SupportedOperation]
  type SupportedPlatformsList = js.Array[SupportedPlatform]
  type TStamp = stdLib.Date
  type TableRestoreStatusList = js.Array[TableRestoreStatus]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.CANCELED
    - java.lang.String
  */
  type TableRestoreStatusType = _TableRestoreStatusType | java.lang.String
  type TagKeyList = js.Array[String]
  type TagList = js.Array[Tag]
  type TagValueList = js.Array[String]
  type TaggedResourceList = js.Array[TaggedResource]
  type TrackList = js.Array[MaintenanceTrack]
  type VpcSecurityGroupIdList = js.Array[String]
  type VpcSecurityGroupMembershipList = js.Array[VpcSecurityGroupMembership]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2012-12-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
