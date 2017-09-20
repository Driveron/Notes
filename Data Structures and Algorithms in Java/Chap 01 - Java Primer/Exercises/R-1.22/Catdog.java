/**
 * Catdog
 */
public class Catdog{
    public static void main(String[] args) {
        String[] cSet = {"a", "c", "d", "g", "o", "t"};
 
        for (int i = 0; i < 6; i++) {
            for (int i2 = 0; i2 < 6; i2++) {
                if (i2 == i) {
                    continue;
                }
                for (int i3 = 0; i3 < 6; i3++) {
                    if (i3 == i || i3 == i2) {
                        continue;
                    }
                    for (int i4 = 0; i4 < 6; i4++) {
                        if (i4 == i || i4 == i2 || i4 == i3) {
                            continue;
                        }
                        for (int i5 = 0; i5 < 6; i5++) {
                            if (i5 == i || i5 == i2 || i5 == i3 || i5 == i4) {
                                continue;
                            }
                            for (int i6 = 0; i6 < 6; i6++) {
                                if (i6 == i || i6 == i2 || i6 == i3 || i6 == i4 || i6 == i5) {
                                    continue;
                                }
                                System.out.println(cSet[i] + cSet[i2]
                                 + cSet[i3] + cSet[i4] + cSet[i5] + cSet[i6]);
                            }
                        }
                    }
                }
            }
        }
    }
}