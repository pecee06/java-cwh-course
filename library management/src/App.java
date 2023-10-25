class Library{
    // Library variables
    int libCapacity = 10;
    String libBooks[] = new String[libCapacity];
    String book;
    String rackName;
    int bookIndex = 0;
    boolean bookAvailable;

    // Constructor
    Library(String rackName){
        this.rackName = rackName;
    }

    // Methods
    void addBook(String book){
        this.book = book;
        if (bookIndex<libCapacity){
            libBooks[bookIndex] = book;
            bookIndex++;
        }
        else{
            System.out.println(rackName+"' rack is full");
        }
    }

    void issueBook(String book,String borrower){
        for (int i=0; i<libCapacity; i++){
            if (libBooks[i] == book){
                this.bookAvailable = true;
                libBooks[i] = null;
                break;
            }
            else{
                this.bookAvailable = false;
            }
        }

        if (bookAvailable){
            System.out.println(book+" is issued to "+borrower);
        }
        else{
            System.out.println("Book ain't available");
            System.out.printf("Sorry %s :(\n",borrower);
        }
    }

    void returnBook(String book){
        for (int i=0; i<libCapacity; i++){
            if (libBooks[i] == null){
                libBooks[i] = book;
                System.out.println("Thanks for returning "+book);
                System.out.println("Have a nice day :)");
                break;
            }
            else{
                System.out.println(book+" ain't issued from this library");
            }
        }
        
    }

    void showAvailableBooks(){
        for (String book : libBooks) {
            if (book!=null){
                System.out.println("* "+book);
            }
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Library rack1 = new Library("Programming Languages");
        rack1.addBook("Python");
        rack1.addBook("Java");
        rack1.addBook("JavaScript");

        rack1.issueBook("Java","Priyanshu");
        rack1.issueBook("Python","Kumar");

        rack1.issueBook("C#","Harry");
        rack1.returnBook("C#"); // That's a bug

        rack1.issueBook("Java","Payal");
        rack1.returnBook("Java");
        rack1.issueBook("Java","Payal");

        rack1.returnBook("Python");
        rack1.showAvailableBooks();

        rack1.issueBook("JavaScript","Tushar");
        
        rack1.addBook("Ruby");
        rack1.showAvailableBooks();
    }
}
