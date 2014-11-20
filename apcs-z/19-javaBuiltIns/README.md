1. A HashMap/TreeMap is an implementation of the Map interface while the HashSet/TreeSet is an implementation of the Set Interface. HashSet/TreeSet only stores objects but HashMap/TreeMap stores data in form of key value pairs.
HashMap is faster than HashSet because unique key is used to access object
2.HashMap has an array of HashMap.Entry objects. The entries are stored in "buckets". Each hashMap has an Array and the entries are place in a position according to the hashcode. if more than one entry is place in a bucket the entry is stored in a linked list.
3. TreeMap uses a red-black tree as an internal data structure.
4.HashMap.put() is faster than TreeMap.put() until you hit a very BIG number
5.Priority Queues
