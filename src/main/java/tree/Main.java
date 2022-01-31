package tree;

public class Main {
    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("Hot");
        TreeNode coffee = new TreeNode("Coffee");
        TreeNode tea = new TreeNode("Tea");
        TreeNode appleJuice = new TreeNode("AppleJuice");
        TreeNode cold = new TreeNode("Cold");
        TreeNode softDrinks = new TreeNode("SoftDrinks");
        TreeNode lemonJuice = new TreeNode("LemonJuive");
        TreeNode capacino = new TreeNode("Capacccino");



        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(coffee);
        hot.addChild(tea);
       // cold.addChild(appleJuice);
        cold.addChild(lemonJuice);
        cold.addChild(softDrinks);
        //coffee.addChild(capacino);
        System.out.println(drinks.print(0));
    }
}
