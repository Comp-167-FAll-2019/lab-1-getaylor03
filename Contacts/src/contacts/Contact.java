/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author getaylor
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    public String Contact(){
        return getFirstName() + " " + getLastName() + " " + getPhoneNumber() + " " + getEmailAddress();
      
    }
        //setting and getting the names for the contacts
   
     //return the firstName
    
    public String getFirstName() {
        return firstName;
    }

    
   //set first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   
    //return the last Name
    
    public String getLastName() {
        return lastName;
    }

   
    //set last name
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
     //return the phone number
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

   
    //set phone number
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

 
    //return the email address
   
    public String getEmailAddress() {
        return emailAddress;
    }

    //set email addresss
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    
}
