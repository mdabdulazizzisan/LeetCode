class Solution {
    fun fizzBuzz(n: Int): List<String> {
        return (1..n).map{ number ->
            when{
                number % 3 == 0 && number % 5 == 0 -> "FizzBuzz"
                number % 3 == 0 -> "Fizz"
                number % 5 == 0 -> "Buzz"
                else -> number.toString()
            }
        }
    }
}