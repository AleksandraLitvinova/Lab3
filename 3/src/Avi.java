public class Avi extends File{
    public static void readAvi(){
        Form.console("Start reading avi file");
        Form.console("End reading avi file");
    }
    public static void displayAvi(){
        Form.console("Start displaying avi file");
        Form.console("End displaying avi file");
    }
    public void read() {readAvi();}
    public void show() {displayAvi();}
}
