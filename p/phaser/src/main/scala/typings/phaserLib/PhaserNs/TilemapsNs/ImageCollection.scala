package typings
package phaserLib.PhaserNs.TilemapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Image Collection is a special Tile Set containing multiple images, with no slicing into each image.
  * 
  * Image Collections are normally created automatically when Tiled data is loaded.
  */
@JSGlobal("Phaser.Tilemaps.ImageCollection")
@js.native
class ImageCollection protected () extends js.Object {
  /**
    * 
    * @param name The name of the image collection in the map data.
    * @param firstgid The first image index this image collection contains.
    * @param width Width of widest image (in pixels). Default 32.
    * @param height Height of tallest image (in pixels). Default 32.
    * @param margin The margin around all images in the collection (in pixels). Default 0.
    * @param spacing The spacing between each image in the collection (in pixels). Default 0.
    * @param properties Custom Image Collection properties. Default {}.
    */
  def this(name: java.lang.String, firstgid: phaserLib.integer) = this()
  def this(name: java.lang.String, firstgid: phaserLib.integer, width: phaserLib.integer) = this()
  def this(name: java.lang.String, firstgid: phaserLib.integer, width: phaserLib.integer, height: phaserLib.integer) = this()
  def this(name: java.lang.String, firstgid: phaserLib.integer, width: phaserLib.integer, height: phaserLib.integer, margin: phaserLib.integer) = this()
  def this(name: java.lang.String, firstgid: phaserLib.integer, width: phaserLib.integer, height: phaserLib.integer, margin: phaserLib.integer, spacing: phaserLib.integer) = this()
  def this(name: java.lang.String, firstgid: phaserLib.integer, width: phaserLib.integer, height: phaserLib.integer, margin: phaserLib.integer, spacing: phaserLib.integer, properties: js.Object) = this()
  /**
    * The Tiled firstgid value.
    * This is the starting index of the first image index this Image Collection contains.
    */
  var firstgid: phaserLib.integer = js.native
  /**
    * The height of the tallest image (in pixels).
    */
  val imageHeight: phaserLib.integer = js.native
  /**
    * The margin around the images in the collection (in pixels).
    * Use `setSpacing` to change.
    */
  val imageMarge: phaserLib.integer = js.native
  /**
    * The spacing between each image in the collection (in pixels).
    * Use `setSpacing` to change.
    */
  val imageSpacing: phaserLib.integer = js.native
  /**
    * The width of the widest image (in pixels).
    */
  val imageWidth: phaserLib.integer = js.native
  /**
    * The cached images that are a part of this collection.
    */
  val images: js.Array[_] = js.native
  /**
    * The name of the Image Collection.
    */
  var name: java.lang.String = js.native
  /**
    * Image Collection-specific properties that are typically defined in the Tiled editor.
    */
  var properties: js.Object = js.native
  /**
    * The total number of images in the image collection.
    */
  val total: phaserLib.integer = js.native
  /**
    * Add an image to this Image Collection.
    * @param gid The gid of the image in the Image Collection.
    * @param image The the key of the image in the Image Collection and in the cache.
    */
  def addImage(gid: phaserLib.integer, image: java.lang.String): ImageCollection = js.native
  /**
    * Returns true if and only if this image collection contains the given image index.
    * @param imageIndex The image index to search for.
    */
  def containsImageIndex(imageIndex: phaserLib.integer): scala.Boolean = js.native
}

