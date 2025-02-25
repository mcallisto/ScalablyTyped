package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new model with defined attributes. A client id (cid) is
  * automatically generated and assigned for you.
  *
  * <p>You won't normally call this method directly.  It is recommended that
  * you use a subclass of <code>Parse.Object</code> instead, created by calling
  * <code>extend</code>.</p>
  *
  * <p>However, if you don't want to use a subclass, or aren't sure which
  * subclass is appropriate, you can use this form:<pre>
  *     var object = new Parse.Object("ClassName");
  * </pre>
  * That is basically equivalent to:<pre>
  *     var MyClass = Parse.Object.extend("ClassName");
  *     var object = new MyClass();
  * </pre></p>
  *
  * @param {Object} attributes The initial set of data to store in the object.
  * @param {Object} options The options for this object instance.
  * @see Parse.Object.extend
  *
  * @class
  *
  * Creates a new model with defined attributes.
  */
@JSGlobal("Parse.Object")
@js.native
class Object () extends BaseObject {
  def this(attributes: js.Array[java.lang.String]) = this()
  def this(className: java.lang.String) = this()
  def this(attributes: js.Array[java.lang.String], options: js.Any) = this()
  def this(className: java.lang.String, options: js.Any) = this()
  var attributes: js.Any = js.native
  var changed: scala.Boolean = js.native
  var cid: java.lang.String = js.native
  var className: java.lang.String = js.native
  var createdAt: stdLib.Date = js.native
  var id: java.lang.String = js.native
  var updatedAt: stdLib.Date = js.native
  def add(attr: java.lang.String, item: js.Any): this.type | parseLib.parseLibNumbers.`false` = js.native
  def addAll(attr: java.lang.String, items: js.Array[_]): this.type | parseLib.parseLibNumbers.`false` = js.native
  def addAllUnique(attr: java.lang.String, items: js.Array[_]): this.type | parseLib.parseLibNumbers.`false` = js.native
  def addUnique(attr: java.lang.String, item: js.Any): this.type | parseLib.parseLibNumbers.`false` = js.native
  def change(options: js.Any): this.type = js.native
  def changedAttributes(diff: js.Any): scala.Boolean = js.native
  def clear(options: js.Any): js.Any = js.native
  def destroy(): js.Promise[this.type] = js.native
  def destroy(options: parseLib.ParseNs.ObjectNs.DestroyOptions): js.Promise[this.type] = js.native
  def dirty(): scala.Boolean = js.native
  def dirty(attr: java.lang.String): scala.Boolean = js.native
  def dirtyKeys(): js.Array[java.lang.String] = js.native
  def equals(other: js.Any): scala.Boolean = js.native
  def escape(attr: java.lang.String): java.lang.String = js.native
  def existed(): scala.Boolean = js.native
  def fetch(): js.Promise[this.type] = js.native
  def fetch(options: parseLib.ParseNs.ObjectNs.FetchOptions): js.Promise[this.type] = js.native
  def fetchFromLocalDatastore(): js.Promise[this.type] | scala.Unit = js.native
  def fetchWithInclude(keys: java.lang.String): js.Promise[this.type] = js.native
  def fetchWithInclude(keys: java.lang.String, options: RequestOptions): js.Promise[this.type] = js.native
  def fetchWithInclude(keys: js.Array[java.lang.String | js.Array[java.lang.String]]): js.Promise[this.type] = js.native
  def fetchWithInclude(keys: js.Array[java.lang.String | js.Array[java.lang.String]], options: RequestOptions): js.Promise[this.type] = js.native
  def get(attr: java.lang.String): js.UndefOr[js.Any] = js.native
  def getACL(): js.UndefOr[ACL] = js.native
  def has(attr: java.lang.String): scala.Boolean = js.native
  def hasChanged(attr: java.lang.String): scala.Boolean = js.native
  def increment(attr: java.lang.String): js.Any = js.native
  def increment(attr: java.lang.String, amount: scala.Double): js.Any = js.native
  def initialize(): scala.Unit = js.native
  def isNew(): scala.Boolean = js.native
  def isPinned(): js.Promise[scala.Boolean] = js.native
  def isValid(): scala.Boolean = js.native
  def op(attr: java.lang.String): js.Any = js.native
  def pin(): js.Promise[scala.Unit] = js.native
  def pinWithName(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def previous(attr: java.lang.String): js.Any = js.native
  def previousAttributes(): js.Any = js.native
  def relation(attr: java.lang.String): Relation[this.type, Object] = js.native
  def remove(attr: java.lang.String, item: js.Any): this.type | parseLib.parseLibNumbers.`false` = js.native
  def removeAll(attr: java.lang.String, items: js.Any): this.type | parseLib.parseLibNumbers.`false` = js.native
  def revert(): scala.Unit = js.native
  def save(): js.Promise[this.type] = js.native
  def save(attrs: js.Object): js.Promise[this.type] = js.native
  def save(attrs: js.Object, options: parseLib.ParseNs.ObjectNs.SaveOptions): js.Promise[this.type] = js.native
  def save(attrs: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Promise[this.type] = js.native
  def save(
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any],
    options: parseLib.ParseNs.ObjectNs.SaveOptions
  ): js.Promise[this.type] = js.native
  def save(attrs: scala.Null, options: parseLib.ParseNs.ObjectNs.SaveOptions): js.Promise[this.type] = js.native
  def save(key: java.lang.String, value: js.Any): js.Promise[this.type] = js.native
  def save(key: java.lang.String, value: js.Any, options: parseLib.ParseNs.ObjectNs.SaveOptions): js.Promise[this.type] = js.native
  def set(attrs: js.Object): this.type | parseLib.parseLibNumbers.`false` = js.native
  def set(attrs: js.Object, options: parseLib.ParseNs.ObjectNs.SetOptions): this.type | parseLib.parseLibNumbers.`false` = js.native
  def set(key: java.lang.String, value: js.Any): this.type | parseLib.parseLibNumbers.`false` = js.native
  def set(key: java.lang.String, value: js.Any, options: parseLib.ParseNs.ObjectNs.SetOptions): this.type | parseLib.parseLibNumbers.`false` = js.native
  def setACL(acl: ACL): this.type | parseLib.parseLibNumbers.`false` = js.native
  def setACL(acl: ACL, options: SuccessFailureOptions): this.type | parseLib.parseLibNumbers.`false` = js.native
  def toPointer(): Pointer = js.native
  def unPin(): js.Promise[scala.Unit] = js.native
  def unPinWithName(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def unset(attr: java.lang.String): js.Any = js.native
  def unset(attr: java.lang.String, options: js.Any): js.Any = js.native
  def validate(attrs: js.Any): scala.Boolean = js.native
  def validate(attrs: js.Any, options: SuccessFailureOptions): scala.Boolean = js.native
}

/* static members */
@JSGlobal("Parse.Object")
@js.native
object Object extends js.Object {
  def createWithoutData[T /* <: parseLib.ParseNs.Object */](id: java.lang.String): T = js.native
  def destroyAll[T /* <: parseLib.ParseNs.Object */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def destroyAll[T /* <: parseLib.ParseNs.Object */](list: js.Array[T], options: parseLib.ParseNs.ObjectNs.DestroyAllOptions): js.Promise[js.Array[T]] = js.native
  def extend(className: java.lang.String): js.Any = js.native
  def extend(className: java.lang.String, protoProps: js.Any): js.Any = js.native
  def extend(className: java.lang.String, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def extend(className: parseLib.Anon_ClassName): js.Any = js.native
  def extend(className: parseLib.Anon_ClassName, protoProps: js.Any): js.Any = js.native
  def extend(className: parseLib.Anon_ClassName, protoProps: js.Any, classProps: js.Any): js.Any = js.native
  def fetchAll[T /* <: parseLib.ParseNs.Object */](list: js.Array[T], options: parseLib.ParseNs.ObjectNs.FetchAllOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllIfNeeded[T /* <: parseLib.ParseNs.Object */](list: js.Array[T], options: parseLib.ParseNs.ObjectNs.FetchAllOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: parseLib.ParseNs.Object */](list: js.Array[T], keys: java.lang.String, options: parseLib.ParseNs.RequestOptions): js.Promise[js.Array[T]] = js.native
  def fetchAllWithInclude[T /* <: parseLib.ParseNs.Object */](
    list: js.Array[T],
    keys: js.Array[java.lang.String | js.Array[java.lang.String]],
    options: parseLib.ParseNs.RequestOptions
  ): js.Promise[js.Array[T]] = js.native
  def fromJSON(json: js.Any): parseLib.ParseNs.Object = js.native
  def fromJSON(json: js.Any, `override`: scala.Boolean): parseLib.ParseNs.Object = js.native
  def pinAll(objects: js.Array[parseLib.ParseNs.Object]): js.Promise[scala.Unit] = js.native
  def pinAllWithName(name: java.lang.String, objects: js.Array[parseLib.ParseNs.Object]): js.Promise[scala.Unit] = js.native
  def registerSubclass[T /* <: parseLib.ParseNs.Object */](
    className: java.lang.String,
    clazz: org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* options */ js.Any], T]
  ): scala.Unit = js.native
  def saveAll[T /* <: parseLib.ParseNs.Object */](list: js.Array[T]): js.Promise[js.Array[T]] = js.native
  def saveAll[T /* <: parseLib.ParseNs.Object */](list: js.Array[T], options: parseLib.ParseNs.ObjectNs.SaveAllOptions): js.Promise[js.Array[T]] = js.native
  def unPinAll(objects: js.Array[parseLib.ParseNs.Object]): js.Promise[scala.Unit] = js.native
  def unPinAllObjects(): js.Promise[scala.Unit] = js.native
  def unPinAllObjectsWithName(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def unPinAllWithName(name: java.lang.String, objects: js.Array[parseLib.ParseNs.Object]): js.Promise[scala.Unit] = js.native
}

