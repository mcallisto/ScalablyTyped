package typings
package glDashMatrixLib.srcGlDashMatrixMat2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-matrix/src/gl-matrix/mat2", JSImport.Namespace)
@js.native
class ^ ()
  extends glDashMatrixLib.glDashMatrixMod.mat2

@JSImport("gl-matrix/src/gl-matrix/mat2", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Returns L, D and U matrices (Lower triangular, Diagonal and Upper triangular) by factorizing the input matrix
    * @param L the lower triangular matrix
    * @param D the diagonal matrix
    * @param U the upper triangular matrix
    * @param a the input matrix to factorize
    */
  def LDU(
    L: glDashMatrixLib.glDashMatrixMod.mat2,
    D: glDashMatrixLib.glDashMatrixMod.mat2,
    U: glDashMatrixLib.glDashMatrixMod.mat2,
    a: glDashMatrixLib.glDashMatrixMod.mat2
  ): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Adds two mat2's
    *
    * @param {mat2} out the receiving matrix
    * @param {mat2} a the first operand
    * @param {mat2} b the second operand
    * @returns {mat2} out
    */
  def add(
    out: glDashMatrixLib.glDashMatrixMod.mat2,
    a: glDashMatrixLib.glDashMatrixMod.mat2,
    b: glDashMatrixLib.glDashMatrixMod.mat2
  ): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Calculates the adjugate of a mat2
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def adjoint(out: glDashMatrixLib.glDashMatrixMod.mat2, a: glDashMatrixLib.glDashMatrixMod.mat2): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Creates a new mat2 initialized with values from an existing matrix
    *
    * @param a matrix to clone
    * @returns a new 2x2 matrix
    */
  def clone(a: glDashMatrixLib.glDashMatrixMod.mat2): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Copy the values from one mat2 to another
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def copy(out: glDashMatrixLib.glDashMatrixMod.mat2, a: glDashMatrixLib.glDashMatrixMod.mat2): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Creates a new identity mat2
    *
    * @returns a new 2x2 matrix
    */
  def create(): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Calculates the determinant of a mat2
    *
    * @param a the source matrix
    * @returns determinant of a
    */
  def determinant(a: glDashMatrixLib.glDashMatrixMod.mat2): scala.Double = js.native
  /**
    * Returns whether or not the matrices have approximately the same elements in the same position.
    *
    * @param {mat2} a The first matrix.
    * @param {mat2} b The second matrix.
    * @returns {boolean} True if the matrices are equal, false otherwise.
    */
  def equals(a: glDashMatrixLib.glDashMatrixMod.mat2, b: glDashMatrixLib.glDashMatrixMod.mat2): scala.Boolean = js.native
  /**
    * Returns whether or not the matrices have exactly the same elements in the same position (when compared with ===)
    *
    * @param {mat2} a The first matrix.
    * @param {mat2} b The second matrix.
    * @returns {boolean} True if the matrices are equal, false otherwise.
    */
  def exactEquals(a: glDashMatrixLib.glDashMatrixMod.mat2, b: glDashMatrixLib.glDashMatrixMod.mat2): scala.Boolean = js.native
  /**
    * Returns Frobenius norm of a mat2
    *
    * @param a the matrix to calculate Frobenius norm of
    * @returns Frobenius norm
    */
  def frob(a: glDashMatrixLib.glDashMatrixMod.mat2): scala.Double = js.native
  /**
    * Creates a matrix from a given angle
    * This is equivalent to (but much faster than):
    *
    *     mat2.identity(dest);
    *     mat2.rotate(dest, dest, rad);
    *
    * @param {mat2} out mat2 receiving operation result
    * @param {number} rad the angle to rotate the matrix by
    * @returns {mat2} out
    */
  def fromRotation(out: glDashMatrixLib.glDashMatrixMod.mat2, rad: scala.Double): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Creates a matrix from a vector scaling
    * This is equivalent to (but much faster than):
    *
    *     mat2.identity(dest);
    *     mat2.scale(dest, dest, vec);
    *
    * @param {mat2} out mat2 receiving operation result
    * @param {vec2} v Scaling vector
    * @returns {mat2} out
    */
  def fromScaling(out: glDashMatrixLib.glDashMatrixMod.mat2, v: glDashMatrixLib.glDashMatrixMod.vec2): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  def fromScaling(out: glDashMatrixLib.glDashMatrixMod.mat2, v: js.Array[scala.Double]): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Create a new mat2 with the given values
    *
    * @param {number} m00 Component in column 0, row 0 position (index 0)
    * @param {number} m01 Component in column 0, row 1 position (index 1)
    * @param {number} m10 Component in column 1, row 0 position (index 2)
    * @param {number} m11 Component in column 1, row 1 position (index 3)
    * @returns {mat2} out A new 2x2 matrix
    */
  def fromValues(m00: scala.Double, m01: scala.Double, m10: scala.Double, m11: scala.Double): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Set a mat2 to the identity matrix
    *
    * @param out the receiving matrix
    * @returns out
    */
  def identity(out: glDashMatrixLib.glDashMatrixMod.mat2): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Inverts a mat2
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def invert(out: glDashMatrixLib.glDashMatrixMod.mat2, a: glDashMatrixLib.glDashMatrixMod.mat2): glDashMatrixLib.glDashMatrixMod.mat2 | scala.Null = js.native
  /**
    * Multiplies two mat2's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def mul(
    out: glDashMatrixLib.glDashMatrixMod.mat2,
    a: glDashMatrixLib.glDashMatrixMod.mat2,
    b: glDashMatrixLib.glDashMatrixMod.mat2
  ): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Multiplies two mat2's
    *
    * @param out the receiving matrix
    * @param a the first operand
    * @param b the second operand
    * @returns out
    */
  def multiply(
    out: glDashMatrixLib.glDashMatrixMod.mat2,
    a: glDashMatrixLib.glDashMatrixMod.mat2,
    b: glDashMatrixLib.glDashMatrixMod.mat2
  ): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Multiply each element of the matrix by a scalar.
    *
    * @param {mat2} out the receiving matrix
    * @param {mat2} a the matrix to scale
    * @param {number} b amount to scale the matrix's elements by
    * @returns {mat2} out
    */
  def multiplyScalar(
    out: glDashMatrixLib.glDashMatrixMod.mat2,
    a: glDashMatrixLib.glDashMatrixMod.mat2,
    b: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Adds two mat2's after multiplying each element of the second operand by a scalar value.
    *
    * @param {mat2} out the receiving vector
    * @param {mat2} a the first operand
    * @param {mat2} b the second operand
    * @param {number} scale the amount to scale b's elements by before adding
    * @returns {mat2} out
    */
  def multiplyScalarAndAdd(
    out: glDashMatrixLib.glDashMatrixMod.mat2,
    a: glDashMatrixLib.glDashMatrixMod.mat2,
    b: glDashMatrixLib.glDashMatrixMod.mat2,
    scale: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Rotates a mat2 by the given angle
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param rad the angle to rotate the matrix by
    * @returns out
    */
  def rotate(
    out: glDashMatrixLib.glDashMatrixMod.mat2,
    a: glDashMatrixLib.glDashMatrixMod.mat2,
    rad: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Scales the mat2 by the dimensions in the given vec2
    *
    * @param out the receiving matrix
    * @param a the matrix to rotate
    * @param v the vec2 to scale the matrix by
    * @returns out
    **/
  def scale(
    out: glDashMatrixLib.glDashMatrixMod.mat2,
    a: glDashMatrixLib.glDashMatrixMod.mat2,
    v: glDashMatrixLib.glDashMatrixMod.vec2
  ): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  def scale(
    out: glDashMatrixLib.glDashMatrixMod.mat2,
    a: glDashMatrixLib.glDashMatrixMod.mat2,
    v: js.Array[scala.Double]
  ): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Set the components of a mat2 to the given values
    *
    * @param {mat2} out the receiving matrix
    * @param {number} m00 Component in column 0, row 0 position (index 0)
    * @param {number} m01 Component in column 0, row 1 position (index 1)
    * @param {number} m10 Component in column 1, row 0 position (index 2)
    * @param {number} m11 Component in column 1, row 1 position (index 3)
    * @returns {mat2} out
    */
  def set(
    out: glDashMatrixLib.glDashMatrixMod.mat2,
    m00: scala.Double,
    m01: scala.Double,
    m10: scala.Double,
    m11: scala.Double
  ): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Returns a string representation of a mat2
    *
    * @param a matrix to represent as a string
    * @returns string representation of the matrix
    */
  def str(a: glDashMatrixLib.glDashMatrixMod.mat2): java.lang.String = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param {mat2} out the receiving matrix
    * @param {mat2} a the first operand
    * @param {mat2} b the second operand
    * @returns {mat2} out
    */
  def sub(
    out: glDashMatrixLib.glDashMatrixMod.mat2,
    a: glDashMatrixLib.glDashMatrixMod.mat2,
    b: glDashMatrixLib.glDashMatrixMod.mat2
  ): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Subtracts matrix b from matrix a
    *
    * @param {mat2} out the receiving matrix
    * @param {mat2} a the first operand
    * @param {mat2} b the second operand
    * @returns {mat2} out
    */
  def subtract(
    out: glDashMatrixLib.glDashMatrixMod.mat2,
    a: glDashMatrixLib.glDashMatrixMod.mat2,
    b: glDashMatrixLib.glDashMatrixMod.mat2
  ): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
  /**
    * Transpose the values of a mat2
    *
    * @param out the receiving matrix
    * @param a the source matrix
    * @returns out
    */
  def transpose(out: glDashMatrixLib.glDashMatrixMod.mat2, a: glDashMatrixLib.glDashMatrixMod.mat2): glDashMatrixLib.glDashMatrixMod.mat2 = js.native
}

