package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val onlyUpdateForPropTypes: InferableComponentEnhancer[js.Object] = js.native
  val renderNothing: InferableComponentEnhancer[js.Object] = js.native
  val toClass: InferableComponentEnhancer[js.Object] = js.native
  def branch[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[_, TOutter] = js.native
  def branch[TOutter](
    test: predicate[TOutter],
    trueEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object],
    falseEnhancer: (ComponentEnhancer[_, _]) | InferableComponentEnhancer[js.Object]
  ): ComponentEnhancer[_, TOutter] = js.native
  def componentFromProp(propName: java.lang.String): reactLib.reactMod.StatelessComponent[_] = js.native
  def componentFromStream[TProps](propsToReactNode: mapper[Subscribable[TProps], Subscribable[reactLib.reactMod.ReactNode]]): reactLib.reactMod.ComponentType[TProps] = js.native
  def componentFromStreamWithConfig(config: ObservableConfig): js.Function1[
    /* propsToReactNode */ mapper[Subscribable[_], Subscribable[reactLib.reactMod.ReactNode]], 
    reactLib.reactMod.ComponentType[_]
  ] = js.native
  def compose[TInner, TOutter](functions: js.Function*): ComponentEnhancer[TInner, TOutter] = js.native
  def createEagerElement(`type`: java.lang.String): reactLib.reactMod.ReactElement = js.native
  def createEagerElement(`type`: java.lang.String, props: js.Object): reactLib.reactMod.ReactElement = js.native
  def createEagerElement(`type`: java.lang.String, props: js.Object, children: reactLib.reactMod.ReactNode): reactLib.reactMod.ReactElement = js.native
  def createEagerElement(`type`: reactLib.reactMod.ComponentType[_]): reactLib.reactMod.ReactElement = js.native
  def createEagerElement(`type`: reactLib.reactMod.ComponentType[_], props: js.Object): reactLib.reactMod.ReactElement = js.native
  def createEagerElement(
    `type`: reactLib.reactMod.ComponentType[_],
    props: js.Object,
    children: reactLib.reactMod.ReactNode
  ): reactLib.reactMod.ReactElement = js.native
  def createEagerFactory(`type`: java.lang.String): componentFactory = js.native
  def createEagerFactory(`type`: reactLib.reactMod.ComponentType[_]): componentFactory = js.native
  def createEventHandler[T, TSubs /* <: Subscribable[T] */](): EventHandlerOf[T, TSubs] = js.native
  def createEventHandlerWithConfig(config: ObservableConfig): js.Function0[EventHandlerOf[_, Subscribable[_]]] = js.native
  def createSink(callback: js.Function1[/* props */ js.Object, scala.Unit]): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def defaultProps[T](props: T): DefaultingInferableComponentEnhancer[T] = js.native
  def flattenProp(propName: java.lang.String): ComponentEnhancer[_, _] = js.native
  def fromRenderProps[TInner, TOutter, TRenderProps](
    RenderPropsComponent: reactLib.reactMod.ComponentType[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner]
  ): ComponentEnhancer[TInner with TOutter, TOutter] = js.native
  def fromRenderProps[TInner, TOutter, TRenderProps](
    RenderPropsComponent: reactLib.reactMod.ComponentType[_],
    propsMapper: js.Function1[/* props */ TRenderProps, TInner],
    renderPropName: java.lang.String
  ): ComponentEnhancer[TInner with TOutter, TOutter] = js.native
  def getContext[TContext](contextTypes: reactLib.reactMod.ValidationMap[TContext]): InferableComponentEnhancer[TContext] = js.native
  def getDisplayName(component: reactLib.reactMod.ComponentType[_]): java.lang.String = js.native
  def hoistStatics[TProps](hoc: InferableComponentEnhancer[TProps]): InferableComponentEnhancer[TProps] = js.native
  def hoistStatics[TProps](
    hoc: InferableComponentEnhancer[TProps],
    blacklist: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  ): InferableComponentEnhancer[TProps] = js.native
  def isClassComponent(value: js.Any): scala.Boolean = js.native
  def lifecycle[TProps, TState, TInstance](spec: (ReactLifeCycleFunctions[TProps, TState, TInstance]) with TInstance): InferableComponentEnhancer[js.Object] = js.native
  def mapProps[TInner, TOutter](propsMapper: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner, TOutter] = js.native
  def mapPropsStream[TInner, TOutter](transform: mapper[Subscribable[TOutter], Subscribable[TInner]]): ComponentEnhancer[TInner, TOutter] = js.native
  def mapPropsStreamWithConfig(config: ObservableConfig): js.Function1[/* transform */ mapper[Subscribable[_], Subscribable[_]], ComponentEnhancer[_, _]] = js.native
  def nest(Components: (java.lang.String | reactLib.reactMod.ComponentType[_])*): reactLib.reactMod.ComponentClass[_, reactLib.reactMod.ComponentState] = js.native
  def onlyUpdateForKeys(propKeys: js.Array[java.lang.String]): InferableComponentEnhancer[js.Object] = js.native
  @JSName("onlyUpdateForKeys")
  def onlyUpdateForKeys_T[T](propKeys: js.Array[java.lang.String]): InferableComponentEnhancer[js.Object] = js.native
  def pure[TProps](component: reactLib.reactMod.ComponentType[TProps]): reactLib.reactMod.ComponentType[TProps] = js.native
  def renameProp(outterName: java.lang.String, innerName: java.lang.String): ComponentEnhancer[_, _] = js.native
  def renameProps(nameMap: NameMap): ComponentEnhancer[_, _] = js.native
  def renderComponent[TProps](component: java.lang.String): ComponentEnhancer[_, _] = js.native
  def renderComponent[TProps](component: reactLib.reactMod.ComponentType[TProps]): ComponentEnhancer[_, _] = js.native
  def setDisplayName(displayName: java.lang.String): js.Function1[
    /* component */ reactLib.reactMod.ComponentType[_], 
    reactLib.reactMod.ComponentType[_]
  ] = js.native
  def setObservableConfig(config: ObservableConfig): scala.Unit = js.native
  def setPropTypes[P](propTypes: reactLib.reactMod.ValidationMap[P]): js.Function1[
    /* component */ reactLib.reactMod.ComponentType[P], 
    reactLib.reactMod.ComponentType[P]
  ] = js.native
  def setStatic(key: java.lang.String, value: js.Any): js.Function1[
    /* component */ reactLib.reactMod.ComponentType[_], 
    reactLib.reactMod.ComponentType[_]
  ] = js.native
  def shallowEqual(a: js.Object, b: js.Object): scala.Boolean = js.native
  def shouldUpdate[TProps](test: predicateDiff[TProps]): InferableComponentEnhancer[js.Object] = js.native
  def toRenderProps[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): reactLib.reactMod.StatelessComponent[TOutter with recomposeLib.Anon_Children[TInner]] = js.native
  def withContext[TContext, TProps](childContextTypes: reactLib.reactMod.ValidationMap[TContext], getChildContext: mapper[TProps, _]): InferableComponentEnhancer[js.Object] = js.native
  def withHandlers[TOutter, THandlers](handlerCreators: HandleCreators[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
  def withHandlers[TOutter, THandlers](handlerCreators: HandleCreatorsFactory[TOutter, THandlers]): InferableComponentEnhancerWithProps[THandlers with TOutter, TOutter] = js.native
  def withProps[TInner, TOutter](createProps: TInner): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def withProps[TInner, TOutter](createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def withPropsOnChange[TInner, TOutter](shouldMapOrKeys: js.Array[java.lang.String], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def withPropsOnChange[TInner, TOutter](shouldMapOrKeys: predicateDiff[TOutter], createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def withReducer[TOutter, TState, TAction, TStateName /* <: java.lang.String */, TDispatchName /* <: java.lang.String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: TState
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = js.native
  def withReducer[TOutter, TState, TAction, TStateName /* <: java.lang.String */, TDispatchName /* <: java.lang.String */](
    stateName: TStateName,
    dispatchName: TDispatchName,
    reducer: reducer[TState, TAction],
    initialState: mapper[TOutter, TState]
  ): InferableComponentEnhancerWithProps[reducerProps[TState, TAction, TStateName, TDispatchName], TOutter] = js.native
  def withState[TOutter, TState, TStateName /* <: java.lang.String */, TStateUpdaterName /* <: java.lang.String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: TState): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = js.native
  def withState[TOutter, TState, TStateName /* <: java.lang.String */, TStateUpdaterName /* <: java.lang.String */](stateName: TStateName, stateUpdaterName: TStateUpdaterName, initialState: mapper[TOutter, TState]): InferableComponentEnhancerWithProps[stateProps[TState, TStateName, TStateUpdaterName], TOutter] = js.native
  def withStateHandlers[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: TState, stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
  def withStateHandlers[TState, TUpdaters /* <: StateHandlerMap[TState] */, TOutter](createProps: mapper[TOutter, TState], stateUpdaters: StateUpdaters[TOutter, TState, TUpdaters]): InferableComponentEnhancerWithProps[TOutter with TState with TUpdaters, TOutter] = js.native
  def wrapDisplayName(component: reactLib.reactMod.ComponentType[_], wrapperName: java.lang.String): java.lang.String = js.native
}

