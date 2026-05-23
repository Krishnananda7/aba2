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
            emailext (
                subject: "SUCCESS: ${JOB_NAME} #${BUILD_NUMBER}",
                body: "Kubernetes Deployment succeeded!\nCheck: ${BUILD_URL}",
                to: "krishnananda127avsk@gmail.com"
            )
        }

        failure {
            emailext (
                subject: "FAILED: ${JOB_NAME} #${BUILD_NUMBER}",
                body: "Pipeline failed!\nCheck: ${BUILD_URL}",
                to: "krishnananda127avsk@gmail.com"
            )
        }

        always {
            echo 'Pipeline finished.'
        }
    }
}
