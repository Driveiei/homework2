# homework2
4.1 Explain why this function is so slow, even for fairly small values of n (like n=45 or n=50).
Write your explanation in README.md in your repository.
Ans. It's slow because its occur too many recursion. In the this method, 
use 2 recursion in one time like if the user called fibonacci(45), 
it will called fibonacci(42) for 3 times.
More number, more duplicate a lot of stack recursion.