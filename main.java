public class Main {
    public static void main(String[] args) {
        InventoryDAO dao = new InventoryDAO();

        try {
            // Example usage
            dao.addItem("Laptop", 5, 1);
            System.out.println("All Items: " + dao.getAllItems());
            System.out.println("Low Stock Items: " + dao.getLowStockItems(10));
            System.out.println("Electronics Items: " + dao.getItemsByCategory("Electronics"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
