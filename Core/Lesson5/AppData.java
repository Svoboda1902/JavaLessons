public class AppData {
    String[] header = {"SN", "Weight", "Ammount", "SizeL,mm", "SizeH,mm", "SizeD,mm"};
    int[][] data = {{1, 4, 7, 8, 5, 2}, {3, 6, 9, 11, 14, 17}, {20, 23, 26, 29, 32, 35}};

    public String getHeader() {
        String value = "";
        for (String header : header) {
            value += header + ";";
        }
        value = value.substring(0, value.length() - 1) + "\r\n";
        return value;
    }

    public String getData() {
        String value = "";
        for (int[] data1 : data) {
            for (int data2 : data1) {
                value += data2 + ";";
            }
            value = value.substring(0, value.length() - 1) + "\r\n";
            //value = value + "\r\n";
        }
        return value;
    }
}