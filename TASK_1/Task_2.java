// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

package Java_Exceptions_HW.TASK_1;


public class Task_2{

    
    /**
     * @param arr
     * @return
     */
    public static int sum2d(String[][] arr) {
        int sum = 0;
        int val = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 6; j++) {
                try{
                    val = Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    val = 0;
                }catch (IndexOutOfBoundsException e){
                            //System.out.println(e.getMessage());
                    throw new RuntimeException("Index out of bounds of array!");
                            //return -1;
                }
                sum += val;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        
        String[][] strInt ={{"1","2","b"},
                            {"4","5","6"},
                            {"a","7","8"}};
        
        System.out.println(sum2d(strInt));

        
    }





}








    




    



