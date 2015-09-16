/**
*  Demonstrates interactions with an OOPResource class
*
*  While every class in Java could technically specify its own "main()" method, and thus 
*  serve as its own runnable application, this is seldom done in practice.  Instead, OOP 
*  classes are designed to accommodate the SINGLE RESPONSIBILITY PRINCIPLE (SRP).
*
*  The SRP holds that each class in an application should be narrowly aligned with only
*  piece of overall functionality -- a class representing a resource should not also be 
*  responsible for creating and manipulating instances of itself.
*/

public class OOPTester {

  // Typically, no properties
  // Typically, no constructors
  
  public static void main(String[] args) {
    OOPResource resource = new OOPResource();
    
    // Correctly access data in the resource
    String s = resource.getSampleString();
    
    // Correctly store data in the resource
    s.setSampleString("New Value");
    
    // Incorrect -- should fail due to data encapsulation
    resource.sampleString = "New Value";
  }
}
