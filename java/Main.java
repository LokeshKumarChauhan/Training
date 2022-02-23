public  class Main {
    public static void main(String args[]) {
        System.out.println(" In Final Class-Main");
    }
    public final String  finalMethod () {
        System.out.println("In final method -Main"+ this.getClass().getName());
        return "In final method -Main";
    }
}
