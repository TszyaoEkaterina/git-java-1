public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = 1_999_999_999;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int avg() {
        int max = max();
        int min = min();
        int i = 0;
        int sum = 0;
        for (int sale : sales) {
            if (sale != max && sale != min) {
                i++;
                sum += sale;
            }
        }
        int avg = sum / i;
        return avg;
    }
}