pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Jenkins Pipeline'
      }
    }

    stage('Build projet') {
      steps {
        git(url: 'https://github.com/bacaryd33/pizza-spring', branch: '**', credentialsId: 'kennyguiroy123')
      }
    }

    stage('Check Maven') {
      steps {
        mavenSnapshotCheck()
      }
    }

    stage('Jacoco') {
      steps {
        jacoco(maximumBranchCoverage: '80', maximumClassCoverage: '80', maximumComplexityCoverage: '80', maximumInstructionCoverage: '80', maximumLineCoverage: '80', maximumMethodCoverage: '80', minimumBranchCoverage: '20', minimumClassCoverage: '20', minimumComplexityCoverage: '20', minimumInstructionCoverage: '20', minimumLineCoverage: '20', minimumMethodCoverage: '20')
      }
    }

  }
}