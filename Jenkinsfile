pipeline {
    agent any
    tools {
        maven 'Maven 3'
    }
    stages {
        stage('download') {
            steps {
                git 'https://github.com/nkbansal237/demo'
            }
        }
        stage('clean'){
            steps{
                bat 'mvn clean compile package'
            }
        }
    }
}
