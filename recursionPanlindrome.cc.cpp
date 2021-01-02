/*
Recursion Palindrome

The purpose of program: The program will prompt the user to input numbers and words
to see if they are palindrome or not.
The basic idea of palindrome is to check to see if its first and last characters
of the string matches.
The punctuation and spaces won't count, and capital letters are the same as lower case.
The program will stop if the user enters *
The message will let the user know if the input is a palindrome or not.
*/

#include <iostream>
#include <string>
#include <cstring>
#include <cctype>
using namespace std;
//function prototype
string cleanString (string);
bool isPalindrome(string);

int main()
{
    string userInput; //user input
    do
    {
        cout << "Enter numbers or a word. Press * to stop" << endl;
        getline(cin,userInput); // This getline will count in white spaces

        if(userInput=="*") //if the user enters a single asterisk, then the program will stop
        {
            cout << "Program stopping" << endl;
            exit(0); // exit function
        }
        string goodStr=cleanString(userInput);// cleaning string function call before isPalindrome call
        cout << "The string you entered is " << goodStr << endl; // display strings
        if(isPalindrome(goodStr))// isPalindrome function call
        {
            cout << "Yes, it is a palindrome" << endl;
        }
        else // if the input is not a palindrome
        {
            cout << "No. It is not a palindrome" << endl;
        }
    }
    while(userInput!="*");  //loops as long as the input is not a single *

    return 0;
}
string cleanString(string userInput) // cleaning string function that cleans string
{
    int index;
    string goodStr="";// new string is initialized with empty strings
    //looping over the string letter by letter
    for (index=0; index<userInput.length(); index++)
    {
        /*This loop checks to see if the character in the string is a letter or a number.
        If it is a letter or number, then it adds it to the good string. By the end of the
        for loop, the good string has all the letters and numbers from the original string,
        and none of the spaces or punctuation is included
        */
        if(isalnum(userInput[index]))// if the letter(an element) contains an alphabet or a number
        {//every good string index is added to the good string variable
            goodStr+=toupper(userInput[index]); // if the lower case is used, then it will be converted to upper case
                                                // uppercase is equal to the lowercase
        }

    }

    return goodStr; // returns a good string
}
bool isPalindrome(string goodStr)// This function determines if the string is palindrome or not
{
// the good string from the clean string function is passed to this function
    if(goodStr.length()==0 || goodStr.length()==1)// base check
    {
        return true;
    }
    // if the first letter and the last letter of the string matches
    if(isalnum(goodStr[0])== isalnum(goodStr[goodStr.length()-1]))
    {
        return isPalindrome(goodStr.substr(1,goodStr.length()-2)); // function is calling itself

    }
    else  // returns false if the first and last character did not much
    {

        return false;
    }

    return true; //otherwise, return true
}




