public class Main {
    public static void main(String[] args){

        Turtle drizzle = new Turtle();

        // Background
        drizzle.bgcolor("light blue");

        drizzle.width(3);

        // RAIN
        drizzle.penColor("white");

        drizzle.up();
        drizzle.backward(280);
        drizzle.left(90);
        drizzle.forward(200);
        drizzle.right(90);

        for(int row = 0; row < 4; row++){

            for(int i = 0; i < 12; i++){

                drizzle.down();
                drizzle.right(30);
                drizzle.forward(18);

                drizzle.up();
                drizzle.backward(18);

                drizzle.left(30);
                drizzle.forward(55);
            }

            drizzle.backward(660);
            drizzle.right(90);
            drizzle.forward(35);
            drizzle.left(90);
        }

        // MOUNTAINS
        drizzle.penColor("green");
        drizzle.width(4);

        drizzle.up();
        drizzle.home();
        drizzle.backward(320);
        drizzle.right(90);
        drizzle.forward(120);
        drizzle.left(90);
        drizzle.down();

        for(int i = 0; i < 5; i++){

            drizzle.left(60);
            drizzle.forward(140);

            drizzle.right(120);
            drizzle.forward(140);

            drizzle.left(60);

        }

        // GROUND
        drizzle.up();
        drizzle.home();
        drizzle.backward(330);
        drizzle.right(90);
        drizzle.forward(210);
        drizzle.left(90);
        drizzle.down();

        drizzle.width(3);
        drizzle.forward(700);


        // GRASS
        drizzle.backward(700);

        drizzle.width(2);

        for(int i = 0; i < 23; i++){

            drizzle.left(60);
            drizzle.forward(20);

            drizzle.right(120);
            drizzle.forward(20);

            drizzle.left(60);
            drizzle.forward(10);

        }

    }
}