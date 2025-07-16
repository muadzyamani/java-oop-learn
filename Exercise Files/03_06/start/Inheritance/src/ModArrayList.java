import java.util.ArrayList;

public class ModArrayList<E> extends ArrayList<E> {
  public E getUsingMod(int index) {
    int validIndex = Math.abs(index % this.size());
    return this.get(validIndex);
  }
}
