import java.util.ArrayList;

public class SelectionSorter extends Sorter {

	/**
    Construct an instance to process the user's data
	*/
	public SelectionSorter(  ArrayList< String> usersData) {
    	super(usersData);
    }

	/**
    sort the user's data, implementing insertion sort
	*/
	public void mySort() {
		for (int i = 0; i < elements.size(); i++) {
    		int champInd = champIndex(i);
    		String champString = elements.get(champInd);
    		elements.set(champInd, elements.get(i));
    		elements.set(i, champString);
    	}
	}

	/**
    helper function for constructor
    Write good English here, reflecting good thinking.
    @return ??
   */
	private int champIndex(int start) {
      String champString = "ZZZZZ";
      int champInd = -1;
      for ( int i = start; i < elements.size(); i++) {
      	if (elements.get(i).compareTo( champString) < 0) {
      		champString = elements.get(i);
              champInd = i;
      	}
      }
      return champInd;
   }
}
