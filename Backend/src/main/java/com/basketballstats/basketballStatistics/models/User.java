package com.basketballstats.basketballStatistics.models;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "bs_users")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USR_ID")
	private long id;

	@Column(name = "USR_LOGIN")
	private String login;

	@Column(name = "USR_PASSWORD")
	private String password;

	@Column(name = "USR_EMAIL")
	private String email;

	@Column(name = "USR_FIRST_NAME")
	private String firstName;

	@Column(name = "USR_LAST_NAME")
	private String lastName;

	@Column(name = "USR_CITY")
	private String city;

	@Column(name = "USR_COUNTRY")
	private String country;

	@Column(name = "USR_ACTIVE")
	private byte active;

}
