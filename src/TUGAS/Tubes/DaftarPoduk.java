package Tubes;
class DaftarProduk {
    Node head;

    // Insert di akhir
    public void insert(Produk produk) {
        Node baru = new Node(produk);
        if (head == null) {
            head = baru;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = baru;
        }
    }

    // Delete berdasarkan ID
    public void delete(String id) {
        if (head == null) return;

        if (head.data.id.equals(id)) {
            head = head.next;
            System.out.println("Produk dengan ID " + id + " berhasil dihapus.");
            return;
        }

        Node current = head;
        while (current.next != null && !current.next.data.id.equals(id)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
            System.out.println("Produk dengan ID " + id + " berhasil dihapus.");
        } else {
            System.out.println("Produk tidak ditemukan.");
        }
    }

    // Search berdasarkan ID
    public Produk search(String id) {
        Node current = head;
        while (current != null) {
            if (current.data.id.equals(id)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    // Tampilkan semua produk
    public void traversal() {
        Node current = head;
        while (current != null) {
            current.data.tampilkanInfo();
            current = current.next;
        }
    }
}
