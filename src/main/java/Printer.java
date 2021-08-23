public class Printer {

    private int sheets;
    private int printRequest;
    private int tonerAmount;

    public Printer(int sheets, int tonerAmount){
        this.sheets = sheets;
        this.tonerAmount = tonerAmount;
    }

    public int getSheetTotal(){
        return this.sheets;
    }

    public void print(int pages, int copies){
        printRequest = pages * copies;
        if (printRequest <= this.sheets){
            this.sheets -= printRequest;
            this.tonerAmount -= 1;
        }
    }

    public int getTonerAmount(){
        return this.tonerAmount;
    }
}
