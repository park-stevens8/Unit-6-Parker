import java.util.Scanner;

public class FrequencyChart {

    private int[] list;


    public FrequencyChart(int[] list){
        this.list = list;
    }

    public String makeChart(int[] list){
        int chart1 = 0;
        int chart2 = 0;
        int chart3 = 0;
        int chart4 = 0;
        int chart5 = 0;
        int chart6 = 0;
        int chart7 = 0;
        int chart8 = 0;
        int chart9 = 0;
        int chart10 = 0;

        for(int n : list){
            if(n <= 10 && n => 1){
                chart1++
            }
            if(n <= 20 && n => 11){
                chart2++
            }
            if(n <= 30 && n => 21){
                chart3++
            }
            if(n <= 40 && n => 31){
                chart4++
            }
            if(n <= 50 && n => 41){
                chart5++
            }
            if(n <= 60 && n => 51){
                chart6++
            }
            if(n <= 70 && n => 61){
                chart7++
            }
            if(n <= 80 && n => 71){
                chart8++
            }
            if(n <= 90 && n => 81){
                chart9++
            }
            if(n <= 100 && n => 91){
                chart10++
            }
        }

    }


    //end class stuff

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("How many values are in your data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("Enter values one at a time, followed by enter");
        int val = 0;

        for(int i = 0; i < data.length; i++){
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart chart = new FrequencyChart(data);

        System.out.println(chart.makeChart);
    }


}