class Circle(_name:String) : Shape(_name) {
     private var radius : Double = 0.0
     private val pi = 3.14


     fun setDimensions(radius: Double) {
          this.radius = radius

     }

     fun area() = radius * radius * pi

}