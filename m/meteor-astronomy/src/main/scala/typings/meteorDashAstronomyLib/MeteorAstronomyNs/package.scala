package typings
package meteorDashAstronomyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MeteorAstronomyNs {
  type Enum[T] = T with meteorDashAstronomyLib.Anon_GetIdentifier
  type Fields[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.NonFunctionProperties<T> ]: meteor-astronomy.MeteorAstronomy.ModelField<T[P], T>}
    */ meteorDashAstronomyLib.meteorDashAstronomyLibStrings.Fields with T
  type FunctionProperties[T] = stdLib.Pick[T, FunctionPropertyNames[T]]
  type FunctionPropertyNames[T] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any
  type Helpers[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof meteor-astronomy.MeteorAstronomy.FunctionProperties<T> ]: (this : T, args : ...any): any}
    */ meteorDashAstronomyLib.meteorDashAstronomyLibStrings.Helpers with js.Any
  type Model[T] = T with meteorDashAstronomyLib.Anon_Callback[T]
  type ModelField[Field, Doc] = (ModelFullField[Field, Doc]) | TypeOptions
  type MongoQuery[T] = meteorLib.MongoNs.Selector[T] | meteorLib.MongoNs.ObjectID | java.lang.String
  type NonFunctionProperties[T] = stdLib.Pick[T, NonFunctionPropertyNames[T]]
  type NonFunctionPropertyNames[T] = /* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
  type RemoveCallback = js.Function2[/* err */ js.Any, /* result */ js.Any, scala.Unit]
  type SaveAndValidateCallback = js.Function2[/* err */ js.Any, /* id */ js.Any, scala.Unit]
  type TypeOptions = TypeOptionsPrimitives | js.Array[TypeOptionsPrimitives] | Class[js.Any] | Enum[js.Any]
  type TypeOptionsPrimitives = stdLib.StringConstructor | stdLib.DateConstructor | stdLib.BooleanConstructor | stdLib.ObjectConstructor | stdLib.NumberConstructor
}
