package Strategy;

public class Context {
    sortStrategy st = null;
    Context(int type){
        switch (type){
            case 1:
                this.st = new bubbleSort();
                break;
            case 2:
                this.st = new heapSort();
                break;
        }
    }
    public int[] sortArray(int[] nums){
        return this.st.sortImpl(nums);
    }
}
