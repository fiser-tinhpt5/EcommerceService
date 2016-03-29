package test;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the PRODUCT_TYPE database table.
 * 
 */
@Entity
@Table(name="PRODUCT_TYPE")
@NamedQuery(name="ProductType.findAll", query="SELECT p FROM ProductType p")
public class ProductType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PRODUCT_TYPE_PRODUCTTYPEID_GENERATOR", sequenceName="PRODUCT_TYPE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PRODUCT_TYPE_PRODUCTTYPEID_GENERATOR")
	@Column(name="PRODUCT_TYPE_ID")
	private long productTypeId;

	@Column(name="PRODUCT_TYPE_CODE")
	private String productTypeCode;

	@Column(name="PRODUCT_TYPE_DESCRIPTION")
	private String productTypeDescription;

	//bi-directional many-to-one association to Product
	@OneToMany(fetch = FetchType.EAGER, mappedBy="productType")
	private List<Product> products;

	public ProductType() {
	}

	public long getProductTypeId() {
		return this.productTypeId;
	}

	public void setProductTypeId(long productTypeId) {
		this.productTypeId = productTypeId;
	}

	public String getProductTypeCode() {
		return this.productTypeCode;
	}

	public void setProductTypeCode(String productTypeCode) {
		this.productTypeCode = productTypeCode;
	}

	public String getProductTypeDescription() {
		return this.productTypeDescription;
	}

	public void setProductTypeDescription(String productTypeDescription) {
		this.productTypeDescription = productTypeDescription;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setProductType(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setProductType(null);

		return product;
	}

}