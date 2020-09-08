import java.util.Arrays;

public class IntOnlyArrayList {
    private int[] ia;

    public IntOnlyArrayList(int index) {
        this.ia = new int[index];
    }

    public int get(int i) {
        return this.ia[i];
    }
    public void add(int value){
        int[] newArray = new int[this.ia.length + 1];
        for (int i = 0; i < newArray.length; i++){
            if (i >= ia.length){
                newArray[i] = value;
            } else {
                newArray[i] = ia[i];
            }
        }
        this.ia = newArray;
    }
    public void addOne(int index, int value) throws ArrayIndexOutOfBoundsException{
        int[] newArray = new int[this.ia.length + 1];
        for (int i = 0; i < newArray.length; i++){
            if (i == index){
                newArray[i] = value;
            } else {
                newArray[i] = ia[i];
            }
        }
        this.ia = newArray;
    }
    public void remove(int index){
        int[] newArray = new int[this.ia.length - 1];
        for (int i = 0; i < newArray.length; i++){
            if (ia[i] == index) {
                newArray[i] = ia[i + 1];
            } else {
                newArray[i] = ia[i];
            }
        }
        this.ia = newArray;
    }
    public int size(){
        return ia.length;
    }
    public void clearArray(){
        int[] newArray = new int[0];
        this.ia = newArray;
    }

    @Override
    public String toString() {
        return "IntOnlyArrayList " +
                "ia: " + Arrays.toString(ia);
    }
}
