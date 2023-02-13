public class Valentine {
  public static void main(String[] args) throws InterruptedException {
    String[] heart = {
      "       *******             *******       ",
      "     ***********         ***********     ",
      "    *************       *************    ",
      "   ***************     ***************   ",
      "  *****************   *****************  ",
      " ******************* ******************* ",
      " ******************* ******************* ",
      "*****************************************",
      "*****************************************",
      "*****************************************",
      " *************************************** ",
      "  *************************************  ",
      "   ***********************************   ",
      "    ********************************     ",
      "     ******************************      ",
      "      ****************************       ",
      "       **************************        ",
      "        ************************         ",
      "        ***********************          ",
      "         *********************           ",
      "          *******************            ",
      "           *****************             ",
      "            ***************              ",
      "             *************               ",
      "              ***********                ",
      "               *********                 ",
      "                *******                  ",
      "                 *****                   ",
      "                  ***                    ",
      "                   *                     ",


    };

    for (int i = 0; i < heart.length; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.println(heart[j]);
      }
      System.out.println("happy heart's day sa inyo, mwah mwah.");
      System.out.println();
      Thread.sleep(100);
      clearScreen();
    }
    for (int i = heart.length - 2; i >= 0; i--) {
      for (int j = 0; j <= i; j++) {
        System.out.println(heart[j]);
      }
      System.out.println("ingat all the time, sana all hindi single...");
      System.out.println();
      Thread.sleep(100);
      clearScreen();
    }
  }

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
