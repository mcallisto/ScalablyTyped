package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object recomposeMod {
  type ComponentEnhancer[TInner, TOutter] = js.Function1[
    /* component */ reactLib.reactMod.ComponentType[TInner], 
    reactLib.reactMod.ComponentClass[TOutter, reactLib.reactMod.ComponentState]
  ]
  type DefaultingInferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, stdLib.Partial[TInjectedProps]]
  // withHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withhandlers
  type EventHandler = js.Function
  type HandleCreators[TOutter, THandlers] = HandleCreatorsStructure[TOutter] with (HandleCreatorsHandlers[TOutter, THandlers])
  type HandleCreatorsFactory[TOutter, THandlers] = js.Function1[/* initialProps */ TOutter, HandleCreators[TOutter, THandlers]]
  // This type is required to infer THandlers
  type HandleCreatorsHandlers[TOutter, THandlers] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof THandlers ]: (props : TOutter): THandlers[P]}
    */ recomposeLib.recomposeLibStrings.HandleCreatorsHandlers with THandlers
  // This type is required to infer TOutter
  type HandleCreatorsStructure[TOutter] = org.scalablytyped.runtime.StringDictionary[mapper[TOutter, EventHandler]]
  type InferableComponentEnhancer[TInjectedProps] = InferableComponentEnhancerWithProps[TInjectedProps, js.Object]
  type InferableComponentEnhancerWithProps[TInjectedProps, TNeedsProps] = js.Function1[
    /* component */ reactLib.reactMod.ComponentType[TInjectedProps], 
    reactLib.reactMod.ComponentClass[
      (Omit[TInjectedProps, java.lang.String]) with TNeedsProps, 
      reactLib.reactMod.ComponentState
    ]
  ]
  // renameProps: https://github.com/acdlite/recompose/blob/master/docs/API.md#renameProps
  type NameMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  // Diff / Omit taken from https://www.typescriptlang.org/docs/handbook/release-notes/typescript-2-8.html
  type Omit[T, K /* <: java.lang.String */] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type ReactLifeCycleFunctionsThisArguments[TProps, TState, TInstance] = (_ReactLifeCycleFunctionsThisArguments[TProps, TState]) with TInstance
  // withStateHandlers: https://github.com/acdlite/recompose/blob/master/docs/API.md#withstatehandlers
  type StateHandler[TState] = js.Function1[/* repeated */ js.Any, js.UndefOr[stdLib.Partial[TState]]]
  type StateHandlerMap[TState] = org.scalablytyped.runtime.StringDictionary[StateHandler[TState]]
  type StateUpdaters[TOutter, TState, TUpdaters] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ updaterName in keyof TUpdaters ]: (state : TState, props : TOutter): TUpdaters[updaterName]}
    */ recomposeLib.recomposeLibStrings.StateUpdaters with TUpdaters
  // createEagerFactory: https://github.com/acdlite/recompose/blob/master/docs/API.md#createEagerFactory
  type componentFactory = js.Function2[
    /* props */ js.UndefOr[js.Object], 
    /* children */ js.UndefOr[reactLib.reactMod.ReactNode], 
    reactLib.reactMod.ReactElement
  ]
  type mapper[TInner, TOutter] = js.Function1[/* input */ TInner, TOutter]
  type predicate[T] = mapper[T, scala.Boolean]
  type predicateDiff[T] = js.Function2[/* current */ T, /* next */ T, scala.Boolean]
  // withReducer: https://github.com/acdlite/recompose/blob/master/docs/API.md#withReducer
  type reducer[TState, TAction] = js.Function2[/* s */ TState, /* a */ TAction, TState]
}
