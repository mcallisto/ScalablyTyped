package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveItem extends BaseItem {
  var analytics: js.UndefOr[ItemAnalytics] = js.undefined
  /** Audio metadata, if the item is an audio file. Read-only. */
  var audio: js.UndefOr[Audio] = js.undefined
  /** An eTag for the content of the item. This eTag is not changed if only the metadata is changed. Note This property is not returned if the item is a folder. Read-only. */
  var cTag: js.UndefOr[java.lang.String] = js.undefined
  /** Collection containing Item objects for the immediate children of Item. Only items representing folders have children. Read-only. Nullable. */
  var children: js.UndefOr[js.Array[DriveItem]] = js.undefined
  /** The content stream, if the item represents a file. */
  var content: js.UndefOr[js.Any] = js.undefined
  /** Information about the deleted state of the item. Read-only. */
  var deleted: js.UndefOr[Deleted] = js.undefined
  /** File metadata, if the item is a file. Read-only. */
  var file: js.UndefOr[File] = js.undefined
  /** File system information on client. Read-write. */
  var fileSystemInfo: js.UndefOr[FileSystemInfo] = js.undefined
  /** Folder metadata, if the item is a folder. Read-only. */
  var folder: js.UndefOr[Folder] = js.undefined
  /** Image metadata, if the item is an image. Read-only. */
  var image: js.UndefOr[Image] = js.undefined
  /** For drives in SharePoint, the associated document library list item. Read-only. Nullable. */
  var listItem: js.UndefOr[ListItem] = js.undefined
  /** Location metadata, if the item has location data. Read-only. */
  var location: js.UndefOr[GeoCoordinates] = js.undefined
  /** If present, indicates that this item is a package instead of a folder or file. Packages are treated like files in some contexts and folders in others. Read-only. */
  var `package`: js.UndefOr[Package] = js.undefined
  /** The set of permissions for the item. Read-only. Nullable. */
  var permissions: js.UndefOr[js.Array[Permission]] = js.undefined
  /** Photo metadata, if the item is a photo. Read-only. */
  var photo: js.UndefOr[Photo] = js.undefined
  /** Provides information about the published or checked-out state of an item, in locations that support such actions. This property is not returned by default. Read-only. */
  var publication: js.UndefOr[PublicationFacet] = js.undefined
  /** Remote item data, if the item is shared from a drive other than the one being accessed. Read-only. */
  var remoteItem: js.UndefOr[RemoteItem] = js.undefined
  /** If this property is non-null, it indicates that the driveItem is the top-most driveItem in the drive. */
  var root: js.UndefOr[Root] = js.undefined
  /** Search metadata, if the item is from a search result. Read-only. */
  var searchResult: js.UndefOr[SearchResult] = js.undefined
  /** Indicates that the item has been shared with others and provides information about the shared state of the item. Read-only. */
  var shared: js.UndefOr[Shared] = js.undefined
  /** Returns identifiers useful for SharePoint REST compatibility. Read-only. */
  var sharepointIds: js.UndefOr[SharepointIds] = js.undefined
  /** Size of the item in bytes. Read-only. */
  var size: js.UndefOr[scala.Double] = js.undefined
  /** If the current item is also available as a special folder, this facet is returned. Read-only. */
  var specialFolder: js.UndefOr[SpecialFolder] = js.undefined
  /** The set of subscriptions on the item. Only supported on the root of a drive. */
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.undefined
  /** Collection containing [ThumbnailSet][] objects associated with the item. For more info, see [getting thumbnails][]. Read-only. Nullable. */
  var thumbnails: js.UndefOr[js.Array[ThumbnailSet]] = js.undefined
  /** The list of previous versions of the item. For more info, see [getting previous versions][]. Read-only. Nullable. */
  var versions: js.UndefOr[js.Array[DriveItemVersion]] = js.undefined
  /** Video metadata, if the item is a video. Read-only. */
  var video: js.UndefOr[Video] = js.undefined
  /** WebDAV compatible URL for the item. */
  var webDavUrl: js.UndefOr[java.lang.String] = js.undefined
  /** For files that are Excel spreadsheets, accesses the workbook API to work with the spreadsheet's contents. Nullable. */
  var workbook: js.UndefOr[Workbook] = js.undefined
}

