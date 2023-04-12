public class CharToInt {
    public static void main(String[] args) {
        char myChar = '9';
        //int myInt = Integer.parseInt(String.valueOf(myChar));
        //System.out.println("integer value: " + myInt);
        int myInt =(Character.getNumericValue(myChar));
        System.out.println("integer value: " + myInt);
        // чтобы не создавать два класса,просто прокомментировал первый алгоритм
    }
}
