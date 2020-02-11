public class MusicLibraryClient {
    public static void main(String[] args) {
        MusicLibrary myLibrary = new MusicLibrary();

        Album a1 = new Album("First", "one Guy", 10, 42.5);
        Album a2 = new Album("This Music", "Some Band", 9, 36);
        Album a3 = new Album("Play", "People", 12, 39.1);
        Album a4 = new Album("a", "b", 10, 33.2);

        myLibrary.add(a1);
        myLibrary.add(a2);
        myLibrary.add(a3);
        myLibrary.add(a4);

        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        //myLibrary.doubleSize();

        //System.out.println(myLibrary);

        //System.out.println("+++++++++++++++++++++++++++++++++++++++");

        myLibrary.remove(1);
        myLibrary.add(a3);
        System.out.println(myLibrary);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        int loc = myLibrary.findTitle("First");
        System.out.println("Found 'First' at index: " + loc);
        System.out.println(myLibrary.getAlbum(loc));

        loc = myLibrary.findTitle("Second");
        System.out.println("Found 'Second' at index: " + loc);
        System.out.println(myLibrary.getAlbum(loc));

    }
}
