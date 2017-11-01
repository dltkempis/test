package gpdeng.http;



public class UserInput {
    
    public static class TextInput {
        private char val;
        public void add(char c)
        {
            val =String.valueOf(c).toCharArray()[0];
            System.out.println("test"+String.valueOf(val));
        }
        
        public char getValue() 
        {
        	return val;
        }
    }

    public static class NumericInput extends TextInput 
    {
//    	  private char val;
    	  @Override
          public void add(char c)
          {
    		  if(c >= '0' && c<='9')
    		  {    			  
    			  super.val =c;
//    			  System.out.println(val);
    		  }
//    		   System.out.println("test);
          }
          
//    	  public char getValue() 
//          {
////    		 System.out.println(val);
//          	 return val;
//          }
        
    }

    public static void main(String[] args) {
//    	System.out.println(String.valueOf('c'));
    	
    	
        TextInput input = new NumericInput();
        input.add('1');
        System.out.println(String.valueOf(input.getValue()));
        input.add('a');
        System.out.println(input.getValue());
        input.add('0');
        System.out.println(input.getValue());
    }
    
    
}
