package br.com.unopar.fisiopar.domains.pessoa;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.util.UUID;

@Embeddable
public final class EntityId {

    @Id
    private UUID id;

    public EntityId() {
        this(UUID.randomUUID());
    }

    public EntityId(UUID id) {
        this.id = id;
    }

}
