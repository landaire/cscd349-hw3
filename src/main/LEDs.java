package main;

/**
 * Created by Lander Brandt on 1/23/15.
 */
public class LEDs extends TreeDecorator {
    public LEDs(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String description() {
        return tree.description() + ", main.LEDs";
    }

    @Override
    public int cost() {
        return 10 + tree.cost();
    }
}
