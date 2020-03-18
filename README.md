# Image Recognition Mobile

### Installation
Install [opencv4nodejs](https://www.npmjs.com/package/opencv4nodejs)

#### Windows:
1. Download and install CMake: https://cmake.org/download/
2. Add CMake binary folder to PATH in Environment Variables
3. Run these commands:
```bash
npm install -g appium
npm install -g windows-build-tools 
npm install -g opencv4nodejs
```

#### macOS
1. Run these commands:
```bash
brew update
brew install cmake
npm install -g appium
npm install -g opencv4nodejs
```

If installing `opencv4nodejs` resolves fails around 90% mark and it has something to do with Tesseract, please refer to this [issue](https://github.com/justadudewhohacks/opencv4nodejs/issues/401) and try to unlink `tesseract`.

#### Linux
1. Download and install CMake: https://cmake.org/download/
2. Export CMake binary folder to PATH of Environment Variables
3. Run these commands:
```bash
npm install -g appium
npm install -g opencv4nodejs
```

Note: The installation will take 30-40 minutes.

### Keywords

#### 1. verifyImagePresent (Verify Image Present)
- Information:
Keyword name: verifyImagePresent
Description: Verifies the given image that presents on the device screen or not.
Parameters:
String imageFilePath: Absolute path of the image
Return: true if the image presents. Otherwise, false.

- Sample:
```java
boolean isPresent = Mobile.verifyImagePresent("/Users/myaccount/Desktop/image.png")
assert isPresent
```

#### 2. tapOnImage (Tap On Image)
- Information:
Keyword name: tapOnImage
Description: Finds the mobile element that is recognized by the given image and taps on the found element's location.
Parameters:
String imageFilePath: Absolute path of the image.
FailureHandling flowControl (optional): Controls the execution flow if the step failed.
Return: true if the image presents. Otherwise, false.

- Sample:
```java
Mobile.tapOnImage("/Users/myaccount/Desktop/image.png")
```

#### 3. findImageElement (Find Image Element)
- Information:
Keyword name: findImageElement
Description: Finds the mobile element that is recognized by the given image.
Parameters:
String imageFilePath: Absolute path of the image.
FailureHandling flowControl (optional): Controls the execution flow if the step failed.
Return: The first found WebElement that is recognized by the given image.

- Sample:
```java
WebElement element = Mobile.findImageElement('/Users/myaccount/Desktop/send.png')
int buttonWidth = element.getSize().getWidth()
int buttonHeight = element.getSize().getHeight()

System.out.println(('Button Width: ' + buttonWidth) + ' pixels')
System.out.println(('Button Height: ' + buttonHeight) + ' pixels')
```

#### 4. findImageElements (Find Image Elements)
- Information:
Keyword name: findImageElements
Description: Finds all mobile elements that are recognized by the given image.
Parameters:
String imageFilePath: Absolute path of the image.
FailureHandling flowControl (optional): Controls the execution flow if the step failed.
Return: A list of WebElement that is recognized by the given image.

- Sample:
```java
List<WebElement> elements = Mobile.findImageElements("/Users/myaccount/Desktop/image.png")
println "Number of elements found: " + elements.size()
```

### References:
http://appium.io/docs/en/advanced-concepts/image-elements/
https://github.com/justadudewhohacks/opencv4nodejs#readme
https://appiumpro.com/editions/32
https://appiumpro.com/editions/33
