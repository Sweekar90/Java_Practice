This is the first attempt to understand the tic toe game in Java.

The goal of the task is to create a game of Tic Tac Toe on Intelli J.

##Logic
There are 9 boxes in the form of 3 * 3 matrix. Hence we need a 2-D array For a "WIN" there are 8 cases:

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

I covered all the 8 cases by having 2 for loops : one to cover the row cases and another to cover the column cases (along with the if condition), followed by the two if conditions to cover the diagonal case. 
I also referred to the following video for help.

https://www.youtube.com/watch?v=R51BIlAt_Hg&t=610s
