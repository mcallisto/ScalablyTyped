package typings
package officeDashJsDashPreviewLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a contiguous area in a document.
  *
  * [Api set: WordApi 1.1]
  */
@JSGlobal("Word.Range")
@js.native
class Range ()
  extends officeDashJsDashPreviewLib.OfficeExtensionNs.ClientObject {
  /**
    *
    * Gets the collection of content control objects in the range. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val contentControls: ContentControlCollection = js.native
  /** The request context associated with the object. This connects the add-in's process to the Office host application's process. */
  @JSName("context")
  var context_Range: RequestContext = js.native
  /**
    *
    * Gets the text format of the range. Use this to get and set font name, size, color, and other properties. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val font: Font = js.native
  /**
    *
    * Gets the first hyperlink in the range, or sets a hyperlink on the range. All hyperlinks in the range are deleted when you set a new hyperlink on the range. Use a '#' to separate the address part from the optional location part.
    *
    * [Api set: WordApi 1.3]
    */
  var hyperlink: java.lang.String = js.native
  /**
    *
    * Gets the collection of inline picture objects in the range. Read-only.
    *
    * [Api set: WordApi 1.2]
    */
  val inlinePictures: InlinePictureCollection = js.native
  /**
    *
    * Checks whether the range length is zero. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val isEmpty: scala.Boolean = js.native
  /**
    *
    * Gets the collection of list objects in the range. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val lists: ListCollection = js.native
  /**
    *
    * Gets the collection of paragraph objects in the range. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val paragraphs: ParagraphCollection = js.native
  /**
    *
    * Gets the parent body of the range. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentBody: Body = js.native
  /**
    *
    * Gets the content control that contains the range. Throws if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val parentContentControl: ContentControl = js.native
  /**
    *
    * Gets the content control that contains the range. Returns a null object if there isn't a parent content control. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentContentControlOrNullObject: ContentControl = js.native
  /**
    *
    * Gets the table that contains the range. Throws if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTable: Table = js.native
  /**
    *
    * Gets the table cell that contains the range. Throws if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCell: TableCell = js.native
  /**
    *
    * Gets the table cell that contains the range. Returns a null object if it is not contained in a table cell. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableCellOrNullObject: TableCell = js.native
  /**
    *
    * Gets the table that contains the range. Returns a null object if it is not contained in a table. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val parentTableOrNullObject: Table = js.native
  /**
    *
    * Gets or sets the style name for the range. Use this property for custom styles and localized style names. To use the built-in styles that are portable between locales, see the "styleBuiltIn" property.
    *
    * [Api set: WordApi 1.1]
    */
  var style: java.lang.String = js.native
  /**
    *
    * Gets or sets the built-in style name for the range. Use this property for built-in styles that are portable between locales. To use custom styles or localized style names, see the "style" property.
    *
    * [Api set: WordApi 1.3]
    */
  var styleBuiltIn: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 149 */ js.Any = js.native
  /**
    *
    * Gets the collection of table objects in the range. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  val tables: TableCollection = js.native
  /**
    *
    * Gets the text of the range. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  val text: java.lang.String = js.native
  /**
    *
    * Clears the contents of the range object. The user can perform the undo operation on the cleared content.
    *
    * [Api set: WordApi 1.1]
    */
  def clear(): scala.Unit = js.native
  /**
    *
    * Compares this range's location with another range's location.
    *
    * [Api set: WordApi 1.3]
    *
    * @param range Required. The range to compare with this range.
    */
  def compareLocationWith(range: Range): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[LocationRelation] = js.native
  /**
    *
    * Deletes the range and its content from the document.
    *
    * [Api set: WordApi 1.1]
    */
  def delete(): scala.Unit = js.native
  /**
    *
    * Returns a new range that extends from this range in either direction to cover another range. This range is not changed. Throws if the two ranges do not have a union.
    *
    * [Api set: WordApi 1.3]
    *
    * @param range Required. Another range.
    */
  def expandTo(range: Range): Range = js.native
  /**
    *
    * Returns a new range that extends from this range in either direction to cover another range. This range is not changed. Returns a null object if the two ranges do not have a union.
    *
    * [Api set: WordApi 1.3]
    *
    * @param range Required. Another range.
    */
  def expandToOrNullObject(range: Range): Range = js.native
  /**
    *
    * Gets the names all bookmarks in or overlapping the range. A bookmark is hidden if its name starts with the underscore character.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param includeHidden Optional. Indicates whether to include hidden bookmarks. Default is false which indicates that the hidden bookmarks are excluded.
    * @param includeAdjacent Optional. Indicates whether to include bookmarks that are adjacent to the range. Default is false which indicates that the adjacent bookmarks are excluded.
    */
  def getBookmarks(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  def getBookmarks(includeHidden: scala.Boolean): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  def getBookmarks(includeHidden: scala.Boolean, includeAdjacent: scala.Boolean): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[js.Array[java.lang.String]] = js.native
  /**
    *
    * Gets an HTML representation of the range object. When rendered in a web page or HTML viewer, the formatting will be a close, but not exact, match to the formatting of the document. This method does not return the exact same HTML for the same document on different platforms (Windows, Mac, etc.). If you need exact fidelity, or consistency across platforms, use `Range.getOoxml()` and convert the returned XML to HTML.
    *
    * [Api set: WordApi 1.1]
    */
  def getHtml(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
    *
    * Gets hyperlink child ranges within the range.
    *
    * [Api set: WordApi 1.3]
    */
  def getHyperlinkRanges(): RangeCollection = js.native
  /**
    *
    * Gets the next text range by using punctuation marks and/or other ending marks. Throws if this text range is the last one.
    *
    * [Api set: WordApi 1.3]
    *
    * @param endingMarks Required. The punctuation marks and/or other ending marks as an array of strings.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the returned range. Default is false which indicates that spacing characters at the start and end of the range are included.
    */
  def getNextTextRange(endingMarks: js.Array[java.lang.String]): Range = js.native
  def getNextTextRange(endingMarks: js.Array[java.lang.String], trimSpacing: scala.Boolean): Range = js.native
  /**
    *
    * Gets the next text range by using punctuation marks and/or other ending marks. Returns a null object if this text range is the last one.
    *
    * [Api set: WordApi 1.3]
    *
    * @param endingMarks Required. The punctuation marks and/or other ending marks as an array of strings.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the returned range. Default is false which indicates that spacing characters at the start and end of the range are included.
    */
  def getNextTextRangeOrNullObject(endingMarks: js.Array[java.lang.String]): Range = js.native
  def getNextTextRangeOrNullObject(endingMarks: js.Array[java.lang.String], trimSpacing: scala.Boolean): Range = js.native
  /**
    *
    * Gets the OOXML representation of the range object.
    *
    * [Api set: WordApi 1.1]
    */
  def getOoxml(): officeDashJsDashPreviewLib.OfficeExtensionNs.ClientResult[java.lang.String] = js.native
  /**
    *
    * Clones the range, or gets the starting or ending point of the range as a new range.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rangeLocation Optional. The range location can be 'Whole', 'Start', 'End', 'After', or 'Content'.
    */
  def getRange(): Range = js.native
  def getRange(rangeLocation: RangeLocation): Range = js.native
  @JSName("getRange")
  def getRange_After(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After): Range = js.native
  @JSName("getRange")
  def getRange_Before(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before): Range = js.native
  @JSName("getRange")
  def getRange_Content(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Content): Range = js.native
  @JSName("getRange")
  def getRange_End(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End): Range = js.native
  @JSName("getRange")
  def getRange_Start(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start): Range = js.native
  @JSName("getRange")
  def getRange_Whole(rangeLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Whole): Range = js.native
  /**
    *
    * Gets the text child ranges in the range by using punctuation marks and/or other ending marks.
    *
    * [Api set: WordApi 1.3]
    *
    * @param endingMarks Required. The punctuation marks and/or other ending marks as an array of strings.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
    */
  def getTextRanges(endingMarks: js.Array[java.lang.String]): RangeCollection = js.native
  def getTextRanges(endingMarks: js.Array[java.lang.String], trimSpacing: scala.Boolean): RangeCollection = js.native
  /**
    *
    * Inserts a bookmark on the range. If a bookmark of the same name exists somewhere, it is deleted first.
    *
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    *
    * @param name Required. The bookmark name, which is case-insensitive. If the name starts with an underscore character, the bookmark is an hidden one.
    */
  def insertBookmark(name: java.lang.String): scala.Unit = js.native
  /**
    *
    * Inserts a break at the specified location in the main document. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. The break type to add.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertBreak(
    breakType: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Page | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Next | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionNext | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionContinuous | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionEven | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.SectionOdd | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Line,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End | officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): scala.Unit = js.native
  /**
    *
    * Inserts a break at the specified location in the main document. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param breakType Required. The break type to add.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertBreak(breakType: BreakType, insertLocation: InsertLocation): scala.Unit = js.native
  /**
    *
    * Wraps the range object with a rich text content control.
    *
    * [Api set: WordApi 1.1]
    */
  def insertContentControl(): ContentControl = js.native
  /**
    *
    * Inserts a document at the specified location. The insertLocation value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertFileFromBase64(base64File: java.lang.String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_After(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Range = js.native
  /**
    *
    * Inserts a document at the specified location. The insertLocation value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param base64File Required. The base64 encoded content of a .docx file.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Before(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_End(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Replace(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Range = js.native
  @JSName("insertFileFromBase64")
  def insertFileFromBase64_Start(
    base64File: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Range = js.native
  /**
    *
    * Inserts HTML at the specified location. The insertLocation value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertHtml(html: java.lang.String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertHtml")
  def insertHtml_After(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Range = js.native
  /**
    *
    * Inserts HTML at the specified location. The insertLocation value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param html Required. The HTML to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  @JSName("insertHtml")
  def insertHtml_Before(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Range = js.native
  @JSName("insertHtml")
  def insertHtml_End(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Range = js.native
  @JSName("insertHtml")
  def insertHtml_Replace(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Range = js.native
  @JSName("insertHtml")
  def insertHtml_Start(
    html: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Range = js.native
  /**
    *
    * Inserts a picture at the specified location. The insertLocation value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertInlinePictureFromBase64(base64EncodedImage: java.lang.String, insertLocation: InsertLocation): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_After(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): InlinePicture = js.native
  /**
    *
    * Inserts a picture at the specified location. The insertLocation value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.2]
    *
    * @param base64EncodedImage Required. The base64 encoded image to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Before(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_End(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Replace(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): InlinePicture = js.native
  @JSName("insertInlinePictureFromBase64")
  def insertInlinePictureFromBase64_Start(
    base64EncodedImage: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): InlinePicture = js.native
  /**
    *
    * Inserts OOXML at the specified location.  The insertLocation value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertOoxml(ooxml: java.lang.String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_After(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Range = js.native
  /**
    *
    * Inserts OOXML at the specified location.  The insertLocation value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param ooxml Required. The OOXML to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  @JSName("insertOoxml")
  def insertOoxml_Before(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_End(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_Replace(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Range = js.native
  @JSName("insertOoxml")
  def insertOoxml_Start(
    ooxml: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Range = js.native
  /**
    *
    * Inserts a paragraph at the specified location. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  def insertParagraph(paragraphText: java.lang.String, insertLocation: InsertLocation): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_After(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Paragraph = js.native
  /**
    *
    * Inserts a paragraph at the specified location. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param paragraphText Required. The paragraph text to be inserted.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    */
  @JSName("insertParagraph")
  def insertParagraph_Before(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_End(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Replace(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Paragraph = js.native
  @JSName("insertParagraph")
  def insertParagraph_Start(
    paragraphText: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Paragraph = js.native
  /**
    *
    * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  def insertTable(rowCount: scala.Double, columnCount: scala.Double, insertLocation: InsertLocation): Table = js.native
  def insertTable(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: InsertLocation,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_After(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_After(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
    *
    * Inserts a table with the specified number of rows and columns. The insertLocation value can be 'Before' or 'After'.
    *
    * [Api set: WordApi 1.3]
    *
    * @param rowCount Required. The number of rows in the table.
    * @param columnCount Required. The number of columns in the table.
    * @param insertLocation Required. The value can be 'Before' or 'After'.
    * @param values Optional 2D array. Cells are filled if the corresponding strings are specified in the array.
    */
  @JSName("insertTable")
  def insertTable_Before(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_Before(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_End(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_End(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_Replace(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_Replace(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_Start(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Table = js.native
  @JSName("insertTable")
  def insertTable_Start(
    rowCount: scala.Double,
    columnCount: scala.Double,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start,
    values: js.Array[js.Array[java.lang.String]]
  ): Table = js.native
  /**
    *
    * Inserts text at the specified location. The insertLocation value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  def insertText(text: java.lang.String, insertLocation: InsertLocation): Range = js.native
  @JSName("insertText")
  def insertText_After(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.After
  ): Range = js.native
  /**
    *
    * Inserts text at the specified location. The insertLocation value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    *
    * [Api set: WordApi 1.1]
    *
    * @param text Required. Text to be inserted.
    * @param insertLocation Required. The value can be 'Replace', 'Start', 'End', 'Before', or 'After'.
    */
  @JSName("insertText")
  def insertText_Before(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Before
  ): Range = js.native
  @JSName("insertText")
  def insertText_End(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End
  ): Range = js.native
  @JSName("insertText")
  def insertText_Replace(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Replace
  ): Range = js.native
  @JSName("insertText")
  def insertText_Start(
    text: java.lang.String,
    insertLocation: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start
  ): Range = js.native
  /**
    *
    * Returns a new range as the intersection of this range with another range. This range is not changed. Throws if the two ranges are not overlapped or adjacent.
    *
    * [Api set: WordApi 1.3]
    *
    * @param range Required. Another range.
    */
  def intersectWith(range: Range): Range = js.native
  /**
    *
    * Returns a new range as the intersection of this range with another range. This range is not changed. Returns a null object if the two ranges are not overlapped or adjacent.
    *
    * [Api set: WordApi 1.3]
    *
    * @param range Required. Another range.
    */
  def intersectWithOrNullObject(range: Range): Range = js.native
  /**
    * Queues up a command to load the specified properties of the object. You must call "context.sync()" before reading the properties.
    *
    * @remarks
    *
    * In addition to this signature, this method has the following signatures:
    *
    * `load(option?: string | string[]): Word.Range` - Where option is a comma-delimited string or an array of strings that specify the properties to load.
    *
    * `load(option?: { select?: string; expand?: string; }): Word.Range` - Where option.select is a comma-delimited string that specifies the properties to load, and options.expand is a comma-delimited string that specifies the navigation properties to load.
    *
    * `load(option?: { select?: string; expand?: string; top?: number; skip?: number }): Word.Range` - Only available on collection types. It is similar to the preceding signature. Option.top specifies the maximum number of collection items that can be included in the result. Option.skip specifies the number of items that are to be skipped and not included in the result. If option.top is specified, the result set will start after skipping the specified number of items.
    *
    * @param options Provides options for which properties of the object to load.
    */
  def load(): Range = js.native
  def load(option: java.lang.String): Range = js.native
  def load(option: js.Array[java.lang.String]): Range = js.native
  def load(option: officeDashJsDashPreviewLib.Anon_Expand): Range = js.native
  def load(option: officeDashJsDashPreviewLib.WordNs.InterfacesNs.RangeLoadOptions): Range = js.native
  /**
    *
    * Performs a search with the specified SearchOptions on the scope of the range object. The search results are a collection of range objects.
    *
    * [Api set: WordApi 1.1]
    *
    * @param searchText Required. The search text.
    * @param searchOptions Optional. Options for the search.
    */
  def search(searchText: java.lang.String): RangeCollection = js.native
  def search(searchText: java.lang.String, searchOptions: officeDashJsDashPreviewLib.Anon_IgnorePunct): RangeCollection = js.native
  def search(searchText: java.lang.String, searchOptions: SearchOptions): RangeCollection = js.native
  /**
    *
    * Selects and navigates the Word UI to the range.
    *
    * [Api set: WordApi 1.1]
    *
    * @param selectionMode Optional. The selection mode can be 'Select', 'Start', or 'End'. 'Select' is the default.
    */
  def select(): scala.Unit = js.native
  def select(selectionMode: SelectionMode): scala.Unit = js.native
  @JSName("select")
  def select_End(selectionMode: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.End): scala.Unit = js.native
  @JSName("select")
  def select_Select(selectionMode: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Select): scala.Unit = js.native
  @JSName("select")
  def select_Start(selectionMode: officeDashJsDashPreviewLib.officeDashJsDashPreviewLibStrings.Start): scala.Unit = js.native
  /** Sets multiple properties of an object at the same time. You can pass either a plain object with the appropriate properties, or another API object of the same type.
    *
    * @remarks
    *
    * This method has the following additional signature:
    *
    * `set(properties: Word.Range): void`
    *
    * @param properties A JavaScript object with properties that are structured isomorphically to the properties of the object on which the method is called.
    * @param options Provides an option to suppress errors if the properties object tries to set any read-only properties.
    */
  def set(properties: officeDashJsDashPreviewLib.WordNs.InterfacesNs.RangeUpdateData): scala.Unit = js.native
  def set(
    properties: officeDashJsDashPreviewLib.WordNs.InterfacesNs.RangeUpdateData,
    options: officeDashJsDashPreviewLib.OfficeExtensionNs.UpdateOptions
  ): scala.Unit = js.native
  /** Sets multiple properties on the object at the same time, based on an existing loaded object. */
  def set(properties: Range): scala.Unit = js.native
  /**
    *
    * Splits the range into child ranges by using delimiters.
    *
    * [Api set: WordApi 1.3]
    *
    * @param delimiters Required. The delimiters as an array of strings.
    * @param multiParagraphs Optional. Indicates whether a returned child range can cover multiple paragraphs. Default is false which indicates that the paragraph boundaries are also used as delimiters.
    * @param trimDelimiters Optional. Indicates whether to trim delimiters from the ranges in the range collection. Default is false which indicates that the delimiters are included in the ranges returned in the range collection.
    * @param trimSpacing Optional. Indicates whether to trim spacing characters (spaces, tabs, column breaks, and paragraph end marks) from the start and end of the ranges returned in the range collection. Default is false which indicates that spacing characters at the start and end of the ranges are included in the range collection.
    */
  def split(delimiters: js.Array[java.lang.String]): RangeCollection = js.native
  def split(delimiters: js.Array[java.lang.String], multiParagraphs: scala.Boolean): RangeCollection = js.native
  def split(
    delimiters: js.Array[java.lang.String],
    multiParagraphs: scala.Boolean,
    trimDelimiters: scala.Boolean
  ): RangeCollection = js.native
  def split(
    delimiters: js.Array[java.lang.String],
    multiParagraphs: scala.Boolean,
    trimDelimiters: scala.Boolean,
    trimSpacing: scala.Boolean
  ): RangeCollection = js.native
  /**
    * Overrides the JavaScript `toJSON()` method in order to provide more useful output when an API object is passed to `JSON.stringify()`. (`JSON.stringify`, in turn, calls the `toJSON` method of the object that is passed to it.)
    * Whereas the original Word.Range object is an API object, the `toJSON` method returns a plain JavaScript object (typed as `Word.Interfaces.RangeData`) that contains shallow copies of any loaded child properties from the original object.
    */
  def toJSON(): officeDashJsDashPreviewLib.WordNs.InterfacesNs.RangeData = js.native
  /**
    * Track the object for automatic adjustment based on surrounding changes in the document. This call is a shorthand for context.trackedObjects.add(thisObject). If you are using this object across ".sync" calls and outside the sequential execution of a ".run" batch, and get an "InvalidObjectPath" error when setting a property or invoking a method on the object, you needed to have added the object to the tracked object collection when the object was first created.
    */
  def track(): Range = js.native
  /**
    * Release the memory associated with this object, if it has previously been tracked. This call is shorthand for context.trackedObjects.remove(thisObject). Having many tracked objects slows down the host application, so please remember to free any objects you add, once you're done using them. You will need to call "context.sync()" before the memory release takes effect.
    */
  def untrack(): Range = js.native
}

