package JavaClass23.Abstraction;

public abstract class File {

    void edit(){
        System.out.println("Editing files");
    }
    void close(){
        System.out.println("Closing files");
    }
   abstract void open();
}

class JavaFile extends File {
    @Override
    void open() {
        System.out.println("Use notepad++ or sublime to open Java file");
    }
}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("Use Microsoft word to open these files");
    }
}
class PDFFile extends File{
    @Override
    void open() {
        System.out.println("Use PDF to open these files");
    }
}