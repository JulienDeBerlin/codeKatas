public class Main {

    public static void main (String[] args){
        String text = "While this is perfectly good for almost all use-cases, I just want to point out that this creates a lot of Strings, that are never beeing used - but still requires memory and gc-ing. It probably only a problem on a heavily used server, or a phone or something, but it is still something of a cludge. – KarlP May 17 '10 at 16:09";
        System.out.println(LineBreakerSession3.reduce(text, 20));
    }
}
