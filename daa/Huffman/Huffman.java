package Huffman;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Huffman {

      public static void printHuffmanCode(HuffmanNode root, String codeString) {

            if (root.left == null && root.right == null
                        && Character.isLetter(root.c)) {

                  System.out.println(root.c + ":" + codeString);

                  return;
            }

            printHuffmanCode(root.left, codeString + "0");
            printHuffmanCode(root.right, codeString + "1");
      }

      public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Number of characters.
            int numCharacters = 6;
            char[] characters = { 'a', 'b', 'c', 'd', 'e', 'f' };
            int[] characterFrequencies = { 5, 9, 12, 13, 16, 45 };

            // Creating a priority queue q.
            // Makes a min-priority queue(min-heap).
            PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<HuffmanNode>(
                        numCharacters, new MyComparator());

            for (int i = 0; i < numCharacters; i++) {

                  // Creating a Huffman node object
                  // and add it to the priority queue.
                  HuffmanNode huffmanNode = new HuffmanNode();

                  huffmanNode.c = characters[i];
                  huffmanNode.data = characterFrequencies[i];

                  huffmanNode.left = null;
                  huffmanNode.right = null;

                  priorityQueue.add(huffmanNode);
            }

            HuffmanNode root = null;

            while (priorityQueue.size() > 1) {

                  // First min extract.
                  HuffmanNode x = priorityQueue.peek();
                  priorityQueue.poll();

                  // Second min extract.
                  HuffmanNode y = priorityQueue.peek();
                  priorityQueue.poll();

                  // New node f which is equal
                  HuffmanNode f = new HuffmanNode();

                  // to the sum of the frequency of the two nodes
                  // assigning values to the f node.
                  f.data = x.data + y.data;
                  f.c = '-';

                  // First extracted node as left child.
                  f.left = x;

                  // Second extracted node as the right child.
                  f.right = y;

                  // Marking the f node as the root node.
                  root = f;

                  // Add this node to the priority-queue.
                  priorityQueue.add(f);
            }

            printHuffmanCode(root, "");
            scanner.close();
      }
}

class HuffmanNode {

      int data;
      char c;

      HuffmanNode left;
      HuffmanNode right;
}

class MyComparator implements Comparator<HuffmanNode> {
      public int compare(HuffmanNode x, HuffmanNode y) {

            return x.data - y.data;
      }
}


