package cloud.microservice.spring.microservices.authserver;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class Scratch {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            String password = "bar";
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            String hashedPassword = passwordEncoder.encode(password);

            System.out.println(hashedPassword);
            i++;
        }
    }
}
