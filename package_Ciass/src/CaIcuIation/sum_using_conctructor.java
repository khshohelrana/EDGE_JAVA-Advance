package CaIcuIation;

public class sum_using_conctructor {

    public sum_using_conctructor (int...numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
} }
