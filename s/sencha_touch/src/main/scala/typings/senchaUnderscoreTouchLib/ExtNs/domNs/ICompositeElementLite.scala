package typings
package senchaUnderscoreTouchLib.ExtNs.domNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompositeElementLite extends IElement {
  /** [Method] Adds elements to this Composite object
  		* @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an Array of DOM elements to add, or another Composite object who's elements should be added.
  		* @param root HTMLElement/String The root element of the query or id of the root.
  		* @returns Ext.dom.CompositeElementLite This Composite object.
  		*/
  var add: js.UndefOr[
    js.Function2[/* els */ js.UndefOr[js.Any], /* root */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Method] Adds the given CSS class es to this Element
  		* @param names String The CSS class(es) to add to this element.
  		* @param prefix String Prefix to prepend to each class.
  		* @param suffix String Suffix to append to each class.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("addCls")
  var addCls_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* names */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      IElement
    ]
  ] = js.undefined
  /** [Method] fixes scope with flyweight
  		* @param eventName Object
  		* @param handler Object
  		* @param scope Object
  		* @param opt Object
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  @JSName("addListener")
  var addListener_ICompositeElementLite: js.UndefOr[
    js.Function4[
      /* eventName */ js.UndefOr[js.Any], 
      /* handler */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      /* opt */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Appends the passed element s to this element
  		* @param element HTMLElement/Ext.dom.Element a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  @JSName("appendChild")
  var appendChild_ICompositeElementLite: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Appends this element to the passed element
  		* @param el String/HTMLElement/Ext.dom.Element The new parent element. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  @JSName("appendTo")
  var appendTo_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] More flexible version of setStyle for setting style properties
  		* @param styles String/Object/Function A style specification string, e.g. "width:100px", or object in the form {width:"100px"}, or a function which returns such a specification.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("applyStyles")
  var applyStyles_ICompositeElementLite: js.UndefOr[js.Function1[/* styles */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Removes all elements  */
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Creates the passed DomHelper config and appends it to this element or optionally inserts it before the passed child e
  		* @param config Object DomHelper element config object. If no tag is specified (e.g., {tag:'input'}) then a div will be automatically generated with the specified attributes.
  		* @param insertBefore HTMLElement a child element of this element.
  		* @param returnDom Boolean true to return the dom node instead of creating an Element.
  		* @returns Ext.dom.Element The new child element.
  		*/
  @JSName("createChild")
  var createChild_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* config */ js.UndefOr[js.Any], 
      /* insertBefore */ js.UndefOr[stdLib.HTMLElement], 
      /* returnDom */ js.UndefOr[scala.Boolean], 
      IElement
    ]
  ] = js.undefined
  /** [Method] Calls the passed function for each element in this composite
  		* @param fn Function The function to call.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to the Element.
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  var each: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  /** [Property] (HTMLElement[]) */
  var elements: js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] = js.undefined
  /** [Method] Clears this Composite and adds the elements passed
  		* @param els HTMLElement[]/Ext.dom.CompositeElementLite Either an array of DOM elements, or another Composite from which to fill this Composite.
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  var fill: js.UndefOr[js.Function1[/* els */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Filters this composite to only elements that match the passed selector
  		* @param selector String/Function A string CSS selector or a comparison function. The comparison function will be called with the following arguments:
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  var filter: js.UndefOr[js.Function1[/* selector */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Returns the number of elements in this Composite
  		* @returns Number
  		*/
  var getCount: js.UndefOr[js.Function0[scala.Double]] = js.undefined
  /** [Method] Find the index of the passed element within the composite collection
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, or an Ext.dom.Element, or an HtmlElement to find within the composite collection.
  		* @returns Number The index of the passed Ext.dom.Element in the composite collection, or -1 if not found.
  		*/
  var indexOf: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], scala.Double]] = js.undefined
  /** [Method] Inserts this element after the passed element in the DOM
  		* @param el String/HTMLElement/Ext.dom.Element The element to insert after. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  @JSName("insertAfter")
  var insertAfter_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Inserts this element before the passed element in the DOM
  		* @param el String/HTMLElement/Ext.dom.Element The element before which this element will be inserted. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  @JSName("insertBefore")
  var insertBefore_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Inserts an element as the first child of this element
  		* @param element String/HTMLElement/Ext.dom.Element The id or element to insert.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("insertFirst")
  var insertFirst_ICompositeElementLite: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Inserts or creates the passed element or DomHelper config as a sibling of this element
  		* @param el String/HTMLElement/Ext.dom.Element/Object/Array The id, element to insert or a DomHelper config to create and insert or an array of any of those.
  		* @param where String 'before' or 'after'.
  		* @param returnDom Boolean true to return the raw DOM element instead of Ext.dom.Element.
  		* @returns Ext.dom.Element The inserted Element. If an array is passed, the last inserted element is returned.
  		*/
  @JSName("insertSibling")
  var insertSibling_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* where */ js.UndefOr[java.lang.String], 
      /* returnDom */ js.UndefOr[scala.Boolean], 
      IElement
    ]
  ] = js.undefined
  /** [Method] Returns a flyweight Element of the dom element object at the specified index
  		* @param index Number
  		* @returns Ext.dom.Element
  		*/
  var item: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], IElement]] = js.undefined
  /** [Method] Adds one or more CSS classes to this element and removes the same class es from all siblings
  		* @param className String/String[] The CSS class to add, or an array of classes.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("radioCls")
  var radioCls_ICompositeElementLite: js.UndefOr[js.Function1[/* className */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Removes the given CSS class es from this Element
  		* @param names String The CSS class(es) to remove from this element.
  		* @param prefix String Prefix to prepend to each class to be removed.
  		* @param suffix String Suffix to append to each class to be removed.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("removeCls")
  var removeCls_ICompositeElementLite: js.UndefOr[
    js.Function3[
      /* names */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      IElement
    ]
  ] = js.undefined
  /** [Method] Removes the specified element s
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite or an array of any of those.
  		* @param removeDom Boolean true to also remove the element from the document
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  var removeElement: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[scala.Boolean], this.type]
  ] = js.undefined
  /** [Method] Forces the browser to repaint this element
  		* @returns Ext.dom.Element this
  		*/
  @JSName("repaint")
  var repaint_ICompositeElementLite: js.UndefOr[js.Function0[IElement]] = js.undefined
  /** [Method] Replaces a CSS class on the element with another
  		* @param oldName String The CSS class to replace.
  		* @param newName String The replacement CSS class.
  		* @param prefix String Prefix to prepend to each class to be replaced.
  		* @param suffix String Suffix to append to each class to be replaced.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("replaceCls")
  var replaceCls_ICompositeElementLite: js.UndefOr[
    js.Function4[
      /* oldName */ js.UndefOr[java.lang.String], 
      /* newName */ js.UndefOr[java.lang.String], 
      /* prefix */ js.UndefOr[java.lang.String], 
      /* suffix */ js.UndefOr[java.lang.String], 
      IElement
    ]
  ] = js.undefined
  /** [Method] Replaces the specified element with the passed element
  		* @param el String/HTMLElement/Ext.Element/Number The id of an element, the Element itself, the index of the element in this composite to replace.
  		* @param replacement String/Ext.Element The id of an element or the Element itself.
  		* @param domReplace Boolean true to remove and replace the element in the document too.
  		* @returns Ext.dom.CompositeElementLite this
  		*/
  var replaceElement: js.UndefOr[
    js.Function3[
      /* el */ js.UndefOr[js.Any], 
      /* replacement */ js.UndefOr[js.Any], 
      /* domReplace */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Replaces this element with the passed element
  		* @param el String/HTMLElement/Ext.dom.Element/Object The new element (id of the node, a DOM Node or an existing Element) or a DomHelper config of an element to create.
  		* @returns Ext.dom.Element This element.
  		*/
  @JSName("replaceWith")
  var replaceWith_ICompositeElementLite: js.UndefOr[js.Function1[/* el */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Replaces the passed element with this element
  		* @param element String/HTMLElement/Ext.dom.Element The element to replace. The id of the node, a DOM Node or an existing Element.
  		* @returns Ext.dom.Element This element.
  		*/
  @JSName("replace")
  var replace_ICompositeElementLite: js.UndefOr[js.Function1[/* element */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Selects elements based on the passed CSS selector to enable Element methods to be applied to many related elements in
  		* @param selector String/HTMLElement[] The CSS selector or an array of elements
  		* @param composite Boolean Return a CompositeElement as opposed to a CompositeElementLite. Defaults to false.
  		* @returns Ext.dom.CompositeElementLite/Ext.dom.CompositeElement
  		*/
  var select: js.UndefOr[
    js.Function2[
      /* selector */ js.UndefOr[js.Any], 
      /* composite */ js.UndefOr[scala.Boolean], 
      this.type
    ]
  ] = js.undefined
  /** [Method] Sets the element s CSS bottom style
  		* @param bottom String The bottom CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setBottom")
  var setBottom_ICompositeElementLite: js.UndefOr[js.Function1[/* bottom */ js.UndefOr[java.lang.String], IElement]] = js.undefined
  /** [Method] Sets the element s box
  		* @param box Object The box to fill, for example: {  left: ...,  top: ...,  width: ...,  height: ... }
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setBox")
  var setBox_ICompositeElementLite: js.UndefOr[js.Function1[/* box */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Set the height of this Element
  		* @param height Number/String The new height.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setHeight")
  var setHeight_ICompositeElementLite: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Sets the element s left position directly using CSS style instead of setX
  		* @param left String The left CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setLeft")
  var setLeft_ICompositeElementLite: js.UndefOr[js.Function1[/* left */ js.UndefOr[java.lang.String], IElement]] = js.undefined
  /** [Method] Set the maximum height of this Element
  		* @param height Number/String The new maximum height.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setMaxHeight")
  var setMaxHeight_ICompositeElementLite: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Set the maximum width of this Element
  		* @param width Number/String The new maximum width.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setMaxWidth")
  var setMaxWidth_ICompositeElementLite: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Set the minimum height of this Element
  		* @param height Number/String The new minimum height.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setMinHeight")
  var setMinHeight_ICompositeElementLite: js.UndefOr[js.Function1[/* height */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Set the minimum width of this Element
  		* @param width Number/String The new minimum width.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setMinWidth")
  var setMinWidth_ICompositeElementLite: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Sets the element s CSS right style
  		* @param right String The right CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setRight")
  var setRight_ICompositeElementLite: js.UndefOr[js.Function1[/* right */ js.UndefOr[java.lang.String], IElement]] = js.undefined
  /** [Method] Set the size of this Element
  		* @param width Number/String The new width. This may be one of:  A Number specifying the new width in this Element's defaultUnits (by default, pixels). A String used to set the CSS width style. Animation may not be used. A size object in the format {width: widthValue, height: heightValue}.
  		* @param height Number/String The new height. This may be one of:  A Number specifying the new height in this Element's defaultUnits (by default, pixels). A String used to set the CSS height style. Animation may not be used.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setSize")
  var setSize_ICompositeElementLite: js.UndefOr[
    js.Function2[/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], IElement]
  ] = js.undefined
  /** [Method] Wrapper for setting style properties also takes single object parameter of multiple styles
  		* @param property String/Object The style property to be set, or an object of multiple styles.
  		* @param value String The value to apply to the given property, or null if an object was passed.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setStyle")
  var setStyle_ICompositeElementLite: js.UndefOr[
    js.Function2[
      /* property */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[java.lang.String], 
      IElement
    ]
  ] = js.undefined
  /** [Method] Sets the element s top position directly using CSS style instead of setY
  		* @param top String The top CSS property value.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setTop")
  var setTop_ICompositeElementLite: js.UndefOr[js.Function1[/* top */ js.UndefOr[java.lang.String], IElement]] = js.undefined
  /** [Method] Use this to change the visibility mode between VISIBILITY DISPLAY or OFFSETS
  		* @param mode Object
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setVisibilityMode")
  var setVisibilityMode_ICompositeElementLite: js.UndefOr[js.Function1[/* mode */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Sets the visibility of the element see details
  		* @param visible Boolean Whether the element is visible.
  		* @returns Ext.Element this
  		*/
  @JSName("setVisible")
  var setVisible_ICompositeElementLite: js.UndefOr[
    js.Function1[/* visible */ js.UndefOr[scala.Boolean], senchaUnderscoreTouchLib.ExtNs.IElement]
  ] = js.undefined
  /** [Method] Set the width of this Element
  		* @param width Number/String The new width.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setWidth")
  var setWidth_ICompositeElementLite: js.UndefOr[js.Function1[/* width */ js.UndefOr[js.Any], IElement]] = js.undefined
  /** [Method] Sets the position of the element in page coordinates regardless of how the element is positioned
  		* @param pos Number[] Contains X &amp; Y [x, y] values for new position (coordinates are page-based).
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setXY")
  var setXY_ICompositeElementLite: js.UndefOr[
    js.Function1[/* pos */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array], IElement]
  ] = js.undefined
  /** [Method] Sets the X position of the element based on page coordinates
  		* @param x Number The X position of the element
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setX")
  var setX_ICompositeElementLite: js.UndefOr[js.Function1[/* x */ js.UndefOr[scala.Double], IElement]] = js.undefined
  /** [Method] Sets the Y position of the element based on page coordinates
  		* @param y Number The Y position of the element.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("setY")
  var setY_ICompositeElementLite: js.UndefOr[js.Function1[/* y */ js.UndefOr[scala.Double], IElement]] = js.undefined
  /** [Method] Sets the passed attributes as attributes of this element a style attribute can be a string object or function
  		* @param attributes Object The object with the attributes.
  		* @param useSet Boolean false to override the default setAttribute to use expandos.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("set")
  var set_ICompositeElementLite: js.UndefOr[
    js.Function2[
      /* attributes */ js.UndefOr[js.Any], 
      /* useSet */ js.UndefOr[scala.Boolean], 
      IElement
    ]
  ] = js.undefined
  /** [Method] Toggles the specified CSS class on this element removes it if it already exists otherwise adds it
  		* @param className String The CSS class to toggle.
  		* @returns Ext.dom.Element this
  		*/
  @JSName("toggleCls")
  var toggleCls_ICompositeElementLite: js.UndefOr[js.Function1[/* className */ js.UndefOr[java.lang.String], IElement]] = js.undefined
}

