package typings
package phaserLib.PhaserNs.PhysicsNs.ImpactNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@JSGlobal("Phaser.Physics.Impact.World")
@js.native
class World protected ()
  extends phaserLib.PhaserNs.EventsNs.EventEmitter {
  /**
    * 
    * @param scene The Scene to which this Impact World instance belongs.
    * @param config [description]
    */
  def this(scene: phaserLib.PhaserNs.Scene, config: phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs.WorldConfig) = this()
  /**
    * [description]
    */
  var bodies: phaserLib.PhaserNs.StructsNs.Set[Body] = js.native
  /**
    * Spatial hash cell dimensions
    */
  var cellSize: phaserLib.integer = js.native
  /**
    * [description]
    */
  var collisionMap: CollisionMap = js.native
  /**
    * [description]
    */
  var debugGraphic: phaserLib.PhaserNs.GameObjectsNs.Graphics = js.native
  /**
    * [description]
    */
  var defaults: phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs.WorldDefaults = js.native
  /**
    * [description]
    */
  var delta: scala.Double = js.native
  /**
    * [description]
    */
  var drawDebug: scala.Boolean = js.native
  /**
    * [description]
    */
  var enabled: scala.Boolean = js.native
  /**
    * [description]
    */
  var gravity: scala.Double = js.native
  /**
    * Impacts maximum time step is 20 fps.
    */
  var maxStep: scala.Double = js.native
  /**
    * [description]
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * [description]
    */
  var timeScale: scala.Double = js.native
  /**
    * An object containing the 4 wall bodies that bound the physics world.
    */
  var walls: phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs.WorldWalls = js.native
  /**
    * [description]
    * @param bodyA [description]
    * @param bodyB [description]
    */
  def checkBodies(bodyA: Body, bodyB: Body): scala.Unit = js.native
  /**
    * Check the body against the spatial hash.
    * @param body [description]
    * @param hash [description]
    * @param size [description]
    */
  def checkHash(body: Body, hash: js.Object, size: scala.Double): scala.Unit = js.native
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    * @param sizeX [description]
    * @param sizeY [description]
    */
  def create(x: scala.Double, y: scala.Double, sizeX: scala.Double, sizeY: scala.Double): Body = js.native
  /**
    * Creates a Graphics Game Object used for debug display and enables the world for debug drawing.
    */
  def createDebugGraphic(): phaserLib.PhaserNs.GameObjectsNs.Graphics = js.native
  /**
    * [description]
    */
  def getNextID(): phaserLib.integer = js.native
  /**
    * [description]
    */
  def pause(): World = js.native
  /**
    * [description]
    * @param object The Body to remove from this World.
    */
  def remove(`object`: Body): scala.Unit = js.native
  /**
    * [description]
    */
  def resume(): World = js.native
  /**
    * [description]
    * @param bodies An Array of Impact Bodies to set the collides value on.
    */
  def setActive(bodies: js.Array[Body]): World = js.native
  /**
    * [description]
    * @param bodies An Array of Impact Bodies to set the type value on.
    */
  def setAvsB(bodies: js.Array[Body]): World = js.native
  /**
    * Sets the bounds of the Physics world to match the given world pixel dimensions.
    * You can optionally set which 'walls' to create: left, right, top or bottom.
    * If none of the walls are given it will default to use the walls settings it had previously.
    * I.e. if you previously told it to not have the left or right walls, and you then adjust the world size
    * the newly created bounds will also not have the left and right walls.
    * Explicitly state them in the parameters to override this.
    * @param x The x coordinate of the top-left corner of the bounds.
    * @param y The y coordinate of the top-left corner of the bounds.
    * @param width The width of the bounds.
    * @param height The height of the bounds.
    * @param thickness [description] Default 64.
    * @param left If true will create the left bounds wall. Default true.
    * @param right If true will create the right bounds wall. Default true.
    * @param top If true will create the top bounds wall. Default true.
    * @param bottom If true will create the bottom bounds wall. Default true.
    */
  def setBounds(
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    width: js.UndefOr[scala.Double],
    height: js.UndefOr[scala.Double],
    thickness: js.UndefOr[scala.Double],
    left: js.UndefOr[scala.Boolean],
    right: js.UndefOr[scala.Boolean],
    top: js.UndefOr[scala.Boolean],
    bottom: js.UndefOr[scala.Boolean]
  ): World = js.native
  /**
    * [description]
    * @param bodies An Array of Impact Bodies to set the type value on.
    */
  def setBvsA(bodies: js.Array[Body]): World = js.native
  /**
    * [description]
    * @param bodies An Array of Impact Bodies to set the type value on.
    */
  def setCheckAgainstA(bodies: js.Array[Body]): World = js.native
  /**
    * [description]
    * @param bodies An Array of Impact Bodies to set the type value on.
    */
  def setCheckAgainstB(bodies: js.Array[Body]): World = js.native
  /**
    * [description]
    * @param bodies An Array of Impact Bodies to set the type value on.
    */
  def setCheckAgainstNone(bodies: js.Array[Body]): World = js.native
  /**
    * [description]
    * @param bodies An Array of Impact Bodies to set the collides value on.
    */
  def setCollidesNever(bodies: js.Array[Body]): World = js.native
  /**
    * Sets the collision map for the world either from a Weltmeister JSON level in the cache or from
    * a 2D array. If loading from a Weltmeister level, the map must have a layer called "collision".
    * @param key Either a string key that corresponds to a Weltmeister level
    * in the cache, or a 2D array of collision IDs.
    * @param tileSize The size of a tile. This is optional if loading from a Weltmeister
    * level in the cache.
    */
  def setCollisionMap(key: java.lang.String, tileSize: phaserLib.integer): CollisionMap = js.native
  def setCollisionMap(key: js.Array[js.Array[phaserLib.integer]], tileSize: phaserLib.integer): CollisionMap = js.native
  /**
    * Sets the collision map for the world from a tilemap layer. Only tiles that are marked as
    * colliding will be used. You can specify the mapping from tiles to slope IDs in a couple of
    * ways. The easiest is to use Tiled and the slopeTileProperty option. Alternatively, you can
    * manually create a slopeMap that stores the mapping between tile indices and slope IDs.
    * @param tilemapLayer The tilemap layer to use.
    * @param options Options for controlling the mapping from tiles to slope IDs.
    */
  def setCollisionMapFromTilemapLayer(tilemapLayer: phaserLib.PhaserNs.TilemapsNs.DynamicTilemapLayer): CollisionMap = js.native
  def setCollisionMapFromTilemapLayer(
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.DynamicTilemapLayer,
    options: phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs.CollisionOptions
  ): CollisionMap = js.native
  def setCollisionMapFromTilemapLayer(tilemapLayer: phaserLib.PhaserNs.TilemapsNs.StaticTilemapLayer): CollisionMap = js.native
  def setCollisionMapFromTilemapLayer(
    tilemapLayer: phaserLib.PhaserNs.TilemapsNs.StaticTilemapLayer,
    options: phaserLib.PhaserNs.TypesNs.PhysicsNs.ImpactNs.CollisionOptions
  ): CollisionMap = js.native
  /**
    * [description]
    * @param bodies An Array of Impact Bodies to set the collides value on.
    */
  def setFixed(bodies: js.Array[Body]): World = js.native
  /**
    * [description]
    * @param bodies An Array of Impact Bodies to set the collides value on.
    */
  def setLite(bodies: js.Array[Body]): World = js.native
  /**
    * [description]
    * @param bodies An Array of Impact Bodies to set the collides value on.
    */
  def setPassive(bodies: js.Array[Body]): World = js.native
  /**
    * [description]
    * @param bodies An Array of Impact Bodies to set the type value on.
    */
  def setTypeA(bodies: js.Array[Body]): World = js.native
  /**
    * [description]
    * @param bodies An Array of Impact Bodies to set the type value on.
    */
  def setTypeB(bodies: js.Array[Body]): World = js.native
  /**
    * [description]
    * @param bodies An Array of Impact Bodies to set the type value on.
    */
  def setTypeNone(bodies: js.Array[Body]): World = js.native
  /**
    * [description]
    * @param time The current time. Either a High Resolution Timer value if it comes from Request Animation Frame, or Date.now if using SetTimeout.
    * @param delta The delta time in ms since the last frame. This is a smoothed and capped value based on the FPS rate.
    */
  def update(time: scala.Double, delta: scala.Double): scala.Unit = js.native
  /**
    * position = 'left', 'right', 'top' or 'bottom'
    * @param add [description]
    * @param position [description]
    * @param x [description]
    * @param y [description]
    * @param width [description]
    * @param height [description]
    */
  def updateWall(
    add: scala.Boolean,
    position: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): scala.Unit = js.native
}

