public class Pizza  {

    public static void main(String[] args) {
        int smallDiameter = 24;
        int largeDiameter = 28;
        int caloriesPerSquareCm = 40;

        int extraCalories = extraCalories(smallDiameter, largeDiameter, caloriesPerSquareCm);
        System.out.println("Лишние калории: " + extraCalories);
    }

    public static int extraCalories(int smallDiameter, int largeDiameter, int caloriesPerSquareCm) {
        double smallPizzaArea = pizzaArea(smallDiameter);
        double largePizzaArea = pizzaArea(largeDiameter);

        int smallPizzaCalories = (int) (smallPizzaArea * caloriesPerSquareCm);
        int largePizzaCalories = (int) (largePizzaArea * caloriesPerSquareCm);

        return largePizzaCalories - smallPizzaCalories;
    }

    public static double pizzaArea(int diameter) {
        double radius = diameter / 2.0;
        return Math.PI * Math.pow(radius, 2);
    }
}

//Площадь круга можно найти, используя формулу A = π * r^2
//Формула: C = A * k, где C - количество калорий, A - площадь пиццы, а k - количество калорий на квадратный сантиметр.
//Формула разницы калорий: просто отнимаем от большего меньшее
 // ответ:6535