object ICompositeElementLite {
  @scala.inline
  def apply(
    IElement: IElement = null,
    add: (/* els */ js.UndefOr[js.Any], /* root */ js.UndefOr[js.Any]) => ICompositeElementLite = null,
    addCls: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => IElement = null,
    addListener: (/* eventName */ js.UndefOr[js.Any], /* handler */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], /* opt */ js.UndefOr[js.Any]) => ICompositeElementLite = null,
    appendChild: /* element */ js.UndefOr[js.Any] => IElement = null,
    appendTo: /* el */ js.UndefOr[js.Any] => IElement = null,
    applyStyles: /* styles */ js.UndefOr[js.Any] => IElement = null,
    child: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[scala.Boolean]) => _ = null,
    clear: () => scala.Unit = null,
    contains: /* el */ js.UndefOr[js.Any] => scala.Boolean = null,
    createChild: (/* config */ js.UndefOr[js.Any], /* insertBefore */ js.UndefOr[stdLib.HTMLElement], /* returnDom */ js.UndefOr[scala.Boolean]) => IElement = null,
    cssTranslate: () => scala.Unit = null,
    destroy: () => scala.Unit = null,
    down: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[scala.Boolean]) => _ = null,
    each: (/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => ICompositeElementLite = null,
    elements: senchaUnderscoreTouchLib.ExtNs.Array = null,
    fill: /* els */ js.UndefOr[js.Any] => ICompositeElementLite = null,
    filter: /* selector */ js.UndefOr[js.Any] => ICompositeElementLite = null,
    findParent: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[scala.Boolean]) => _ = null,
    findParentNode: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any], /* returnEl */ js.UndefOr[scala.Boolean]) => _ = null,
    getAlignToXY: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[java.lang.String], /* offsets */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array]) => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getAnchorXY: (/* anchor */ js.UndefOr[java.lang.String], /* local */ js.UndefOr[scala.Boolean], /* size */ js.UndefOr[js.Any]) => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getAttribute: (/* name */ js.UndefOr[java.lang.String], /* namespace */ js.UndefOr[java.lang.String]) => java.lang.String = null,
    getBorderWidth: /* side */ js.UndefOr[java.lang.String] => scala.Double = null,
    getBottom: () => scala.Double = null,
    getBox: (/* contentBox */ js.UndefOr[scala.Boolean], /* local */ js.UndefOr[scala.Boolean]) => _ = null,
    getCount: () => scala.Double = null,
    getHTML: () => java.lang.String = null,
    getHeight: /* contentHeight */ js.UndefOr[scala.Boolean] => scala.Double = null,
    getHtml: () => java.lang.String = null,
    getLeft: () => scala.Double = null,
    getMargin: /* sides */ js.UndefOr[java.lang.String] => _ = null,
    getOffsetsTo: /* element */ js.UndefOr[js.Any] => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getOuterHeight: () => scala.Unit = null,
    getOuterWidth: () => scala.Unit = null,
    getPadding: /* side */ js.UndefOr[java.lang.String] => scala.Double = null,
    getPageBox: /* asRegion */ js.UndefOr[scala.Boolean] => _ = null,
    getRight: () => scala.Double = null,
    getScrollParent: () => scala.Unit = null,
    getSize: /* contentSize */ js.UndefOr[scala.Boolean] => _ = null,
    getStyle: /* prop */ js.UndefOr[java.lang.String] => java.lang.String = null,
    getTop: () => scala.Double = null,
    getValue: /* asNumber */ js.UndefOr[scala.Boolean] => _ = null,
    getViewSize: () => _ = null,
    getWidth: /* contentWidth */ js.UndefOr[scala.Boolean] => scala.Double = null,
    getX: () => scala.Double = null,
    getXY: () => senchaUnderscoreTouchLib.ExtNs.Array = null,
    getY: () => scala.Double = null,
    hasCls: /* name */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    hide: () => scala.Unit = null,
    indexOf: /* el */ js.UndefOr[js.Any] => scala.Double = null,
    insertAfter: /* el */ js.UndefOr[js.Any] => IElement = null,
    insertBefore: /* el */ js.UndefOr[js.Any] => IElement = null,
    insertFirst: /* element */ js.UndefOr[js.Any] => IElement = null,
    insertHtml: (/* where */ js.UndefOr[java.lang.String], /* html */ js.UndefOr[java.lang.String], /* returnEl */ js.UndefOr[scala.Boolean]) => _ = null,
    insertSibling: (/* el */ js.UndefOr[js.Any], /* where */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[scala.Boolean]) => IElement = null,
    is: /* selector */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    isDescendent: () => scala.Unit = null,
    isStyle: (/* style */ js.UndefOr[java.lang.String], /* value */ js.UndefOr[java.lang.String]) => scala.Boolean = null,
    isTransparent: /* prop */ js.UndefOr[java.lang.String] => scala.Boolean = null,
    item: /* index */ js.UndefOr[scala.Double] => IElement = null,
    mask: () => scala.Unit = null,
    next: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[scala.Boolean]) => _ = null,
    parent: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[scala.Boolean]) => _ = null,
    prev: (/* selector */ js.UndefOr[java.lang.String], /* returnDom */ js.UndefOr[scala.Boolean]) => _ = null,
    purgeAllListeners: () => scala.Unit = null,
    query: /* selector */ js.UndefOr[java.lang.String] => senchaUnderscoreTouchLib.ExtNs.Array = null,
    radioCls: /* className */ js.UndefOr[js.Any] => IElement = null,
    remove: () => scala.Unit = null,
    removeAllListeners: () => scala.Unit = null,
    removeCls: (/* names */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => IElement = null,
    removeElement: (/* el */ js.UndefOr[js.Any], /* removeDom */ js.UndefOr[scala.Boolean]) => ICompositeElementLite = null,
    repaint: () => IElement = null,
    replace: /* element */ js.UndefOr[js.Any] => IElement = null,
    replaceCls: (/* oldName */ js.UndefOr[java.lang.String], /* newName */ js.UndefOr[java.lang.String], /* prefix */ js.UndefOr[java.lang.String], /* suffix */ js.UndefOr[java.lang.String]) => IElement = null,
    replaceElement: (/* el */ js.UndefOr[js.Any], /* replacement */ js.UndefOr[js.Any], /* domReplace */ js.UndefOr[scala.Boolean]) => ICompositeElementLite = null,
    replaceWith: /* el */ js.UndefOr[js.Any] => IElement = null,
    select: (/* selector */ js.UndefOr[js.Any], /* composite */ js.UndefOr[scala.Boolean]) => ICompositeElementLite = null,
    serializeForm: /* form */ js.UndefOr[js.Any] => java.lang.String = null,
    set: (/* attributes */ js.UndefOr[js.Any], /* useSet */ js.UndefOr[scala.Boolean]) => IElement = null,
    setBottom: /* bottom */ js.UndefOr[java.lang.String] => IElement = null,
    setBox: /* box */ js.UndefOr[js.Any] => IElement = null,
    setCls: /* className */ js.UndefOr[js.Any] => scala.Unit = null,
    setHTML: /* html */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setHeight: /* height */ js.UndefOr[js.Any] => IElement = null,
    setHtml: /* html */ js.UndefOr[java.lang.String] => scala.Unit = null,
    setLeft: /* left */ js.UndefOr[java.lang.String] => IElement = null,
    setMaxHeight: /* height */ js.UndefOr[js.Any] => IElement = null,
    setMaxWidth: /* width */ js.UndefOr[js.Any] => IElement = null,
    setMinHeight: /* height */ js.UndefOr[js.Any] => IElement = null,
    setMinWidth: /* width */ js.UndefOr[js.Any] => IElement = null,
    setRight: /* right */ js.UndefOr[java.lang.String] => IElement = null,
    setSize: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any]) => IElement = null,
    setStyle: (/* property */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => IElement = null,
    setTop: /* top */ js.UndefOr[java.lang.String] => IElement = null,
    setTopLeft: () => scala.Unit = null,
    setVisibilityMode: /* mode */ js.UndefOr[js.Any] => IElement = null,
    setVisible: /* visible */ js.UndefOr[scala.Boolean] => senchaUnderscoreTouchLib.ExtNs.IElement = null,
    setWidth: /* width */ js.UndefOr[js.Any] => IElement = null,
    setX: /* x */ js.UndefOr[scala.Double] => IElement = null,
    setXY: /* pos */ js.UndefOr[senchaUnderscoreTouchLib.ExtNs.Array] => IElement = null,
    setY: /* y */ js.UndefOr[scala.Double] => IElement = null,
    show: () => scala.Unit = null,
    toggleCls: /* className */ js.UndefOr[java.lang.String] => IElement = null,
    translatePoints: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[scala.Double]) => _ = null,
    unmask: () => scala.Unit = null,
    up: (/* simpleSelector */ js.UndefOr[java.lang.String], /* maxDepth */ js.UndefOr[js.Any]) => _ = null,
    update: /* html */ js.UndefOr[java.lang.String] => scala.Unit = null,
    wrap: (/* config */ js.UndefOr[js.Any], /* domNode */ js.UndefOr[scala.Boolean]) => _ = null
  ): ICompositeElementLite = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IElement)
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction2(add))
    if (addCls != null) __obj.updateDynamic("addCls")(js.Any.fromFunction3(addCls))
    if (addListener != null) __obj.updateDynamic("addListener")(js.Any.fromFunction4(addListener))
    if (appendChild != null) __obj.updateDynamic("appendChild")(js.Any.fromFunction1(appendChild))
    if (appendTo != null) __obj.updateDynamic("appendTo")(js.Any.fromFunction1(appendTo))
    if (applyStyles != null) __obj.updateDynamic("applyStyles")(js.Any.fromFunction1(applyStyles))
    if (child != null) __obj.updateDynamic("child")(js.Any.fromFunction2(child))
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (contains != null) __obj.updateDynamic("contains")(js.Any.fromFunction1(contains))
    if (createChild != null) __obj.updateDynamic("createChild")(js.Any.fromFunction3(createChild))
    if (cssTranslate != null) __obj.updateDynamic("cssTranslate")(js.Any.fromFunction0(cssTranslate))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (down != null) __obj.updateDynamic("down")(js.Any.fromFunction2(down))
    if (each != null) __obj.updateDynamic("each")(js.Any.fromFunction2(each))
    if (elements != null) __obj.updateDynamic("elements")(elements)
    if (fill != null) __obj.updateDynamic("fill")(js.Any.fromFunction1(fill))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (findParent != null) __obj.updateDynamic("findParent")(js.Any.fromFunction3(findParent))
    if (findParentNode != null) __obj.updateDynamic("findParentNode")(js.Any.fromFunction3(findParentNode))
    if (getAlignToXY != null) __obj.updateDynamic("getAlignToXY")(js.Any.fromFunction3(getAlignToXY))
    if (getAnchorXY != null) __obj.updateDynamic("getAnchorXY")(js.Any.fromFunction3(getAnchorXY))
    if (getAttribute != null) __obj.updateDynamic("getAttribute")(js.Any.fromFunction2(getAttribute))
    if (getBorderWidth != null) __obj.updateDynamic("getBorderWidth")(js.Any.fromFunction1(getBorderWidth))
    if (getBottom != null) __obj.updateDynamic("getBottom")(js.Any.fromFunction0(getBottom))
    if (getBox != null) __obj.updateDynamic("getBox")(js.Any.fromFunction2(getBox))
    if (getCount != null) __obj.updateDynamic("getCount")(js.Any.fromFunction0(getCount))
    if (getHTML != null) __obj.updateDynamic("getHTML")(js.Any.fromFunction0(getHTML))
    if (getHeight != null) __obj.updateDynamic("getHeight")(js.Any.fromFunction1(getHeight))
    if (getHtml != null) __obj.updateDynamic("getHtml")(js.Any.fromFunction0(getHtml))
    if (getLeft != null) __obj.updateDynamic("getLeft")(js.Any.fromFunction0(getLeft))
    if (getMargin != null) __obj.updateDynamic("getMargin")(js.Any.fromFunction1(getMargin))
    if (getOffsetsTo != null) __obj.updateDynamic("getOffsetsTo")(js.Any.fromFunction1(getOffsetsTo))
    if (getOuterHeight != null) __obj.updateDynamic("getOuterHeight")(js.Any.fromFunction0(getOuterHeight))
    if (getOuterWidth != null) __obj.updateDynamic("getOuterWidth")(js.Any.fromFunction0(getOuterWidth))
    if (getPadding != null) __obj.updateDynamic("getPadding")(js.Any.fromFunction1(getPadding))
    if (getPageBox != null) __obj.updateDynamic("getPageBox")(js.Any.fromFunction1(getPageBox))
    if (getRight != null) __obj.updateDynamic("getRight")(js.Any.fromFunction0(getRight))
    if (getScrollParent != null) __obj.updateDynamic("getScrollParent")(js.Any.fromFunction0(getScrollParent))
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction1(getSize))
    if (getStyle != null) __obj.updateDynamic("getStyle")(js.Any.fromFunction1(getStyle))
    if (getTop != null) __obj.updateDynamic("getTop")(js.Any.fromFunction0(getTop))
    if (getValue != null) __obj.updateDynamic("getValue")(js.Any.fromFunction1(getValue))
    if (getViewSize != null) __obj.updateDynamic("getViewSize")(js.Any.fromFunction0(getViewSize))
    if (getWidth != null) __obj.updateDynamic("getWidth")(js.Any.fromFunction1(getWidth))
    if (getX != null) __obj.updateDynamic("getX")(js.Any.fromFunction0(getX))
    if (getXY != null) __obj.updateDynamic("getXY")(js.Any.fromFunction0(getXY))
    if (getY != null) __obj.updateDynamic("getY")(js.Any.fromFunction0(getY))
    if (hasCls != null) __obj.updateDynamic("hasCls")(js.Any.fromFunction1(hasCls))
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction0(hide))
    if (indexOf != null) __obj.updateDynamic("indexOf")(js.Any.fromFunction1(indexOf))
    if (insertAfter != null) __obj.updateDynamic("insertAfter")(js.Any.fromFunction1(insertAfter))
    if (insertBefore != null) __obj.updateDynamic("insertBefore")(js.Any.fromFunction1(insertBefore))
    if (insertFirst != null) __obj.updateDynamic("insertFirst")(js.Any.fromFunction1(insertFirst))
    if (insertHtml != null) __obj.updateDynamic("insertHtml")(js.Any.fromFunction3(insertHtml))
    if (insertSibling != null) __obj.updateDynamic("insertSibling")(js.Any.fromFunction3(insertSibling))
    if (is != null) __obj.updateDynamic("is")(js.Any.fromFunction1(is))
    if (isDescendent != null) __obj.updateDynamic("isDescendent")(js.Any.fromFunction0(isDescendent))
    if (isStyle != null) __obj.updateDynamic("isStyle")(js.Any.fromFunction2(isStyle))
    if (isTransparent != null) __obj.updateDynamic("isTransparent")(js.Any.fromFunction1(isTransparent))
    if (item != null) __obj.updateDynamic("item")(js.Any.fromFunction1(item))
    if (mask != null) __obj.updateDynamic("mask")(js.Any.fromFunction0(mask))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction2(next))
    if (parent != null) __obj.updateDynamic("parent")(js.Any.fromFunction2(parent))
    if (prev != null) __obj.updateDynamic("prev")(js.Any.fromFunction2(prev))
    if (purgeAllListeners != null) __obj.updateDynamic("purgeAllListeners")(js.Any.fromFunction0(purgeAllListeners))
    if (query != null) __obj.updateDynamic("query")(js.Any.fromFunction1(query))
    if (radioCls != null) __obj.updateDynamic("radioCls")(js.Any.fromFunction1(radioCls))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction0(remove))
    if (removeAllListeners != null) __obj.updateDynamic("removeAllListeners")(js.Any.fromFunction0(removeAllListeners))
    if (removeCls != null) __obj.updateDynamic("removeCls")(js.Any.fromFunction3(removeCls))
    if (removeElement != null) __obj.updateDynamic("removeElement")(js.Any.fromFunction2(removeElement))
    if (repaint != null) __obj.updateDynamic("repaint")(js.Any.fromFunction0(repaint))
    if (replace != null) __obj.updateDynamic("replace")(js.Any.fromFunction1(replace))
    if (replaceCls != null) __obj.updateDynamic("replaceCls")(js.Any.fromFunction4(replaceCls))
    if (replaceElement != null) __obj.updateDynamic("replaceElement")(js.Any.fromFunction3(replaceElement))
    if (replaceWith != null) __obj.updateDynamic("replaceWith")(js.Any.fromFunction1(replaceWith))
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction2(select))
    if (serializeForm != null) __obj.updateDynamic("serializeForm")(js.Any.fromFunction1(serializeForm))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2(set))
    if (setBottom != null) __obj.updateDynamic("setBottom")(js.Any.fromFunction1(setBottom))
    if (setBox != null) __obj.updateDynamic("setBox")(js.Any.fromFunction1(setBox))
    if (setCls != null) __obj.updateDynamic("setCls")(js.Any.fromFunction1(setCls))
    if (setHTML != null) __obj.updateDynamic("setHTML")(js.Any.fromFunction1(setHTML))
    if (setHeight != null) __obj.updateDynamic("setHeight")(js.Any.fromFunction1(setHeight))
    if (setHtml != null) __obj.updateDynamic("setHtml")(js.Any.fromFunction1(setHtml))
    if (setLeft != null) __obj.updateDynamic("setLeft")(js.Any.fromFunction1(setLeft))
    if (setMaxHeight != null) __obj.updateDynamic("setMaxHeight")(js.Any.fromFunction1(setMaxHeight))
    if (setMaxWidth != null) __obj.updateDynamic("setMaxWidth")(js.Any.fromFunction1(setMaxWidth))
    if (setMinHeight != null) __obj.updateDynamic("setMinHeight")(js.Any.fromFunction1(setMinHeight))
    if (setMinWidth != null) __obj.updateDynamic("setMinWidth")(js.Any.fromFunction1(setMinWidth))
    if (setRight != null) __obj.updateDynamic("setRight")(js.Any.fromFunction1(setRight))
    if (setSize != null) __obj.updateDynamic("setSize")(js.Any.fromFunction2(setSize))
    if (setStyle != null) __obj.updateDynamic("setStyle")(js.Any.fromFunction2(setStyle))
    if (setTop != null) __obj.updateDynamic("setTop")(js.Any.fromFunction1(setTop))
    if (setTopLeft != null) __obj.updateDynamic("setTopLeft")(js.Any.fromFunction0(setTopLeft))
    if (setVisibilityMode != null) __obj.updateDynamic("setVisibilityMode")(js.Any.fromFunction1(setVisibilityMode))
    if (setVisible != null) __obj.updateDynamic("setVisible")(js.Any.fromFunction1(setVisible))
    if (setWidth != null) __obj.updateDynamic("setWidth")(js.Any.fromFunction1(setWidth))
    if (setX != null) __obj.updateDynamic("setX")(js.Any.fromFunction1(setX))
    if (setXY != null) __obj.updateDynamic("setXY")(js.Any.fromFunction1(setXY))
    if (setY != null) __obj.updateDynamic("setY")(js.Any.fromFunction1(setY))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction0(show))
    if (toggleCls != null) __obj.updateDynamic("toggleCls")(js.Any.fromFunction1(toggleCls))
    if (translatePoints != null) __obj.updateDynamic("translatePoints")(js.Any.fromFunction2(translatePoints))
    if (unmask != null) __obj.updateDynamic("unmask")(js.Any.fromFunction0(unmask))
    if (up != null) __obj.updateDynamic("up")(js.Any.fromFunction2(up))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    if (wrap != null) __obj.updateDynamic("wrap")(js.Any.fromFunction2(wrap))
    __obj.asInstanceOf[ICompositeElementLite]
  }
}

