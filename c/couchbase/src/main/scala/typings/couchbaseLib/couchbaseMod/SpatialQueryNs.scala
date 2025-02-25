package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "SpatialQuery")
@js.native
object SpatialQueryNs extends js.Object {
  @js.native
  sealed trait Update extends js.Object
  
  /**
    * Enumeration for specifying view update semantics.
    */
  @js.native
  object Update extends js.Object {
    /**
      * 	Forces the view to be indexed after the results of this query has been fetched.
      */
    @js.native
    sealed trait AFTER
      extends couchbaseLib.couchbaseMod.SpatialQueryNs.Update
    
    /**
      * Causes the view to be fully indexed before results are retrieved.
      */
    @js.native
    sealed trait BEFORE
      extends couchbaseLib.couchbaseMod.SpatialQueryNs.Update
    
    /**
      * Allows the index to stay in whatever state it is already in prior retrieval of the query results.
      */
    @js.native
    sealed trait NONE
      extends couchbaseLib.couchbaseMod.SpatialQueryNs.Update
    
    /* 2 */ val AFTER: AFTER with scala.Double = js.native
    /* 0 */ val BEFORE: BEFORE with scala.Double = js.native
    /* 1 */ val NONE: NONE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[couchbaseLib.couchbaseMod.SpatialQueryNs.Update with scala.Double] = js.native
  }
  
}

