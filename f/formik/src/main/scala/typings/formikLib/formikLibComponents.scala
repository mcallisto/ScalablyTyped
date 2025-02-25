package typings
package formikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object formikLibComponents extends formikLibProps {
  @scala.inline
  def ErrorMessage: reactLib.reactMod.ComponentType[formikLib.distErrorMessageMod.ErrorMessageProps] = js.constructorOf[formikLib.formikMod.ErrorMessage].asInstanceOf[reactLib.reactMod.ComponentType[formikLib.distErrorMessageMod.ErrorMessageProps]]
  @scala.inline
  def FastField: reactLib.reactMod.ComponentType[js.Any] = js.constructorOf[formikLib.formikMod.FastField].asInstanceOf[reactLib.reactMod.ComponentType[js.Any]]
  @scala.inline
  def Field: reactLib.reactMod.ComponentType[js.Any] = js.constructorOf[formikLib.formikMod.Field].asInstanceOf[reactLib.reactMod.ComponentType[js.Any]]
  @scala.inline
  def FieldArray: reactLib.reactMod.ComponentType[formikLib.distFieldArrayMod.FieldArrayConfig] = js.constructorOf[formikLib.formikMod.FieldArray].asInstanceOf[reactLib.reactMod.ComponentType[formikLib.distFieldArrayMod.FieldArrayConfig]]
  @scala.inline
  def Form: reactLib.reactMod.ComponentType[
    stdLib.Pick[
      reactLib.reactMod.FormHTMLAttributes[stdLib.HTMLFormElement], 
      /* import warning: LimitUnionLength.enterTypeRef Was union type with length 255 */ js.Any
    ]
  ] = js.constructorOf[formikLib.formikMod.Form].asInstanceOf[reactLib.reactMod.ComponentType[
  stdLib.Pick[
    reactLib.reactMod.FormHTMLAttributes[stdLib.HTMLFormElement], 
    /* import warning: LimitUnionLength.enterTypeRef Was union type with length 255 */ js.Any
  ]]]
  @scala.inline
  def Formik[Values]: reactLib.reactMod.ComponentType[formikLib.distTypesMod.FormikConfig[Values]] = js.constructorOf[formikLib.formikMod.Formik[Values]].asInstanceOf[reactLib.reactMod.ComponentType[formikLib.distTypesMod.FormikConfig[Values]]]
  @scala.inline
  def FormikProvider: reactLib.reactMod.ComponentType[reactLib.reactMod.ProviderProps[formikLib.distTypesMod.FormikContext[js.Any]]] = formikLib.formikMod.^.FormikProvider.asInstanceOf[reactLib.reactMod.ComponentType[reactLib.reactMod.ProviderProps[formikLib.distTypesMod.FormikContext[js.Any]]]]
}

