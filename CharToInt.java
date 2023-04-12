public class CharToInt {
    public static void main(String[] args) {
        char u = '9';
        //int myInt = Integer.parseInt(String.valueOf(myChar));
        //System.out.println("integer value: " + myInt);
        int myInt =(Character.getNumericValue(u));
        System.out.println((int) u);
        // чтобы не создавать два класса,просто прокомментировал первый алгоритм
    }
}
