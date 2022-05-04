package testing;

public class Core {

    private String name;
    private int  age;


    public Core(int age) {
        System.out.println("good");
        this.name = new String();
        this.age = age;
    }

    public static void main(String[] args) {

//Cортування бульбашка

        int [] array ={11,1,23,22,22,8,55,2,23,43,43};

       for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length  -1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] =  temp;
                }
            }
      }

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }


    }
    @Override
    public String toString() {
        return "Core{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
