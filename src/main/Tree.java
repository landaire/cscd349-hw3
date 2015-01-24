package main;

/**
 * Created by Lander Brandt on 1/23/15.
 */
public abstract class Tree {
    protected String description = "Unknown main.Tree";

    public String description() {
        return description + " decorated with";
    }

    /**
     * This probably should be a float, but we're working with whole numbers anyways
     * @return cost of the tree
     */
    public abstract int cost();

    protected Tree baseTree() {
        return this;
    }
}
