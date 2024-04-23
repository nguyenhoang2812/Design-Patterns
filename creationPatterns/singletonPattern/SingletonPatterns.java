import java.util.Random;

public class SingletonPatterns {

    private int index;
    public  static volatile   SingletonPatterns singletonPatterns;

    private SingletonPatterns(int  index){
      this.index = index;
    }

    public static SingletonPatterns getInstance(){
        if(singletonPatterns == null){

            synchronized (SingletonPatterns.class) {
                if (singletonPatterns == null) {
                    Random random = new Random();
                    singletonPatterns = new SingletonPatterns(random.nextInt(10));
                }
            }
        }
        return singletonPatterns;
    }
    public void getMessage(){
        System.out.println( index + " my message");
    }

}
