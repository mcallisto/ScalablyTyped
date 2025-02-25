package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the possibility to load information offered by a {@link XContentAccess} for several rows of a {@link ContentResultSet} with a single function
  * call.
  */
trait XFetchProviderForContentAccess
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the content identifier strings of the columns of the indicated rows
    * @param nRowStartPosition the starting row of the result set
    * @param nRowCount the count of rows
    * @param bDirection `TRUE` , if you want the rows to be read in the same order, as they are contained in the result set ( `TRUE` <-> forward step; `FALSE`
    * @returns {@link FetchResult.Rows} contains a sequence of anys. Each of these anys contains a string.
    */
  def fetchContentIdentifierStrings(nRowStartPosition: scala.Double, nRowCount: scala.Double, bDirection: scala.Boolean): FetchResult
  /**
    * returns the XContentIdentifiers of the columns of the indicated rows
    * @param nRowStartPosition the starting row of the result set
    * @param nRowCount the count of rows
    * @param bDirection `TRUE` , if you want the rows to be read in the same order, as they are contained in the result set ( `TRUE` <-> forward step; `FALSE`
    * @returns {@link FetchResult.Rows} contains a sequence of anys. Each of these anys contains an {@link XContentIdentifier} .
    */
  def fetchContentIdentifiers(nRowStartPosition: scala.Double, nRowCount: scala.Double, bDirection: scala.Boolean): FetchResult
  /**
    * returns the {@link XContent} s of the columns of the indicated rows
    * @param nRowStartPosition the starting row of the result set
    * @param nRowCount the count of rows
    * @param bDirection `TRUE` , if you want the rows to be read in the same order, as they are contained in the result set ( `TRUE` <-> forward step; `FALSE`
    * @returns {@link FetchResult.Rows} contains a sequence of anys. Each of these anys contains an {@link XContent} .
    */
  def fetchContents(nRowStartPosition: scala.Double, nRowCount: scala.Double, bDirection: scala.Boolean): FetchResult
}

object XFetchProviderForContentAccess {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    fetchContentIdentifierStrings: (scala.Double, scala.Double, scala.Boolean) => FetchResult,
    fetchContentIdentifiers: (scala.Double, scala.Double, scala.Boolean) => FetchResult,
    fetchContents: (scala.Double, scala.Double, scala.Boolean) => FetchResult,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XFetchProviderForContentAccess = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), fetchContentIdentifierStrings = js.Any.fromFunction3(fetchContentIdentifierStrings), fetchContentIdentifiers = js.Any.fromFunction3(fetchContentIdentifiers), fetchContents = js.Any.fromFunction3(fetchContents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XFetchProviderForContentAccess]
  }
}

