# HashTable vs HashMap

### difference
1. HashMap is non synchronized. It is not-thread safe and can’t be shared between many threads without proper synchronization code whereas Hashtable is synchronized. It is thread-safe and can be shared with many threads.
2. HashMap allows one null key and multiple null values whereas Hashtable doesn’t allow any null key or value.
3. The iterator in HashMap is fail-fast iterator while the enumerator for Hashtable is not. (Meaning - it does not allow any modification while iterating.)