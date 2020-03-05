public class MyArray2DExplorer {

    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                {0,2,3,4},
                {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRow(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("]");

    }

    //WRITE YOUR METHODS BELOW

    public boolean evenRow(int [][] mat, int row){
        for(int n:mat){
            if(n % 2 == 0){
                return true;
            }
            else{
                return false;
            }
        }
    }

    //returns true if the sum of the numbers the given col is odd.
    public int[] colMaxs(int[][] matrix){
        int max = 0;
        for(int []row : matrix){
            for(int n : row){
                if(n > max)
                    max = n;
            }
        }
        return max;
    }


    public int[] minRow(int [][] nums, int row){
        int min = 0;
        for(int []row : nums){
            for(int n : row){
                if(n < min)
                    min = n;
            }
        }
        return min;
    }

    public int[] allRowSums(int[][] data){
        int sum = 0;
        for(int []row : data){
            for(int n : row){
                sum += n;
            }
        }
        return sum;
    }

    public double[] averageCol(int[][] nums){
        double avgArray[];
        int total = 0;
        int amtRows = 0;
        for(int []row : nums){
            for(int n : row){
                total += n;
            }
            amtRows++;
        }
        avgArray = new double[amtRows];

    }

    public int smallEven(int[][] matrix){
        int minEven = 1000;
        for(int []row : matrix){
            for(int n : row) {
                if (n < minEven && n % 2 = 0) {
                    minEven = n;
                }
            }
        }
        return minEven;
    }

    public static int biggestRow(int[][] nums){
        int bigRow = 0;
        int rowSum1 = 0;
        int rowSum2 = 0;

        for(int []row : nums) {
            for (int n : row){
                rowSum1 += n;
            }
            if(rowSum1 > rowSum2){
                rowSum2 = rowSum1;
                bigRow = []row;
            }
        }
        return bigRow;
    }
}

