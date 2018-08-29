package uts

import org.scalatest.FunSuite

//UNCOMMENT TO CHECK FAILING TEST CASES
// Better to write multiple asserts so as to know where the test cases are failing
case class Date(day: Int, month: Int, year: Int)

class MultipleAsserts extends FunSuite {

  /*val date = Date(20, 4, 2018)

  test("check date") {
    assert(date.year == 2016) //fail
    assert(date.month == 3) //fail
    assert(date.day == 20)
  }


  test("check year") {
    assert(date.year == 2016)
  }
  test("check month") {
    assert(date.month == 3)
  }
  test("check day") {
    assert(date.day == 20)
  }

*/
}
