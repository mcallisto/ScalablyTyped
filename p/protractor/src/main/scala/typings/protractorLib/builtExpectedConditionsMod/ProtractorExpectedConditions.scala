package typings
package protractorLib.builtExpectedConditionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/expectedConditions", "ProtractorExpectedConditions")
@js.native
class ProtractorExpectedConditions protected () extends js.Object {
  def this(browser: protractorLib.builtBrowserMod.ProtractorBrowser) = this()
  var browser: protractorLib.builtBrowserMod.ProtractorBrowser = js.native
  /**
    * Expect an alert to be present.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * // Waits for an alert pops up.
    * browser.wait(EC.alertIsPresent(), 5000);
    *
    * @alias ExpectedConditions.alertIsPresent
    * @returns {!function} An expected condition that returns a promise
    *     representing whether an alert is present.
    */
  def alertIsPresent(): js.Function = js.native
  /**
    * Chain a number of expected conditions using logical_and, short circuiting
    * at the first expected condition that evaluates to false.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * var titleContainsFoo = EC.titleContains('Foo');
    * var titleIsNotFooBar = EC.not(EC.titleIs('FooBar'));
    * // Waits for title to contain 'Foo', but is not 'FooBar'
    * browser.wait(EC.and(titleContainsFoo, titleIsNotFooBar), 5000);
    *
    * @alias ExpectedConditions.and
    * @param {Array.<Function>} fns An array of expected conditions to 'and'
    * together.
    *
    * @returns {!function} An expected condition that returns a promise which
    *     evaluates to the result of the logical and.
    */
  def and(args: js.Function*): js.Function = js.native
  /**
    * An Expectation for checking an element is visible and enabled such that you
    * can click it.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * // Waits for the element with id 'abc' to be clickable.
    * browser.wait(EC.elementToBeClickable($('#abc')), 5000);
    *
    * @alias ExpectedConditions.elementToBeClickable
    * @param {!ElementFinder} elementFinder The element to check
    *
    * @returns {!function} An expected condition that returns a promise
    *     representing whether the element is clickable.
    */
  def elementToBeClickable(elementFinder: protractorLib.builtElementMod.ElementFinder): js.Function = js.native
  /**
    * An expectation for checking the selection is selected.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * // Waits for the element with id 'myCheckbox' to be selected.
    * browser.wait(EC.elementToBeSelected($('#myCheckbox')), 5000);
    *
    * @alias ExpectedConditions.elementToBeSelected
    * @param {!ElementFinder} elementFinder The element to check
    *
    * @returns {!function} An expected condition that returns a promise
    *     representing whether the element is selected.
    */
  def elementToBeSelected(elementFinder: protractorLib.builtElementMod.ElementFinder): js.Function = js.native
  /**
    * An expectation for checking that an element is either invisible or not
    * present on the DOM. This is the opposite of 'visibilityOf'.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * // Waits for the element with id 'abc' to be no longer visible on the dom.
    * browser.wait(EC.invisibilityOf($('#abc')), 5000);
    *
    * @alias ExpectedConditions.invisibilityOf
    * @param {!ElementFinder} elementFinder The element to check
    *
    * @returns {!function} An expected condition that returns a promise
    *     representing whether the element is invisible.
    */
  def invisibilityOf(elementFinder: protractorLib.builtElementMod.ElementFinder): js.Function = js.native
  /**
    * Helper function that is equivalent to the logical_and if defaultRet==true,
    * or logical_or if defaultRet==false
    *
    * @private
    * @param {boolean} defaultRet
    * @param {Array.<Function>} fns An array of expected conditions to chain.
    *
    * @returns {!function} An expected condition that returns a promise which
    *     evaluates to the result of the logical chain.
    */
  def logicalChain_(defaultRet: scala.Boolean, fns: js.Array[js.Function]): js.Function = js.native
  /**
    * Negates the result of a promise.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * var titleIsNotFoo = EC.not(EC.titleIs('Foo'));
    * // Waits for title to become something besides 'foo'.
    * browser.wait(titleIsNotFoo, 5000);
    *
    * @alias ExpectedConditions.not
    * @param {!function} expectedCondition
    *
    * @returns {!function} An expected condition that returns the negated value.
    */
  def not(expectedCondition: js.Function): js.Function = js.native
  /**
    * Chain a number of expected conditions using logical_or, short circuiting
    * at the first expected condition that evaluates to true.
    *
    * @alias ExpectedConditions.or
    * @example
    * var EC = protractor.ExpectedConditions;
    * var titleContainsFoo = EC.titleContains('Foo');
    * var titleContainsBar = EC.titleContains('Bar');
    * // Waits for title to contain either 'Foo' or 'Bar'
    * browser.wait(EC.or(titleContainsFoo, titleContainsBar), 5000);
    *
    * @param {Array.<Function>} fns An array of expected conditions to 'or'
    * together.
    *
    * @returns {!function} An expected condition that returns a promise which
    *     evaluates to the result of the logical or.
    */
  def or(args: js.Function*): js.Function = js.native
  /**
    * An expectation for checking that an element is present on the DOM
    * of a page. This does not necessarily mean that the element is visible.
    * This is the opposite of 'stalenessOf'.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * // Waits for the element with id 'abc' to be present on the dom.
    * browser.wait(EC.presenceOf($('#abc')), 5000);
    *
    * @alias ExpectedConditions.presenceOf
    * @param {!ElementFinder} elementFinder The element to check
    *
    * @returns {!function} An expected condition that returns a promise
    *     representing whether the element is present.
    */
  def presenceOf(elementFinder: protractorLib.builtElementMod.ElementFinder): js.Function = js.native
  /**
    * An expectation for checking that an element is not attached to the DOM
    * of a page. This is the opposite of 'presenceOf'.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * // Waits for the element with id 'abc' to be no longer present on the dom.
    * browser.wait(EC.stalenessOf($('#abc')), 5000);
    *
    * @alias ExpectedConditions.stalenessOf
    * @param {!ElementFinder} elementFinder The element to check
    *
    * @returns {!function} An expected condition that returns a promise
    *     representing whether the element is stale.
    */
  def stalenessOf(elementFinder: protractorLib.builtElementMod.ElementFinder): js.Function = js.native
  /**
    * An expectation for checking if the given text is present in the
    * element. Returns false if the elementFinder does not find an element.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * // Waits for the element with id 'abc' to contain the text 'foo'.
    * browser.wait(EC.textToBePresentInElement($('#abc'), 'foo'), 5000);
    *
    * @alias ExpectedConditions.textToBePresentInElement
    * @param {!ElementFinder} elementFinder The element to check
    * @param {!string} text The text to verify against
    *
    * @returns {!function} An expected condition that returns a promise
    *     representing whether the text is present in the element.
    */
  def textToBePresentInElement(elementFinder: protractorLib.builtElementMod.ElementFinder, text: java.lang.String): js.Function = js.native
  /**
    * An expectation for checking if the given text is present in the element’s
    * value. Returns false if the elementFinder does not find an element.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * // Waits for the element with id 'myInput' to contain the input 'foo'.
    * browser.wait(EC.textToBePresentInElementValue($('#myInput'), 'foo'), 5000);
    *
    * @alias ExpectedConditions.textToBePresentInElementValue
    * @param {!ElementFinder} elementFinder The element to check
    * @param {!string} text The text to verify against
    *
    * @returns {!function} An expected condition that returns a promise
    *     representing whether the text is present in the element's value.
    */
  def textToBePresentInElementValue(elementFinder: protractorLib.builtElementMod.ElementFinder, text: java.lang.String): js.Function = js.native
  /**
    * An expectation for checking that the title contains a case-sensitive
    * substring.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * // Waits for the title to contain 'foo'.
    * browser.wait(EC.titleContains('foo'), 5000);
    *
    * @alias ExpectedConditions.titleContains
    * @param {!string} title The fragment of title expected
    *
    * @returns {!function} An expected condition that returns a promise
    *     representing whether the title contains the string.
    */
  def titleContains(title: java.lang.String): js.Function = js.native
  /**
    * An expectation for checking the title of a page.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * // Waits for the title to be 'foo'.
    * browser.wait(EC.titleIs('foo'), 5000);
    *
    * @alias ExpectedConditions.titleIs
    * @param {!string} title The expected title, which must be an exact match.
    *
    * @returns {!function} An expected condition that returns a promise
    *     representing whether the title equals the string.
    */
  def titleIs(title: java.lang.String): js.Function = js.native
  /**
    * An expectation for checking that the URL contains a case-sensitive
    * substring.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * // Waits for the URL to contain 'foo'.
    * browser.wait(EC.urlContains('foo'), 5000);
    *
    * @alias ExpectedConditions.urlContains
    * @param {!string} url The fragment of URL expected
    *
    * @returns {!function} An expected condition that returns a promise
    *     representing whether the URL contains the string.
    */
  def urlContains(url: java.lang.String): js.Function = js.native
  /**
    * An expectation for checking the URL of a page.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * // Waits for the URL to be 'foo'.
    * browser.wait(EC.urlIs('foo'), 5000);
    *
    * @alias ExpectedConditions.urlIs
    * @param {!string} url The expected URL, which must be an exact match.
    *
    * @returns {!function} An expected condition that returns a promise
    *     representing whether the url equals the string.
    */
  def urlIs(url: java.lang.String): js.Function = js.native
  /**
    * An expectation for checking that an element is present on the DOM of a
    * page and visible. Visibility means that the element is not only displayed
    * but also has a height and width that is greater than 0. This is the
    * opposite
    * of 'invisibilityOf'.
    *
    * @example
    * var EC = protractor.ExpectedConditions;
    * // Waits for the element with id 'abc' to be visible on the dom.
    * browser.wait(EC.visibilityOf($('#abc')), 5000);
    *
    * @alias ExpectedConditions.visibilityOf
    * @param {!ElementFinder} elementFinder The element to check
    *
    * @returns {!function} An expected condition that returns a promise
    *     representing whether the element is visible.
    */
  def visibilityOf(elementFinder: protractorLib.builtElementMod.ElementFinder): js.Function = js.native
}

