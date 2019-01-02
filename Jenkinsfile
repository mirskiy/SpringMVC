node {
  stage('SCM') {
    git 'https://github.com/mirskiy/SpringMVC.git'
  }
  stage('SonarQube analysis') {
    def scannerHome = tool 'sonarscanner';
    withSonarQubeEnv('sonar') {
      sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=${env.JOB_NAME}"
    }
  }
}
