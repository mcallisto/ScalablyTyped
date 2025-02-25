package typings
package rosieLib.rosieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFactory[T] extends js.Object {
  /**
    * Sets a post-processor callback that will receive built objects and the
    * options for the build just before they are returned from the #build
    * function.
    *
    * @param {function(object, ?object)} callback
    * @return {Factory}
    */
  def after(functionArg: js.Function2[/* obj */ T, /* opts */ js.UndefOr[js.Any], scala.Unit]): IFactory[T] = js.native
  /**
    * Define an attribute on this factory. Attributes can optionally define a
    * default value, either as a value (e.g. a string or number) or as a builder
    * function. For example:
    *
    *   // no default value for age
    *   Factory.define('Person').attr('age')
    *
    *   // static default value for age
    *   Factory.define('Person').attr('age', 18)
    *
    *   // dynamic default value for age
    *   Factory.define('Person').attr('age', function() {
    *      return Math.random() * 100;
    *   })
    *
    * Attributes with dynamic default values can depend on options or other
    * attributes:
    *
    *   Factory.define('Person').attr('age', ['name'], function(name) {
    *     return name === 'Brian' ? 30 : 18;
    *   });
    *
    * By default if the consumer of your factory provides a value for an
    * attribute your builder function will not be called. You can override this
    * behavior by declaring that your attribute depends on itself:
    *
    *   Factory.define('Person').attr('spouse', ['spouse'], function(spouse) {
    *     return Factory.build('Person', spouse);
    *   });
    *
    * As in the example above, this can be a useful way to fill in
    * partially-specified child objects.
    *
    * @param {string} attr
    * @param {Array.<string>=} | any dependenciesOrValue
    * @param any
    * @return {Factory}
    */
  def attr[K /* <: java.lang.String */](name: K, defaultValue: /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any): IFactory[T] = js.native
  def attr[K /* <: java.lang.String */](
    name: K,
    generatorFunction: js.Function0[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]
  ): IFactory[T] = js.native
  def attr[K /* <: java.lang.String */, D /* <: java.lang.String */](name: K, dependencies: js.Array[D], generatorFunction: js.Any): IFactory[T] = js.native
  def attr[K /* <: java.lang.String */, D /* <: java.lang.String */](
    name: K,
    dependencies: js.Array[D],
    generatorFunction: js.Function1[
      /* import warning: ImportType.apply Failed type conversion: T[D] */ /* value */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
    ]
  ): IFactory[T] = js.native
  def attr[K /* <: java.lang.String */, D1 /* <: java.lang.String */, D2 /* <: java.lang.String */](
    name: K,
    dependencies: js.Tuple2[D1, D2],
    generatorFunction: js.Function2[
      /* import warning: ImportType.apply Failed type conversion: T[D1] */ /* value1 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[D2] */ /* value2 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
    ]
  ): IFactory[T] = js.native
  def attr[K /* <: java.lang.String */, D1 /* <: java.lang.String */, D2 /* <: java.lang.String */, D3 /* <: java.lang.String */](
    name: K,
    dependencies: js.Tuple3[D1, D2, D3],
    generatorFunction: js.Function3[
      /* import warning: ImportType.apply Failed type conversion: T[D1] */ /* value1 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[D2] */ /* value2 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[D3] */ /* value3 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
    ]
  ): IFactory[T] = js.native
  def attr[K /* <: java.lang.String */, D1 /* <: java.lang.String */, D2 /* <: java.lang.String */, D3 /* <: java.lang.String */, D4 /* <: java.lang.String */](
    name: K,
    dependencies: js.Tuple4[D1, D2, D3, D4],
    generatorFunction: js.Function4[
      /* import warning: ImportType.apply Failed type conversion: T[D1] */ /* value1 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[D2] */ /* value2 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[D3] */ /* value3 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[D4] */ /* value4 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
    ]
  ): IFactory[T] = js.native
  def attr[K /* <: java.lang.String */, D1 /* <: java.lang.String */, D2 /* <: java.lang.String */, D3 /* <: java.lang.String */, D4 /* <: java.lang.String */, D5 /* <: java.lang.String */](
    name: K,
    dependencies: js.Tuple5[D1, D2, D3, D4, D5],
    generatorFunction: js.Function5[
      /* import warning: ImportType.apply Failed type conversion: T[D1] */ /* value1 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[D2] */ /* value2 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[D3] */ /* value3 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[D4] */ /* value4 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[D5] */ /* value5 */ js.Any, 
      /* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any
    ]
  ): IFactory[T] = js.native
  /**
    * Builds a plain object containing values for each of the declared
    * attributes. The result of this is the same as the result when using #build
    * when there is no constructor registered.
    *
    * @param {object=} attributes
    * @param {object=} options
    * @return {object}
    */
  def attributes(): T = js.native
  def attributes(
    attributes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in keyof T ]:? T[k]}
    */ rosieLib.rosieLibStrings.IFactory with T
  ): T = js.native
  def attributes(
    attributes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in keyof T ]:? T[k]}
    */ rosieLib.rosieLibStrings.IFactory with T,
    options: js.Any
  ): T = js.native
  /**
    * Convenience function for defining a set of attributes on this object as
    * builder functions or static values. If you need to specify dependencies,
    * use #attr instead.
    *
    * For example:
    *
    *   Factory.define('Person').attrs({
    *     name: 'Michael',
    *     age: function() { return Math.random() * 100; }
    *   });
    *
    * @param {object} attributes
    * @return {Factory}
    */
  def attrs(
    attributes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] | (opts? : any): T[K]}
    */ rosieLib.rosieLibStrings.IFactory with js.Any
  ): IFactory[T] = js.native
  /**
    * Builds objects by getting values for all attributes and optionally passing
    * the result to a constructor function.
    *
    * @param {object=} attributes
    * @param {object=} options
    * @return {*}
    */
  def build(): T = js.native
  def build(
    attributes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in keyof T ]:? T[k]}
    */ rosieLib.rosieLibStrings.IFactory with T
  ): T = js.native
  def build(
    attributes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in keyof T ]:? T[k]}
    */ rosieLib.rosieLibStrings.IFactory with T,
    options: js.Any
  ): T = js.native
  def buildList(size: scala.Double): js.Array[T] = js.native
  def buildList(
    size: scala.Double,
    attributes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in keyof T ]:? T[k]}
    */ rosieLib.rosieLibStrings.IFactory with T
  ): js.Array[T] = js.native
  def buildList(
    size: scala.Double,
    attributes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in keyof T ]:? T[k]}
    */ rosieLib.rosieLibStrings.IFactory with T,
    options: js.Any
  ): js.Array[T] = js.native
  /**
    * Extends a given factory by copying over its attributes, options,
    * callbacks, and constructor. This can be useful when you want to make
    * different types which all share certain attributes.
    *
    * @param {string|Factory} name The factory to extend.
    * @return {Factory}
    */
  def extend[K /* <: T */, T](name: java.lang.String): IFactory[K] = js.native
  def extend[K /* <: T */, T](name: IFactory[T]): IFactory[K] = js.native
  /**
    * Sets the constructor for this factory to be another factory. This can be
    * used to create more specific sub-types of factories.
    *
    * @param {Factory} parentFactory
    * @return {Factory}
    */
  def inherits(functionArg: js.Function1[/* parentFactory */ IFactory[T], scala.Unit]): IFactory[T] = js.native
  /**
    * Define an option for this factory. Options are values that may inform
    * dynamic attribute behavior but are not included in objects built by the
    * factory. Like attributes, options may have dependencies. Unlike
    * attributes, options may only depend on other options.
    *
    *   Factory.define('Person')
    *     .option('includeRelationships', false)
    *     .attr(
    *       'spouse',
    *       ['spouse', 'includeRelationships'],
    *       function(spouse, includeRelationships) {
    *         return includeRelationships ?
    *           Factory.build('Person', spouse) :
    *           null;
    *       });
    *
    *   Factory.build('Person', null, { includeRelationships: true });
    *
    * Options may have either static or dynamic default values, just like
    * attributes. Options without default values must have a value specified
    * when building.
    *
    * @param {string} opt
    * @param {Array.<string>=} | any dependencies or value
    * @param {*=} value
    * @return {Factory}
    */
  def option(name: java.lang.String): IFactory[T] = js.native
  def option(name: java.lang.String, dependenciesOrValue: js.Any): IFactory[T] = js.native
  def option(name: java.lang.String, dependenciesOrValue: js.Any, value: js.Any): IFactory[T] = js.native
  def option(name: java.lang.String, dependenciesOrValue: js.Array[java.lang.String]): IFactory[T] = js.native
  def option(name: java.lang.String, dependenciesOrValue: js.Array[java.lang.String], value: js.Any): IFactory[T] = js.native
  /**
    * Generates values for all the registered options using the values given.
    *
    * @private
    * @param {object} options
    * @return {object}
    */
  def options(options: js.Any): js.Any = js.native
  /**
    * Defines an attribute that, by default, simply has an auto-incrementing
    * numeric value starting at 1. You can provide your own builder function
    * that accepts the number of the sequence and returns whatever value you'd
    * like it to be.
    *
    * Sequence values are inherited such that a factory derived from another
    * with a sequence will share the state of that sequence and they will never
    * conflict.
    *
    *   Factory.define('Person').sequence('id');
    *
    * @param {string} attr
    * @param {Array.<string>=} | Function dependencies or builder
    * @param {function(number): *=} builder
    * @return {Factory}
    */
  def sequence[K /* <: java.lang.String */](name: K): IFactory[T] = js.native
  def sequence[K /* <: java.lang.String */](name: K, builder: js.Function1[/* i */ scala.Double, _]): IFactory[T] = js.native
  def sequence[K /* <: java.lang.String */, D /* <: java.lang.String */](
    name: K,
    dependencies: js.Array[D],
    builder: js.Function2[/* i */ scala.Double, /* repeated */ js.Any, _]
  ): IFactory[T] = js.native
}

