package enumexample;

public enum Season {
//    WINTER(10), SUMMER(20);
    WINTER(10) {
        @Override
        public String dispSeason() {
            return "Winter";
        }
    }, SUMMER(20) {
        @Override
        public String dispSeason() {
            return "Summer";
        }
    };

    public int value;

    Season(int value) { // internally private
        this.value = value;
    }

    public abstract String dispSeason(); // enum can have abstract method and also override this in all constants
}

class EnumExample1 {

    public static void main(String[] args) {
        for (Season s : Season.values()) {
//            System.out.println(s + " " + s.value);
            System.out.println(s + " " + s.value + " " + s.dispSeason());
        }
    }
}
