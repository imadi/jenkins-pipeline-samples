pipeline {
  agent any
  environment {
    RELEASE = '20.04'
  }
  stages {
    stage('Build') {
      agent any
      environment {
        LOG_LEVEL = 'info'
      }
      steps {
        echo "Building release ${RELEASE} with log level ${LOG_LEVEL}"
      }
    }
    stage('Test') {
      steps {
        echo "Testing. I can see ${RELEASE}"
      }
    }
    stage('Deploy') {
      input {
        message 'Deploy?'
        ok 'Do it!'
        parameters {
          string(name: 'TARGET_ENVIRONMENT',defaultValue: 'PROD', description: 'Target env')
        }
      }
      steps {
        echo "Deploying release ${RELEASE} to env ${TARGET_ENVIRONMENT}"
      }
    } 
  }
  post{
      always{
          echo "====++++always++++===="
      }
  }
}