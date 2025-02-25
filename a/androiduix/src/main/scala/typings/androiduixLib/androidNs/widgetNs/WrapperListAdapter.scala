package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WrapperListAdapter extends ListAdapter {
  def getWrappedAdapter(): ListAdapter
}

object WrapperListAdapter {
  @scala.inline
  def apply(
    areAllItemsEnabled: () => scala.Boolean,
    getCount: () => scala.Double,
    getItem: scala.Double => js.Any,
    getItemId: scala.Double => scala.Double,
    getItemViewType: scala.Double => scala.Double,
    getView: (scala.Double, androiduixLib.androidNs.viewNs.View, androiduixLib.androidNs.viewNs.ViewGroup) => androiduixLib.androidNs.viewNs.View,
    getViewTypeCount: () => scala.Double,
    getWrappedAdapter: () => ListAdapter,
    hasStableIds: () => scala.Boolean,
    isEmpty: () => scala.Boolean,
    isEnabled: scala.Double => scala.Boolean,
    registerDataSetObserver: androiduixLib.androidNs.databaseNs.DataSetObserver => scala.Unit,
    unregisterDataSetObserver: androiduixLib.androidNs.databaseNs.DataSetObserver => scala.Unit
  ): WrapperListAdapter = {
    val __obj = js.Dynamic.literal(areAllItemsEnabled = js.Any.fromFunction0(areAllItemsEnabled), getCount = js.Any.fromFunction0(getCount), getItem = js.Any.fromFunction1(getItem), getItemId = js.Any.fromFunction1(getItemId), getItemViewType = js.Any.fromFunction1(getItemViewType), getView = js.Any.fromFunction3(getView), getViewTypeCount = js.Any.fromFunction0(getViewTypeCount), getWrappedAdapter = js.Any.fromFunction0(getWrappedAdapter), hasStableIds = js.Any.fromFunction0(hasStableIds), isEmpty = js.Any.fromFunction0(isEmpty), isEnabled = js.Any.fromFunction1(isEnabled), registerDataSetObserver = js.Any.fromFunction1(registerDataSetObserver), unregisterDataSetObserver = js.Any.fromFunction1(unregisterDataSetObserver))
  
    __obj.asInstanceOf[WrapperListAdapter]
  }
}

