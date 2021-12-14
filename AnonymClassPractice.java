
package anonymclasspractice;


public class AnonymClassPractice {

    
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeNoise();
        
        Animal bigfoot = new Animal() {                    // anonymus subclass
        @Override
        public void makeNoise() {
            System.out.println(" Grawlneenhehehe!!!");
        }
        };
        bigfoot.makeNoise();
        Runnable myAnonymusRunnable = new Runnable(){     //anonymus class
            @Override
            public void run() {
                System.out.println(" I'm an anonymus runnable!");
            }
            
        };
        
        myAnonymusRunnable.run();
                }
}
    
    
    
    



           

