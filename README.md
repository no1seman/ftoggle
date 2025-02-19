# Build the project
./gradlew build

# Run the application
./gradlew run

# Run with specific feature flags
./gradlew run -PdarkMode=false -Pnotifications=true -PnewPaymentSystem=true

# Run tests
./gradlew test