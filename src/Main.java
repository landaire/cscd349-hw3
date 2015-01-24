public class Main {

    public static void main(String[] args) {
        Tree myTreeThatWillProbablyLookCrappy = new ColoradoBlueSpruce();

        myTreeThatWillProbablyLookCrappy = new Star(myTreeThatWillProbablyLookCrappy);
        myTreeThatWillProbablyLookCrappy = new Ruffles(myTreeThatWillProbablyLookCrappy);
        myTreeThatWillProbablyLookCrappy = new Star(myTreeThatWillProbablyLookCrappy);
        myTreeThatWillProbablyLookCrappy = new Ruffles(myTreeThatWillProbablyLookCrappy);

        printTree(myTreeThatWillProbablyLookCrappy);

        myTreeThatWillProbablyLookCrappy = new BalsamFir();
        myTreeThatWillProbablyLookCrappy = new Ruffles(myTreeThatWillProbablyLookCrappy);
        myTreeThatWillProbablyLookCrappy = new LEDs(myTreeThatWillProbablyLookCrappy);
        myTreeThatWillProbablyLookCrappy = new Lights(myTreeThatWillProbablyLookCrappy);
        myTreeThatWillProbablyLookCrappy = new BallsBlue(myTreeThatWillProbablyLookCrappy);

        printTree(myTreeThatWillProbablyLookCrappy);

        myTreeThatWillProbablyLookCrappy = new DouglasFir();
        myTreeThatWillProbablyLookCrappy = new BallsBlue(myTreeThatWillProbablyLookCrappy);
        myTreeThatWillProbablyLookCrappy = new BallsBlue(myTreeThatWillProbablyLookCrappy);
        myTreeThatWillProbablyLookCrappy = new BallsBlue(myTreeThatWillProbablyLookCrappy);
        myTreeThatWillProbablyLookCrappy = new BallsSilver(myTreeThatWillProbablyLookCrappy);
        myTreeThatWillProbablyLookCrappy = new Ribbons(myTreeThatWillProbablyLookCrappy);
        myTreeThatWillProbablyLookCrappy = new Star(myTreeThatWillProbablyLookCrappy);

        printTree(myTreeThatWillProbablyLookCrappy);

        myTreeThatWillProbablyLookCrappy = new FraserFir();
        myTreeThatWillProbablyLookCrappy = new Star(myTreeThatWillProbablyLookCrappy);
        myTreeThatWillProbablyLookCrappy = new Ruffles(myTreeThatWillProbablyLookCrappy);

        printTree(myTreeThatWillProbablyLookCrappy);
    }

    public static void printTree(Tree tree) {
        System.out.printf("%s costs $%d.00\n", tree.description(), tree.cost());
    }
}
