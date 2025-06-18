//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    DynamicStack stack = new DynamicStack();
    int[] valuesList = {1,2,3,4,5,6,7};
    for(int i=0; i<valuesList.length; i++){
        stack.push(valuesList[i]);
    }
    stack.displayStack();
    stack.pop();
    stack.pop();
    stack.displayStack();
    }
}
