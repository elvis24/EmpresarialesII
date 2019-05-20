
package cl.bean;

import cl.pojos.Product;
import cl.services.ProductFacadeLocal;
import java.math.BigDecimal;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author elvis
 */
@Named(value = "productoBean")
@RequestScoped
public class ProductoBean {

    @EJB
    private ProductFacadeLocal productFacade;
    
    
    private int PRODUCT_ID;
    private int MANUFACTURER_ID;
    private char PRODUCT_CODE;
    private float PURCHASE_COST;
    private int QUANTITY_ON_HAND;
    private float MARKUP;
    private String AVAILABLE;
    private String DESCRIPTION;
    
    

   
    public ProductoBean() {
       
       
    }
    
    public List<Product> getProducts(){
        return productFacade.findAll();
    }
    
    public String crear(){
        
        Product p = new Product();
        p.setPurchaseCost(BigDecimal.ZERO);
        p.setQuantityOnHand(QUANTITY_ON_HAND);
        p.setMarkup(BigDecimal.ZERO);
        p.setAvailable(AVAILABLE);
        p.setDescription(DESCRIPTION);
        
        p.setProductId(productFacade.find(p.getProductId()));
        
        
        return "PRODUCT";
    }

    public int getPRODUCT_ID() {
        return PRODUCT_ID;
    }

    public void setPRODUCT_ID(int PRODUCT_ID) {
        this.PRODUCT_ID = PRODUCT_ID;
    }

    public int getMANUFACTURER_ID() {
        return MANUFACTURER_ID;
    }

    public void setMANUFACTURER_ID(int MANUFACTURER_ID) {
        this.MANUFACTURER_ID = MANUFACTURER_ID;
    }

    public char getPRODUCT_CODE() {
        return PRODUCT_CODE;
    }

    public void setPRODUCT_CODE(char PRODUCT_CODE) {
        this.PRODUCT_CODE = PRODUCT_CODE;
    }

    public float getPURCHASE_COST() {
        return PURCHASE_COST;
    }

    public void setPURCHASE_COST(float PURCHASE_COST) {
        this.PURCHASE_COST = PURCHASE_COST;
    }

    public int getQUANTITY_ON_HAND() {
        return QUANTITY_ON_HAND;
    }

    public void setQUANTITY_ON_HAND(int QUANTITY_ON_HAND) {
        this.QUANTITY_ON_HAND = QUANTITY_ON_HAND;
    }

    public float getMARKUP() {
        return MARKUP;
    }

    public void setMARKUP(float MARKUP) {
        this.MARKUP = MARKUP;
    }

    public String getAVAILABLE() {
        return AVAILABLE;
    }

    public void setAVAILABLE(String AVAILABLE) {
        this.AVAILABLE = AVAILABLE;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    
    
    
    
}
