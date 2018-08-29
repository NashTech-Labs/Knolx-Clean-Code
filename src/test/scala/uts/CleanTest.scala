package uts

import org.scalatest.FunSuite

case class EmployeeUpdated(name: String, age: Int, salary: Int)

class CleanTest extends FunSuite {

  /**
    * You can read the test very quickly without being overwhelmed by details.
    */

  test("check if there is an employee with salary 15000") {

    val empList = ExtraCode2.getEmployees()                     // BUILD

    val result = ExtraCode2.checkEmployeeSalary(empList)            //OPERATE

    assert(result)                                     //CHECK
  }
}


object ExtraCode2 {

  def getEmployees(): List[EmployeeUpdated] = {
    val emp1 = EmployeeUpdated("Name1", 22, 10000)
    val emp2 = EmployeeUpdated("Name2", 23, 15000) //change this to fail
    val emp3 = EmployeeUpdated("Name3", 24, 30000)
    List(emp1, emp2, emp3)
  }

  def checkEmployeeSalary(empList: List[EmployeeUpdated]) = {
    if (empList.map { emp => checkSalary(emp) }.contains(true)) {
      true
    } else {
      false
    }
  }

  def checkSalary(emp: EmployeeUpdated) = {
    if (emp.salary == 15000) {
      true
    } else {
      false
    }
  }


}
