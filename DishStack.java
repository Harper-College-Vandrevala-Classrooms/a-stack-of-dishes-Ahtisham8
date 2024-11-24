import java.util.ArrayList;

class DishStack{
    public ArrayList<Dish> stack;

    public DishStack()
    {
        stack = new ArrayList<>();
    }

    public void push(Dish dish) {
        if (stack.size() < 4) {
            stack.add(dish);
        }
        else
        {
            System.out.println("The stack is full!");
        }
    }

    public int size()
    {
        return stack.size();
    } 

    public Dish peek()
    {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.get(stack.size()-1);
    }

    public Dish pop()
    {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    public static void main(String[] args) {
        DishStack stack = new DishStack();
        Dish oneDish = new Dish("A dish with one fish pattern on it");
        Dish twoDish = new Dish("A dish with two fish patterns on it");
        Dish redDish = new Dish("A dish with a red fish pattern on it");
        Dish blueDish = new Dish("A dish with a blue fish pattern on it");

        Dish asd = new Dish("A dish sdasfsafdffad a blue fish pattern on it");

        // The variable stack_size should equal zero.
        int stackSize = stack.size();
        System.out.println(stackSize);

        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(redDish);
        stack.push(blueDish);
        stack.push(asd);

        // The variable sizeAfterPushes should equal four.
        int sizeAfterPushes = stack.size();
        System.out.println(sizeAfterPushes);

        // The variable peekedDish should have a description of "A dish with a blue fish pattern on it"
        Dish peekedDish = stack.peek();
        System.out.println(peekedDish.description);

        // The variable poppedDish should have a description of "A dish with a blue fish pattern on it"
        Dish poppedDish = stack.pop();
        System.out.println(poppedDish.description);

        // The variable anotherPoppedDish should have a description of "A dish with a red fish pattern on it"
        Dish anotherPoppedDish = stack.pop();
        System.out.println(anotherPoppedDish.description);

        // The variable finalSize should equal two.
        int finalSize = stack.size();
        System.out.println(finalSize);
    }

}