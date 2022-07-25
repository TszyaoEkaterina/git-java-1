public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = 1_999_999_999_999_999L;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long avg() {
        long max = max();
        long min = min();
        int i = 0;
        long sum = 0;
        for (long sale : sales) {
            if (sale != max && sale != min) {
                i++;
                sum += sale;
            }
        }
        long avg = sum / i;
        return avg;
    }
}