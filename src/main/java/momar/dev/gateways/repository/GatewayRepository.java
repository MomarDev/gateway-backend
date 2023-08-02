package momar.dev.gateways.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import momar.dev.gateways.domain.Gateway;

@Repository
public interface GatewayRepository extends JpaRepository<Gateway, Long> {
}
