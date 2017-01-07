package chap11PackagesPuttingClassesTogether;

import java.util.Vector;

public class DupValue {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Delhi");
        v.add("Mumbai");
        v.add("Calcutta");
        v.add("Chennai");
        v.add("Delhi");

        Vector tempVector = new Vector();
        String tempValue;

        for (int j = 0; j < v.size(); j++) {

            tempValue = (String) v.elementAt(j);
            if (tempValue != null) {
                if (tempVector.isEmpty()) {
                    tempVector.addElement(tempValue);
                }
                if (tempVector.indexOf(tempValue) == -1) {
                    tempVector.addElement(tempValue);
                }
            }
        }
        for (int j = 0; j < tempVector.size(); j++) {
            System.out.println(tempVector.elementAt(j));
        }

    }

}
