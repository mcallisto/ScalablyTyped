package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object html5plusLib {
  /**
    * 下载任务状态
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/downloader.html](http://www.html5plus.org/doc/zh_cn/downloader.html)
    */
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - scala.Nothing
    - html5plusLib.html5plusLibNumbers.`0`
    - html5plusLib.html5plusLibNumbers.`1`
    - html5plusLib.html5plusLibNumbers.`2`
    - html5plusLib.html5plusLibNumbers.`3`
    - html5plusLib.html5plusLibNumbers.`4`
    - html5plusLib.html5plusLibNumbers.`5`
    - html5plusLib.html5plusLibNumbers.`-1`
  */
  type PlusDownloaderDownloadState = js.UndefOr[_PlusDownloaderDownloadState]
  /**
    * 本地路径URL
    * 可在html页面中直接访问本地资源，以“file:///”开头，后面跟随系统的绝对路径。
    * 	如示例：“file:///D:/res/hello.html”。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  type PlusIoLocalURL = js.Any
  /**
    * 网络路径URL
    * 可在html页面中以网络资源模式访问本地资源，以“http://”开头，后面跟随相对路径。
    * 	如示例：“http://localhost:13131/_www/res/icon.png”，其中“_www”字段可支持类型与相对路径URL一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/io.html](http://www.html5plus.org/doc/zh_cn/io.html)
    */
  type PlusIoRemoteURL = js.Any
  /**
    * Objective-C类对象
    * Objective-C类对象，可通过其属性获取类的常量，可通过方法来操作类的静态方法，也通过new方法来创建类的实例对象。
    * 	对于类的静态方法，则直接通过.后面跟随方法名称调用。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ios.html](http://www.html5plus.org/doc/zh_cn/ios.html)
    */
  type PlusIosClassObject = js.Any
  /**
    * 上传任务的状态，Number类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/uploader.html](http://www.html5plus.org/doc/zh_cn/uploader.html)
    */
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - scala.Nothing
    - html5plusLib.html5plusLibNumbers.`0`
    - html5plusLib.html5plusLibNumbers.`1`
    - html5plusLib.html5plusLibNumbers.`2`
    - html5plusLib.html5plusLibNumbers.`3`
    - html5plusLib.html5plusLibNumbers.`4`
    - html5plusLib.html5plusLibNumbers.`5`
    - html5plusLib.html5plusLibNumbers.`-1`
  */
  type PlusUploaderUploadState = js.UndefOr[_PlusUploaderUploadState]
}
