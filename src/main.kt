
fun main() {
    val emp1 = Employee("Jane Doe", PositionTitle.Administration, true, 27.00, 1)
    val emp3 = Employee("John Smith", PositionTitle.Maintenance, false, 21.00, 3)
    val emp2 = Employee("Larry Jackson", PositionTitle.Production, false, 22.00, 2)
    //val emp4 = Employee("Jeff Cadieux", PositionTitle.Technical, false, 35.50, 3)
    emp1.display()
    emp1.calculate(45.0)
    emp2.display()
    emp2.calculate(50.0)
    emp3.display()
    emp3.calculate(35.0)
    //emp4.display()
    //emp4.calculate(48.0)
}