package typings
package electronLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassNativeImage
  extends org.scalablytyped.runtime.Instantiable0[electronLib.ElectronNs.NativeImage] {
  // Docs: http://electronjs.org/docs/api/native-image
  /**
    * Creates an empty NativeImage instance.
    */
  def createEmpty(): electronLib.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from buffer.
    */
  def createFromBuffer(buffer: nodeLib.Buffer): electronLib.ElectronNs.NativeImage = js.native
  def createFromBuffer(buffer: nodeLib.Buffer, options: electronLib.ElectronNs.CreateFromBufferOptions): electronLib.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from dataURL.
    */
  def createFromDataURL(dataURL: java.lang.String): electronLib.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from the NSImage that maps to the given image
    * name. See NSImageName for a list of possible values. The hslShift is applied to
    * the image with the following rules This means that [-1, 0, 1] will make the
    * image completely white and [-1, 1, 0] will make the image completely black. In
    * some cases, the NSImageName doesn't match its string representation; one example
    * of this is NSFolderImageName, whose string representation would actually be
    * NSFolder. Therefore, you'll need to determine the correct string representation
    * for your image before passing it in. This can be done with the following: echo
    * -e '#import <Cocoa/Cocoa.h>\nint main() { NSLog(@"%@", SYSTEM_IMAGE_NAME); }' |
    * clang -otest -x objective-c -framework Cocoa - && ./test where SYSTEM_IMAGE_NAME
    * should be replaced with any value from this list.
    */
  def createFromNamedImage(imageName: java.lang.String, hslShift: js.Array[scala.Double]): electronLib.ElectronNs.NativeImage = js.native
  /**
    * Creates a new NativeImage instance from a file located at path. This method
    * returns an empty image if the path does not exist, cannot be read, or is not a
    * valid image.
    */
  def createFromPath(path: java.lang.String): electronLib.ElectronNs.NativeImage = js.native
}

