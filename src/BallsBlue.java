/**
 * Created by Lander Brandt on 1/23/15.
 */
public class BallsBlue extends TreeDecorator {
    public BallsBlue(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String description() {
        return tree.description() + ", blue balls";
    }

    @Override
    public int cost() {
        return 2 + tree.cost();
    }
}
