package at.htlleonding.fibonacci;
public class Fibonacci {
    
    static int num=1;
    
    static int getNumberSingle(int n) {
        
        if (n < 2)
            
            return 1;
        
        else
            
            return getNumberSingle(n - 1)+getNumberSingle(n - 2);
    }
    
    static int getNumberParallel(int n) {
        
        Thread t = new Thread(new Runnable() {
            
            @Override
            public void run() {
                
                num++;
            }
        });
        if(n < 2){
            
            t.start();
        }
        else{   
            
            return getNumberParallel(n-1)+getNumberParallel(n-2);  
        }  
        return 1;
    }
    
}