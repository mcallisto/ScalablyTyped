package typings
package atNivoScatterplotLib.atNivoScatterplotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof @nivo/scatterplot.@nivo/scatterplot.ScatterPlotCanvasProps, 'xScale' | 'yScale'> ]: @nivo/scatterplot.@nivo/scatterplot.ScatterPlotCanvasProps[P]} */ trait CustomCanvasLayerProps extends ScatterPlotComputedProps

object CustomCanvasLayerProps {
  @scala.inline
  def apply(
    innerHeight: scala.Double,
    innerWidth: scala.Double,
    nodes: js.Array[Node],
    outerHeight: scala.Double,
    outerWidth: scala.Double,
    xScale: Scale,
    yScale: Scale
  ): CustomCanvasLayerProps = {
    val __obj = js.Dynamic.literal(innerHeight = innerHeight, innerWidth = innerWidth, nodes = nodes, outerHeight = outerHeight, outerWidth = outerWidth, xScale = xScale, yScale = yScale)
  
    __obj.asInstanceOf[CustomCanvasLayerProps]
  }
}

