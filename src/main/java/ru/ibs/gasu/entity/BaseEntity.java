package ru.ibs.gasu.entity;

import lombok.Data;
import org.hibernate.envers.Audited;
//import org.springframework.data.annotation.CreatedBy;
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.LastModifiedBy;
//import org.springframework.data.annotation.LastModifiedDate;
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
//@EntityListeners(AuditingEntityListener.class)
@Audited
@Data
public abstract class BaseEntity implements Serializable {

    @Id
    @SequenceGenerator(name = "idSeq", sequenceName = "ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSeq")
    protected Long id;
    @Version
    @Column
    protected Long version;
//    @Column(name = "CREATE_DATE")
//    @CreatedDate
//    protected Date createDate;
//    @Column(name = "UPDATE_DATE")
//    @LastModifiedDate
//    protected Date updateDate;
//    @Column(name = "CREATE_USER_ID")
//    @CreatedBy
//    protected Long createUserId;
//    @Column(name = "UPDATE_USER_ID")
//    @LastModifiedBy
//    protected Long updateUserId;
//    @Column
//    protected Boolean obsolete = false;

}
