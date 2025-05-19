# 🧪 Selenium + JUnit + Mockito Java Maven Project Setup

>Project mẫu tích hợp Selenium WebDriver, JUnit 5, Mockito để viết test automation.

---

## ✅ Yêu cầu môi trường

| Thành phần | Phiên bản gợi ý |
|------------|------------------|
| Java       | 20               |
| Maven      | 3.9+             |
| Chrome     | 136+             |
| ChromeDriver | Tương ứng với Chrome 136 |
| IDE        | IntelliJ IDEA / VS Code |

---

## 🛠️ Cài đặt các bước

### 1. **Clone hoặc tạo project Maven**
- Nếu chưa có: tạo project Maven (`pom.xml`) như mẫu bên dưới.

### 2. **Thêm file `pom.xml`**
```xml
<!-- pom.xml -->
<dependencies>

    <!-- ✅ JUnit 5 -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>

    <!-- ✅ Mockito Core -->
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>5.12.0</version>
        <scope>test</scope>
    </dependency>

    <!-- ✅ Mockito + JUnit 5 -->
    <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-junit-jupiter</artifactId>
        <version>5.12.0</version>
        <scope>test</scope>
    </dependency>

    <!-- ✅ Selenium -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.20.0</version>
    </dependency>

    <!-- ✅ WebDriverManager (tự động tải driver) -->
    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.8.0</version>
    </dependency>

    <!-- ✅ SLF4J (log warning fix) -->
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-simple</artifactId>
        <version>2.0.9</version>
    </dependency>

    <!-- ✅ DevTools cho Chrome 136 -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-devtools-v136</artifactId>
        <version>4.32.0</version>
    </dependency>

</dependencies>
```
⚠️ Một số lỗi thường gặp

- **❗ SLF4J(W): No SLF4J providers were found**
    - ✅ Đã fix bằng `slf4j-simple` dependency.

- **❗ DevTools warning: Unable to find CDP implementation matching 136**
    - ✅ Thêm dependency sau để khắc phục:

    ```xml
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-devtools-v136</artifactId>
        <version>4.32.0</version>
    </dependency>
    ```

