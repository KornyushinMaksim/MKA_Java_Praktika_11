public class Tasks {
    private String qwerty;

    public Tasks() {
        qwerty = new String();
        qwerty = "\"Someone’s sitting in the shade today \n" +
                "because someone planted a tree a long time ago.\"\n\n\t\t\t\t\t\t\t\t Warren Buffet.";
    }

    public String tsk1() {
        return qwerty;
    }

    public String tsk2(int a, int b) {
        String strTemp = new String();
        for (int i = a; i < b; i++) {
            if (i % 2 == 0) {
                strTemp += i + " ";
            }
        }
        strTemp += "\n";
        return strTemp;
    }

    public String tsk3(int length, int dir, char a) {
        String str = new String();
        for (int i = 0; i < length; i++) {
            if (dir % 2 == 1) {
                str += a + "\n";
            } else if (dir % 2 == 0) {
                str += a + " ";
            }
        }
        return str;
    }

    public String tsk4(int a, int b, int c, int d) {
        String str = new String();
        int[] arr = new int[]{a, b, c, d};
        int maxValue = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        str += maxValue;
        return str;
    }

    public String tsk5(int a, int b) {
        String str = new String();
        int sum = 0;

        for (int i = a; i < b; i++) {
            sum += i;
        }
        str += sum;
        return str;
    }

    public String tsk6(int value) {
        String str = new String();
        int cnt = 0;
        boolean flag = true;

        for (int i = 1; i < value; i++) {
            if (value % i == 0) {
                cnt++;
            }
        }
        if (cnt > 3) {
            flag = false;
            str += flag;
        }
        else {
            str += flag;
        }
        return str;
    }

    public String tsk7(String strConsl) {
        String str = new String();
        String leftStr = strConsl.substring(0, strConsl.length() / 2);
        String rightStr = strConsl.substring(strConsl.length() / 2);
        for (int i = 0; i < leftStr.length(); i++){
            String sum += leftStr.charAt(i);
        }

        return str;
    }
}
