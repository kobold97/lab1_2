package pl.com.bottega.ecommerce.sales.domain.invoicing;

import java.util.List;

public interface TaxCalculator {

	Tax calculateTax(RequestItem items);

}
