package typings
package phaserLib.PhaserNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Game Object Factory is a Scene plugin that allows you to quickly create many common
  * types of Game Objects and have them automatically registered with the Scene.
  * 
  * Game Objects directly register themselves with the Factory and inject their own creation
  * methods into the class.
  */
@JSGlobal("Phaser.GameObjects.GameObjectFactory")
@js.native
class GameObjectFactory protected () extends js.Object {
  /**
    * 
    * @param scene The Scene to which this Game Object Factory belongs.
    */
  def this(scene: phaserLib.PhaserNs.Scene) = this()
  /**
    * A reference to the Scene Display List.
    */
  var displayList: DisplayList = js.native
  /**
    * The Scene to which this Game Object Factory belongs.
    */
  var scene: phaserLib.PhaserNs.Scene = js.native
  /**
    * A reference to the Scene.Systems.
    */
  var systems: phaserLib.PhaserNs.ScenesNs.Systems = js.native
  /**
    * A reference to the Scene Update List.
    */
  var `updateList;`: UpdateList = js.native
  /**
    * Creates a new Arc Shape Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Arc Game Object has been built into Phaser.
    * 
    * The Arc Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * When it renders it displays an arc shape. You can control the start and end angles of the arc,
    * as well as if the angles are winding clockwise or anti-clockwise. With the default settings
    * it renders as a complete circle. By changing the angles you can create other arc shapes,
    * such as half-circles.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param radius The radius of the arc. Default 128.
    * @param startAngle The start angle of the arc, in degrees. Default 0.
    * @param endAngle The end angle of the arc, in degrees. Default 360.
    * @param anticlockwise The winding order of the start and end angles. Default false.
    * @param fillColor The color the arc will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the arc will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def arc(
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    radius: js.UndefOr[scala.Double],
    startAngle: js.UndefOr[phaserLib.integer],
    endAngle: js.UndefOr[phaserLib.integer],
    anticlockwise: js.UndefOr[scala.Boolean],
    fillColor: js.UndefOr[scala.Double],
    fillAlpha: js.UndefOr[scala.Double]
  ): Arc = js.native
  /**
    * Creates a new Bitmap Text Game Object and adds it to the Scene.
    * 
    * BitmapText objects work by taking a texture file and an XML or JSON file that describes the font structure.
    * 
    * During rendering for each letter of the text is rendered to the display, proportionally spaced out and aligned to
    * match the font structure.
    * 
    * BitmapText objects are less flexible than Text objects, in that they have less features such as shadows, fills and the ability
    * to use Web Fonts, however you trade this flexibility for rendering speed. You can also create visually compelling BitmapTexts by
    * processing the font texture in an image editor, applying fills and any other effects required.
    * 
    * To create multi-line text insert \r, \n or \r\n escape codes into the text string.
    * 
    * To create a BitmapText data files you need a 3rd party app such as:
    * 
    * BMFont (Windows, free): http://www.angelcode.com/products/bmfont/
    * Glyph Designer (OS X, commercial): http://www.71squared.com/en/glyphdesigner
    * Littera (Web-based, free): http://kvazars.com/littera/
    * 
    * For most use cases it is recommended to use XML. If you wish to use JSON, the formatting should be equal to the result of
    * converting a valid XML file through the popular X2JS library. An online tool for conversion can be found here: http://codebeautify.org/xmltojson
    * 
    * Note: This method will only be available if the Bitmap Text Game Object has been built into Phaser.
    * @param x The x position of the Game Object.
    * @param y The y position of the Game Object.
    * @param font The key of the font to use from the BitmapFont cache.
    * @param text The string, or array of strings, to be set as the content of this Bitmap Text.
    * @param size The font size to set.
    * @param align The alignment of the text in a multi-line BitmapText object. Default 0.
    */
  def bitmapText(x: scala.Double, y: scala.Double, font: java.lang.String): BitmapText = js.native
  def bitmapText(x: scala.Double, y: scala.Double, font: java.lang.String, text: java.lang.String): BitmapText = js.native
  def bitmapText(
    x: scala.Double,
    y: scala.Double,
    font: java.lang.String,
    text: java.lang.String,
    size: scala.Double
  ): BitmapText = js.native
  def bitmapText(
    x: scala.Double,
    y: scala.Double,
    font: java.lang.String,
    text: java.lang.String,
    size: scala.Double,
    align: phaserLib.integer
  ): BitmapText = js.native
  def bitmapText(x: scala.Double, y: scala.Double, font: java.lang.String, text: js.Array[java.lang.String]): BitmapText = js.native
  def bitmapText(
    x: scala.Double,
    y: scala.Double,
    font: java.lang.String,
    text: js.Array[java.lang.String],
    size: scala.Double
  ): BitmapText = js.native
  def bitmapText(
    x: scala.Double,
    y: scala.Double,
    font: java.lang.String,
    text: js.Array[java.lang.String],
    size: scala.Double,
    align: phaserLib.integer
  ): BitmapText = js.native
  /**
    * Creates a new Blitter Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Blitter Game Object has been built into Phaser.
    * @param x The x position of the Game Object.
    * @param y The y position of the Game Object.
    * @param key The key of the Texture the Blitter object will use.
    * @param frame The default Frame children of the Blitter will use.
    */
  def blitter(x: scala.Double, y: scala.Double, key: java.lang.String): Blitter = js.native
  def blitter(x: scala.Double, y: scala.Double, key: java.lang.String, frame: java.lang.String): Blitter = js.native
  def blitter(x: scala.Double, y: scala.Double, key: java.lang.String, frame: phaserLib.integer): Blitter = js.native
  /**
    * Creates a new Circle Shape Game Object and adds it to the Scene.
    * 
    * A Circle is an Arc with no defined start and end angle, making it render as a complete circle.
    * 
    * Note: This method will only be available if the Arc Game Object has been built into Phaser.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param radius The radius of the circle. Default 128.
    * @param fillColor The color the circle will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the circle will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def circle(): Arc = js.native
  def circle(x: scala.Double): Arc = js.native
  def circle(x: scala.Double, y: scala.Double): Arc = js.native
  def circle(x: scala.Double, y: scala.Double, radius: scala.Double): Arc = js.native
  def circle(x: scala.Double, y: scala.Double, radius: scala.Double, fillColor: scala.Double): Arc = js.native
  def circle(
    x: scala.Double,
    y: scala.Double,
    radius: scala.Double,
    fillColor: scala.Double,
    fillAlpha: scala.Double
  ): Arc = js.native
  /**
    * Creates a new Container Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Container Game Object has been built into Phaser.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param children An optional array of Game Objects to add to this Container.
    */
  def container(x: scala.Double, y: scala.Double): Container = js.native
  def container(x: scala.Double, y: scala.Double, children: js.Array[GameObject]): Container = js.native
  def container(x: scala.Double, y: scala.Double, children: GameObject): Container = js.native
  /**
    * Creates a new Curve Shape Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Curve Game Object has been built into Phaser.
    * 
    * The Curve Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * To render a Curve Shape you must first create a `Phaser.Curves.Curve` object, then pass it to
    * the Curve Shape in the constructor.
    * 
    * The Curve shape also has a `smoothness` property and corresponding `setSmoothness` method.
    * This allows you to control how smooth the shape renders in WebGL, by controlling the number of iterations
    * that take place during construction. Increase and decrease the default value for smoother, or more
    * jagged, shapes.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param curve The Curve object to use to create the Shape.
    * @param fillColor The color the curve will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the curve will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def curve(): Curve = js.native
  def curve(x: scala.Double): Curve = js.native
  def curve(x: scala.Double, y: scala.Double): Curve = js.native
  def curve(x: scala.Double, y: scala.Double, curve: phaserLib.PhaserNs.CurvesNs.Curve): Curve = js.native
  def curve(
    x: scala.Double,
    y: scala.Double,
    curve: phaserLib.PhaserNs.CurvesNs.Curve,
    fillColor: scala.Double
  ): Curve = js.native
  def curve(
    x: scala.Double,
    y: scala.Double,
    curve: phaserLib.PhaserNs.CurvesNs.Curve,
    fillColor: scala.Double,
    fillAlpha: scala.Double
  ): Curve = js.native
  /**
    * DOM Element Game Objects are a way to control and manipulate HTML Elements over the top of your game.
    * 
    * In order for DOM Elements to display you have to enable them by adding the following to your game
    * configuration object:
    * 
    * ```javascript
    * dom {
    *   createContainer: true
    * }
    * ```
    * 
    * When this is added, Phaser will automatically create a DOM Container div that is positioned over the top
    * of the game canvas. This div is sized to match the canvas, and if the canvas size changes, as a result of
    * settings within the Scale Manager, the dom container is resized accordingly.
    * 
    * You can create a DOM Element by either passing in DOMStrings, or by passing in a reference to an existing
    * Element that you wish to be placed under the control of Phaser. For example:
    * 
    * ```javascript
    * this.add.dom(x, y, 'div', 'background-color: lime; width: 220px; height: 100px; font: 48px Arial', 'Phaser');
    * ```
    * 
    * The above code will insert a div element into the DOM Container at the given x/y coordinate. The DOMString in
    * the 4th argument sets the initial CSS style of the div and the final argument is the inner text. In this case,
    * it will create a lime colored div that is 220px by 100px in size with the text Phaser in it, in an Arial font.
    * 
    * You should nearly always, without exception, use explicitly sized HTML Elements, in order to fully control
    * alignment and positioning of the elements next to regular game content.
    * 
    * Rather than specify the CSS and HTML directly you can use the `load.html` File Loader to load it into the
    * cache and then use the `createFromCache` method instead. You can also use `createFromHTML` and various other
    * methods available in this class to help construct your elements.
    * 
    * Once the element has been created you can then control it like you would any other Game Object. You can set its
    * position, scale, rotation, alpha and other properties. It will move as the main Scene Camera moves and be clipped
    * at the edge of the canvas. It's important to remember some limitations of DOM Elements: The obvious one is that
    * they appear above or below your game canvas. You cannot blend them into the display list, meaning you cannot have
    * a DOM Element, then a Sprite, then another DOM Element behind it.
    * 
    * They also cannot be enabled for input. To do that, you have to use the `addListener` method to add native event
    * listeners directly. The final limitation is to do with cameras. The DOM Container is sized to match the game canvas
    * entirely and clipped accordingly. DOM Elements respect camera scrolling and scrollFactor settings, but if you
    * change the size of the camera so it no longer matches the size of the canvas, they won't be clipped accordingly.
    * 
    * Also, all DOM Elements are inserted into the same DOM Container, regardless of which Scene they are created in.
    * 
    * DOM Elements are a powerful way to align native HTML with your Phaser Game Objects. For example, you can insert
    * a login form for a multiplayer game directly into your title screen. Or a text input box for a highscore table.
    * Or a banner ad from a 3rd party service. Or perhaps you'd like to use them for high resolution text display and
    * UI. The choice is up to you, just remember that you're dealing with standard HTML and CSS floating over the top
    * of your game, and should treat it accordingly.
    * 
    * Note: This method will only be available if the DOM Element Game Object has been built into Phaser.
    * @param x The horizontal position of this DOM Element in the world.
    * @param y The vertical position of this DOM Element in the world.
    * @param element An existing DOM element, or a string. If a string starting with a # it will do a `getElementById` look-up on the string (minus the hash). Without a hash, it represents the type of element to create, i.e. 'div'.
    * @param style If a string, will be set directly as the elements `style` property value. If a plain object, will be iterated and the values transferred. In both cases the values replacing whatever CSS styles may have been previously set.
    * @param innerText If given, will be set directly as the elements `innerText` property value, replacing whatever was there before.
    */
  def dom(x: scala.Double, y: scala.Double): DOMElement = js.native
  def dom(x: scala.Double, y: scala.Double, element: java.lang.String): DOMElement = js.native
  def dom(x: scala.Double, y: scala.Double, element: java.lang.String, style: java.lang.String): DOMElement = js.native
  def dom(
    x: scala.Double,
    y: scala.Double,
    element: java.lang.String,
    style: java.lang.String,
    innerText: java.lang.String
  ): DOMElement = js.native
  def dom(x: scala.Double, y: scala.Double, element: java.lang.String, style: js.Any): DOMElement = js.native
  def dom(
    x: scala.Double,
    y: scala.Double,
    element: java.lang.String,
    style: js.Any,
    innerText: java.lang.String
  ): DOMElement = js.native
  def dom(x: scala.Double, y: scala.Double, element: stdLib.HTMLElement): DOMElement = js.native
  def dom(x: scala.Double, y: scala.Double, element: stdLib.HTMLElement, style: java.lang.String): DOMElement = js.native
  def dom(
    x: scala.Double,
    y: scala.Double,
    element: stdLib.HTMLElement,
    style: java.lang.String,
    innerText: java.lang.String
  ): DOMElement = js.native
  def dom(x: scala.Double, y: scala.Double, element: stdLib.HTMLElement, style: js.Any): DOMElement = js.native
  def dom(
    x: scala.Double,
    y: scala.Double,
    element: stdLib.HTMLElement,
    style: js.Any,
    innerText: java.lang.String
  ): DOMElement = js.native
  /**
    * Creates a new Dynamic Bitmap Text Game Object and adds it to the Scene.
    * 
    * BitmapText objects work by taking a texture file and an XML or JSON file that describes the font structure.
    * 
    * During rendering for each letter of the text is rendered to the display, proportionally spaced out and aligned to
    * match the font structure.
    * 
    * Dynamic Bitmap Text objects are different from Static Bitmap Text in that they invoke a callback for each
    * letter being rendered during the render pass. This callback allows you to manipulate the properties of
    * each letter being rendered, such as its position, scale or tint, allowing you to create interesting effects
    * like jiggling text, which can't be done with Static text. This means that Dynamic Text takes more processing
    * time, so only use them if you require the callback ability they have.
    * 
    * BitmapText objects are less flexible than Text objects, in that they have less features such as shadows, fills and the ability
    * to use Web Fonts, however you trade this flexibility for rendering speed. You can also create visually compelling BitmapTexts by
    * processing the font texture in an image editor, applying fills and any other effects required.
    * 
    * To create multi-line text insert \r, \n or \r\n escape codes into the text string.
    * 
    * To create a BitmapText data files you need a 3rd party app such as:
    * 
    * BMFont (Windows, free): http://www.angelcode.com/products/bmfont/
    * Glyph Designer (OS X, commercial): http://www.71squared.com/en/glyphdesigner
    * Littera (Web-based, free): http://kvazars.com/littera/
    * 
    * For most use cases it is recommended to use XML. If you wish to use JSON, the formatting should be equal to the result of
    * converting a valid XML file through the popular X2JS library. An online tool for conversion can be found here: http://codebeautify.org/xmltojson
    * 
    * Note: This method will only be available if the Dynamic Bitmap Text Game Object has been built into Phaser.
    * @param x The x position of the Game Object.
    * @param y The y position of the Game Object.
    * @param font The key of the font to use from the BitmapFont cache.
    * @param text The string, or array of strings, to be set as the content of this Bitmap Text.
    * @param size The font size to set.
    */
  def dynamicBitmapText(x: scala.Double, y: scala.Double, font: java.lang.String): DynamicBitmapText = js.native
  def dynamicBitmapText(x: scala.Double, y: scala.Double, font: java.lang.String, text: java.lang.String): DynamicBitmapText = js.native
  def dynamicBitmapText(
    x: scala.Double,
    y: scala.Double,
    font: java.lang.String,
    text: java.lang.String,
    size: scala.Double
  ): DynamicBitmapText = js.native
  def dynamicBitmapText(x: scala.Double, y: scala.Double, font: java.lang.String, text: js.Array[java.lang.String]): DynamicBitmapText = js.native
  def dynamicBitmapText(
    x: scala.Double,
    y: scala.Double,
    font: java.lang.String,
    text: js.Array[java.lang.String],
    size: scala.Double
  ): DynamicBitmapText = js.native
  /**
    * Creates a new Ellipse Shape Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Ellipse Game Object has been built into Phaser.
    * 
    * The Ellipse Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * When it renders it displays an ellipse shape. You can control the width and height of the ellipse.
    * If the width and height match it will render as a circle. If the width is less than the height,
    * it will look more like an egg shape.
    * 
    * The Ellipse shape also has a `smoothness` property and corresponding `setSmoothness` method.
    * This allows you to control how smooth the shape renders in WebGL, by controlling the number of iterations
    * that take place during construction. Increase and decrease the default value for smoother, or more
    * jagged, shapes.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param width The width of the ellipse. An ellipse with equal width and height renders as a circle. Default 128.
    * @param height The height of the ellipse. An ellipse with equal width and height renders as a circle. Default 128.
    * @param fillColor The color the ellipse will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the ellipse will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def ellipse(
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    width: js.UndefOr[scala.Double],
    height: js.UndefOr[scala.Double],
    fillColor: js.UndefOr[scala.Double],
    fillAlpha: js.UndefOr[scala.Double]
  ): Ellipse = js.native
  /**
    * Adds an existing Game Object to this Scene.
    * 
    * If the Game Object renders, it will be added to the Display List.
    * If it has a `preUpdate` method, it will be added to the Update List.
    * @param child The child to be added to this Scene.
    */
  def existing(child: GameObject): GameObject = js.native
  /**
    * Creates a new Extern Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Extern Game Object has been built into Phaser.
    */
  def extern(): Extern = js.native
  /**
    * Creates a new PathFollower Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the PathFollower Game Object has been built into Phaser.
    * @param path The Path this PathFollower is connected to.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def follower(
    path: phaserLib.PhaserNs.CurvesNs.Path,
    x: scala.Double,
    y: scala.Double,
    texture: java.lang.String
  ): PathFollower = js.native
  def follower(
    path: phaserLib.PhaserNs.CurvesNs.Path,
    x: scala.Double,
    y: scala.Double,
    texture: java.lang.String,
    frame: java.lang.String
  ): PathFollower = js.native
  def follower(
    path: phaserLib.PhaserNs.CurvesNs.Path,
    x: scala.Double,
    y: scala.Double,
    texture: java.lang.String,
    frame: phaserLib.integer
  ): PathFollower = js.native
  /**
    * Creates a new Graphics Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Graphics Game Object has been built into Phaser.
    * @param config The Graphics configuration.
    */
  def graphics(): Graphics = js.native
  def graphics(config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GraphicsNs.Options): Graphics = js.native
  /**
    * Creates a new Grid Shape Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Grid Game Object has been built into Phaser.
    * 
    * The Grid Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports only fill colors and cannot be stroked.
    * 
    * A Grid Shape allows you to display a grid in your game, where you can control the size of the
    * grid as well as the width and height of the grid cells. You can set a fill color for each grid
    * cell as well as an alternate fill color. When the alternate fill color is set then the grid
    * cells will alternate the fill colors as they render, creating a chess-board effect. You can
    * also optionally have an outline fill color. If set, this draws lines between the grid cells
    * in the given color. If you specify an outline color with an alpha of zero, then it will draw
    * the cells spaced out, but without the lines between them.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param width The width of the grid. Default 128.
    * @param height The height of the grid. Default 128.
    * @param cellWidth The width of one cell in the grid. Default 32.
    * @param cellHeight The height of one cell in the grid. Default 32.
    * @param fillColor The color the grid cells will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the grid cells will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    * @param outlineFillColor The color of the lines between the grid cells.
    * @param outlineFillAlpha The alpha of the lines between the grid cells.
    */
  def grid(
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    width: js.UndefOr[scala.Double],
    height: js.UndefOr[scala.Double],
    cellWidth: js.UndefOr[scala.Double],
    cellHeight: js.UndefOr[scala.Double],
    fillColor: js.UndefOr[scala.Double],
    fillAlpha: js.UndefOr[scala.Double],
    outlineFillColor: js.UndefOr[scala.Double],
    outlineFillAlpha: js.UndefOr[scala.Double]
  ): Grid = js.native
  /**
    * Creates a new Group Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Group Game Object has been built into Phaser.
    * @param children Game Objects to add to this Group; or the `config` argument.
    * @param config A Group Configuration object.
    */
  def group(): Group = js.native
  def group(children: js.Array[GameObject | phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig]): Group = js.native
  def group(
    children: js.Array[GameObject | phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig],
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig
  ): Group = js.native
  def group(
    children: js.Array[GameObject | phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig],
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig
  ): Group = js.native
  def group(children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig): Group = js.native
  def group(
    children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig,
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig
  ): Group = js.native
  def group(
    children: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig,
    config: phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupCreateConfig
  ): Group = js.native
  /**
    * Creates a new Image Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Image Game Object has been built into Phaser.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def image(x: scala.Double, y: scala.Double, texture: java.lang.String): Image = js.native
  def image(x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String): Image = js.native
  def image(x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer): Image = js.native
  /**
    * Creates a new IsoBox Shape Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the IsoBox Game Object has been built into Phaser.
    * 
    * The IsoBox Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports only fill colors and cannot be stroked.
    * 
    * An IsoBox is an 'isometric' rectangle. Each face of it has a different fill color. You can set
    * the color of the top, left and right faces of the rectangle respectively. You can also choose
    * which of the faces are rendered via the `showTop`, `showLeft` and `showRight` properties.
    * 
    * You cannot view an IsoBox from under-neath, however you can change the 'angle' by setting
    * the `projection` property.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param size The width of the iso box in pixels. The left and right faces will be exactly half this value. Default 48.
    * @param height The height of the iso box. The left and right faces will be this tall. The overall height of the isobox will be this value plus half the `size` value. Default 32.
    * @param fillTop The fill color of the top face of the iso box. Default 0xeeeeee.
    * @param fillLeft The fill color of the left face of the iso box. Default 0x999999.
    * @param fillRight The fill color of the right face of the iso box. Default 0xcccccc.
    */
  def isobox(
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    size: js.UndefOr[scala.Double],
    height: js.UndefOr[scala.Double],
    fillTop: js.UndefOr[scala.Double],
    fillLeft: js.UndefOr[scala.Double],
    fillRight: js.UndefOr[scala.Double]
  ): IsoBox = js.native
  /**
    * Creates a new IsoTriangle Shape Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the IsoTriangle Game Object has been built into Phaser.
    * 
    * The IsoTriangle Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports only fill colors and cannot be stroked.
    * 
    * An IsoTriangle is an 'isometric' triangle. Think of it like a pyramid. Each face has a different
    * fill color. You can set the color of the top, left and right faces of the triangle respectively
    * You can also choose which of the faces are rendered via the `showTop`, `showLeft` and `showRight` properties.
    * 
    * You cannot view an IsoTriangle from under-neath, however you can change the 'angle' by setting
    * the `projection` property. The `reversed` property controls if the IsoTriangle is rendered upside
    * down or not.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param size The width of the iso triangle in pixels. The left and right faces will be exactly half this value. Default 48.
    * @param height The height of the iso triangle. The left and right faces will be this tall. The overall height of the iso triangle will be this value plus half the `size` value. Default 32.
    * @param reversed Is the iso triangle upside down? Default false.
    * @param fillTop The fill color of the top face of the iso triangle. Default 0xeeeeee.
    * @param fillLeft The fill color of the left face of the iso triangle. Default 0x999999.
    * @param fillRight The fill color of the right face of the iso triangle. Default 0xcccccc.
    */
  def isotriangle(
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    size: js.UndefOr[scala.Double],
    height: js.UndefOr[scala.Double],
    reversed: js.UndefOr[scala.Boolean],
    fillTop: js.UndefOr[scala.Double],
    fillLeft: js.UndefOr[scala.Double],
    fillRight: js.UndefOr[scala.Double]
  ): IsoTriangle = js.native
  /**
    * Creates a new Line Shape Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Line Game Object has been built into Phaser.
    * 
    * The Line Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports only stroke colors and cannot be filled.
    * 
    * A Line Shape allows you to draw a line between two points in your game. You can control the
    * stroke color and thickness of the line. In WebGL only you can also specify a different
    * thickness for the start and end of the line, allowing you to render lines that taper-off.
    * 
    * If you need to draw multiple lines in a sequence you may wish to use the Polygon Shape instead.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param x1 The horizontal position of the start of the line. Default 0.
    * @param y1 The vertical position of the start of the line. Default 0.
    * @param x2 The horizontal position of the end of the line. Default 128.
    * @param y2 The vertical position of the end of the line. Default 0.
    * @param strokeColor The color the line will be drawn in, i.e. 0xff0000 for red.
    * @param strokeAlpha The alpha the line will be drawn in. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def line(
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    x1: js.UndefOr[scala.Double],
    y1: js.UndefOr[scala.Double],
    x2: js.UndefOr[scala.Double],
    y2: js.UndefOr[scala.Double],
    strokeColor: js.UndefOr[scala.Double],
    strokeAlpha: js.UndefOr[scala.Double]
  ): Line = js.native
  /**
    * Creates a new Mesh Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Mesh Game Object and WebGL support have been built into Phaser.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param vertices An array containing the vertices data for this Mesh.
    * @param uv An array containing the uv data for this Mesh.
    * @param colors An array containing the color data for this Mesh.
    * @param alphas An array containing the alpha data for this Mesh.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def mesh(
    x: scala.Double,
    y: scala.Double,
    vertices: js.Array[scala.Double],
    uv: js.Array[scala.Double],
    colors: js.Array[scala.Double],
    alphas: js.Array[scala.Double],
    texture: java.lang.String
  ): Mesh = js.native
  def mesh(
    x: scala.Double,
    y: scala.Double,
    vertices: js.Array[scala.Double],
    uv: js.Array[scala.Double],
    colors: js.Array[scala.Double],
    alphas: js.Array[scala.Double],
    texture: java.lang.String,
    frame: java.lang.String
  ): Mesh = js.native
  def mesh(
    x: scala.Double,
    y: scala.Double,
    vertices: js.Array[scala.Double],
    uv: js.Array[scala.Double],
    colors: js.Array[scala.Double],
    alphas: js.Array[scala.Double],
    texture: java.lang.String,
    frame: phaserLib.integer
  ): Mesh = js.native
  /**
    * Creates a new Particle Emitter Manager Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Particles Game Object has been built into Phaser.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    * @param emitters Configuration settings for one or more emitters to create.
    */
  def particles(texture: java.lang.String): phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager = js.native
  def particles(texture: java.lang.String, frame: java.lang.String): phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager = js.native
  def particles(
    texture: java.lang.String,
    frame: java.lang.String,
    emitters: js.Array[phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig]
  ): phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager = js.native
  def particles(
    texture: java.lang.String,
    frame: java.lang.String,
    emitters: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig
  ): phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager = js.native
  def particles(texture: java.lang.String, frame: js.Object): phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager = js.native
  def particles(
    texture: java.lang.String,
    frame: js.Object,
    emitters: js.Array[phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig]
  ): phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager = js.native
  def particles(
    texture: java.lang.String,
    frame: js.Object,
    emitters: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig
  ): phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager = js.native
  def particles(texture: java.lang.String, frame: phaserLib.integer): phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager = js.native
  def particles(
    texture: java.lang.String,
    frame: phaserLib.integer,
    emitters: js.Array[phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig]
  ): phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager = js.native
  def particles(
    texture: java.lang.String,
    frame: phaserLib.integer,
    emitters: phaserLib.PhaserNs.TypesNs.GameObjectsNs.ParticlesNs.ParticleEmitterConfig
  ): phaserLib.PhaserNs.GameObjectsNs.ParticlesNs.ParticleEmitterManager = js.native
  /**
    * Creates a new Path Object.
    * @param x The horizontal position of this Path.
    * @param y The vertical position of this Path.
    */
  def path(x: scala.Double, y: scala.Double): phaserLib.PhaserNs.CurvesNs.Path = js.native
  /**
    * Creates a new Polygon Shape Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Polygon Game Object has been built into Phaser.
    * 
    * The Polygon Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * The Polygon Shape is created by providing a list of points, which are then used to create an
    * internal Polygon geometry object. The points can be set from a variety of formats:
    * 
    * - An array of Point or Vector2 objects: `[new Phaser.Math.Vec2(x1, y1), ...]`
    * - An array of objects with public x/y properties: `[obj1, obj2, ...]`
    * - An array of paired numbers that represent point coordinates: `[x1,y1, x2,y2, ...]`
    * - An array of arrays with two elements representing x/y coordinates: `[[x1, y1], [x2, y2], ...]`
    * 
    * By default the `x` and `y` coordinates of this Shape refer to the center of it. However, depending
    * on the coordinates of the points provided, the final shape may be rendered offset from its origin.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param points The points that make up the polygon.
    * @param fillColor The color the polygon will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the polygon will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def polygon(): Polygon = js.native
  def polygon(x: scala.Double): Polygon = js.native
  def polygon(x: scala.Double, y: scala.Double): Polygon = js.native
  def polygon(x: scala.Double, y: scala.Double, points: js.Any): Polygon = js.native
  def polygon(x: scala.Double, y: scala.Double, points: js.Any, fillColor: scala.Double): Polygon = js.native
  def polygon(x: scala.Double, y: scala.Double, points: js.Any, fillColor: scala.Double, fillAlpha: scala.Double): Polygon = js.native
  /**
    * Creates a new Quad Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Quad Game Object and WebGL support have been built into Phaser.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def quad(x: scala.Double, y: scala.Double, texture: java.lang.String): Quad = js.native
  def quad(x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String): Quad = js.native
  def quad(x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer): Quad = js.native
  /**
    * Creates a new Rectangle Shape Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Rectangle Game Object has been built into Phaser.
    * 
    * The Rectangle Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * You can change the size of the rectangle by changing the `width` and `height` properties.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param width The width of the rectangle. Default 128.
    * @param height The height of the rectangle. Default 128.
    * @param fillColor The color the rectangle will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the rectangle will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def rectangle(
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    width: js.UndefOr[scala.Double],
    height: js.UndefOr[scala.Double],
    fillColor: js.UndefOr[scala.Double],
    fillAlpha: js.UndefOr[scala.Double]
  ): Rectangle = js.native
  /**
    * Creates a new Render Texture Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Render Texture Game Object has been built into Phaser.
    * 
    * A Render Texture is a special texture that allows any number of Game Objects to be drawn to it. You can take many complex objects and
    * draw them all to this one texture, which can they be used as the texture for other Game Object's. It's a way to generate dynamic
    * textures at run-time that are WebGL friendly and don't invoke expensive GPU uploads.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param width The width of the Render Texture. Default 32.
    * @param height The height of the Render Texture. Default 32.
    */
  def renderTexture(x: scala.Double, y: scala.Double): RenderTexture = js.native
  def renderTexture(x: scala.Double, y: scala.Double, width: phaserLib.integer): RenderTexture = js.native
  def renderTexture(x: scala.Double, y: scala.Double, width: phaserLib.integer, height: phaserLib.integer): RenderTexture = js.native
  /**
    * Creates a new Shader Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Shader Game Object and WebGL support have been built into Phaser.
    * @param key The key of the shader to use from the shader cache, or a BaseShader instance.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param width The width of the Game Object. Default 128.
    * @param height The height of the Game Object. Default 128.
    * @param textures Optional array of texture keys to bind to the iChannel0...3 uniforms. The textures must already exist in the Texture Manager.
    */
  def shader(key: java.lang.String): Shader = js.native
  def shader(key: java.lang.String, x: scala.Double): Shader = js.native
  def shader(key: java.lang.String, x: scala.Double, y: scala.Double): Shader = js.native
  def shader(key: java.lang.String, x: scala.Double, y: scala.Double, width: scala.Double): Shader = js.native
  def shader(key: java.lang.String, x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Shader = js.native
  def shader(
    key: java.lang.String,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    textures: js.Array[java.lang.String]
  ): Shader = js.native
  def shader(key: phaserLib.PhaserNs.DisplayNs.BaseShader): Shader = js.native
  def shader(key: phaserLib.PhaserNs.DisplayNs.BaseShader, x: scala.Double): Shader = js.native
  def shader(key: phaserLib.PhaserNs.DisplayNs.BaseShader, x: scala.Double, y: scala.Double): Shader = js.native
  def shader(
    key: phaserLib.PhaserNs.DisplayNs.BaseShader,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double
  ): Shader = js.native
  def shader(
    key: phaserLib.PhaserNs.DisplayNs.BaseShader,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double
  ): Shader = js.native
  def shader(
    key: phaserLib.PhaserNs.DisplayNs.BaseShader,
    x: scala.Double,
    y: scala.Double,
    width: scala.Double,
    height: scala.Double,
    textures: js.Array[java.lang.String]
  ): Shader = js.native
  /**
    * Creates a new Sprite Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Sprite Game Object has been built into Phaser.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def sprite(x: scala.Double, y: scala.Double, texture: java.lang.String): Sprite = js.native
  def sprite(x: scala.Double, y: scala.Double, texture: java.lang.String, frame: java.lang.String): Sprite = js.native
  def sprite(x: scala.Double, y: scala.Double, texture: java.lang.String, frame: phaserLib.integer): Sprite = js.native
  /**
    * Creates a new Star Shape Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Star Game Object has been built into Phaser.
    * 
    * The Star Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * As the name implies, the Star shape will display a star in your game. You can control several
    * aspects of it including the number of points that constitute the star. The default is 5. If
    * you change it to 4 it will render as a diamond. If you increase them, you'll get a more spiky
    * star shape.
    * 
    * You can also control the inner and outer radius, which is how 'long' each point of the star is.
    * Modify these values to create more interesting shapes.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param points The number of points on the star. Default 5.
    * @param innerRadius The inner radius of the star. Default 32.
    * @param outerRadius The outer radius of the star. Default 64.
    * @param fillColor The color the star will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the star will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def star(
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    points: js.UndefOr[scala.Double],
    innerRadius: js.UndefOr[scala.Double],
    outerRadius: js.UndefOr[scala.Double],
    fillColor: js.UndefOr[scala.Double],
    fillAlpha: js.UndefOr[scala.Double]
  ): Star = js.native
  /**
    * Creates a new Text Game Object and adds it to the Scene.
    * 
    * A Text Game Object.
    * 
    * Text objects work by creating their own internal hidden Canvas and then renders text to it using
    * the standard Canvas `fillText` API. It then creates a texture from this canvas which is rendered
    * to your game during the render pass.
    * 
    * Because it uses the Canvas API you can take advantage of all the features this offers, such as
    * applying gradient fills to the text, or strokes, shadows and more. You can also use custom fonts
    * loaded externally, such as Google or TypeKit Web fonts.
    * 
    * You can only display fonts that are currently loaded and available to the browser: therefore fonts must
    * be pre-loaded. Phaser does not do ths for you, so you will require the use of a 3rd party font loader,
    * or have the fonts ready available in the CSS on the page in which your Phaser game resides.
    * 
    * See {@link http://www.jordanm.co.uk/tinytype this compatibility table} for the available default fonts
    * across mobile browsers.
    * 
    * A note on performance: Every time the contents of a Text object changes, i.e. changing the text being
    * displayed, or the style of the text, it needs to remake the Text canvas, and if on WebGL, re-upload the
    * new texture to the GPU. This can be an expensive operation if used often, or with large quantities of
    * Text objects in your game. If you run into performance issues you would be better off using Bitmap Text
    * instead, as it benefits from batching and avoids expensive Canvas API calls.
    * 
    * Note: This method will only be available if the Text Game Object has been built into Phaser.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param text The text this Text object will display.
    * @param style The Text style configuration object.
    */
  def text(x: scala.Double, y: scala.Double, text: java.lang.String): Text = js.native
  def text(x: scala.Double, y: scala.Double, text: java.lang.String, style: js.Object): Text = js.native
  def text(x: scala.Double, y: scala.Double, text: js.Array[java.lang.String]): Text = js.native
  def text(x: scala.Double, y: scala.Double, text: js.Array[java.lang.String], style: js.Object): Text = js.native
  /**
    * Creates a new TileSprite Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the TileSprite Game Object has been built into Phaser.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param width The width of the Game Object. If zero it will use the size of the texture frame.
    * @param height The height of the Game Object. If zero it will use the size of the texture frame.
    * @param texture The key of the Texture this Game Object will use to render with, as stored in the Texture Manager.
    * @param frame An optional frame from the Texture this Game Object is rendering with.
    */
  def tileSprite(
    x: scala.Double,
    y: scala.Double,
    width: phaserLib.integer,
    height: phaserLib.integer,
    texture: java.lang.String
  ): TileSprite = js.native
  def tileSprite(
    x: scala.Double,
    y: scala.Double,
    width: phaserLib.integer,
    height: phaserLib.integer,
    texture: java.lang.String,
    frame: java.lang.String
  ): TileSprite = js.native
  def tileSprite(
    x: scala.Double,
    y: scala.Double,
    width: phaserLib.integer,
    height: phaserLib.integer,
    texture: java.lang.String,
    frame: phaserLib.integer
  ): TileSprite = js.native
  /**
    * Creates a Tilemap from the given key or data, or creates a blank Tilemap if no key/data provided.
    * When loading from CSV or a 2D array, you should specify the tileWidth & tileHeight. When parsing
    * from a map from Tiled, the tileWidth, tileHeight, width & height will be pulled from the map
    * data. For an empty map, you should specify tileWidth, tileHeight, width & height.
    * @param key The key in the Phaser cache that corresponds to the loaded tilemap data.
    * @param tileWidth The width of a tile in pixels. Pass in `null` to leave as the
    * default. Default 32.
    * @param tileHeight The height of a tile in pixels. Pass in `null` to leave as the
    * default. Default 32.
    * @param width The width of the map in tiles. Pass in `null` to leave as the
    * default. Default 10.
    * @param height The height of the map in tiles. Pass in `null` to leave as the
    * default. Default 10.
    * @param data Instead of loading from the cache, you can also load directly from
    * a 2D array of tile indexes. Pass in `null` for no data.
    * @param insertNull Controls how empty tiles, tiles with an index of -1, in the
    * map data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
    * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
    * the tile data doesn't need to change then setting this value to `true` will help with memory
    * consumption. However if your map is small or you need to update the tiles dynamically, then leave
    * the default value set. Default false.
    */
  def tilemap(
    key: js.UndefOr[java.lang.String],
    tileWidth: js.UndefOr[phaserLib.integer],
    tileHeight: js.UndefOr[phaserLib.integer],
    width: js.UndefOr[phaserLib.integer],
    height: js.UndefOr[phaserLib.integer],
    data: js.UndefOr[js.Array[js.Array[phaserLib.integer]]],
    insertNull: js.UndefOr[scala.Boolean]
  ): phaserLib.PhaserNs.TilemapsNs.Tilemap = js.native
  /**
    * Creates a new Triangle Shape Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Triangle Game Object has been built into Phaser.
    * 
    * The Triangle Shape is a Game Object that can be added to a Scene, Group or Container. You can
    * treat it like any other Game Object in your game, such as tweening it, scaling it, or enabling
    * it for input or physics. It provides a quick and easy way for you to render this shape in your
    * game without using a texture, while still taking advantage of being fully batched in WebGL.
    * 
    * This shape supports both fill and stroke colors.
    * 
    * The Triangle consists of 3 lines, joining up to form a triangular shape. You can control the
    * position of each point of these lines. The triangle is always closed and cannot have an open
    * face. If you require that, consider using a Polygon instead.
    * @param x The horizontal position of this Game Object in the world. Default 0.
    * @param y The vertical position of this Game Object in the world. Default 0.
    * @param x1 The horizontal position of the first point in the triangle. Default 0.
    * @param y1 The vertical position of the first point in the triangle. Default 128.
    * @param x2 The horizontal position of the second point in the triangle. Default 64.
    * @param y2 The vertical position of the second point in the triangle. Default 0.
    * @param x3 The horizontal position of the third point in the triangle. Default 128.
    * @param y3 The vertical position of the third point in the triangle. Default 128.
    * @param fillColor The color the triangle will be filled with, i.e. 0xff0000 for red.
    * @param fillAlpha The alpha the triangle will be filled with. You can also set the alpha of the overall Shape using its `alpha` property.
    */
  def triangle(
    x: js.UndefOr[scala.Double],
    y: js.UndefOr[scala.Double],
    x1: js.UndefOr[scala.Double],
    y1: js.UndefOr[scala.Double],
    x2: js.UndefOr[scala.Double],
    y2: js.UndefOr[scala.Double],
    x3: js.UndefOr[scala.Double],
    y3: js.UndefOr[scala.Double],
    fillColor: js.UndefOr[scala.Double],
    fillAlpha: js.UndefOr[scala.Double]
  ): Triangle = js.native
  def tween(config: js.Object): phaserLib.PhaserNs.TweensNs.Tween = js.native
  /**
    * Creates a new Tween object.
    * 
    * Note: This method will only be available Tweens have been built into Phaser.
    * @param config The Tween configuration.
    */
  def tween(config: phaserLib.PhaserNs.TypesNs.TweensNs.TweenBuilderConfig): phaserLib.PhaserNs.TweensNs.Tween = js.native
  /**
    * Creates a new Zone Game Object and adds it to the Scene.
    * 
    * Note: This method will only be available if the Zone Game Object has been built into Phaser.
    * @param x The horizontal position of this Game Object in the world.
    * @param y The vertical position of this Game Object in the world.
    * @param width The width of the Game Object.
    * @param height The height of the Game Object.
    */
  def zone(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): Zone = js.native
}

