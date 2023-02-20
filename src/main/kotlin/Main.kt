fun main(args: Array<String>) {
   val employee1 = employee("Jeff", "Lastname", 101,2)
   val employee2 = employee("Sara", "Surname", 102,1)
   val employee3 = employee("Mike", "Secondname", 103,3)
   val employee4 = employee()


   println("---- Employee List ----")
   employee1.printAll()
   println("\n")
   employee2.printAll()
   println("\n")
   employee3.printAll()
   println("\n")
   employee4.printAll()


}