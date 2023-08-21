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

        stage('Test Log') {
          steps {
            writeFile(file: 'LogTestFile.txt', text: 'This is an Automation file')
          }
        }

      }
    }

    stage('Deploy') {
      parallel {
        stage('Deploy') {
          steps {
            echo 'deploying the app'
            input(message: 'Do you want to deploy?', id: 'OK')
          }
        }

        stage('Artifact') {
          steps {
            archiveArtifacts 'LogTestFile.txt'
          }
        }

      }
    }

  }
  environment {
    ChromeDriverPath = 'C:\\DriverPath\\chromedrver.exe'
  }
}