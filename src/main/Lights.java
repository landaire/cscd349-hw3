package main;

/**
 * Created by Lander Brandt on 1/23/15.
 */
public class Lights extends TreeDecorator {
    public Lights(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String description() {
        return tree.description() + ", lights";
    }

    @Override
    public int cost() {
        return 5 + tree.cost();
    }
}
