package typings
package officeDashJsDashPreviewLib.OneNoteNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a collection of notebooks.
  *
  * [Api set: OneNoteApi 1.1]
  */
trait NotebookCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The url of the site that this notebook is located. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var baseUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The client url of the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the ID of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: True if the Notebook is not created by the user (i.e. 'Misplaced Sections'). Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isVirtual: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: Gets the name of the notebook. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The section groups in the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sectionGroups: js.UndefOr[SectionGroupCollectionLoadOptions] = js.undefined
  /**
    *
    * For EACH ITEM in the collection: The the sections of the notebook. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var sections: js.UndefOr[SectionCollectionLoadOptions] = js.undefined
}

object NotebookCollectionLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[scala.Boolean] = js.undefined,
    baseUrl: js.UndefOr[scala.Boolean] = js.undefined,
    clientUrl: js.UndefOr[scala.Boolean] = js.undefined,
    id: js.UndefOr[scala.Boolean] = js.undefined,
    isVirtual: js.UndefOr[scala.Boolean] = js.undefined,
    name: js.UndefOr[scala.Boolean] = js.undefined,
    sectionGroups: SectionGroupCollectionLoadOptions = null,
    sections: SectionCollectionLoadOptions = null
  ): NotebookCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (!js.isUndefined(baseUrl)) __obj.updateDynamic("baseUrl")(baseUrl)
    if (!js.isUndefined(clientUrl)) __obj.updateDynamic("clientUrl")(clientUrl)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isVirtual)) __obj.updateDynamic("isVirtual")(isVirtual)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (sectionGroups != null) __obj.updateDynamic("sectionGroups")(sectionGroups)
    if (sections != null) __obj.updateDynamic("sections")(sections)
    __obj.asInstanceOf[NotebookCollectionLoadOptions]
  }
}

