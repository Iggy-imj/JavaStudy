package hw_25;
/*
Task 2 * (Опционально) - Написать класс Собака (Dog).
Каждая Собака обязательно должна иметь имя и высоту прыжка
Должна уметь прыгать и должна уметь тренироваться.
За каждую тренировку высота прыжка увеличивается максимум на 10 сантиметров
Максимальная высота прыжка, которую может натренировать собака,
не может быть больше, чем двукратная высота первоначального прыжка.
Также должен быть метод взять jumpBarrier.
В параметрах метод принимает высоту барьера.
Если собака в состоянии преодолеть этот барьер - прыгает.
Если не в состоянии, нужно проверить помогут ли тренировки
(будет ли данная собака в принципе в состоянии взять барьер).
Если да -> идем тренироваться -> берет барьер
 */

public class SuperDog_v2 {

    private String name;
    private int jumpHeight;
    private int maxTrainableHeight;
    private int barrierHeight;

    public SuperDog_v2(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxTrainableHeight = 2 * jumpHeight;
        //this.barrierHeight = barrierHeight;
    }

    public String toString() {
        return String.format("Пса зовут %s, сейчас он может прыгнуть на высоту %d см.", name, jumpHeight);
    }

    public void train() {
        if (jumpHeight + 10 > maxTrainableHeight) {
            jumpHeight = maxTrainableHeight;
            System.out.println(name + " достиг максимальной высоты прыжка: " + jumpHeight + " см.");
        } else {
            jumpHeight += 10;
            System.out.println(name + " потренировался. Теперь может прыгать на высоту: " + jumpHeight + " см.");
        }
    }

    public boolean jumpBarrier() {
        if (jumpHeight >= barrierHeight) {
            System.out.println(name + " перепрыгнул барьер высотой " + barrierHeight);
            return true;
        }

        System.out.println(name + " должен еще тренироваться!");

        while (jumpHeight < barrierHeight && jumpHeight < maxTrainableHeight) {
            train();
        }

        if (jumpHeight >= barrierHeight) {
            System.out.println(name + " теперь может перепрыгнуть барьер " + barrierHeight);
            return true;
        }

        System.out.println(name + " не смог преодолеть барьер даже после тренировок.");
        return false;
    }

    // --------------------

    public void randomBarriers(int[] barriers) {
        int successfulJumps = 0;

        for (int i = 0; i < barriers.length; i++) {
            this.barrierHeight = barriers[i];
            if (jumpBarrier()) {
                successfulJumps++;
            }
        }
        System.out.println(name + " смог преодолеть " + successfulJumps + " барьеров.");
    }


    // --------------------

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getMaxTrainableHeight() {
        return maxTrainableHeight;
    }

    public int getBarrierHeight() {
        return barrierHeight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public void setMaxTrainableHeight(int maxTrainableHeight) {
        this.maxTrainableHeight = maxTrainableHeight;
    }

    public void setBarrierHeight(int barrierHeight) {
        this.barrierHeight = barrierHeight;
    }
}