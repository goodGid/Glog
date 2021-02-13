package dev.be.goodgid.glog.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "view_counter")
@EntityListeners(AuditingEntityListener.class) // for @CreatedDate
public class ViewCounter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "view_cnt_seq")
    private Long id;

    @CreatedDate
    @Column(name = "acs_time")
    private LocalDateTime accessTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "url_seq")
    private Url url;
}
