package ecommercePlatformSearchFunction;

public class BinarySearch {
	int lb, ub;
	boolean found = false;
	public void searchById(Product[] products, int id) {
		lb = 0;
		ub = products.length-1;
		
		while(lb<=ub) {
			int mid = (lb+ub)/2;
			if(products[mid].getProductId() == id ) {
				System.out.println("\nProduct Found using Binary Search.");
				System.out.println("Product Id: "+ products[mid].getProductId());
				System.out.println("Product Name: "+ products[mid].getProductName());
				System.out.println("Product Category: "+ products[mid].getCategory());
				found = true;
				break;
			}
			else if (products[mid].getProductId() < id) lb = mid+1;
			else ub = mid-1;
		}
		if(found==false) System.out.println("\nProduct with ID " + id +" is not Found.");
	}
}
