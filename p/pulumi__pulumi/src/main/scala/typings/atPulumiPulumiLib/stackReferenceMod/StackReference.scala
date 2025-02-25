package typings
package atPulumiPulumiLib.stackReferenceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi/stackReference", "StackReference")
@js.native
class StackReference protected ()
  extends atPulumiPulumiLib.resourceMod.CustomResource {
  /**
    * Create a StackReference resource with the given unique name, arguments, and options.
    *
    * If args is not specified, the name of the referenced stack will be the name of the StackReference resource.
    *
    * @param name The _unique_ name of the stack reference.
    * @param args The arguments to use to populate this resource's properties.
    * @Param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: StackReferenceArgs) = this()
  def this(name: java.lang.String, args: StackReferenceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The name of the referenced stack.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The outputs of the referenced stack.
    */
  val outputs: atPulumiPulumiLib.outputMod.Output[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /**
    * Fetches the value of the named stack output.
    *
    * @param name The name of the stack output to fetch.
    */
  def getOutput(name: atPulumiPulumiLib.outputMod.Input[java.lang.String]): atPulumiPulumiLib.outputMod.Output[_] = js.native
  /**
    * Fetches the value promptly of the named stack output.  May return undefined if the value is
    * not known for some reason.
    *
    * This operation is not supported (and will throw) if any exported values of the StackReference
    * are secrets.
    *
    * @param name The name of the stack output to fetch.
    */
  def getOutputSync(name: java.lang.String): js.Any = js.native
}

