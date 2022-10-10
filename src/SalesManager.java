public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1_999_999_999_999_999L;
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
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        sum = sum - max - min;
        long avg = sum / (sales.length - 2);
        return avg;
    }
}