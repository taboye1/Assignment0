import java.sql.DriverManager.println

open class Triangle(_name: String ) : Shape(_name) {
    var s1: Double = 0.0
    private var s2: Double = 0.0
    private var s3: Double = 0.0

    // The method that takes three parameter
    fun setDimensions(s1: Double, s2: Double, s3: Double) {
        this.s1 = s1
        this.s2 = s2
        this.s3 = s3

    }

    override fun printDimensions() {
        println("")

    }

    //override fun getArea(): Double {

   // }
}