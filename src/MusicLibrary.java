public class MusicLibrary{
    private Album[] library;

    public MusicLibrary(){
        library = new Album[10];
    }

    public boolean add(Album a){
        for(int n = 0; n < library.length; n++){
            if(library[n] == null){
                library[n] = a;
                return true;
            }
        }
      return false;
    }

    public boolean remove(int index){
        if(library[index] != null){
          library[index] = null;
          return true;
        }
        else{
          return false;
        }
    }

    public String toString(){
      String result = "";
      for(Album a : library){
        if(library != null){
          result += a.toString() + "\n";
        }

      }
      return result;
    }
}
