package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRecoveryPointLifecycleInput extends js.Object {
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var BackupVaultName: awsDashSdkLib.clientsBackupMod.BackupVaultName
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[Lifecycle] = js.undefined
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a recovery point; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var RecoveryPointArn: ARN
}

object UpdateRecoveryPointLifecycleInput {
  @scala.inline
  def apply(BackupVaultName: BackupVaultName, RecoveryPointArn: ARN, Lifecycle: Lifecycle = null): UpdateRecoveryPointLifecycleInput = {
    val __obj = js.Dynamic.literal(BackupVaultName = BackupVaultName, RecoveryPointArn = RecoveryPointArn)
    if (Lifecycle != null) __obj.updateDynamic("Lifecycle")(Lifecycle)
    __obj.asInstanceOf[UpdateRecoveryPointLifecycleInput]
  }
}

