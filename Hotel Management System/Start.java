import Entity.*;
import EntityList.*;
import Interface.*;

import GUI.*;

import java.lang.*;
import java.time.LocalDate;           

public class Start{
    public static void main(String[] args) {
		
		Employee empObj1 = new Employee("Ayon", 25,"01629204343","12345", 60000);
		Employee empObj2 = new Employee("Fairoz", 23,"01664713489","13698", 50000);
		Employee empObj3 = new Employee("Prolhad", 24,"0162574364","17412", 30000);
		Employee empObj4 = new Employee("Sujon", 25,"016253149","96352", 10000);
		
		
		Customer cusObj1 = new Customer("Nihan", 35,"01693655",
										"12345",10);
		Customer cusObj2 = new Customer("Shamanta", 25,"016944545",
										"54321",9);
		Customer cusObj3 = new Customer("Rahat", 35,"01654654115",
										"43215",8);
		Customer cusObj4 = new Customer("Mili", 31,"01645464615",
										"42586",7);


        Room roomObj1 = new Room("1234","President","Room is Booked",20000);
        Room roomObj2 = new Room("3698","VVIP","Available",15000);
        Room roomObj3 = new Room("4321","VIP","Room is Booked",7000);
        Room roomObj4 = new Room("8521","Normal","Available",2000);
		Room roomObj5 = new Room("8521","Deluxe","Available",20000);
		
		
		EmployeeList emplist = new EmployeeList();
		CustomerList cuslist = new CustomerList();
		RoomList roomlist = new RoomList();
		
		
		emplist.insert(empObj1);
		emplist.insert(empObj2);
		emplist.insert(empObj3);
		emplist.insert(empObj4);
		
		cuslist.insert(cusObj1);
		cuslist.insert(cusObj2);
		cuslist.insert(cusObj3);
		cuslist.insert(cusObj4);
		
		roomlist.insert(roomObj1);
		roomlist.insert(roomObj2);
		roomlist.insert(roomObj3);
		roomlist.insert(roomObj4);
		roomlist.insert(roomObj5);
		
		
		
		
		emplist.showAll();
        cuslist.showAll();
        roomlist.showAll();
		
		
		Login login = new Login(emplist, cuslist, roomlist);
		
		
		
    }
}
