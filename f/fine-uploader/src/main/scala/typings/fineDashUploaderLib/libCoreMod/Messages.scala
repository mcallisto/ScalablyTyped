package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Messages extends js.Object {
  /**
    * Text passed to the error event handler if a submitted item is zero bits
    *
    * @default `'{file} is empty, please select files again without it.'`
    */
  var emptyError: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text passed to the error event handler if an image is too tall
    *
    * @default `'Image is too tall.'`
    */
  var maxHeightImageError: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text passed to the error event handler if an image is too wide
    *
    * @default `'Image is too wide.'`
    */
  var maxWidthImageError: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text passed to the error event handler if an image is not tall enough
    *
    * @default `'Image is not tall enough.'`
    */
  var minHeightImageError: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text passed to the error event handler if the item is too small
    *
    * @default `'{file} is too small, minimum file size is {minSizeLimit}.'`
    */
  var minSizeError: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text passed to the error event handler if an image is not wide enough
    *
    * @default `'Image is not wide enough.'`
    */
  var minWidthImageError: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text passed to the error event handler if any empty array of items is submitted
    *
    * @default `'No files to upload.'`
    */
  var noFilesError: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text displayed to the user when they attempt to leave the page while uploads are still in progress
    *
    * @default `'The files are being uploaded, if you leave now the upload will be canceled.'`
    */
  var onLeave: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text passed to the error event handler if a retry attempt is declared a failed due to a violation of the `validation.itemLimit` rule
    *
    * @default `'Retry failed - you have reached your file limit.'`
    */
  var retryFailTooManyItemsError: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text passed to the error event handler if a submitted item is too large.
    *
    * @default `'{file} is too large, maximum file size is {sizeLimit}.'`
    */
  var sizeError: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text passed to the error event handler if a submit is ignored due to a violation of the `validation.itemLimit` rules
    *
    * @default `'Too many items ({netItems}) would be uploaded. Item limit is {itemLimit}.'`
    */
  var tooManyItemsError: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text passed to the error event handler if an invalid file type is detected
    *
    * @default `'{file} has an invalid extension. Valid extension(s): {extensions}.'`
    */
  var typeError: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Message displayed if the browser is iOS8 Safari and the corresponding workarounds option is not disabled
    *
    * @default `'Unrecoverable error - this browser does not permit file uploading of any kind due to serious bugs in iOS8 Safari. Please use iOS8 Chrome until Apple fixes these issues.'`
    */
  var unsupportedBrowserIos8Safari: js.UndefOr[java.lang.String] = js.undefined
}

object Messages {
  @scala.inline
  def apply(
    emptyError: java.lang.String = null,
    maxHeightImageError: java.lang.String = null,
    maxWidthImageError: java.lang.String = null,
    minHeightImageError: java.lang.String = null,
    minSizeError: java.lang.String = null,
    minWidthImageError: java.lang.String = null,
    noFilesError: java.lang.String = null,
    onLeave: java.lang.String = null,
    retryFailTooManyItemsError: java.lang.String = null,
    sizeError: java.lang.String = null,
    tooManyItemsError: java.lang.String = null,
    typeError: java.lang.String = null,
    unsupportedBrowserIos8Safari: java.lang.String = null
  ): Messages = {
    val __obj = js.Dynamic.literal()
    if (emptyError != null) __obj.updateDynamic("emptyError")(emptyError)
    if (maxHeightImageError != null) __obj.updateDynamic("maxHeightImageError")(maxHeightImageError)
    if (maxWidthImageError != null) __obj.updateDynamic("maxWidthImageError")(maxWidthImageError)
    if (minHeightImageError != null) __obj.updateDynamic("minHeightImageError")(minHeightImageError)
    if (minSizeError != null) __obj.updateDynamic("minSizeError")(minSizeError)
    if (minWidthImageError != null) __obj.updateDynamic("minWidthImageError")(minWidthImageError)
    if (noFilesError != null) __obj.updateDynamic("noFilesError")(noFilesError)
    if (onLeave != null) __obj.updateDynamic("onLeave")(onLeave)
    if (retryFailTooManyItemsError != null) __obj.updateDynamic("retryFailTooManyItemsError")(retryFailTooManyItemsError)
    if (sizeError != null) __obj.updateDynamic("sizeError")(sizeError)
    if (tooManyItemsError != null) __obj.updateDynamic("tooManyItemsError")(tooManyItemsError)
    if (typeError != null) __obj.updateDynamic("typeError")(typeError)
    if (unsupportedBrowserIos8Safari != null) __obj.updateDynamic("unsupportedBrowserIos8Safari")(unsupportedBrowserIos8Safari)
    __obj.asInstanceOf[Messages]
  }
}

