package pl.com.bottega.ecommerce.sales.domain.invoicing;

public class CountryTax implements  TaxCalculator {

	@Override
	public Tax calculateTax(RequestItem items) {
		// TODO Auto-generated method stub
		return new Tax();
	}

}
