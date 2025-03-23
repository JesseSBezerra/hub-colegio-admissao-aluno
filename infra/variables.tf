variable "region" {
  description = "AWS region"
  type        = string
}

variable "app_name" {
  description = "Application name"
  type        = string
}

variable "ecr_image_url" {
  description = "ECR image URL"
  type        = string
}

variable "container_port" {
  description = "Port used by the container"
  type        = number
}

variable "cidr_vpc" {
  description = "CIDR block for VPC"
  type        = string
}

variable "cidr_subnet_1" {
  description = "CIDR block for subnet 1"
  type        = string
}

variable "cidr_subnet_2" {
  description = "CIDR block for subnet 2"
  type        = string
}

variable "log_retention_days" {
  description = "Retention days for CloudWatch logs"
  type        = number
}

variable "cpu" {
  description = "CPU units for ECS task"
  type        = number
}

variable "memory" {
  description = "Memory (in MB) for ECS task"
  type        = number
}

variable "desired_count" {
  description = "Number of ECS tasks"
  type        = number
}