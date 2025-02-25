package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImplementationProvider extends js.Object {
  /**
  		 * Provide the implementations of the symbol at the given position and document.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return A definition or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideImplementation(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Definition | js.Array[DefinitionLink]]
}

object ImplementationProvider {
  @scala.inline
  def apply(
    provideImplementation: (TextDocument, Position, CancellationToken) => ProviderResult[Definition | js.Array[DefinitionLink]]
  ): ImplementationProvider = {
    val __obj = js.Dynamic.literal(provideImplementation = js.Any.fromFunction3(provideImplementation))
  
    __obj.asInstanceOf[ImplementationProvider]
  }
}

