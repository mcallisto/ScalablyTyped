package typings
package nodeDashPgDashMigrateLib.nodeDashPgDashMigrateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlterColumnOptions extends js.Object {
  var allowNull: js.UndefOr[scala.Boolean] = js.undefined
  var collation: js.UndefOr[java.lang.String] = js.undefined
  var comment: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var default: js.UndefOr[Value] = js.undefined
  var generated: js.UndefOr[
    scala.Null | nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`false` | (nodeDashPgDashMigrateLib.Anon_ALWAYS with SequenceOptions)
  ] = js.undefined
  var notNull: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var using: js.UndefOr[java.lang.String] = js.undefined
}

object AlterColumnOptions {
  @scala.inline
  def apply(
    allowNull: js.UndefOr[scala.Boolean] = js.undefined,
    collation: java.lang.String = null,
    comment: java.lang.String = null,
    default: Value = null,
    generated: nodeDashPgDashMigrateLib.nodeDashPgDashMigrateLibNumbers.`false` | (nodeDashPgDashMigrateLib.Anon_ALWAYS with SequenceOptions) = null,
    notNull: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    using: java.lang.String = null
  ): AlterColumnOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNull)) __obj.updateDynamic("allowNull")(allowNull)
    if (collation != null) __obj.updateDynamic("collation")(collation)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (generated != null) __obj.updateDynamic("generated")(generated.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (using != null) __obj.updateDynamic("using")(using)
    __obj.asInstanceOf[AlterColumnOptions]
  }
}

