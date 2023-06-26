//Принцип подстановки Лисков

package work1;

// Квадрат
public class Square {
    
    public void setSize(int size) {
        this.setWidth(size);
        this.setHeight(size);
    }
}


// Квадрат
//public class Square extends Rectangle {

//    public void setHeight(int height) {
//        this.height = height;
//        this.width = height;
//    }

//    @Override
//    public void setWidth(int width) {
//        this.width = width;
//        this.height = width;
 //   }
//}
//Liskov,Square должен быть отдельным классом и ни в коем случае не наследоваться от Rectangle
