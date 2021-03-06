package org.sparcs.hengho.nb_proj.entity

import javax.persistence.*

@Entity
@Table(name = "calendar")
class CalendarEntity(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "date_id")
    var dateId: Long? = null,

    @Column(name = "sum")
    var sum: Long? = null
)