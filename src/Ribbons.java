/**
 * Created by Lander Brandt on 1/23/15.
 */
public class Ribbons extends TreeDecorator {
    public Ribbons(Tree tree) {
        this.tree = tree;
    }

    @Override
    public String description() {
        return tree.description() + ", ribbons";
    }

    @Override
    public int cost() {
        return 2 + tree.cost();
    }
}
