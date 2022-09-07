import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner reader = new Scanner(System.in); 
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(3, 80);

        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.remove(0));
        System.out.println(list);
        list.remove(Integer.valueOf(30));
        System.out.println(list);
        

        ArrayList<String> memory = new ArrayList<String>(); 
         
        while(true) 
        { 
            memory.add(reader.nextLine()); 
            System.out.println(memory.toString()); 
        } 
    } 

        
    }

