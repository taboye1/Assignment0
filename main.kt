import java.sql.DriverManager.println
import java.util.*

fun main(){

    val sc = Scanner(System.`in`)

    // create Objects and print all
    val square = Square("Square")
    println("Enter length and height for square")
    square.setDimensions(sc.nextDouble(),sc.nextDouble())

    //circle
    val circle = Circle("Circle")
    println("Enter radius for circle")
    circle.setDimensions(sc.nextDouble())

    //triangle
    val triangle = Triangle("Triangle")
    println("Enter s1, s2, and s3 for triangle")
    triangle.setDimensions(sc.nextDouble(),sc.nextDouble(),sc.nextDouble())

    //EquilateralTriangle
    val equilateralTriangle = EquilateralTriangle("EquilateralTriangle")
    println("Enter side for EquilateralTriangle")
    equilateralTriangle.setDimensions(sc.nextDouble())


}