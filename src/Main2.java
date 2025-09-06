public class Main2 {
    public static void main(String args[]){
        Bird bird = new Bird() {
            @Override
            public void canFly(String val) {
                System.out.println("Eagle Bird Implementation");
            }
        };
        bird.canFly("y");
    }
}
