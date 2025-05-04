
// .gitignore
/target/
*.class
*.jar
*.log
.idea/
*.iml
.DS_Store

// README.md
# Java SQL Injection Scanner

This is a simple SQL Injection vulnerability scanner written in Java using the Spark microframework. It sends test payloads to a given URL and detects SQL error patterns in the response to identify vulnerabilities.

## Features
- Scan for basic SQL injection using multiple payloads
- Detects error-based vulnerabilities via pattern matching
- Simple HTML UI (localhost web form)

## Usage
1. Clone the repository:
```bash
git clone https://github.com/your-username/java-sqli-scanner.git
cd java-sqli-scanner
```

2. Build the project using Maven:
```bash
mvn package
```

3. Run the scanner:
```bash
java -jar target/sqli-scanner-1.0-SNAPSHOT.jar
```

4. Open your browser and go to:
```
http://localhost:4567
```

5. Enter the URL you want to scan using `<INJECT>` as placeholder for SQL payloads.

## Example URL
```
http://localhost/vulnerable.php?id=<INJECT>
```

## Disclaimer
This tool is for educational purposes only. Do not use it against any website without explicit permission.

---

Let me know if you want a custom logo or extra features like Blind SQLi support!
