package typings
package winrtLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Web.Syndication.SyndicationGenerator")
@js.native
class SyndicationGenerator ()
  extends ISyndicationGenerator
     with ISyndicationNode {
  def this(text: java.lang.String) = this()
  /* CompleteClass */
  override var attributeExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SyndicationAttribute] = js.native
  /* CompleteClass */
  override var baseUri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var elementExtensions: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[ISyndicationNode] = js.native
  /* CompleteClass */
  override var language: java.lang.String = js.native
  /* CompleteClass */
  override var nodeName: java.lang.String = js.native
  /* CompleteClass */
  override var nodeNamespace: java.lang.String = js.native
  /* CompleteClass */
  override var nodeValue: java.lang.String = js.native
  /* CompleteClass */
  override var text: java.lang.String = js.native
  /* CompleteClass */
  override var uri: winrtLib.WindowsNs.FoundationNs.Uri = js.native
  /* CompleteClass */
  override var version: java.lang.String = js.native
  /* CompleteClass */
  override def getXmlDocument(format: SyndicationFormat): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}

