package typings
package threeLib.srcMaterialsMeshLambertMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshLambertMaterialParameters
  extends threeLib.srcMaterialsMaterialMod.MaterialParameters {
  var alphaMap: js.UndefOr[threeLib.srcTexturesTextureMod.Texture] = js.undefined
  var aoMap: js.UndefOr[threeLib.srcTexturesTextureMod.Texture] = js.undefined
  var aoMapIntensity: js.UndefOr[scala.Double] = js.undefined
  var color: js.UndefOr[threeLib.srcMathColorMod.Color | java.lang.String | scala.Double] = js.undefined
  var combine: js.UndefOr[threeLib.srcConstantsMod.Combine] = js.undefined
  var emissive: js.UndefOr[threeLib.srcMathColorMod.Color | java.lang.String | scala.Double] = js.undefined
  var emissiveIntensity: js.UndefOr[scala.Double] = js.undefined
  var emissiveMap: js.UndefOr[threeLib.srcTexturesTextureMod.Texture] = js.undefined
  var envMap: js.UndefOr[threeLib.srcTexturesTextureMod.Texture] = js.undefined
  var lightMap: js.UndefOr[threeLib.srcTexturesTextureMod.Texture] = js.undefined
  var lightMapIntensity: js.UndefOr[scala.Double] = js.undefined
  var map: js.UndefOr[threeLib.srcTexturesTextureMod.Texture] = js.undefined
  var morphNormals: js.UndefOr[scala.Boolean] = js.undefined
  var morphTargets: js.UndefOr[scala.Boolean] = js.undefined
  var reflectivity: js.UndefOr[scala.Double] = js.undefined
  var refractionRatio: js.UndefOr[scala.Double] = js.undefined
  var skinning: js.UndefOr[scala.Boolean] = js.undefined
  var specularMap: js.UndefOr[threeLib.srcTexturesTextureMod.Texture] = js.undefined
  var wireframe: js.UndefOr[scala.Boolean] = js.undefined
  var wireframeLinecap: js.UndefOr[java.lang.String] = js.undefined
  var wireframeLinejoin: js.UndefOr[java.lang.String] = js.undefined
  var wireframeLinewidth: js.UndefOr[scala.Double] = js.undefined
}

