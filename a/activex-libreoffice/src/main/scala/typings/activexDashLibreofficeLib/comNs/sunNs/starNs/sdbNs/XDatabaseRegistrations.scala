package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the application-wide registered databases.
  *
  * This interface provides a mere wrapper around the respective configuration data, this way hiding the concrete configuration structure from its
  * clients. You should, if possible at all, use this interface, instead of modifying or querying the configuration data directly.
  * @since OOo 3.3
  */
trait XDatabaseRegistrations extends js.Object {
  /** returns the names of all registered databases */
  val RegistrationNames: stdLib.SafeArray[java.lang.String]
  /** registers a listener which is notified of changes in the registered databases */
  def addDatabaseRegistrationsListener(Listener: XDatabaseRegistrationsListener): scala.Unit
  /**
    * changes the location of a given database registration
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty, or the given location is invalid.
    * @throws com::sun::star::container::NoSuchElementException if there is no database registered under this name
    * @throws com::sun::star::lang::IllegalAccessException if the registration data for this database is read-only
    */
  def changeDatabaseLocation(Name: java.lang.String, NewLocation: java.lang.String): scala.Unit
  /**
    * returns the location of the database registered under the given name
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty
    * @throws com::sun::star::container::NoSuchElementException if there is no database registered under this name
    */
  def getDatabaseLocation(Name: java.lang.String): java.lang.String
  /** returns the names of all registered databases */
  def getRegistrationNames(): stdLib.SafeArray[java.lang.String]
  /**
    * determines whether a database is registered under the given name.
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty
    */
  def hasRegisteredDatabase(Name: java.lang.String): scala.Boolean
  /**
    * determines whether the registration data for a database given by name is read-only.
    *
    * In this case, attempts to revoke this registration will fail.
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty
    * @throws com::sun::star::container::NoSuchElementException if there is no database registered under this name
    */
  def isDatabaseRegistrationReadOnly(Name: java.lang.String): scala.Boolean
  /**
    * registers a database, given by location, under a given name
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty, or the given location is invalid.
    * @throws com::sun::star::container::ElementExistException if there already is a databases registered under the given name.
    */
  def registerDatabaseLocation(Name: java.lang.String, Location: java.lang.String): scala.Unit
  /** revokes a previously registered listener */
  def removeDatabaseRegistrationsListener(Listener: XDatabaseRegistrationsListener): scala.Unit
  /**
    * revokes the registration of a database, given by name
    * @throws com::sun::star::lang::IllegalArgumentException if the given name is empty
    * @throws com::sun::star::container::NoSuchElementException if there is no database registered under this name
    * @throws com::sun::star::lang::IllegalAccessException if the registration data for this database is read-only
    */
  def revokeDatabaseLocation(Name: java.lang.String): scala.Unit
}

object XDatabaseRegistrations {
  @scala.inline
  def apply(
    RegistrationNames: stdLib.SafeArray[java.lang.String],
    addDatabaseRegistrationsListener: XDatabaseRegistrationsListener => scala.Unit,
    changeDatabaseLocation: (java.lang.String, java.lang.String) => scala.Unit,
    getDatabaseLocation: java.lang.String => java.lang.String,
    getRegistrationNames: () => stdLib.SafeArray[java.lang.String],
    hasRegisteredDatabase: java.lang.String => scala.Boolean,
    isDatabaseRegistrationReadOnly: java.lang.String => scala.Boolean,
    registerDatabaseLocation: (java.lang.String, java.lang.String) => scala.Unit,
    removeDatabaseRegistrationsListener: XDatabaseRegistrationsListener => scala.Unit,
    revokeDatabaseLocation: java.lang.String => scala.Unit
  ): XDatabaseRegistrations = {
    val __obj = js.Dynamic.literal(RegistrationNames = RegistrationNames, addDatabaseRegistrationsListener = js.Any.fromFunction1(addDatabaseRegistrationsListener), changeDatabaseLocation = js.Any.fromFunction2(changeDatabaseLocation), getDatabaseLocation = js.Any.fromFunction1(getDatabaseLocation), getRegistrationNames = js.Any.fromFunction0(getRegistrationNames), hasRegisteredDatabase = js.Any.fromFunction1(hasRegisteredDatabase), isDatabaseRegistrationReadOnly = js.Any.fromFunction1(isDatabaseRegistrationReadOnly), registerDatabaseLocation = js.Any.fromFunction2(registerDatabaseLocation), removeDatabaseRegistrationsListener = js.Any.fromFunction1(removeDatabaseRegistrationsListener), revokeDatabaseLocation = js.Any.fromFunction1(revokeDatabaseLocation))
  
    __obj.asInstanceOf[XDatabaseRegistrations]
  }
}

