package com.basketballstats.basketballStatistics.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "bs_players")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PLR_ID")
	private long id;

	@Column(name = "PLR_FIRST_NAME")
	private String firstName;

	@Column(name = "PLR_LAST_NAME")
	private String lastName;

	@Column(name = "PLR_NICKNAME")
	private String nickname;

	@Column(name = "PLR_NUMBER")
	private int number;

	@Column(name = "PLR_POSITION")
	private String position;

}
