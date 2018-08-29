package formatting

//line length
case class Employee(name: String, age: Int, employeeId: Int, address: String, contactNumber: Int, salary: Int, familyDetails: String, experience: Int, maritalStatus: String, bloodGroup: String, position: String,familyInfo:String,otherDetails:String,bonus:Int)

case class EmployeeDetails(name: String, age: Int, employeeId: Int, address: String,
                           salary: Int, contactNumber: Int, familyDetails: String,
                           experience: Int, position: String, bloodGroup: String,
                           maritalStatus: String, familyInfo:String)


class HorizontalFormatting {
  val demoString = " Hi all!!"

  def employeeEligibilty = {
    val emp = "something"
    val num1 = 5
    val num2 = 4
    val sum = num1 + num2 //spacing

    //indentation
    if (emp == "something" || sum == 9)
        {
          true
        }
    else
        {
          false
        }
  }
}