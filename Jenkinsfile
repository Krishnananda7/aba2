pipeline {
    agent any
    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Krishnananda7/aba2.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }
    post {
        success {
            mail to: 'krishnananda127avsk@gmail.com',
                 subject: "✅ BUILD SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: """
                 Hi,

                 Build #${env.BUILD_NUMBER} completed successfully!

                 Job      : ${env.JOB_NAME}
                 Status   : SUCCESS
                 Duration : ${currentBuild.durationString}

                 Check here: ${env.BUILD_URL}

                 - Jenkins
                 """
        }
        failure {
            mail to: 'krishnananda127avsk@gmail.com',
                 subject: "❌ BUILD FAILED: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                 body: """
                 Hi,

                 Build #${env.BUILD_NUMBER} has FAILED!

                 Job      : ${env.JOB_NAME}
                 Status   : FAILURE
                 Duration : ${currentBuild.durationString}

                 Check console output: ${env.BUILD_URL}console

                 - Jenkins
                 """
        }
        always {
            echo 'Pipeline finished.'
        }
    }
}
