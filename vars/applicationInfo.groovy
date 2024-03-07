def companyInfo() {
    script {
        company_name = "Amazon"
        url = "www.amazon.com"
        ip_address = "192.168.29.193"
        
        echo "Comany name is: $company_name"
        echo "URL is: $url"
        echo "IP_ADDRESS is : $ip_address"
    }
}
