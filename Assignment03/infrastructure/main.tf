provider "aws" {
  region = "us-east-1"
}

resource "aws_security_group" "sg_db" {
  name        = "sg_db"
  description = "Allow TLS inbound traffic"
  vpc_id      = "vpc-c9f158b4"

  ingress {
    protocol  = "tcp"
    from_port = 5432
    to_port   = 5432
    cidr_blocks = ["0.0.0.0/0"]
   #  security_groups =[aws_security_group.sg_application.id]
  }

  ingress {
    protocol  = "tcp"
    from_port = 3306
    to_port   = 3306
    cidr_blocks = ["0.0.0.0/0"]
    # security_groups =[aws_security_group.sg_application.id]
  }

  egress {
    from_port   = 0
    to_port     = 65535
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }

  tags = {
    Name = "csye6220_sg_db"
  }
}

resource "aws_db_subnet_group" "subnet_group" {
  name       = "db_subnet_group"
  subnet_ids = ["subnet-0ccf2074236b9e9e8","subnet-0f7028222acd36698"]

  tags = {
    Name = "csye6220_db_subnet_group"
  }
}

resource "aws_db_instance" "mysql" {
  allocated_storage    = 10
  engine               = "mysql"
  engine_version       = "8.0.20"
  instance_class       = "db.t3.micro"
  name                 = "mysql_db"
  username             = var.db_username
  password             = var.db_password
  identifier= "csye6220"
  multi_az = false
  publicly_accessible=true
  skip_final_snapshot  = true
  vpc_security_group_ids=[aws_security_group.sg_db.id]
  db_subnet_group_name= aws_db_subnet_group.subnet_group.name
  tags = {
    Name = "csye6220_db"
  }
}