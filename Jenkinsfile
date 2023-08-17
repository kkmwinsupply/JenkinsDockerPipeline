pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            echo 'Building the app'
          }
        }

        stage('Test') {
          steps {
            echo "Testing the app ${ChromeDriverPath}"
          }
        }

      }
    }

    stage('Deploy') {
      steps {
        echo 'deploying the app'
      }
    }

  }
  environment {
    ChromeDriverPath = 'C:\\DriverPath\\chromedrver.exe'
  }
}
