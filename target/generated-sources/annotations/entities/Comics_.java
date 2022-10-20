package entities;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-10-20T15:35:21")
@StaticMetamodel(Comics.class)
public class Comics_ { 

    public static volatile SingularAttribute<Comics, String> editorial;
    public static volatile SingularAttribute<Comics, String> editorialPublicacion;
    public static volatile SingularAttribute<Comics, BigInteger> numeroDeLibro;
    public static volatile SingularAttribute<Comics, Integer> id;
    public static volatile SingularAttribute<Comics, String> escritorIlustrador;
    public static volatile SingularAttribute<Comics, String> nombre;

}