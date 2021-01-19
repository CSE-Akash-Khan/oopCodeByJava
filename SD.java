public class SD {
    public static void main(String[] args) {
        double []element = {31,35,89,75,65,71,21,45,36,32,28,68};
        double sum = 0;
        int size = element.length;
        for (double v : element) {
            sum += v;
        }
        double mean = sum/size;
        double upper = 0;
        double lower = size - 1;
        for(double v : element){
            upper += Math.pow((v - mean),2);
        }
        double sd = Math.sqrt((upper / lower));
        System.out.println(sd);
    }
}
