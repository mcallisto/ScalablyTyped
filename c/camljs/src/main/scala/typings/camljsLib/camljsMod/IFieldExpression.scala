package typings
package camljsLib.camljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldExpression extends js.Object {
  /** Adds And clauses to the query. Use for creating bracket-expressions in conjuction with CamlBuilder.Expression(). */
  def All(conditions: IExpression*): IExpression = js.native
  /** Adds And clauses to the query. Use for creating bracket-expressions in conjuction with CamlBuilder.Expression(). */
  def All(conditions: js.Array[IExpression]): IExpression = js.native
  /** Adds Or clauses to the query. Use for creating bracket-expressions in conjuction with CamlBuilder.Expression(). */
  def Any(conditions: IExpression*): IExpression = js.native
  /** Adds Or clauses to the query. Use for creating bracket-expressions in conjuction with CamlBuilder.Expression(). */
  def Any(conditions: js.Array[IExpression]): IExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is Boolean */
  def BooleanField(internalName: java.lang.String): IBooleanFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is Choice */
  def ChoiceField(internalName: java.lang.String): ITextFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is Computed */
  def ComputedField(internalName: java.lang.String): ITextFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is ContentTypeId */
  def ContentTypeIdField(): ITextFieldExpression = js.native
  def ContentTypeIdField(internalName: java.lang.String): ITextFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is Counter (usually ID fields) */
  def CounterField(internalName: java.lang.String): INumberFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is Date */
  def DateField(internalName: java.lang.String): IDateTimeFieldExpression = js.native
  /** Used in queries for retrieving recurring calendar events.
    NOTICE: DateRangesOverlap with overlapType other than Now cannot be used with SP.CamlQuery, because it doesn't support
    CalendarDate and ExpandRecurrence query options. Lists.asmx, however, supports them, so you can still use DateRangesOverlap
    with SPServices.
    @param overlapType Defines type of overlap: return all events for a day, for a week, for a month or for a year
    @param calendarDate Defines date that will be used for determining events for which exactly day/week/month/year will be returned.
    This value is ignored for overlapType=Now, but for the other overlap types it is mandatory.
    @param eventDateField Internal name of "Start Time" field (default: "EventDate" - all OOTB Calendar lists use this name)
    @param endDateField Internal name of "End Time" field (default: "EndDate" - all OOTB Calendar lists use this name)
    @param recurrenceIDField Internal name of "Recurrence ID" field (default: "RecurrenceID" - all OOTB Calendar lists use this name)
    */
  def DateRangesOverlap(overlapType: DateRangesOverlapType, calendarDate: java.lang.String): IExpression = js.native
  def DateRangesOverlap(
    overlapType: DateRangesOverlapType,
    calendarDate: java.lang.String,
    eventDateField: java.lang.String
  ): IExpression = js.native
  def DateRangesOverlap(
    overlapType: DateRangesOverlapType,
    calendarDate: java.lang.String,
    eventDateField: java.lang.String,
    endDateField: java.lang.String
  ): IExpression = js.native
  def DateRangesOverlap(
    overlapType: DateRangesOverlapType,
    calendarDate: java.lang.String,
    eventDateField: java.lang.String,
    endDateField: java.lang.String,
    recurrenceIDField: java.lang.String
  ): IExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is DateTime */
  def DateTimeField(internalName: java.lang.String): IDateTimeFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is Integer */
  def IntegerField(internalName: java.lang.String): INumberFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is Lookup */
  def LookupField(internalName: java.lang.String): ILookupFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is LookupMulti */
  def LookupMultiField(internalName: java.lang.String): ILookupMultiFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is ModStat (moderation status) */
  def ModStatField(internalName: java.lang.String): IModStatFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is Number */
  def NumberField(internalName: java.lang.String): INumberFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is Text */
  def TextField(internalName: java.lang.String): ITextFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is URL */
  def UrlField(internalName: java.lang.String): ITextFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is User */
  def UserField(internalName: java.lang.String): IUserFieldExpression = js.native
  /** Specifies that a condition will be tested against the field with the specified internal name, and the type of this field is UserMulti */
  def UserMultiField(internalName: java.lang.String): IUserMultiFieldExpression = js.native
}

