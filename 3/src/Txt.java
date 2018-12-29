public class Txt extends File{
    public static void readText(){
        Form.console("Start reading txt file");
        Form.console("End reading txt file");
    }
    public static void showText(){
        Form.console("Start displaying txt file");
        Form.console("End displaying txt file");
    }
    public void read() {readText();}
    public void show() {showText();}
}
