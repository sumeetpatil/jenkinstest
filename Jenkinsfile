pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk'
    }
    stages {
        stage("Tools initialization") {
            steps {
                sh "mvn --version"
                sh "java -version"
            }
        }
        stage("Checkout Code") {
            steps {
                git branch: 'main',
                url: "https://github.com/sumeetpatil/jenkinstest.git"
            }
        }
        stage("Building Application") {
            steps {
               sh "cd test && mvn clean package"
            }
        }
        stage("Code coverage") {
           steps {
               sh "cd test && git --version"
               jacoco(
                    execPattern: '**/target/**.exec',
                    classPattern: '**/target/classes',
                    sourcePattern: '**/src',
                    inclusionPattern: 'com/sumeet/**',
                    changeBuildStatus: true,
                    minimumInstructionCoverage: '30',
                    maximumInstructionCoverage: '80')
               }
           }
        }
 }