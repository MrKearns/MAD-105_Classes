class employee (var firstName: String? = "xxxx",
                var lastName: String? = "xxxx",
                var number: Int? = 0,
                var shift: Int?= 0 ) {

    fun printAll(){
        println("EMP #: " + number.toString() + "\n" + firstName + " " + lastName + "\nShift: " + shift.toString())
    }


}