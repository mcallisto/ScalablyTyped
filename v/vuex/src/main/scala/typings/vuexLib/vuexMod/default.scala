package typings
package vuexLib.vuexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Extracted nested Instantiables into classes in defaultNs */
@JSImport("vuex", JSImport.Default)
@js.native
object default extends js.Object {
  var Store: org.scalablytyped.runtime.Instantiable1[
    /* options */ vuexLib.vuexMod.StoreOptions[/* import warning: RewrittenClass.unapply cls $anonfun was tparam S */ js.Any], 
    vuexLib.vuexMod.Store[js.Object]
  ] = js.native
  @JSName("createNamespacedHelpers")
  var createNamespacedHelpers_Original: js.Function1[/* namespace */ java.lang.String, vuexLib.typesHelpersMod.NamespacedMappers] = js.native
  @JSName("install")
  var install_Original: js.Function1[
    /* import warning: ImportType.apply Failed type conversion: typeof _Vue */ /* Vue */ js.Any, 
    scala.Unit
  ] = js.native
  @JSName("mapActions")
  var mapActions_Original: vuexLib.typesHelpersMod.Mapper[vuexLib.typesHelpersMod.ActionMethod] with vuexLib.typesHelpersMod.MapperWithNamespace[vuexLib.typesHelpersMod.ActionMethod] with (vuexLib.typesHelpersMod.FunctionMapper[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dispatch */ _, 
    vuexLib.typesHelpersMod.ActionMethod
  ]) with (vuexLib.typesHelpersMod.FunctionMapperWithNamespace[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dispatch */ _, 
    vuexLib.typesHelpersMod.ActionMethod
  ]) = js.native
  @JSName("mapGetters")
  var mapGetters_Original: vuexLib.typesHelpersMod.Mapper[vuexLib.typesHelpersMod.Computed] with vuexLib.typesHelpersMod.MapperWithNamespace[vuexLib.typesHelpersMod.Computed] = js.native
  @JSName("mapMutations")
  var mapMutations_Original: vuexLib.typesHelpersMod.Mapper[vuexLib.typesHelpersMod.MutationMethod] with vuexLib.typesHelpersMod.MapperWithNamespace[vuexLib.typesHelpersMod.MutationMethod] with (vuexLib.typesHelpersMod.FunctionMapper[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Commit */ _, 
    vuexLib.typesHelpersMod.MutationMethod
  ]) with (vuexLib.typesHelpersMod.FunctionMapperWithNamespace[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Commit */ _, 
    vuexLib.typesHelpersMod.MutationMethod
  ]) = js.native
  @JSName("mapState")
  var mapState_Original: vuexLib.typesHelpersMod.Mapper[vuexLib.typesHelpersMod.Computed] with vuexLib.typesHelpersMod.MapperWithNamespace[vuexLib.typesHelpersMod.Computed] with vuexLib.typesHelpersMod.MapperForState with vuexLib.typesHelpersMod.MapperForStateWithNamespace = js.native
  def createNamespacedHelpers(namespace: java.lang.String): vuexLib.typesHelpersMod.NamespacedMappers = js.native
  def install(Vue: /* import warning: ImportType.apply Failed type conversion: typeof _Vue */ js.Any): scala.Unit = js.native
  def mapActions(map: js.Array[java.lang.String]): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.ActionMethod] = js.native
  def mapActions(
    map: vuexLib.typesHelpersMod.Dictionary[
      java.lang.String | (js.ThisFunction2[
        /* this */ vuexLib.typesHelpersMod.CustomVue, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dispatch */ /* fn */ _, 
        /* repeated */ _, 
        _
      ])
    ]
  ): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.ActionMethod] = js.native
  def mapActions(namespace: java.lang.String, map: js.Array[java.lang.String]): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.ActionMethod] = js.native
  def mapActions(
    namespace: java.lang.String,
    map: vuexLib.typesHelpersMod.Dictionary[
      java.lang.String | (js.ThisFunction2[
        /* this */ vuexLib.typesHelpersMod.CustomVue, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Dispatch */ /* fn */ _, 
        /* repeated */ _, 
        _
      ])
    ]
  ): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.ActionMethod] = js.native
  def mapGetters(map: js.Array[java.lang.String]): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.Computed] = js.native
  def mapGetters(map: vuexLib.typesHelpersMod.Dictionary[java.lang.String]): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.Computed] = js.native
  def mapGetters(namespace: java.lang.String, map: js.Array[java.lang.String]): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.Computed] = js.native
  def mapGetters(namespace: java.lang.String, map: vuexLib.typesHelpersMod.Dictionary[java.lang.String]): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.Computed] = js.native
  def mapMutations(map: js.Array[java.lang.String]): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.MutationMethod] = js.native
  def mapMutations(
    map: vuexLib.typesHelpersMod.Dictionary[
      java.lang.String | (js.ThisFunction2[
        /* this */ vuexLib.typesHelpersMod.CustomVue, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Commit */ /* fn */ _, 
        /* repeated */ _, 
        _
      ])
    ]
  ): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.MutationMethod] = js.native
  def mapMutations(namespace: java.lang.String, map: js.Array[java.lang.String]): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.MutationMethod] = js.native
  def mapMutations(
    namespace: java.lang.String,
    map: vuexLib.typesHelpersMod.Dictionary[
      java.lang.String | (js.ThisFunction2[
        /* this */ vuexLib.typesHelpersMod.CustomVue, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Commit */ /* fn */ _, 
        /* repeated */ _, 
        _
      ])
    ]
  ): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.MutationMethod] = js.native
  def mapState(map: js.Array[java.lang.String]): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.Computed] = js.native
  def mapState(map: vuexLib.typesHelpersMod.Dictionary[java.lang.String]): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.Computed] = js.native
  def mapState(namespace: java.lang.String, map: js.Array[java.lang.String]): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.Computed] = js.native
  def mapState(namespace: java.lang.String, map: vuexLib.typesHelpersMod.Dictionary[java.lang.String]): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.Computed] = js.native
  @JSName("mapState")
  def mapState_S[S](
    map: vuexLib.typesHelpersMod.Dictionary[
      js.ThisFunction2[/* this */ vuexLib.typesHelpersMod.CustomVue, /* state */ S, /* getters */ _, _]
    ]
  ): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.Computed] = js.native
  @JSName("mapState")
  def mapState_S[S](
    namespace: java.lang.String,
    map: vuexLib.typesHelpersMod.Dictionary[
      js.ThisFunction2[/* this */ vuexLib.typesHelpersMod.CustomVue, /* state */ S, /* getters */ _, _]
    ]
  ): vuexLib.typesHelpersMod.Dictionary[vuexLib.typesHelpersMod.Computed] = js.native
}

