public class Clock {
    int Hour;
    int Minute;
    int Second;

    Clock(int Newhour, int Newminute, int Newsecond) {
        Hour = Newhour;
        Minute = Newminute;
        Second = Newsecond;
    }

    void print() {
        if (Hour < 10) {
            System.out.print(0);
        }
        System.out.print(Hour + ":");
        if (Minute < 10) {
            System.out.print(0);
        }
        System.out.print(Minute + ":");
        if (Second < 10) {
            System.out.print(0);
        }
        System.out.println(Second);
    }
}

