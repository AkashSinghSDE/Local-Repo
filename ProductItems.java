

public class ProductItems {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1,"HP",25000));
        productList.add(new Product(2,"Dell",56788));
        List<Double> productPriceList2= productList.stream().filter(p -> p.price>3000).map(p -> p.price).collect(Collectors.toList());
        System.out.println(productPriceList2);
    }
}