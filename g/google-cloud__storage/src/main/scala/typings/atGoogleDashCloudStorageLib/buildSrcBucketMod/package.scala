package typings
package atGoogleDashCloudStorageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcBucketMod {
  type BucketExistsCallback = atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.ExistsCallback
  type BucketExistsResponse = js.Array[scala.Boolean]
  type BucketLockCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type BucketLockResponse = js.Array[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]
  type CombineCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* newFile */ atGoogleDashCloudStorageLib.buildSrcFileMod.File | scala.Null, 
    /* apiResponse */ atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata, 
    scala.Unit
  ]
  type CombineResponse = js.Tuple2[
    atGoogleDashCloudStorageLib.buildSrcFileMod.File, 
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata
  ]
  type CreateChannelCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* channel */ atGoogleDashCloudStorageLib.buildSrcChannelMod.Channel | scala.Null, 
    /* apiResponse */ atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata, 
    scala.Unit
  ]
  type CreateChannelResponse = js.Tuple2[
    atGoogleDashCloudStorageLib.buildSrcChannelMod.Channel, 
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata
  ]
  type CreateNotificationCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* notification */ atGoogleDashCloudStorageLib.buildSrcNotificationMod.Notification | scala.Null, 
    /* apiResponse */ atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata, 
    scala.Unit
  ]
  type CreateNotificationResponse = js.Tuple2[
    atGoogleDashCloudStorageLib.buildSrcNotificationMod.Notification, 
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata
  ]
  type DeleteBucketResponse = js.Array[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]
  type DeleteFilesCallback = js.Function2[
    /* err */ stdLib.Error | js.Array[stdLib.Error] | scala.Null, 
    /* apiResponse */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type DeleteLabelsCallback = SetLabelsCallback
  type DeleteLabelsResponse = js.Array[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]
  type DisableRequesterPaysCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[js.Object], 
    scala.Unit
  ]
  type DisableRequesterPaysResponse = js.Array[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]
  type EnableRequesterPaysCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* apiResponse */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type EnableRequesterPaysResponse = js.Array[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]
  type GetBucketCallback = js.Function3[
    /* err */ atGoogleDashCloudCommonLib.atGoogleDashCloudCommonMod.ApiError | scala.Null, 
    /* bucket */ Bucket | scala.Null, 
    /* apiResponse */ atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata, 
    scala.Unit
  ]
  type GetBucketMetadataCallback = js.Function3[
    /* err */ atGoogleDashCloudCommonLib.atGoogleDashCloudCommonMod.ApiError | scala.Null, 
    /* metadata */ atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata | scala.Null, 
    /* apiResponse */ atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata, 
    scala.Unit
  ]
  type GetBucketMetadataResponse = js.Tuple2[
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata, 
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata
  ]
  type GetBucketResponse = js.Tuple2[Bucket, atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]
  type GetFilesCallback = js.Function4[
    /* err */ stdLib.Error | scala.Null, 
    /* files */ js.UndefOr[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]], 
    /* nextQuery */ js.UndefOr[js.Object], 
    /* apiResponse */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type GetFilesResponse = js.Tuple3[
    js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File], 
    js.Object, 
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata
  ]
  type GetLabelsCallback = js.Function2[/* err */ stdLib.Error | scala.Null, /* labels */ js.Object | scala.Null, scala.Unit]
  type GetLabelsResponse = js.Array[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]
  type GetNotificationsCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* notifications */ js.Array[atGoogleDashCloudStorageLib.buildSrcNotificationMod.Notification] | scala.Null, 
    /* apiResponse */ atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata, 
    scala.Unit
  ]
  type GetNotificationsResponse = js.Tuple2[
    js.Array[atGoogleDashCloudStorageLib.buildSrcNotificationMod.Notification], 
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata
  ]
  type Labels = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type MakeAllFilesPublicPrivateCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | js.Array[stdLib.Error] | scala.Null], 
    /* files */ js.UndefOr[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]], 
    scala.Unit
  ]
  type MakeAllFilesPublicPrivateResponse = js.Array[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]]
  type MakeBucketPrivateCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* files */ js.UndefOr[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]], 
    scala.Unit
  ]
  type MakeBucketPrivateResponse = js.Array[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]]
  type MakeBucketPublicCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* files */ js.UndefOr[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]], 
    scala.Unit
  ]
  type MakeBucketPublicResponse = js.Array[js.Array[atGoogleDashCloudStorageLib.buildSrcFileMod.File]]
  type SetBucketMetadataCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* metadata */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type SetBucketMetadataResponse = js.Array[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]
  type SetBucketStorageClassCallback = js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]
  type SetLabelsCallback = js.Function2[
    /* err */ js.UndefOr[stdLib.Error | scala.Null], 
    /* metadata */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type SetLabelsResponse = js.Array[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]
  type UploadCallback = js.Function3[
    /* err */ stdLib.Error | scala.Null, 
    /* file */ js.UndefOr[atGoogleDashCloudStorageLib.buildSrcFileMod.File | scala.Null], 
    /* apiResponse */ js.UndefOr[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata], 
    scala.Unit
  ]
  type UploadResponse = js.Tuple2[
    atGoogleDashCloudStorageLib.buildSrcFileMod.File, 
    atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata
  ]
}
