package typings
package vuexLib.typesHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespacedMappers extends js.Object {
  @JSName("mapActions")
  var mapActions_Original: Mapper[ActionMethod] with (FunctionMapper[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dispatch */ _, 
    ActionMethod
  ]) = js.native
  @JSName("mapGetters")
  var mapGetters_Original: Mapper[Computed] = js.native
  @JSName("mapMutations")
  var mapMutations_Original: Mapper[MutationMethod] with (FunctionMapper[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Commit */ _, 
    MutationMethod
  ]) = js.native
  @JSName("mapState")
  var mapState_Original: Mapper[Computed] with MapperForState = js.native
  def mapActions(map: js.Array[java.lang.String]): Dictionary[ActionMethod] = js.native
  def mapActions(
    map: Dictionary[
      java.lang.String | (js.ThisFunction2[
        /* this */ CustomVue, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dispatch */ /* fn */ _, 
        /* repeated */ _, 
        _
      ])
    ]
  ): Dictionary[ActionMethod] = js.native
  def mapGetters(map: js.Array[java.lang.String]): Dictionary[Computed] = js.native
  def mapGetters(map: Dictionary[java.lang.String]): Dictionary[Computed] = js.native
  def mapMutations(map: js.Array[java.lang.String]): Dictionary[MutationMethod] = js.native
  def mapMutations(
    map: Dictionary[
      java.lang.String | (js.ThisFunction2[
        /* this */ CustomVue, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Commit */ /* fn */ _, 
        /* repeated */ _, 
        _
      ])
    ]
  ): Dictionary[MutationMethod] = js.native
  def mapState(map: js.Array[java.lang.String]): Dictionary[Computed] = js.native
  def mapState(map: Dictionary[java.lang.String]): Dictionary[Computed] = js.native
  @JSName("mapState")
  def mapState_S[S](map: Dictionary[js.ThisFunction2[/* this */ CustomVue, /* state */ S, /* getters */ _, _]]): Dictionary[Computed] = js.native
}

