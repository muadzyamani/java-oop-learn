public class Tree {
  double heightMetres;
  double trunkDiameterCentimetres;
  TreeType treeType;
  
  void grow() {
    this.heightMetres += 10;
    this.trunkDiameterCentimetres += 5;
  }
}
