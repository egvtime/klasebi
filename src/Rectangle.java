public class Rectangle {
    int lenght;
    int width;

    Rectangle(int Newlength, int Newwidth){
        lenght = Newlength;
        width = Newwidth;
    }

    void perimeter(){
        System.out.println("Perimeter= " + (lenght*2 + width*2));
    }
    void Area(){
        System.out.println("Area= " + (lenght*width));
    }
    void diagonal(){
        System.out.println("diagnoal= " + (Math.sqrt((lenght*lenght) + (width*width))));
    }

    void IsSquare(){
        if(lenght == width){
            System.out.println("is square");
        }else{
            System.out.println("is not square");
        }
    }

}
