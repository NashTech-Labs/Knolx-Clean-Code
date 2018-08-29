package classes

class Book {

  def getTitle() = {
    "A Great Book"
  }

  def getAuthor() = {
    "John Doe"
  }

  def getCurrentPage() = {
    "current page content"
  }

  def save() = {
    //logic for saving the book
    "book saved"
  }

}

/**
  * The main issue with above code:  performs 2 operations : gives info of book and saves book :
  * can be divided  into 2
  */

//responsible for getting book details
class BookDetails {

  def getTitle() = {
    "A Great Book"
  }

  def getAuthor() = {
    "John Doe"
  }

  def getCurrentPage() = {
    "current page content"
  }
}

//responsible for saving the book
class SimpleBookPersistence {

  def save() = {
    //logic for saving the book
    "book saved"
  }

}