package uts

import org.scalatest.FunSuite


case class Employee(name: String, age: Int, salary: Int)

/**
  * PROBLEMS :
  * 1) Too much code in test part
  * 2) Not following the Build-Operate-Check rule
  */

class NotSoCleanTest extends FunSuite {


  test("check if there is an employee with salary 15000") {

    val emp1 = Employee("Name1", 22, 10000)
    val emp2 = Employee("Name2", 23, 15000) //change this value to fail
    val emp3 = Employee("Name3", 24, 30000)
    val employees = List(emp1, emp2, emp3)

    val checkEligibility = employees.map { emp =>
      ExtraCode.checkSalary(emp)
    }

    assert(checkEligibility.contains(true) == true) //operating and checking being mixed //also comparing boolean with true


  }
}

object ExtraCode {

  def checkSalary(emp: Employee) = {
    if (emp.salary == 15000) {
      true
    } else {
      false
    }
  }

}