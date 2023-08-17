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
        input(message: 'Do you want to deploy?', id: 'OK')
      }
    }

  }
  environment {
    ChromeDriverPath = 'C:\\DriverPath\\chromedrver.exe'
  }
}