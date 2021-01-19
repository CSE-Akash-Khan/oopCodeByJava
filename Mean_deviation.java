public class Mean_deviation {
    public static void main(String[] args) {
        double []element = {2,8,5};
        double sum = 0;
        int size = element.length;
        for (double v : element) {
            sum += v;
        }
        double mean = sum/size;
        double upper = 0;
        double lower = size - 1;
        for(double v : element){
            upper += Math.abs((v - mean));
        }
        double mean_dev = (upper / size);
        System.out.println(mean_dev);
    }
}

