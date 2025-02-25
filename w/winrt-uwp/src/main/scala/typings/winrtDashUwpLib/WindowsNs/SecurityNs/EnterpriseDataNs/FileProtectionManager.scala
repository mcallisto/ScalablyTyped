package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to operations that manage files that are protected to an enterprise identity. */
@JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager")
@js.native
abstract class FileProtectionManager () extends js.Object

/* static members */
@JSGlobal("Windows.Security.EnterpriseData.FileProtectionManager")
@js.native
object FileProtectionManager extends js.Object {
  var isContainerAsync: js.Any = js.native
  /**
    * Replicate the file protection of one file onto another file.
    * @param source The source file, from which file protection is being copied.
    * @param target The target file, to which file protection is being copied.
    * @return When the call to this method completes successfully, it returns true if the file protection was copied, or false if there was an error.
    */
  def copyProtectionAsync(
    source: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem,
    target: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
    * Create an enterprise-protected file.
    * @param parentFolder The folder into which to create the enterprise protected file.
    * @param desiredName The desired name of the new enterprise protected file.
    * @param identity The enterprise identity. This is an email address or domain that is managed. Your app should use IsIdentityManaged to confirm that an email address or domain is managed.
    * @param collisionOption A CreationCollisionOption value that specifies what to do if desiredName already exists.
    * @return When the call to this method completes successfully, it returns a ProtectedFileCreateResult object representing the newly created protected file.
    */
  def createProtectedAndOpenAsync(
    parentFolder: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFolder,
    desiredName: java.lang.String,
    identity: java.lang.String,
    collisionOption: winrtDashUwpLib.WindowsNs.StorageNs.CreationCollisionOption
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedFileCreateResult] = js.native
  /**
    * Get the status of an enterprise-protected file.
    * @param source The file or folder for which protection status is being queried.
    * @return When the call to this method completes successfully, it returns a FileProtectionInfo object that contains the status of the file.
    */
  def getProtectionInfoAsync(source: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionInfo] = js.native
   /* unmapped type */ /**
    * Create an enterprise-protected file, and load it from a container file.
    * @param containerFile The enterprise protected file to be created and loaded.
    * @return When the call to this method completes successfully, it returns a ProtectedContainerImportResult object representing the newly created protected file.
    */
  def loadFileFromContainerAsync(containerFile: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedContainerImportResult
  ] = js.native
  /**
    * Create an enterprise-protected file in a specified storage item (such as a folder), and load it from a container file.
    * @param containerFile The enterprise protected file to be created and loaded.
    * @param target The storage item into which to create the enterprise protected file.
    * @return When the call to this method completes successfully, it returns a ProtectedContainerImportResult object representing the newly created protected file.
    */
  def loadFileFromContainerAsync(
    containerFile: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    target: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedContainerImportResult
  ] = js.native
  /**
    * Create an enterprise-protected file in a specified storage item (such as a folder), and load it from a container file.
    * @param containerFile The enterprise protected file to be created and loaded.
    * @param target The storage item into which to create the enterprise protected file.
    * @param collisionOption The enum value that determines how Windows responds if the created file has the same name as an existing item in the container's location.
    * @return When the call to this method completes successfully, it returns a ProtectedContainerImportResult object representing the newly created protected file.
    */
  def loadFileFromContainerAsync(
    containerFile: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    target: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem,
    collisionOption: winrtDashUwpLib.WindowsNs.StorageNs.NameCollisionOption
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedContainerImportResult
  ] = js.native
  /**
    * Protect the data in a file to an enterprise identity. The app can then use standard APIs to read or write from the file.
    * @param target The file to be protected.
    * @param identity The enterprise identity. This is an email address or domain that is managed. Use ProtectionPolicyManager.IsIdentityManaged to confirm that an email address or domain is managed before using the identity to protect a file.
    * @return When the call to this method completes successfully, it returns a FileProtectionInfo object that contains the status of the newly protected file.
    */
  def protectAsync(target: winrtDashUwpLib.WindowsNs.StorageNs.IStorageItem, identity: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.FileProtectionInfo] = js.native
  /**
    * Save an enterprise-protected file as a containerized version.
    * @param protectedFile The protected source file being copied.
    * @return When the call to this method completes successfully, it returns a ProtectedContainerExportResult object representing the newly created container file.
    */
  def saveFileAsContainerAsync(protectedFile: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedContainerExportResult
  ] = js.native
  /**
    * Save an enterprise-protected file as a containerized version, and share it with a specified list of user identities.
    * @param protectedFile The protected source file being copied.
    * @param sharedWithIdentities A collection of strings representing the user identities to share the containerized file with. For example, email recipients.
    * @return When the call to this method completes successfully, it returns a ProtectedContainerExportResult object representing the newly created container file.
    */
  def saveFileAsContainerAsync(
    protectedFile: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    sharedWithIdentities: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs.ProtectedContainerExportResult
  ] = js.native
}

