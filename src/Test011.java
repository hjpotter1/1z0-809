import java.io.IOException;



class Video {
    public void play() throws IOException, Exception {
        System.out.print("Video played.");
    }
}
class Game extends Video {
    public void play() throws Exception {
        super.play();
        System.out.print("Game played.");
    }
}
class Solution{
    public static void main(String[] args) {
        try {
            new Game() .play() ;
        }catch (Exception e) {
            //System.out.print(e.getclass());
        }
    }
}

