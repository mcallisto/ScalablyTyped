package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionItemProvider extends js.Object {
  /**
  		 * Given a completion item fill in more data, like [doc-comment](#CompletionItem.documentation)
  		 * or [details](#CompletionItem.detail).
  		 *
  		 * The editor will only resolve a completion item once.
  		 *
  		 * *Note* that accepting a completion item will not wait for it to be resolved. Because of that [`insertText`](#CompletionItem.insertText),
  		 * [`additionalTextEdits`](#CompletionItem.additionalTextEdits), and [`command`](#CompletionItem.command) should not
  		 * be changed when resolving an item.
  		 *
  		 * @param item A completion item currently active in the UI.
  		 * @param token A cancellation token.
  		 * @return The resolved completion item or a thenable that resolves to of such. It is OK to return the given
  		 * `item`. When no result is returned, the given `item` will be used.
  		 */
  var resolveCompletionItem: js.UndefOr[
    js.Function2[
      /* item */ CompletionItem, 
      /* token */ CancellationToken, 
      ProviderResult[CompletionItem]
    ]
  ] = js.undefined
  /**
  		 * Provide completion items for the given position and document.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param token A cancellation token.
  		 * @param context How the completion was triggered.
  		 *
  		 * @return An array of completions, a [completion list](#CompletionList), or a thenable that resolves to either.
  		 * The lack of a result can be signaled by returning `undefined`, `null`, or an empty array.
  		 */
  def provideCompletionItems(document: TextDocument, position: Position, token: CancellationToken, context: CompletionContext): ProviderResult[js.Array[CompletionItem] | CompletionList]
}

object CompletionItemProvider {
  @scala.inline
  def apply(
    provideCompletionItems: (TextDocument, Position, CancellationToken, CompletionContext) => ProviderResult[js.Array[CompletionItem] | CompletionList],
    resolveCompletionItem: (/* item */ CompletionItem, /* token */ CancellationToken) => ProviderResult[CompletionItem] = null
  ): CompletionItemProvider = {
    val __obj = js.Dynamic.literal(provideCompletionItems = js.Any.fromFunction4(provideCompletionItems))
    if (resolveCompletionItem != null) __obj.updateDynamic("resolveCompletionItem")(js.Any.fromFunction2(resolveCompletionItem))
    __obj.asInstanceOf[CompletionItemProvider]
  }
}

