import javax.swing.JOptionPane;

public class FindingDiscount {
    public static void main(String[] args) {

        final int NUM_RANGES = 5;

        int[] itemRangeLimits = { 1, 10, 20, 30, 50 };
        double[] discountRates = { 0.00, 0.10, 0.14, 0.18, 0.20 };

        double customerDiscount;
        String itemsOrdered; // Need this to convert from string to int for the Message Dialog
        int numOrdered;
        int sub = NUM_RANGES - 1;

        itemsOrdered = JOptionPane.showInputDialog(null, "How many items are ordered?");
        numOrdered = Integer.parseInt(itemsOrdered); // Need this to display om the Message Dialog

        while (sub >= 0 && numOrdered < itemRangeLimits[sub]) // Don't use {} it will make it weird and off
            --sub;
        customerDiscount = discountRates[sub];
        JOptionPane.showMessageDialog(null, "Discount rate for " + numOrdered + " items is " + customerDiscount);

    }
}
