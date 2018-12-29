public class File {
    String name;
    public String getName()
    {
        Form.console("Start writing file name");
        String tokens[]= this.name.split("\\.");
        Form.console("File name - "+tokens[0]);
        return tokens[0];
    }

    public void setName(String path)
    {
        Form.console("Enter file path");
        String tokens[]= path.split("\\\\");
        this.name=tokens[tokens.length-1];
        Form.console("File - "+this.name);
    }
    public String getFormat(String path)
    {
        Form.console("Enter file format");
        String tokens[]= path.split("\\.");
        Form.console("File format - "+tokens[tokens.length-1]);
        return tokens[tokens.length-1];
    }
    public Boolean fileExisting(String path)
    {
        Form.console("Checking file existing");
        return true;
    }
    public Boolean fileClose()
    {
        Form.console("Closing file");
        return true;
    }

    public void read()
    {
        Form.console("Start file read");
        Form.console("End file read");
    }
    public void show()
    {
        Form.console("Start file display");
        Form.console("End file display");
    }
}
