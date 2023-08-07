package FIRST

object TUT7Q1 {
  

        def main(args:Array[String]){
    
      
        def filterEvenNumbers(numbers:List[Int]) : List[Int] = {
        
        numbers.filter(num => num % 2 == 0)
        
      
      }
     val inputs =  List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
     val outputs = filterEvenNumbers(inputs)
     println("The Even Numbers Are :" + outputs)

        }     
}


//The filter function is a higher-order function in Scala that 
//takes a predicate function as an argument and returns a new collection containing only the elements 
//that satisfy the predicate. In this case, we are using a lambda function to check if the number is even (num % 2 == 0),
//and only the even numbers are kept in the result list.




