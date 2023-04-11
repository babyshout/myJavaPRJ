package demo.enumEx.section1;

public class EnumEx2 {
    public static void main(String[] args) {
//        TableStatus origin1 = "Y";

//        TableStatus origin = Y;

//        String table1Value = origin.getTable1Value();



    }
}

enum TableStatus {
    Y("1", true),
    N("0", false);

    private String table1Value;
    private boolean table2Value;

    TableStatus(String table1Value, boolean table2Value){
        this.table1Value = table1Value;
        this.table2Value = table2Value;
    }

    public String getTable1Value() {
        return table1Value;
    }

    public boolean isTable2Value() {
        return table2Value;
    }
}
