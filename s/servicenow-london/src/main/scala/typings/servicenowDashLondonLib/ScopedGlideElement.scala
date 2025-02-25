package typings
package servicenowDashLondonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopedGlideElement extends js.Object {
  /**
    * Determines if the user's role permits the creation of new records in this field.
    *
    * @returns True if the field can be created, false otherwise.
    */
  def canCreate(): scala.Boolean = js.native
  /**
    * Indicates whether the user's role permits them to read the associated GlideRecord.
    *
    * @returns True if the field can be read, false otherwise.
    */
  def canRead(): scala.Boolean = js.native
  /**
    * Determines whether the user's role permits them to write to the associated GlideRecord.
    *
    * @returns True if the user can write to the field, false otherwise.
    */
  def canWrite(): scala.Boolean = js.native
  /**
    * Determines if the current field has been modified. This functionality is available for all
    * available data types, except Journal fields.
    *
    * **Note:** The `changes()` method is not supported within ACL scripts.
    *
    * @returns True if the fields have been changed, false if the field has not.
    * @example
    *
    * // This method is often used in business rules. The following example shown is from a business
    * // rule, if "assigned_to" field value is changed, create a event in the EventQueue.
    * if (!current.assigned_to.nil() && current.assigned_to.changes()) {
    *   gs.eventQueue(
    *     'incident.assigned',
    *     current,
    *     current.assigned_to.getDisplayValue(),
    *     previous.assigned_to.getDisplayValue()
    *   );
    * }
    */
  def changes(): scala.Boolean = js.native
  /**
    * Determines if the previous value of the current field matches the specified object.
    *
    * **Note:** If the GlideRecord on which you are performing this method has only been initialized
    * and read, and has not been written, the underlying before-and-after values are the same. In
    * this case, the method returns `false`, as there has been no change to the data store.
    *
    * @param o An object value to check against the previous value of the current field.
    * @returns True if the previous value matches, false if it does not.
    * @example
    *
    * // The following example shows that in a business rule, if "active" field is changed from true,
    * // insert a event in the EventQueue.
    * if (current.active.changesFrom(true)) {
    *   gs.eventQueue('incident.inactive', current, current.incident_state, previous.incident_state);
    * }
    */
  def changesFrom(o: js.Any): scala.Boolean = js.native
  /**
    * Determines if the new value of a field, after a change, matches the specified object.
    *
    * **Note:** The changesTo() method is not supported within ACL scripts.
    *
    * @param o An object value to check against the new value of the current field.
    * @returns True if the previous value matches, false if it does not.
    * @example
    *
    * // The following example shows that in a business rule, if "active" field is changed to false,
    * // insert a event in the EventQueue.
    * if (current.active.changesTo(false)) {
    *   gs.eventQueue('incident.inactive', current, current.incident_state, previous.incident_state);
    * }
    */
  def changesTo(o: js.Any): scala.Boolean = js.native
  /**
    * Returns the value of the specified attribute from the dictionary.
    *
    * If the attribute is a boolean attribute, use `getBooleanAttribute(String)` to get the value as
    * a boolean rather than as a string.
    *
    * @param attributeName Attribute name
    * @returns Attribute value
    * @example
    *
    * doit();
    * function doit() {
    *   var gr = new GlideRecord('sys_user');
    *   gr.query('user_name', 'admin');
    *   if (gr.next()) {
    *     gs.print('we got one');
    *     gs.print(gr.location.getAttribute('tree_picker'));
    *   }
    * }
    */
  def getAttribute(attributeName: java.lang.String): java.lang.String = js.native
  /**
    * Returns the Boolean value of the specified attribute from the dictionary.
    *
    * To get the value as a string, use `getAttribute(string)`.
    *
    * @param attributeName Attribute name
    * @returns Boolean value of the attribute. Returns false if the attribute does not exist.
    */
  def getBooleanAttribute(attributeName: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the choice label for the current choice.
    *
    * @returns The selected choice's label.
    * @example
    *
    * var glideRecord = new GlideRecord('incident');
    * glideRecord.query('priority', '1');
    * glideRecord.next();
    *
    * // urgency has choice list: 1 - High, 2 - Medium, 3 - Low, with value: 1, 2, 3
    * var choiceLabel = glideRecord.urgency.getChoiceValue();
    * gs.info(choiceLabel);
    * // 1 - High
    */
  def getChoiceValue(): java.lang.String = js.native
  /**
    * Generates a choice list for a field.
    *
    * @param [dependent] Optional: a dependent value
    * @returns An array list of choices.
    * @example
    *
    * var glideRecord = new GlideRecord('incident');
    * glideRecord.query('priority', '1');
    * glideRecord.next();
    *
    * // urgency has choice list: 1 - High, 2 - Medium, 3 - Low, with value: 1, 2, 3
    * var choices = glideRecord.urgency.getChoices();
    * gs.info(choices);
    */
  def getChoices(): js.Array[_] = js.native
  def getChoices(dependent: java.lang.String): js.Array[_] = js.native
  /**
    * Returns the clear text value for Password (2 way encrypted) fields in scoped
    * applications.
    *
    * @returns The clear text password.
    * @example
    *
    * var tablename = 'x_scoped_app_table'
    * var CI = new GlideRecord(tablename);
    * CI.addQuery('number', '0001002');
    * CI.query();
    * CI.next();
    *
    * var password = CI.password_field
    * var decrypted = password.getDecryptedValue();
    * gs.info(decrypted);
    */
  def getDecryptedValue(): java.lang.String = js.native
  /**
    * Gets the formatted display value of the field.
    *
    * @param [maxCharacters] Optional: Maximum characters desired
    * @returns The display value of the field
    * @example
    *
    * var glideRecord = new GlideRecord('incident');
    * glideRecord.query('priority', '1');
    * glideRecord.next();
    * gs.info(glideRecord.priority.getDisplayValue());
    */
  def getDisplayValue(): java.lang.String = js.native
  def getDisplayValue(maxCharacters: scala.Double): java.lang.String = js.native
  /**
    * Returns the field's element descriptor.
    *
    * @returns The field's element descriptor.
    * @example
    *
    * var grInc = new GlideRecord('incident');
    * grInc.query('priority', '1');
    *
    * var field = grInc.getElement('priority');
    * var ed = field.getED();
    */
  def getED(): ScopedElementDescriptor = js.native
  /**
    * Returns the phone number in international format.
    *
    * @returns The phone number in international format.
    */
  def getGlobalDisplayValue(): js.Any = js.native
  /**
    * Returns the HTML value of a field.
    *
    * @param [maxChars] Optional. Maximum number of characters to return.
    * @returns HTML value for the field.
    * @example
    *
    * var inccause = new GlideRecord('incident');
    * inccause.short_description = current.short_description;
    * inccause.comments = current.comments.getHTMLValue();
    * inccause.insert();
    */
  def getHTMLValue(): java.lang.String = js.native
  def getHTMLValue(maxChars: scala.Double): java.lang.String = js.native
  /**
    * Returns either the most recent journal entry or all journal entries.
    *
    * @param mostRecent If 1, returns the most recent entry. If -1, returns all journal
    * entries.
    * @returns For the most recent entry, returns a string that contains the field label,
    * timestamp, and user display name of the journal entry.
    *
    * For all journal entries, returns the same information for all journal entries
    * ever entered as a single string with each entry delimited by "\n\n".
    * @example
    *
    * //gets all journal entries as a string where each entry is delimited by '\n\n'
    * var notes = current.work_notes.getJournalEntry(-1);
    * //stores each entry into an array of strings
    * var na = notes.split('\n\n');
    *
    * for (var i = 0; i < na.length; i++)
    *   gs.print(na[i]);
    */
  def getJournalEntry(mostRecent: scala.Double): java.lang.String = js.native
  /**
    * Returns the object label.
    *
    * @returns Object label
    * @example
    *
    * var gr = new GlideRecord('sc_req_item');
    * gr.addQuery('request', current.sysapproval);
    * gr.query();
    * while (gr.next()) {
    *   var nicePrice = gr.price.toString();
    *   if (nicePrice != '') {
    *     nicePrice = parseFloat(nicePrice);
    *     nicePrice = nicePrice.toFixed(2);
    *   }
    *   template.print(
    *     gr.number + ':  ' + gr.quantity + ' X ' + gr.cat_item.getDisplayValue() +
    *     ' at $' + nicePrice + ' each \n'
    *   );
    *   template.print('    Options:\n');
    *   for (var key in gr.variables) {
    *     var v = gr.variables[key];
    *     if (v.getGlideObject().getQuestion().getLabel() != '' ) {
    *       template.space(4);
    *       template.print(
    *         '     ' + v.getGlideObject().getQuestion().getLabel() + ' = ' +
    *         v.getDisplayValue() + '\n'
    *       );
    *     }
    *   }
    * }
    */
  def getLabel(): java.lang.String = js.native
  /**
    * Returns the name of the field.
    *
    * @returns Field name
    */
  def getName(): java.lang.String = js.native
  /**
    * Returns a GlideRecord object for a given reference element.
    *
    * @returns A GlideRecord object
    * @example
    *
    * var grINC = new GlideRecord('incident');
    * grINC.notNullQuery('caller_id');
    * grINC.query();
    * if (grINC.next()) {
    *
    *   // Get a GlideRecord object for the referenced sys_user record
    *   var grUSER = grINC.caller_id.getRefRecord();
    *   if (grUSER.isValidRecord())
    *     gs.print( grUSER.getValue('name') );
    * }
    */
  def getRefRecord(): ScopedGlideRecord = js.native
  /**
    * Gets the table name for a reference element.
    *
    * @returns The table name of the reference
    * @example
    *
    * var grINC = new GlideRecord('incident');
    * grINC.query('number', 'INC0010041'); // record assignment group assigned to "CAB Approval"
    * if (grINC.next()) {
    *   // Get the table name
    *   var tableName = grINC.assignment_group.getReferenceTable();
    *   gs.info(tableName);
    * }
    */
  def getReferenceTable(): java.lang.String = js.native
  /**
    * Returns the name of the table on which the field resides.
    *
    * @returns Name of the table. The returned value may be different from the table Class
    * that the record is in. See Tables and Classes in the product documentation.
    * @example
    *
    * if (current.approver.getTableName() == 'sysapproval_approver') {
    *   if (current.approver == email.from_sys_id) {
    *     current.comments = 'reply from: ' + email.from + '\n\n' + email.body_text;
    *
    *     // if it's been cancelled, it's cancelled.
    *     var doit = true;
    *     if (current.state == 'cancelled') doit = false;
    *
    *     if (email.body.state != undefined) current.state = email.body.state;
    *
    *     if (doit) current.update();
    *   } else {
    *     gs.log(
    *       'Approval for task (' +
    *         current.sysapproval.getDisplayValue() +
    *         ') rejected because user sending email (' +
    *         email.from +
    *         ') does not match the approver (' +
    *         current.approver.getDisplayValue() +
    *         ')'
    *     );
    *   }
    * }
    */
  def getTableName(): java.lang.String = js.native
  /**
    * Determines if a field is null.
    *
    * @returns True if the field is null or an empty string, false if not.
    * @example
    *
    * var glideRecord = new GlideRecord('incident');
    * glideRecord.query('priority', '1');
    * glideRecord.next();
    * gs.info(glideRecord.state.nil());
    */
  def nil(): scala.Boolean = js.native
  /**
    * Sets the value of a date/time element to the specified number of milliseconds since
    * January 1, 1970 00:00:00 GMT.
    *
    * @param milliseconds Number of milliseconds since 1/1/1970
    * @example
    *
    * var gr = new GlideRecord('incident');
    * gr.initialize();
    * gr.opened_at.setDateNumericValue(10000);
    */
  def setDateNumericValue(milliseconds: scala.Double): scala.Unit = js.native
  /**
    * Sets the display value of the field.
    *
    * @param value The value to set for the field.
    * @example
    *
    * var glideRecord = new GlideRecord('incident');
    * glideRecord.query('priority', '1');
    * glideRecord.next();
    *
    * //change the urgency to 3
    * glideRecord.urgency.setDisplayValue('3 - Low');
    * gs.info(glideRecord.urgency);
    */
  def setDisplayValue(value: js.Object): scala.Unit = js.native
  /**
    * Adds an error message. Available in Fuji patch 3.
    *
    * @param errorMessage The error message.
    * @returns Method does not return a value
    * @example
    *
    * var glideRecord = new GlideRecord('incident');
    * glideRecord.query('priority', '1');
    * glideRecord.next();
    * glideRecord.short_description.setError('Error text');
    */
  def setError(errorMessage: java.lang.String): scala.Unit = js.native
  /**
    * Sets the field to the specified phone number.
    *
    * @param phoneNumber The phone number to set. This can be in either the international or local
    * format.
    * @param strict When true, specifies that the number specified must match the correct format.
    * When false, the system attempts to correct an improperly formatted phone
    * number.
    * @returns True if the value was set.
    */
  def setPhoneNumber(phoneNumber: js.Any, strict: scala.Boolean): scala.Boolean = js.native
  /**
    * Sets the value of a field.
    *
    * @param value Object value to set the field to.
    * @returns Method does not return a value
    * @example
    *
    * var glideRecord = new GlideRecord('incident');
    * glideRecord.query('priority', '1');
    * glideRecord.next();
    * glideRecord.short_description.setValue('Network failure');
    * gs.info(glideRecord.short_description);
    */
  def setValue(value: js.Any): scala.Unit = js.native
}

