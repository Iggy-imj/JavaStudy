package homeworks.hw_25;


import java.util.Random;

public class SuperDogApp2 {
    public static void main(String[] args) {

        Random random = new Random();

        SuperDog_v2[] dogV2 = new SuperDog_v2[5];
        dogV2[0] = new SuperDog_v2("Rex", random.nextInt(51) + 30);
        dogV2[1] = new SuperDog_v2("Fex", random.nextInt(51) + 30);
        dogV2[2] = new SuperDog_v2("Mex", random.nextInt(51) + 30);
        dogV2[3] = new SuperDog_v2("Dex", random.nextInt(51) + 30);
        dogV2[4] = new SuperDog_v2("Kex", random.nextInt(51) + 30);


            int[] barriers = new int[7];
            for (int i = 0; i < barriers.length; i++) {
                barriers[i] = random.nextInt(101) + 70;
            }

            for (int i = 0; i < dogV2.length; i++) {
                SuperDog_v2 dog = dogV2[i];

                System.out.println("Собака: " + dog.getName());
                dog.randomBarriers(barriers);
                System.out.println();
            }


        }
    }