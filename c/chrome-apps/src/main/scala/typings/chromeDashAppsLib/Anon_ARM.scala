package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ARM extends js.Object {
  var ARM: chromeDashAppsLib.chromeDashAppsLibStrings.arm
  var MIPS: chromeDashAppsLib.chromeDashAppsLibStrings.mips
  var MIPS64: chromeDashAppsLib.chromeDashAppsLibStrings.mips64
  var X86_32: chromeDashAppsLib.chromeDashAppsLibStrings.`x86-32`
  var X86_64: chromeDashAppsLib.chromeDashAppsLibStrings.`x86-64`
}

trait Anon_Arm extends js.Object {
  var nacl_arch: chromeDashAppsLib.chromeNs.ToStringLiteral[
    Anon_ARM, 
    java.lang.String, 
    stdLib.Exclude[
      java.lang.String, 
      chromeDashAppsLib.chromeDashAppsLibStrings.mips | chromeDashAppsLib.chromeDashAppsLibStrings.arm | chromeDashAppsLib.chromeDashAppsLibStrings.`x86-64` | chromeDashAppsLib.chromeDashAppsLibStrings.`x86-32` | chromeDashAppsLib.chromeDashAppsLibStrings.mips64
    ]
  ]
  var sub_package_path: java.lang.String
}

object Anon_ARM {
  @scala.inline
  def apply(
    ARM: chromeDashAppsLib.chromeDashAppsLibStrings.arm,
    MIPS: chromeDashAppsLib.chromeDashAppsLibStrings.mips,
    MIPS64: chromeDashAppsLib.chromeDashAppsLibStrings.mips64,
    X86_32: chromeDashAppsLib.chromeDashAppsLibStrings.`x86-32`,
    X86_64: chromeDashAppsLib.chromeDashAppsLibStrings.`x86-64`
  ): Anon_ARM = {
    val __obj = js.Dynamic.literal(ARM = ARM, MIPS = MIPS, MIPS64 = MIPS64, X86_32 = X86_32, X86_64 = X86_64)
  
    __obj.asInstanceOf[Anon_ARM]
  }
}

object Anon_Arm {
  @scala.inline
  def apply(
    nacl_arch: chromeDashAppsLib.chromeNs.ToStringLiteral[
      Anon_ARM, 
      java.lang.String, 
      stdLib.Exclude[
        java.lang.String, 
        chromeDashAppsLib.chromeDashAppsLibStrings.mips | chromeDashAppsLib.chromeDashAppsLibStrings.arm | chromeDashAppsLib.chromeDashAppsLibStrings.`x86-64` | chromeDashAppsLib.chromeDashAppsLibStrings.`x86-32` | chromeDashAppsLib.chromeDashAppsLibStrings.mips64
      ]
    ],
    sub_package_path: java.lang.String
  ): Anon_Arm = {
    val __obj = js.Dynamic.literal(nacl_arch = nacl_arch.asInstanceOf[js.Any], sub_package_path = sub_package_path)
  
    __obj.asInstanceOf[Anon_Arm]
  }
}

