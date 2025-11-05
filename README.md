🔐 Secure File Vault

A lightweight Java-based file encryption and decryption tool that allows users to protect sensitive files using a secret key.
Secure File Vault demonstrates how cryptography, file I/O, and modular programming can be combined in Java to create a practical, secure utility.

🚀 Features

🔒 File Encryption & Decryption using a user-provided key

🧩 Modular Architecture with separate classes for encryption, decryption, and password utilities

💾 File I/O Handling using byte streams

⚙️ Cross-Platform – runs anywhere Java runs

🧠 Educational Focus – illustrates basic cryptography logic (XOR cipher)

🏗️ Project Structure
SecureFileVault/
├── files/
│   ├── sample.txt              # Sample input file
│   ├── encrypt_samplefile      # Encrypted output
│   ├── decrypt_samplefile      # Decrypted output
│   └── decrypt_samplefile.txt  # Verification file
└── src/com/vault/
    ├── FileEncryptor.java      # Handles encryption logic
    ├── FileDecryptor.java      # Handles decryption logic
    ├── PasswordUtils.java      # Manages user key input
    └── Main.java               # Application entry point
⚙️ How It Works

The user provides a file path and a key.

The system reads the file as bytes.

Each byte is XORed with the key’s byte sequence.

The resulting encrypted/decrypted bytes are written to a new file.

The same key must be used for both encryption and decryption.

🖥️ Run Locally
Prerequisites

Java 17 or above installed

Command line or terminal access

Steps
# 1. Clone the repository
Clone the Project or Download the Zip of Project 
cd SecureFileVault

# 2. Compile the source code
mkdir out
javac -d out src/com/vault/*.java

# 3. Run the program
java -cp out com.vault.Main
🧰 Example Usage
=============================
  Secure File Vault - Menu
=============================
1. Encrypt File
2. Decrypt File
3. Exit
Enter your choice: 1
Enter file path: files/sample.txt
Enter key: mySecret123
File encrypted successfully → files/encrypt_samplefile
🛠️ Technologies Used

Language: Java

Concepts: File I/O, Exception Handling, XOR Encryption, OOP (Classes & Objects)

🧩 Future Enhancements

🔐 Add AES encryption for stronger security

🧰 Implement a GUI (JavaFX or React frontend)

📊 Add encryption/decryption logs

🧾 Integrate file checksum verification

☁️ Cloud file upload support
