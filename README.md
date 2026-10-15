# GUNI

A modern Android authentication app built with Kotlin and Jetpack Compose. The project includes a polished login screen and registration form with a clean, mobile-first design inspired by the provided UI mockups.

## Overview

GUNI is a simple user authentication interface that demonstrates:

- Elegant Material 3 styling
- Jetpack Compose screen design
- Navigation between Login and Sign Up screens
- Input form handling for name, phone number, city, email, and password
- Responsive mobile layout for Android devices

## Features

- Attractive pink/blue modern UI
- Login form with email and password fields
- Registration form with validation-friendly inputs
- Forgot password text
- Sign Up / Login navigation flow
- Android app structure ready for extension

## Tech Stack

- Kotlin
- Android Jetpack
- Jetpack Compose
- Navigation Component
- Material 3
- Gradle Kotlin DSL

## Project Structure

```text
24012021073_MAD_PR5/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/myapplication/
│   │   │   │   ├── AppNavigation.kt
│   │   │   │   ├── LoginActivity.kt
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── RegisterActivity.kt
│   │   │   │   ├── FormFeild.kt
│   │   │   │   ├── CheckBoxdemo.kt
│   │   │   │   └── ui/theme/
│   │   │   └── res/
│   │   └── ...
│   └── build.gradle.kts
├── build.gradle.kts
├── settings.gradle.kts
├── gradlew
├── gradlew.bat
├── gradle.properties
└── README.md
```

## Screens

The app includes two main user flows:

1. Login Screen
   - Email input
   - Password input
   - Forgot password option
   - Login button
   - Link to sign-up screen

2. Registration Screen
   - Name
   - Phone number
   - City
   - Email
   - Password
   - Confirm password
   - Register button
   - Redirect to login

## Getting Started

### Prerequisites

- Android Studio
- JDK 11 or above
- Android SDK configured

### Run the app

```bash
git clone https://github.com/Arjun59a/24012021073_MAD_PR5.git
cd 24012021073_MAD_PR5
./gradlew assembleDebug
```

Then open the project in Android Studio and run it on an emulator or a connected Android device.

## App Highlights

- Clean and modern interface
- Simple onboarding flow for authentication screens
- Minimal, maintainable Compose-based implementation
- Suitable for academic or learning projects

## License

This project is intended for educational/demo purposes.

## Author

Created as a Mobile Application Development practical project.
