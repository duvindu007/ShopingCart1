/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import java.io.Serializable;
import java.sql.*;
import java.util.*;

/**
 *
 * @author user
 */
public class cart implements Serializable {

    public ArrayList<Integer> id = new ArrayList();
    public ArrayList<String> productCategory = new ArrayList();
    public ArrayList<String> productName = new ArrayList();
    public ArrayList<Double> prices = new ArrayList();
    public ArrayList<Integer> qty = new ArrayList();
    
    
    public ArrayList<String> res = new ArrayList();
    Connection c;
   

    public ArrayList<String> showProducts() {
        for (int i = 0; i < this.id.size(); i++) {
            
            System.out.println(qty.get(i) + " " + id.get(i) + " ");
            res.add(qty.get(i) + ":" + id.get(i));
        }
        
        return res;
    }

   
    public void listItemsOfCart() throws SQLException, ClassNotFoundException {

        c = new DB_Conn().getConnection();
        Statement st = c.createStatement();
        for (int i = 0; i < id.size(); i++) {
            Integer getItemId = id.get(i);
            String getItemName = "SELECT  product_name ,  category_name ,  price FROM  products WHERE  product_id =" + getItemId + "";
            
            ResultSet rs = st.executeQuery(getItemName);
            rs.next();
            String p_name = rs.getString("product_name");
            Double p_price = rs.getDouble("price");
            String p_Category = rs.getString("category_name");

            productName.add(p_name);
            productCategory.add(p_Category);
            prices.add(p_price);
        }
    }

    public ArrayList<String> getProductCategorys() {
        return productCategory;
    }

    
    public ArrayList<String> getProductNames() throws SQLException, ClassNotFoundException {
      
        return productName;
    }
    

    public ArrayList<Double> getPrices() throws SQLException, ClassNotFoundException {
       
        listItemsOfCart();
        return prices;
    }

    public String getProductName(int id) throws SQLException, ClassNotFoundException {
       
        c = new DB_Conn().getConnection();
        String getProductName = "SELECT  product_name FROM  products WHERE  product_id =" + id + "";
        Statement st = c.createStatement();

        ResultSet rs = st.executeQuery(getProductName);
        rs.next();
        String name = rs.getString("product_name");
        return name;
    }

    public String getProductCategory(int id) throws SQLException, ClassNotFoundException {
        
        c = new DB_Conn().getConnection();
        String getCategoryName = "SELECT   category_name  FROM  products WHERE  product_id =" + id + "";
        Statement st = c.createStatement();
      
        ResultSet rs = st.executeQuery(getCategoryName);
        rs.next();
        String name = rs.getString("category_name");
        return name;
    }

    public double getProductPrice(int id) throws SQLException, ClassNotFoundException {
        c = new DB_Conn().getConnection();
        String getProductName = "SELECT  price FROM products WHERE  product_id =" + id + "";
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery(getProductName);
        rs.next();
        double price = rs.getDouble("price");
        return price;
    }

    public double getTotalPriceOfCart() throws SQLException, ClassNotFoundException {
        ArrayList<Double> t_prices = new ArrayList();

       

        c = new DB_Conn().getConnection();
        Statement st = c.createStatement();
        for (int i = 0; i < id.size(); i++) {
            String sqlGetPrice = "SELECT  price FROM  products WHERE  product_id =" + id.get(i).toString() + ";";
            ResultSet rs = st.executeQuery(sqlGetPrice);
            rs.next();
           
            double f = rs.getFloat("price");
           
            f *= qty.get(i);
            
            t_prices.add(f);
        }

        double sum = 0;
        for (int i = 0; i < t_prices.size(); i++) {
            double p = t_prices.get(i);
            sum += p;
        }
        
        return sum;
    }

    public ArrayList<Integer> getQty() {
        return qty;
    }

    public ArrayList<Integer> getId() {
        return id;
    }

    public boolean addProduct(int id) throws SQLException, ClassNotFoundException {
        boolean added, matches;
      

        c = new DB_Conn().getConnection();
        Statement st = c.createStatement();

        String sqlGetValidIds = "SELECT product_id FROM  products;";
        ResultSet rs = st.executeQuery(sqlGetValidIds);

        while (rs.next()) {
            int id_db = rs.getInt("product_id");
            if (id_db == id) {
               
                matches = true;
                break;
            }
        }

      
        if (matches = true) {
           
            if (this.id.contains(id)) {
                
                int index = this.id.indexOf(id);
                this.qty.set(index, this.qty.get(index) + 1);
            } else {
               
                this.qty.add(1);
               
                this.id.add(id);
            }
            added = true;
        } else {
         
            System.out.println("No product with that id exist in database");
            added = false;
        }
        return added;
    }

    public boolean removeProduct(int productId) {
        boolean removed;
        
        if (this.id.contains(productId)) {
           
            int index = this.id.indexOf(productId);
            int quantity = this.qty.get(index);
               
                this.productCategory.remove(index);
                this.productName.remove(index);
                this.prices.remove(index);
                this.qty.remove(index);
                this.id.remove(index);
                removed = true;
        }else {
            removed = false;
        }
        
    
        
        return removed;
    }

    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        try {
            cart c = new cart();
            Scanner sc = new Scanner(System.in);
           
            String choice = "1";
            while (choice.equals("1")) {

                System.out.println("What do u want to buy? Give me ID");

                int id = sc.nextInt();

                c.addProduct(id); 

                System.out.println("Do u wish to continue?");

                choice = sc.next();
            }

            c.showProducts(); 

            
            ArrayList<String> productNames = c.getProductNames();
            ArrayList<String> p_Category = c.getProductCategorys();
            ArrayList<Double> prices1 = c.getPrices();
            ArrayList<Integer> qty1 = c.getQty();
            for (int i = 0; i < productNames.size(); i++) {
                System.out.println(p_Category.get(i) + " " + productNames.get(i) + "              \t\t" + prices1.get(i) + " \t\t" + qty1.get(i) + " \t\t" + prices1.get(i) * qty1.get(i));
            }
            System.out.println("Total Price of the cart is :" + c.getTotalPriceOfCart());

            choice = "1";
            while ("1".equals(choice)) {

                System.out.println("Give Product id to remove");
                int id = sc.nextInt();
                boolean removeProduct = c.removeProduct(id);
                if (removeProduct){
                    for (int i = 0; i < productNames.size(); i++) {
                        System.out.println(p_Category.get(i) + " " + productNames.get(i) + "              \t\t" + prices1.get(i) + " \t\t" + qty1.get(i) + " \t\t" + prices1.get(i) * qty1.get(i));
                        
                        System.out.println("Total Price of the cart is :" + c.getTotalPriceOfCart());

                    }
                }
                else {
                    System.out.println("No Product to remove!!");
                }
            }
            
            
            

            
        } catch (SQLException e) {
            System.out.println("" + e);
        } catch (ClassNotFoundException e) {
            System.out.println("" + e);
        }
    }
}
