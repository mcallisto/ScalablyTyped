package typings
package phaserLib.PhaserNs.RendererNs.WebGLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * WebGLPipeline is a class that describes the way elements will be rendererd
  * in WebGL, specially focused on batching vertices (batching is not provided).
  * Pipelines are mostly used for describing 2D rendering passes but it's
  * flexible enough to be used for any type of rendering including 3D.
  * Internally WebGLPipeline will handle things like compiling shaders,
  * creating vertex buffers, assigning primitive topology and binding
  * vertex attributes.
  * 
  * The config properties are:
  * - game: Current game instance.
  * - renderer: Current WebGL renderer.
  * - gl: Current WebGL context.
  * - topology: This indicates how the primitives are rendered. The default value is GL_TRIANGLES.
  *              Here is the full list of rendering primitives (https://developer.mozilla.org/en-US/docs/Web/API/WebGL_API/Constants).
  * - vertShader: Source for vertex shader as a string.
  * - fragShader: Source for fragment shader as a string.
  * - vertexCapacity: The amount of vertices that shall be allocated
  * - vertexSize: The size of a single vertex in bytes.
  * - vertices: An optional buffer of vertices
  * - attributes: An array describing the vertex attributes
  * 
  * The vertex attributes properties are:
  * - name : String - Name of the attribute in the vertex shader
  * - size : integer - How many components describe the attribute. For ex: vec3 = size of 3, float = size of 1
  * - type : GLenum - WebGL type (gl.BYTE, gl.SHORT, gl.UNSIGNED_BYTE, gl.UNSIGNED_SHORT, gl.FLOAT)
  * - normalized : boolean - Is the attribute normalized
  * - offset : integer - The offset in bytes to the current attribute in the vertex. Equivalent to offsetof(vertex, attrib) in C
  * Here you can find more information of how to describe an attribute:
  * - https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext/vertexAttribPointer
  */
@JSGlobal("Phaser.Renderer.WebGL.WebGLPipeline")
@js.native
class WebGLPipeline protected () extends js.Object {
  /**
    * 
    * @param config The configuration object for this WebGL Pipeline, as described above.
    */
  def this(config: js.Object) = this()
  /**
    * Indicates if the current pipeline is active or not for this frame only.
    * Reset in the onRender method.
    */
  var active: scala.Boolean = js.native
  /**
    * Array of objects that describe the vertex attributes
    */
  var attributes: js.Object = js.native
  /**
    * Uint8 view to the vertex raw buffer. Used for uploading vertex buffer resources
    * to the GPU.
    */
  var bytes: stdLib.Uint8Array = js.native
  /**
    * Indicates if the current pipeline is flushing the contents to the GPU.
    * When the variable is set the flush function will be locked.
    */
  var flushLocked: scala.Boolean = js.native
  /**
    * The Game which owns this WebGL Pipeline.
    */
  var game: phaserLib.PhaserNs.Game = js.native
  /**
    * The WebGL context this WebGL Pipeline uses.
    */
  var gl: stdLib.WebGLRenderingContext = js.native
  /**
    * Height of the current viewport
    */
  var height: scala.Double = js.native
  /**
    * Name of the Pipeline. Used for identifying
    */
  var name: java.lang.String = js.native
  /**
    * The handle to a WebGL program
    */
  var program: stdLib.WebGLProgram = js.native
  /**
    * The WebGL Renderer which owns this WebGL Pipeline.
    */
  var renderer: WebGLRenderer = js.native
  /**
    * Used to store the current game resolution
    */
  var resolution: scala.Double = js.native
  /**
    * The primitive topology which the pipeline will use to submit draw calls
    */
  var topology: phaserLib.integer = js.native
  /**
    * The handle to a WebGL vertex buffer object.
    */
  var vertexBuffer: stdLib.WebGLBuffer = js.native
  /**
    * The limit of vertices that the pipeline can hold
    */
  var vertexCapacity: phaserLib.integer = js.native
  /**
    * This will store the amount of components of 32 bit length
    */
  var vertexComponentCount: phaserLib.integer = js.native
  /**
    * How many vertices have been fed to the current pipeline.
    */
  var vertexCount: scala.Double = js.native
  /**
    * Raw byte buffer of vertices.
    */
  var vertexData: stdLib.ArrayBuffer = js.native
  /**
    * The size in bytes of the vertex
    */
  var vertexSize: phaserLib.integer = js.native
  /**
    * The canvas which this WebGL Pipeline renders to.
    */
  var view: stdLib.HTMLCanvasElement = js.native
  /**
    * Width of the current viewport
    */
  var width: scala.Double = js.native
  /**
    * Adds a description of vertex attribute to the pipeline
    * @param name Name of the vertex attribute
    * @param size Vertex component size
    * @param type Type of the attribute
    * @param normalized Is the value normalized to a range
    * @param offset Byte offset to the beginning of the first element in the vertex
    */
  def addAttribute(
    name: java.lang.String,
    size: phaserLib.integer,
    `type`: phaserLib.integer,
    normalized: scala.Boolean,
    offset: phaserLib.integer
  ): this.type = js.native
  /**
    * Binds the pipeline resources, including programs, vertex buffers and binds attributes
    */
  def bind(): this.type = js.native
  /**
    * Called when the Game has fully booted and the Renderer has finished setting up.
    * 
    * By this stage all Game level systems are now in place and you can perform any final
    * tasks that the pipeline may need that relied on game systems such as the Texture Manager.
    */
  def boot(): scala.Unit = js.native
  /**
    * Removes all object references in this WebGL Pipeline and removes its program from the WebGL context.
    */
  def destroy(): this.type = js.native
  /**
    * Uploads the vertex data and emits a draw call
    * for the current batch of vertices.
    */
  def flush(): this.type = js.native
  /**
    * Set whenever this WebGL Pipeline is bound to a WebGL Renderer.
    * 
    * This method is called every time the WebGL Pipeline is attempted to be bound, even if it already is the current pipeline.
    */
  def onBind(): this.type = js.native
  /**
    * Called after each frame has been completely rendered and snapshots have been taken.
    */
  def onPostRender(): this.type = js.native
  /**
    * Called before each frame is rendered, but after the canvas has been cleared.
    */
  def onPreRender(): this.type = js.native
  /**
    * Called before a Scene's Camera is rendered.
    * @param scene The Scene being rendered.
    * @param camera The Scene Camera being rendered with.
    */
  def onRender(scene: phaserLib.PhaserNs.Scene, camera: phaserLib.PhaserNs.CamerasNs.Scene2DNs.Camera): this.type = js.native
  /**
    * Resizes the properties used to describe the viewport
    * @param width The new width of this WebGL Pipeline.
    * @param height The new height of this WebGL Pipeline.
    * @param resolution The resolution this WebGL Pipeline should be resized to.
    */
  def resize(width: scala.Double, height: scala.Double, resolution: scala.Double): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new value of the `float` uniform.
    */
  def setFloat1(name: java.lang.String, x: scala.Double): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat1v(name: java.lang.String, arr: stdLib.Float32Array): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new X component of the `vec2` uniform.
    * @param y The new Y component of the `vec2` uniform.
    */
  def setFloat2(name: java.lang.String, x: scala.Double, y: scala.Double): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat2v(name: java.lang.String, arr: stdLib.Float32Array): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new X component of the `vec3` uniform.
    * @param y The new Y component of the `vec3` uniform.
    * @param z The new Z component of the `vec3` uniform.
    */
  def setFloat3(name: java.lang.String, x: scala.Double, y: scala.Double, z: scala.Double): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat3v(name: java.lang.String, arr: stdLib.Float32Array): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x X component of the uniform
    * @param y Y component of the uniform
    * @param z Z component of the uniform
    * @param w W component of the uniform
    */
  def setFloat4(name: java.lang.String, x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param arr The new value to be used for the uniform variable.
    */
  def setFloat4v(name: java.lang.String, arr: stdLib.Float32Array): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new value of the `int` uniform.
    */
  def setInt1(name: java.lang.String, x: phaserLib.integer): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new X component of the `ivec2` uniform.
    * @param y The new Y component of the `ivec2` uniform.
    */
  def setInt2(name: java.lang.String, x: phaserLib.integer, y: phaserLib.integer): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x The new X component of the `ivec3` uniform.
    * @param y The new Y component of the `ivec3` uniform.
    * @param z The new Z component of the `ivec3` uniform.
    */
  def setInt3(name: java.lang.String, x: phaserLib.integer, y: phaserLib.integer, z: phaserLib.integer): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param x X component of the uniform
    * @param y Y component of the uniform
    * @param z Z component of the uniform
    * @param w W component of the uniform
    */
  def setInt4(
    name: java.lang.String,
    x: phaserLib.integer,
    y: phaserLib.integer,
    z: phaserLib.integer,
    w: phaserLib.integer
  ): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param transpose Whether to transpose the matrix. Should be `false`.
    * @param matrix The new values for the `mat2` uniform.
    */
  def setMatrix2(name: java.lang.String, transpose: scala.Boolean, matrix: stdLib.Float32Array): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param transpose Whether to transpose the matrix. Should be `false`.
    * @param matrix The new values for the `mat3` uniform.
    */
  def setMatrix3(name: java.lang.String, transpose: scala.Boolean, matrix: stdLib.Float32Array): this.type = js.native
  /**
    * Set a uniform value of the current pipeline program.
    * @param name The name of the uniform to look-up and modify.
    * @param transpose Should the matrix be transpose
    * @param matrix Matrix data
    */
  def setMatrix4(name: java.lang.String, transpose: scala.Boolean, matrix: stdLib.Float32Array): this.type = js.native
  /**
    * Check if the current batch of vertices is full.
    */
  def shouldFlush(): scala.Boolean = js.native
}

