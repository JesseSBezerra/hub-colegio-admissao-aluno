terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 5.0"
    }
  }

  backend "s3" {
    bucket = "hub-colegio-admissao-aluno-terraform-state"
    key            = "ecr/terraform.tfstate"
    region         = "sa-east-1"
  }
}