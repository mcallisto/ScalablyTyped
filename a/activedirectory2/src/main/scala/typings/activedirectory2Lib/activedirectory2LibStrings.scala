package typings
package activedirectory2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object activedirectory2LibStrings {
  @js.native
  sealed trait all
    extends activedirectory2Lib.activedirectory2Mod.MembershipType
  
  @js.native
  sealed trait base extends js.Object
  
  @js.native
  sealed trait cn
    extends activedirectory2Lib.activedirectory2Mod.GroupAttributes
       with activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait comment
    extends activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait description
    extends activedirectory2Lib.activedirectory2Mod.GroupAttributes
       with activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait displayName
    extends activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait distinguishedName
    extends activedirectory2Lib.activedirectory2Mod.GroupAttributes
       with activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait dn extends js.Object
  
  @js.native
  sealed trait employeeID
    extends activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait givenName
    extends activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait group
    extends activedirectory2Lib.activedirectory2Mod.MembershipType
  
  @js.native
  sealed trait initials
    extends activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait `ldaps?://DOT*/CN=Configuration,DOT*` extends js.Object
  
  @js.native
  sealed trait `ldaps?://DomainDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*` extends js.Object
  
  @js.native
  sealed trait `ldaps?://ForestDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*` extends js.Object
  
  @js.native
  sealed trait lockoutTime
    extends activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait mail
    extends activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait objectCategory
    extends activedirectory2Lib.activedirectory2Mod.GroupAttributes
  
  @js.native
  sealed trait one extends js.Object
  
  @js.native
  sealed trait pwdLastSet
    extends activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait sAMAccountName
    extends activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait sn
    extends activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait sub extends js.Object
  
  @js.native
  sealed trait user
    extends activedirectory2Lib.activedirectory2Mod.MembershipType
  
  @js.native
  sealed trait userAccountControl
    extends activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait userPrincipalName
    extends activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @js.native
  sealed trait whenCreated
    extends activedirectory2Lib.activedirectory2Mod.UserAttributes
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  @scala.inline
  def cn: cn = "cn".asInstanceOf[cn]
  @scala.inline
  def comment: comment = "comment".asInstanceOf[comment]
  @scala.inline
  def description: description = "description".asInstanceOf[description]
  @scala.inline
  def displayName: displayName = "displayName".asInstanceOf[displayName]
  @scala.inline
  def distinguishedName: distinguishedName = "distinguishedName".asInstanceOf[distinguishedName]
  @scala.inline
  def dn: dn = "dn".asInstanceOf[dn]
  @scala.inline
  def employeeID: employeeID = "employeeID".asInstanceOf[employeeID]
  @scala.inline
  def givenName: givenName = "givenName".asInstanceOf[givenName]
  @scala.inline
  def group: group = "group".asInstanceOf[group]
  @scala.inline
  def initials: initials = "initials".asInstanceOf[initials]
  @scala.inline
  def `ldaps?://DOT*/CN=Configuration,DOT*`: `ldaps?://DOT*/CN=Configuration,DOT*` = "ldaps?://.*/CN=Configuration,.*".asInstanceOf[`ldaps?://DOT*/CN=Configuration,DOT*`]
  @scala.inline
  def `ldaps?://DomainDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`: `ldaps?://DomainDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*` = "ldaps?://DomainDnsZones\\..*/.*".asInstanceOf[`ldaps?://DomainDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`]
  @scala.inline
  def `ldaps?://ForestDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`: `ldaps?://ForestDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*` = "ldaps?://ForestDnsZones\\..*/.*".asInstanceOf[`ldaps?://ForestDnsZonesBACKSLASHBACKSLASHDOTDOT*/DOT*`]
  @scala.inline
  def lockoutTime: lockoutTime = "lockoutTime".asInstanceOf[lockoutTime]
  @scala.inline
  def mail: mail = "mail".asInstanceOf[mail]
  @scala.inline
  def objectCategory: objectCategory = "objectCategory".asInstanceOf[objectCategory]
  @scala.inline
  def one: one = "one".asInstanceOf[one]
  @scala.inline
  def pwdLastSet: pwdLastSet = "pwdLastSet".asInstanceOf[pwdLastSet]
  @scala.inline
  def sAMAccountName: sAMAccountName = "sAMAccountName".asInstanceOf[sAMAccountName]
  @scala.inline
  def sn: sn = "sn".asInstanceOf[sn]
  @scala.inline
  def sub: sub = "sub".asInstanceOf[sub]
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  @scala.inline
  def userAccountControl: userAccountControl = "userAccountControl".asInstanceOf[userAccountControl]
  @scala.inline
  def userPrincipalName: userPrincipalName = "userPrincipalName".asInstanceOf[userPrincipalName]
  @scala.inline
  def whenCreated: whenCreated = "whenCreated".asInstanceOf[whenCreated]
}

