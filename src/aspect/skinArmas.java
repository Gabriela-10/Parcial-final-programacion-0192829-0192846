package aspect;

public class skinArmas {
    public static void arco(){
        System.out.println("""
                           
            |\
            |  \
            |    \
            |      \
            |       \
            |        \
     ""---------------->       
     ""     |        /          
            |       /          
            |      /          
            |    /           
            |  /        
            |/          
                         
        """);


    }

     public static  void espada(){

        System.out.println("""
                      ___ 
                     |  |
                     |  |          
                    |  |
                    |  |
                   |  |    
                   |  |
                  |  |
                  |  |
           __    |  |    __ 
          |__ ---    --- __|
             |___    ___|
                |===|
               |===| 
              |===|
             |===|
            |__|
                         
        """);
        
    }

    public static void main(String[] args) {
        arco();
        espada();

    }
}
