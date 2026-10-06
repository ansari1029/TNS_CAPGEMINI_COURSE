package TNS;

public class StrComparisionExample {

    public static void main(String[] args) {
        String s1 = "Asad";
        String s2 = "Asad";
        String s3 = new String("Asad");
        String s4 = new String("Asad");

        System.out.println((s1==s2));  //(true) same memory address (String constant Pool locate to same memory because value is same)
        System.out.println((s2==s3));  //(true) Different Memory (Constant String Pool -> Heap Memory)
        System.out.println((s3==s4));  //(false) (because the string with new keyword points at different heap memory even if value is same)
        System.out.println("Using equal() method to compare by value :"+s1.equals(s2));
      }

}
