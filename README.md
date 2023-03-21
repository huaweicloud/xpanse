# xpanse

Xpanse is an Open Source project allowing to easily implement native managed service on any cloud
service provider.

Xpanse unleash your cloud services by removing vendor lock-in and lock out. It standardizes and
exposes cloud service providers core services, meaning that your xpanse service is portable (
multi-cloud) on any cloud topology and provider. It also avoids tight coupling of your service to
other cloud service provider services.

## APIs (core services)

Xpanse interacts directly with the fundamental APIs used by the cloud service provider to create
managed service:

* **identity** dealing with access, users, groups, roles, ...
* **computing** abstracts the manipulation of virtual machines
* **storage** abstracts the manipulation of storage volumes
* **vpc** abstracts the manipulation of network devices
* **billing** registers the business model in the cloud provider billing system
* ...

## Configuration Language

A managed service is described using Open Services Cloud Configuration Language (OCL).

OCL is a json descriptor of a managed service, describing the expected final state of your service,
interacting with the fundamental APIs:

```yaml
# The version of the OCL
version: 2.0
# The category of the service.
category: container
# The Service provided by the ISV, the name will be shown on the console as a service.
name: K8S cluster
# The version of the service, if the end-user want to select the version when they want to deploy the service.
serviceVersion: v1.26.2
# For the users may have more than one service, the @namespace can be used to separate the clusters.
description: This is an ehanced K8S cluster services by ISV-A.
namespace: ISV-A
# Icon for the service.
icon: |
   data:image/png;base64,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
# Reserved for CSP, aws,azure,ali,huawei and ...
cloudServiceProvider:
   name: huawei
   regions:
      - cn-southwest-2
      - cn-north-4
billing:
   # The business model(`flat`, `exponential`, ...)
   model: flat
   # The rental period (`daily`, `weekly`, `monthly`, `yearly`)
   period: monthly
   # The billing currency (`euro`, `usd`, ...)
   currency: euro
# The flavor of the service, the @name/@version/@flavor can locate the specific service to be deployed.
flavors:
   - name: 1-master-with-3-woker-nodes-normal
      # The fixed price during the period (the price applied one shot whatever is the service use)
     fixedPrice: 40
      # Properties for the service, which can be used by the deployment.
     property:
        worker_nodes_count: 3
        flavor_id: s7.xlarge.4
   - name: 1-master-with-3-woker-nodes-performance
      # The fixed price during the period (the price applied one shot whatever is the service use)
     fixedPrice: 40
      # Properties for the service, which can be used by the deployment.
     property:
        worker_nodes_count: 3
        flavor_id: c7.xlarge.4
   - name: 1-master-with-5-woker-nodes-normal
      # The fixed price during the period (the price applied one shot whatever is the service use)
     fixedPrice: 40
      # Properties for the service, which can be used by the deployment.
     property:
        worker_nodes_count: 5
        flavor_id: s7.xlarge.4
   - name: 1-master-with-5-woker-nodes-performance
      # The fixed price during the period (the price applied one shot whatever is the service use)
     fixedPrice: 40
      # Properties for the service, which can be used by the deployment.
     property:
        worker_nodes_count: 5
        flavor_id: c7.xlarge.4
deployment:
   # kind, Supported values are terraform, pulumi, crossplane.
   kind: terraform
   # Context for deployment: the context including some kind of parameters for the deployment, such as fix,variable.
   # - env: The value of the fix parameters are defined by the ISV with the @value at the initial time.
   # - variable: The value of the variable parameters are defined by the user on the console.
   # The parameters will be used to generate the API of the managed service.
   context:
      - name: HW_REGION_NAME
        description: huawei cloud region name.
        kind: env
        type: string
        mandatory: true
        validator: minLength=6|maxLength=26
      - name: HW_ACCESS_KEY
        description: Huawei cloud access key.
        kind: env
        type: string
        mandatory: true
      - name: HW_SECRET_KEY
        description: Huawei cloud secret key.
        kind: env
        type: string
        mandatory: true
      - name: admin_passwd
        description: The admin password of all nodes in the K8S cluster.
        kind: variable
        type: string
        mandatory: true
        validator: minLength=8|maxLength=16|pattern=^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,16}$
      - name: network_id
        description: The network id of all nodes in the K8S cluster.
        kind: variable
        type: string
        mandatory: false
      - name: security_group_id
        description: The security group id of all nodes in the K8S cluster.
        kind: variable
        type: string
        mandatory: false
   deployer: |
      data "huaweicloud_availability_zones" "osc-az" {}

      variable "admin_passwd" {
      type = string
      description = "The root password for all nodes in the K8S cluster."
      }

      variable "flavor_worker_nodes_count" {
      type = number
      description = "The number of worker nodes in the K8S cluster."
      }

      variable "flavor_flavor_id" {
      type = string
      description = "The flavor id of all nodes in the K8S cluster."
      }

      variable "network_id" {
      type = string
      default= "6a7c406d-5bc6-4b50-8f75-948aea69cb24"
      description = "The network id of all nodes in the K8S cluster."
      }

      variable "security_group_id" {
      type = string
      default= "668833c8-459d-4d15-871d-34c3cbcda9d4"
      description = "The security group id of all nodes in the K8S cluster."
      }

      data "huaweicloud_images_image" "k8s-image" {
      name        = "K8S-v1.26.2_Centos-7.9"
      most_recent = true
      }

      resource "huaweicloud_compute_instance" "k8s-master" {
      name = "k8s-master"
      availability_zone = data.huaweicloud_availability_zones.osc-az.names[0]
      flavor_id = var.flavor_flavor_id
      network {
          uuid = var.network_id
      }
      security_group_ids = [ var.security_group_id ]
      image_id = data.huaweicloud_images_image.k8s-image.id
      user_data=<<EOF
      #!bin/bash
      echo root:${var.admin_passwd} | sudo chpasswd
      sh /root/k8s-init.sh true ${var.admin_passwd} ${var.flavor_worker_nodes_count} > /root/init.log
      EOF
      }

      resource "huaweicloud_compute_instance" "k8s-node" {
      count = var.flavor_worker_nodes_count
      name = "k8s-node-${count.index}"
      availability_zone = data.huaweicloud_availability_zones.osc-az.names[0]
      flavor_id = var.flavor_flavor_id
      network {
          uuid = var.network_id
      }

      security_group_ids = [ "668833c8-459d-4d15-871d-34c3cbcda9d4" ]
      image_id = data.huaweicloud_images_image.k8s-image.id
      user_data=<<EOF
      #!bin/bash
      echo root:${var.admin_passwd} | sudo chpasswd
      sh /root/k8s-init.sh false ${var.admin_passwd} ${var.flavor_worker_nodes_count} ${huaweicloud_compute_instance.k8s-master.access_ip_v4} > /root/init.log
      EOF
      depends_on = [
          huaweicloud_compute_instance.k8s-master
      ]
      }

      output "k8s_master_endpoint" {
      value = "${huaweicloud_compute_instance.k8s-master.access_ip_v4}:22"
      }

      output "k8s_master_host" {
      value = "${huaweicloud_compute_instance.k8s-master.access_ip_v4}"
      }
```

