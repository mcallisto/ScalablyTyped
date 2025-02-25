package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides locale-sensitive collation algorithms for string comparison. */
trait XCollator
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Compare 2 strings in specific locale and algorithm.
    * @param aStr1 First string.
    * @param aStr2 Second string.
    * @returns 1 if the first string is greater than the second string ;  0 if the first string is equal to the second string ;  -1 if the first string is less
    */
  def compareString(aStr1: java.lang.String, aStr2: java.lang.String): scala.Double
  /**
    * Compare 2 substrings in specific locale and algorithm.
    * @param aStr1 First string.
    * @param nOff1 Offset (from 0) of the first string.
    * @param nLen1 Length (from offset) of the first substring.
    * @param aStr2 Second string
    * @param nOff2 Offset (from 0) of the second string.
    * @param nLen2 Length (from offset) of the second substring.
    * @returns 1 if the first string is greater than the second string ;  0 if the first string is equal to the second string ;  -1 if the first string is less
    */
  def compareSubstring(
    aStr1: java.lang.String,
    nOff1: scala.Double,
    nLen1: scala.Double,
    aStr2: java.lang.String,
    nOff2: scala.Double,
    nLen2: scala.Double
  ): scala.Double
  /**
    * List all collator algorithms for a given locale.
    * @param aLocale The locale for which to list algorithms.
    * @returns A sequence of algorithm names.
    */
  def listCollatorAlgorithms(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): stdLib.SafeArray[java.lang.String]
  /**
    * List all end user collator options for a given algorithm.
    * @param aAlgorithmName The algorithm name for this collator.
    * @returns An array of end user options available for the algorithm.
    */
  def listCollatorOptions(aAlgorithmName: java.lang.String): stdLib.SafeArray[scala.Double]
  /**
    * Load a particular collator algorithm for the locale.
    * @param aAlgorithmName The algorithm to load.
    * @param aLocale The locale for this collator.
    * @param nCollatorOptions A mask of {@link CollatorOptions} .
    * @returns Returns 0 when loading was successful, otherwise throws runtime exception.
    */
  def loadCollatorAlgorithm(
    aAlgorithmName: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nCollatorOptions: scala.Double
  ): scala.Double
  /**
    * Load a collator algorithm with options chosen by end user.
    * @param aAlgorithmName The algorithm name to load.
    * @param aLocale The locale for this collator.
    * @param aCollatorOptions A sequence of end user collator options like those returned by {@link XCollator.listCollatorOptions()} .
    */
  def loadCollatorAlgorithmWithEndUserOption(
    aAlgorithmName: java.lang.String,
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    aCollatorOptions: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]
  ): scala.Unit
  /**
    * Load the collator with default algorithm defined in locale data.
    * @param aLocale The locale for this collator.
    * @param nCollatorOptions A mask of {@link CollatorOptions} .
    * @returns Returns 0 when loading was successful, otherwise throws runtime exception. In fact the return value should be ignored and the exception be caught
    */
  def loadDefaultCollator(
    aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    nCollatorOptions: scala.Double
  ): scala.Double
}

object XCollator {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    compareString: (java.lang.String, java.lang.String) => scala.Double,
    compareSubstring: (java.lang.String, scala.Double, scala.Double, java.lang.String, scala.Double, scala.Double) => scala.Double,
    listCollatorAlgorithms: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale => stdLib.SafeArray[java.lang.String],
    listCollatorOptions: java.lang.String => stdLib.SafeArray[scala.Double],
    loadCollatorAlgorithm: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => scala.Double,
    loadCollatorAlgorithmWithEndUserOption: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]) => scala.Unit,
    loadDefaultCollator: (activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Double) => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XCollator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compareString = js.Any.fromFunction2(compareString), compareSubstring = js.Any.fromFunction6(compareSubstring), listCollatorAlgorithms = js.Any.fromFunction1(listCollatorAlgorithms), listCollatorOptions = js.Any.fromFunction1(listCollatorOptions), loadCollatorAlgorithm = js.Any.fromFunction3(loadCollatorAlgorithm), loadCollatorAlgorithmWithEndUserOption = js.Any.fromFunction3(loadCollatorAlgorithmWithEndUserOption), loadDefaultCollator = js.Any.fromFunction2(loadDefaultCollator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCollator]
  }
}

