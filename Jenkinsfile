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
        echo "Testing. I can see ${RELEASE} but not log level ${LOG_LEVEL}"
      }
    }

  }
}