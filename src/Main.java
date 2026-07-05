public class Main {
    public static void main(String[] args){
        Turtle drizzle = new Turtle();

        drizzle.width(3);

        //Draw rain
        drizzle.penColor("blue");

        drizzle.up();
        drizzle.backward(280);   // move to left
        drizzle.left(90);
        drizzle.forward(200);    // move to top
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

    }
}