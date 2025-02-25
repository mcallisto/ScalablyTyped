package typings
package titaniumLib.TitaniumNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An object that is used to describe the recurrence pattern for a recurring event.
		 */
trait RecurrenceRule
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Identifier for the recurrence rule's calendar.
  			 */
  val calendarID: java.lang.String
  /**
  			 * The days of the month that the event occurs, as an array of number objects.
  			 * Values can be from 1 to 31 and from -1 to -31. This parameter is only valid for
  			 * recurrence rules of type
  			 * [RECURRENCEFREQUENCY_MONTHLY](Titanium.Calendar.RECURRENCEFREQUENCY_MONTHLY).
  			 */
  val daysOfTheMonth: js.Array[scala.Double]
  /**
  			 * The days of the week that the event occurs, as an Dictionay of `daysOfWeek` and `Week`.
  			 */
  val daysOfTheWeek: titaniumLib.daysOfTheWeekDictionary
  /**
  			 * The days of the year that the event occurs, as an array of number objects.
  			 * Values can be from 1 to 366 and from -1 to -366. This parameter is only valid for
  			 * recurrence rules of type [RECURRENCEFREQUENCY_YEARLY](Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY).
  			 */
  val daysOfTheYear: js.Array[scala.Double]
  /**
  			 * End of a recurrence rule.
  			 */
  val end: titaniumLib.recurrenceEndDictionary
  /**
  			 * Frequency of the recurrence rule.
  			 */
  val frequency: scala.Double
  /**
  			 * The interval between instances of this recurrence. For example, a weekly
  			 * recurrence rule with an interval of 2 occurs every other week. Must be greater than 0.
  			 */
  val interval: scala.Double
  /**
  			 * The months of the year that the event occurs, as an array of Number objects.
  			 * Values can be from 1 to 12. This parameter is only valid for recurrence rules of
  			 * type [RECURRENCEFREQUENCY_YEARLY](Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY).
  			 */
  val monthsOfTheYear: js.Array[scala.Double]
  /**
  			 * An array of ordinal numbers that filters which recurrences to include in the
  			 * recurrence rule's frequency. For example, a yearly recurrence rule that has a
  			 * [daysOfTheWeek](Titanium.Calendar.RecurrenceRule.daysOfTheWeek) value that specifies
  			 * Monday through Friday, and a `setPositions` array containing 2 and -1, occurs only
  			 * on the second weekday and last weekday of every year.
  			 */
  val setPositions: js.Array[scala.Double]
  /**
  			 * The weeks of the year that the event occurs, as an array of number objects.
  			 * Values can be from 1 to 53 and from -1 to -53. This parameter is only valid for
  			 * recurrence rules of type [RECURRENCEFREQUENCY_YEARLY](Titanium.Calendar.RECURRENCEFREQUENCY_YEARLY).
  			 */
  val weeksOfTheYear: js.Array[scala.Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.calendarID> property.
  			 */
  def getCalendarID(): java.lang.String
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.daysOfTheMonth> property.
  			 */
  def getDaysOfTheMonth(): js.Array[scala.Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.daysOfTheWeek> property.
  			 */
  def getDaysOfTheWeek(): titaniumLib.daysOfTheWeekDictionary
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.daysOfTheYear> property.
  			 */
  def getDaysOfTheYear(): js.Array[scala.Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.end> property.
  			 */
  def getEnd(): titaniumLib.recurrenceEndDictionary
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.frequency> property.
  			 */
  def getFrequency(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.interval> property.
  			 */
  def getInterval(): scala.Double
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.monthsOfTheYear> property.
  			 */
  def getMonthsOfTheYear(): js.Array[scala.Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.setPositions> property.
  			 */
  def getSetPositions(): js.Array[scala.Double]
  /**
  			 * Gets the value of the <Titanium.Calendar.RecurrenceRule.weeksOfTheYear> property.
  			 */
  def getWeeksOfTheYear(): js.Array[scala.Double]
}

object RecurrenceRule {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    calendarID: java.lang.String,
    daysOfTheMonth: js.Array[scala.Double],
    daysOfTheWeek: titaniumLib.daysOfTheWeekDictionary,
    daysOfTheYear: js.Array[scala.Double],
    end: titaniumLib.recurrenceEndDictionary,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    frequency: scala.Double,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getCalendarID: () => java.lang.String,
    getDaysOfTheMonth: () => js.Array[scala.Double],
    getDaysOfTheWeek: () => titaniumLib.daysOfTheWeekDictionary,
    getDaysOfTheYear: () => js.Array[scala.Double],
    getEnd: () => titaniumLib.recurrenceEndDictionary,
    getFrequency: () => scala.Double,
    getInterval: () => scala.Double,
    getMonthsOfTheYear: () => js.Array[scala.Double],
    getSetPositions: () => js.Array[scala.Double],
    getWeeksOfTheYear: () => js.Array[scala.Double],
    interval: scala.Double,
    monthsOfTheYear: js.Array[scala.Double],
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    setBubbleParent: scala.Boolean => scala.Unit,
    setPositions: js.Array[scala.Double],
    weeksOfTheYear: js.Array[scala.Double],
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): RecurrenceRule = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, calendarID = calendarID, daysOfTheMonth = daysOfTheMonth, daysOfTheWeek = daysOfTheWeek, daysOfTheYear = daysOfTheYear, end = end, fireEvent = js.Any.fromFunction2(fireEvent), frequency = frequency, getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getCalendarID = js.Any.fromFunction0(getCalendarID), getDaysOfTheMonth = js.Any.fromFunction0(getDaysOfTheMonth), getDaysOfTheWeek = js.Any.fromFunction0(getDaysOfTheWeek), getDaysOfTheYear = js.Any.fromFunction0(getDaysOfTheYear), getEnd = js.Any.fromFunction0(getEnd), getFrequency = js.Any.fromFunction0(getFrequency), getInterval = js.Any.fromFunction0(getInterval), getMonthsOfTheYear = js.Any.fromFunction0(getMonthsOfTheYear), getSetPositions = js.Any.fromFunction0(getSetPositions), getWeeksOfTheYear = js.Any.fromFunction0(getWeeksOfTheYear), interval = interval, monthsOfTheYear = monthsOfTheYear, removeEventListener = js.Any.fromFunction2(removeEventListener), setBubbleParent = js.Any.fromFunction1(setBubbleParent), setPositions = setPositions, weeksOfTheYear = weeksOfTheYear)
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[RecurrenceRule]
  }
}

