package implementacionpag33;

import java.util.Comparator;


	public class NombreComparator implements Comparator<PersonaCentroEducativo>
	{
	@Override
	public int compare(PersonaCentroEducativo p1, PersonaCentroEducativo p2) {
	return p1.getNombre().compareTo(p2.getNombre());
	}

}
