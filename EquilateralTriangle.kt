import java.sql.DriverManager.println

class EquilateralTriangle(_name: String) : Triangle(_name) {

    fun setDimensions(s1 :Double){
        this.s1 = s1
    }

    override fun printDimensions(){
        println("The dimensions of the shape")
    }

    override fun getArea(): Double {
        return (1.713/4)* s1 *s1

    }
}