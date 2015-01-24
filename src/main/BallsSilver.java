package main;

/**
 * Created by Lander Brandt on 1/23/15.
 */
public class BallsSilver extends TreeDecorator {
    public BallsSilver(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String description() {
        return tree.description() + ", silver balls";
    }

    @Override
    public int cost() {
        return 3 + tree.cost();
    }
}
