package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "Node")
@js.native
class Node () extends NodeOptions {
  def this(config: NodeOptions) = this()
  @JSName("body")
  var body_Original: TwimlMethod = js.native
  @JSName("client")
  var client_Original: TwimlMethod = js.native
  @JSName("conference")
  var conference_Original: TwimlMethod = js.native
  @JSName("dial")
  var dial_Original: TwimlMethod = js.native
  @JSName("enqueue")
  var enqueue_Original: TwimlMethod = js.native
  // TwiML Verbs/Nouns:
  @JSName("gather")
  var gather_Original: TwimlMethod = js.native
  @JSName("hangup")
  var hangup_Original: TwimlMethod = js.native
  @JSName("leave")
  var leave_Original: TwimlMethod = js.native
  /* CompleteClass */
  override var legalNodes: js.Array[java.lang.String] = js.native
  @JSName("media")
  var media_Original: TwimlMethod = js.native
  @JSName("message")
  var message_Original: TwimlMethod = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  @JSName("number")
  var number_Original: TwimlMethod = js.native
  @JSName("pause")
  var pause_Original: TwimlMethod = js.native
  @JSName("play")
  var play_Original: TwimlMethod = js.native
  @JSName("queue")
  var queue_Original: TwimlMethod = js.native
  @JSName("record")
  var record_Original: TwimlMethod = js.native
  @JSName("redirect")
  var redirect_Original: TwimlMethod = js.native
  @JSName("reject")
  var reject_Original: TwimlMethod = js.native
  @JSName("say")
  var say_Original: TwimlMethod = js.native
  @JSName("sip")
  var sip_Original: TwimlMethod = js.native
  @JSName("sms")
  var sms_Original: TwimlMethod = js.native
  @JSName("task")
  var task_Original: TwimlMethod = js.native
  @JSName("topLevel")
  var topLevel_Node: scala.Boolean = js.native
  def body(): Node = js.native
  def body(arg1: java.lang.String): Node = js.native
  def body(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def body(arg1: js.Any): Node = js.native
  def body(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def body(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def body(arg1: TwimlCallback): Node = js.native
  def body(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def client(): Node = js.native
  def client(arg1: java.lang.String): Node = js.native
  def client(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def client(arg1: js.Any): Node = js.native
  def client(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def client(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def client(arg1: TwimlCallback): Node = js.native
  def client(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def conference(): Node = js.native
  def conference(arg1: java.lang.String): Node = js.native
  def conference(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def conference(arg1: js.Any): Node = js.native
  def conference(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def conference(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def conference(arg1: TwimlCallback): Node = js.native
  def conference(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def dial(): Node = js.native
  def dial(arg1: java.lang.String): Node = js.native
  def dial(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def dial(arg1: js.Any): Node = js.native
  def dial(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def dial(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def dial(arg1: TwimlCallback): Node = js.native
  def dial(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def enqueue(): Node = js.native
  def enqueue(arg1: java.lang.String): Node = js.native
  def enqueue(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def enqueue(arg1: js.Any): Node = js.native
  def enqueue(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def enqueue(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def enqueue(arg1: TwimlCallback): Node = js.native
  def enqueue(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  // TwiML Verbs/Nouns:
  def gather(): Node = js.native
  def gather(arg1: java.lang.String): Node = js.native
  def gather(arg1: java.lang.String, arg2: js.Any): Node = js.native
  // TwiML Verbs/Nouns:
  def gather(arg1: js.Any): Node = js.native
  def gather(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def gather(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  // TwiML Verbs/Nouns:
  def gather(arg1: TwimlCallback): Node = js.native
  def gather(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def hangup(): Node = js.native
  def hangup(arg1: java.lang.String): Node = js.native
  def hangup(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def hangup(arg1: js.Any): Node = js.native
  def hangup(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def hangup(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def hangup(arg1: TwimlCallback): Node = js.native
  def hangup(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def leave(): Node = js.native
  def leave(arg1: java.lang.String): Node = js.native
  def leave(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def leave(arg1: js.Any): Node = js.native
  def leave(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def leave(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def leave(arg1: TwimlCallback): Node = js.native
  def leave(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def media(): Node = js.native
  def media(arg1: java.lang.String): Node = js.native
  def media(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def media(arg1: js.Any): Node = js.native
  def media(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def media(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def media(arg1: TwimlCallback): Node = js.native
  def media(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def message(): Node = js.native
  def message(arg1: java.lang.String): Node = js.native
  def message(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def message(arg1: js.Any): Node = js.native
  def message(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def message(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def message(arg1: TwimlCallback): Node = js.native
  def message(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def number(): Node = js.native
  def number(arg1: java.lang.String): Node = js.native
  def number(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def number(arg1: js.Any): Node = js.native
  def number(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def number(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def number(arg1: TwimlCallback): Node = js.native
  def number(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def pause(): Node = js.native
  def pause(arg1: java.lang.String): Node = js.native
  def pause(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def pause(arg1: js.Any): Node = js.native
  def pause(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def pause(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def pause(arg1: TwimlCallback): Node = js.native
  def pause(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def play(): Node = js.native
  def play(arg1: java.lang.String): Node = js.native
  def play(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def play(arg1: js.Any): Node = js.native
  def play(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def play(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def play(arg1: TwimlCallback): Node = js.native
  def play(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def queue(): Node = js.native
  def queue(arg1: java.lang.String): Node = js.native
  def queue(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def queue(arg1: js.Any): Node = js.native
  def queue(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def queue(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def queue(arg1: TwimlCallback): Node = js.native
  def queue(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def record(): Node = js.native
  def record(arg1: java.lang.String): Node = js.native
  def record(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def record(arg1: js.Any): Node = js.native
  def record(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def record(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def record(arg1: TwimlCallback): Node = js.native
  def record(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def redirect(): Node = js.native
  def redirect(arg1: java.lang.String): Node = js.native
  def redirect(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def redirect(arg1: js.Any): Node = js.native
  def redirect(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def redirect(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def redirect(arg1: TwimlCallback): Node = js.native
  def redirect(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def reject(): Node = js.native
  def reject(arg1: java.lang.String): Node = js.native
  def reject(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def reject(arg1: js.Any): Node = js.native
  def reject(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def reject(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def reject(arg1: TwimlCallback): Node = js.native
  def reject(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def say(): Node = js.native
  def say(arg1: java.lang.String): Node = js.native
  def say(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def say(arg1: js.Any): Node = js.native
  def say(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def say(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def say(arg1: TwimlCallback): Node = js.native
  def say(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def sip(): Node = js.native
  def sip(arg1: java.lang.String): Node = js.native
  def sip(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def sip(arg1: js.Any): Node = js.native
  def sip(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def sip(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def sip(arg1: TwimlCallback): Node = js.native
  def sip(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def sms(): Node = js.native
  def sms(arg1: java.lang.String): Node = js.native
  def sms(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def sms(arg1: js.Any): Node = js.native
  def sms(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def sms(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def sms(arg1: TwimlCallback): Node = js.native
  def sms(arg1: TwimlCallback, arg2: js.Any): Node = js.native
  def task(): Node = js.native
  def task(arg1: java.lang.String): Node = js.native
  def task(arg1: java.lang.String, arg2: js.Any): Node = js.native
  def task(arg1: js.Any): Node = js.native
  def task(arg1: js.Any, arg2: java.lang.String): Node = js.native
  def task(arg1: js.Any, arg2: TwimlCallback): Node = js.native
  def task(arg1: TwimlCallback): Node = js.native
  def task(arg1: TwimlCallback, arg2: js.Any): Node = js.native
}

