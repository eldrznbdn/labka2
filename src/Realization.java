import seaAnimals.seaAnimals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import seaAnimals.Dolphin;

public class Realization {
    private Manager realization;

    private Comparator<seaAnimals> sizeOfAquariumComparator = (o1, o2) -> {
        if (o1.getSizeOfAquarium() > o2.getSizeOfAquarium()) {
            return 1;
        } else if (o1.getSizeOfAquarium() < o2.getSizeOfAquarium()) {
            return -1;
        }
        return 0;
    };

    public Manager getRealization() {
        return realization;
    }

    public void setRealization(Manager realization) {
        this.realization = realization;
    }

    public Realization(Manager realization) {
        this.realization = realization;
    }

    public List<seaAnimals> getSortedBySizeOfAquariumAsc() {
        return realization.getSeaAnimals().stream().sorted(sizeOfAquariumComparator).toList();
    }

    public List<seaAnimals> getSortedBySizeOfAquariumDesc() {
        return realization.getSeaAnimals().stream().sorted(sizeOfAquariumComparator.reversed()).toList();
    }

    public List<seaAnimals> sortByYearOfLife(){
        return realization.getSeaAnimals().stream().filter(p->p.getYearOfLife()>8).toList();
    }

}



