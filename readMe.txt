Run project
-select values for run in form
-Sit back and watch the knight dance

--Error Page
--Loads error msg and uploads it to page for user to see and diagnose
--Also no longer shows info from project in default error page

--index
method choice radios
position radios
iteration#<number limited 1-10> doesnt work properly in Int.Exp (doesnt limit input to numbers)
submit

-basic description
1.)knight object
-can store position
-moves done stored in list
-hueristic chess board array //could have 
-Array to store places the knight has been to

canMoveX()
-Scan for available moves based on position and 
where it doesnt go off chess board or it has been before

availableMoves()
load moves to list based on canMove()Methods


-Non-intelligent Method dumbMove()
-loads which moves it can complete 
-randomly selects move based on available moves
-sets new position

hueristic method smartMove()
-loads available moves on position 
-finds out heuristic values of moves it can do
-finds lowest heuristic values of those moves
-randomly choses between the lowest values

Index form sends values for the number of iterations 
starting position and smart or dumb method

run selected method with selected parameters

printwriter outputs based on parameters

--Wasnt sure what exactly you wanted with the output if you wanted the trial results then the arrays of moves or trialX then movesX then trialX+1.....
--i thought it looked nice with the trial results then the array on the next line

test results are loaded to list to be loaded to txt file

--i cant seem to get my program to create the text files i tried methods which i used in Java2 i dont know where im going wrong here
-i tried creating it in the servlet and creating a method to create and write to files in my knight class
the results are saved in a list which could easily be output to a file i know