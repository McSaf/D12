package stringsort_lexiko;

public class stringcompare {

    public int compareStrings(String str1, String str2) {

        int length1 = str1.length();
        int length2 = str2.length();
        int max = Math.min(length1, length2);
        char[] str1Char = str1.toLowerCase().toCharArray();
        char[] str2Char = str2.toLowerCase().toCharArray();

        for (int i = 0; i < max; i++) {

            if (str1Char[i] == str2Char[i]) {

                if (i == max - 1) {

                    if (length1 < length2) {

                        return 0;

                    } else if (length1 > length2) {

                        return 1;

                    } else {

                        System.err.println("Input is Equal");
                        return 0;

                    }

                }

            } else if ((int) str1Char[i] > (int) str2Char[i]) {

                return 1;

            } else if ((int) str1Char[i] < (int) str2Char[i]) {

                return 0;

            }

        }

        return Integer.valueOf(null);

    }

}
