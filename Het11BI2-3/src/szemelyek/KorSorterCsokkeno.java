package szemelyek;

import java.util.Comparator;

import com.sun.source.doctree.CommentTree;

public class KorSorterCsokkeno implements Comparator<EgyetemiAlkalmazott> {

	@Override
	public int compare(EgyetemiAlkalmazott o1, EgyetemiAlkalmazott o2) {
		// TODO Auto-generated method stub
		return o2.getKor() - o1.getKor();
	}

}
