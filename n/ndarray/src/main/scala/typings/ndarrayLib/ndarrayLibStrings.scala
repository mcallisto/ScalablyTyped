package typings
package ndarrayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ndarrayLibStrings {
  @js.native
  sealed trait array
    extends ndarrayLib.ndarrayMod.DataType
  
  @js.native
  sealed trait buffer
    extends ndarrayLib.ndarrayMod.DataType
  
  @js.native
  sealed trait float32
    extends ndarrayLib.ndarrayMod.DataType
  
  @js.native
  sealed trait float64
    extends ndarrayLib.ndarrayMod.DataType
  
  @js.native
  sealed trait generic
    extends ndarrayLib.ndarrayMod.DataType
  
  @js.native
  sealed trait int16
    extends ndarrayLib.ndarrayMod.DataType
  
  @js.native
  sealed trait int32
    extends ndarrayLib.ndarrayMod.DataType
  
  @js.native
  sealed trait int8
    extends ndarrayLib.ndarrayMod.DataType
  
  @js.native
  sealed trait uint16
    extends ndarrayLib.ndarrayMod.DataType
  
  @js.native
  sealed trait uint32
    extends ndarrayLib.ndarrayMod.DataType
  
  @js.native
  sealed trait uint8
    extends ndarrayLib.ndarrayMod.DataType
  
  @js.native
  sealed trait uint8_clamped
    extends ndarrayLib.ndarrayMod.DataType
  
  @scala.inline
  def array: array = "array".asInstanceOf[array]
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  @scala.inline
  def float32: float32 = "float32".asInstanceOf[float32]
  @scala.inline
  def float64: float64 = "float64".asInstanceOf[float64]
  @scala.inline
  def generic: generic = "generic".asInstanceOf[generic]
  @scala.inline
  def int16: int16 = "int16".asInstanceOf[int16]
  @scala.inline
  def int32: int32 = "int32".asInstanceOf[int32]
  @scala.inline
  def int8: int8 = "int8".asInstanceOf[int8]
  @scala.inline
  def uint16: uint16 = "uint16".asInstanceOf[uint16]
  @scala.inline
  def uint32: uint32 = "uint32".asInstanceOf[uint32]
  @scala.inline
  def uint8: uint8 = "uint8".asInstanceOf[uint8]
  @scala.inline
  def uint8_clamped: uint8_clamped = "uint8_clamped".asInstanceOf[uint8_clamped]
}

