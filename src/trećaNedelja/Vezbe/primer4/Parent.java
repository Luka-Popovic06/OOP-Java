package trećaNedelja.Vezbe.primer4;

 class Parent {
     protected int protectedField;

     class innerClass{
         void accessProtectedField(){
             protectedField = 10;
             System.out.println("Accessing protected field from innerClass" + protectedField);
         }

     }
}
