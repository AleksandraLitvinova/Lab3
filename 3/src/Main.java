public class Main {
    public static void main(String[] args){
        String path = args[0];
        File f= new File();
        System.out.println("//наследование");
        f.setName(path);

        System.out.println("File name - "+f.getName());

        if(f.fileExisting(path))
            Form.console("File exist");
        else
            Form.console("File doesn't exist");
        switch(f.getFormat(path))
        {
            case"txt":Txt.readText(); Txt.showText()   ;break;
            case"avi":Avi.readAvi();  Avi.displayAvi() ;break;
            case"jpg":Jpg.readJpg();  Jpg.displayJpg() ;break;
        }
        if(f.fileClose())
            Form.console("Closing complete");
        else
            Form.console("Invalid closing process");

        System.out.println("//полиморфизм");
        File f2= new File();
        f2.setName(path);
        System.out.println("File name - "+f2.getName());
        switch(f2.getFormat(path))
        {
            case"txt":f2 =new Txt();break;
            case"avi":f2 =new Avi();break;
            case"jpg":f2 =new Jpg();break;
        }
        f2.read();
        f2.show();
        if(f2.fileClose())
            Form.console("Closing complete");
        else
            Form.console("Invalid closing process");
    }
}
