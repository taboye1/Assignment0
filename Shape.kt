import java.sql.DriverManager.println

abstract class Shape(_name:String) {
    var name = _name

    fun getArea(): Double {
        return 0.0;
    }

    fun printDimensions(){
        println("No dimensions");
    }
}