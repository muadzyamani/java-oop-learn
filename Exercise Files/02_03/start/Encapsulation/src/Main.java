public class Main {

    public static void main(String[] args) {
      Tree myFavoriteMapleTree = new Tree(90, 30, TreeType.MAPLE);

      // System.out.println(myFavoriteMapleTree.treeType);
      // System.out.println(myFavoriteMapleTree.heightFt);
      // System.out.println(myFavoriteMapleTree.trunkDiameterInches);

      System.out.println(myFavoriteMapleTree.getTreeType());
      System.out.println(myFavoriteMapleTree.getHeightFt());
      System.out.println(myFavoriteMapleTree.getTrunkDiameterInches());

      myFavoriteMapleTree.grow();
      System.out.println(myFavoriteMapleTree.getHeightFt());
    }
}