object MeshLambertMaterialParameters {
  @scala.inline
  def apply(
    alphaMap: threeLib.srcTexturesTextureMod.Texture = null,
    alphaTest: scala.Int | scala.Double = null,
    aoMap: threeLib.srcTexturesTextureMod.Texture = null,
    aoMapIntensity: scala.Int | scala.Double = null,
    blendDst: threeLib.srcConstantsMod.BlendingDstFactor = null,
    blendDstAlpha: scala.Int | scala.Double = null,
    blendEquation: threeLib.srcConstantsMod.BlendingEquation = null,
    blendEquationAlpha: scala.Int | scala.Double = null,
    blendSrc: threeLib.srcConstantsMod.BlendingSrcFactor | threeLib.srcConstantsMod.BlendingDstFactor = null,
    blendSrcAlpha: scala.Int | scala.Double = null,
    blending: threeLib.srcConstantsMod.Blending = null,
    clipIntersection: js.UndefOr[scala.Boolean] = js.undefined,
    clipShadows: js.UndefOr[scala.Boolean] = js.undefined,
    clippingPlanes: js.Array[threeLib.srcMathPlaneMod.Plane] = null,
    color: threeLib.srcMathColorMod.Color | java.lang.String | scala.Double = null,
    colorWrite: js.UndefOr[scala.Boolean] = js.undefined,
    combine: threeLib.srcConstantsMod.Combine = null,
    depthFunc: threeLib.srcConstantsMod.DepthModes = null,
    depthTest: js.UndefOr[scala.Boolean] = js.undefined,
    depthWrite: js.UndefOr[scala.Boolean] = js.undefined,
    dithering: js.UndefOr[scala.Boolean] = js.undefined,
    emissive: threeLib.srcMathColorMod.Color | java.lang.String | scala.Double = null,
    emissiveIntensity: scala.Int | scala.Double = null,
    emissiveMap: threeLib.srcTexturesTextureMod.Texture = null,
    envMap: threeLib.srcTexturesTextureMod.Texture = null,
    flatShading: js.UndefOr[scala.Boolean] = js.undefined,
    fog: js.UndefOr[scala.Boolean] = js.undefined,
    lightMap: threeLib.srcTexturesTextureMod.Texture = null,
    lightMapIntensity: scala.Int | scala.Double = null,
    lights: js.UndefOr[scala.Boolean] = js.undefined,
    map: threeLib.srcTexturesTextureMod.Texture = null,
    morphNormals: js.UndefOr[scala.Boolean] = js.undefined,
    morphTargets: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    overdraw: scala.Int | scala.Double = null,
    polygonOffset: js.UndefOr[scala.Boolean] = js.undefined,
    polygonOffsetFactor: scala.Int | scala.Double = null,
    polygonOffsetUnits: scala.Int | scala.Double = null,
    precision: threeLib.threeLibStrings.highp | threeLib.threeLibStrings.mediump | threeLib.threeLibStrings.lowp = null,
    premultipliedAlpha: js.UndefOr[scala.Boolean] = js.undefined,
    reflectivity: scala.Int | scala.Double = null,
    refractionRatio: scala.Int | scala.Double = null,
    shadowSide: threeLib.srcConstantsMod.Side = null,
    side: threeLib.srcConstantsMod.Side = null,
    skinning: js.UndefOr[scala.Boolean] = js.undefined,
    specularMap: threeLib.srcTexturesTextureMod.Texture = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    vertexColors: threeLib.srcConstantsMod.Colors = null,
    vertexTangents: js.UndefOr[scala.Boolean] = js.undefined,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    wireframe: js.UndefOr[scala.Boolean] = js.undefined,
    wireframeLinecap: java.lang.String = null,
    wireframeLinejoin: java.lang.String = null,
    wireframeLinewidth: scala.Int | scala.Double = null
  ): MeshLambertMaterialParameters = {
    val __obj = js.Dynamic.literal()
    if (alphaMap != null) __obj.updateDynamic("alphaMap")(alphaMap)
    if (alphaTest != null) __obj.updateDynamic("alphaTest")(alphaTest.asInstanceOf[js.Any])
    if (aoMap != null) __obj.updateDynamic("aoMap")(aoMap)
    if (aoMapIntensity != null) __obj.updateDynamic("aoMapIntensity")(aoMapIntensity.asInstanceOf[js.Any])
    if (blendDst != null) __obj.updateDynamic("blendDst")(blendDst)
    if (blendDstAlpha != null) __obj.updateDynamic("blendDstAlpha")(blendDstAlpha.asInstanceOf[js.Any])
    if (blendEquation != null) __obj.updateDynamic("blendEquation")(blendEquation)
    if (blendEquationAlpha != null) __obj.updateDynamic("blendEquationAlpha")(blendEquationAlpha.asInstanceOf[js.Any])
    if (blendSrc != null) __obj.updateDynamic("blendSrc")(blendSrc.asInstanceOf[js.Any])
    if (blendSrcAlpha != null) __obj.updateDynamic("blendSrcAlpha")(blendSrcAlpha.asInstanceOf[js.Any])
    if (blending != null) __obj.updateDynamic("blending")(blending)
    if (!js.isUndefined(clipIntersection)) __obj.updateDynamic("clipIntersection")(clipIntersection)
    if (!js.isUndefined(clipShadows)) __obj.updateDynamic("clipShadows")(clipShadows)
    if (clippingPlanes != null) __obj.updateDynamic("clippingPlanes")(clippingPlanes)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorWrite)) __obj.updateDynamic("colorWrite")(colorWrite)
    if (combine != null) __obj.updateDynamic("combine")(combine)
    if (depthFunc != null) __obj.updateDynamic("depthFunc")(depthFunc)
    if (!js.isUndefined(depthTest)) __obj.updateDynamic("depthTest")(depthTest)
    if (!js.isUndefined(depthWrite)) __obj.updateDynamic("depthWrite")(depthWrite)
    if (!js.isUndefined(dithering)) __obj.updateDynamic("dithering")(dithering)
    if (emissive != null) __obj.updateDynamic("emissive")(emissive.asInstanceOf[js.Any])
    if (emissiveIntensity != null) __obj.updateDynamic("emissiveIntensity")(emissiveIntensity.asInstanceOf[js.Any])
    if (emissiveMap != null) __obj.updateDynamic("emissiveMap")(emissiveMap)
    if (envMap != null) __obj.updateDynamic("envMap")(envMap)
    if (!js.isUndefined(flatShading)) __obj.updateDynamic("flatShading")(flatShading)
    if (!js.isUndefined(fog)) __obj.updateDynamic("fog")(fog)
    if (lightMap != null) __obj.updateDynamic("lightMap")(lightMap)
    if (lightMapIntensity != null) __obj.updateDynamic("lightMapIntensity")(lightMapIntensity.asInstanceOf[js.Any])
    if (!js.isUndefined(lights)) __obj.updateDynamic("lights")(lights)
    if (map != null) __obj.updateDynamic("map")(map)
    if (!js.isUndefined(morphNormals)) __obj.updateDynamic("morphNormals")(morphNormals)
    if (!js.isUndefined(morphTargets)) __obj.updateDynamic("morphTargets")(morphTargets)
    if (name != null) __obj.updateDynamic("name")(name)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (overdraw != null) __obj.updateDynamic("overdraw")(overdraw.asInstanceOf[js.Any])
    if (!js.isUndefined(polygonOffset)) __obj.updateDynamic("polygonOffset")(polygonOffset)
    if (polygonOffsetFactor != null) __obj.updateDynamic("polygonOffsetFactor")(polygonOffsetFactor.asInstanceOf[js.Any])
    if (polygonOffsetUnits != null) __obj.updateDynamic("polygonOffsetUnits")(polygonOffsetUnits.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha)
    if (reflectivity != null) __obj.updateDynamic("reflectivity")(reflectivity.asInstanceOf[js.Any])
    if (refractionRatio != null) __obj.updateDynamic("refractionRatio")(refractionRatio.asInstanceOf[js.Any])
    if (shadowSide != null) __obj.updateDynamic("shadowSide")(shadowSide)
    if (side != null) __obj.updateDynamic("side")(side)
    if (!js.isUndefined(skinning)) __obj.updateDynamic("skinning")(skinning)
    if (specularMap != null) __obj.updateDynamic("specularMap")(specularMap)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (vertexColors != null) __obj.updateDynamic("vertexColors")(vertexColors)
    if (!js.isUndefined(vertexTangents)) __obj.updateDynamic("vertexTangents")(vertexTangents)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (!js.isUndefined(wireframe)) __obj.updateDynamic("wireframe")(wireframe)
    if (wireframeLinecap != null) __obj.updateDynamic("wireframeLinecap")(wireframeLinecap)
    if (wireframeLinejoin != null) __obj.updateDynamic("wireframeLinejoin")(wireframeLinejoin)
    if (wireframeLinewidth != null) __obj.updateDynamic("wireframeLinewidth")(wireframeLinewidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshLambertMaterialParameters]
  }
}

