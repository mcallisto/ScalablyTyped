package typings
package cesiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Globe extends js.Object {
  var globe: cesiumLib.cesiumMod.Globe
  var imageryProviderViewModels: js.UndefOr[js.Array[cesiumLib.cesiumMod.ProviderViewModel]] = js.undefined
  var selectedImageryProviderViewModel: js.UndefOr[cesiumLib.cesiumMod.ProviderViewModel] = js.undefined
  var selectedTerrainProviderViewModel: js.UndefOr[cesiumLib.cesiumMod.ProviderViewModel] = js.undefined
  var terrainProviderViewModels: js.UndefOr[js.Array[cesiumLib.cesiumMod.ProviderViewModel]] = js.undefined
}

object Anon_Globe {
  @scala.inline
  def apply(
    globe: cesiumLib.cesiumMod.Globe,
    imageryProviderViewModels: js.Array[cesiumLib.cesiumMod.ProviderViewModel] = null,
    selectedImageryProviderViewModel: cesiumLib.cesiumMod.ProviderViewModel = null,
    selectedTerrainProviderViewModel: cesiumLib.cesiumMod.ProviderViewModel = null,
    terrainProviderViewModels: js.Array[cesiumLib.cesiumMod.ProviderViewModel] = null
  ): Anon_Globe = {
    val __obj = js.Dynamic.literal(globe = globe)
    if (imageryProviderViewModels != null) __obj.updateDynamic("imageryProviderViewModels")(imageryProviderViewModels)
    if (selectedImageryProviderViewModel != null) __obj.updateDynamic("selectedImageryProviderViewModel")(selectedImageryProviderViewModel)
    if (selectedTerrainProviderViewModel != null) __obj.updateDynamic("selectedTerrainProviderViewModel")(selectedTerrainProviderViewModel)
    if (terrainProviderViewModels != null) __obj.updateDynamic("terrainProviderViewModels")(terrainProviderViewModels)
    __obj.asInstanceOf[Anon_Globe]
  }
}

