pipeline {
    agent any
    
    environment {
        DOCKERHUB_CREDENTIALS_ID = 'docker_credentials'
        DOCKERHUB_REPO = 'teemukallio/tempconverter'
        DOCKER_IMAGE_TAG = 'latest'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/teemueka/TempConverter.git'
            }
        }  
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build("${DOCKERHUB_REPO}:${DOCKER_IMAGE_TAG}")
                }
            }
        }
        stage('Push Docker Image to Docker Hub') {
            steps {
                script {
                    withCredentials([usernamePassword(credentialsId: "${DOCKERHUB_CREDENTIALS_ID}", 
                                                     usernameVariable: 'DOCKER_USER', 
                                                     passwordVariable: 'DOCKER_PASS')]) {
                        bat """
                            docker login -u %DOCKER_USER% -p %DOCKER_PASS%
                            docker push %DOCKERHUB_REPO%:%DOCKER_IMAGE_TAG%
                            docker logout
                        """
                    }
                }
            }
        }
    }
}