object DriveItem {
  @scala.inline
  def apply(
    analytics: ItemAnalytics = null,
    audio: Audio = null,
    cTag: java.lang.String = null,
    children: js.Array[DriveItem] = null,
    content: js.Any = null,
    createdBy: IdentitySet = null,
    createdByUser: User = null,
    createdDateTime: java.lang.String = null,
    deleted: Deleted = null,
    description: java.lang.String = null,
    eTag: java.lang.String = null,
    file: File = null,
    fileSystemInfo: FileSystemInfo = null,
    folder: Folder = null,
    id: java.lang.String = null,
    image: Image = null,
    lastModifiedBy: IdentitySet = null,
    lastModifiedByUser: User = null,
    lastModifiedDateTime: java.lang.String = null,
    listItem: ListItem = null,
    location: GeoCoordinates = null,
    name: java.lang.String = null,
    `package`: Package = null,
    parentReference: ItemReference = null,
    permissions: js.Array[Permission] = null,
    photo: Photo = null,
    publication: PublicationFacet = null,
    remoteItem: RemoteItem = null,
    root: Root = null,
    searchResult: SearchResult = null,
    shared: Shared = null,
    sharepointIds: SharepointIds = null,
    size: scala.Int | scala.Double = null,
    specialFolder: SpecialFolder = null,
    subscriptions: js.Array[Subscription] = null,
    thumbnails: js.Array[ThumbnailSet] = null,
    versions: js.Array[DriveItemVersion] = null,
    video: Video = null,
    webDavUrl: java.lang.String = null,
    webUrl: java.lang.String = null,
    workbook: Workbook = null
  ): DriveItem = {
    val __obj = js.Dynamic.literal()
    if (analytics != null) __obj.updateDynamic("analytics")(analytics)
    if (audio != null) __obj.updateDynamic("audio")(audio)
    if (cTag != null) __obj.updateDynamic("cTag")(cTag)
    if (children != null) __obj.updateDynamic("children")(children)
    if (content != null) __obj.updateDynamic("content")(content)
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (createdByUser != null) __obj.updateDynamic("createdByUser")(createdByUser)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (deleted != null) __obj.updateDynamic("deleted")(deleted)
    if (description != null) __obj.updateDynamic("description")(description)
    if (eTag != null) __obj.updateDynamic("eTag")(eTag)
    if (file != null) __obj.updateDynamic("file")(file)
    if (fileSystemInfo != null) __obj.updateDynamic("fileSystemInfo")(fileSystemInfo)
    if (folder != null) __obj.updateDynamic("folder")(folder)
    if (id != null) __obj.updateDynamic("id")(id)
    if (image != null) __obj.updateDynamic("image")(image)
    if (lastModifiedBy != null) __obj.updateDynamic("lastModifiedBy")(lastModifiedBy)
    if (lastModifiedByUser != null) __obj.updateDynamic("lastModifiedByUser")(lastModifiedByUser)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (listItem != null) __obj.updateDynamic("listItem")(listItem)
    if (location != null) __obj.updateDynamic("location")(location)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (parentReference != null) __obj.updateDynamic("parentReference")(parentReference)
    if (permissions != null) __obj.updateDynamic("permissions")(permissions)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    if (publication != null) __obj.updateDynamic("publication")(publication)
    if (remoteItem != null) __obj.updateDynamic("remoteItem")(remoteItem)
    if (root != null) __obj.updateDynamic("root")(root)
    if (searchResult != null) __obj.updateDynamic("searchResult")(searchResult)
    if (shared != null) __obj.updateDynamic("shared")(shared)
    if (sharepointIds != null) __obj.updateDynamic("sharepointIds")(sharepointIds)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (specialFolder != null) __obj.updateDynamic("specialFolder")(specialFolder)
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    if (versions != null) __obj.updateDynamic("versions")(versions)
    if (video != null) __obj.updateDynamic("video")(video)
    if (webDavUrl != null) __obj.updateDynamic("webDavUrl")(webDavUrl)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    if (workbook != null) __obj.updateDynamic("workbook")(workbook)
    __obj.asInstanceOf[DriveItem]
  }
}

