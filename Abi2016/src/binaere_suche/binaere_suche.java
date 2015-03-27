package binaere_suche;

public class binaere_suche {

    public int BinarySearch(int target, int[] pData) {

        int rechts = (pData.length - 1);
        int links = 0;
        int mitte = (rechts + links) / 2;

        while ((pData[mitte] != target) && (rechts > links)) {
            if (pData[mitte] > target) {
                rechts = mitte - 1;
            } else {
                links = mitte + 1;
            }
            mitte = (links + rechts) / 2;

        }
        if (pData[mitte] == target) {
            return mitte;
        }
        if (links > rechts) {
            throw new RuntimeException();
        }

        throw new RuntimeException();

    }

}
