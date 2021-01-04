package br.com.alura.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.panache.mock.PanacheMock;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

@QuarkusTest
class UsuarioTest {

    @Test
    public void testFindByIdOptionalBringCorrectUser() {
        PanacheMock.mock(Usuario.class);

        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNome("Test1");

        Optional<PanacheEntityBase> usuarioOptional = Optional.of(usuario);

        Mockito.when(Usuario.findByIdOptional(usuario.getId())).thenReturn(usuarioOptional);

        Assertions.assertSame(usuario, Usuario.findByIdOptional(usuario.getId()).get());
    }
}