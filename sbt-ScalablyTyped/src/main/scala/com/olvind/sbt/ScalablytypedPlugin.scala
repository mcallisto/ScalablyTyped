
package org.scalablytyped.sbt

import sbt._
import sbt.Keys._

object ScalablyTypedPlugin extends AutoPlugin {
  override def trigger = allRequirements
  override def requires = sbt.plugins.JvmPlugin

  object autoImport {
    object ScalablyTyped {
      object A {
        val `ant-design__create-react-context` = "org.scalablytyped" % "ant-design__create-react-context_sjs0.6_2.12" % "0.2.4-954125"
        val antd = "org.scalablytyped" % "antd_sjs0.6_2.12" % "3.18.2-efc94e"
      }
      object C {
        val csstype = "org.scalablytyped" % "csstype_sjs0.6_2.12" % "2.6.3-225f24"
      }
      object I {
        val `indefinite-observable` = "org.scalablytyped" % "indefinite-observable_sjs0.6_2.12" % "2.0.1-f7bc2e"
      }
      object J {
        val jss = "org.scalablytyped" % "jss_sjs0.6_2.12" % "9.5-dt-20190227Z-94a9c4"
      }
      object M {
        val `material-ui__core` = "org.scalablytyped" % "material-ui__core_sjs0.6_2.12" % "3.9.3-4ae327"
        val moment = "org.scalablytyped" % "moment_sjs0.6_2.12" % "2.24.0-11fa43"
      }
      object P {
        val popper_dot_js = "org.scalablytyped" % "popper_dot_js_sjs0.6_2.12" % "1.15.0-31bede"
        val `prop-types` = "org.scalablytyped" % "prop-types_sjs0.6_2.12" % "15.7-dt-20190417Z-ff94fb"
      }
      object R {
        val react = "org.scalablytyped" % "react_sjs0.6_2.12" % "16.8-dt-20190520Z-43357b"
        val `react-native` = "org.scalablytyped" % "react-native_sjs0.6_2.12" % "0.57-dt-20190522Z-206cb9"
        val `react-slick` = "org.scalablytyped" % "react-slick_sjs0.6_2.12" % "0.23-dt-20190503Z-efd128"
        val `react-transition-group` = "org.scalablytyped" % "react-transition-group_sjs0.6_2.12" % "2.9-dt-20190430Z-1af820"
      }
      object S {
        val std = "org.scalablytyped" % "std_sjs0.6_2.12" % "3.4-8a92b2"
        val `styled-components` = "org.scalablytyped" % "styled-components_sjs0.6_2.12" % "4.1-dt-20190513Z-09cddb"
      }
    }
  }
}