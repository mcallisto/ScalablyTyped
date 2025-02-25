package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends OutlookItem {
  /** The fileAttachment and itemAttachment attachments for the message. */
  var attachments: js.UndefOr[js.Array[Attachment]] = js.undefined
  /** The Bcc: recipients for the message. */
  var bccRecipients: js.UndefOr[js.Array[Recipient]] = js.undefined
  /** The body of the message. It can be in HTML or text format. Find out about safe HTML in a message body. */
  var body: js.UndefOr[ItemBody] = js.undefined
  /** The first 255 characters of the message body. It is in text format. */
  var bodyPreview: js.UndefOr[java.lang.String] = js.undefined
  /** The Cc: recipients for the message. */
  var ccRecipients: js.UndefOr[js.Array[Recipient]] = js.undefined
  /** The ID of the conversation the email belongs to. */
  var conversationId: js.UndefOr[java.lang.String] = js.undefined
  /** The collection of open extensions defined for the message. Nullable. */
  var extensions: js.UndefOr[js.Array[Extension]] = js.undefined
  /** The flag value that indicates the status, start date, due date, or completion date for the message. */
  var flag: js.UndefOr[FollowupFlag] = js.undefined
  /** The mailbox owner and sender of the message. The value must correspond to the actual mailbox used. Find out more about setting the from and sender properties of a message. */
  var from: js.UndefOr[Recipient] = js.undefined
  /**
    * Indicates whether the message has attachments. This property doesn't include inline attachments, so if a message contains only inline attachments, this property is false.
    * To verify the existence of inline attachments, parse the body property to look for a src attribute, such as &amp;lt;IMG src='cid:image001.jpg@01D26CD8.6C05F070'&amp;gt;.
    */
  var hasAttachments: js.UndefOr[scala.Boolean] = js.undefined
  /** The importance of the message: Low, Normal, High. */
  var importance: js.UndefOr[Importance] = js.undefined
  /** The classification of the message for the user, based on inferred relevance or importance, or on an explicit override. The possible values are: focused or other. */
  var inferenceClassification: js.UndefOr[InferenceClassificationType] = js.undefined
  /**
    * A collection of message headers defined by RFC5322. The set includes message headers indicating the network path taken by a message from the sender to the recipient.
    * It can also contain custom message headers that hold app data for the message.  Returned only on applying a $select query option. Read-only.
    */
  var internetMessageHeaders: js.UndefOr[js.Array[InternetMessageHeader]] = js.undefined
  /** The message ID in the format specified by RFC2822. */
  var internetMessageId: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether a read receipt is requested for the message. */
  var isDeliveryReceiptRequested: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether the message is a draft. A message is a draft if it hasn't been sent yet. */
  var isDraft: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether the message has been read. */
  var isRead: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether a read receipt is requested for the message. */
  var isReadReceiptRequested: js.UndefOr[scala.Boolean] = js.undefined
  /** The collection of multi-value extended properties defined for the message. Nullable. */
  var multiValueExtendedProperties: js.UndefOr[js.Array[MultiValueLegacyExtendedProperty]] = js.undefined
  /** The unique identifier for the message's parent mailFolder. */
  var parentFolderId: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time the message was received. */
  var receivedDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** The email addresses to use when replying. */
  var replyTo: js.UndefOr[js.Array[Recipient]] = js.undefined
  /**
    * The account that is actually used to generate the message. In most cases, this value is the same as the from property.
    * You can set this property to a different value when sending a message from a shared mailbox, or sending a message as a delegate.
    * In any case, the value must correspond to the actual mailbox used. Find out more about setting the from and sender properties of a message.
    */
  var sender: js.UndefOr[Recipient] = js.undefined
  /** The date and time the message was sent. */
  var sentDateTime: js.UndefOr[java.lang.String] = js.undefined
  /** The collection of single-value extended properties defined for the message. Nullable. */
  var singleValueExtendedProperties: js.UndefOr[js.Array[SingleValueLegacyExtendedProperty]] = js.undefined
  /** The subject of the message. */
  var subject: js.UndefOr[java.lang.String] = js.undefined
  /** The To: recipients for the message. */
  var toRecipients: js.UndefOr[js.Array[Recipient]] = js.undefined
  /**
    * The part of the body of the message that is unique to the current message.
    * uniqueBody is not returned by default but can be retrieved for a given message by use of the ?$select=uniqueBody query. It can be in HTML or text format.
    */
  var uniqueBody: js.UndefOr[ItemBody] = js.undefined
  /**
    * The URL to open the message in Outlook Web App.You can append an ispopout argument to the end of the URL to change how the message is displayed.
    * If ispopout is not present or if it is set to 1, then the message is shown in a popout window. If ispopout is set to 0,
    * then the browser will show the message in the Outlook Web App review pane.The message will open in the browser if you are logged in to your mailbox via Outlook Web App.
    * You will be prompted to login if you are not already logged in with the browser.This URL can be accessed from within an iFrame.
    */
  var webLink: js.UndefOr[java.lang.String] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    attachments: js.Array[Attachment] = null,
    bccRecipients: js.Array[Recipient] = null,
    body: ItemBody = null,
    bodyPreview: java.lang.String = null,
    categories: js.Array[java.lang.String] = null,
    ccRecipients: js.Array[Recipient] = null,
    changeKey: java.lang.String = null,
    conversationId: java.lang.String = null,
    createdDateTime: java.lang.String = null,
    extensions: js.Array[Extension] = null,
    flag: FollowupFlag = null,
    from: Recipient = null,
    hasAttachments: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    importance: Importance = null,
    inferenceClassification: InferenceClassificationType = null,
    internetMessageHeaders: js.Array[InternetMessageHeader] = null,
    internetMessageId: java.lang.String = null,
    isDeliveryReceiptRequested: js.UndefOr[scala.Boolean] = js.undefined,
    isDraft: js.UndefOr[scala.Boolean] = js.undefined,
    isRead: js.UndefOr[scala.Boolean] = js.undefined,
    isReadReceiptRequested: js.UndefOr[scala.Boolean] = js.undefined,
    lastModifiedDateTime: java.lang.String = null,
    multiValueExtendedProperties: js.Array[MultiValueLegacyExtendedProperty] = null,
    parentFolderId: java.lang.String = null,
    receivedDateTime: java.lang.String = null,
    replyTo: js.Array[Recipient] = null,
    sender: Recipient = null,
    sentDateTime: java.lang.String = null,
    singleValueExtendedProperties: js.Array[SingleValueLegacyExtendedProperty] = null,
    subject: java.lang.String = null,
    toRecipients: js.Array[Recipient] = null,
    uniqueBody: ItemBody = null,
    webLink: java.lang.String = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments)
    if (bccRecipients != null) __obj.updateDynamic("bccRecipients")(bccRecipients)
    if (body != null) __obj.updateDynamic("body")(body)
    if (bodyPreview != null) __obj.updateDynamic("bodyPreview")(bodyPreview)
    if (categories != null) __obj.updateDynamic("categories")(categories)
    if (ccRecipients != null) __obj.updateDynamic("ccRecipients")(ccRecipients)
    if (changeKey != null) __obj.updateDynamic("changeKey")(changeKey)
    if (conversationId != null) __obj.updateDynamic("conversationId")(conversationId)
    if (createdDateTime != null) __obj.updateDynamic("createdDateTime")(createdDateTime)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (from != null) __obj.updateDynamic("from")(from)
    if (!js.isUndefined(hasAttachments)) __obj.updateDynamic("hasAttachments")(hasAttachments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (importance != null) __obj.updateDynamic("importance")(importance)
    if (inferenceClassification != null) __obj.updateDynamic("inferenceClassification")(inferenceClassification)
    if (internetMessageHeaders != null) __obj.updateDynamic("internetMessageHeaders")(internetMessageHeaders)
    if (internetMessageId != null) __obj.updateDynamic("internetMessageId")(internetMessageId)
    if (!js.isUndefined(isDeliveryReceiptRequested)) __obj.updateDynamic("isDeliveryReceiptRequested")(isDeliveryReceiptRequested)
    if (!js.isUndefined(isDraft)) __obj.updateDynamic("isDraft")(isDraft)
    if (!js.isUndefined(isRead)) __obj.updateDynamic("isRead")(isRead)
    if (!js.isUndefined(isReadReceiptRequested)) __obj.updateDynamic("isReadReceiptRequested")(isReadReceiptRequested)
    if (lastModifiedDateTime != null) __obj.updateDynamic("lastModifiedDateTime")(lastModifiedDateTime)
    if (multiValueExtendedProperties != null) __obj.updateDynamic("multiValueExtendedProperties")(multiValueExtendedProperties)
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId)
    if (receivedDateTime != null) __obj.updateDynamic("receivedDateTime")(receivedDateTime)
    if (replyTo != null) __obj.updateDynamic("replyTo")(replyTo)
    if (sender != null) __obj.updateDynamic("sender")(sender)
    if (sentDateTime != null) __obj.updateDynamic("sentDateTime")(sentDateTime)
    if (singleValueExtendedProperties != null) __obj.updateDynamic("singleValueExtendedProperties")(singleValueExtendedProperties)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (toRecipients != null) __obj.updateDynamic("toRecipients")(toRecipients)
    if (uniqueBody != null) __obj.updateDynamic("uniqueBody")(uniqueBody)
    if (webLink != null) __obj.updateDynamic("webLink")(webLink)
    __obj.asInstanceOf[Message]
  }
}

