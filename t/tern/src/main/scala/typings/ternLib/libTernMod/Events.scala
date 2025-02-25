package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  /** After analyzing a file. */
  def afterLoad(file: File): scala.Unit
  /** Before analyzing a file. file is an object holding {name, text, scope} properties. */
  def beforeLoad(file: File): scala.Unit
  /** Run at the start of a completion query. May return a valid completion result to replace the default completion algorithm. */
  def completion(file: File, query: CompletionsQuery): CompletionsQueryResult | scala.Unit
  /** Run after the type inference pass. */
  def postInfer(ast: estreeLib.estreeMod.Program, scope: ternLib.libInferMod.Scope): scala.Unit
  /** Run right after a file is parsed, and passed the parse tree and the parsed file as arguments. */
  def postParse(ast: estreeLib.estreeMod.Program, text: java.lang.String): scala.Unit
  /** Run right before the type inference pass, passing the syntax tree and a scope object. */
  def preInfer(ast: estreeLib.estreeMod.Program, scope: ternLib.libInferMod.Scope): scala.Unit
  /**
    * Will be run right before a file is parsed, and passed the given text and options. If a handler
    * returns a new text value, the origin text will be overriden. This is useful for
    * instance when a plugin is able to extract JavaScript content from an HTML file.
    */
  def preParse(text: java.lang.String, options: js.Object): java.lang.String | scala.Unit
  /** When the server throws away its current analysis data and starts a fresh run. */
  def reset(): scala.Unit
  /**
    * Run after Tern attempts to find the type at the position end in the given file.
    * A handler may return either the given type (already calculated by Tern and earlier "typeAt" passes)
    * or an alternate type to be used instead. This is useful when
    * a plugin can provide a more helpful type than Tern (e.g. within comments).
    */
  def typeAt(file: File, end: Position, expr: estreeLib.estreeMod.Node, `type`: ternLib.libInferMod.Type): ternLib.libInferMod.Type | scala.Unit
}

object Events {
  @scala.inline
  def apply(
    afterLoad: File => scala.Unit,
    beforeLoad: File => scala.Unit,
    completion: (File, CompletionsQuery) => CompletionsQueryResult | scala.Unit,
    postInfer: (estreeLib.estreeMod.Program, ternLib.libInferMod.Scope) => scala.Unit,
    postParse: (estreeLib.estreeMod.Program, java.lang.String) => scala.Unit,
    preInfer: (estreeLib.estreeMod.Program, ternLib.libInferMod.Scope) => scala.Unit,
    preParse: (java.lang.String, js.Object) => java.lang.String | scala.Unit,
    reset: () => scala.Unit,
    typeAt: (File, Position, estreeLib.estreeMod.Node, ternLib.libInferMod.Type) => ternLib.libInferMod.Type | scala.Unit
  ): Events = {
    val __obj = js.Dynamic.literal(afterLoad = js.Any.fromFunction1(afterLoad), beforeLoad = js.Any.fromFunction1(beforeLoad), completion = js.Any.fromFunction2(completion), postInfer = js.Any.fromFunction2(postInfer), postParse = js.Any.fromFunction2(postParse), preInfer = js.Any.fromFunction2(preInfer), preParse = js.Any.fromFunction2(preParse), reset = js.Any.fromFunction0(reset), typeAt = js.Any.fromFunction4(typeAt))
  
    __obj.asInstanceOf[Events]
  }
}

