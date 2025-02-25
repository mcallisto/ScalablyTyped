package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val build: java.lang.String = js.native
  def common(name: java.lang.String, json: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def configure(): scala.Unit = js.native
  def decoder(mtype: Type): Codegen = js.native
  def encoder(mtype: Type): Codegen = js.native
  def load(filename: java.lang.String): js.Promise[Root] = js.native
  def load(filename: java.lang.String, callback: LoadCallback): scala.Unit = js.native
  def load(filename: java.lang.String, root: Root): js.Promise[Root] = js.native
  def load(filename: java.lang.String, root: Root, callback: LoadCallback): scala.Unit = js.native
  def load(filename: js.Array[java.lang.String]): js.Promise[Root] = js.native
  def load(filename: js.Array[java.lang.String], callback: LoadCallback): scala.Unit = js.native
  def load(filename: js.Array[java.lang.String], root: Root): js.Promise[Root] = js.native
  def load(filename: js.Array[java.lang.String], root: Root, callback: LoadCallback): scala.Unit = js.native
  def loadSync(filename: java.lang.String): Root = js.native
  def loadSync(filename: java.lang.String, root: Root): Root = js.native
  def loadSync(filename: js.Array[java.lang.String]): Root = js.native
  def loadSync(filename: js.Array[java.lang.String], root: Root): Root = js.native
  def parse(source: java.lang.String): IParserResult = js.native
  def parse(source: java.lang.String, options: IParseOptions): IParserResult = js.native
  def parse(source: java.lang.String, root: Root): IParserResult = js.native
  def parse(source: java.lang.String, root: Root, options: IParseOptions): IParserResult = js.native
  def tokenize(source: java.lang.String, alternateCommentMode: scala.Boolean): ITokenizerHandle = js.native
  def verifier(mtype: Type): Codegen = js.native
}

