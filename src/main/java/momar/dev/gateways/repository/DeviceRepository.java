package momar.dev.gateways.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import momar.dev.gateways.domain.Device;

import java.util.Optional;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long> {
    Page<Device> findByGatewayId(Long gatewayId, Pageable pageable);

    @Query(value="SELECT d.id, created, status,uid,vendor,gateway_id FROM DEVICE d , GATEWAY g where g.id=gateway_id",nativeQuery = true)
    Page<Device> findAllGateways(Pageable pageable);

    @Query(value=" SELECT count(*) FROM DEVICE d , GATEWAY g where g.id=gateway_id and gateway_id=:gateway_id",nativeQuery = true)
    int getNumberOfDevice(@Param("gateway_id") Long gateway_id);

    Optional<Device> findByIdAndGatewayId(Long id, Long gatewayId);
}
