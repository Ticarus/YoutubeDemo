package com.mycompany.youtubedemo;
//Research this ==> SOLID <== Research this 
//Research this ==> sonar qube <== Research this 
//Research this ==> IoC container <== Research this 
//DRY = Don't Repeat Yourself
//Dal = Data access layer
public class YoutubeDemo {

    public static void main(String[] args) {
        part3();
    }
    
    public static void part1(){
        int num1 = 10;
        int num2 = 20;
        num1 = num2;
        num2 = 100;
        
        System.out.println(num1);
        
        
        int[] nums1 = {1, 2, 3};  //nums1 address is 101 in stack and values are stored at 101 in heap
        int[] nums2 = {10, 20, 30};  //nums2 address is 102 in stack and values are stored at 102 in heap
        nums1 = nums2;  //The address of the nums1 is nums2's values(stack 101 goes to heap 102)
        nums2[0] = 1000;  //Changing the heap 102 value for the elemnt 0 of the array
        
        System.out.println(nums1[0]);  
        //Because arrays are reference type this prints 1000 
    }
    
    public static void part2(){
        CreditManager creditManager = new CreditManager(); //Instance creation
        
        creditManager.Calculate();
        creditManager.Save();
        
        Customer customer = new Customer();  //Instance creation
        
        customer.setId(1);
        customer.setCity("Ankara");
        
        CustomerManager customerManager = new CustomerManager(new Customer(), new PersonCreditManager());  //Instance creation
        
        customerManager.Save();
        customerManager.Delete();
        
        Company company = new Company();
        
        company.setId(1);
        company.setTaxNumber(12345);
        
        Person person = new Person();
        
        person.setId(1);
        person.setNationalIdentity("123456789");
        
        CustomerManager customerManager2 = new CustomerManager(new Company(), new CompanyCreditManager());
    }
    
    public static void part3(){
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());  //This is called dependency injection
    }
}
