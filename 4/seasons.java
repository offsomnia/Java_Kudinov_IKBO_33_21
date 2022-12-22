
import java.util.Scanner;

public class seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = "Summer";
        System.out.println(A);

        enum season {
            WINTER(-10.89, "Cold"), SPRING(7.23, "Cold-warm"), SUMMER(18.97, "Warm"), AUTUMN(6.6, "Warm-cold");

            private double tempreatureNum;
            private String tempreatureWord;

            private season(double tempreatureNum, String tempreatureWord) {
                this.tempreatureNum = tempreatureNum;
                this.tempreatureWord = tempreatureWord;
            }

            public double getTempNum() {
                return tempreatureNum;
            }

            public String getTempWord() {
                return this.tempreatureWord + " season";
            }
        }
        ;

        season input = season.SUMMER;
        switch (input) {
            case WINTER: {
                System.out.println("I love winter!");
                System.out.println(season.WINTER.getTempNum());
                System.out.println(season.WINTER.getTempWord());
                break;
            }
            case SPRING: {
                System.out.println("I love spring!");
                System.out.println(season.SPRING.getTempNum());
                System.out.println(season.SPRING.getTempWord());
                break;
            }
            case SUMMER: {
                System.out.println("I love summer!");
                System.out.println(season.SUMMER.getTempNum());
                System.out.println(season.SUMMER.getTempWord());
                break;
            }
            case AUTUMN: {
                System.out.println("I love fall!");
                System.out.println(season.AUTUMN.getTempNum());
                System.out.println(season.AUTUMN.getTempWord());
                break;
            }
        }
        season[] season1;
        season1 = new season[4];
        season1[0] = season.WINTER;
        season1[1] = season.SPRING;
        season1[2] = season.SUMMER;
        season1[3] = season.AUTUMN;

        for (int i = 0; i < 4; ++i) {
            switch (season1[i]) {
                case WINTER: {
                    System.out.println("I love winter!");
                    System.out.println(season.WINTER.getTempNum());
                    System.out.println(season.WINTER.getTempWord());
                    break;
                }
                case SPRING: {
                    System.out.println("I love spring!");
                    System.out.println(season.SPRING.getTempNum());
                    System.out.println(season.SPRING.getTempWord());
                    break;
                }
                case SUMMER: {
                    System.out.println("I love summer!");
                    System.out.println(season.SUMMER.getTempNum());
                    System.out.println(season.SUMMER.getTempWord());
                    break;
                }
                case AUTUMN: {
                    System.out.println("I love fall!");
                    System.out.println(season.AUTUMN.getTempNum());
                    System.out.println(season.AUTUMN.getTempWord());
                    break;
                }
            }
        }
    }
}
