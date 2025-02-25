package typings
package typescriptDashLogicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typescriptDashLogicMod {
  type And[A /* <: scala.Boolean */, B /* <: scala.Boolean */] = LogicalTable[
    A, 
    B, 
    typescriptDashLogicLib.typescriptDashLogicLibNumbers.`true`, 
    typescriptDashLogicLib.typescriptDashLogicLibNumbers.`false`, 
    typescriptDashLogicLib.typescriptDashLogicLibNumbers.`false`, 
    typescriptDashLogicLib.typescriptDashLogicLibNumbers.`false`
  ]
  type If[Boolean /* <: scala.Boolean */, WhenTrue, WhenFalse] = WhenFalse | WhenTrue
  type LogicalTable[A /* <: scala.Boolean */, B /* <: scala.Boolean */, AB, AnB, nAB, nAnB] = nAnB | nAB | AnB | AB
  type Or[A /* <: scala.Boolean */, B /* <: scala.Boolean */] = LogicalTable[
    A, 
    B, 
    typescriptDashLogicLib.typescriptDashLogicLibNumbers.`true`, 
    typescriptDashLogicLib.typescriptDashLogicLibNumbers.`true`, 
    typescriptDashLogicLib.typescriptDashLogicLibNumbers.`true`, 
    typescriptDashLogicLib.typescriptDashLogicLibNumbers.`false`
  ]
  type Xor[A /* <: scala.Boolean */, B /* <: scala.Boolean */] = LogicalTable[
    A, 
    B, 
    typescriptDashLogicLib.typescriptDashLogicLibNumbers.`false`, 
    typescriptDashLogicLib.typescriptDashLogicLibNumbers.`true`, 
    typescriptDashLogicLib.typescriptDashLogicLibNumbers.`true`, 
    typescriptDashLogicLib.typescriptDashLogicLibNumbers.`false`
  ]
}
