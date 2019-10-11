public class Print {

    private int one,two,three,four;
    private String name;

    public Print(int one, int two, int three, int four, String name){
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.name = name;
    }


    public int getOne() {
        return one;
    }
    public void setOne(int one) {
        this.one = one;
    }
    public int getTwo() {
        return two;
    }
    public void setTwo(int two) {
        this.two = two;
    }
    public int getThree() {
        return three;
    }
    public void setThree(int three) {
        this.three = three;
    }
    public int getFour() {
        return four;
    }
    public void setFour(int four) {
        this.four = four;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String toString(){
        int all = one + two + three + four;
        String scoreFinal = Standard.CovertStandard(all);

        return scoreFinal;

    }
}

