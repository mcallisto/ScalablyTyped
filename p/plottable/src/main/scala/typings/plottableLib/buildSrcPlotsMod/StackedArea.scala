package typings
package plottableLib.buildSrcPlotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plottable/build/src/plots", "StackedArea")
@js.native
/**
  * @constructor
  */
class StackedArea[X] ()
  extends plottableLib.buildSrcPlotsStackedAreaPlotMod.StackedArea[X]

/* static members */
@JSImport("plottable/build/src/plots", "StackedArea")
@js.native
object StackedArea extends js.Object {
  /**
    * Given an array of Datasets and the accessor function for the key, computes the
    * set reunion (no duplicates) of the domain of each Dataset. The keys are stringified
    * before being returned.
    *
    * @param {Dataset[]} datasets The Datasets for which we extract the domain keys
    * @param {Accessor<any>} keyAccessor The accessor for the key of the data
    * @return {string[]} An array of stringified keys
    */
  /* private */ def _domainKeys(datasets: js.Any, keyAccessor: js.Any): js.Any = js.native
}

