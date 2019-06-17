package typings
package levelupLib.levelupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LevelUpConstructor
  extends org.scalablytyped.runtime.Instantiable3[
      /* db */ abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any], 
      /* options */ js.Any, 
      /* cb */ abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback, 
      LevelUp[
        abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any], 
        abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIterator[js.Any, js.Any]
      ]
    ]
     with org.scalablytyped.runtime.Instantiable1[
      /* db */ abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any], 
      LevelUp[
        abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any], 
        abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIterator[js.Any, js.Any]
      ]
    ]
     with org.scalablytyped.runtime.Instantiable2[
      /* db */ abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any], 
      (/* options */ js.Any) | (/* cb */ abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback), 
      LevelUp[
        abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[js.Any, js.Any], 
        abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIterator[js.Any, js.Any]
      ]
    ] {
  var errors: /*typeof levelerrors*/ js.Any = js.native
  def apply[DB /* <: abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[_, _] */](db: DB): LevelUp[DB, abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIterator[_, _]] = js.native
  def apply[DB /* <: abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[_, _] */](db: DB, cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback): LevelUp[DB, abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIterator[_, _]] = js.native
  def apply[DB /* <: abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[_, _] */](db: DB, options: js.Any): LevelUp[DB, abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIterator[_, _]] = js.native
  def apply[DB /* <: abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractLevelDOWN[_, _] */](db: DB, options: js.Any, cb: abstractDashLeveldownLib.abstractDashLeveldownMod.ErrorCallback): LevelUp[DB, abstractDashLeveldownLib.abstractDashLeveldownMod.AbstractIterator[_, _]] = js.native
}

