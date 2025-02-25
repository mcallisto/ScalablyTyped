package typings
package jszipLib.jszipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSZipLoadOptions extends js.Object {
  var base64: js.UndefOr[scala.Boolean] = js.undefined
  var checkCRC32: js.UndefOr[scala.Boolean] = js.undefined
  var createFolders: js.UndefOr[scala.Boolean] = js.undefined
  var decodeFileName: js.UndefOr[js.Function1[/* filenameBytes */ stdLib.Uint8Array, java.lang.String]] = js.undefined
  var optimizedBinaryString: js.UndefOr[scala.Boolean] = js.undefined
}

object JSZipLoadOptions {
  @scala.inline
  def apply(
    base64: js.UndefOr[scala.Boolean] = js.undefined,
    checkCRC32: js.UndefOr[scala.Boolean] = js.undefined,
    createFolders: js.UndefOr[scala.Boolean] = js.undefined,
    decodeFileName: /* filenameBytes */ stdLib.Uint8Array => java.lang.String = null,
    optimizedBinaryString: js.UndefOr[scala.Boolean] = js.undefined
  ): JSZipLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(base64)) __obj.updateDynamic("base64")(base64)
    if (!js.isUndefined(checkCRC32)) __obj.updateDynamic("checkCRC32")(checkCRC32)
    if (!js.isUndefined(createFolders)) __obj.updateDynamic("createFolders")(createFolders)
    if (decodeFileName != null) __obj.updateDynamic("decodeFileName")(js.Any.fromFunction1(decodeFileName))
    if (!js.isUndefined(optimizedBinaryString)) __obj.updateDynamic("optimizedBinaryString")(optimizedBinaryString)
    __obj.asInstanceOf[JSZipLoadOptions]
  }
}

