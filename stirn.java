public class stirn {
    public static void main(String[] args) {
        String a = "UTTU";
        System.out.println(a);

        String b = new String("harry");
        System.out.println(b);

        //int chrlength = a.length();
        //System.out.println(chrlength);
        System.out.println(a.length());

        //String lowrcase = a.toLowerCase();
        //System.out.println(lowrcase);
        System.out.println(a.toLowerCase());


        //String upprcase = b.toUpperCase();
        //System.out.println(upprcase);
        System.out.println(b.toUpperCase());

        String c = "    s pa ced   ";
        System.out.println(c.trim());

        System.out.println(b.substring(3));
        System.out.println(b.substring(1,4));
        System.out.println(b.charAt(4));

        System.out.println(b.indexOf("ry"));
        System.out.println(b.indexOf("r"));

        System.out.println(b.replace('r','p'));
        System.out.println(b.replace("rry","ir"));
    }
}
