package Annotation.task2;

public class Car {


    @AuthorAnnotation(nameAuthor="Oles Doskuch")

    private String mode;

    @AuthorAnnotation(nameAuthor="Oles Doskuch")
    private int ageModel;

    @Override
    public String toString() {
        return "Car{" +
                "mode='" + mode + '\'' +
                ", ageModel=" + ageModel +
                '}';
    }



    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public int getAgeModel() {
        return ageModel;
    }

    public void setAgeModel(int ageModel) {
        this.ageModel = ageModel;
    }

    public Car(String mode, int ageModel) {
        this.mode = mode;
        this.ageModel = ageModel;
    }
}
