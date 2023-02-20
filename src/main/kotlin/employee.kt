class employee (var firstName: String,
                var lastName: String,
                var number: Int,
                var shift: Int) {

    init {
        println("Employee name" $firstName $lastName)
    }

    fun printAll(){
        println(firstName + lastName + number.toString() + shift.toString())
    }


}