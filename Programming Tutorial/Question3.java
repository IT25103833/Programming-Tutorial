
class EvenOddNumber {

 
    public boolean findEvenOrOdd(int i) {
        if (i % 2 == 0) {
            return true;  
        } else {
            return false; 
        }
    }
}


public class Question3 {
    public static void main(String[] args) {
        
        
        EvenOddNumber checker = new EvenOddNumber();
        
        int testNumber = 7; 
        
        
        boolean isEven = checker.findEvenOrOdd(testNumber);
        
        if (isEven) {
            System.out.println(testNumber + " is an even number.");
        } else {
            System.out.println(testNumber + " is an odd number.");
        }
    }
}