package belajar.spring.boot.service;

import belajar.spring.boot.config.PropertiesConfiguration;
import belajar.spring.boot.config.SecretApiConfiguration;
import belajar.spring.boot.service.GreetingService;
import org.springframework.stereotype.Service;

import java.util.TimeZone;

@Service
public class GreetingServiceImpl implements GreetingService {

/*
    @Value("${saySomething.text}")//kita bisa custom property binding pada properties lalu di embed ke dalam annotation @Value
    private String saySomething;

    // secara otomatis nilai return akan berisi value yang ada di file properties


    @Value("${timezone}")
    private String timezone;

    @Value("${currency}")
    private String currency;


 */

    //kita bisa membuat class configuration untuk properties lalu melakukan dependency injection, sehingga kita hanya perlu memanggil variable class properties yang kita buat saja diikuti dengan method getter

    private PropertiesConfiguration propertiesConfiguration;


    /** Enviroment Config
     * pada dasarnya kita tidak direcomendasikan menyimpan data sensitif pada file application.properties
     * disarankan menggunakan enviroment variable
     * kita bisa mengarahkan file properties untuk mengambil value dari enviroment variable
     * dengan cara memberi tanda ${<env key>}, ex api.api-key = ${CLOUD_API}
     * berikut contoh pada class SecretApiConfiguration
     */
    private SecretApiConfiguration api;//inject dependency class SecretApiConfig from constructor

    public GreetingServiceImpl(PropertiesConfiguration propertiesConfiguration, SecretApiConfiguration api) {
        this.propertiesConfiguration = propertiesConfiguration;
        this.api = api;
    }

    @Override
    public String sayGreat() {
        System.out.println(api.getSecretApi());
        TimeZone timeZone = TimeZone.getTimeZone(propertiesConfiguration.getTimezone());
        return propertiesConfiguration.getSaySomething()+" , your timzone "+timeZone.getDisplayName()+" , your currency "+propertiesConfiguration.getCurrency();

    }
}
