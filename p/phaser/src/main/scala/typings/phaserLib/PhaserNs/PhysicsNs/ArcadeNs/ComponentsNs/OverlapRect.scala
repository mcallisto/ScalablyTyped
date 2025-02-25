package typings
package phaserLib.PhaserNs.PhysicsNs.ArcadeNs.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This method will search the given rectangular area and return an array of all physics bodies that
  * overlap with it. It can return either Dynamic, Static bodies or a mixture of both.
  * 
  * A body only has to intersect with the search area to be considered, it doesn't have to be fully
  * contained within it.
  * 
  * If Arcade Physics is set to use the RTree (which it is by default) then the search for is extremely fast,
  * otherwise the search is O(N) for Dynamic Bodies.
  */
trait OverlapRect extends js.Object

