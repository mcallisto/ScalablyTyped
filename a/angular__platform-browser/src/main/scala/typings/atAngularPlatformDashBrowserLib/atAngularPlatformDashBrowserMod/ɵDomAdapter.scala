package typings
package atAngularPlatformDashBrowserLib.atAngularPlatformDashBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "ɵDomAdapter")
@js.native
abstract class ɵDomAdapter () extends js.Object {
  /**
    * Maps attribute names to their corresponding property names for cases
    * where attribute name doesn't match property name.
    */
  var attrToPropMap: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var resourceLoaderType: atAngularCoreLib.atAngularCoreMod.Type[_] = js.native
  def addClass(element: js.Any, className: java.lang.String): js.Any = js.native
  def adoptNode(node: stdLib.Node): stdLib.Node = js.native
  def appendChild(el: js.Any, node: js.Any): js.Any = js.native
  def attributeMap(element: js.Any): stdLib.Map[java.lang.String, java.lang.String] = js.native
  def childNodes(el: js.Any): js.Array[stdLib.Node] = js.native
  def childNodesAsList(el: js.Any): js.Array[stdLib.Node] = js.native
  def classList(element: js.Any): js.Array[_] = js.native
  def clearNodes(el: js.Any): js.Any = js.native
  def clone(node: stdLib.Node): stdLib.Node = js.native
  def contains(nodeA: js.Any, nodeB: js.Any): scala.Boolean = js.native
  def content(node: js.Any): js.Any = js.native
  def createComment(text: java.lang.String): js.Any = js.native
  def createElement(tagName: js.Any): stdLib.HTMLElement = js.native
  def createElement(tagName: js.Any, doc: js.Any): stdLib.HTMLElement = js.native
  def createElementNS(ns: java.lang.String, tagName: java.lang.String): stdLib.Element = js.native
  def createElementNS(ns: java.lang.String, tagName: java.lang.String, doc: js.Any): stdLib.Element = js.native
  def createEvent(eventType: java.lang.String): js.Any = js.native
  def createHtmlDocument(): stdLib.HTMLDocument = js.native
  def createMouseEvent(eventType: js.Any): js.Any = js.native
  def createScriptTag(attrName: java.lang.String, attrValue: java.lang.String): stdLib.HTMLElement = js.native
  def createScriptTag(attrName: java.lang.String, attrValue: java.lang.String, doc: js.Any): stdLib.HTMLElement = js.native
  def createShadowRoot(el: js.Any): js.Any = js.native
  def createStyleElement(css: java.lang.String): stdLib.HTMLStyleElement = js.native
  def createStyleElement(css: java.lang.String, doc: js.Any): stdLib.HTMLStyleElement = js.native
  def createTemplate(html: js.Any): stdLib.HTMLElement = js.native
  def createTextNode(text: java.lang.String): stdLib.Text = js.native
  def createTextNode(text: java.lang.String, doc: js.Any): stdLib.Text = js.native
  def dispatchEvent(el: js.Any, evt: js.Any): js.Any = js.native
  def elementMatches(n: js.Any, selector: java.lang.String): scala.Boolean = js.native
  def firstChild(el: js.Any): stdLib.Node | scala.Null = js.native
  def getAnimationPrefix(): java.lang.String = js.native
  def getAttribute(element: js.Any, attribute: java.lang.String): java.lang.String | scala.Null = js.native
  def getAttributeNS(element: js.Any, ns: java.lang.String, attribute: java.lang.String): java.lang.String | scala.Null = js.native
  def getBaseHref(doc: stdLib.Document): java.lang.String | scala.Null = js.native
  def getBoundingClientRect(el: js.Any): js.Any = js.native
  def getChecked(el: js.Any): scala.Boolean = js.native
  def getComputedStyle(element: js.Any): js.Any = js.native
  def getCookie(name: java.lang.String): java.lang.String | scala.Null = js.native
  def getData(element: js.Any, name: java.lang.String): java.lang.String | scala.Null = js.native
  def getDefaultDocument(): stdLib.Document = js.native
  def getDistributedNodes(el: js.Any): js.Array[stdLib.Node] = js.native
  def getElementsByClassName(element: js.Any, name: java.lang.String): js.Array[stdLib.HTMLElement] = js.native
  def getElementsByTagName(element: js.Any, name: java.lang.String): js.Array[stdLib.HTMLElement] = js.native
  def getEventKey(event: js.Any): java.lang.String = js.native
  def getGlobalEventTarget(doc: stdLib.Document, target: java.lang.String): js.Any = js.native
  def getHistory(): stdLib.History = js.native
  def getHost(el: js.Any): js.Any = js.native
  def getHref(element: js.Any): java.lang.String = js.native
  def getInnerHTML(el: js.Any): java.lang.String = js.native
  def getLocation(): stdLib.Location = js.native
  def getOuterHTML(el: js.Any): java.lang.String = js.native
  def getProperty(el: stdLib.Element, name: java.lang.String): js.Any = js.native
  def getShadowRoot(el: js.Any): js.Any = js.native
  def getStyle(element: js.Any, styleName: java.lang.String): java.lang.String = js.native
  /** Returns content if el is a <template> element, null otherwise. */
  def getTemplateContent(el: js.Any): js.Any = js.native
  def getText(el: js.Any): java.lang.String | scala.Null = js.native
  def getTitle(doc: stdLib.Document): java.lang.String = js.native
  def getTransitionEnd(): java.lang.String = js.native
  def getUserAgent(): java.lang.String = js.native
  def getValue(el: js.Any): java.lang.String = js.native
  def hasAttribute(element: js.Any, attribute: java.lang.String): scala.Boolean = js.native
  def hasAttributeNS(element: js.Any, ns: java.lang.String, attribute: java.lang.String): scala.Boolean = js.native
  def hasClass(element: js.Any, className: java.lang.String): scala.Boolean = js.native
  def hasProperty(element: js.Any, name: java.lang.String): scala.Boolean = js.native
  def hasShadowRoot(node: js.Any): scala.Boolean = js.native
  def hasStyle(element: js.Any, styleName: java.lang.String): scala.Boolean = js.native
  def hasStyle(element: js.Any, styleName: java.lang.String, styleValue: java.lang.String): scala.Boolean = js.native
  def importIntoDoc(node: stdLib.Node): stdLib.Node = js.native
  def insertAfter(parent: js.Any, el: js.Any, node: js.Any): js.Any = js.native
  def insertAllBefore(parent: js.Any, ref: js.Any, nodes: js.Any): js.Any = js.native
  def insertBefore(parent: js.Any, ref: js.Any, node: js.Any): js.Any = js.native
  def invoke(el: stdLib.Element, methodName: java.lang.String, args: js.Array[_]): js.Any = js.native
  def isCommentNode(node: js.Any): scala.Boolean = js.native
  def isElementNode(node: js.Any): scala.Boolean = js.native
  def isPrevented(evt: js.Any): scala.Boolean = js.native
  def isShadowRoot(node: js.Any): scala.Boolean = js.native
  def isTemplateElement(el: js.Any): scala.Boolean = js.native
  def isTextNode(node: js.Any): scala.Boolean = js.native
  def log(error: js.Any): js.Any = js.native
  def logError(error: js.Any): js.Any = js.native
  def logGroup(error: js.Any): js.Any = js.native
  def logGroupEnd(): js.Any = js.native
  def nextSibling(el: js.Any): stdLib.Node | scala.Null = js.native
  def nodeName(node: js.Any): java.lang.String = js.native
  def nodeValue(node: js.Any): java.lang.String | scala.Null = js.native
  def on(el: js.Any, evt: js.Any, listener: js.Any): js.Any = js.native
  def onAndCancel(el: js.Any, evt: js.Any, listener: js.Any): js.Function = js.native
  def parentElement(el: js.Any): stdLib.Node | scala.Null = js.native
  def parse(templateHtml: java.lang.String): js.Any = js.native
  def performanceNow(): scala.Double = js.native
  def preventDefault(evt: js.Any): js.Any = js.native
  def querySelector(el: js.Any, selector: java.lang.String): js.Any = js.native
  def querySelectorAll(el: js.Any, selector: java.lang.String): js.Array[_] = js.native
  def remove(el: js.Any): stdLib.Node = js.native
  def removeAttribute(element: js.Any, attribute: java.lang.String): js.Any = js.native
  def removeAttributeNS(element: js.Any, ns: java.lang.String, attribute: java.lang.String): js.Any = js.native
  def removeChild(el: js.Any, node: js.Any): js.Any = js.native
  def removeClass(element: js.Any, className: java.lang.String): js.Any = js.native
  def removeStyle(element: js.Any, styleName: java.lang.String): js.Any = js.native
  def replaceChild(el: js.Any, newNode: js.Any, oldNode: js.Any): js.Any = js.native
  def resetBaseElement(): scala.Unit = js.native
  def resolveAndSetHref(element: js.Any, baseUrl: java.lang.String, href: java.lang.String): js.Any = js.native
  def setAttribute(element: js.Any, name: java.lang.String, value: java.lang.String): js.Any = js.native
  def setAttributeNS(element: js.Any, ns: java.lang.String, name: java.lang.String, value: java.lang.String): js.Any = js.native
  def setChecked(el: js.Any, value: scala.Boolean): js.Any = js.native
  def setCookie(name: java.lang.String, value: java.lang.String): js.Any = js.native
  def setData(element: js.Any, name: java.lang.String, value: java.lang.String): js.Any = js.native
  def setInnerHTML(el: js.Any, value: js.Any): js.Any = js.native
  def setProperty(el: stdLib.Element, name: java.lang.String, value: js.Any): js.Any = js.native
  def setStyle(element: js.Any, styleName: java.lang.String, styleValue: java.lang.String): js.Any = js.native
  def setText(el: js.Any, value: java.lang.String): js.Any = js.native
  def setTitle(doc: stdLib.Document, newTitle: java.lang.String): js.Any = js.native
  def setValue(el: js.Any, value: java.lang.String): js.Any = js.native
  def supportsAnimation(): scala.Boolean = js.native
  def supportsCookies(): scala.Boolean = js.native
  def supportsDOMEvents(): scala.Boolean = js.native
  def supportsNativeShadowDOM(): scala.Boolean = js.native
  def supportsWebAnimation(): scala.Boolean = js.native
  def tagName(element: js.Any): java.lang.String = js.native
  def templateAwareRoot(el: js.Any): js.Any = js.native
  def `type`(node: js.Any): java.lang.String = js.native
}

