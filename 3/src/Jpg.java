public class Jpg extends File{
    public static void readJpg(){
        Form.console("Start reading jpg file");
        Form.console("End reading jpg file");
    }
    public static void displayJpg(){
        Form.console("Start displaying jpg file");
        Form.console("End displaying jpg file");
    }
    public void read() {readJpg();}
    public void show() {displayJpg();}
}
