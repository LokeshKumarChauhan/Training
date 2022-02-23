import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String args[]) {

        String [] arr = new String [] {"Sapient", "SFCC", " Training", "Suresh", " Shivam"};
        Stream<String> streamarr = Arrays.stream(arr);

        boolean found =  streamarr.anyMatch(element -> element.contains("CC"));

//        boolean found =  streamarr.anyMatch(element -> element.contains("CC"));

        if(found) System.out.println("CD  Found");

        System.out.println("Stream Array " + streamarr);


        for (String string : arr) {
            if (string.contains("CC")) {
                System.out.println("Deepak Found");
            } else
                System.out.println("Deepak Not Found");
        }

        // streamarr.forEach(System.out::println);

        streamarr = Stream.of("1","2","3");

        System.out.println("Stream Array " + streamarr);

    }
}
