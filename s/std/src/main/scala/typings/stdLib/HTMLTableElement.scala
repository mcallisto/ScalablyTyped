package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating the layout and presentation of tables in an HTML document. */
@js.native
trait HTMLTableElement extends HTMLElement {
  /**
    * Sets or retrieves a value that indicates the table alignment.
    */
  /** @deprecated */
  var align: java.lang.String = js.native
  /** @deprecated */
  var bgColor: java.lang.String = js.native
  /**
    * Sets or retrieves the width of the border to draw around the object.
    */
  /** @deprecated */
  var border: java.lang.String = js.native
  /**
    * Retrieves the caption object of a table.
    */
  var caption: HTMLTableCaptionElement | scala.Null = js.native
  /**
    * Sets or retrieves the amount of space between the border of the cell and the content of the cell.
    */
  /** @deprecated */
  var cellPadding: java.lang.String = js.native
  /**
    * Sets or retrieves the amount of space between cells in a table.
    */
  /** @deprecated */
  var cellSpacing: java.lang.String = js.native
  /**
    * Sets or retrieves the way the border frame around the table is displayed.
    */
  /** @deprecated */
  var frame: java.lang.String = js.native
  /**
    * Sets or retrieves the number of horizontal rows contained in the object.
    */
  val rows: HTMLCollectionOf[HTMLTableRowElement] = js.native
  /**
    * Sets or retrieves which dividing lines (inner borders) are displayed.
    */
  /** @deprecated */
  var rules: java.lang.String = js.native
  /**
    * Sets or retrieves a description and/or structure of the object.
    */
  /** @deprecated */
  var summary: java.lang.String = js.native
  /**
    * Retrieves a collection of all tBody objects in the table. Objects in this collection are in source order.
    */
  val tBodies: HTMLCollectionOf[HTMLTableSectionElement] = js.native
  /**
    * Retrieves the tFoot object of the table.
    */
  var tFoot: HTMLTableSectionElement | scala.Null = js.native
  /**
    * Retrieves the tHead object of the table.
    */
  var tHead: HTMLTableSectionElement | scala.Null = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  /** @deprecated */
  var width: java.lang.String = js.native
  /**
    * Creates an empty caption element in the table.
    */
  def createCaption(): HTMLTableCaptionElement = js.native
  /**
    * Creates an empty tBody element in the table.
    */
  def createTBody(): HTMLTableSectionElement = js.native
  /**
    * Creates an empty tFoot element in the table.
    */
  def createTFoot(): HTMLTableSectionElement = js.native
  /**
    * Returns the tHead element object if successful, or null otherwise.
    */
  def createTHead(): HTMLTableSectionElement = js.native
  /**
    * Deletes the caption element and its contents from the table.
    */
  def deleteCaption(): scala.Unit = js.native
  /**
    * Removes the specified row (tr) from the element and from the rows collection.
    * @param index Number that specifies the zero-based position in the rows collection of the row to remove.
    */
  def deleteRow(index: scala.Double): scala.Unit = js.native
  /**
    * Deletes the tFoot element and its contents from the table.
    */
  def deleteTFoot(): scala.Unit = js.native
  /**
    * Deletes the tHead element and its contents from the table.
    */
  def deleteTHead(): scala.Unit = js.native
  /**
    * Creates a new row (tr) in the table, and adds the row to the rows collection.
    * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
    */
  def insertRow(): HTMLTableRowElement = js.native
  def insertRow(index: scala.Double): HTMLTableRowElement = js.native
}

@JSGlobal("HTMLTableElement")
@js.native
class HTMLTableElementCls () extends HTMLTableElement {
  /* CompleteClass */
  override val assignedSlot: HTMLSlotElement | scala.Null = js.native
  /* CompleteClass */
  override var contentEditable: java.lang.String = js.native
  /* CompleteClass */
  override var innerHTML: java.lang.String = js.native
  /* CompleteClass */
  override var inputMode: java.lang.String = js.native
  /* CompleteClass */
  override val isContentEditable: scala.Boolean = js.native
  /**
    * Returns the first following sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val nextElementSibling: Element | scala.Null = js.native
  /**
    * Returns the first preceding sibling that
    * is an element, and null otherwise.
    */
  /* CompleteClass */
  override val previousElementSibling: Element | scala.Null = js.native
  /* CompleteClass */
  override val style: CSSStyleDeclaration = js.native
}

@JSGlobal("HTMLTableElement")
@js.native
object HTMLTableElement
  extends org.scalablytyped.runtime.Instantiable0[HTMLTableElement]

