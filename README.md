# JA Assure WebView App

This repository contains an Android application that converts the JA Assure website into a WebView-based app using JavaScript and Android Studio. The app provides seamless access to the JA Assure platform within an Android application environment, enabling users to interact with the website as they would in a mobile browser.

---

## Features

- **WebView Integration**: Embeds the JA Assure website into the app for a smooth user experience.
- **JavaScript Support**: Executes custom JavaScript to enhance or modify web page elements dynamically.
- **Material Design**: Incorporates Material Design 3 themes for a modern, responsive interface.
- **Day/Night Mode**: Supports light and dark themes for better usability.
- **Responsive Design**: Ensures compatibility with various screen sizes and resolutions.

---

## Prerequisites

Before you begin, ensure you have the following:

- **Android Studio**: Latest version installed.
- **Java 11 or higher**: For Android development.
- **Material Components Dependency**: Added in `build.gradle`.
- **Android Device or Emulator**: To test the application.

---

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ja-assure-webview.git
   ```

2. Open the project in Android Studio:
   - File > Open > Select the cloned repository folder.

3. Sync the Gradle files:
   - Click `Sync Now` when prompted in Android Studio.

4. Install dependencies:
   Ensure the `Material Components` dependency is added in `build.gradle`:
   ```gradle
   implementation 'com.google.android.material:material:1.11.0-alpha03'
   ```

5. Update your `AndroidManifest.xml` with the required permissions and theme:
   ```xml
   <application
       android:theme="@style/Theme.ANDROID_APP">
   </application>
   ```

6. Build and run the project:
   - Use the `Run` button or press `Shift + F10`.

---

## App Structure

- **MainActivity.java**: Contains the WebView implementation and JavaScript execution.
- **res/layout/activity_main.xml**: Defines the layout for the WebView.
- **res/values/themes.xml**: Includes the Material Design theme configuration.
- **build.gradle**: Manages dependencies and configurations.

---

## JavaScript Enhancements

The app includes custom JavaScript to modify and enhance the JA Assure website. Examples include:

- **Element Removal**:
  Removes unwanted elements from the page.
  ```javascript
  document.querySelector('.element-to-remove').remove();
  ```

- **Style Updates**:
  Dynamically changes the styles of web elements.
  ```javascript
  document.querySelector('.element-to-modify').style.color = 'red';
  ```

---


---

## Contribution

Contributions are welcome! To contribute:

1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-branch-name
   ```
3. Make your changes and commit them:
   ```bash
   git commit -m "Description of changes"
   ```
4. Push to your fork:
   ```bash
   git push origin feature-branch-name
   ```
5. Create a pull request on GitHub.

---

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---


---

## Acknowledgments

- [JA Assure](https://jade.insure) for the platform.
- [Material Components](https://material.io/develop/android) for design inspiration.
- The open-source community for guidance and support.

