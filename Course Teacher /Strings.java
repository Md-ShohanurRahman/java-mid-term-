public class Strings
{
	public static void main(String[] args)
	{
		String g1 = new String("Hello");
		String g2 = "Hello";
		
		System.out.println(g1 + g2);
		
		int age = 20;
		String message = "I am " + age + " years old";
		System.out.println(message);
		
		
		
        String text = "Hello, World!";
        
        System.out.println("Length of the string: " + text.length());
        System.out.println("Character at index 7: " + text.charAt(7));
        
        String anotherText = "Hello, World!";
		
        System.out.println("Are the strings equal? " + text.equals(anotherText));
		
        String text2 = "Hello, Universe!";
		
        System.out.println("Comparison result: " + text.compareTo(text2)); 
        System.out.println("Index of 'W': " + text.indexOf('W'));
        System.out.println("Index of 'World': " + text.indexOf("World"));
        System.out.println("Substring from index 7: " + text.substring(7));
        System.out.println("Substring from index 0 to 5: " + text.substring(0, 5));
        System.out.println("Uppercase: " + text.toUpperCase()); 
        System.out.println("Lowercase: " + text.toLowerCase());
	}
}
