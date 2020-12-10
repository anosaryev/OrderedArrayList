import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
    // All methods copy and pasted from NoNullArrayList, will modify.
    public boolean add(T value){
      if (value == null) throw new IllegalArgumentException();
      else{
        super.add(newIndex(value), value);
        return true;
      }
    }

    public T set(int index, T value){
      if (value == null) throw new IllegalArgumentException();
      else return super.set(index, value);
    }

    private int newIndex(T value){
      for (int i = 0; i < size(); i ++){
        if (get(i).compareTo(value) > 0) i ++;
        else return i;
      }
      return size();
    }

  }