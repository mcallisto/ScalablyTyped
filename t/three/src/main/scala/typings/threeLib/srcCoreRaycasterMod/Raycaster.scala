package typings
package threeLib.srcCoreRaycasterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/core/Raycaster", "Raycaster")
@js.native
/**
	 * This creates a new raycaster object.
	 * @param origin The origin vector where the ray casts from.
	 * @param direction The direction vector that gives direction to the ray. Should be normalized.
	 * @param near All results returned are further away than near. Near can't be negative. Default value is 0.
	 * @param far All results returned are closer then far. Far can't be lower then near . Default value is Infinity.
	 */
class Raycaster () extends js.Object {
  def this(origin: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(origin: threeLib.srcMathVector3Mod.Vector3, direction: threeLib.srcMathVector3Mod.Vector3) = this()
  def this(origin: threeLib.srcMathVector3Mod.Vector3, direction: threeLib.srcMathVector3Mod.Vector3, near: scala.Double) = this()
  def this(origin: threeLib.srcMathVector3Mod.Vector3, direction: threeLib.srcMathVector3Mod.Vector3, near: scala.Double, far: scala.Double) = this()
  /**
  	 * The far factor of the raycaster. This value indicates which objects can be discarded based on the
  	 * distance. This value shouldn't be negative and should be larger than the near property.
  	 */
  var far: scala.Double = js.native
  /**
  	 * The precision factor of the raycaster when intersecting Line objects.
  	 */
  var linePrecision: scala.Double = js.native
  /**
  	 * The near factor of the raycaster. This value indicates which objects can be discarded based on the
  	 * distance. This value shouldn't be negative and should be smaller than the far property.
  	 */
  var near: scala.Double = js.native
  var params: RaycasterParameters = js.native
  /** The Ray used for the raycasting. */
  var ray: threeLib.srcMathRayMod.Ray = js.native
  /**
  	 * Checks all intersection between the ray and the object with or without the descendants. Intersections are returned sorted by distance, closest first.
  	 * @param object The object to check for intersection with the ray.
  	 * @param recursive If true, it also checks all descendants. Otherwise it only checks intersecton with the object. Default is false.
  	 * @param optionalTarget (optional) target to set the result. Otherwise a new Array is instantiated. If set, you must clear this array prior to each call (i.e., array.length = 0;).
  	 */
  def intersectObject(`object`: threeLib.srcCoreObject3DMod.Object3D): js.Array[Intersection] = js.native
  def intersectObject(`object`: threeLib.srcCoreObject3DMod.Object3D, recursive: scala.Boolean): js.Array[Intersection] = js.native
  def intersectObject(
    `object`: threeLib.srcCoreObject3DMod.Object3D,
    recursive: scala.Boolean,
    optionalTarget: js.Array[Intersection]
  ): js.Array[Intersection] = js.native
  /**
  	 * Checks all intersection between the ray and the objects with or without the descendants. Intersections are returned sorted by distance, closest first. Intersections are of the same form as those returned by .intersectObject.
  	 * @param objects The objects to check for intersection with the ray.
  	 * @param recursive If true, it also checks all descendants of the objects. Otherwise it only checks intersecton with the objects. Default is false.
  	 * @param optionalTarget (optional) target to set the result. Otherwise a new Array is instantiated. If set, you must clear this array prior to each call (i.e., array.length = 0;).
  	 */
  def intersectObjects(objects: js.Array[threeLib.srcCoreObject3DMod.Object3D]): js.Array[Intersection] = js.native
  def intersectObjects(objects: js.Array[threeLib.srcCoreObject3DMod.Object3D], recursive: scala.Boolean): js.Array[Intersection] = js.native
  def intersectObjects(
    objects: js.Array[threeLib.srcCoreObject3DMod.Object3D],
    recursive: scala.Boolean,
    optionalTarget: js.Array[Intersection]
  ): js.Array[Intersection] = js.native
  /**
  	 * Updates the ray with a new origin and direction.
  	 * @param origin The origin vector where the ray casts from.
  	 * @param direction The normalized direction vector that gives direction to the ray.
  	 */
  def set(origin: threeLib.srcMathVector3Mod.Vector3, direction: threeLib.srcMathVector3Mod.Vector3): scala.Unit = js.native
  /**
  	 * Updates the ray with a new origin and direction.
  	 * @param coords 2D coordinates of the mouse, in normalized device coordinates (NDC)---X and Y components should be between -1 and 1.
  	 * @param camera camera from which the ray should originate
  	 */
  def setFromCamera(coords: threeLib.Anon_X, camera: threeLib.srcCamerasCameraMod.Camera): scala.Unit = js.native
}

