package typings
package vuexLib.typesHelpersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vuex/types/helpers", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val mapActions: Mapper[ActionMethod] with MapperWithNamespace[ActionMethod] with (FunctionMapper[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dispatch */ _, 
    ActionMethod
  ]) with (FunctionMapperWithNamespace[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dispatch */ _, 
    ActionMethod
  ]) = js.native
  val mapGetters: Mapper[Computed] with MapperWithNamespace[Computed] = js.native
  val mapMutations: Mapper[MutationMethod] with MapperWithNamespace[MutationMethod] with (FunctionMapper[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Commit */ _, 
    MutationMethod
  ]) with (FunctionMapperWithNamespace[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Commit */ _, 
    MutationMethod
  ]) = js.native
  val mapState: Mapper[Computed] with MapperWithNamespace[Computed] with MapperForState with MapperForStateWithNamespace = js.native
  def createNamespacedHelpers(namespace: java.lang.String): NamespacedMappers = js.native
}

