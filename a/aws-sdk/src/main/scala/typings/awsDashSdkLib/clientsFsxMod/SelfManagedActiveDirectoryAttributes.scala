package typings
package awsDashSdkLib.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelfManagedActiveDirectoryAttributes extends js.Object {
  /**
    * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
    */
  var DnsIps: js.UndefOr[DnsIps] = js.undefined
  /**
    * The fully qualified domain name of the self-managed AD directory.
    */
  var DomainName: js.UndefOr[ActiveDirectoryFullyQualifiedName] = js.undefined
  /**
    * The name of the domain group whose members have administrative privileges for the FSx file system.
    */
  var FileSystemAdministratorsGroup: js.UndefOr[FileSystemAdministratorsGroupName] = js.undefined
  /**
    * The fully qualified distinguished name of the organizational unit within the self-managed AD directory to which the Windows File Server instance is joined.
    */
  var OrganizationalUnitDistinguishedName: js.UndefOr[OrganizationalUnitDistinguishedName] = js.undefined
  /**
    * The user name for the service account on your self-managed AD domain that FSx uses to join to your AD domain.
    */
  var UserName: js.UndefOr[DirectoryUserName] = js.undefined
}

object SelfManagedActiveDirectoryAttributes {
  @scala.inline
  def apply(
    DnsIps: DnsIps = null,
    DomainName: ActiveDirectoryFullyQualifiedName = null,
    FileSystemAdministratorsGroup: FileSystemAdministratorsGroupName = null,
    OrganizationalUnitDistinguishedName: OrganizationalUnitDistinguishedName = null,
    UserName: DirectoryUserName = null
  ): SelfManagedActiveDirectoryAttributes = {
    val __obj = js.Dynamic.literal()
    if (DnsIps != null) __obj.updateDynamic("DnsIps")(DnsIps)
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    if (FileSystemAdministratorsGroup != null) __obj.updateDynamic("FileSystemAdministratorsGroup")(FileSystemAdministratorsGroup)
    if (OrganizationalUnitDistinguishedName != null) __obj.updateDynamic("OrganizationalUnitDistinguishedName")(OrganizationalUnitDistinguishedName)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[SelfManagedActiveDirectoryAttributes]
  }
}

