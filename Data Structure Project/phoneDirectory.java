package packA;
import java.util.*;

public class phoneDirectory{
	
	public static class Node{
		String name , number;
		Node next;
		Node(String name, String number){
			this.name=name;
			this.number=number;
			next=null;
		}
    }
	
	Node head;
	 
	void add_Contact(String name, String number){
			Node newNode = new Node(name,number);
			Node temp = head;
			if(head == null){
				head = newNode;
			}
			else{
				while(temp.next!=null){
					temp=temp.next;
				}
				temp.next= newNode;
			}
			System.out.println("\t\t\t"+newNode.number+" & "+newNode.name+" added successfully....!");
	}
	
	void display (){
		int i =0;
		Node temp = head ;
		if(temp ==null){
			System.out.println("\t\t\tContact list is Empty ");
		}
		else{
			while (temp != null){
				
				System.out.println("\t\t\tFull Name : "+temp.name);
				System.out.println("\t\t\tPhone Number: "+temp.number);
	
				temp = temp.next;
				i++;
			}
			System.out.println("\t\t\tTotal contacts in the list = "+i);
			
		}
	}
	
	void search_By_Number(String data){
		Node temp = head;
		int count = 1;
		while(temp!=null && !(temp.number.equals(data))){
				count++;
				temp = temp.next;
		}
		if(temp==null)
			System.out.println("\t\t\t"+data+" Not found");
		else
			System.out.println("\t\t\tContact found at "+count+".Name: "+temp.name+" Number : "+temp.number);
			
	}
	
	void search_By_Name(String data){
		Node temp = head;
		int count =1;
		while(temp!=null && !(temp.name.equals(data))){
			count++;
			temp = temp.next;
		}
		if(temp==null)
			System.out.println("\t\t\t"+data+" Not found...!");
		else
			System.out.println("\t\t\tContact found at "+count+".Name: "+temp.name+" Number : "+temp.number);
	}
	
	void edit_Contact(String name, String number){
		Node temp = head;
		while(temp!=null && !(temp.name.equals(name))){
			temp=temp.next;
		}
		if(temp==null)
			System.out.println("\t\t\t"+name+" not found...!");
		else{		
			temp.number = number;
			System.out.println("\t\t\t"+name+" --> "+number+" updated successfully...!");
		}
	}
	
	void delete_Contact(String data){
		Node temp = head;
		Node n = null;
		 if (temp != null && (temp.number.equals(data) || temp.name.equals(data))){
            head = temp.next;
			System.out.println("\t\t\t Contact "+data+" deleted successfully..!");
            return;
		}
		while(temp.next!=null && (!temp.name.equals(data) || !(temp.number.equals(data)))){
			n = temp;
			temp = temp.next;
		}
		if(temp==null)
			System.out.println("\t\t\t Contact not found...!");
		else{
			if(temp.next==null)
				n.next=null;
			else{
			n.next=temp.next;
			System.out.println("\t\t\t Contact "+data+" deleted successfully...!");
			}
		}
	}
	
	void clear_all(){
		if(head == null){
			System.out.println("\t\t\tList is Empty...! ");
		}
		else{
			while (head != null){
				head = head.next;
			  
			}
			System.out.println("\t\t\tALL contact list has been deleted ...!");
		}
	}
	
	static boolean check_Number(String check_number){
		String validate_regex = "(91)?[7-9][0-9]{9}";
		boolean matched=check_number.matches(validate_regex);
		if(matched)
			return true;
		else
			return false;
	}
	
}	