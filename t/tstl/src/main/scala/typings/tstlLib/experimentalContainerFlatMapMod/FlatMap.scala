package typings
package tstlLib.experimentalContainerFlatMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental/container/FlatMap", "FlatMap")
@js.native
/**
  * Default Constructor.
  *
  * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
  */
class FlatMap[Key, T] ()
  extends tstlLib.baseContainerUniqueTreeMapMod.UniqueTreeMap[
      Key, 
      T, 
      FlatMap[Key, T], 
      tstlLib.experimentalContainerFlatMapMod.FlatMapNs.Iterator[Key, T], 
      tstlLib.experimentalContainerFlatMapMod.FlatMapNs.ReverseIterator[Key, T]
    ] {
  def this(comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  /**
    * Initializer Constructor.
    *
    * @param items Items to assign.
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]]) = this()
  /**
    * Copy Constructor.
    *
    * @param obj Object to copy.
    */
  def this(obj: FlatMap[Key, T]) = this()
  /**
    * Range Constructor.
    *
    * @param first Input iterator of the first position.
    * @param last Input iterator of the last position.
    * @param comp A binary function predicates *x* element would be placed before *y*. When returns `true`, then *x* precedes *y*. Note that, because *equality* is predicated by `!comp(x, y) && !comp(y, x)`, the function must not cover the *equality* like `<=` or `>=`. It must exclude the *equality* like `<` or `>`. Default is {@link less}.
    */
  def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ]) = this()
  def this(items: js.Array[tstlLib.utilityIPairMod.IPair[Key, T]], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  def this(first: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ], last: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.utilityIPairMod.IPair[Key, T], 
      tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.utilityIPairMod.IPair[Key, T], _]
    ], comp: js.Function2[/* x */ Key, /* y */ Key, scala.Boolean]) = this()
  /**
    * @hidden
    */
  var _Capsule_key: js.Any = js.native
  /**
    * @hidden
    */
  var key_comp_ : js.Any = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_erase(has0: js.Object, has1: js.Object): scala.Unit = js.native
  /**
    * @hidden
    */
  /* protected */ def _Handle_insert(has0: js.Object, has1: js.Object): scala.Unit = js.native
  /**
    * @inheritDoc
    */
  def nth(index: scala.Double): tstlLib.experimentalContainerFlatMapMod.FlatMapNs.Iterator[Key, T] = js.native
}

