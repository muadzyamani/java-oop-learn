public class Main {

    public static void main(String[] args) {
        Tree myFavoriteOakTree = new Tree(120,
                12, TreeType.OAK);
        Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);

        myFavoriteOakTree.announceTallTree();
        myFavoriteMapleTree.announceTallTree();
    }
}
