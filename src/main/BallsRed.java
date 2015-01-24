package main;

/**
 * Created by Lander Brandt on 1/23/15.
 */
public class BallsRed extends TreeDecorator {
    public BallsRed(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String description() {
        return tree.description() + ", red balls";
    }

    @Override
    public int cost() {
        return 1 + tree.cost();
    }
}
