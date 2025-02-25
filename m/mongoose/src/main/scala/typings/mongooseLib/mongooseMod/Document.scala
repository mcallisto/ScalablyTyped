package typings
package mongooseLib.mongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- mongooseLib.mongooseMod.ModelProperties because var conflicts: schema. Inlined base, baseModelName, collection, db, discriminators, modelName */ @js.native
trait Document
  extends nodeLib.NodeJSNs.EventEmitter
     with MongooseDocument {
  /**
    * Version using default version key. See http://mongoosejs.com/docs/guide.html#versionKey
    * If you're using another key, you will have to access it using []: doc[_myVersionKey]
    */
  var __v: js.UndefOr[scala.Double] = js.native
  /** Base Mongoose instance the model uses. */
  var base: mongooseLib.Typeofmongoose = js.native
  /**
    * If this is a discriminator model, baseModelName is the
    * name of the base model.
    */
  var baseModelName: js.UndefOr[java.lang.String] = js.native
  /** Collection the model uses. */
  var collection: Collection = js.native
  /** Connection the model uses. */
  var db: Connection = js.native
  /** Registered discriminators for this model. */
  var discriminators: js.Any = js.native
  /** The name of the model */
  var modelName: java.lang.String = js.native
  /** whether mongoose thinks this doc is deleted. */
  @JSName("$isDeleted")
  def $isDeleted(): scala.Boolean = js.native
  /** Override whether mongoose thinks this doc is deleted or not */
  @JSName("$isDeleted")
  def $isDeleted(isDeleted: scala.Boolean): scala.Unit = js.native
  /** Signal that we desire an increment of this documents version. */
  def increment(): this.type = js.native
  /**
    * Returns another Model instance.
    * @param name model name
    */
  def model[T /* <: Document */](name: java.lang.String): Model[T, js.Object] = js.native
  /**
    * Removes this document from the db.
    * @param fn optional callback
    */
  def remove(): js.Promise[this.type] = js.native
  def remove(fn: js.Function2[/* err */ js.Any, /* product */ this.type, scala.Unit]): js.Promise[this.type] = js.native
  /**
    * Saves this document.
    * @param options options optional options
    * @param options.safe overrides schema's safe option
    * @param options.validateBeforeSave set to false to save without validating.
    * @param fn optional callback
    */
  def save(): js.Promise[this.type] = js.native
  def save(fn: js.Function2[/* err */ js.Any, /* product */ this.type, scala.Unit]): js.Promise[this.type] = js.native
  def save(options: SaveOptions): js.Promise[this.type] = js.native
  def save(options: SaveOptions, fn: js.Function2[/* err */ js.Any, /* product */ this.type, scala.Unit]): js.Promise[this.type] = js.native
}

