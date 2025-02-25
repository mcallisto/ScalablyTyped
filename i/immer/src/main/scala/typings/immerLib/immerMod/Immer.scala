package typings
package immerLib.immerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immer", "Immer")
@js.native
class Immer protected () extends js.Object {
  def this(config: immerLib.Anon_AutoFreeze) = this()
  /**
    * When true, `produce` will freeze the copies it creates.
    */
  val autoFreeze: scala.Boolean = js.native
  /**
    * The `produce` function takes a value and a "recipe function" (whose
    * return value often depends on the base state). The recipe function is
    * free to mutate its first argument however it wants. All mutations are
    * only ever applied to a __copy__ of the base state.
    *
    * Pass only a function to create a "curried producer" which relieves you
    * from passing the recipe function every time.
    *
    * Only plain objects and arrays are made mutable. All other objects are
    * considered uncopyable.
    *
    * Note: This function is __bound__ to its `Immer` instance.
    *
    * @param {any} base - the initial state
    * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
    * @param {Function} patchListener - optional function that will be called with all the patches produced here
    * @returns {any} a new state, or the initial state if nothing was modified
    */
  @JSName("produce")
  var produce_Original: IProduce = js.native
  /**
    * When true, drafts are ES2015 proxies.
    */
  val useProxies: scala.Boolean = js.native
  /**
    * The `produce` function takes a value and a "recipe function" (whose
    * return value often depends on the base state). The recipe function is
    * free to mutate its first argument however it wants. All mutations are
    * only ever applied to a __copy__ of the base state.
    *
    * Pass only a function to create a "curried producer" which relieves you
    * from passing the recipe function every time.
    *
    * Only plain objects and arrays are made mutable. All other objects are
    * considered uncopyable.
    *
    * Note: This function is __bound__ to its `Immer` instance.
    *
    * @param {any} base - the initial state
    * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
    * @param {Function} patchListener - optional function that will be called with all the patches produced here
    * @returns {any} a new state, or the initial state if nothing was modified
    */
  /**
    * The `produce` function takes a value and a "recipe function" (whose
    * return value often depends on the base state). The recipe function is
    * free to mutate its first argument however it wants. All mutations are
    * only ever applied to a __copy__ of the base state.
    *
    * Pass only a function to create a "curried producer" which relieves you
    * from passing the recipe function every time.
    *
    * Only plain objects and arrays are made mutable. All other objects are
    * considered uncopyable.
    *
    * Note: This function is __bound__ to its `Immer` instance.
    *
    * @param {any} base - the initial state
    * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
    * @param {Function} patchListener - optional function that will be called with all the patches produced here
    * @returns {any} a new state, or the initial state if nothing was modified
    */
  def produce[T, Return, D](base: T, recipe: js.ThisFunction1[/* this */ D, /* draft */ D, Return]): Produced[T, Return] = js.native
  def produce[T, Return, D](base: T, recipe: js.ThisFunction1[/* this */ D, /* draft */ D, Return], listener: PatchListener): Produced[T, Return] = js.native
  /** Curried producer with no default value */
  /**
    * The `produce` function takes a value and a "recipe function" (whose
    * return value often depends on the base state). The recipe function is
    * free to mutate its first argument however it wants. All mutations are
    * only ever applied to a __copy__ of the base state.
    *
    * Pass only a function to create a "curried producer" which relieves you
    * from passing the recipe function every time.
    *
    * Only plain objects and arrays are made mutable. All other objects are
    * considered uncopyable.
    *
    * Note: This function is __bound__ to its `Immer` instance.
    *
    * @param {any} base - the initial state
    * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
    * @param {Function} patchListener - optional function that will be called with all the patches produced here
    * @returns {any} a new state, or the initial state if nothing was modified
    */
  def produce[T, Rest /* <: js.Array[_] */, Return](recipe: js.ThisFunction2[/* this */ Draft[T], /* draft */ Draft[T], /* rest */ Rest, Return]): js.Function2[/* base */ Immutable[T], /* rest */ Rest, Produced[T, Return]] = js.native
  /** Curried producer with a default value */
  /**
    * The `produce` function takes a value and a "recipe function" (whose
    * return value often depends on the base state). The recipe function is
    * free to mutate its first argument however it wants. All mutations are
    * only ever applied to a __copy__ of the base state.
    *
    * Pass only a function to create a "curried producer" which relieves you
    * from passing the recipe function every time.
    *
    * Only plain objects and arrays are made mutable. All other objects are
    * considered uncopyable.
    *
    * Note: This function is __bound__ to its `Immer` instance.
    *
    * @param {any} base - the initial state
    * @param {Function} producer - function that receives a proxy of the base state as first argument and which can be freely modified
    * @param {Function} patchListener - optional function that will be called with all the patches produced here
    * @returns {any} a new state, or the initial state if nothing was modified
    */
  def produce[T, Rest /* <: js.Array[_] */, Return, D](recipe: js.ThisFunction2[/* this */ D, /* draft */ D, /* rest */ Rest, Return], defaultBase: T): js.Function2[/* base */ js.UndefOr[Immutable[D]], /* rest */ Rest, Produced[D, Return]] = js.native
  /**
    * Pass true to automatically freeze all copies created by Immer.
    *
    * By default, auto-freezing is disabled in production.
    */
  def setAutoFreeze(autoFreeze: scala.Boolean): scala.Unit = js.native
  /**
    * Pass true to use the ES2015 `Proxy` class when creating drafts, which is
    * always faster than using ES5 proxies.
    *
    * By default, feature detection is used, so calling this is rarely necessary.
    */
  def setUseProxies(useProxies: scala.Boolean): scala.Unit = js.native
}

