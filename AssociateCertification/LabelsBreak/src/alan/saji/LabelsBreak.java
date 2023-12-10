package alan.saji;

public class LabelsBreak {
    public static void main(String[] args) {
//        myLabel:
//        int[] myArray = {1, 2, 3}; label cant we used with initialization

        myLabel:
        {
            int[] myArray = {1, 2, 3};        //works
        }

        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        for(String animal : animals) {
            System.out.println(animal);
        }

        MY_LOOP: for(String animal: animals) {
            if(animal.equals("Cat")) {
                break MY_LOOP;               //works, without the label MY_LOOP it will work the same
            }

            System.out.println(animal);
        }

        animal: for(String animal : animals) {
            if(animal.equals("Cat")) {
                break animal;
            }

            System.out.println(animal);
        }

        for(String animal : animals) {
            if(animal.equals("Lizard")) {
                break;
            }

            System.out.println(animal);
        }


        int index = 0;
        while(index < animals.length) {
            String animal = animals[index];

            if(animal.equals("Lizard")) {
                break;
            }

            System.out.println(animal);
            index++;
        }
    }
}
