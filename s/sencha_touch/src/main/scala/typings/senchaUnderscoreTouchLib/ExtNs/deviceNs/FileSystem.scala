package typings
package senchaUnderscoreTouchLib.ExtNs.deviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.device.FileSystem")
@js.native
class FileSystem () extends js.Object

/* static members */
@JSGlobal("Ext.device.FileSystem")
@js.native
object FileSystem extends js.Object {
  /** [Property] (Ext.Class) */
  var self: senchaUnderscoreTouchLib.ExtNs.IClass = js.native
  /** [Method] Call the original method that was previously overridden with override  This method is deprecated as callParent does
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callOverridden(arguments)
  		* @returns Object Returns the result of calling the overridden method
  		*/
  def callOverridden(): js.Any = js.native
  def callOverridden(args: js.Any): js.Any = js.native
  /** [Method] Call the parent method of the current method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callParent(arguments)
  		* @returns Object Returns the result of calling the parent method
  		*/
  def callParent(): js.Any = js.native
  def callParent(args: js.Any): js.Any = js.native
  /** [Method] This method is used by an override to call the superclass method but bypass any overridden method
  		* @param args Array/Arguments The arguments, either an array or the arguments object from the current method, for example: this.callSuper(arguments)
  		* @returns Object Returns the result of calling the superclass method
  		*/
  def callSuper(): js.Any = js.native
  def callSuper(args: js.Any): js.Any = js.native
  /** [Method]  */
  def destroy(): scala.Unit = js.native
  /** [Method] Returns the value of fileSystemSize
  		* @returns Number
  		*/
  def getFileSystemSize(): scala.Double = js.native
  /** [Method] Returns the value of fileSystemType
  		* @returns Number
  		*/
  def getFileSystemType(): scala.Double = js.native
  /** [Method] Returns the initial configuration passed to constructor
  		* @param name String When supplied, value for particular configuration option is returned, otherwise the full config object is returned.
  		* @returns Object/Mixed
  		*/
  def getInitialConfig(): js.Any = js.native
  def getInitialConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Returns the value of readerType
  		* @returns String
  		*/
  def getReaderType(): java.lang.String = js.native
  /** [Method] Returns the value of stringEncoding
  		* @returns String
  		*/
  def getStringEncoding(): java.lang.String = js.native
  /** [Method] Initialize configuration for this class
  		* @param instanceConfig Object
  		* @returns Object mixins The mixin prototypes as key - value pairs
  		*/
  def initConfig(): js.Any = js.native
  def initConfig(instanceConfig: js.Any): js.Any = js.native
  /** [Method] Requests a Ext device filesystem FileSystem instance
  		* @param config Object The object which contains the following config options:
  		*/
  def requestFileSystem(): scala.Unit = js.native
  def requestFileSystem(config: js.Any): scala.Unit = js.native
  /** [Method] Sets the value of fileSystemSize
  		* @param fileSystemSize Number The new value.
  		*/
  def setFileSystemSize(): scala.Unit = js.native
  def setFileSystemSize(fileSystemSize: scala.Double): scala.Unit = js.native
  /** [Method] Sets the value of fileSystemType
  		* @param fileSystemType Number The new value.
  		*/
  def setFileSystemType(): scala.Unit = js.native
  def setFileSystemType(fileSystemType: scala.Double): scala.Unit = js.native
  /** [Method] Sets the value of readerType
  		* @param readerType String The new value.
  		*/
  def setReaderType(): scala.Unit = js.native
  def setReaderType(readerType: java.lang.String): scala.Unit = js.native
  /** [Method] Sets the value of stringEncoding
  		* @param stringEncoding String The new value.
  		*/
  def setStringEncoding(): scala.Unit = js.native
  def setStringEncoding(stringEncoding: java.lang.String): scala.Unit = js.native
  /** [Method] Get the reference to the class from which this object was instantiated
  		* @returns Ext.Class
  		*/
  def statics(): senchaUnderscoreTouchLib.ExtNs.IClass = js.native
}

