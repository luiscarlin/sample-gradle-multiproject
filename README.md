# Sample Gradle Multiproject

This project shows how to organize code in sub-projcts using Gradle where there are project dependencies.

## Details

Two Modules (sub-projects)

### Core Module:
- Builds common components used by other modules
- Dependencies: `JUnit`

### App Module:
- Builds the main application
- Generates a distributable package
- Dependencies: `Core Module` and `Log4j`


## Summary
- `<root>/settings.gradle` specifies sub-projects
- `<root>/build.gradle` specifies common configuration across sub-projects using `subprojects` (use `allprojects` if applies to root project also)
- `<module>/build.gradle` specifies configuration unique to the module (including project dependencies)


## Commands

```bash
# List all projects in this multi-project build
./gradlew projects

# List tasks available from root
./gradlew tasks

# Genererate binary distribution (with run script per OS)
# Zip package found in <root>/app-module/distributions/
./gradlew distZip
```

## Generated Artifacts

| Name         | Path                                                     |
| ------------ |:--------------------------------------------------------:|
| Junit Report | `<root>/core-module/build/reports/tests/test/index.html` |
| zip package  | `<root>/app-module/distributions/app-module.zip`         |
