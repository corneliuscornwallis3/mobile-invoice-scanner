# 📱 Mobile Invoice Scanner

A lightweight Android app that uses your device's camera and Google ML Kit to scan invoices or receipts, extract key fields like **vendor**, **total**, and **date**, and display the results in a clean UI — all offline.

Built with **Kotlin**, **CameraX**, and **ML Kit**, this app is fast, private, and completely local.

---

## ✨ Features

- 📸 **Scan invoices or receipts** using your phone’s camera
- 🔍 **OCR powered by ML Kit** — no internet required
- 🧠 **Smart parsing** to detect vendor name, total amount, and date
- 📋 **Results screen UI** to review extracted details
- 🔐 **Privacy-first**: no cloud storage or API calls
- 🚀 Compatible with **Android 6.0+**, targeting Android 12

---

## 📷 Screenshots

<img width="90" height="200" alt="image" src="https://github.com/user-attachments/assets/65e6ea58-d6a8-4f6e-b9ec-5bb85ebdb1a7" />
<img width="90" height="200" alt="image" src="https://github.com/user-attachments/assets/878e5f15-d616-4691-901a-ad70685c0288" />
<img width="90" height="200" alt="image" src="https://github.com/user-attachments/assets/729e00eb-82f7-483e-92a3-687541e664d7" />

---

## 🛠️ Tech Stack

| Layer       | Toolset                        |
|-------------|--------------------------------|
| Frontend    | Kotlin, Android Jetpack        |
| Camera      | CameraX                        |
| OCR Engine  | ML Kit Text Recognition        |
| Parsing     | Regex-based invoice parser     |
| Target SDK  | API 34 (Android 14)            |

---

## 📦 Setup & Build Instructions

### 🧰 Requirements

- Android Studio Flamingo or later
- Android device or emulator (with camera support)

### 🚀 Run the App

```bash
git clone https://github.com/corneliuscornwallis3/mobile-invoice-scanner.git
cd mobile-invoice-scanner
```

1. Open the project in Android Studio
2. Let Gradle sync and install dependencies
3. Connect your device or emulator
4. Click ▶️ to run

---

## 🔐 Permissions

The app requests the following permission at runtime:

- `CAMERA` — to scan physical documents using CameraX

---

## 📁 Project Structure

```
app/
├── src/
│   └── main/
│       ├── java/com/example/invoiceocr/
│       │   ├── MainActivity.kt
│       │   ├── CameraActivity.kt
│       │   ├── ResultsActivity.kt
│       │   ├── InvoiceParser.kt
│       │   └── Invoice.kt
│       ├── res/layout/
│       │   ├── activity_main.xml
│       │   ├── activity_camera.xml
│       │   └── activity_results.xml
│       └── AndroidManifest.xml
```

---

## 💡 Future Enhancements

- Export results to PDF or JSON
- Save scanned records to local DB or Firebase
- Add field confidence indicators from ML Kit
- Implement multi-language OCR support

---

## 👨‍💻 Author

**Cory Harris**  
[GitHub Portfolio](https://github.com/corneliuscornwallis3)

---

## 📝 License

This project is released under the MIT License.

