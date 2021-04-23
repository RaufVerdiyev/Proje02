public class PracticeG {
    public static void main(String[] args) {

        System.out.println("HelloGitHub");
        //How are you new KT

        //Good Job Rauf
        // how are you Sir

        // good good good

    String str ="apple";

        reverseString(str, str.length() - 1);

    }

    public static void reverseString(String str, int number) {

        if (number > -1) {

            System.out.print(str.charAt(number));
            reverseString(str, number - 1);  //???
        }
    }
}
