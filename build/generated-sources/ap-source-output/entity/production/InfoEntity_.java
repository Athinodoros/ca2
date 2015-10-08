package entity.production;

import entity.Address;
import entity.InfoEntity;
import entity.Phone;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-10-06T14:47:21")
@StaticMetamodel(InfoEntity.class)
public abstract class InfoEntity_ { 

    public static volatile SingularAttribute<InfoEntity, Address> address;
    public static volatile ListAttribute<InfoEntity, Phone> phones;
    public static volatile SingularAttribute<InfoEntity, Long> id;
    public static volatile SingularAttribute<InfoEntity, String> email;

}