## OCL loading

Xpanse provides different options to generate and provision OCL:

* REST API on the xpanse runtime
* CLI allowing to directly interact with xpanse via command line
* language frontend (SDL) for Java, Python, ...

## Orchestrator & binding

OCL descriptor is an abstract description of the final managed service state. It's generic enough to
work with any cloud service provider.

Xpanse runtime embeds an orchestrator responsible to delegate the services management to plugins.

Each plugin is dedicated to handle a cloud provider infrastructure and do actions required to
actually deal with the services' lifecycle:

1. to bind OCL to the concrete cloud provider internal APIs
2. to generate the graph of actions required to reach the final expected state, specifically for a
   target cloud provider

## Runtime

Xpanse runtime is the overall component running on the cloud provider.

The runtime embeds and run together:

1. the orchestrator with the different bindings
2. the OCL loader and parser
3. the frontends (REST API, ...)

## Database

The default database attached to the runtime is the H2 in-memory database. The same can be replaced
with other production ready database systems by replacing the configurations mentioned below and by
adding relevant maven dependencies.

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.show-sql=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto= update
```

### Build and Package

First, you can build the whole xpanse project, including all modules (orchestrator, OCL, runtime,
plugins, etc), simply with:

```shell
$ mvn clean install
```

### Run

By default, the application will not activate any plugins. They must be activated via spring
profiles. Also ensure that only one plugin is active at a time.

* for Huawei Cloud:

```shell
$ cd runtime/target
$ java -jar xpanse-runtime-1.0.0-SNAPSHOT.jar -Dspring.profiles.active=huaweicloud
```

* for Openstack:

```shell
$ cd runtime/target
$ java -jar xpanse-runtime-1.0.0-SNAPSHOT.jar -Dspring.profiles.active=openstack
```

By default, the runtime is built in "exploded mode". Additionally, you can also build a Docker image
adding `-Ddocker.skip=false` as build argument:

```shell
$ cd runtime
$ mvn clean install -Ddocker.skip=false
```

We can start xpanse runtime with a specific plugin by passing the plugin name in the profile name.
For example to start huaweicloud

```shell
$ docker run -e "SPRING_PROFILES_ACTIVE=huaweicloud" --name my-xpanse-runtime xpanse
```

### Static Code Analysis using CheckStyle

This project using `CheckStyle` framework to perform static code analysis. The configuration can be
found in [CheckStyle](checkstyle.xml). The framework also checks the code format in accordance
to `Google Java Format`.

The same file can also be imported in IDE CheckStyle plugins to get the analysis results directly in
IDE and also to perform code formatting directly in IDE.

The framework is added as a maven plugin and is executed by default as part of the `verify` phase.
Any violations will result in build failure.

### License/Copyright Configuration

All files in the repository must contain a license header in the format mentioned
in [License Header](license.header).

The static code analysis framework will also validate if the license exists in the specified format.
