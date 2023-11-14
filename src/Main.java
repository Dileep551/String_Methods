// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        printInformation("Hello world");
        printInformation("");
        printInformation("\t \n");

        String helloworld = "Hello World";
        System.out.printf("index of r = %d %n", helloworld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloworld.indexOf("World"));




        }

        public static void printInformation(String string){

        int length = string.length();

            System.out.printf("Length = %d %n", length);

            if(string.isEmpty()){
                System.out.println("String is Empty");
                return;
            }
            if(string.isBlank()){
                System.out.println("String is Blank");
            }
            System.out.printf("First char = %c %n", string.charAt(0));

            System.out.printf("Latst char = %c %n", string.charAt(length - 1));

        }
    }