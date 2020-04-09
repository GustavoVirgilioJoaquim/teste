package entities;

public class Aluno {
    public String name;
    public double trim1, trim2, trim3;

    public void Avalicao(){
        double resultFinal = trim1 + trim2 + trim3;

        System.out.printf("FINAL GRADE: %.2f", resultFinal);
        System.out.println("");

        if(resultFinal >= 60.0){
            System.out.println(name + ", you PASS.");
        } else {
            double missing = 60 - resultFinal;
            System.out.println(name + ", you FAILED.");
            System.out.printf("MISSING %.2f POINTS", missing);
        }
    }
}
