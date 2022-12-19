pipeline {
    agent any

    stages {
        stage('AdditionUnitTest') {
            steps {
                sh 'mvn -Dtest=AdditionUnitTest test'
            }
        }
        stage('ProductUnitTest') {
            steps {
                sh 'mvn -Dtest=ProductUnitTest test'
            }
        }
        stage('SquareUnitTest') {
            steps {
                sh 'mvn -Dtest=SquareUnitTest test'
            }
        }
         stage('SubtractionUnitTest') {
            steps {
                sh 'mvn -Dtest=SubtractionUnitTest test'
            }
        }
    }
}