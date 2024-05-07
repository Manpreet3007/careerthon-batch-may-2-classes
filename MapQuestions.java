


//Map -> K - key(unique), value -> non unique
// interview questions
// internal working of hashmap 

// add key value - put(key, value) 

// key hashcode - random number that is generated by applying some function(operation) on key 
// ex - key - hello - function - add all ascii values of alphabtes in the word - 67 + 37+ 49 = 1024 (any value)answer = hashcode

// bucket = memory where key and values are stored - 
// hashcode - corresponds to memory location


// add new pair in map - key, value
// key - hashcode - correspond to memory - if that memory is empty -> add the key value pair 
// add - O(1) - hashcode - function(formula) 


// next value -> hi, 2 -> hashcode -> hi -> 12
// memery -> if that is empty -> insert 


// key - friend, 3 
// friend -> hashcode -> 1024 
// 1024 hashcode is also same for hello, -> corresponding memory will not be empty  (collision) -> 


// 2 cases are possible in collision(hashcode same) - keys are same, keys are different 

// Ex - 1st key - hello (1024), friend (1024)  - when hashcode same i.e. collision occured -> then check with equals method if 
// keys are same or not
// if keys are not same - "hello".equals("friend") -> false - new key pair value will be added in the same bucket as a next node
// in linked list

// ex {hello, 1} -> {"friend" , 3} (same bucket location as their hashcode same)


// add node(key, vlaue)
// 1 case - memory empty - insert the node in the bucket
// 2 case - memory is not empty(hascode collision) -> equals -> false(keys are not equal) -> linked list  {hello, 1} -> {"friend" , 3} (same bucket location as their hashcode same)

// update 
// Ex - {"hello", 4}
// hashcode - 1024
// memory -> check if memory is not empty -> true
// equals -> to compare keys -> hello key is already in the bucket -> equals will return true 
// same key's value will be updated
// {"hello", 4} -> {"friend" , 3}


// get ("hello")
// hashcode of key - > 1024
// corresponding memory (bucket) -> if node is present -> equals -> true -> value -> return 4

// hashcode memory is empty -> get("lion") -> 456 -> corresponding bucket -> no element -> null
// get("there") -> 1024 -> memory empty (keys present -> hello, friend) -> equals method will return false -> null










































