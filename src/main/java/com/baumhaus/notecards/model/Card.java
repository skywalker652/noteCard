package com.baumhaus.notecards.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id")
    private long userId;

    @Column(name = "first_name")
    private String firstName;

    @Column
    private String title;

    @Column
    private String description;

    @Column(name = "photo_link")
    private String photoLink;

    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private CardType type;



    


}
