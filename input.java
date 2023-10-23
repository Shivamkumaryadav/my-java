    import java.util.Scanner;

import javax.print.DocFlavor.STRING;
    public class input{
        public static void main(String args[])
        {
            // Scanner sc = new Scanner(System.in); 
            // System.out.println("Enter your name");
            // String name = sc.nextLine();
            // System.out.println(name);
          
            String[][] persons = {
                { "id", "1", "name", "Shivam"},
                { "id", "2", "name", "Arnit"},
                { "id", "3", "name", "Ansh"},
                { "id", "4", "name", "Manoj"},
               
            };
            for(String person[] : persons)
            {
                String idKey = person[0];
                String idValue = person[1];
                String nameKey = person[2];
                String nameValue = person[3];

                System.out.println(idKey + " : " + idValue);
                System.out.println(nameKey + " : " + nameValue);
            }

            // duplicate values
            String[] arr = {"1", "2", "3", "4", "5"};
            String[] arr2 = {"1", "0", "11", "12", "6"};

            int count = 0;
            String duplicateEl = "";
            String item2 ;
            for(String el : arr)
            {
                for(String el2 : arr2)
                {
                    if(el.equals(el2))
                    {
                        count++;
                    }
                }
            }
            
            if(count >= 1)
            {
                System.out.println("duplicate element.");
            }else{
                System.out.println("duplicate element not.");
            }
            System.out.println(count);
            System.out.println(duplicateEl);

            //  // Sample array
            int[] numbers = {5, 12, 45, 9, 27, 15, 62, 3, 18};
            // Single Number: Find the single number in an array where every 
            //element appears twice except for one element that appears only once.
            for(int i = 0; i < numbers.length; i++)
            {
                if(true)
                {

                }
            }


        }
    }