package typings
package atBlueprintjsDatetimeLib.libEsmDatePickerCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerBaseProps extends js.Object {
  /**
    * The initial month the calendar displays.
    */
  var initialMonth: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * The locale name, which is passed to the functions in `localeUtils`
    * (and `formatDate` and `parseDate` if supported).
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Collection of functions that provide internationalization support.
    */
  var localeUtils: js.UndefOr[reactDashDayDashPickerLib.typesUtilsMod.LocaleUtils] = js.undefined
  /**
    * The latest date the user can select.
    * @default Dec. 31st of this year.
    */
  var maxDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * The earliest date the user can select.
    * @default Jan. 1st, 20 years in the past.
    */
  var minDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    * Collection of functions that determine which modifier classes get applied to which days.
    * Each function should accept a `Date` and return a boolean.
    * See the [**react-day-picker** documentation](http://react-day-picker.js.org/api/ModifiersUtils) to learn more.
    */
  var modifiers: js.UndefOr[IDatePickerModifiers] = js.undefined
  /**
    * If `true`, the month menu will appear to the left of the year menu.
    * Otherwise, the month menu will apear to the right of the year menu.
    * @default false
    */
  var reverseMonthAndYearMenus: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Further configure the `TimePicker` that appears beneath the calendar.
    * `onChange` and `value` are ignored in favor of the corresponding
    * top-level props on this component.
    *
    * Passing any defined value to this prop (even `{}`) will cause the
    * `TimePicker` to appear.
    */
  var timePickerProps: js.UndefOr[atBlueprintjsDatetimeLib.libEsmTimePickerMod.ITimePickerProps] = js.undefined
  /**
    * The precision of time selection that accompanies the calendar. Passing a
    * `TimePrecision` value (or providing `timePickerProps`) shows a
    * `TimePicker` below the calendar. Time is preserved across date changes.
    *
    * This is shorthand for `timePickerProps.precision` and is a quick way to
    * enable time selection.
    */
  var timePrecision: js.UndefOr[atBlueprintjsDatetimeLib.libEsmTimePickerMod.TimePrecision] = js.undefined
}

object IDatePickerBaseProps {
  @scala.inline
  def apply(
    initialMonth: stdLib.Date = null,
    locale: java.lang.String = null,
    localeUtils: reactDashDayDashPickerLib.typesUtilsMod.LocaleUtils = null,
    maxDate: stdLib.Date = null,
    minDate: stdLib.Date = null,
    modifiers: IDatePickerModifiers = null,
    reverseMonthAndYearMenus: js.UndefOr[scala.Boolean] = js.undefined,
    timePickerProps: atBlueprintjsDatetimeLib.libEsmTimePickerMod.ITimePickerProps = null,
    timePrecision: atBlueprintjsDatetimeLib.libEsmTimePickerMod.TimePrecision = null
  ): IDatePickerBaseProps = {
    val __obj = js.Dynamic.literal()
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers)
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus)
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps)
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision)
    __obj.asInstanceOf[IDatePickerBaseProps]
  }
}

