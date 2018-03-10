package com.basketballstats.basketballStatistics.models;

import lombok.*;

import javax.persistence.*;
import java.io.File;

@Entity
@Table(name = "bs_teams")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Team {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TM_ID")
	private long id;

	@Column(name = "TM_NAME")
	private String firstName;

	@Column(name = "TM_LOGO")
	private File file;

	@Column(name = "TM_CITY")
	private String city;

	@OneToOne
	@JoinColumn(name = "TM_CAPTAIN", referencedColumnName = "PLR_ID", nullable = true)
	private Player captain;


}
