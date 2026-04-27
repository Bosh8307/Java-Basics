public class Arrays2 {

    public static void main(String[] args) {
        String[][] data = {
            {"ziad", "rami", "fadi", "nabil", "adel"},
            {"samir", "kareem", "wael", "amr", "tarek"},
            {"mahmoud", "mostafa", "khaled", "ibrahim", "yousuf"},
            {"hussein", "omar", "ali", "mohamed", "ahmed"}
        };

        StringArrayProcessor obj = new StringArrayProcessor(data);

        obj.print2DBefore();

        obj.convertTo1D();

        obj.quickSort(0, data.length * data[0].length - 1);

        obj.convertTo2D();

        obj.print2DAfter();
    }
}
