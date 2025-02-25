package typings
package tstlLib.experimentalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/experimental", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val barrier: org.scalablytyped.runtime.Instantiable1[/* size */ scala.Double, tstlLib.experimentalThreadBarrierMod.Barrier] = js.native
  val couting_semaphore: org.scalablytyped.runtime.Instantiable1[
    /* import warning: RewrittenClass.unapply cls $anonfun was tparam Max */ /* max */ js.Any, 
    tstlLib.experimentalThreadSemaphoreMod.Semaphore[scala.Double]
  ] = js.native
  val flex_barrier: org.scalablytyped.runtime.Instantiable2[
    /* size */ scala.Double, 
    js.UndefOr[/* complete */ js.Function0[scala.Double]], 
    tstlLib.experimentalThreadFlexBarrierMod.FlexBarrier
  ] = js.native
  val latch: org.scalablytyped.runtime.Instantiable1[/* size */ scala.Double, tstlLib.experimentalThreadLatchMod.Latch] = js.native
  def erase[Container /* <: stdLib.Pick[
    tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[
      tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container], 
      Container
    ], 
    tstlLib.tstlLibStrings.remove_if
  ] */](
    contaier: Container,
    `val`: tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container]
  ): scala.Unit = js.native
  @JSName("erase")
  def erase_ContainerIErasableContainerIteratorIForwardIterator[Container /* <: tstlLib.experimentalAlgorithmMod.IErasableContainer[Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](container: Container, `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator]): scala.Unit = js.native
  def erase_if[Container /* <: stdLib.Pick[
    tstlLib.baseDisposableIListAlgorithmMod._IListAlgorithm[
      tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container], 
      Container
    ], 
    tstlLib.tstlLibStrings.remove_if
  ] */](
    contaier: Container,
    predicator: js.Function1[
      /* val */ tstlLib.baseDisposableIListAlgorithmMod.underscoreIListAlgorithmNs.ValueType[Container], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  @JSName("erase_if")
  def erase_if_ContainerIErasableContainerIteratorIForwardIterator[Container /* <: tstlLib.experimentalAlgorithmMod.IErasableContainer[Iterator] */, Iterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], Iterator] */](
    container: Container,
    predicator: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
}

