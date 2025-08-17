package ecommercePlatformSearchFunction;

public class LinearSearch {
	public void searchById(Product[] products, int id) {
		int len = products.length;
		boolean found = false;

		for(int i=0; i<len; i++) {
			if(products[i].getProductId() == id) {
				System.out.println("\nProduct Found using Linear Search.");
				System.out.println("Product Id: "+ products[i].getProductId());
				System.out.println("Product Name: "+ products[i].getProductName());
				System.out.println("Product Category: "+ products[i].getCategory());
				found = true;
				break;
			}
		}
		if(found==false) System.out.println("\nProduct with ID " + id +" is not Found.");
	}
}
