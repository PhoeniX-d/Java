import java.util.*;
public class Price {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();
        List<Float> productsPrice = new ArrayList<>();
        List<String> productsSold = new ArrayList<>();
        List<Float> soldPrice = new ArrayList<>();

        Scanner sc = new Scanner(System.in);      
        System.out.print("Enter the number of products : ");
        int a = sc.nextInt();

        System.out.println("Enter the products : ");
        for(int i = 0; i < a; i++){
            products.add(sc.next());
        }

        System.out.println("Enter the products prices : ");
        for(int i = 0; i < a; i++){
            productsPrice.add(sc.nextFloat());
        }

        System.out.print("Enter the number of products sold : ");
        int b = sc.nextInt();

        System.out.println("Enter the products sold: ");
        for(int i = 0; i < b; i++){
            productsSold.add(sc.next());
        }

        System.out.println("Enter the sold products prices : ");
        for(int i = 0; i < b; i++){
            soldPrice.add(sc.nextFloat());
        }
        int ret = checkError(products, productsPrice, productsSold, soldPrice);
        System.out.println(ret);
        sc.close();
    }

    public static int checkError(List<String> products, List<Float> productsPrice, List<String> productsSold,  List<Float> soldPrice){
        int errorCount = 0;
        // int totalProducts = products.size();
        // int soldProducts = productsSold.size();
        
        // for(int i = 0; i < totalProducts; i++){
        //     String prod = products.get(i);
        //     float price = productsPrice.get(i);
            
        //     for(int j = 0; j < soldProducts; j++){
                
        //         String sprod = productsSold.get(j);
        //         float sprice = soldPrice.get(j);
                
        //         if(sprod.equals(prod) && sprice != price){
        //             errorCount++;
        //             break;
        //         }
        //     }
        // }

        String[] productsArr = products.stream().toArray(String[]::new);
        Float[] productsPriceArr = productsPrice.stream().toArray(Float[]::new);
        String[] productsSoldArr = productsSold.stream().toArray(String[]::new);
        Float[] soldPriceArr = soldPrice.stream().toArray(Float[]::new);

        for(int i = 0; i < productsArr.length; i++){            
            for(int j = 0; j < productsSoldArr.length; j++){
                if(productsArr[i].equals(productsSoldArr[j]) && productsPriceArr[i] != soldPriceArr[j]){
                    errorCount++;
                    break;
                }
            }
        }

        return errorCount;
    }
}
