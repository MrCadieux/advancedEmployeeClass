import java.time.LocalDate
import java.text.DecimalFormat

class Employee constructor(name: String,
                           position: PositionTitle,
                           salary: Boolean,
                           payRate: Double,
                           shift: Int,
                           startDate: LocalDate = LocalDate.now()) {
    var weeklyPay = 0.0
    val dollarAmount = DecimalFormat("#,###.00")
    var name: String = name
        get() = field
        set(value) {
            field = value
        }
    var position: PositionTitle = position
        get() = field
        set(value) {
            field = value
        }
    var salary: Boolean = salary
        get() = field
        set(value) {
            field = value
        }
    var payRate: Double = payRate
        get() = field
        set(value) {
            field = value
        }
    var shift: Int = shift
        get() = field
        set(value) {
            field = value
        }
    var startDate: LocalDate = startDate
        get() = field
        set(value) {
            field = value
        }

    init{
        println("New Employee Added: $name")
    }
// Print out all information for the employee
    fun display(){
        var formattedPayRate: String =""
        formattedPayRate=dollarAmount.format(payRate)

        println("$name")
        println("$position is salary: $salary shift: $shift")
        println("Rate of pay is: $$formattedPayRate per hour")
    }
// calculate employees pay using hours for the week
    fun calculate(hoursIn: Double){
        var formattedweeklyPay: String =""

//Check for shift payrate
        if (shift == 2)
            payRate = 0.05 * payRate + payRate
        else if (shift == 3)
            payRate = 0.10 * payRate + payRate

//Check for overtime
        var overTimeHours: Double

        if (salary==true){
    //Calculate the weekly pay for each employee
            weeklyPay = (payRate*hoursIn)
            formattedweeklyPay=dollarAmount.format(weeklyPay)
        }
        else if (hoursIn>40) {
            val overTimeRate =1.5*payRate
            overTimeHours = hoursIn - 40.0
    //Calculate the weekly pay for each employee
            weeklyPay = (payRate*40) + (overTimeHours*overTimeRate)
            formattedweeklyPay=dollarAmount.format(weeklyPay)
        }
        else {
            weeklyPay = (payRate*hoursIn)
            formattedweeklyPay=dollarAmount.format(weeklyPay)
        }


        println("$name earned $$formattedweeklyPay this week\n")
    }

}