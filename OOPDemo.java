/**
* Demonstrates interactions with an OOP object class
*
* While every class in Java could potentially specify its own "main()" method, 
* and thus serve as its own runnable application, this is seldom done in 
* practice.  Instead, classes are encouraged to adhere to the SINGLE 
* RESPONSIBILITY PRINCIPLE (SRP).
*
* The SRP holds that each class in an application should be narrowly aligned 
* with a single piece of overall functionality -- a class representing a 
* resource should not also be responsible for creating and manipulating 
* instances of itself, presenting them to the screen, etc.
* 
* Classes that use/test objects are loosely referred to as "driver" classes
*/

public class OOPDemo {

  // Typically, no properties
  // Typically, no constructors
  
  public static void main(String[] args) {
    OOPObject object = new OOPObject();
    
    // Correctly access data in the resource
    String s = object.getSampleString();
    
    // Correctly update data in the resource
    object.setSampleString("New Value");
    
    // Incorrect update -- should fail due to data encapsulation
    object.sampleString = "New Value";
  }
}
