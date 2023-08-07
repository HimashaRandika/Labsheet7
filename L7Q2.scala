package FIRST

object TUT7Q2 {
     
  
         def main(args:Array[String]){
           
           
           def calculateSquare(numbers:List[Int])= {
             
             numbers.map(num=>num*num)
           }
           
           
           val inputs = List(1, 2, 3, 4, 5)
           val outputs = calculateSquare(inputs)
           println("Squares Are : " + outputs)
         }
         
    }
//The map function is another higher-order function in Scala that takes a transformation function as an argument and returns 
//a new collection resulting from applying the function to each element of the original collection. In this case, we are using a lambda function to calculate the 
//square of each number (num * num) in the input list, and the result is a new list containing the squares of the numbers in the same order.
       