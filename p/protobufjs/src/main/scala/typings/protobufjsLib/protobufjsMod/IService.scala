package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- protobufjsLib.protobufjsMod.AnyNestedObject because Already inherited */ trait IService extends INamespace {
  /** Method descriptors */
  var methods: org.scalablytyped.runtime.StringDictionary[IMethod]
}

object IService {
  @scala.inline
  def apply(
    methods: org.scalablytyped.runtime.StringDictionary[IMethod],
    nested: org.scalablytyped.runtime.StringDictionary[AnyNestedObject] = null,
    options: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): IService = {
    val __obj = js.Dynamic.literal(methods = methods)
    if (nested != null) __obj.updateDynamic("nested")(nested)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[IService]
  }
}

