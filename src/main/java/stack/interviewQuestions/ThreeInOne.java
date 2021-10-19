package stack.interviewQuestions;

/*
* Coding Exercise - 29
* */
public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public ThreeInOne(int stackSize){
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    public boolean isFull(int stackNum){
        if(sizes[stackNum] == stackCapacity){
            return true;
        }else {
            return false;
        }
    }

    public boolean isEmpty(int stackNum){
        if (sizes[stackNum] == 0){
            return true;
        }else {
            return false;
        }
    }

}
