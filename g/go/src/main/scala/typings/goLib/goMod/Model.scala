package typings
package goLib.goMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
  * Models hold the essential data of a diagram, describing the basic entities and their properties and relationships
  * without specifying the appearance and behavior of the Nodes and Links and Groups that represent them visually.
  * Models tend to hold only relatively simple data, making them easy to persist by serialization as JSON or XML formatted text.
  */
@JSImport("go", "Model")
@js.native
/**
  * You probably don't want to call this constructor, because this class does not support links (relationships between nodes) or groups (nodes and links and subgraphs as nodes): instead, create instances of a subclass such as GraphLinksModel or TreeModel.
  * @param {Array<Object>=} nodedataarray an optional Array containing JavaScript objects to be represented by Parts.
  */
class Model () extends js.Object {
  def this(nodedataarray: js.Array[js.Object]) = this()
  /**Gets or sets whether the default behavior for copyNodeData when copying Arrays also copies array items that are Objects.*/
  var copiesArrayObjects: scala.Boolean = js.native
  /**Gets or sets whether the default behavior for copyNodeData makes copies of property values that are Arrays.*/
  var copiesArrays: scala.Boolean = js.native
  /**Gets or sets the name of the format of the diagram data; the default value is the empty string.*/
  var dataFormat: java.lang.String = js.native
  /**Gets or sets whether this model may be modified, such as adding nodes; by default this value is false.*/
  var isReadOnly: scala.Boolean = js.native
  /**Gets a JavaScript Object that can hold programmer-defined property values for the model as a whole, rather than just for one node or one link; by default this is an object with no properties. The value must be an Object.*/
  var modelData: js.Any = js.native
  /**Gets or sets the name of this model; the initial name is an empty string.*/
  var name: java.lang.String = js.native
  /**Gets or sets the name of the node data property that returns a string naming that data's category, or a function that takes a node data object and returns the category name; the default value is the name 'category'.*/
  var nodeCategoryProperty: PropertyAccessor = js.native
  /**Gets or sets the array of node data objects that correspond to Nodes, Groups, or non-Link Parts in the Diagram; the initial value is an empty Array.*/
  var nodeDataArray: js.Array[js.Object] = js.native
  /**Gets or sets the name of the data property that returns a unique id number or string for each node data object, or a function taking a node data object and returning the key value; the default value is the name 'key'.*/
  var nodeKeyProperty: PropertyAccessor = js.native
  /**Gets or sets whether ChangedEvents are not recorded by the UndoManager; the initial and normal value is false.*/
  var skipsUndoManager: scala.Boolean = js.native
  /**Gets or sets the UndoManager for this Model; the default UndoManager has its UndoManager.isEnabled property set to false.*/
  var undoManager: UndoManager = js.native
  /**
    * Add an item at the end of a data array that may be data bound by a Panel as its Panel.itemArray,
    * in a manner that can be undone/redone and that automatically updates any bindings.
    * This also calls .raiseChangedEvent to notify all listeners about the ChangedEvent.Insert.
    * If you want to add a new node or part to the diagram, call .addNodeData.
    * @param {Array<*>} arr an Array that is the value of some Panel's Panel.itemArray.
    * @param {*} val the new value to be pushed onto the array.
    */
  def addArrayItem(arr: js.Array[_], `val`: js.Any): scala.Unit = js.native
  /**
    * Register an event handler that is called when there is a ChangedEvent for a modification of the Diagram, a Layer, or a GraphObject.
    * This registration does not raise a ChangedEvent.
    * @param {function(ChangedEvent)} listener a function that takes a ChangedEvent as its argument.
    */
  def addChangedListener(listener: js.Function1[/* e */ ChangedEvent, scala.Unit]): scala.Unit = js.native
  /**
    * When you want to add a node or group to the diagram,
    * call this method with a new data object.
    * This will add that data to the .nodeDataArray and
    * notify all listeners that a new node data object has been inserted into the collection.
    * To remove a node from the diagram, you can remove its data object by calling .removeNodeData.
    * To add or remove an object or value from an item array, call .insertArrayItem or .removeArrayItem.
    * @param {Object} nodedata a JavaScript object representing a node, group, or non-link.
    */
  def addNodeData(nodedata: js.Object): scala.Unit = js.native
  /**
    * Add to this model all of the node data held in an Array or in an Iterable of node data objects.
    * @param {Iterable<Object>|Array<Object>} coll a collection of node data objects to add to the .nodeDataArray
    */
  def addNodeDataCollection(coll: Iterable[js.Object]): scala.Unit = js.native
  def addNodeDataCollection(coll: js.Array[js.Object]): scala.Unit = js.native
  /**
    * Modify this model by applying the changes given in an "incremental" model change in JSON format
    * generated by toIncrementalJson.
    * Incremental changes must be applied in the same order that the changes occurred in the original model.
    * <p>
    * This requires the "incremental" property to be present and to be a number, as specified by toIncrementalJson.
    * All of the top-level properties in the JSON, such as nodeKeyProperty, must be the same as for this model.
    * @param {string|Object} s a String in JSON format containing modifications to be performed to the model,
    *    or a JavaScript Object parsed from such a string
    */
  def applyIncrementalJson(s: java.lang.String): scala.Unit = js.native
  def applyIncrementalJson(s: js.Object): scala.Unit = js.native
  /**
    * Clear out all references to any model data.
    * This also clears out the UndoManager, so this operation is not undoable.
    * This method is called by Diagram.clear; it does not notify any Diagrams or other listeners.
    * Instead of calling this method, you may prefer to set .nodeDataArray to an empty JavaScript Array.
    * If this model is a GraphLinksModel, you would also want to set GraphLinksModel.linkDataArray to a separate empty JavaScript Array.
    */
  def clear(): scala.Unit = js.native
  /**
    * Copies properties from this model to the given model, which must be of the same class as this model.
    * @param {Model} copy
    */
  /* protected */ def cloneProtected(copy: Model): scala.Unit = js.native
  /**
    * Commit the changes of the current transaction.
    * This just calls UndoManager.commitTransaction.
    * @param {string=} tname a descriptive name for the transaction.
    */
  def commitTransaction(): scala.Boolean = js.native
  def commitTransaction(tname: java.lang.String): scala.Boolean = js.native
  /**
    * Decide if a given node data is in this model.
    * @param {Object} nodedata a JavaScript object representing a node, group, or non-link.
    */
  def containsNodeData(nodedata: js.Object): scala.Boolean = js.native
  /**
    * Creates an empty copy of this Model and returns it.
    * The data is not copied: nodeDataArray, modelData,
    * GraphLinksModel.linkDataArray, GraphLinksModel.archetypeNodeData.
    * Nor are any Changed listeners or the UndoManager.
    */
  def copy(): Model = js.native
  /**
    * Make a copy of a node data object.
    * This uses the value of .copyNodeDataFunction to actually perform the copy,
    * unless it is null, in which case this method just makes a shallow copy of the JavaScript Object.
    * This does not modify the model -- the returned data object is not added to this model.
    * This assumes that the data's constructor can be called with no arguments.
    * @param {Object} nodedata a JavaScript object representing a node, group, or non-link.
    */
  def copyNodeData(nodedata: js.Object): js.Object = js.native
  /**Gets or sets a function that makes a copy of a node data object; the default value is null, resulting in the standard behavior which is to make a shallow copy of the object.*/
  def copyNodeDataFunction(obj: js.Object, model: Model): js.Object = js.native
  /**
    * Given a number or string, find the node data in this model
    * that uses the given value as its unique key.
    * The return value will be an Object or null.
    * @param {*} key a string or a number.
    */
  def findNodeDataForKey(key: Key): js.Any = js.native
  /**
    * Find the category of a given node data, a string naming the node template
    * or group template or part template
    * that the Diagram should use to represent the node data.
    * @param {Object} nodedata a JavaScript object representing a node, group, or non-link.
    */
  def getCategoryForNodeData(nodedata: js.Object): java.lang.String = js.native
  /**
    * Given a node data object return its unique key: a number or a string.
    * This returns undefined if there is no key value.
    * It is possible to change the key for a node data object by calling .setKeyForNodeData.
    * @param {Object} nodedata a JavaScript object representing a node, group, or non-link.
    */
  def getKeyForNodeData(nodedata: js.Object): Key = js.native
  /**
    * Add an item to a data array that may be data bound by a Panel as its Panel.itemArray,
    * given a new data value and the index at which to insert the new value, in a manner that can be undone/redone and that automatically updates any bindings.
    * This also calls .raiseChangedEvent to notify all listeners about the ChangedEvent.Insert.
    * If you want to add a new node or part to the diagram, call .addNodeData.
    * @param Array<*> arr an Array that is the value of some Panel's Panel.itemArray.
    * @param {number} idx the zero-based array index where the new value will be inserted; use -1 to push the new value on the end of the array.
    * @param {*} val the new value to be inserted into the array.
    */
  def insertArrayItem(arr: js.Array[_], idx: scala.Double, `val`: js.Any): scala.Unit = js.native
  /**
    * This method is called when a node data object is added to the model to make sure that
    * .getKeyForNodeData returns a unique key value.
    * The key value should be unique within the set of data managed by this model:
    * .nodeDataArray.
    * If the key is already in use, this will assign an unused number to the
    * .nodeKeyProperty property on the data.
    * If you want to customize the way in which node data gets a unique key,
    * you can set the .makeUniqueKeyFunction functional property.
    * If the node data object is already in the model and you want to change its key value,
    * call .setKeyForNodeData and give it a new unique key value.
    * @param {Object} nodedata a JavaScript object representing a node, group, or non-link.
    */
  def makeNodeDataKeyUnique(nodedata: js.Object): scala.Unit = js.native
  /**Gets or sets a function that returns a unique id number or string for a node data object; the default value is null.*/
  def makeUniqueKeyFunction(model: Model, obj: js.Object): Key = js.native
  /**
    * Call this method to notify that the model or its objects have changed.
    * This constructs a ChangedEvent and calls all Changed listeners.
    * @param {EnumValue} change specifies the general nature of the change; typically the value is ChangedEvent.Property.
    * @param {string|function(Object):*} propertyname names the property that was modified, or a function that takes an Object and returns the property value.
    * @param {Object} obj the object that was modified, typically a GraphObject, Diagram, or a Model.
    * @param {*} oldval the previous or older value.
    * @param {*} newval the next or newer value.
    * @param {*=} oldparam an optional value that helps describe the older value.
    * @param {*=} newparam an optional value that helps describe the newer value.
    */
  def raiseChangedEvent(change: EnumValue, propertyname: PropertyAccessor, obj: js.Object, oldval: js.Any, newval: js.Any): scala.Unit = js.native
  def raiseChangedEvent(
    change: EnumValue,
    propertyname: PropertyAccessor,
    obj: js.Object,
    oldval: js.Any,
    newval: js.Any,
    oldparam: js.Any
  ): scala.Unit = js.native
  def raiseChangedEvent(
    change: EnumValue,
    propertyname: PropertyAccessor,
    obj: js.Object,
    oldval: js.Any,
    newval: js.Any,
    oldparam: js.Any,
    newparam: js.Any
  ): scala.Unit = js.native
  /**
    * Call this method to notify about a data property having changed value.
    * This constructs a ChangedEvent and calls all Changed listeners.
    * You should call this method only if the property value actually changed.
    * This method is called by .setDataProperty.
    * @param {Object} data the data object whose property changed value.
    * @param {string|function(Object):*} propertyname the name of the property, or a function that takes an Object and returns the property value.
    * @param {*} oldval the previous or old value for the property.
    * @param {*} newval the next or new value for the property.
    * @param {*=} oldparam an optional value additionally describing the old value.
    * @param {*=} newparam an optional value additionally describing the new value.
    */
  def raiseDataChanged(data: js.Object, propertyname: PropertyAccessor, oldval: js.Any, newval: js.Any): scala.Unit = js.native
  def raiseDataChanged(data: js.Object, propertyname: PropertyAccessor, oldval: js.Any, newval: js.Any, oldparam: js.Any): scala.Unit = js.native
  def raiseDataChanged(
    data: js.Object,
    propertyname: PropertyAccessor,
    oldval: js.Any,
    newval: js.Any,
    oldparam: js.Any,
    newparam: js.Any
  ): scala.Unit = js.native
  /**
    * Remove an item from a data array that may be data bound by a Panel as its Panel.itemArray,
    * given the index at which to remove a data value, in a manner that can be undone/redone and that automatically updates any bindings.
    * This also calls .raiseChangedEvent to notify all listeners about the ChangedEvent.Remove.
    * If you want to remove a node from the diagram, call .removeNodeData.
    * Note that there is no version of this method that takes an item value instead of an index into the array.
    * Because item arrays may hold any JavaScript value, including numbers and strings, there may be duplicate entries with that value in the array.
    * To avoid ambiguity, removing an item from an array requires an index.
    * @param Array<*> arr an Array that is the value of some Panel's Panel.itemArray.
    * @param {number=} idx the zero-based array index of the data item to be removed from the array;
    *   if not supplied it will remove the last item of the array.
    */
  def removeArrayItem(arr: js.Array[_]): scala.Unit = js.native
  def removeArrayItem(arr: js.Array[_], idx: scala.Double): scala.Unit = js.native
  /**
    * Unregister an event handler listener.
    * This deregistration does not raise a ChangedEvent.
    * @param {function(ChangedEvent)} listener a function that takes a ChangedEvent as its argument.
    */
  def removeChangedListener(listener: js.Function1[/* e */ ChangedEvent, scala.Unit]): scala.Unit = js.native
  /**
    * When you want to remove a node or group from the diagram,
    * call this method with an existing data object.
    * This will remove that data from the .nodeDataArray and
    * notify all listeners that a node data object has been removed from the collection.
    * Removing a node data from a model does not automatically remove
    * any connected link data from the model.
    * Removing a node data that represents a group does not automatically remove
    * any member node data or link data from the model.
    * To add a node to the diagram, you can add its data object by calling .addNodeData.
    * To add or remove an object or value from an item array, call .insertArrayItem or .removeArrayItem.
    * @param {Object} nodedata a JavaScript object representing a node, group, or non-link.
    */
  def removeNodeData(nodedata: js.Object): scala.Unit = js.native
  /**
    * Remove from this model all of the node data held in an Array or in an Iterable of node data objects.
    * @param {Iterable<Object>|Array<Object>} coll a collection of node data objects to remove from the .nodeDataArray
    */
  def removeNodeDataCollection(coll: Iterable[js.Object]): scala.Unit = js.native
  def removeNodeDataCollection(coll: js.Array[js.Object]): scala.Unit = js.native
  /**
    * Rollback the current transaction, undoing any recorded changes.
    * This just calls UndoManager.rollbackTransaction.
    */
  def rollbackTransaction(): scala.Boolean = js.native
  /**
    * Change the category of a given node data, a string naming the node template
    * or group template or part template
    * that the Diagram should use to represent the node data.
    * Changing the node template for a node data will cause the existing Node, Group, or Part
    * to be replaced with a new Node, Group, or Part
    * created by copying the new node template and applying any data-bindings.
    * @param {Object} nodedata a JavaScript object representing a node, group, or non-link.
    * @param {string} cat Must not be null.
    */
  def setCategoryForNodeData(nodedata: js.Object, cat: java.lang.String): scala.Unit = js.native
  /**
    * Change the value of some property of a node data, a link data, or an item data, given a string naming the property
    * and the new value, in a manner that can be undone/redone and that automatically updates any bindings.
    * This gets the old value of the property; if the value is the same as the new value, no side-effects occur.
    * @param {Object} data a JavaScript object representing a Node, Link, Group, simple Part, or item in a Panel.itemArray.
    * @param {string} propname a string that is not null or the empty string.
    * @param {*} val the new value for the property.
    */
  def setDataProperty(data: js.Object, propname: java.lang.String, `val`: js.Any): scala.Unit = js.native
  /**
    * Change the unique key of a given node data that is already in this model.
    * The new key value must be unique -- i.e. not in use by another node data object.
    * You can call .findNodeDataForKey to check if a proposed new key is already in use.
    * This operation will check all data objects in the model and replace all references
    * using the old key value with the new one.
    * If this is called on a node data object that is not (yet) in this model,
    * this unconditionally modifies the property to the new key value.
    * @param {Object} nodedata a JavaScript object representing a node, group, or non-link.
    * @param {string|number|undefined} key
    */
  def setKeyForNodeData(nodedata: js.Object, key: Key): scala.Unit = js.native
  /**
    * Begin a transaction, where the changes are held by a Transaction object in the UndoManager.
    * This just calls UndoManager.startTransaction.
    * @param {string=} tname a descriptive name for the transaction.
    */
  def startTransaction(): scala.Boolean = js.native
  def startTransaction(tname: java.lang.String): scala.Boolean = js.native
  /**
    * Produce a JSON-format string representing the changes in the most recent Transaction.
    * This writes out JSON for a model, but recording only changes in the given Transaction,
    * with the addition of the "incremental" property to mark it as different from a complete model.
    * Instead of the "nodeDataArray" property (and "linkDataArray" property for GraphLinksModels),
    * this will have "inserted...", "modified...", and "removed..." properties that are Arrays.
    * <p>
    * The "modifiedNodeData" Array holds JavaScript objects.
    * The "insertedNodeKeys" and "removedNodeKeys" Arrays hold keys (numbers or strings) of data,
    * not whole objects, that have been added and/or deleted.
    * <p>
    * The purpose of this method is to make it easier to send incremental changes to the server/database,
    * instead of sending the whole model.
    * <p>
    * For GraphLinksModels, this method requires that GraphLinksModel#linkKeyProperty is not an empty string.
    * The incremental JSON for GraphLinksModels will include "modifiedLinkData", "insertedLinkKeys", and "removedLinkKeys"
    * properties that are Arrays.
    * @param {ChangedEvent} e a Transaction ChangedEvent for which ChangedEvent.isTransactionFinished is true
    * @param {string=} classname for the written model, defaults to the name of the class of the model
    * @return {string}
    */
  def toIncrementalJson(e: ChangedEvent): java.lang.String = js.native
  def toIncrementalJson(e: ChangedEvent, classname: java.lang.String): java.lang.String = js.native
  /**
    * Generate a string representation of the persistent data in this model, in JSON format.
    * Object properties that are not enumerable or whose names start with "_" are not written out.
    * Functions are not able to be written in JSON format, so any properties that have function values
    * will not be saved in the JSON string.
    * There must not be any circular references within the model data.
    * Any sharing of object references will be lost in the written JSON.
    * Most object classes cannot be serialized into JSON without special knowledge and processing at both ends.
    * The .toJson and Model.fromJson methods automatically do such processing for numbers that are NaN
    * and for objects that are of class Point, Size, Rect, Margin, Spot,
    * Brush (but not for brush patterns), and for Geometry.
    * However, we recommend that you use Binding converters (static functions named "parse" and "stringify")
    * to represent Points, Sizes, Rects, Margins, Spots, and Geometries as string values in your data, rather than as Objects.
    * This makes the JSON text smaller and simpler and easier to read.
    * @param {string=} classname The optional name of the model class to use in the output;
    *     for the standard models, this is their class name prefixed with "go.".
    */
  def toJson(): java.lang.String = js.native
  def toJson(classname: java.lang.String): java.lang.String = js.native
  /**
    * Find a Part corresponding to the given data and
    * call its Panel.updateTargetBindings method, in each Diagram
    * that uses this Model.
    * @param {Object} data The data object in this model that was modified.
    * @param {string=} srcpropname If not present or the empty string,
    *   update all bindings on the target Part or item Panel;
    *   otherwise update only those bindings using this source property name.
    */
  def updateTargetBindings(data: js.Object): scala.Unit = js.native
  def updateTargetBindings(data: js.Object, srcpropname: java.lang.String): scala.Unit = js.native
}

/* static members */
@JSImport("go", "Model")
@js.native
object Model extends js.Object {
  /**
    * This static function parses a string in JSON format and constructs, initializes, and returns a model.
    * Note that properties with values that are functions are not written out by .toJson,
    * so reading in such a model will require constructing such a model, initializing its functional property values,
    * and explicitly passing it in as the second argument.
    * @param {string} s a String in JSON format containing all of the persistent properties of the model, or an Object already read from JSON text.
    * @param {model=} model an optional model to be modified; if not supplied, it constructs and returns a new model whose name is specified by the "class" property.
    */
  def fromJson(s: java.lang.String): goLib.goMod.Model = js.native
  def fromJson(s: java.lang.String, model: goLib.goMod.Model): goLib.goMod.Model = js.native
  def fromJson(s: js.Object): goLib.goMod.Model = js.native
  def fromJson(s: js.Object, model: goLib.goMod.Model): goLib.goMod.Model = js.native
}

