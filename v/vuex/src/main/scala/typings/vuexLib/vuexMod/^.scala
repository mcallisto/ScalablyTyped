package typings
package vuexLib.vuexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val mapActions: vuexLib.typesHelpersMod.Mapper[vuexLib.typesHelpersMod.ActionMethod] with vuexLib.typesHelpersMod.MapperWithNamespace[vuexLib.typesHelpersMod.ActionMethod] with (vuexLib.typesHelpersMod.FunctionMapper[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dispatch */ _, 
    vuexLib.typesHelpersMod.ActionMethod
  ]) with (vuexLib.typesHelpersMod.FunctionMapperWithNamespace[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dispatch */ _, 
    vuexLib.typesHelpersMod.ActionMethod
  ]) = js.native
  val mapGetters: vuexLib.typesHelpersMod.Mapper[vuexLib.typesHelpersMod.Computed] with vuexLib.typesHelpersMod.MapperWithNamespace[vuexLib.typesHelpersMod.Computed] = js.native
  val mapMutations: vuexLib.typesHelpersMod.Mapper[vuexLib.typesHelpersMod.MutationMethod] with vuexLib.typesHelpersMod.MapperWithNamespace[vuexLib.typesHelpersMod.MutationMethod] with (vuexLib.typesHelpersMod.FunctionMapper[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Commit */ _, 
    vuexLib.typesHelpersMod.MutationMethod
  ]) with (vuexLib.typesHelpersMod.FunctionMapperWithNamespace[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Commit */ _, 
    vuexLib.typesHelpersMod.MutationMethod
  ]) = js.native
  val mapState: vuexLib.typesHelpersMod.Mapper[vuexLib.typesHelpersMod.Computed] with vuexLib.typesHelpersMod.MapperWithNamespace[vuexLib.typesHelpersMod.Computed] with vuexLib.typesHelpersMod.MapperForState with vuexLib.typesHelpersMod.MapperForStateWithNamespace = js.native
  def createNamespacedHelpers(namespace: java.lang.String): vuexLib.typesHelpersMod.NamespacedMappers = js.native
  def install(Vue: vueLib.typesVueMod.VueConstructor[vueLib.typesVueMod.Vue]): scala.Unit = js.native
}

