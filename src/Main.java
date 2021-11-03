public class Main {
    public static void main(String[] args) {

        StringBuilder equalsSign = new StringBuilder("====");
        StringBuilder equalsSignRight = new StringBuilder("==============");

        int i = 1000;
        while (i > 0) {
            for (int k = 0; k <= 5; k++) {
                equalsSign.append("=");
                i -= 7;
                if (k == 5)
                    System.out.println(equalsSign + "| " + i + " |" + equalsSignRight);
                else
                    System.out.println(equalsSign + "\\ " + i + " \\" + equalsSignRight);
                equalsSignRight.setLength(equalsSignRight.length() - 1);
                wait(50);
            }

            equalsSignRight.append("==");
            for (int k = 0; k < 5; k++) {
                i -= 7;
                equalsSign.setLength(equalsSign.length() - 1);
                System.out.println(equalsSign + "/ " + i + " /" + equalsSignRight);
                equalsSignRight.append("=");
            }
            equalsSign = new StringBuilder("====");
            equalsSignRight = new StringBuilder("==============");
        }

        System.out.println("ya ghoul'");
    }

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
