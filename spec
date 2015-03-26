Computer Programming I			 	    			Instructor: Greg Shaw
COP 2210							    


	Programming Assignment #5

(Decision-Making and boolean Type)


Implement a combination lock class. A combination lock has a dial with 26 positions labeled A..Z.  The dial needs to be set 3 times. If it is set to the correct combination, the lock can be opened. When the lock is closed again, the combination can be entered again.

Here is the skeleton of the CombinationLock class that you are to use.  You will add the instance variable declarations and write the method bodies.  

To earn credit for this assignment you must not add any additional methods or modify the method declarations in any way!

public class CombinationLock
{
    // instance variable declarations go here
 
  /**
    *	Creates a lock with a given combination consisting of three upper-case characters.
    *  	@param first the first letter of the combination
    *  	@param second the second letter of the combination
    *	@param third the third letter of the combination
    */
   public CombinationLock(String first, String second, String third)
   {
      ...
   }

   /**
    *	Set the dial to a position
    *  	@param aPosition a String consisting of a single uppercase letter (A..Z)
    */
   public void setPosition(String aPosition)
   {
   	...
   }

   
  /**
    *     Try opening the lock
    */
   public void tryToOpen()
   {
      ...
   }

   /**
    *	 Check whether the lock is open
    * 	 @return true or false indicating whether the lock is open
    */
   public boolean isOpen()
   {
      ...
   }

   /**
     *      Close the lock and print a message indicating that the lock is now closed
     */
   public void lock()
   {
      ...
   }
}

Also write a test class that does the following:

Create a combination lock with a given combination entered by the user
Have the user enter an invalid combination
Try to open the lock
Print a message indicating whether the lock is open or closed (NOTE: you must use the value returned by method isOpen to determine what to print)
Have the user enter the correct combination, and repeat steps 3. and 4.
Close the lock
Have the user enter another invalid combination, and repeat steps 3. and 4.
Have the user enter the correct combination, and repeat steps 3. and 4.
Close the lock

Make sure your main method also prints out the original combination when the lock is created and the 3 combinations entered by the user in attempting to open it.  This is known as “echo printing” the inputs and is always a good idea because

It lets the user associate the output with the input that produced it
It lets you see whether the inputs were stored correctly
Use this data in the run you hand in:

Original combination (step 1 on previous page):   F I U
First invalid combination (step 2):  U S F
Correct combination (step 5):  F I U
Second invalid combination (step 7):  F A U
Correct combination (step 8):  F I U

Additional specifications and hints:

The CombinationLock class must have a boolean instance variable called open that stores the state of the lock (true if open, false if closed). Don't forget to initialize it in the constructor.

Method setPosition accepts only a single letter as a parameter and turns the dial to that position, so it must be called three times!  Therefore, your lock class will need a "counter" that keeps track of whether the position entered is the first, second, or third.

Method tryToOpen does not return a value and does no output. It checks to see whether the combination entered is the right one and, if so, sets instance variable open to true

You may implement the counter as either an int instance variable or as an object of the Counter class, online.  To use the Counter class, do this:

Download the file Counter.java and store it in the src folder of your project
Declare an instance variable of class Counter (just like declaring an instance variable of class String)
Create the Counter object in the CombinationLock constructor.

Recall that we cannot use relational operator “==” to test Strings for equality (only primitives).  Instead, we use the equals method of the String class.  E.g., if s1 and s2 are two String objects then the method call

	s1.equals(s2)

returns true if the two Strings are equal (i.e., contain the exact same sequence of characters), and false otherwise


Due date:	Thursday, October 23rd


Upload a zip file containing both Java classes and the output
