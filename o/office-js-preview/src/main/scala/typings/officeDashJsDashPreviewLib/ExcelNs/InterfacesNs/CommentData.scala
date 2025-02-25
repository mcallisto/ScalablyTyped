package typings
package officeDashJsDashPreviewLib.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "comment.toJSON()". */
trait CommentData extends js.Object {
  /**
    *
    * Gets the email of the comment's author.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var authorEmail: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the name of the comment's author.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var authorName: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets or sets the comment's content. The string is plain text.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var content: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Gets the creation time of the comment. Returns null if the comment was converted from a note, since the comment does not have a creation date.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var creationDate: js.UndefOr[stdLib.Date] = js.undefined
  /**
    *
    * Represents the comment identifier. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    *
    * Represents a collection of reply objects associated with the comment. Read-only.
    *
    * [Api set: ExcelApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var replies: js.UndefOr[js.Array[CommentReplyData]] = js.undefined
}

object CommentData {
  @scala.inline
  def apply(
    authorEmail: java.lang.String = null,
    authorName: java.lang.String = null,
    content: java.lang.String = null,
    creationDate: stdLib.Date = null,
    id: java.lang.String = null,
    replies: js.Array[CommentReplyData] = null
  ): CommentData = {
    val __obj = js.Dynamic.literal()
    if (authorEmail != null) __obj.updateDynamic("authorEmail")(authorEmail)
    if (authorName != null) __obj.updateDynamic("authorName")(authorName)
    if (content != null) __obj.updateDynamic("content")(content)
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (id != null) __obj.updateDynamic("id")(id)
    if (replies != null) __obj.updateDynamic("replies")(replies)
    __obj.asInstanceOf[CommentData]
  }
}

