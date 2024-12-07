# isIdentical-Problem
This repository is made to assist people with similiar problems and provide a solution!

Here is the "isIdential Problem":

For this program you will read a file duplicate.txt that has on the first line the numbers of words in each list and followed by two lists of words side by side. your job is to determine if the two lists are identical

example of duplicate.txt:

5
hi hey
Yo momma
momma Yo
hello there
there hi

Make a method isIDentical which takes the two arrays and determines if they have the same words, but perhaps in a different order, this method should use a for loop to traverse each word in one array and call the method isInArray to check if the word is in the second array

The isInArray to method should accept a word and an array. the method will return true if the word is the array and false if note


**Import Notes:**

This solution assumes the lists contain the same number of words. If the lengths differ, we would need to handle that case as well.


The isInArray method checks for exact matches, so it is case-sensitive. If case-insensitivity is needed, you can modify the comparison to word.equalsIgnoreCase(s) instead of word.equals(s).
