# Kotlin JS SPA Example

A minimal Kotlin/JS project using Gradle that demonstrates how to build a simple Single Page Application (SPA). The app contains a button that, when clicked, prints "Hello World" 10 times in the browser. All logic is compiled to JavaScript and runs fully client-side — no backend required.

---

## 🔧 Build and Generate Output

To build the Kotlin/JS project and generate the static JavaScript output:

```bash
  ./gradlew browserProductionWebpack
```

This compiles your Kotlin code into JavaScript and places the output in:
```
build/distributions/
├── index.html      # Static HTML entry point
└── main.js         # Compiled Kotlin code (Kotlin → JS)
```

Make sure your index.html file is placed under:

```src/main/resources/index.html```

Gradle will automatically copy it to the output folder during the build process.

---

## 🚀 Run the App
To test locally in a browser:
- Just open index.html inside ```build/distributions```

or

- Navigate to the output directory:
```bash
  cd build/distributions
```
- Start a static web server (e.g., Python's built-in HTTP server):
```bash
  python3 -m http.server
```
- Open your browser and visit:
```string
  http://localhost:8000
```

---

📦 Tech Stack
- Kotlin/JS (IR Backend)
- Gradle (Kotlin DSL)
- kotlinx-html (for DOM building in Kotlin)
- Pure static hosting (no frameworks, no backend)