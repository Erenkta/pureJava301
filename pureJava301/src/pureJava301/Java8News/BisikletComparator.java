package pureJava301.Java8News;

import java.util.Comparator;

public class BisikletComparator implements Comparator<Bisiklet>{

	@Override
	public int compare(Bisiklet o1, Bisiklet o2) {
		// TODO Auto-generated method stub
		return o1.getVites() - o2.getVites();
	}

}
