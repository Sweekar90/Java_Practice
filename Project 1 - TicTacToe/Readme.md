This is the first programming task of Udacity's "Introduction to Java Programming" tutorials.

The goal of the task is to update the method "checkGameWinner()" in the class "Game()". We need to program the logic that detects whether the player who marks "X" wins or "O" wins or the game is a "Tie".

## My Experience

### Logic
There are 9 boxes in the form of 3 * 3 matrix. Hence we need a 2-D array
For a "WIN" there are 8 cases:

Row Cases <br />
1. a[0][0] = a[0][1] = a[0][2] <br />
2. a[1][0] = a[1][1] = a[1][2] <br />
3. a[2][0] = a[2][1] = a[2][2] <br />

Column Cases <br />
4. a[0][0] = a[1][0] = a[2][0] <br />
5. a[0][1] = a[1][1] = a[2][1] <br />
6. a[0][2] = a[1][2] = a[2][2] <br />

Diagonal Cases <br />
7. a[0][0] = a[1][1] = a[2][2] <br />
8. a[0][2] = a[1][1] = a[2][0] <br />

A case of "TIE" is resulted when all the 9 boxes got filled with none of the above 8 cases being satisfied.

I initially started by having 2 for loops : one to cover the row cases and another to cover the column cases (along with the if condition), followed by the two if conditions to cover the diagonal case. If none of these satisfied then I would return "Tie" status.
But this logic of mine was not an intelligent and optimized one. Since, the logic gave the result as "Win" or "Tie" once all the boxes were scanned.
Hence I referred Google and the following link according me helped me in arriving at the good possible solution.

https://github.com/Gia12345/Java-practice-projects-and-reference/blob/master/Tic%20Tac%20Toe%20Solution%20from%20Udacity%20exercise

