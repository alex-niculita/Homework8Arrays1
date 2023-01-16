public class Main {
    public static void main(String[] args) {

        System.out.println("\t#1 Create arrays");
        int [] arrInt = new int [3];
        arrInt[0] = 1;
        arrInt[1] = 2;
        arrInt[2] = 3;

        double[] arrDouble = {1.57, 7.654, 9.986};

        String[] arrString = {"Java", "Python", "JS"};
        System.out.println("\n");

        System.out.println("\t#2 Print arrays");
        for (int i=0;i<arrInt.length;i++){
            System.out.print(arrInt[i] + ((i<(arrInt.length-1)?", ":"")));
        }
        System.out.println();
        for (int i=0;i<arrDouble.length;i++){
            System.out.print(arrDouble[i] + ((i<(arrDouble.length-1)?", ":"")));
        }
        System.out.println();
        for (int i=0;i<arrString.length;i++){
            System.out.print(arrString[i] + ((i<(arrString.length-1)?", ":"")));
        }
        System.out.println("\n");

        System.out.println("\t#3 Print reverse arrays");
        for (int i=arrInt.length-1;i>=0;i--){
            System.out.print(arrInt[i] + ((i>(0)?", ":"")));
        }
        System.out.println();
        for (int i=arrString.length-1;i>=0;i--){
            System.out.print(arrDouble[i] + ((i>(0)?", ":"")));
        }
        System.out.println();
        for (int i=arrString.length-1;i>=0;i--){
            System.out.print(arrString[i] + ((i>(0)?", ":"")));
        }
        System.out.println("\n");

        System.out.println("\t#4 Create arrays");
        for (int i=0;i<arrInt.length;i++){
            if (arrInt[i]%2!=0){
                arrInt[i] +=1;
            }
            System.out.print(arrInt[i] + ((i<(arrInt.length-1)?", ":"")));
        }
    }

}