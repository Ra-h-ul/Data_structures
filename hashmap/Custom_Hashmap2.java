import java.util.*;

public class Custom_Hashmap2 {
    
    public static class MyHash<K,V>{

        public static final int DEFAULT_CAPACITY=4;
        public static final float LOAD_FACTOR=0.75f;
        public int n = 0 ;

        public class Node
        {
           K key;
           V value;

            Node(K key  , V value )
            {
                this.key=key;
                this.value=value;
            }
            
        }

        private  LinkedList<Node>[] buckets; // creates an array of linkedlist

        private void  initBuckets(int N){
            buckets = new LinkedList[N];
            for(int i =0 ; i<  N ; i++)
            {
                buckets[i]=new LinkedList<>();
            }
        }


        public MyHash() {
            initBuckets(DEFAULT_CAPACITY);
        }

        private int  generateHashCode(K key)
        {
            int code = key.hashCode(); // code generate is -value to +value 
            return (Math.abs(code))%buckets.length;   // normalizing code in our range
        }

        private int searchInBuckets(LinkedList<Node> curr , K key)
        {
            for(int i=0 ; i<curr.size() ; i++)
            {
                if(curr.get(i).key==key)
                {
                    return i;
                }
            }
            return -1;
        }

        public V get(K key )
        {
            int hc = generateHashCode(key);
            LinkedList<Node> currbucket = buckets[hc];

            // traverse in the linkedlist to find the key
            int index = searchInBuckets(currbucket, key);
            
            if(index!=-1)
            {
                return currbucket.get(index).value;
            }

            return null;
        }
        
        // puts an element in the hashmap
        public V put(K key , V value)
        {
            int hc = generateHashCode(key);
            LinkedList <Node>currBucket=buckets[hc];

            //traverse the ll to find the key
            int index = searchInBuckets(currBucket, key);

            if(index==-1)
            {
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
                
            }
            else
            {
                currBucket.get(index).value=value;
            }

            if(n>= threshHold())
            {
                rehash();
            }

            return value;
        }

        public V remove(K key)
        {
            int hc = generateHashCode(key);
            LinkedList<Node> currbucket = buckets[hc];

            int index = searchInBuckets(currbucket, key);

            if(index!=-1)
            {
                V value = currbucket.get(index).value;
                currbucket.remove(index);
                n--;
                return value;
            }

            return null;
        }

        // return the total number of elments in the hashmap
        public int size()
        {
            return n;
        }

        // returns threshold value
        private float threshHold()
        {
            return buckets.length*LOAD_FACTOR;
        }

        //optimization rehash
        private void rehash()
        {   
            n=0;
            LinkedList<Node>[] oldbuckets = buckets;
            initBuckets(oldbuckets.length*2);

            for(int i=0 ; i<oldbuckets.length ; i++)
            {
                for(int j =0 ; j<oldbuckets[i].size() ; j++)
                {
                    put(oldbuckets[i].get(j).key, oldbuckets[i].get(j).value);
                }
            }
        }

        public int bucket_size()
        {
            return buckets.length;
        }
    }

    public static void main(String[] args) {
        MyHash<Integer,Integer> mp = new MyHash<>();
        System.out.println(mp.put(1, 2));
        System.out.println(mp.put(2,3));
        System.out.println(mp.bucket_size());
        
        System.out.println(mp.put(3,3));
        
        System.out.println(mp.bucket_size());
        
        

    }
}
