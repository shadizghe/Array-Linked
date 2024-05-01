public class TestMyLinkedList {
    public static void main(String[] args) {
        // Create a list
        MyList<String> list = new MyLinkedList<>();

        // Add elements to the list
        list.add("America");
        System.out.println("(1) " + list);

        list.add(0, "Canada");
        System.out.println("(2) " + list);

        list.add("Russia");
        System.out.println("(3) " + list);

        list.add("France");
        System.out.println("(4) " + list);

        list.add(2, "Germany");
        System.out.println("(5) " + list);

        list.add(5, "Norway");
        System.out.println("(6) " + list);

        // Remove elements from the list
        list.remove("Canada");
        System.out.println("(7) " + list);

        list.remove(2);
        System.out.println("(8) " + list);

        list.remove(list.size() - 1);
        System.out.println("(9) " + list);

        // Test additional methods
        System.out.println("Contains 'Russia'? " + list.contains("Russia"));
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Index of 'France': " + list.indexOf("France"));
        System.out.println("Last index of 'Germany': " + list.lastIndexOf("Germany"));

        // Set element at index 1
        list.set(1, "Spain");
        System.out.println("List after setting element at index 1: " + list);

        // Iterate over the list
        System.out.print("(10) ");
        for (String s : list) {
            System.out.print(s.toUpperCase() + " ");
        }
    }
}
