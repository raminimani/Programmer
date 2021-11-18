package JavaClass19.task3;

public class Task3 {
    public static void main(String[] args) {
        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Demir";
        mathTeacher.teachMath();

        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Ramin";
        chemistryTeacher.teachChemistry();

        PianoTeacher pianoTeacher=new PianoTeacher();
        pianoTeacher.name="Sebast";
        pianoTeacher.teachPiano();

    }
}

class Teacher{
    String name;
    void teach(){
        System.out.println("Teachers teach subjects");
    }
}

class MathTeacher extends Teacher{
    void teachMath(){
        System.out.println(name+" Teaches math");
    }
}

class ChemistryTeacher extends Teacher{
    void teachChemistry(){
        System.out.println(name+" Teaches Chemistry");
    }
}

class PianoTeacher extends Teacher{
    void teachPiano(){
        System.out.println(name+" Teaches Piano");
    }
}