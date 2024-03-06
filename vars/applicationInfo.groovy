def call() {
  script {
  company_name: Amazon
  url: www.amazon.com
  ip_address: 192.168.29.193
    echo $company_name
    echo $url
    echo $ip_address
  }
}
