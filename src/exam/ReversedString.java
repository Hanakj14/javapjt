package exam;

public class ReversedString {

	public static void main(String[] args) {
               String str = "appus"; 
        
        
        String reversed = ""; 
        
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i); 
        }
        
        
        System.out.println("Reversed string: " + reversed);
		}

	}


