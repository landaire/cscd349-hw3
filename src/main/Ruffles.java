package main;

/**
 * Created by Lander Brandt on 1/23/15.
 */
public class Ruffles extends TreeDecorator {
    public Ruffles(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String description() {
        return tree.description() + ", ruffles";
    }

    @Override
    public int cost() {
        return 1 + tree.cost();
    }
}
