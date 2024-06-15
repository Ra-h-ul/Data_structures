import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class HuffmanCoding {

	public static void showCodes(HuffNode rootNode, String code) {
		if (rootNode.left == null && rootNode.right == null && Character.isLetter(rootNode.c)) {
			System.out.println(rootNode.c + ":" + code);
			return;
		}

		showCodes(rootNode.left, code + "0");
		showCodes(rootNode.right, code + "1");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numOfChars = 6;
		char[] characters = { 'a', 'b', 'c', 'd', 'e', 'f' };
		int[] charFrequencies = { 5, 9, 12, 13, 16, 45 };

		PriorityQueue<HuffNode> queue = new PriorityQueue<HuffNode>(numOfChars, new CustomComparator());

		for (int i = 0; i < numOfChars; i++) {

			HuffNode node = new HuffNode();
			node.c = characters[i];
			node.freq = charFrequencies[i];
			node.left = null;
			node.right = null;
			queue.add(node);
		}

		HuffNode root = null;
		while (queue.size() > 1) {

			HuffNode x = queue.peek();
			queue.poll();
			HuffNode y = queue.peek();
			queue.poll();

			HuffNode combinedNode = new HuffNode();
			combinedNode.freq = x.freq + y.freq;
			combinedNode.c = '-';
			combinedNode.left = x;
			combinedNode.right = y;
			root = combinedNode;
			queue.add(combinedNode);
		}

		showCodes(root, "");
		scanner.close();
	}
}

class HuffNode {

	int freq;
	char c;

	HuffNode left;
	HuffNode right;
}

class CustomComparator implements Comparator<HuffNode> {
	public int compare(HuffNode x, HuffNode y) {

		return x.freq - y.freq;
	}
}
