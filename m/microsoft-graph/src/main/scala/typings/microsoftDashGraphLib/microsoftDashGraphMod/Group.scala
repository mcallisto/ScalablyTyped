package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends DirectoryObject {
  /** The list of users or groups that are allowed to create post's or calendar events in this group. If this list is non-empty then only users or groups listed here are allowed to post. */
  var acceptedSenders: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /** Indicates if people external to the organization can send messages to the group. Default value is false. Returned only on $select. */
  var allowExternalSenders: js.UndefOr[scala.Boolean] = js.undefined
  /** The licenses that are assigned to the group. Returned only on $select. Read-only. */
  var assignedLicenses: js.UndefOr[js.Array[AssignedLicense]] = js.undefined
  /**
    * Indicates if new members added to the group will be auto-subscribed to receive email notifications. You can set this property in a PATCH request for the group;
    * do not set it in the initial POST request that creates the group. Default value is false. Returned only on $select.
    */
  var autoSubscribeNewMembers: js.UndefOr[scala.Boolean] = js.undefined
  /** The group's calendar. Read-only. */
  var calendar: js.UndefOr[Calendar] = js.undefined
  /** The calendar view for the calendar. Read-only. */
  var calendarView: js.UndefOr[js.Array[Event]] = js.undefined
  /**
    * Describes a classification for the group (such as low, medium or high business impact).
    * Valid values for this property are defined by creating a ClassificationList setting value, based on the template definition.Returned by default.
    */
  var classification: js.UndefOr[java.lang.String] = js.undefined
  /** The group's conversations. */
  var conversations: js.UndefOr[js.Array[Conversation]] = js.undefined
  /**
    * Timestamp of when the group was created. The value cannot be modified and is automatically populated when the group is created.
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
    */
  var createdDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** The user (or application) that created the group. NOTE: This is not set if the user is an administrator. Read-only. */
  var createdOnBehalfOf: js.UndefOr[DirectoryObject] = js.undefined
  /** An optional description for the group. Returned by default. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The display name for the group. This property is required when a group is created and cannot be cleared during updates. Returned by default. Supports $filter and $orderby. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The group's default drive. Read-only. */
  var drive: js.UndefOr[Drive] = js.undefined
  /** The group's drives. Read-only. */
  var drives: js.UndefOr[js.Array[Drive]] = js.undefined
  /** The group's calendar events. */
  var events: js.UndefOr[js.Array[Event]] = js.undefined
  /** The collection of open extensions defined for the group. Read-only. Nullable. */
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  /** The collection of lifecycle policies for this group. Read-only. Nullable. */
  var groupLifecyclePolicies: js.UndefOr[js.Array[GroupLifecyclePolicy]] = js.undefined
  /**
    * Specifies the type of group to create. Possible values are Unified to create an Office 365 group, or DynamicMembership for dynamic groups.
    * For all other group types, like security-enabled groups and email-enabled security groups, do not set this property. Returned by default. Supports $filter.
    */
  var groupTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Indicates whether there are members in this group that have license errors from its group-based license assignment. This property is never returned on a GET operation.
    * You can use it as a $filter argument to get groups that have members with license errors (that is, filter for this property being true). See an example.
    */
  var hasMembersWithLicenseErrors: js.UndefOr[scala.Boolean] = js.undefined
  var isArchived: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether the signed-in user is subscribed to receive email conversations. Default value is true. Returned only on $select. */
  var isSubscribedByMail: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates status of the group license assignment to all members of the group. Default value is false. Read-only.
    * Possible values: QueuedForProcessing, ProcessingInProgress, and ProcessingComplete.Returned only on $select. Read-only.
    */
  var licenseProcessingState: js.UndefOr[LicenseProcessingState] = js.undefined
  /** The SMTP address for the group, for example, 'serviceadmins@contoso.onmicrosoft.com'. Returned by default. Read-only. Supports $filter. */
  var mail: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies whether the group is mail-enabled. If the securityEnabled property is also true, the group is a mail-enabled security group;
    * otherwise, the group is a Microsoft Exchange distribution group. Returned by default.
    */
  var mailEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** The mail alias for the group, unique in the organization. This property must be specified when a group is created. Returned by default. Supports $filter. */
  var mailNickname: js.UndefOr[java.lang.String] = js.undefined
  /** Groups that this group is a member of. HTTP Methods: GET (supported for all groups). Read-only. Nullable. */
  var memberOf: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * Users and groups that are members of this group. HTTP Methods: GET (supported for all groups), POST (supported for Office 365 groups,
    * security groups and mail-enabled security groups), DELETE (supported for Office 365 groups and security groups) Nullable.
    */
  var members: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /** A list of group members with license errors from this group-based license assignment. Read-only. */
  var membersWithLicenseErrors: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * Indicates the last time at which the group was synced with the on-premises directory.The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only. Supports $filter.
    */
  var onPremisesLastSyncDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** Errors when using Microsoft synchronization product during provisioning. Returned by default. */
  var onPremisesProvisioningErrors: js.UndefOr[js.Array[OnPremisesProvisioningError]] = js.undefined
  /** Contains the on-premises security identifier (SID) for the group that was synchronized from on-premises to the cloud. Returned by default. Read-only. */
  var onPremisesSecurityIdentifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * true if this group is synced from an on-premises directory; false if this group was originally synced from an on-premises directory
    * but is no longer synced; null if this object has never been synced from an on-premises directory (default). Returned by default. Read-only. Supports $filter.
    */
  var onPremisesSyncEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Read-only. */
  var onenote: js.UndefOr[Onenote] = js.undefined
  /**
    * The owners of the group. The owners are a set of non-admin users who are allowed to modify this object. Limited to 10 owners.
    * HTTP Methods: GET (supported for all groups), POST (supported for Office 365 groups, security groups and mail-enabled security groups),
    * DELETE (supported for Office 365 groups and security groups). Nullable.
    */
  var owners: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /** The group's profile photo */
  var photo: js.UndefOr[ProfilePhoto] = js.undefined
  /** The profile photos owned by the group. Read-only. Nullable. */
  var photos: js.UndefOr[js.Array[ProfilePhoto]] = js.undefined
  /** Entry-point to Planner resource that might exist for a Unified Group. */
  var planner: js.UndefOr[PlannerGroup] = js.undefined
  /**
    * Email addresses for the group that direct to the same group mailbox.
    * For example: ['SMTP: bob@contoso.com', 'smtp: bob@sales.contoso.com']. The any operator is required to filter expressions on multi-valued properties.
    * Returned by default. Read-only. Not nullable. Supports $filter.
    */
  var proxyAddresses: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The list of users or groups that are not allowed to create posts or calendar events in this group. Nullable */
  var rejectedSenders: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /**
    * Timestamp of when the group was last renewed. This cannot be modified directly and is only updated via the renew service action.
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time.
    * For example, midnight UTC on Jan 1, 2014 would look like this: '2014-01-01T00:00:00Z'. Returned by default. Read-only.
    */
  var renewedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies whether the group is a security group. If the mailEnabled property is also true, the group is a mail-enabled security group;
    * otherwise it is a security group. Must be false for Office 365 groups. Returned by default. Supports $filter.
    */
  var securityEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Read-only. Nullable. */
  var settings: js.UndefOr[js.Array[GroupSetting]] = js.undefined
  /** The list of SharePoint sites in this group. Access the default site with /sites/root. */
  var sites: js.UndefOr[js.Array[Site]] = js.undefined
  var team: js.UndefOr[Team] = js.undefined
  /** The group's conversation threads. Nullable. */
  var threads: js.UndefOr[js.Array[ConversationThread]] = js.undefined
  var transitiveMemberOf: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  var transitiveMembers: js.UndefOr[js.Array[DirectoryObject]] = js.undefined
  /** Count of conversations that have received new posts since the signed-in user last visited the group. Returned only on $select. */
  var unseenCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies the visibility of an Office 365 group. Possible values are: private, public, or hiddenmembership; blank values are treated as public.
    * See group visibility options to learn more.Visibility can be set only when a group is created; it is not editable.Visibility is supported only for unified groups;
    * it is not supported for security groups. Returned by default.
    */
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

object Group {
  @scala.inline
  def apply(
    acceptedSenders: js.Array[DirectoryObject] = null,
    allowExternalSenders: js.UndefOr[scala.Boolean] = js.undefined,
    assignedLicenses: js.Array[AssignedLicense] = null,
    autoSubscribeNewMembers: js.UndefOr[scala.Boolean] = js.undefined,
    calendar: Calendar = null,
    calendarView: js.Array[Event] = null,
    classification: java.lang.String = null,
    conversations: js.Array[Conversation] = null,
    createdDateTime: java.lang.String = null,
    createdOnBehalfOf: DirectoryObject = null,
    deletedDateTime: java.lang.String = null,
    description: java.lang.String = null,
    displayName: java.lang.String = null,
    drive: Drive = null,
    drives: js.Array[Drive] = null,
    events: js.Array[Event] = null,
    extensions: js.Array[Extension] = null,
    groupLifecyclePolicies: js.Array[GroupLifecyclePolicy] = null,
    groupTypes: js.Array[java.lang.String] = null,
    hasMembersWithLicenseErrors: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    isArchived: js.UndefOr[scala.Boolean] = js.undefined,
    isSubscribedByMail: js.UndefOr[scala.Boolean] = js.undefined,
    licenseProcessingState: LicenseProcessingState = null,
    mail: java.lang.String = null,
    mailEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    mailNickname: java.lang.String = null,
    memberOf: js.Array[DirectoryObject] = null,
    members: js.Array[DirectoryObject] = null,
    membersWithLicenseErrors: js.Array[DirectoryObject] = null,
    onPremisesLastSyncDateTime: java.lang.String = null,
    onPremisesProvisioningErrors: js.Array[OnPremisesProvisioningError] = null,
    onPremisesSecurityIdentifier: java.lang.String = null,
    onPremisesSyncEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    onenote: Onenote = null,
    owners: js.Array[DirectoryObject] = null,
    photo: ProfilePhoto = null,
    photos: js.Array[ProfilePhoto] = null,
    planner: PlannerGroup = null,
    proxyAddresses: js.Array[java.lang.String] = null,
    rejectedSenders: js.Array[DirectoryObject] = null,
    renewedDateTime: java.lang.String = null,
    securityEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    settings: js.Array[GroupSetting] = null,
    sites: js.Array[Site] = null,
    team: Team = null,
    threads: js.Array[ConversationThread] = null,
    transitiveMemberOf: js.Array[DirectoryObject] = null,
    transitiveMembers: js.Array[DirectoryObject] = null,
    unseenCount: scala.Int | scala.Double = null,
    visibility: java.lang.String = null
  ): Group = {
    val __obj = js.Dynamic.literal()
    if (acceptedSenders != null) __obj.updateDynamic("acceptedSenders")(acceptedSenders)
    if (!js.isUndefined(allowExternalSenders)) __obj.updateDynamic("allowExternalSenders")(allowExternalSenders)
    if (assignedLicenses != null) __obj.updateDynamic("assignedLicenses")(assignedLicenses)
    if (!js.isUndefined(autoSubscribeNewMembers)) __obj.updateDynamic("autoSubscribeNewMembers")(autoSubscribeNewMembers)
    if (calendar != null) __obj.updateDynamic("calendar")(calendar)
    if (calendarView != null) __obj.updateDynamic("calendarView")(calendarView)
    if (classification != null) __obj.updateDynamic("classification")(classification)
    if (conversations != null) __obj.updateDynamic("conversations")(conversations)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (createdOnBehalfOf != null) __obj.updateDynamic("createdOnBehalfOf")(createdOnBehalfOf)
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    if (drive != null) __obj.updateDynamic("drive")(drive)
    if (drives != null) __obj.updateDynamic("drives")(drives)
    if (events != null) __obj.updateDynamic("events")(events)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (groupLifecyclePolicies != null) __obj.updateDynamic("groupLifecyclePolicies")(groupLifecyclePolicies)
    if (groupTypes != null) __obj.updateDynamic("groupTypes")(groupTypes)
    if (!js.isUndefined(hasMembersWithLicenseErrors)) __obj.updateDynamic("hasMembersWithLicenseErrors")(hasMembersWithLicenseErrors)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isArchived)) __obj.updateDynamic("isArchived")(isArchived)
    if (!js.isUndefined(isSubscribedByMail)) __obj.updateDynamic("isSubscribedByMail")(isSubscribedByMail)
    if (licenseProcessingState != null) __obj.updateDynamic("licenseProcessingState")(licenseProcessingState)
    if (mail != null) __obj.updateDynamic("mail")(mail)
    if (!js.isUndefined(mailEnabled)) __obj.updateDynamic("mailEnabled")(mailEnabled)
    if (mailNickname != null) __obj.updateDynamic("mailNickname")(mailNickname)
    if (memberOf != null) __obj.updateDynamic("memberOf")(memberOf)
    if (members != null) __obj.updateDynamic("members")(members)
    if (membersWithLicenseErrors != null) __obj.updateDynamic("membersWithLicenseErrors")(membersWithLicenseErrors)
    if (onPremisesLastSyncDateTime != null) __obj.updateDynamic("onPremisesLastSyncDateTime")(onPremisesLastSyncDateTime)
    if (onPremisesProvisioningErrors != null) __obj.updateDynamic("onPremisesProvisioningErrors")(onPremisesProvisioningErrors)
    if (onPremisesSecurityIdentifier != null) __obj.updateDynamic("onPremisesSecurityIdentifier")(onPremisesSecurityIdentifier)
    if (!js.isUndefined(onPremisesSyncEnabled)) __obj.updateDynamic("onPremisesSyncEnabled")(onPremisesSyncEnabled)
    if (onenote != null) __obj.updateDynamic("onenote")(onenote)
    if (owners != null) __obj.updateDynamic("owners")(owners)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (planner != null) __obj.updateDynamic("planner")(planner)
    if (proxyAddresses != null) __obj.updateDynamic("proxyAddresses")(proxyAddresses)
    if (rejectedSenders != null) __obj.updateDynamic("rejectedSenders")(rejectedSenders)
    if (renewedDateTime != null) __obj.updateDynamic("renewedDateTime")(renewedDateTime)
    if (!js.isUndefined(securityEnabled)) __obj.updateDynamic("securityEnabled")(securityEnabled)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (sites != null) __obj.updateDynamic("sites")(sites)
    if (team != null) __obj.updateDynamic("team")(team)
    if (threads != null) __obj.updateDynamic("threads")(threads)
    if (transitiveMemberOf != null) __obj.updateDynamic("transitiveMemberOf")(transitiveMemberOf)
    if (transitiveMembers != null) __obj.updateDynamic("transitiveMembers")(transitiveMembers)
    if (unseenCount != null) __obj.updateDynamic("unseenCount")(unseenCount.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[Group]
  }
}

