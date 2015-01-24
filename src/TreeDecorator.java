/**
 * Created by Lander Brandt on 1/23/15.
 */
abstract public class TreeDecorator extends Tree
{
    protected Tree tree;

    public abstract String description();

    @Override
    protected Tree baseTree() {
        return tree.baseTree();
    }
}
