package comments

import java.io.IOException

class ExtraComments {

  case class Employee(flags:Boolean,age:Int)

    //creating employee
    val employee = Employee(true,50)
    //creating a flag and setting it to true
    val HOURLY_FLAG = true


    // Check to see if the employee is eligible for full benefits only if conditions are true
    if ((employee.flags & HOURLY_FLAG) &&
      (employee.age > 65)){

    }

  /**
    * can be written as ::::::::
    */

     if (isEligibleForFullBenefits(employee)){
      }

        def isEligibleForFullBenefits(employee: Employee): Boolean ={
          if ((employee.flags & HOURLY_FLAG) &&
            (employee.age > 65)){
          }
          true
        }

  }


class MisleadingComments {

  //Always Returns True

  def isAvailable: Boolean = {
    false
  }

}



class ClosedBracesComments {
  val line:  String ="hi"
  var charCount = 0
  var wordCount = 0
  try {
    while (line != null) {

      charCount += line.length()
      val split: Array[String] = line.split("\\W")
      wordCount += split.length

    }
    //while ends here
  }
  // try ends here
  catch {
    case e:IOException=>  println("Error:" + e.getMessage())
  }
  //catch ends here

}
//main ends here


