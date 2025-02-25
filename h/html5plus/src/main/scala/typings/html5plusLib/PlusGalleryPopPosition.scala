package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，弹出拍照或摄像界面指示位置
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
  */
trait PlusGalleryPopPosition extends js.Object {
  /**
    * 指示区域的高度
    * 弹出拍照或摄像窗口指示区域的高度，单位支持像素值（如"100px"）和百分比（如"50%"），如不写单位则为像素值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 指示区域距离容器左侧的距离
    * 弹出拍照或摄像窗口指示区域距离容器左侧的距离，单位支持像素值（如"100px"）和百分比（如"50%"），如不写单位则为像素值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var left: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 指示区域距离容器顶部的距离
    * 弹出拍照或摄像窗口指示区域距离容器顶部的距离，单位支持像素值（如"100px"）和百分比（如"50%"），如不写单位则为像素值值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var top: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 指示区域的宽度
    * 弹出拍照或摄像窗口指示区域的宽度，单位支持像素值（如"100px"）和百分比（如"50%"），如不写单位则为像素值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/gallery.html](http://www.html5plus.org/doc/zh_cn/gallery.html)
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object PlusGalleryPopPosition {
  @scala.inline
  def apply(
    height: java.lang.String = null,
    left: java.lang.String = null,
    top: java.lang.String = null,
    width: java.lang.String = null
  ): PlusGalleryPopPosition = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height)
    if (left != null) __obj.updateDynamic("left")(left)
    if (top != null) __obj.updateDynamic("top")(top)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[PlusGalleryPopPosition]
  }
}

