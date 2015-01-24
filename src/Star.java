import java.util.ArrayList;

/**
 * Created by Lander Brandt on 1/23/15.
 */
public class Star extends TreeDecorator {
    private static ArrayList<Tree> treesAssignedTo = new ArrayList<Tree>();
    private boolean starIsDuplicate = false;

    public Star(Tree tree) {
        this.tree = tree;

        Tree baseTree = tree.baseTree();
        if (treesAssignedTo.contains(baseTree)) {
            starIsDuplicate = true;
            System.out.println("Tree already has a star!");
        } else {
            treesAssignedTo.add(baseTree);
        }
    }

    public String description() {
        if (starIsDuplicate) {
            return tree.description();
        }

        return tree.description() + ", a star";
    }

    public int cost() {
        if (starIsDuplicate) {
            return tree.cost();
        }

        return 4 + tree.cost();
    }
}
