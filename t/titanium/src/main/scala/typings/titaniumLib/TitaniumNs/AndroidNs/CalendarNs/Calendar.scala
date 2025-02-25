package typings
package titaniumLib.TitaniumNs.AndroidNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An object that represents a single calendar on Android.
			 */
trait Calendar
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  				 * Indicates whether this calendar is hidden.
  				 */
  val hidden: scala.Boolean
  /**
  				 * Identifier of this calendar.
  				 */
  val id: java.lang.String
  /**
  				 * Display name of this calendar.
  				 */
  val name: java.lang.String
  /**
  				 * Indicates whether the calendar is selected.
  				 */
  val selected: scala.Boolean
  /**
  				 * Creates an event in this calendar.
  				 */
  def createEvent(properties: js.Any): Event
  /**
  				 * Gets the event with the specified identifier.
  				 */
  def getEventById(id: scala.Double): Event
  /**
  				 * Gets events that occur between two dates.
  				 */
  def getEventsBetweenDates(date1: stdLib.Date, date2: stdLib.Date): js.Array[Event]
  /**
  				 * Gets events that occur on a specified date.
  				 */
  def getEventsInDate(year: scala.Double, month: scala.Double, day: scala.Double): js.Array[Event]
  /**
  				 * Gets events that occur during a specified month.
  				 */
  def getEventsInMonth(year: scala.Double, month: scala.Double): js.Array[Event]
  /**
  				 * Gets all events that occur during a specified year.
  				 */
  def getEventsInYear(year: scala.Double): js.Array[Event]
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.hidden> property.
  				 */
  def getHidden(): scala.Boolean
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.id> property.
  				 */
  def getId(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.name> property.
  				 */
  def getName(): java.lang.String
  /**
  				 * Gets the value of the <Titanium.Android.Calendar.Calendar.selected> property.
  				 */
  def getSelected(): scala.Boolean
}

object Calendar {
  @scala.inline
  def apply(
    addEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    apiName: java.lang.String,
    applyProperties: js.Any => scala.Unit,
    bubbleParent: scala.Boolean,
    createEvent: js.Any => Event,
    fireEvent: (java.lang.String, js.Any) => scala.Unit,
    getApiName: () => java.lang.String,
    getBubbleParent: () => scala.Boolean,
    getEventById: scala.Double => Event,
    getEventsBetweenDates: (stdLib.Date, stdLib.Date) => js.Array[Event],
    getEventsInDate: (scala.Double, scala.Double, scala.Double) => js.Array[Event],
    getEventsInMonth: (scala.Double, scala.Double) => js.Array[Event],
    getEventsInYear: scala.Double => js.Array[Event],
    getHidden: () => scala.Boolean,
    getId: () => java.lang.String,
    getName: () => java.lang.String,
    getSelected: () => scala.Boolean,
    hidden: scala.Boolean,
    id: java.lang.String,
    name: java.lang.String,
    removeEventListener: (java.lang.String, js.Function1[/* param0 */ js.Any, _]) => scala.Unit,
    selected: scala.Boolean,
    setBubbleParent: scala.Boolean => scala.Unit,
    getLifecycleContainer: () => titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    lifecycleContainer: titaniumLib.TitaniumNs.UINs.Window | titaniumLib.TitaniumNs.UINs.TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.Window, scala.Unit]) with (js.Function1[/* lifecycleContainer */ titaniumLib.TitaniumNs.UINs.TabGroup, scala.Unit]) = null
  ): Calendar = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), apiName = apiName, applyProperties = js.Any.fromFunction1(applyProperties), bubbleParent = bubbleParent, createEvent = js.Any.fromFunction1(createEvent), fireEvent = js.Any.fromFunction2(fireEvent), getApiName = js.Any.fromFunction0(getApiName), getBubbleParent = js.Any.fromFunction0(getBubbleParent), getEventById = js.Any.fromFunction1(getEventById), getEventsBetweenDates = js.Any.fromFunction2(getEventsBetweenDates), getEventsInDate = js.Any.fromFunction3(getEventsInDate), getEventsInMonth = js.Any.fromFunction2(getEventsInMonth), getEventsInYear = js.Any.fromFunction1(getEventsInYear), getHidden = js.Any.fromFunction0(getHidden), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getSelected = js.Any.fromFunction0(getSelected), hidden = hidden, id = id, name = name, removeEventListener = js.Any.fromFunction2(removeEventListener), selected = selected, setBubbleParent = js.Any.fromFunction1(setBubbleParent))
    if (getLifecycleContainer != null) __obj.updateDynamic("getLifecycleContainer")(js.Any.fromFunction0(getLifecycleContainer))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer)
    __obj.asInstanceOf[Calendar]
  }
}

