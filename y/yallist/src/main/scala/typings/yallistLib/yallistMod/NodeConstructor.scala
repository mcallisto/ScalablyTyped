package typings
package yallistLib.yallistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeConstructor
  extends org.scalablytyped.runtime.Instantiable1[/* value */ js.Object, Node[js.Object]]
     with org.scalablytyped.runtime.Instantiable2[/* value */ js.Object, /* prev */ Node[js.Object], Node[js.Object]]
     with org.scalablytyped.runtime.Instantiable3[
      /* value */ js.Object, 
      /* prev */ Node[js.Object], 
      /* next */ Node[js.Object], 
      Node[js.Object]
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* value */ js.Object, 
      /* prev */ Node[js.Object], 
      /* next */ Node[js.Object], 
      /* list */ Yallist[js.Object], 
      Node[js.Object]
    ] {
  def apply[T](value: T): Node[T] = js.native
  def apply[T](value: T, prev: Node[T]): Node[T] = js.native
  def apply[T](value: T, prev: Node[T], next: Node[T]): Node[T] = js.native
  def apply[T](value: T, prev: Node[T], next: Node[T], list: Yallist[T]): Node[T] = js.native
}

