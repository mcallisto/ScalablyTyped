package typings
package webpackDashMergeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webpackDashMergeMod {
  type ConfigurationMergeConfigFunction = js.Function1[/* customizeOptions */ CustomizeOptions, ConfigurationMergeFunction]
  type ConfigurationMergeFunction = js.Function1[
    /* repeated */ webpackLib.webpackMod.Configuration, 
    webpackLib.webpackMod.Configuration
  ]
  type CustomizeArrayFunction = js.Function3[
    /* a */ js.Array[js.Any], 
    /* b */ js.Array[js.Any], 
    /* key */ java.lang.String, 
    js.UndefOr[js.Array[js.Any] | scala.Null]
  ]
  type CustomizeObjectFunction = js.Function3[
    /* a */ js.Object, 
    /* b */ js.Object, 
    /* key */ java.lang.String, 
    js.UndefOr[js.Object | scala.Null]
  ]
  type MergeFunction = ConfigurationMergeFunction | ConfigurationMergeConfigFunction
  type MultipleConfiguration = org.scalablytyped.runtime.StringDictionary[webpackLib.webpackMod.Configuration]
  type MultipleConfigurationMergeFunction = js.Function1[
    /* repeated */ MultipleConfiguration, 
    js.Array[webpackLib.webpackMod.Configuration]
  ]
  type UniqueFunction = js.Function3[
    /* field */ java.lang.String, 
    /* fields */ js.Array[java.lang.String], 
    /* keyFn */ js.Function1[/* field */ js.Any, java.lang.String], 
    CustomizeArrayFunction
  ]
}
