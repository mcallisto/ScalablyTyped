package typings
package lodashLib.fpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashCurryN extends js.Object {
  @JSName("placeholder")
  var placeholder_Original: lodashLib.lodashMod.__ = js.native
  def apply(arity: lodashLib.lodashMod.__, func: js.Function1[/* repeated */ js.Any, _]): LodashCurryN6x2 = js.native
  def apply(arity: scala.Double): LodashCurryN1x1 = js.native
  def apply(arity: scala.Double, func: js.Function1[/* repeated */ js.Any, _]): js.Function1[/* repeated */ js.Any, _] = js.native
  def apply[T1, T2, R](arity: lodashLib.lodashMod.__, func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): LodashCurryN2x2[T1, T2, R] = js.native
  def apply[T1, T2, R](arity: scala.Double, func: js.Function2[/* t1 */ T1, /* t2 */ T2, R]): lodashLib.lodashMod.CurriedFunction2[T1, T2, R] = js.native
  def apply[T1, T2, T3, R](arity: lodashLib.lodashMod.__, func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): LodashCurryN3x2[T1, T2, T3, R] = js.native
  def apply[T1, T2, T3, R](arity: scala.Double, func: js.Function3[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, R]): lodashLib.lodashMod.CurriedFunction3[T1, T2, T3, R] = js.native
  def apply[T1, T2, T3, T4, R](
    arity: lodashLib.lodashMod.__,
    func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]
  ): LodashCurryN4x2[T1, T2, T3, T4, R] = js.native
  def apply[T1, T2, T3, T4, R](arity: scala.Double, func: js.Function4[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, R]): lodashLib.lodashMod.CurriedFunction4[T1, T2, T3, T4, R] = js.native
  def apply[T1, T2, T3, T4, T5, R](
    arity: lodashLib.lodashMod.__,
    func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]
  ): LodashCurryN5x2[T1, T2, T3, T4, T5, R] = js.native
  def apply[T1, T2, T3, T4, T5, R](
    arity: scala.Double,
    func: js.Function5[/* t1 */ T1, /* t2 */ T2, /* t3 */ T3, /* t4 */ T4, /* t5 */ T5, R]
  ): lodashLib.lodashMod.CurriedFunction5[T1, T2, T3, T4, T5, R] = js.native
  /**
    * Creates a lodash object which wraps value to enable implicit method chain sequences.
    * Methods that operate on and return arrays, collections, and functions can be chained together.
    * Methods that retrieve a single value or may return a primitive value will automatically end the
    * chain sequence and return the unwrapped value. Otherwise, the value must be unwrapped with value().
    *
    * Explicit chain sequences, which must be unwrapped with value(), may be enabled using _.chain.
    *
    * The execution of chained methods is lazy, that is, it's deferred until value() is
    * implicitly or explicitly called.
    *
    * Lazy evaluation allows several methods to support shortcut fusion. Shortcut fusion
    * is an optimization to merge iteratee calls; this avoids the creation of intermediate
    * arrays and can greatly reduce the number of iteratee executions. Sections of a chain
    * sequence qualify for shortcut fusion if the section is applied to an array and iteratees
    * accept only one argument. The heuristic for whether a section qualifies for shortcut
    * fusion is subject to change.
    *
    * Chaining is supported in custom builds as long as the value() method is directly or
    * indirectly included in the build.
    *
    * In addition to lodash methods, wrappers have Array and String methods.
    * The wrapper Array methods are:
    * concat, join, pop, push, shift, sort, splice, and unshift.
    * The wrapper String methods are:
    * replace and split.
    *
    * The wrapper methods that support shortcut fusion are:
    * at, compact, drop, dropRight, dropWhile, filter, find, findLast, head, initial, last,
    * map, reject, reverse, slice, tail, take, takeRight, takeRightWhile, takeWhile, and toArray
    *
    * The chainable wrapper methods are:
    * after, ary, assign, assignIn, assignInWith, assignWith, at, before, bind, bindAll, bindKey,
    * castArray, chain, chunk, commit, compact, concat, conforms, constant, countBy, create,
    * curry, debounce, defaults, defaultsDeep, defer, delay, difference, differenceBy, differenceWith,
    * drop, dropRight, dropRightWhile, dropWhile, extend, extendWith, fill, filter, flatMap,
    * flatMapDeep, flatMapDepth, flatten, flattenDeep, flattenDepth, flip, flow, flowRight,
    * fromPairs, functions, functionsIn, groupBy, initial, intersection, intersectionBy, intersectionWith,
    * invert, invertBy, invokeMap, iteratee, keyBy, keys, keysIn, map, mapKeys, mapValues,
    * matches, matchesProperty, memoize, merge, mergeWith, method, methodOf, mixin, negate,
    * nthArg, omit, omitBy, once, orderBy, over, overArgs, overEvery, overSome, partial, partialRight,
    * partition, pick, pickBy, plant, property, propertyOf, pull, pullAll, pullAllBy, pullAllWith, pullAt,
    * push, range, rangeRight, rearg, reject, remove, rest, reverse, sampleSize, set, setWith,
    * shuffle, slice, sort, sortBy, sortedUniq, sortedUniqBy, splice, spread, tail, take,
    * takeRight, takeRightWhile, takeWhile, tap, throttle, thru, toArray, toPairs, toPairsIn,
    * toPath, toPlainObject, transform, unary, union, unionBy, unionWith, uniq, uniqBy, uniqWith,
    * unset, unshift, unzip, unzipWith, update, updateWith, values, valuesIn, without, wrap,
    * xor, xorBy, xorWith, zip, zipObject, zipObjectDeep, and zipWith.
    *
    * The wrapper methods that are not chainable by default are:
    * add, attempt, camelCase, capitalize, ceil, clamp, clone, cloneDeep, cloneDeepWith, cloneWith,
    * conformsTo, deburr, defaultTo, divide, each, eachRight, endsWith, eq, escape, escapeRegExp,
    * every, find, findIndex, findKey, findLast, findLastIndex, findLastKey, first, floor, forEach,
    * forEachRight, forIn, forInRight, forOwn, forOwnRight, get, gt, gte, has, hasIn, head,
    * identity, includes, indexOf, inRange, invoke, isArguments, isArray, isArrayBuffer,
    * isArrayLike, isArrayLikeObject, isBoolean, isBuffer, isDate, isElement, isEmpty, isEqual, isEqualWith,
    * isError, isFinite, isFunction, isInteger, isLength, isMap, isMatch, isMatchWith, isNaN,
    * isNative, isNil, isNull, isNumber, isObject, isObjectLike, isPlainObject, isRegExp,
    * isSafeInteger, isSet, isString, isUndefined, isTypedArray, isWeakMap, isWeakSet, join,
    * kebabCase, last, lastIndexOf, lowerCase, lowerFirst, lt, lte, max, maxBy, mean, meanBy,
    * min, minBy, multiply, noConflict, noop, now, nth, pad, padEnd, padStart, parseInt, pop,
    * random, reduce, reduceRight, repeat, result, round, runInContext, sample, shift, size,
    * snakeCase, some, sortedIndex, sortedIndexBy, sortedLastIndex, sortedLastIndexBy, startCase,
    * startsWith, stubArray, stubFalse, stubObject, stubString, stubTrue, subtract, sum, sumBy,
    * template, times, toFinite, toInteger, toJSON, toLength, toLower, toNumber, toSafeInteger,
    * toString, toUpper, trim, trimEnd, trimStart, truncate, unescape, uniqueId, upperCase,
    * upperFirst, value, and words.
    **/
  def placeholder[T](value: T): lodashLib.lodashMod.LoDashImplicitWrapper[T] = js.native
}

