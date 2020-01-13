class Calculator {
    private Integer a,b,c;

    public Calculator(){

    }
    public Calculator(Integer a, Integer b, Integer c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }

    public Integer getMax(){
        if(a==null){
            a= Integer.MIN_VALUE;
        }
        if(b==null){
            b= Integer.MIN_VALUE;
        }
        if(c==null){
            c= Integer.MIN_VALUE;
        }

        int max = Math.max(a,b);
        max = Math.max(max,c);
        return max;
    }

    public Integer getMin(){
        int min = Math.min(a,b);
        min = Math.min(min,c);
        return min;
    }

    public Integer getSum(){
        return a + b + c;
    }

    public Double getAverage(){
        double avg = (a + b + c) / 3;
        return avg;
    }

    public Boolean areAllPositive(){
        if (a > 0 && b > 0 && c > 0) {
            return true;
        }
        else{
            return false;
        }
    }

    public Boolean isAEven(){
        if(a % 2 == 0) {
            return true;
        }
        else{
            return false;
        }
    }
}


