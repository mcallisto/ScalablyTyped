package typings
package atHapiCatboxLib.atHapiCatboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/catbox", "Client")
@js.native
class Client[T] protected () extends ClientApi[T] {
  def this(engine: EnginePrototypeOrObject) = this()
  def this(engine: EnginePrototypeOrObject, options: ClientOptions) = this()
  /**
    * drop(key) - remove an item from cache where:
    *  * key - a cache key object (see [ICacheKey]).
    */
  /* CompleteClass */
  override def drop(key: CacheKey): js.Promise[scala.Unit] = js.native
  /**
    * get(key, callback) - retrieve an item from the cache engine if found where:
    *  * key - a cache key object (see [ICacheKey]).
    */
  /* CompleteClass */
  override def get(key: CacheKey): js.Promise[scala.Null | CachedObject[T]] = js.native
  /** isReady() - returns true if cache engine determines itself as ready, false if it is not ready. */
  /* CompleteClass */
  override def isReady(): scala.Boolean = js.native
  /**
    * set(key, value, ttl) - store an item in the cache for a specified length of time, where:
    *  * key - a cache key object (see [ICacheKey]).
    *  * value - the string or object value to be stored.
    *  * ttl - a time-to-live value in milliseconds after which the item is automatically removed from the cache (or is marked invalid).
    */
  /* CompleteClass */
  override def set(key: CacheKey, value: T, ttl: scala.Double): js.Promise[scala.Unit] = js.native
  /** start() - creates a connection to the cache server. Must be called before any other method is available. */
  /* CompleteClass */
  override def start(): js.Promise[scala.Unit] = js.native
  /** stop() - terminates the connection to the cache server. */
  /* CompleteClass */
  override def stop(): scala.Unit = js.native
  /** validateSegmentName(segment) - returns null if the segment name is valid (see below), otherwise should return an instance of Error with an appropriate message. */
  /* CompleteClass */
  override def validateSegmentName(segment: java.lang.String): scala.Null | stdLib.Error = js.native
}

