
import java.util.ArrayList;
import java.util.Scanner;

public class HW_7 {

    public static void main (String [] args) {
        ArrayList<Nout> market = new ArrayList<>();
        market.add(CreateNout("Apple",10,"black",100));
        market.add(CreateNout("IBM",5,"black",50));
        market.add(CreateNout("Apple",30,"white",200));
        market.add(CreateNout("Miu",10,"pink",100));
        while (true) {
            System.out.print("Input parametr to chooce nout - model, price, memory or color - ");
            Scanner Param = new Scanner(System.in);
            String ChPar = Param.next();
            if (ChPar.equals("model")) {
                System.out.print("Input parametr to chooce nout - Apple, IBM, HP or Miu - ");
                Scanner model = new Scanner(System.in);
                String modelType = model.next();
                if ((modelType.equals("Apple")) || (modelType.equals("IBM")) || (modelType.equals("HP")) || (modelType.equals("Miu"))){
                    for (int i=0; i<4; i++){
                        if (modelType.equals(market.get(i).getName())) {
                            PrintData(market.get(i));
                        }
                    }
                }
                else {
                    System.out.print("There is now that model in market");
                }
            }
            if (ChPar.equals("exit")) {
                break;
            }
        }

        for (int i=0; i<4; i++){
            PrintData(market.get(i));
        }



    }

    static Nout CreateNout (String name, int memory, String color, int price) {
        Nout newNout = new Nout();
        newNout.setName(name);
        newNout.setMemory(memory);
        newNout.setColor(color);
        newNout.setPrice(price);
        return newNout;
    }

    public static void PrintData (Nout printData){
        System.out.println("Name of nout is - "+ printData.getName());
        System.out.println("Memory of nout is - "+ printData.getMemory());
        System.out.println("Color of nout is - "+ printData.getColor());
        System.out.println("Price of nout is - "+ printData.getPrice());
        System.out.println();
    }

}

public class Nout {
    private String Name ;
    private int Memory;
    private String Color;
    private int Price;

    public void setName (String name ){
        this.Name = name;
    }
    public String getName (){
        return Name;
    }

    public void setMemory (int Memory ){
        this.Memory = Memory;
    }
    public int getMemory (){
        return Memory;
    }

    public void setColor (String Color ){
        this.Color = Color;
    }
    public String getColor (){
        return Color;
    }

    public void setPrice (int Price ){
        this.Price = Price;
    }
    public int getPrice (){
        return Price;
    }

}


