package typings
package convictLib.convictMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalSchema[T] extends js.Object {
  var properties: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default  :T[K]}}
    */ convictLib.convictLibStrings.InternalSchema with js.Any
}

object InternalSchema {
  @scala.inline
  def apply[T](
    properties: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends object? convict.convict.InternalSchema<T[K]> : {  default  :T[K]}}
    */ convictLib.convictLibStrings.InternalSchema with js.Any
  ): InternalSchema[T] = {
    val __obj = js.Dynamic.literal(properties = properties)
  
    __obj.asInstanceOf[InternalSchema[T]]
  }
}

