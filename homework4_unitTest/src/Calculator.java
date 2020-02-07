/**
 * Calculator represent a class that takes three parameters and does some operations with them.
 *
 * @author alin macau
 */

class Calculator {
    private Integer a,b,c;

    public Calculator(){

    }

    /**
     * Constructs and initializes the Calculator object with 3 integers parameters
     *
     * @param a the first parameter
     * @param b the second parameter
     * @param c the third parameter
     */
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

    /**
     * Identify the biggest integer of the three parameters
     *
     * @return the maximum of the three parameters
     */
    public Integer getMax(){
        if(a==null){
            a= Integer.MIN_VALUE;
        }
        if(b==null){
            b=Integer.MIN_VALUE;
        }
        if(c==null){
            c=Integer.MIN_VALUE;
        }

        int max = Math.max(a,b);
        max = Math.max(max,c);
        return max;
    }
    /**
     * Identify the lowest integer of the three parameters
     *
     * @return the minimum of the three parameters
     */
    public Integer getMin(){

        if(a==null){
            a= Integer.MAX_VALUE;
        }
        if(b==null){
            b=Integer.MAX_VALUE;
        }
        if(c==null){
            c=Integer.MAX_VALUE;
        }
        int min = Math.min(a,b);
        min = Math.min(min,c);
        return min;
    }

    /**
     * Calculates the sum of the three given parameters
     *
     * @return the sum of a,b, and c
     */
    public Integer getSum(){
        int  sum = 0;
        if(a==null || b==null || c==null) {
            if (a == null) {
                sum = b + c;
            }
            if (b == null){
                sum = a + c;
            }
            if (c == null) {
                sum = a + b;
            }
        }else{
            sum = a + b + c;
        }

        return sum;
    }
    /**
     * Calculates the average of the three given parameters
     *
     * @return the average of a,b, and c
     */
    public Double getAverage(){
        double avg = 0;
        if(a==null || b==null || c==null) {
            if (a == null) {
                avg = (b + c) / 2;
            }
            if (b == null) {
                avg = (a + c) / 2;
            }
            if (c == null) {
                avg = (a + b) / 2;
            }
        }else{
            avg = (a + b + c) / 3;
        }
        return avg;
    }

    /**
     * Finds out if all given parameters are positive
     *
     * @return a boolean
     */
    public Boolean areAllPositive(){
        if(a==null || b==null || c==null){
            return false;
        }
        if (a > 0 && b > 0 && c > 0) {
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Finds out if a is even
     *
     * @return a boolean
     */
    public Boolean isAEven(){
        if(a==null){
            return false;
        }
        if(a % 2 == 0) {
            return true;
        }
        else{
            return false;
        }
    }
}


