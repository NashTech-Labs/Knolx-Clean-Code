package formatting

//unwanted comments increasing size of file
abstract class VerticalFormatting {
  val value: Int
  val value2: Int

  /*
  calculates value
   */
  def calculateValue()

  /*
  calculates sum
   */
  def computeSum(num1: Int, num2: Int) = {
    num1 + num2
  }
}

object relatedObject {

  case class Employee(age: Int, name: String, salary: Int)

  def calculateSalary(employee: Employee): Int = {
    employee.salary
  }

  def callMethod() = {
    calculateSalary(Employee(10, "anything", 10000))
  }
  //methods seperated by blanks + dependent functions close

}
