package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.data.Model")
@js.native
class Model () extends js.Object

/* static members */
@JSGlobal("Ext.data.Model")
@js.native
object Model extends js.Object {
  /** [Method] Add methods  properties to the prototype of this class
  		* @param members Object
  		*/
  def addMembers(): scala.Unit = js.native
  def addMembers(members: js.Any): scala.Unit = js.native
  /** [Method] Add  override static properties of this class
  		* @param members Object
  		* @returns Ext.Base this
  		*/
  def addStatics(): extjsLib.ExtNs.IBase = js.native
  def addStatics(members: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Create a new instance of this Class
  		* @returns Object the created instance.
  		*/
  def create(): js.Any = js.native
  /** [Method] Create aliases for existing prototype methods
  		* @param alias String/Object The new method name, or an object to set multiple aliases. See flexSetter
  		* @param origin String/Object The original method name
  		*/
  def createAlias(): scala.Unit = js.native
  def createAlias(alias: js.Any): scala.Unit = js.native
  def createAlias(alias: js.Any, origin: js.Any): scala.Unit = js.native
  /** [Method] Returns an Array of Field definitions which define this Model s structure Fields are sorted upon Model class definit
  		* @returns Ext.data.Field[] The defined Fields for this Model.
  		*/
  def getFields(): extjsLib.ExtNs.Array = js.native
  /** [Method] Get the current class name in string format
  		* @returns String className
  		*/
  def getName(): java.lang.String = js.native
  /** [Method] Returns the configured Proxy for this Model
  		* @returns Ext.data.proxy.Proxy The proxy
  		*/
  def getProxy(): extjsLib.ExtNs.dataNs.proxyNs.IProxy = js.native
  /** [Method] Generates a sequential id
  		* @param rec Ext.data.Model The record being created. The record does not exist, it's a phantom.
  		* @returns String auto-generated string id, "ext-record-i++";
  		*/
  def id(): java.lang.String = js.native
  def id(rec: extjsLib.ExtNs.dataNs.IModel): java.lang.String = js.native
  /** [Method] Adds members to class  */
  def implement(): scala.Unit = js.native
  /** [Method] Asynchronously loads a model instance by id
  		* @param id Number/String The id of the model to load
  		* @param config Object config object containing success, failure and callback functions, plus optional scope
  		*/
  def load(): scala.Unit = js.native
  def load(id: js.Any): scala.Unit = js.native
  def load(id: js.Any, config: js.Any): scala.Unit = js.native
  /** [Method] Override members of this class
  		* @param members Object The properties to add to this class. This should be specified as an object literal containing one or more properties.
  		* @returns Ext.Base this class
  		*/
  def `override`(): extjsLib.ExtNs.IBase = js.native
  def `override`(members: js.Any): extjsLib.ExtNs.IBase = js.native
  /** [Method] Apply a new set of field and or property definitions to the existing model
  		* @param fields Object
  		* @param idProperty Object
  		* @param clientIdProperty Object
  		*/
  def setFields(): scala.Unit = js.native
  def setFields(fields: js.Any): scala.Unit = js.native
  def setFields(fields: js.Any, idProperty: js.Any): scala.Unit = js.native
  def setFields(fields: js.Any, idProperty: js.Any, clientIdProperty: js.Any): scala.Unit = js.native
  /** [Method] Sets the Proxy to use for this model
  		* @param proxy String/Object/Ext.data.proxy.Proxy The proxy
  		* @returns Ext.data.proxy.Proxy
  		*/
  def setProxy(): extjsLib.ExtNs.dataNs.proxyNs.IProxy = js.native
  def setProxy(proxy: js.Any): extjsLib.ExtNs.dataNs.proxyNs.IProxy = js.native
}

