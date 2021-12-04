package JavaClass23.Abstraction;

public class FileTester {
    public static void main(String[] args) {

        File[] files={new JavaFile(),new WordFile(),new PDFFile()};
        for(File file:files){
            file.open();
            file.edit();
            file.close();
        }
    }

}
