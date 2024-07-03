package lk.ijse.ticketway.vehicleservice.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : L.H.J
 * @File: WebAppConfig
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-07-02, Wednesday
 **/
@Configuration
public class WebAppConfig {

    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}
