# **HASH FUNCTION**
A hash function takes an input (or 'message') and returns a fixed-size string of bytes. The output, typically a 'digest', is unique to each unique input. Hash functions are commonly used in computer security for tasks like data integrity verification, password hashing, and digital signatures.

In your code, SHA-256 is used as the hash function, which produces a 256-bit (32-byte) hash value. The hexadecimal representation of this hash is a 64-character string.

## **Applications of Hash Functions**
- Hash Tables: The most common use of hash functions in DSA is in hash tables, which provide an efficient way to store and retrieve data.
- Data Integrity: Hash functions are used to ensure the integrity of data by generating checksums.
- Cryptography: In cryptographic applications, hash functions are used to create secure hash algorithms like SHA-256.
- Data Structures: Hash functions are utilized in various data structures such as Bloom filters and hash sets.

## **Here’s a step-by-step explanation of how it works:**
1. Import Statements: These imports are necessary for using the MessageDigest class for hashing and the BigInteger class for converting the byte array to a hexadecimal string.

   - import java.security.MessageDigest;
   - import java.math.BigInteger;

2. Encryption Method:
   - MessageDigest md = MessageDigest.getInstance("SHA-256");: Initializes a MessageDigest object that implements the SHA-256 hash function.
   - byte[] arr = md.digest(message.getBytes());: Computes the SHA-256 digest (hash) of the input string converted to bytes.
   - BigInteger bi = new BigInteger(1, arr);: Creates a BigInteger from the byte array. The 1 signifies that the number is positive.
   - return bi.toString(16);: Converts the BigInteger to a hexadecimal string.

3. Main Method:
     - The main method calls the encryption method with the input string "Example".
     - The result is printed to the console.
     - If any exceptions occur, they are caught and printed to the console.
