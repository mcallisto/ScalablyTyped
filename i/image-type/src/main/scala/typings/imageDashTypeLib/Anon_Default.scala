package typings
package imageDashTypeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	The minimum amount of bytes needed to detect a file type. Currently, it's 4100 bytes, but it can change, so don't hard-code it.
  	*/
  val minimumBytes: scala.Double = js.native
  /**
  	Detect the image type of a `Buffer`/`Uint8Array`.
  	@param input - Input to examine to determine the file type. It only needs the first `.minimumBytes` bytes.
  	@example
  	```
  	import readChunk = require('read-chunk');
  	import imageType = require('image-type');
  	const buffer = readChunk.sync('unicorn.png', 0, 12);
  	imageType(buffer);
  	//=> {ext: 'png', mime: 'image/png'}
  	// Or from a remote location:
  	import * as http from 'http';
  	const url = 'https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif';
  	http.get(url, response => {
  		response.on('readable', () => {
  			const chunk = response.read(imageType.minimumBytes);
  			response.destroy();
  			console.log(imageType(chunk));
  			//=> {ext: 'gif', mime: 'image/gif'}
  		});
  	});
  	```
  	*/
  def apply(input: nodeLib.Buffer): imageDashTypeLib.imageDashTypeMod.ImageTypeResult | scala.Null = js.native
  def apply(input: stdLib.Uint8Array): imageDashTypeLib.imageDashTypeMod.ImageTypeResult | scala.Null = js.native
}

