# Sample Gradle Multiproject

## Details

Two Modules (subprojects)

### Core Module:
- builds common components used by other modules
- Dependencies: `JUnit`

### App Module:
- runs the application
- Dependencies: `Core Module` and `Log4j`
