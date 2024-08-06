# Color_Identifier-JAVA
This project contains a Java program to identify the most dominant color in an image and output its hexadecimal code. The program uses the `javax.imageio.ImageIO` class for image processing and `java.awt.Color` for color representation.

## Prerequisites

1. **Java Development Kit (JDK)**:
   - Ensure you have `JDK` installed on your system. You can download it from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html).

## Setup

1. **Download the Java File**:
   - Save the provided [Java code](ColorIdentifier.java) to a file named `ColorIdentifier.java`.

2. **Compile the Java Program**:
   - Open a terminal or command prompt.
   - Navigate to the directory where `ColorIdentifier.java` is saved.
   - Compile the Java program with the following command:
     ```sh
     javac ColorIdentifier.java
     ```

## Usage

1. **Run the Java Program**:
   - Execute the compiled Java program with the following command:
     ```sh
     java ColorIdentifier <image-file-path>
     ```
   - Replace `<image-file-path>` with the full path to the image file you want to analyze.

2. **View the Result**:
   - The program will output the identified dominant color in RGB format and its hexadecimal code.

## Example

If you run the program and provide the path to an image file, it will output something like:
    ```sh
    Dominant Color in RGB: java.awt.Color[r=255,g=0,b=0]
    Hexadecimal Code: #ff0000
    ```
In this example, the dominant color in the image is red, represented by the RGB values (255, 0, 0) and the hexadecimal code `#ff0000`.

>[!NOTE]
>  - The script identifies the most frequent color in the image and provides the corresponding hex code.
>  - Ensure that the image path is correctly provided; otherwise, the program will not be able to process the image.

- Feel free to modify the code to better fit your specific needs or to improve color detection accuracy.
- This project is protected under [MIT License](LICENSE). :shipit:

