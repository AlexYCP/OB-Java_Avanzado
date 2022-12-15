package modulo.ejercicios.cinco.arquitectura_limpia;

public class ArquitecturaLimpia {

    public static void main(String[] args) {

        // Ejercicio
        /*
        Arquitectura limpia.

        Principios:
        Cohesión:
        The Reuse/Release Equivalence Principle: que nos dice que los componentes deben poder ser desplegados de forma
        independiente sin afectar a los demás. Las clases, o código que van en ese componente, deben tener una relación,
        y por tanto deben poderse desplegar de manera conjunta.

        The common closure principle: se podría decir que hablamos del principio de responsabilidad única (SRP) aplicado
        a componentes. La idea es agrupar clases que puedan cambiar por la misma razón en un solo componente. Si tenemos
        que hacer un cambio, y hay que tocar varios componentes, esto supondrá tener que desplegarlos todos, en lugar de
        solo uno.

        The common reuse principle: este principio nos habla de evitar a aquellos que utilizan un componente depender de
        cosas que no necesitan. Si un componente depende de otro, hay que intentar que sea porque necesita todas las
        clases que lo componen. Lo contrario nos obligará a trabajar más cuando nos toque hacer el despliegue. De esta
        manera será más fácil reutilizar componentes.

        Acoplamiento:
        The Acyclic Dependencies Principle: si trazamos líneas entre los componentes para representar las dependencias
        entre ellos, tenemos que intentar que no existan ciclos. Es decir, que el cambio en un componente, no acabe
        desencadenando en la necesidad de hacer cambios en cadena en los demás componentes, que obliguen a volver
        a modificar el componente inicial. Cuando eso sucede, es difícil conseguir una versión estable del sistema,
        ya que hay que hacer multitud de cambios en los distintos componentes hasta que vuelve a funcionar en su
        totalidad.

        The stable dependencies Principle: todos los sistemas tienden a cambiar y evolucionar, pero no todos los componentes
        cambian con la misma frecuencia, ni es igual de fácil modificarlos. Este principio nos dice que un componente que
        cambia a menudo no debería depender de otro que es difícil modificar, ya que entonces será también difícil de modificar.

        The stable Abstractions Principle: este principio nos dice que si un componente de nuestro sistema va a cambiar
        poco, ya que es difícil modificarlo, debe estar compuesto mayoritariamente por interfaces y clases abstractas.
        De esta manera el componente será fácilmente extensible, y no afectará tanto al resto de la arquitectura.

        Características:
        Independiente de los frameworks: los frameworks deberían ser herramientas, y no obligarnos a actuar de una
        determinada manera debido a sus restricciones.

        Testable: debemos poder probar nuestras reglas de negocio sin pensar en base de datos, interface gráfica
        u otros componentes no esenciales de nuestro sistema.

        Independiente de la UI: si la UI cambia a menudo esto no puede afectar al resto de nuestro sistema,
        que tiene que ser independiente.

        Independiente de la base de datos: deberíamos poder cambiar de Oracle, a SQL Server, a MongoDB, a Casandra o
        a cualquier otra base de datos sin que afectara demasiado a nuestro sistema.

        Independiente de cualquier entidad externa: no deberíamos saber nada de entidades externas,
        por lo que no deberemos depender de ellas.

        ¿En qué casos se utiliza?:
        Se utiliza ampliamente en el buen desarrollo de software.

        ¿Cómo lo haría?:
        En primera instancia para que pueda crear y desarrollar software robusto y poderoso tendría que, seguir los
        principios antes mencionados y apoyándome de sus características.

         */

    }

}
