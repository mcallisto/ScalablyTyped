package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSetting extends js.Object {
  /**
    * 是否授权通讯地址
    */
  var `scope.address`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否授权摄像头
    */
  var `scope.camera`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否授权获取发票
    */
  var `scope.invoice`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否授权发票抬头
    */
  var `scope.invoiceTitle`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否授权录音功能
    */
  var `scope.record`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否授权用户信息
    */
  var `scope.userInfo`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否授权地理位置
    */
  var `scope.userLocation`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否授权微信运动步数
    */
  var `scope.werun`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 是否授权保存到相册
    */
  var `scope.writePhotosAlbum`: js.UndefOr[scala.Boolean] = js.undefined
}

object AuthSetting {
  @scala.inline
  def apply(
    `scope.address`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.camera`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.invoice`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.invoiceTitle`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.record`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.userInfo`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.userLocation`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.werun`: js.UndefOr[scala.Boolean] = js.undefined,
    `scope.writePhotosAlbum`: js.UndefOr[scala.Boolean] = js.undefined
  ): AuthSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`scope.address`)) __obj.updateDynamic("scope.address")(`scope.address`)
    if (!js.isUndefined(`scope.camera`)) __obj.updateDynamic("scope.camera")(`scope.camera`)
    if (!js.isUndefined(`scope.invoice`)) __obj.updateDynamic("scope.invoice")(`scope.invoice`)
    if (!js.isUndefined(`scope.invoiceTitle`)) __obj.updateDynamic("scope.invoiceTitle")(`scope.invoiceTitle`)
    if (!js.isUndefined(`scope.record`)) __obj.updateDynamic("scope.record")(`scope.record`)
    if (!js.isUndefined(`scope.userInfo`)) __obj.updateDynamic("scope.userInfo")(`scope.userInfo`)
    if (!js.isUndefined(`scope.userLocation`)) __obj.updateDynamic("scope.userLocation")(`scope.userLocation`)
    if (!js.isUndefined(`scope.werun`)) __obj.updateDynamic("scope.werun")(`scope.werun`)
    if (!js.isUndefined(`scope.writePhotosAlbum`)) __obj.updateDynamic("scope.writePhotosAlbum")(`scope.writePhotosAlbum`)
    __obj.asInstanceOf[AuthSetting]
  }
}

