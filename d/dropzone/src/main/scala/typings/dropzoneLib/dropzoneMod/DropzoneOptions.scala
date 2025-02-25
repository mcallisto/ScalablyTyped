package typings
package dropzoneLib.dropzoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneOptions extends js.Object {
  var accept: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* error */ js.UndefOr[java.lang.String | stdLib.Error], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var acceptedFiles: js.UndefOr[java.lang.String] = js.undefined
  var addRemoveLinks: js.UndefOr[scala.Boolean] = js.undefined
  var addedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, scala.Unit]] = js.undefined
  var addedfiles: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], scala.Unit]] = js.undefined
  var autoProcessQueue: js.UndefOr[scala.Boolean] = js.undefined
  var autoQueue: js.UndefOr[scala.Boolean] = js.undefined
  var canceled: js.UndefOr[js.Function1[/* file */ DropzoneFile, scala.Unit]] = js.undefined
  var canceledmultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], scala.Unit]] = js.undefined
  var capture: js.UndefOr[java.lang.String] = js.undefined
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var chunking: js.UndefOr[scala.Boolean] = js.undefined
  var chunksUploaded: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* error */ js.UndefOr[java.lang.String | stdLib.Error], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var clickable: js.UndefOr[
    scala.Boolean | java.lang.String | dropzoneLib.dropzoneMod.Global.HTMLElement | (js.Array[java.lang.String | dropzoneLib.dropzoneMod.Global.HTMLElement])
  ] = js.undefined
  var complete: js.UndefOr[js.Function1[/* file */ DropzoneFile, scala.Unit]] = js.undefined
  var completemultiple: js.UndefOr[js.Function1[/* file */ js.Array[DropzoneFile], scala.Unit]] = js.undefined
  var createImageThumbnails: js.UndefOr[scala.Boolean] = js.undefined
  var dictCancelUpload: js.UndefOr[java.lang.String] = js.undefined
  var dictCancelUploadConfirmation: js.UndefOr[java.lang.String] = js.undefined
  var dictDefaultMessage: js.UndefOr[java.lang.String] = js.undefined
  var dictFallbackMessage: js.UndefOr[java.lang.String] = js.undefined
  var dictFallbackText: js.UndefOr[java.lang.String] = js.undefined
  var dictFileSizeUnits: js.UndefOr[DropzoneDictFileSizeUnits] = js.undefined
  var dictFileTooBig: js.UndefOr[java.lang.String] = js.undefined
  var dictInvalidFileType: js.UndefOr[java.lang.String] = js.undefined
  var dictMaxFilesExceeded: js.UndefOr[java.lang.String] = js.undefined
  var dictRemoveFile: js.UndefOr[java.lang.String] = js.undefined
  var dictRemoveFileConfirmation: js.UndefOr[java.lang.String] = js.undefined
  var dictResponseError: js.UndefOr[java.lang.String] = js.undefined
  var dictUploadCanceled: js.UndefOr[java.lang.String] = js.undefined
  var dragend: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var dragenter: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var dragleave: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var dragover: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var dragstart: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var drop: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var error: js.UndefOr[
    js.Function3[
      /* file */ DropzoneFile, 
      /* message */ java.lang.String | stdLib.Error, 
      /* xhr */ stdLib.XMLHttpRequest, 
      scala.Unit
    ]
  ] = js.undefined
  var errormultiple: js.UndefOr[
    js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* message */ java.lang.String | stdLib.Error, 
      /* xhr */ stdLib.XMLHttpRequest, 
      scala.Unit
    ]
  ] = js.undefined
  var fallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var filesizeBase: js.UndefOr[scala.Double] = js.undefined
  var forceChunking: js.UndefOr[scala.Boolean] = js.undefined
  var forceFallback: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
  var hiddenInputContainer: js.UndefOr[dropzoneLib.dropzoneMod.Global.HTMLElement] = js.undefined
  var ignoreHiddenFiles: js.UndefOr[scala.Boolean] = js.undefined
  var init: js.UndefOr[js.ThisFunction0[/* this */ Dropzone, scala.Unit]] = js.undefined
  var maxFiles: js.UndefOr[scala.Double] = js.undefined
  var maxFilesize: js.UndefOr[scala.Double] = js.undefined
  var maxThumbnailFilesize: js.UndefOr[scala.Double] = js.undefined
  var maxfilesexceeded: js.UndefOr[js.Function1[/* file */ DropzoneFile, scala.Unit]] = js.undefined
  var maxfilesreached: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], scala.Unit]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var parallelChunkUploads: js.UndefOr[scala.Boolean] = js.undefined
  var parallelUploads: js.UndefOr[scala.Double] = js.undefined
  var paramName: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var paste: js.UndefOr[js.Function1[/* e */ stdLib.DragEvent, scala.Unit]] = js.undefined
  var previewTemplate: js.UndefOr[java.lang.String] = js.undefined
  var previewsContainer: js.UndefOr[scala.Boolean | java.lang.String | dropzoneLib.dropzoneMod.Global.HTMLElement] = js.undefined
  var processing: js.UndefOr[js.Function1[/* file */ DropzoneFile, scala.Unit]] = js.undefined
  var processingmultiple: js.UndefOr[js.Function1[/* files */ js.Array[DropzoneFile], scala.Unit]] = js.undefined
  var queuecomplete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var removedfile: js.UndefOr[js.Function1[/* file */ DropzoneFile, scala.Unit]] = js.undefined
  var renameFilename: js.UndefOr[js.Function1[/* name */ java.lang.String, java.lang.String]] = js.undefined
  var reset: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var resize: js.UndefOr[
    js.Function4[
      /* file */ DropzoneFile, 
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      /* resizeMethod */ js.UndefOr[java.lang.String], 
      DropzoneResizeInfo
    ]
  ] = js.undefined
  var resizeHeight: js.UndefOr[scala.Double] = js.undefined
  var resizeMethod: js.UndefOr[java.lang.String] = js.undefined
  var resizeMimeType: js.UndefOr[java.lang.String] = js.undefined
  var resizeQuality: js.UndefOr[scala.Double] = js.undefined
  var resizeWidth: js.UndefOr[scala.Double] = js.undefined
  var retryChunks: js.UndefOr[scala.Boolean] = js.undefined
  var retryChunksLimit: js.UndefOr[scala.Double] = js.undefined
  var sending: js.UndefOr[
    js.Function3[
      /* file */ DropzoneFile, 
      /* xhr */ stdLib.XMLHttpRequest, 
      /* formData */ stdLib.FormData, 
      scala.Unit
    ]
  ] = js.undefined
  var sendingmultiple: js.UndefOr[
    js.Function3[
      /* files */ js.Array[DropzoneFile], 
      /* xhr */ stdLib.XMLHttpRequest, 
      /* formData */ stdLib.FormData, 
      scala.Unit
    ]
  ] = js.undefined
  var success: js.UndefOr[
    js.Function2[/* file */ DropzoneFile, /* response */ js.Object | java.lang.String, scala.Unit]
  ] = js.undefined
  var successmultiple: js.UndefOr[
    js.Function2[/* files */ js.Array[DropzoneFile], /* responseText */ java.lang.String, scala.Unit]
  ] = js.undefined
  var thumbnail: js.UndefOr[
    js.Function2[/* file */ DropzoneFile, /* dataUrl */ java.lang.String, scala.Unit]
  ] = js.undefined
  var thumbnailHeight: js.UndefOr[scala.Double] = js.undefined
  var thumbnailMethod: js.UndefOr[java.lang.String] = js.undefined
  var thumbnailWidth: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var totaluploadprogress: js.UndefOr[
    js.Function3[
      /* totalProgress */ scala.Double, 
      /* totalBytes */ scala.Double, 
      /* totalBytesSent */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var transformFile: js.UndefOr[
    js.Function2[
      /* file */ DropzoneFile, 
      /* done */ js.Function1[/* file */ java.lang.String | stdLib.Blob, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var uploadMultiple: js.UndefOr[scala.Boolean] = js.undefined
  var uploadprogress: js.UndefOr[
    js.Function3[
      /* file */ DropzoneFile, 
      /* progress */ scala.Double, 
      /* bytesSent */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object DropzoneOptions {
  @scala.inline
  def apply(
    accept: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[java.lang.String | stdLib.Error], scala.Unit]) => scala.Unit = null,
    acceptedFiles: java.lang.String = null,
    addRemoveLinks: js.UndefOr[scala.Boolean] = js.undefined,
    addedfile: /* file */ DropzoneFile => scala.Unit = null,
    addedfiles: /* files */ js.Array[DropzoneFile] => scala.Unit = null,
    autoProcessQueue: js.UndefOr[scala.Boolean] = js.undefined,
    autoQueue: js.UndefOr[scala.Boolean] = js.undefined,
    canceled: /* file */ DropzoneFile => scala.Unit = null,
    canceledmultiple: /* file */ js.Array[DropzoneFile] => scala.Unit = null,
    capture: java.lang.String = null,
    chunkSize: scala.Int | scala.Double = null,
    chunking: js.UndefOr[scala.Boolean] = js.undefined,
    chunksUploaded: (/* file */ DropzoneFile, /* done */ js.Function1[/* error */ js.UndefOr[java.lang.String | stdLib.Error], scala.Unit]) => scala.Unit = null,
    clickable: scala.Boolean | java.lang.String | dropzoneLib.dropzoneMod.Global.HTMLElement | (js.Array[java.lang.String | dropzoneLib.dropzoneMod.Global.HTMLElement]) = null,
    complete: /* file */ DropzoneFile => scala.Unit = null,
    completemultiple: /* file */ js.Array[DropzoneFile] => scala.Unit = null,
    createImageThumbnails: js.UndefOr[scala.Boolean] = js.undefined,
    dictCancelUpload: java.lang.String = null,
    dictCancelUploadConfirmation: java.lang.String = null,
    dictDefaultMessage: java.lang.String = null,
    dictFallbackMessage: java.lang.String = null,
    dictFallbackText: java.lang.String = null,
    dictFileSizeUnits: DropzoneDictFileSizeUnits = null,
    dictFileTooBig: java.lang.String = null,
    dictInvalidFileType: java.lang.String = null,
    dictMaxFilesExceeded: java.lang.String = null,
    dictRemoveFile: java.lang.String = null,
    dictRemoveFileConfirmation: java.lang.String = null,
    dictResponseError: java.lang.String = null,
    dictUploadCanceled: java.lang.String = null,
    dragend: /* e */ stdLib.DragEvent => scala.Unit = null,
    dragenter: /* e */ stdLib.DragEvent => scala.Unit = null,
    dragleave: /* e */ stdLib.DragEvent => scala.Unit = null,
    dragover: /* e */ stdLib.DragEvent => scala.Unit = null,
    dragstart: /* e */ stdLib.DragEvent => scala.Unit = null,
    drop: /* e */ stdLib.DragEvent => scala.Unit = null,
    error: (/* file */ DropzoneFile, /* message */ java.lang.String | stdLib.Error, /* xhr */ stdLib.XMLHttpRequest) => scala.Unit = null,
    errormultiple: (/* files */ js.Array[DropzoneFile], /* message */ java.lang.String | stdLib.Error, /* xhr */ stdLib.XMLHttpRequest) => scala.Unit = null,
    fallback: () => scala.Unit = null,
    filesizeBase: scala.Int | scala.Double = null,
    forceChunking: js.UndefOr[scala.Boolean] = js.undefined,
    forceFallback: js.UndefOr[scala.Boolean] = js.undefined,
    headers: js.Object = null,
    hiddenInputContainer: dropzoneLib.dropzoneMod.Global.HTMLElement = null,
    ignoreHiddenFiles: js.UndefOr[scala.Boolean] = js.undefined,
    init: js.ThisFunction0[/* this */ Dropzone, scala.Unit] = null,
    maxFiles: scala.Int | scala.Double = null,
    maxFilesize: scala.Int | scala.Double = null,
    maxThumbnailFilesize: scala.Int | scala.Double = null,
    maxfilesexceeded: /* file */ DropzoneFile => scala.Unit = null,
    maxfilesreached: /* files */ js.Array[DropzoneFile] => scala.Unit = null,
    method: java.lang.String = null,
    parallelChunkUploads: js.UndefOr[scala.Boolean] = js.undefined,
    parallelUploads: scala.Int | scala.Double = null,
    paramName: java.lang.String = null,
    params: js.Object = null,
    paste: /* e */ stdLib.DragEvent => scala.Unit = null,
    previewTemplate: java.lang.String = null,
    previewsContainer: scala.Boolean | java.lang.String | dropzoneLib.dropzoneMod.Global.HTMLElement = null,
    processing: /* file */ DropzoneFile => scala.Unit = null,
    processingmultiple: /* files */ js.Array[DropzoneFile] => scala.Unit = null,
    queuecomplete: () => scala.Unit = null,
    removedfile: /* file */ DropzoneFile => scala.Unit = null,
    renameFilename: /* name */ java.lang.String => java.lang.String = null,
    reset: () => scala.Unit = null,
    resize: (/* file */ DropzoneFile, /* width */ js.UndefOr[scala.Double], /* height */ js.UndefOr[scala.Double], /* resizeMethod */ js.UndefOr[java.lang.String]) => DropzoneResizeInfo = null,
    resizeHeight: scala.Int | scala.Double = null,
    resizeMethod: java.lang.String = null,
    resizeMimeType: java.lang.String = null,
    resizeQuality: scala.Int | scala.Double = null,
    resizeWidth: scala.Int | scala.Double = null,
    retryChunks: js.UndefOr[scala.Boolean] = js.undefined,
    retryChunksLimit: scala.Int | scala.Double = null,
    sending: (/* file */ DropzoneFile, /* xhr */ stdLib.XMLHttpRequest, /* formData */ stdLib.FormData) => scala.Unit = null,
    sendingmultiple: (/* files */ js.Array[DropzoneFile], /* xhr */ stdLib.XMLHttpRequest, /* formData */ stdLib.FormData) => scala.Unit = null,
    success: (/* file */ DropzoneFile, /* response */ js.Object | java.lang.String) => scala.Unit = null,
    successmultiple: (/* files */ js.Array[DropzoneFile], /* responseText */ java.lang.String) => scala.Unit = null,
    thumbnail: (/* file */ DropzoneFile, /* dataUrl */ java.lang.String) => scala.Unit = null,
    thumbnailHeight: scala.Int | scala.Double = null,
    thumbnailMethod: java.lang.String = null,
    thumbnailWidth: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null,
    totaluploadprogress: (/* totalProgress */ scala.Double, /* totalBytes */ scala.Double, /* totalBytesSent */ scala.Double) => scala.Unit = null,
    transformFile: (/* file */ DropzoneFile, /* done */ js.Function1[/* file */ java.lang.String | stdLib.Blob, scala.Unit]) => scala.Unit = null,
    uploadMultiple: js.UndefOr[scala.Boolean] = js.undefined,
    uploadprogress: (/* file */ DropzoneFile, /* progress */ scala.Double, /* bytesSent */ scala.Double) => scala.Unit = null,
    url: java.lang.String = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): DropzoneOptions = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(js.Any.fromFunction2(accept))
    if (acceptedFiles != null) __obj.updateDynamic("acceptedFiles")(acceptedFiles)
    if (!js.isUndefined(addRemoveLinks)) __obj.updateDynamic("addRemoveLinks")(addRemoveLinks)
    if (addedfile != null) __obj.updateDynamic("addedfile")(js.Any.fromFunction1(addedfile))
    if (addedfiles != null) __obj.updateDynamic("addedfiles")(js.Any.fromFunction1(addedfiles))
    if (!js.isUndefined(autoProcessQueue)) __obj.updateDynamic("autoProcessQueue")(autoProcessQueue)
    if (!js.isUndefined(autoQueue)) __obj.updateDynamic("autoQueue")(autoQueue)
    if (canceled != null) __obj.updateDynamic("canceled")(js.Any.fromFunction1(canceled))
    if (canceledmultiple != null) __obj.updateDynamic("canceledmultiple")(js.Any.fromFunction1(canceledmultiple))
    if (capture != null) __obj.updateDynamic("capture")(capture)
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (!js.isUndefined(chunking)) __obj.updateDynamic("chunking")(chunking)
    if (chunksUploaded != null) __obj.updateDynamic("chunksUploaded")(js.Any.fromFunction2(chunksUploaded))
    if (clickable != null) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (completemultiple != null) __obj.updateDynamic("completemultiple")(js.Any.fromFunction1(completemultiple))
    if (!js.isUndefined(createImageThumbnails)) __obj.updateDynamic("createImageThumbnails")(createImageThumbnails)
    if (dictCancelUpload != null) __obj.updateDynamic("dictCancelUpload")(dictCancelUpload)
    if (dictCancelUploadConfirmation != null) __obj.updateDynamic("dictCancelUploadConfirmation")(dictCancelUploadConfirmation)
    if (dictDefaultMessage != null) __obj.updateDynamic("dictDefaultMessage")(dictDefaultMessage)
    if (dictFallbackMessage != null) __obj.updateDynamic("dictFallbackMessage")(dictFallbackMessage)
    if (dictFallbackText != null) __obj.updateDynamic("dictFallbackText")(dictFallbackText)
    if (dictFileSizeUnits != null) __obj.updateDynamic("dictFileSizeUnits")(dictFileSizeUnits)
    if (dictFileTooBig != null) __obj.updateDynamic("dictFileTooBig")(dictFileTooBig)
    if (dictInvalidFileType != null) __obj.updateDynamic("dictInvalidFileType")(dictInvalidFileType)
    if (dictMaxFilesExceeded != null) __obj.updateDynamic("dictMaxFilesExceeded")(dictMaxFilesExceeded)
    if (dictRemoveFile != null) __obj.updateDynamic("dictRemoveFile")(dictRemoveFile)
    if (dictRemoveFileConfirmation != null) __obj.updateDynamic("dictRemoveFileConfirmation")(dictRemoveFileConfirmation)
    if (dictResponseError != null) __obj.updateDynamic("dictResponseError")(dictResponseError)
    if (dictUploadCanceled != null) __obj.updateDynamic("dictUploadCanceled")(dictUploadCanceled)
    if (dragend != null) __obj.updateDynamic("dragend")(js.Any.fromFunction1(dragend))
    if (dragenter != null) __obj.updateDynamic("dragenter")(js.Any.fromFunction1(dragenter))
    if (dragleave != null) __obj.updateDynamic("dragleave")(js.Any.fromFunction1(dragleave))
    if (dragover != null) __obj.updateDynamic("dragover")(js.Any.fromFunction1(dragover))
    if (dragstart != null) __obj.updateDynamic("dragstart")(js.Any.fromFunction1(dragstart))
    if (drop != null) __obj.updateDynamic("drop")(js.Any.fromFunction1(drop))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction3(error))
    if (errormultiple != null) __obj.updateDynamic("errormultiple")(js.Any.fromFunction3(errormultiple))
    if (fallback != null) __obj.updateDynamic("fallback")(js.Any.fromFunction0(fallback))
    if (filesizeBase != null) __obj.updateDynamic("filesizeBase")(filesizeBase.asInstanceOf[js.Any])
    if (!js.isUndefined(forceChunking)) __obj.updateDynamic("forceChunking")(forceChunking)
    if (!js.isUndefined(forceFallback)) __obj.updateDynamic("forceFallback")(forceFallback)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (hiddenInputContainer != null) __obj.updateDynamic("hiddenInputContainer")(hiddenInputContainer)
    if (!js.isUndefined(ignoreHiddenFiles)) __obj.updateDynamic("ignoreHiddenFiles")(ignoreHiddenFiles)
    if (init != null) __obj.updateDynamic("init")(init)
    if (maxFiles != null) __obj.updateDynamic("maxFiles")(maxFiles.asInstanceOf[js.Any])
    if (maxFilesize != null) __obj.updateDynamic("maxFilesize")(maxFilesize.asInstanceOf[js.Any])
    if (maxThumbnailFilesize != null) __obj.updateDynamic("maxThumbnailFilesize")(maxThumbnailFilesize.asInstanceOf[js.Any])
    if (maxfilesexceeded != null) __obj.updateDynamic("maxfilesexceeded")(js.Any.fromFunction1(maxfilesexceeded))
    if (maxfilesreached != null) __obj.updateDynamic("maxfilesreached")(js.Any.fromFunction1(maxfilesreached))
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(parallelChunkUploads)) __obj.updateDynamic("parallelChunkUploads")(parallelChunkUploads)
    if (parallelUploads != null) __obj.updateDynamic("parallelUploads")(parallelUploads.asInstanceOf[js.Any])
    if (paramName != null) __obj.updateDynamic("paramName")(paramName)
    if (params != null) __obj.updateDynamic("params")(params)
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction1(paste))
    if (previewTemplate != null) __obj.updateDynamic("previewTemplate")(previewTemplate)
    if (previewsContainer != null) __obj.updateDynamic("previewsContainer")(previewsContainer.asInstanceOf[js.Any])
    if (processing != null) __obj.updateDynamic("processing")(js.Any.fromFunction1(processing))
    if (processingmultiple != null) __obj.updateDynamic("processingmultiple")(js.Any.fromFunction1(processingmultiple))
    if (queuecomplete != null) __obj.updateDynamic("queuecomplete")(js.Any.fromFunction0(queuecomplete))
    if (removedfile != null) __obj.updateDynamic("removedfile")(js.Any.fromFunction1(removedfile))
    if (renameFilename != null) __obj.updateDynamic("renameFilename")(js.Any.fromFunction1(renameFilename))
    if (reset != null) __obj.updateDynamic("reset")(js.Any.fromFunction0(reset))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction4(resize))
    if (resizeHeight != null) __obj.updateDynamic("resizeHeight")(resizeHeight.asInstanceOf[js.Any])
    if (resizeMethod != null) __obj.updateDynamic("resizeMethod")(resizeMethod)
    if (resizeMimeType != null) __obj.updateDynamic("resizeMimeType")(resizeMimeType)
    if (resizeQuality != null) __obj.updateDynamic("resizeQuality")(resizeQuality.asInstanceOf[js.Any])
    if (resizeWidth != null) __obj.updateDynamic("resizeWidth")(resizeWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(retryChunks)) __obj.updateDynamic("retryChunks")(retryChunks)
    if (retryChunksLimit != null) __obj.updateDynamic("retryChunksLimit")(retryChunksLimit.asInstanceOf[js.Any])
    if (sending != null) __obj.updateDynamic("sending")(js.Any.fromFunction3(sending))
    if (sendingmultiple != null) __obj.updateDynamic("sendingmultiple")(js.Any.fromFunction3(sendingmultiple))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction2(success))
    if (successmultiple != null) __obj.updateDynamic("successmultiple")(js.Any.fromFunction2(successmultiple))
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(js.Any.fromFunction2(thumbnail))
    if (thumbnailHeight != null) __obj.updateDynamic("thumbnailHeight")(thumbnailHeight.asInstanceOf[js.Any])
    if (thumbnailMethod != null) __obj.updateDynamic("thumbnailMethod")(thumbnailMethod)
    if (thumbnailWidth != null) __obj.updateDynamic("thumbnailWidth")(thumbnailWidth.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (totaluploadprogress != null) __obj.updateDynamic("totaluploadprogress")(js.Any.fromFunction3(totaluploadprogress))
    if (transformFile != null) __obj.updateDynamic("transformFile")(js.Any.fromFunction2(transformFile))
    if (!js.isUndefined(uploadMultiple)) __obj.updateDynamic("uploadMultiple")(uploadMultiple)
    if (uploadprogress != null) __obj.updateDynamic("uploadprogress")(js.Any.fromFunction3(uploadprogress))
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[DropzoneOptions]
  }
}

