public class App {
    public static void main(String[] args) throws Exception {
        // 2 ways to define strings
        // ------------------------

        // String first_name = new String("Priyanshu");
        // String last_name = "Choudhury";
        // System.out.println(first_name+" "+last_name);

        // last_name = "Pandey";   // In here last_name is updated, but in the memory where it is stored hasn't really updated
        // Actually a copy is created whose value is assigned and the pointer points toward the new copy
        // System.out.println(last_name);

        // Corolary to f-strings in Python
        // -------------------------------

        // String name = "Monu Singh";
        // int age = 27;
        // System.out.printf("%s is %d years old",name,age);
        // System.out.println();
        // System.out.format("%s's age is %d",name,age);
        // Both methods do the exact same thing

        // String methods
        // --------------

        // String computer = "This is Lenovo Ideapad";
        // int computer_len = computer.length();    // #1
        // System.out.println(computer_len);

        // String computer_lower = computer.toLowerCase();  // #2
        // String computer_upper = computer.toUpperCase();  // #3
        // System.out.println(computer_lower);
        // System.out.println(computer_upper);

        // String unneccessary_spaces = "  Hello World ";
        // String without_unneccessary_spaces = unneccessary_spaces.trim();    // #4
        // System.out.println(unneccessary_spaces);
        // System.out.println(without_unneccessary_spaces);

        // String text = "Good morning";
        // Strings are internally indexed from left to right
        // Indexing begins with 0

        // String partOfText = text.substring(2,7); // #5
        // If end-index isn't provided, it will take all the characters from start-index
        // In here 2 is included but 7 is excluded, which means the last character of new string will be the character, indexed 6 in the original string
        // System.out.println(text);
        // System.out.println(partOfText);

        // String str = "Harry";
        // String str1 = str.replace('r', 'p');   // #6
        // It takes oldChar,newChar as input

        // String str2 = str.replace("Ha", "Cu");
        // It takes oldString,newString as input

        // It replaces the character at each occurence
        // System.out.println(str1);
        // System.out.println(str2);

        // System.out.println(first_name.startsWith("P")); // prefix is case sensitive
        // Returns true or false
        // System.out.println(first_name.startsWith("Priy")); // #7
        // System.out.println(first_name.startsWith("c"));

        // System.out.println(first_name.endsWith("u"));   // suffix is case sensitive
        // System.out.println(first_name.endsWith("shu")); // #8
        // System.out.println(first_name.endsWith("ABCD"));

        // String str3 = "This is Java program";
        // char str3_8 = str3.charAt(8);   // #9
        // Returns the character at 8th index
        // System.out.println(str3_8);

        // System.out.println(str3.indexOf("a"));   // #10
        // System.out.println(str3.indexOf("is"));
        // Returns the index of first occurence of that string

        // fromIndex can also be passed as an argument, which basically specifies Java to look for a particular string after a certain index only and ignoring whatsoever before it
        // System.out.println(str3.indexOf("is",4));

        // System.out.println(str3.indexOf("y"));
        // In case passed string is not in original string, then -1 is returned

        // System.out.println(str3.lastIndexOf("is")); // #11
        // Returns the index of last occurence of that string
        
        // System.out.println(str3.lastIndexOf("Java",5));
        // In here fromIndex specifies, till which index the passed string should be looked for

        // String lang = "java";
        // System.out.println(lang.equals("python"));  // #12
        // It checks whether a string is equal to some other string
        // System.out.println(lang.equals("java"));
        // System.out.println(lang.equals("Java"));
        // Returns true or false

        // System.out.println(lang.equalsIgnoreCase("jAvA"));  // #13
        // It works the same way as equals(), but ignores case-sensitivity
    }
}

// Strings are immutable

// The mutable objects are objects whose value can be changed after initialization. We can change the object's values, such as field and states, after the object is created. When we made a change in existing mutable objects, no new object will be created; instead, it will alter the value of the existing object. These object's classes provide methods to make changes in it.
// The Getters and Setters ( get() and set() methods ) are available in mutable objects.

// The immutable objects are objects whose value can not be changed after initialization. We can not change anything once the object is created. In a nutshell, immutable means unmodified or unchangeable. Once the immutable objects are created, its object values and state can not be changed.
// Only Getters ( get() method) are available not Setters ( set() method) for immutable objects.