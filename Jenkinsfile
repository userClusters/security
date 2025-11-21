pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Your build steps here, e.g., run tests, build artifacts, etc.
                echo 'Building the project...'
            }
        }

        stage('Test') {
            steps {
                // Your testing steps here, e.g., run unit tests
                echo 'Running tests...'
            }
        }

        stage('Deploy') {
            steps {
                // Your deploy steps here, e.g., push to server, upload artifacts, etc.
                echo 'Deploying the project...'
            }
        }
    }
}
