package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreDashJsLib {
  // #############################################################################################
  // Dict - https://github.com/zloirock/core-js/#dict
  // Modules: core.dict
  // #############################################################################################
  type Dict[T] = org.scalablytyped.runtime.StringDictionary[js.UndefOr[T]] with org.scalablytyped.runtime.NumberDictionary[js.UndefOr[T]]
}
