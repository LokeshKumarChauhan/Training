public class TestFinal {

    public static void main(String args[]) {
        // Create a Object of main
        // Create a Object of SubMain

        SubMain objSubMain  = new SubMain();

        Main objMain  = new Main();
        System.out.println("In Objmain Final Method"+ objMain.finalMethod());

        System.out.println("In ObjSubmain Final Method"+ objSubMain.finalMethod());
    }
}
